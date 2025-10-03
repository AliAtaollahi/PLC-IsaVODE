theory WTT_Orig
  imports "Hybrid-Verification.Hybrid_Verification"
begin

dataspace WTT =
  constants
    H1 :: real  H2 :: real
    L1 :: real  L2 :: real
    LL :: real  HH :: real
    FL :: real  ε  :: real
  assumes
    eps_ge0: "ε ≥ 0"
  variables
    x1 :: real  x2 :: real      (* tank levels *)
    f1 :: real  f2 :: real      (* inflow/outflow measurements *)
    t  :: real                  (* scan-cycle clock *)
    V1 :: bool  V2 :: bool  P :: bool   (* actuators *)

context WTT
begin

(* --------- Discrete control: PLC-equivalent --------- *)
abbreviation "ctrl_orig ≡
  (IF x1 ≥ H1 THEN V1 := False
   ELSE (IF x1 ≤ L1 THEN V1 := True ELSE skip))
; (IF x2 ≤ L2 THEN (P := True; V2 := True) ELSE skip)
; (IF (x1 ≤ LL ∨ f2 ≤ FL ∨ x2 ≥ H2) THEN (P := False; V2 := False) ELSE skip)
"

(* --------- Plant dynamics + time budget t ≤ ε --------- *)
abbreviation "plant ≡ {
  x1` = (if V1 ∧ ¬(V2 ∧ P) then f1 else if ¬V1 ∧ (V2 ∧ P) then - f2
         else (if V1 then f1 else 0) - (if V2 ∧ P then f2 else 0)),
  x2` = (if V2 ∧ P then f2 else 0),
  t`  = 1
| 0 ≤ x1 ∧ 0 ≤ x2 ∧ 0 ≤ f1 ∧ 0 ≤ f2 ∧ t ≤ ε }"

(* one scan *)
abbreviation "step_orig ≡ ctrl_orig; (t := 0); plant"

(* property *)
(* abbreviation "S ≡ (LL ≤ $x1 ∧ $x1 ≤ HH ∧ LL ≤ $x2 ∧ $x2 ≤ HH)" *)
(* abbreviation "program_orig ≡ LOOP step_orig INV S" *)

end  (* context WTT *)
end  (* theory *)
