grammar IsaVODEtoCPP;

/* =====================
 * Parser rules
 * ===================== */

program
  : (dataspaceDecl)* EOF
  ;

dataspaceDecl
  : DATASPACE ident ASSIGN dataspaceBody
  ;

dataspaceBody
  : (constantsClause)? (assumesClause)? (variablesClause)?
  ;

// ---- constants ----
constantsClause
  : CONSTANTS constantDecl+
  ;

constantDecl
  : ident D_COLON typeSpec
  ;

// ---- assumes ----
// supports: assumes lbl: "A" "B" and other: "C"
assumesClause
  : ASSUMES assumptionDecl (AND assumptionDecl)*
  ;

assumptionDecl
  : ident COLON QUOTED_TEXT+       // allow multiple quoted texts, e.g. "0 < e" "e \<le> 1"
  ;

// ---- variables ----
variablesClause
  : VARIABLES varDecl+
  ;

varDecl
  : ident D_COLON typeSpec
  ;

// ---- types ----
typeSpec
  : QUOTED_TEXT
  | typeAtom+                      // unquoted type expression
  ;

typeAtom
  : ident
  | NUMBER
  | ARROW | LPAREN | RPAREN | LBRACK | RBRACK
  | COMMA | CARET | STAR | PLUS | MINUS | DOT
  ;

// Identifier: normal names, \<phi>-style symbols, and subscript chains f\<^sub>m\<^sub>a\<^sub>x,
// incl. numeric subscripts like K\<^sub>1, K\<^sub>2
ident
  : idseg (SUBSCRIPT idsegOrNum)*   // base ( ^sub seg )*
  ;

idseg
  : ASCII_ID
  | SYMBOL_IDENT
  ;

idsegOrNum
  : idseg
  | NUMBER
  ;

/* =====================
 * Lexer rules
 * ===================== */

/* Skip Isabelle’s \<comment> \<open>...\<close> and raw \<open>...\<close> blocks */
ISABELLE_COMMENT_BLOCK
  : '\\' '<' 'comment' '>' SPACES* '\\' '<' 'open' '>'
    ( . | '\r' | '\n' )*? '\\' '<' 'close' '>'
    -> skip
  ;

ISABELLE_OPEN_BLOCK
  : '\\' '<' 'open' '>'
    ( . | '\r' | '\n' )*? '\\' '<' 'close' '>'
    -> skip
  ;

/* Keywords / punctuation */
DATASPACE  : 'dataspace' ;
CONSTANTS  : 'constants' ;
ASSUMES    : 'assumes' ;
VARIABLES  : 'variables' ;
AND        : 'and' ;
ASSIGN     : '=' ;
D_COLON    : '::' ;
COLON      : ':' ;

ARROW      : '=>' ;
LPAREN     : '(' ;
RPAREN     : ')' ;
LBRACK     : '[' ;
RBRACK     : ']' ;
COMMA      : ',' ;
CARET      : '^' ;
STAR       : '*' ;
PLUS       : '+' ;
MINUS      : '-' ;
DOT        : '.' ;

/* Identifiers */
fragment LETTER      : [\p{L}] ;
fragment DIGIT       : [0-9] ;
fragment APOSTROPHE  : '\'' ;

ASCII_ID
  : (LETTER | '_' | APOSTROPHE) (LETTER | DIGIT | '_' | APOSTROPHE)*
  ;

/* Isabelle symbol: \<phi>, \<epsilon>, \<le>, etc. */
SYMBOL_IDENT
  : '\\' '<' SYMBOL_NAME '>'
  ;

fragment SYMBOL_NAME
  : [a-zA-Z0-9_]+ ('.' [a-zA-Z0-9_]+)*
  ;

/* Subscript command inside identifiers:  \<^sub> */
SUBSCRIPT
  : '\\' '<^sub>'
  ;

/* Numbers for vec dimensions etc. */
NUMBER : DIGIT+ ;

/* Quoted text for logic/types; allows "" inside */
QUOTED_TEXT
  : '"' ( '""' | ~["\r\n] )* '"'
  ;

/* Whitespace & ML-style comments */
fragment SPACES : [ \t\r\n] ;
WS       : SPACES+ -> skip ;
COMMENT  : '(*' ( . | '\r' | '\n' )*? '*)' -> skip ;
