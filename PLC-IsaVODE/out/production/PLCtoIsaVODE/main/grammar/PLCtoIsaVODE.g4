grammar PLCtoIsaVODE;

@header{
    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.Stmt.*;
    import main.ast.nodes.expr.*;
    import main.ast.nodes.expr.value.*;
}

source_unit returns [SourceUnit sourceUnitRet]
    : { $sourceUnitRet = new SourceUnit(); }
    (
        p = program { $sourceUnitRet.setProgram($p.programRet); }
        | fb = function_block
        | f = function
        | c = configuration
        | t = type_block
    )*
    ;

function
    : 'FUNCTION' ID ':' type var_block* statement_list 'END_FUNCTION'
    ;

function_block
    : 'FUNCTION_BLOCK' ID var_block* statement_list 'END_FUNCTION_BLOCK'
    ;

program returns [Program programRet]
    : t='PROGRAM'
      {
          $programRet = new Program();
          $programRet.setLine($t.line);
      }
      name=ID
      {
          $programRet.setName($name.text);
      }
      (v=var_block
        {
            $programRet.addVarBlock($v.varBlockRet);
        }
      )*
      p=program_block_body
      {
          $programRet.setProgramBlockBody($p.programBlockBodyRet);
      }
      'END_PROGRAM'
    ;

configuration
    : 'CONFIGURATION' name=ID
      ( var_block | single_resource_declaration | resource_declaration (resource_declaration)* )*
      'END_CONFIGURATION'
    ;

type_block
    : 'TYPE' variable_declaration+ 'END_TYPE'
    ;

resource_declaration
    : 'RESOURCE' name=ID 'ON' resource_type_name=ID
      single_resource_declaration+
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
        ( 'SINGLE' ':=' Numeric_literal ',' )?
        'INTERVAL' ':=' Interval_time ','
        'PRIORITY' ':=' Numeric_literal
      ')'
    ;

program_configuration
    : 'PROGRAM' inst_name=ID
      'WITH' task_name=ID ':' prog_name=ID
    ;

var_block returns [VarBlock varBlockRet]
    : t=( 'VAR'
        | 'VAR_INPUT'
        | 'VAR_OUTPUT'
        | 'VAR_IN_OUT'
        | 'VAR_GLOBAL'
        | 'VAR_EXTERNAL'
        )
      {
          $varBlockRet = new VarBlock();
          $varBlockRet.setLine($t.line);
          $varBlockRet.setVarType($t.text);
      }
      ('RETAIN')?
      (v=variable_declaration
        {
            $varBlockRet.addVariableDeclaration($v.variableDeclarationRet);
        }
      )*
      'END_VAR'
    ;

type returns [TypeRule typeRuleRet]
    : s=struct
      {
          $typeRuleRet = new TypeRule();
          $typeRuleRet.setName("STRUCT");
          $typeRuleRet.setLine($s.start.getLine());
      }
    | a=array
      {
          $typeRuleRet = new TypeRule();
          $typeRuleRet.setName("ARRAY");
          $typeRuleRet.setLine($a.start.getLine());
      }
    | st=string
      {
          $typeRuleRet = new TypeRule();
          $typeRuleRet.setName("STRING");
          $typeRuleRet.setLine($st.start.getLine());
      }
    | t='REAL'
      {
          $typeRuleRet = new TypeRule();
          $typeRuleRet.setName($t.text);
          $typeRuleRet.setLine($t.line);
      }
    | t='BOOL'
      {
          $typeRuleRet = new TypeRule();
          $typeRuleRet.setName($t.text);
          $typeRuleRet.setLine($t.line);
      }
    | t='INT'
      {
          $typeRuleRet = new TypeRule();
          $typeRuleRet.setName($t.text);
          $typeRuleRet.setLine($t.line);
      }
    | t='WORD'
      {
          $typeRuleRet = new TypeRule();
          $typeRuleRet.setName($t.text);
          $typeRuleRet.setLine($t.line);
      }
    | t='DWORD'
      {
          $typeRuleRet = new TypeRule();
          $typeRuleRet.setName($t.text);
          $typeRuleRet.setLine($t.line);
      }
    | t='UDINT'
      {
          $typeRuleRet = new TypeRule();
          $typeRuleRet.setName($t.text);
          $typeRuleRet.setLine($t.line);
      }
    | t='TIME'
      {
          $typeRuleRet = new TypeRule();
          $typeRuleRet.setName($t.text);
          $typeRuleRet.setLine($t.line);
      }
    | t='DINT'
      {
          $typeRuleRet = new TypeRule();
          $typeRuleRet.setName($t.text);
          $typeRuleRet.setLine($t.line);
      }
    | t='BYTE'
      {
          $typeRuleRet = new TypeRule();
          $typeRuleRet.setName($t.text);
          $typeRuleRet.setLine($t.line);
      }
    | name=ID
      {
          $typeRuleRet = new TypeRule();
          $typeRuleRet.setName($name.text);
          $typeRuleRet.setLine($name.line);
      }
    ;

struct
    : 'STRUCT' ( variable_declaration )* 'END_STRUCT'
    ;

array
    : 'ARRAY' '[' literal ']' 'OF' type
    ;

string
    : 'STRING' ('(' literal ')')?
    ;

variable_declaration returns [VariableDeclaration variableDeclarationRet]
    : {
          $variableDeclarationRet = new VariableDeclaration();
      }
      i1=ID
      {
          $variableDeclarationRet.addName($i1.text);
      }
      (
        ',' i2=ID
        {
            $variableDeclarationRet.addName($i2.text);
        }
      )*
      ':'
      t=type
      {
          $variableDeclarationRet.setTypeRule($t.typeRuleRet);
      }
      (':=' expression)?
      ';'
    ;

program_block_body returns [ProgramBlockBody programBlockBodyRet]
    : s=statement_list
      {
          $programBlockBodyRet = new ProgramBlockBody();
          $programBlockBodyRet.setStatementList($s.statementListRet);
          $programBlockBodyRet.setLine($s.statementListRet.getLine());
      }
    ;

statement_list returns [StatementList statementListRet]
    : {
          $statementListRet = new StatementList();
      }
      (
        s=statement
        {
            if($s.statementRet != null) {
                if($statementListRet.getLine() == 0)
                    $statementListRet.setLine($s.statementRet.getLine());
                $statementListRet.addStatement($s.statementRet);
            }
        }
      )*
    ;

statement returns [Stmt statementRet]
    : a=assignment_statement { $statementRet = $a.assignmentStatementRet; }
    | i=if_then_else_statement { $statementRet = $i.ifThenElseStatementRet; }
    | f=for_statement { $statementRet = $f.forStatementRet; }
    | w=while_statement { $statementRet = $w.whileStatementRet; }
    | r=return_statement { $statementRet = $r.returnStatementRet; }
    | exit_statement { $statementRet = new ExitStatement(); }
    | continue_statement { $statementRet = new ContinueStatement(); }
    | expression_statement
    | case_statement
    | repeat_statement
    ;

repeat_statement
    : 'REPEAT' statement_list 'UNTIL' expression 'END_REPEAT' ';'
    ;

case_statement
    : 'CASE' expression 'OF' (expression ':' statement_list)*
      ( 'ELSE' statement_list )? 'END_CASE' ';'
    ;

expression_statement
    : expression? ';'
    ;

for_statement returns [ForStatement forStatementRet]
    : { $forStatementRet = new ForStatement(); }
      'FOR' e1=expression { $forStatementRet.setVar($e1.expressionRet); }
      ':=' e2=expression { $forStatementRet.setStart($e2.expressionRet); }
      'TO' e3=expression { $forStatementRet.setEnd($e3.expressionRet); }
      ( 'BY' e4=expression { $forStatementRet.setStep($e4.expressionRet); } )?
      'DO' s=statement_list { $forStatementRet.setStatementList($s.statementListRet); }
      'END_FOR' ';'
    ;

exit_statement
    : 'EXIT' ';'
    ;

continue_statement
    : 'CONTINUE' ';'
    ;

while_statement returns [WhileStatement whileStatementRet]
    : 'WHILE' e=expression 'DO' s=statement_list 'END_WHILE' ';'
    { $whileStatementRet = new WhileStatement($e.expressionRet, $s.statementListRet); }
    ;

assignment_statement returns [AssignmentStatement assignmentStatementRet]
    : {
          $assignmentStatementRet = new AssignmentStatement();
      }
      v=variable
      {
          $assignmentStatementRet.setVariable($v.variableRet);
          $assignmentStatementRet.setLine($v.variableRet.getLine());
      }
      ':='
      e=expression
      {
          $assignmentStatementRet.setExpr($e.expressionRet);
      }
      ';'
    ;

return_statement returns [ReturnStatement returnStatementRet]
    : { $returnStatementRet = new ReturnStatement(); } 'RETURN'
    (e=expression { $returnStatementRet.setExpr($e.expressionRet); })? ';'
    ;

if_then_else_statement returns [IfThenElseStatement ifThenElseStatementRet]
    : {
          $ifThenElseStatementRet = new IfThenElseStatement();
      }
      i='IF'
      {
          $ifThenElseStatementRet.setLine($i.line);
      }
      e1=expression ('THEN' | 'then')
      s1=statement_list
      {
          $ifThenElseStatementRet.addIfThenElse($e1.expressionRet, $s1.statementListRet);
      }
      (
        'ELSIF' e2=expression 'THEN' s2=statement_list
        {
            $ifThenElseStatementRet.addIfThenElse($e2.expressionRet, $s2.statementListRet);
        }
      )*
      (
        'ELSE' s3=statement_list
        {
            $ifThenElseStatementRet.setElseStatementList($s3.statementListRet);
        }
      )?
      'END_IF' ';'
    ;

variable returns [Variable variableRet]
    : {
          $variableRet = new Variable();
      }
      name=ID
      {
          $variableRet.setName($name.text);
          $variableRet.setLine($name.line);
      }
    ;

/* =====================
 * Expression (MiniC-like, with AST actions where they existed before)
 * ===================== */

expression returns [Expr expressionRet]
    : v=variable { $expressionRet = $v.variableRet; }
    | b=boolean_literal { $expressionRet = $b.boolValueRet; }
    | n=numeric_literal
      {
          $expressionRet = $n.numValueRet;
      }

    | Hashed_literal
    | String_literal
    | Interval_time
    | Interval

    | '(' e=expression ')'
      {
          $expressionRet = $e.expressionRet;
      }

    | op=('NOT' | 'not' | '-') e=expression
      {
          UnaryExpr u = new UnaryExpr();
          u.setOperator($op.text);
          u.setOperand($e.expressionRet);
          u.setLine($op.line);
          $expressionRet = u;
      }

    | <assoc=right> e1=expression op='**' e2=expression
      {
          BinaryExpr b = new BinaryExpr();
          b.setLeft($e1.expressionRet);
          b.setRight($e2.expressionRet);
          b.setOperator($op.text);
          b.setLine($op.line);
          $expressionRet = b;
      }

    | e1=expression op=('*' | '/') e2=expression
      {
          BinaryExpr b = new BinaryExpr();
          b.setLeft($e1.expressionRet);
          b.setRight($e2.expressionRet);
          b.setOperator($op.text);
          b.setLine($op.line);
          $expressionRet = b;
      }

    | e1=expression op=('+' | '-') e2=expression
      {
          BinaryExpr b = new BinaryExpr();
          b.setLeft($e1.expressionRet);
          b.setRight($e2.expressionRet);
          b.setOperator($op.text);
          b.setLine($op.line);
          $expressionRet = b;
      }

    | e1=expression op=('<' | '>' | '<=' | '>=') e2=expression
      {
          BinaryExpr b = new BinaryExpr();
          b.setLeft($e1.expressionRet);
          b.setRight($e2.expressionRet);
          b.setOperator($op.text);
          b.setLine($op.line);
          $expressionRet = b;
      }

    | e1=expression op=('=' | '<>') e2=expression
      {
          BinaryExpr b = new BinaryExpr();
          b.setLeft($e1.expressionRet);
          b.setRight($e2.expressionRet);
          b.setOperator($op.text);
          b.setLine($op.line);
          $expressionRet = b;
      }

    | e1=expression op=('&' | 'AND') e2=expression
      {
          BinaryExpr b = new BinaryExpr();
          b.setLeft($e1.expressionRet);
          b.setRight($e2.expressionRet);
          b.setOperator($op.text);
          b.setLine($op.line);
          $expressionRet = b;
      }

    | e1=expression op='XOR' e2=expression
      {
          BinaryExpr b = new BinaryExpr();
          b.setLeft($e1.expressionRet);
          b.setRight($e2.expressionRet);
          b.setOperator($op.text);
          b.setLine($op.line);
          $expressionRet = b;
      }

    | e1=expression op='OR' e2=expression
      {
          BinaryExpr b = new BinaryExpr();
          b.setLeft($e1.expressionRet);
          b.setRight($e2.expressionRet);
          b.setOperator($op.text);
          b.setLine($op.line);
          $expressionRet = b;
      }

    | e1=expression 'MOD' e2=expression
    | ID '(' argument_expression_list? ')'
    | expression ',' expression
    | expression '.' expression
    | expression '[' expression ']'
    | '[' expression ( ',' expression )* ']'
    ;

argument_expression_list
    : expression (':=' expression)? (',' expression (':=' expression)? )*
    ;

boolean_literal returns [BoolValue boolValueRet]
    : b=(Boolean_literal | 'TRUE' | 'FALSE')
      {
          $boolValueRet = new BoolValue();
          $boolValueRet.setValue($b.text);
          $boolValueRet.setLine($b.line);
      }
    ;

numeric_literal returns [NumValue numValueRet]
    : {
          $numValueRet = new NumValue();
      }
      n=(Numeric_literal
       | Floating_point_literal
       | Integer_literal
       | Binary_literal
       | Octal_literal
       | Decimal_literal
       | Pure_decimal_digits
       | Hexadecimal_literal)
      {
          $numValueRet.setValue($n.text);
      }
    ;

literal
    : Numeric_literal
    | Boolean_literal
    | Hashed_literal
    | String_literal
    | Interval_time
    | Interval
    ;

Interval
    : Integer_literal '..' Integer_literal
    ;

Integer_literal
    : Binary_literal
    | Octal_literal
    | Decimal_literal
    | Pure_decimal_digits
    | Hexadecimal_literal
    ;

integer_literal
    : Binary_literal
    | Octal_literal
    | Decimal_literal
    | Pure_decimal_digits
    | Hexadecimal_literal
    ;

Interval_time
    : ('T' | 't') '#' Decimal_literal ('s' | 'ms' | 'us' | 'h' | 'd' | 'm')
    ;

Hashed_literal
    : ID '#' ('-')? Numeric_literal
    | ID '#' String_literal
    ;

Numeric_literal
    : Integer_literal
    | Floating_point_literal
    ;

Boolean_literal
    : ( 'TRUE' | 'FALSE' )
    ;

fragment HexadecimalDigit
    : [0-9a-fA-F]
    ;

Binary_literal
    : '2#' Binary_digit Binary_literal_character*
    ;

fragment Binary_digit
    : [01]
    ;

fragment Binary_literal_character
    : Binary_digit | '_'
    ;

Octal_literal
    : '8#' Octal_digit Octal_literal_character*
    ;

fragment Octal_digit
    : [0-7]
    ;

fragment Octal_literal_character
    : Octal_digit | '_'
    ;

Decimal_literal
    : Decimal_digit Decimal_literal_character*
    ;

Pure_decimal_digits
    : Decimal_digit+
    ;

fragment Decimal_digit
    : [0-9]
    ;

fragment Decimal_literal_character
    : Decimal_digit | '_'
    ;

Hexadecimal_literal
    : '16#' Hexadecimal_digit Hexadecimal_literal_character*
    ;

fragment Hexadecimal_digit
    : HexadecimalDigit
    ;

fragment Hexadecimal_literal_character
    : Hexadecimal_digit | '_'
    ;

String_literal
    : '\'' CChar* '\''
    ;

fragment CChar
    : ~['\\\r\n]
    | EscapeSequence
    ;

fragment EscapeSequence
    : SimpleEscapeSequence
    | OctalEscapeSequence
    | HexadecimalEscapeSequence
    | UniversalCharacterName
    ;

fragment UniversalCharacterName
    : '\\u' HexQuad
    | '\\U' HexQuad HexQuad
    ;

fragment HexQuad
    : HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit
    ;

fragment SimpleEscapeSequence
    : '\\' ['"?abfnrtv\\]
    ;

fragment OctalEscapeSequence
    : '\\' OctalDigit OctalDigit? OctalDigit?
    ;

fragment OctalDigit
    : [0-7]
    ;

fragment HexadecimalEscapeSequence
    : '\\x' HexadecimalDigit+
    ;

Floating_point_literal
    : Decimal_literal Decimal_fraction Decimal_exponent?
    | Decimal_literal Decimal_exponent
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
    : Nondigit (Nondigit | Digit)*
    ;

fragment Nondigit
    : [a-zA-Z_]
    ;

fragment Digit
    : [0-9]
    ;

WS
    : [ \n\r\t]+ -> skip
    ;

Block_comment
    : '(*' .*? '*)' -> skip
    ;

Line_comment
    : '//' ~[\r\n]* -> skip
    ;