theory RESET_BOHLENDER_Orig
  imports "Hybrid-Verification.Hybrid_Verification"
begin

dataspace Program3 =
  constants
    \<epsilon> :: real
  assumes
    eps_is_1: "ε = 1"
  variables
    fs :: bool
    b  :: int
    a  :: int

context Program3
begin

definition "ctrl ≡
  (IF fs THEN
      (b := 2; fs := False)
  )
; a := 1234 div b
"

end

end