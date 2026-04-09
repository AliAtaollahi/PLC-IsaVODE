theory RESET_BOHLENDER_Unsafe
  imports "Hybrid-Verification.Hybrid_Verification"
begin

dataspace RESET_BOHLENDER =
  constants
    \<epsilon> :: real
  assumes
    eps_is_1: "ε = 1"
  variables
    RESTART :: bool
    fs      :: bool
    a       :: int
    b       :: int

context RESET_BOHLENDER
begin

definition "cold_init ≡
  fs ::= True;
  a ::= 0;
  b ::= 0
"

definition "restart_init ≡
  a ::= 0
"

definition "ctrl ≡
  (IF fs THEN
      (fs ::= False;
       b ::= 2)
  );
  a ::= 1234 div b
"

definition "scan ≡
  RESTART ::= ?;
  (IF RESTART THEN
      restart_init
  );
  ctrl
"

definition "system ≡
  cold_init;
  LOOP scan INV True
"

end

end