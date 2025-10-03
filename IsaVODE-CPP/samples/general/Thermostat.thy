theory thermostatexample
  imports "Hybrid-Verification.Hybrid_Verification"
begin


(*<SCTF:MODEL>*)
dataspace arduino_thermostat = 

  (*<SCTF:CONSTANTS>*)
  constants 
    (* program *)
    Tmax :: real (* maximum comfortable temp. *)
    Tmin :: real (* minimum comfortable temp. *)
    (* physical *)
    L :: real    (* highest temp. when thermostat is on *)
    K :: real    (* freezing factor *)
  (*</SCTF:CONSTANTS>*)

  (*<SCTF:ASSUMES>*)
  assumes
    (* program *)
    Tmin_val: "Tmin = 19.0"
    and Tmax_val: "Tmax = 24.0"
    (* physical *)
    and L_val: "L = 30.0"
    and K_ge0: "K > 0"
  (*</SCTF:ASSUMES>*)

  (*<SCTF:VARIABLES>*)
  variables
    (* physical *)
    T :: real      (* temperature *)
    t :: real      (* time *)
    (* program *)
    temp :: real   (* for temperature measurements *)
    active :: bool (* whether thermostat is on or off *)
  (*</SCTF:VARIABLES>*)

context arduino_thermostat
begin

  (*<SCTF:INPUTSCAN>*)
  abbreviation "temperaturePinRead ≡ temp := T"
  (*</SCTF:INPUTSCAN>*)

  (*<SCTF:CONTROLLOGIC>*)
  abbreviation "ctrl ≡ 
    temperaturePinRead;
    IF ¬ active ∧ temp ≤ Tmin THEN 
      activatePin
    ELSE IF active ∧ temp ≥ Tmax THEN 
      deactivatePin"
  (*</SCTF:CONTROLLOGIC>*)

  (*<SCTF:ACTUATION>*)
  abbreviation "activatePin ≡ active := True"
  abbreviation "deactivatePin ≡ active := False"
  (*</SCTF:ACTUATION>*)

  (*<SCTF:DYN>*)
  abbreviation "dyn ≡ t := 0;
    IF ¬ active 
    THEN {T` = - K * T, t` = 1 | t ≤ 1}
    ELSE {T` = - K * (T - L), t` = 1 | t ≤ 1}"
  (*</SCTF:DYN>*)

  (*<SCTF:LOOP>*)
  abbreviation "loopMethod I ≡ LOOP (ctrl; dyn) INV I"
  (*</SCTF:LOOP>*)

  (*<SCTF:LEMMA>*)
  lemma local_flow:
    "local_flow_on [T ↝ - K * (T - c), t ↝ 1] (T +⇩L t) UNIV UNIV
      (λτ. [T ↝ - exp (-K * τ) * (c - T) + c, t ↝ τ + t])"
    by local_flow_on_auto

  lemma 
    "H{Tmin ≤ T ∧ T ≤ Tmax} 
      loopMethod (Tmin ≤ $T ∧ $T ≤ Tmax)
     {Tmin ≤ T ∧ T ≤ Tmax}"
    oops
  (*</SCTF:LEMMA>*)

end
(*</SCTF:MODEL>*)