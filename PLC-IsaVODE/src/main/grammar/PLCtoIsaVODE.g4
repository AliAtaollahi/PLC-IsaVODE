grammar PLCtoIsaVODE;

@header{
    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.Stmt.*;
    import main.ast.nodes.expr.*;
    import main.ast.nodes.expr.value.*;
}

program returns [Program programRet]
    : t = 'PROGRAM' { $programRet = new Program(); $programRet.setLine($t.line); }
    name=ID { $programRet.setName($name.text); }
    (v = var_block { $programRet.addVarBlock($v.varBlockRet); })*
    p = program_block_body { $programRet.setProgramBlockBody($p.programBlockBodyRet); }
    'END_PROGRAM'
    ;

configuration
    : 'CONFIGURATION' name=ID
      ( single_resource_declaration
      | resource_declaration (resource_declaration)* )
      'END_CONFIGURATION'
    ;

resource_declaration
    : 'RESOURCE' name=ID 'ON' resource_type_name=ID
      single_resource_declaration
      'END_RESOURCE'
    ;

single_resource_declaration
    : task_configuration ';'
    | program_configuration ';'
    ;

task_configuration
    : 'TASK' name=ID task_initialization
    ;

task_initialization
    : '('
        ( 'SINGLE' ':=' Decimal_literal ',' )?
        'INTERVAL' ':=' interval_time ','
        'PRIORITY' ':=' Decimal_literal
      ')'
    ;

interval_time
    : 'T' '#' Decimal_literal time_unit
    ;

time_unit
    : 's'
    | 'ms'
    | 'us'
    ;

program_configuration
    : 'PROGRAM' inst_name=ID
      'WITH' task_name=ID ':' prog_name=ID
    ;

var_block returns [VarBlock varBlockRet]
    : t = ( 'VAR' | 'VAR_INPUT' | 'VAR_OUTPUT' )
      {
          $varBlockRet = new VarBlock();
          $varBlockRet.setLine($t.line);
          $varBlockRet.setVarType($t.text);
      }
      ( v = variable_declaration { $varBlockRet.addVariableDeclaration($v.variableDeclarationRet); })*
      ';' 'END_VAR'
    ;

type_rule returns [TypeRule typeRuleRet]
    : name=ID { $typeRuleRet = new TypeRule(); $typeRuleRet.setName($name.text); $typeRuleRet.setLine($name.line); }
    ;

variable_declaration returns [VariableDeclaration variableDeclarationRet]
    : { $variableDeclarationRet = new VariableDeclaration(); }
      i1=ID { $variableDeclarationRet.addName($i1.text); } ( ',' i2=ID { $variableDeclarationRet.addName($i2.text); } )*
      ':' t=type_rule { $variableDeclarationRet.setTypeRule($t.typeRuleRet); }
    ;

program_block_body returns [ProgramBlockBody programBlockBodyRet]
    : s = statement_list
    { $programBlockBodyRet = new ProgramBlockBody(); $programBlockBodyRet.setStatementList($s.statementListRet); $programBlockBodyRet.setLine($s.statementListRet.getLine()); }
    ;

statement_list returns [StatementList statementListRet]
    : { $statementListRet = new StatementList(); }
    s1 = statement { $statementListRet.addStatement($s1.statementRet); $statementListRet.setLine($s1.statementRet.getLine()); }
    ( ';' s2 = statement { $statementListRet.addStatement($s2.statementRet); } )* ';'
    ;

statement returns [Stmt statementRet]
    : a = assignment_statement { $statementRet = $a.assignmentStatementRet; }
    | i = if_then_else_statement { $statementRet = $i.ifThenElseStatementRet; }
    ;

assignment_statement returns [AssignmentStatement assignmentStatementRet]
    : { $assignmentStatementRet = new AssignmentStatement(); }
    v = variable { $assignmentStatementRet.setVariable($v.variableRet); $assignmentStatementRet.setLine($v.variableRet.getLine()); }
    ':=' e = expression { $assignmentStatementRet.setExpr($e.expressionRet); }
    ;

if_then_else_statement returns [IfThenElseStatement ifThenElseStatementRet]
    : { $ifThenElseStatementRet = new IfThenElseStatement(); } i = 'IF' { $ifThenElseStatementRet.setLine($i.line); }
      e1 = expression 'THEN' s1 = statement_list { $ifThenElseStatementRet.addIfThenElse($e1.expressionRet, $s1.statementListRet); }
      ( 'ELSIF' e2 = expression 'THEN' s2 = statement_list { $ifThenElseStatementRet.addIfThenElse($e2.expressionRet, $s2.statementListRet); } )*
      ( 'ELSE' s3 = statement_list { $ifThenElseStatementRet.setElseStatementList($s3.statementListRet); } )?
      'END_IF'
    ;

variable returns [Variable variableRet]
    : { $variableRet = new Variable(); } name=ID { $variableRet.setName($name.text); $variableRet.setLine($name.line); }
    ;

/* =====================
 * Expression (single-rule style, MiniC-like)
 * ===================== */

//expression returns [Expr expressionRet]
//    : primary_expression                                                    # ExprPrimary
//    | unary_operator primary_expression                                     # ExprUnary
//    | expression '**' expression                                            # ExprPower
//    | expression multiply_operator expression                               # ExprMultiplicative
//    | expression add_operator expression                                    # ExprAdditive
//    | expression comparison_operator expression                             # ExprRelational
//    | expression equ_operator expression                                    # ExprEquality
//    | expression ( '&' | 'AND' ) expression                                 # ExprAnd
//    | expression 'XOR' expression                                           # ExprXor
//    | expression 'OR' expression                                            # ExprOr
//    ;

/* =====================
 * Expression (MiniC-like, with AST actions)
 * ===================== */

expression returns [Expr expressionRet]
    : v = variable
      { $expressionRet = $v.variableRet; }

    | b = boolean_literal { $expressionRet = $b.boolValueRet; }
    | n = numeric_literal { $expressionRet = $n.numValueRet; }
    | '(' e = expression ')'
      { $expressionRet = $e.expressionRet; }

    | op = ('NOT' | '-') e = expression
      {
          UnaryExpr u = new UnaryExpr();
          u.setOperator($op.text);
          u.setOperand($e.expressionRet);
          u.setLine($op.line);
          $expressionRet = u;
      }

    | <assoc=right> e1 = expression op = '**' e2 = expression                  // Power
      {
          // Replace BinaryExpr with your binary Expr node
          BinaryExpr b = new BinaryExpr();
          b.setLeft($e1.expressionRet);
          b.setRight($e2.expressionRet);
          b.setOperator($op.text);
          b.setLine($op.line);
          $expressionRet = b;
      }

    | e1 = expression op = ('*' | '/') e2 = expression                         // Multiplicative
      {
          BinaryExpr b = new BinaryExpr();
          b.setLeft($e1.expressionRet);
          b.setRight($e2.expressionRet);
          b.setOperator($op.text);
          b.setLine($op.line);
          $expressionRet = b;
      }

    | e1 = expression op = ('+' | '-') e2 = expression                         // Additive
      {
          BinaryExpr b = new BinaryExpr();
          b.setLeft($e1.expressionRet);
          b.setRight($e2.expressionRet);
          b.setOperator($op.text);
          b.setLine($op.line);
          $expressionRet = b;
      }

    | e1 = expression op = ('<' | '>' | '<=' | '>=') e2 = expression            // Relational
      {
          BinaryExpr b = new BinaryExpr();
          b.setLeft($e1.expressionRet);
          b.setRight($e2.expressionRet);
          b.setOperator($op.text);
          b.setLine($op.line);
          $expressionRet = b;
      }

    | e1 = expression op = ('=' | '<>') e2 = expression                         // Equality
      {
          BinaryExpr b = new BinaryExpr();
          b.setLeft($e1.expressionRet);
          b.setRight($e2.expressionRet);
          b.setOperator($op.text);
          b.setLine($op.line);
          $expressionRet = b;
      }

    | e1 = expression op = ('&' | 'AND') e2 = expression                        // AND
      {
          BinaryExpr b = new BinaryExpr();
          b.setLeft($e1.expressionRet);
          b.setRight($e2.expressionRet);
          b.setOperator($op.text);
          b.setLine($op.line);
          $expressionRet = b;
      }

    | e1 = expression op = 'XOR' e2 = expression                                // XOR
      {
          BinaryExpr b = new BinaryExpr();
          b.setLeft($e1.expressionRet);
          b.setRight($e2.expressionRet);
          b.setOperator($op.text);
          b.setLine($op.line);
          $expressionRet = b;
      }

    | e1 = expression op = 'OR' e2 = expression                                 // OR
      {
          BinaryExpr b = new BinaryExpr();
          b.setLeft($e1.expressionRet);
          b.setRight($e2.expressionRet);
          b.setOperator($op.text);
          b.setLine($op.line);
          $expressionRet = b;
      }
    ;

equ_operator
    : '=' | '<>'
    ;

comparison_operator
    : '<' | '>' | '<=' | '>='
    ;

add_operator
    : '+' | '-'
    ;

multiply_operator
    : '*' | '/'
    ;

unary_operator
    : '-'
    | 'NOT'
    ;

primary_expression
    : literal
    | variable
    | '(' expression ')'
    ;

literal
    : numeric_literal
    | boolean_literal
    ;

boolean_literal returns [BoolValue boolValueRet]
    : b = ( 'TRUE' | 'FALSE' )
    { $boolValueRet = new BoolValue(); $boolValueRet.setValue($b.text); $boolValueRet.setLine($b.line); }

    ;

numeric_literal returns [NumValue numValueRet]
    : { $numValueRet = new NumValue(); } ('-' { $numValueRet.setMinus(true); } )? i = integer_literal { $numValueRet.setValue($i.text); }
    | { $numValueRet = new NumValue(); } ('-' { $numValueRet.setMinus(true); } )? f = Floating_point_literal { $numValueRet.setValue($f.text); }
    ;

integer_literal
    : Binary_literal
    | Octal_literal
    | Decimal_literal
    | Pure_decimal_digits
    | Hexadecimal_literal
    ;

Binary_literal
    : '2#' Binary_digit Binary_literal_characters?
    ;
fragment Binary_digit
    : [01]
    ;
fragment Binary_literal_character
    : Binary_digit | '_'
    ;
fragment Binary_literal_characters
    : Binary_literal_character+
    ;

Octal_literal
    : '8#' Octal_digit Octal_literal_characters?
    ;
fragment Octal_digit
    : [0-7]
    ;
fragment Octal_literal_character
    : Octal_digit | '_'
    ;
fragment Octal_literal_characters
    : Octal_literal_character+
    ;

Decimal_literal
    : [0-9] [0-9_]*
    ;
Pure_decimal_digits
    : [0-9]+
    ;
fragment Decimal_digit
    : [0-9]
    ;
fragment Decimal_literal_character
    : Decimal_digit | '_'
    ;
fragment Decimal_literal_characters
    : Decimal_literal_character+
    ;

Hexadecimal_literal
    : '16#' Hexadecimal_digit Hexadecimal_literal_characters?
    ;
fragment Hexadecimal_digit
    : [0-9a-fA-F]
    ;
fragment Hexadecimal_literal_character
    : Hexadecimal_digit | '_'
    ;
fragment Hexadecimal_literal_characters
    : Hexadecimal_literal_character+
    ;

Floating_point_literal
    : Decimal_literal Decimal_fraction? Decimal_exponent?
    ;

fragment Decimal_fraction
    : '.' Decimal_literal
    ;
fragment Decimal_exponent
    : Floating_point_e Sign? Decimal_literal
    ;
fragment Floating_point_e
    : [eE]
    ;
fragment Sign
    : [+\-]
    ;

ID
    : [A-Za-z][A-Za-z_0-9]*
    ;

WS
    : [ \n\r\t]+ -> channel(HIDDEN)
    ;

Block_comment
    : '(*' ( Block_comment | . )*? '*)' -> channel(HIDDEN)
    ;

ANY
    : .
    ;
