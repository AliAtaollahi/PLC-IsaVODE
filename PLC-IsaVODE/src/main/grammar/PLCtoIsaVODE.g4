grammar PLCtoIsaVODE;

source_unit
    : (program | function_block | function | configuration | type_block)*
    ;

function
    : 'FUNCTION' ID ':' type var_block* block 'END_FUNCTION'
    ;

function_block
    : 'FUNCTION_BLOCK' ID var_block* block 'END_FUNCTION_BLOCK';

program
    : 'PROGRAM' ID var_block* block 'END_PROGRAM';

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

var_block
    : ( 'VAR' |
        'VAR_INPUT' |
        'VAR_OUTPUT' |
        'VAR_IN_OUT' |
        'VAR_GLOBAL' |
        'VAR_EXTERNAL'
      ) ('RETAIN')?
      ( variable_declaration )* 'END_VAR'
    ;

type
    :
    struct |
    array |
    string |
    'REAL' |
    'BOOL' |
    'INT' |
    'WORD' |
    'DWORD' |
    'UDINT' |
    'TIME' |
    'DINT' |
    'BYTE' |
    ID
    ;

struct
    : 'STRUCT' ( variable_declaration )* 'END_STRUCT'
    ;

array
    : 'ARRAY' '[' literal ']' 'OF' type
    ;

string
    :
    'STRING' ('(' literal ')')?
    ;

variable_declaration
    : ID ( ',' ID )* ':' type (':=' expression)? ';'
    ;

block
    : statement*
    ;

statement
    : assignment_statement
    | if_then_else_statement
    | for_statement
    | while_statement
    | return_statement
    | expression_statement
    | case_statement
    | repeat_statement
    ;

repeat_statement
    :
    'REPEAT' block 'UNTIL' expression 'END_REPEAT' ';'
    ;

case_statement
    :
    'CASE' expression 'OF' (expression ':' block)*
    ( 'ELSE' block )? 'END_CASE' ';'
    ;

expression_statement
    : expression? ';'
    ;

for_statement
    : 'FOR' expression ':=' expression 'TO' expression 'DO' block 'END_FOR' ';';

while_statement
    : 'WHILE' expression 'DO' block 'END_WHILE' ';';

assignment_statement
    : expression ':=' expression ';'
    ;

return_statement
    : 'RETURN' expression? ';';

if_then_else_statement
    : 'IF' expression
      ('THEN' | 'then' ) block
      ( 'ELSIF' expression 'THEN' block )*
      ( 'ELSE'  block )?
      'END_IF' ';'
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

expression
    : literal
    | ID
    | '(' expression ')'
    | ('NOT' | 'not' | '-') expression
    | <assoc=right> expression '**' expression
    | expression ('*' | '/') expression
    | expression ('+' | '-') expression
    | expression ('<' | '>' | '<=' | '>=') expression
    | expression ('=' | '<>') expression
    | expression ('&' | 'AND') expression
    | expression 'XOR' expression
    | expression 'OR' expression
    | expression 'MOD' expression
    | ID '(' argument_expression_list? ')' // function call
    | expression ',' expression
    | expression '.' expression
    | expression '[' expression ']'
    | '[' expression ( ',' expression )* ']'
    ;

argument_expression_list
  : expression (':=' expression)? (',' expression (':=' expression)? )* ;

literal
    : Numeric_literal
    | Boolean_literal
    | Hashed_literal
    | String_literal
    | Interval_time
    | Interval
    ;

Interval
    :
    Integer_literal '..' Integer_literal
    ;

Boolean_literal
    : ( 'TRUE' | 'FALSE' )
    ;

Numeric_literal
    : Integer_literal
    | Floating_point_literal
    ;

Integer_literal
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

fragment HexadecimalDigit
    : [0-9a-fA-F] ;

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

String_literal
    : '\'' CChar* '\'' ;

fragment CChar
    : ~['\\\r\n] | EscapeSequence ;

fragment EscapeSequence
    : SimpleEscapeSequence | OctalEscapeSequence | HexadecimalEscapeSequence | UniversalCharacterName ;

fragment UniversalCharacterName
    : '\\u' HexQuad | '\\U' HexQuad HexQuad ;

fragment HexQuad
    : HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit ;

fragment SimpleEscapeSequence
    : '\\' ['"?abfnrtv\\] ;

fragment OctalEscapeSequence
    : '\\' OctalDigit OctalDigit? OctalDigit? ;

fragment OctalDigit
    : [0-7] ;

fragment HexadecimalEscapeSequence
    : '\\x' HexadecimalDigit+ ;

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
    : Nondigit (Nondigit | Digit)*
    ;

fragment Nondigit
    : [a-zA-Z_]
    ;

fragment Digit
    : [0-9] ;

WS
    : [ \n\r\t]+ -> channel(HIDDEN)
    ;

Block_comment
    : '(*' ( Block_comment | . )*? '*)' -> channel(HIDDEN)
    ;

ANY
    : .
    ;
