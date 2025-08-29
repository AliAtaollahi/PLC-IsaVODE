context arduino_humidity_controller
begin

  (* Define actuation BEFORE using it in ctrl *)
  (*<SCTF:ACTUATION>*)
  abbreviation "activatePin   ≡ active := True"
  abbreviation "deactivatePin ≡ active := False"
  (*</SCTF:ACTUATION>*)

  (*<SCTF:INPUTSCAN>*)
  abbreviation "humidityPinRead ≡
     IF H ≤ H_thr THEN humid := False ELSE humid := True"
  (*</SCTF:INPUTSCAN>*)

  (*<SCTF:CONTROLLOGIC>*)
  abbreviation "ctrl ≡
     humidityPinRead;
     IF (¬ active ∧ ¬ humid)
     THEN activatePin
     ELSE IF (active ∧ humid)
     THEN deactivatePin"
  (*</SCTF:CONTROLLOGIC>*)

  (*<SCTF:DYN>*)
  abbreviation "dyn ≡
     t := 0;
     IF (¬ active)
     THEN {H` = -K * H,        t` = 1 | t ≤ 1}
     ELSE {H` = -K * (H - L),  t` = 1 | t ≤ 1}"
  (*</SCTF:DYN>*)

  (*<SCTF:LOOP>*)
  abbreviation "loopMethod I ≡ LOOP (ctrl; dyn) INV I"
  (*</SCTF:LOOP>*)

end