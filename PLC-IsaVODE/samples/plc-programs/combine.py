from __future__ import annotations

import re
from pathlib import Path
from typing import Optional, Tuple


def leading_number(filename: str) -> Optional[int]:
    """
    Extract leading integer from a filename like '12-ISC_CTRL.ST' or '250-building.IEC'.
    Returns None if the file doesn't start with digits.
    """
    m = re.match(r"^(\d+)", filename)
    return int(m.group(1)) if m else None


def combine_files_sorted_by_number(
    input_dir: str | Path,
    output_dir: str | Path,
    max_kb: int = 100,
) -> None:
    input_dir = Path(input_dir)
    output_dir = Path(output_dir)
    output_dir.mkdir(parents=True, exist_ok=True)

    max_bytes = max_kb * 1024

    # Collect files that start with a number
    files: list[Tuple[int, Path]] = []
    for p in input_dir.iterdir():
        if not p.is_file():
            continue
        n = leading_number(p.name)
        if n is None:
            continue
        files.append((n, p))

    # Sort by that number, then by filename to make ties stable
    files.sort(key=lambda t: (t[0], t[1].name.lower()))

    if not files:
        print(f"No numbered files found in: {input_dir}")
        return

    out_index = 0
    out_fh = None
    out_size = 0

    current_min_num = None
    current_max_num = None

    def open_new_output(start_num_for_log: int) -> None:
        nonlocal out_index, out_fh, out_size, current_min_num, current_max_num
        if out_fh:
            out_fh.close()

        out_index += 1
        out_path = output_dir / f"combined{out_index}.txt"
        out_fh = open(out_path, "wb")
        out_size = 0
        current_min_num = start_num_for_log
        current_max_num = start_num_for_log

    def close_current_output() -> None:
        nonlocal out_fh, current_min_num, current_max_num
        if out_fh:
            out_fh.close()
            print(f"combined{out_index}.txt: {current_min_num} ... {current_max_num}")
            out_fh = None

    # Start first output
    open_new_output(files[0][0])

    for num, path in files:
        # Header between files (included in size limit)
        header = (
            b"\n\n"
            + f"===== {path.name} =====\n".encode("utf-8")
        )
        header_len = len(header)

        # If header itself can't fit, force a new file (very unlikely)
        if header_len > max_bytes:
            # Still write it alone (will exceed). You can shorten the header if needed.
            close_current_output()
            open_new_output(num)

        # If header doesn't fit in current combined file, start a new combined file
        if out_size + header_len > max_bytes and out_size > 0:
            close_current_output()
            open_new_output(num)

        # Write header
        out_fh.write(header)
        out_size += header_len

        # Now write the file content, splitting across combined files if needed
        with open(path, "rb") as src:
            while True:
                space_left = max_bytes - out_size
                if space_left <= 0:
                    # No space left, start a new combined file continuing this same source
                    close_current_output()
                    open_new_output(num)
                    # Write a continuation header
                    cont = f"\n\n===== {path.name} (cont.) =====\n".encode("utf-8")
                    if len(cont) > max_bytes:
                        # Fallback: no continuation header
                        cont = b"\n"
                    if len(cont) > max_bytes:
                        cont = b""
                    out_fh.write(cont)
                    out_size = len(cont)

                chunk = src.read(min(64 * 1024, max_bytes - out_size))
                if not chunk:
                    break
                out_fh.write(chunk)
                out_size += len(chunk)

        # Update range for the current output file
        current_min_num = min(current_min_num, num) if current_min_num is not None else num
        current_max_num = max(current_max_num, num) if current_max_num is not None else num

    close_current_output()


if __name__ == "__main__":
    # Change these paths to yours:
    INPUT_DIR = r"D:\10\New\Prague\Parsing\IsaVODEtoCPP\IsaVODEtoCPP\PLC-IsaVODE\samples\PLC_Programs-2"
    OUTPUT_DIR = r"D:\10\New\Prague\Parsing\IsaVODEtoCPP\IsaVODEtoCPP\PLC-IsaVODE\samples\PLC_Programs-2\combined_out"

    combine_files_sorted_by_number(INPUT_DIR, OUTPUT_DIR, max_kb=55)
