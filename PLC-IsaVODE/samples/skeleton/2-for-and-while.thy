theory SimpleLoops_Orig
  imports "Hybrid-Verification.Hybrid_Verification"
begin

dataspace SimpleLoops =
  constants
    \<epsilon> :: real
  assumes
    eps_is_1: "ε = 1"
  variables
    i        :: int
    Sum1     :: int
    Sum2     :: int
    Sum3     :: int
    FirstBig :: int
    SkipSum  :: int
    Count1   :: int
    Count2   :: int
    Count3   :: int
    x        :: int

context SimpleLoops
begin

definition "ctrl ≡
  Sum1 := 0;
  i := 1;
  (WHILE i ≤ 5 DO
    (Sum1 := Sum1 + i;
     i := i + 1));

  Sum2 := 0;
  i := 1;
  (WHILE i ≤ 9 DO
    (Sum2 := Sum2 + i;
     i := i + 2));

  Sum3 := 0;
  i := 5;
  (WHILE i ≥ 1 DO
    (Sum3 := Sum3 + i;
     i := i - 1));

  FirstBig := 0;
  i := 1;
  (WHILE i ≤ 10 DO
    (IF i > 4 THEN
        (FirstBig := i;
         i := 11)
     ELSE
        i := i + 1));

  SkipSum := 0;
  i := 1;
  (WHILE i ≤ 5 DO
    (IF i = 3 THEN
        i := i + 1
     ELSE
        (SkipSum := SkipSum + i;
         i := i + 1)));

  x := 1;
  Count1 := 0;
  (WHILE x ≤ 5 DO
    (Count1 := Count1 + x;
     x := x + 1));

  x := 1;
  Count2 := 0;
  (WHILE x ≤ 10 DO
    (IF x > 4 THEN
        x := 11
     ELSE
        (Count2 := Count2 + x;
         x := x + 1)));

  x := 1;
  Count3 := 0;
  (WHILE x ≤ 5 DO
    (IF x = 3 THEN
        x := x + 1
     ELSE
        (Count3 := Count3 + x;
         x := x + 1)))
"

end

end