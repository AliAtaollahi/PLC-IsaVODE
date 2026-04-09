PROGRAM WTT
    VAR_INPUT 
        x1, x2, f1, f2 : REAL;
    END_VAR
    VAR_OUTPUT 
        V1, V2, P : BOOL;
    END_VAR

    IF (x1 >= H1) THEN
        V1 := 0;            (* Close inlet valve V1 if tank1 at high level *)
    ELSE
        IF (x1 <= L1) THEN 
            V1 := 1;        (* Open V1 if tank1 at low level *)
        END_IF;
    END_IF;
    IF (x2 <= L2) THEN 
        P := 1; V2 := 1;    (* If tank2 low, start pump P and open outlet valve V2 *)
    END_IF;
    IF (x1 <= LL OR f2 <= FL OR x2 >= H2) THEN 
        P := 0; V2 := 0;    (* Emergency stop pump P and close V2 on underflow/overflow *)
    END_IF;
END_PROGRAM