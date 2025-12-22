PROGRAM prog_safe
  VAR_INPUT
    x1, x2, f1, f2 : REAL;
  END_VAR
  VAR_OUTPUT
    V1, V2, P : BOOL;
  END_VAR
  VAR
    ε : REAL;  (* scan/compute interval; set to your PLC task period *)
  END_VAR

  (* Close inlet valve V1 preemptively if inflow would overflow within one cycle *)
  IF (f1 > (HH - x1) / ε) THEN
    V1 := FALSE;
  ELSE
    IF (x1 <= L1) THEN
      V1 := TRUE;
    END_IF;
  END_IF;

  (* Start pump and open V2 when tank 2 is low *)
  IF (x2 <= L2) THEN
    P  := TRUE;
    V2 := TRUE;
  END_IF;

  (* Mixed shutdown guard: predicted LL/HH breach or low-flow *)
  IF ( ( (V1 * f1) - ( (V2 AND P) * f2 ) ) < (LL - x1) / ε
       OR (f2 <= FL)
       OR ( (V2 AND P) * f2 ) > (HH - x2) / ε ) THEN
    P  := FALSE;
    V2 := FALSE;
  END_IF;
END_PROGRAM

(* PLC configuration (typical 1s period—match ε accordingly) *)
CONFIGURATION ConfigSafe
  RESOURCE Res0 ON PLC
    TASK Main (INTERVAL := T#1s, PRIORITY := 0);
    PROGRAM Inst0 WITH Main : prog_safe;
  END_RESOURCE
END_CONFIGURATION
