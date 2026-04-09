PROGRAM SimpleLoops
VAR
    i : INT;

    Sum1 : INT := 0;
    Sum2 : INT := 0;
    Sum3 : INT := 0;

    FirstBig : INT := 0;
    SkipSum : INT := 0;

    Count1 : INT := 0;
    Count2 : INT := 0;
    Count3 : INT := 0;

    x : INT := 0;
END_VAR


(* 1) Simple FOR *)
Sum1 := 0;
FOR i := 1 TO 5 DO
    Sum1 := Sum1 + i;
END_FOR;


(* 2) FOR with BY *)
Sum2 := 0;
FOR i := 1 TO 9 BY 2 DO
    Sum2 := Sum2 + i;
END_FOR;


(* 3) Reverse FOR *)
Sum3 := 0;
FOR i := 5 TO 1 BY -1 DO
    Sum3 := Sum3 + i;
END_FOR;


(* 4) FOR with EXIT *)
FirstBig := 0;
FOR i := 1 TO 10 DO
    IF i > 4 THEN
        FirstBig := i;
        EXIT;
    END_IF;
END_FOR;


(* 5) FOR with CONTINUE *)
SkipSum := 0;
FOR i := 1 TO 5 DO
    IF i = 3 THEN
        CONTINUE;
    END_IF;
    SkipSum := SkipSum + i;
END_FOR;


(* 6) Simple WHILE *)
x := 1;
Count1 := 0;
WHILE x <= 5 DO
    Count1 := Count1 + x;
    x := x + 1;
END_WHILE;


(* 7) WHILE with EXIT *)
x := 1;
Count2 := 0;
WHILE x <= 10 DO
    IF x > 4 THEN
        EXIT;
    END_IF;
    Count2 := Count2 + x;
    x := x + 1;
END_WHILE;


(* 8) WHILE with CONTINUE *)
x := 1;
Count3 := 0;
WHILE x <= 5 DO
    IF x = 3 THEN
        x := x + 1;
        CONTINUE;
    END_IF;
    Count3 := Count3 + x;
    x := x + 1;
END_WHILE;

END_PROGRAM