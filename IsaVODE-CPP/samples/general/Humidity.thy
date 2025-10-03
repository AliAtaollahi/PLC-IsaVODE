theory humidityexample
  imports "Hybrid-Verification.Hybrid_Verification"
begin

(*<SCTF:MODEL>*)
dataspace arduino_humidity_controller =

  (*<SCTF:CONSTANTS>*)
  constants
    (* physical *)
    H_thr :: real   (* humidity threshold for sensor trigger (%) *)
    L     :: real   (* asymptotic humidity when humidifier is ON *)
    K     :: real   (* drying/damping rate constant *)
  (*</SCTF:CONSTANTS>*)

  (*<SCTF:ASSUMES>*)
  assumes
    Hthr_val: "H_thr = 50.0"
  and L_val:   "L = 70.0"
  and K_pos:   "K > 0"
  (*</SCTF:ASSUMES>*)

  (*<SCTF:VARIABLES>*)
  variables
    (* physical *)
    H :: real      (* environmental humidity (%) *)
    t :: real      (* time *)
    (* program *)
    humid  :: bool (* True = high humidity, False = low *)
    active :: bool (* humidifier ON/OFF *)
  (*</SCTF:VARIABLES>*)




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
(*</SCTF:MODEL>*)

end
