theory WTT_Safe
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
    x1 :: real  x2 :: real
    f1 :: real  f2 :: real
    t  :: real
    V1 :: bool  V2 :: bool  P :: bool

context WTT
begin

abbreviation "ctrl_safe ≡
  (IF f1 > (HH - x1) / ε THEN V1 := False
   ELSE (IF x1 ≤ L1 THEN V1 := True ELSE skip))
; (IF x2 ≤ L2 THEN (P := True; V2 := True) ELSE skip)
; (IF ((if V1 ∧ ¬(V2 ∧ P) then f1 else if ¬V1 ∧ (V2 ∧ P) then - f2
        else (if V1 then f1 else 0) - (if V2 ∧ P then f2 else 0))) < (LL - x1) / ε
      ∨ f2 ≤ FL
      ∨ (if V2 ∧ P then f2 else 0) > (HH - x2) / ε
   THEN (P := False; V2 := False) ELSE skip)
"

abbreviation "plant ≡ {
  x1` = (if V1 then f1 else 0) - (if V2 ∧ P then f2 else 0),
  x2` = (if V2 ∧ P then f2 else 0),
  t`  = 1
| 0 ≤ x1 ∧ 0 ≤ x2 ∧ 0 ≤ f1 ∧ 0 ≤ f2 ∧ t ≤ ε }"

abbreviation "step_safe ≡ ctrl_safe; (t := 0); plant"

(* property *)
(* abbreviation "inv_wtt ≡ (LL ≤ $x1 ∧ $x1 ≤ HH ∧ LL ≤ $x2 ∧ $x2 ≤ HH)" *)
(* abbreviation "program_safe ≡ LOOP step_safe INV inv_wtt" *)

end
end
