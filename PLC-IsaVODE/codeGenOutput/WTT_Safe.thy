theory WTT_Safe
  imports "Hybrid-Verification.Hybrid_Verification"
begin

dataspace prog0 =
  constants
    H1 :: real
    L1 :: real
    L2 :: real
    H2 :: real
    LL :: real
    FL :: real
    \<epsilon> :: real
  assumes
    eps_is_1: "ε = 1"
  variables
    x1 :: real
    x2 :: real
    f1 :: real
    f2 :: real
    V1 :: bool
    V2 :: bool
    P  :: bool

context prog0
begin

definition "ctrl ≡
  (IF x1 ≥ H1 THEN
      V1 := False
   ELSE
      (IF x1 ≤ L1 THEN V1 := True))
; (IF x2 ≤ L2 THEN
      (P := True; V2 := True)
  )
; (IF (x1 ≤ LL ∨ f2 ≤ FL ∨ x2 ≥ H2) THEN
      (P := False; V2 := False)
  )

"

end

end
