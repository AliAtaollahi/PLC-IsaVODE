PROGRAM RESET_BOHLENDER
	VAR RETAIN
	    fs : bool := true;
		b : int := 0;
	END_VAR
	VAR
	    a : int := 0;
	END_VAR

    IF fs THEN
    	b := 2;
    	fs := false;
    END_IF;
    a := 1234 / b;
END_PROGRAM