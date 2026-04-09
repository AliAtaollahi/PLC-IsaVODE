theory CALIBRATE_Orig
  imports "Hybrid-Verification.Hybrid_Verification"
begin

dataspace CALIBRATE =
  constants
    \<epsilon> :: real
  assumes
    eps_is_1: "ε = 1"
  variables
    X        :: real
    CO       :: bool
    CS       :: bool
    Y_OFFSET :: real
    Y_SCALE  :: real
    Y        :: real
    OFFSET   :: real
    SCALE    :: real

context CALIBRATE
begin

definition "ctrl ≡
  (IF CO THEN
      OFFSET := Y_OFFSET - X
   ELSE
      (IF CS THEN
          SCALE := Y_SCALE / (X + OFFSET)
      )
  )
; Y := (X + OFFSET) * SCALE
"

end

end