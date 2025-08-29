grammar IsaVODEtoCPP;

/* =====================
 * Parser rules
 * ===================== */

program
  : (theoryBlock | contextBlock | dataspaceDecl | abbrevDecl | definitionDecl)* EOF
  ;

/* ---- theory ----
   theory <Name>
   imports <Import1> <Import2> ...
   begin
     ...
   end
   Imports can be unquoted (dotted identifiers) or quoted strings.
*/
theoryBlock
  : THEORY dottedName importsClause? BEGIN theoryBody END
  ;

importsClause
  : IMPORTS importItem+                // one or more imports
  ;

importItem
  : importName
  | QUOTED_TEXT                        // "Hybrid-Verification.Hybrid_Verification"
  ;

importName
  : dottedName
  ;

dottedName
  : ident (DOT ident)*
  ;

theoryBody
  : (contextBlock
    | dataspaceDecl
    | abbrevDecl
    | definitionDecl
    | constantsClause
    | assumesClause
    | variablesClause
    )*
  ;

/* ---- context ----
   context <name> begin ... end
*/
contextBlock
  : CONTEXT ident BEGIN contextBody END
  ;

contextBody
  : (abbrevDecl | definitionDecl | constantsClause | assumesClause | variablesClause)*
  ;

/* Minimal 'definition' support */
definitionDecl
  : DEFINITION QUOTED_TEXT
  ;

/* ---- dataspace ---- */
dataspaceDecl
  : DATASPACE ident ASSIGN dataspaceBody
  ;

dataspaceBody
  : (constantsClause
    | assumesClause
    | variablesClause
    | abbrevDecl
    | definitionDecl
    )*
  ;

constantsClause
  : CONSTANTS constantDecl+
  ;

constantDecl
  : ident D_COLON typeSpec
  ;

assumesClause
  : ASSUMES assumptionDecl (AND assumptionDecl)*
  ;

assumptionDecl
  : ident COLON QUOTED_TEXT+                 // allows: a: "P" "Q"
  ;

variablesClause
  : VARIABLES varDecl+
  ;

varDecl
  : ident D_COLON typeSpec
  ;

/* ---- abbreviation ----
   1) abbreviation."…"
   2) abbreviation "…"
   3) abbreviation (input)? name (:: "TYPE")? (printSpec)? (precedenceAnn)? where "…"
*/
abbrevDecl
  : ABBREVIATION (DOT)? QUOTED_TEXT
  | ABBREVIATION (LPAREN ASCII_ID RPAREN)? ident (D_COLON QUOTED_TEXT)?
      printSpec? precedenceAnn? WHERE QUOTED_TEXT
  ;

/* PRINTFORM:
   - ("print")
   - (infixr "…" 100)
   - ( \<open> … \<close> [1000] 999 )   // precedence may be INSIDE the same parens
*/
printSpec
  : LPAREN ( QUOTED_TEXT | mixfixForm | antiquotBlock )? innerPrec? RPAREN
  ;

/* Precedence AFTER printSpec:
   [1000,200] 999   |   [1000]   |   999
*/
precedenceAnn
  : (LBRACK numberList RBRACK (NUMBER)?)     // [list] or [list] num
  | NUMBER                                   // or just num
  ;

/* Precedence INSIDE parens (used by printSpec) */
innerPrec
  : LBRACK numberList RBRACK (NUMBER)?
  ;

/* e.g., infixr "↓_V_e_c" 100, infixl "++" 70, binder "∑" 10 */
mixfixForm
  : ASCII_ID QUOTED_TEXT (NUMBER)?
  ;

/* ---- nested antiquotation as a parser construct ----
   antiquotBlock matches:  \<open> (content ... possibly nested antiquotBlock) \<close>
*/
antiquotBlock
  : ANTI_OPEN antiquotContent ANTI_CLOSE
  ;

antiquotContent
  : (antiquotUnit)*
  ;

antiquotUnit
  : antiquotBlock                         // nesting
  | QUOTED_TEXT
  | ident
  | NUMBER
  | SUPERSCRIPT                           // allow \<^sup> inside antiquotations
  | ARROW | LPAREN | RPAREN
  | LBRACK | RBRACK | COMMA
  | CARET | STAR | PLUS | MINUS | DOT | SLASH
  | ASSIGN | COLON | D_COLON
  | DATASPACE | CONSTANTS | ASSUMES | VARIABLES | ABBREVIATION | WHERE | AND
  | CONTEXT | BEGIN | END | DEFINITION
  | THEORY | IMPORTS
  ;

/* ---- types ---- */
typeSpec
  : QUOTED_TEXT
  | typeAtom+                                // e.g., real vec[2], R^n
  ;

typeAtom
  : ident
  | NUMBER
  | SUPERSCRIPT
  | ARROW | LPAREN | RPAREN | LBRACK | RBRACK
  | COMMA | CARET | STAR | PLUS | MINUS | DOT | SLASH
  ;

/* ---- identifiers ----
   names, Isabelle symbols (\<phi>), and subscript chains f\<^sub>m\<^sub>a\<^sub>x,
   including numeric subscripts like K\<^sub>1, K\<^sub>2
*/
ident
  : idseg (SUBSCRIPT idsegOrNum)*
  ;

idseg
  : ASCII_ID
  | SYMBOL_IDENT
  ;

idsegOrNum
  : idseg
  | NUMBER
  ;

/* ===== helper list ===== */
numberList
  : NUMBER (COMMA NUMBER)*
  ;

/* =====================
 * Lexer rules
 * ===================== */

/* --- Skip full comment antiquotation blocks:  \<comment> \<open> … \<close> --- */
ISABELLE_COMMENT_BLOCK
  : '\\' '<' 'comment' '>' SPACES* '\\' '<' 'open' '>'
    ( . | '\r' | '\n' )*?
    '\\' '<' 'close' '>'
    -> skip
  ;

/* --- Tokenize antiquotation delimiters so the parser can nest them --- */
ANTI_OPEN   : '\\' '<' 'open' '>' ;
ANTI_CLOSE  : '\\' '<' 'close' '>' ;

/* Keywords / punctuation */
THEORY      : 'theory' ;
IMPORTS     : 'imports' ;
DATASPACE   : 'dataspace' ;
CONSTANTS   : 'constants' ;
ASSUMES     : 'assumes' ;
VARIABLES   : 'variables' ;
ABBREVIATION: 'abbreviation' ;
DEFINITION  : 'definition' ;
WHERE       : 'where' ;
AND         : 'and' ;
CONTEXT     : 'context' ;
BEGIN       : 'begin' ;
END         : 'end' ;
ASSIGN      : '=' ;
D_COLON     : '::' ;
COLON       : ':' ;

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
SLASH      : '/' ;

/* Identifiers */
fragment LETTER      : [\p{L}] ;
fragment DIGIT       : [0-9] ;
fragment APOSTROPHE  : '\'' ;

/* Standard Isabelle-like identifier */
ASCII_ID
  : (LETTER | '_' | APOSTROPHE) (LETTER | DIGIT | '_' | APOSTROPHE)*
  ;

/* Isabelle symbol: \<phi>, \<epsilon>, \<le>, \<tau>, etc.  (placed after ANTI_* to avoid conflict) */
SYMBOL_IDENT
  : '\\' '<' SYMBOL_NAME '>'
  ;

/* Subscript / superscript commands used in identifiers:  \<^sub> / \<^sup> */
SUBSCRIPT
  : '\\' '<^sub>'
  ;
SUPERSCRIPT
  : '\\' '<^sup>'
  ;

fragment SYMBOL_NAME
  : [a-zA-Z0-9_]+ ('.' [a-zA-Z0-9_]+)*
  ;

/* Numbers for precedences, vec dims, etc. */
NUMBER : DIGIT+ ;

/* Quoted text — allows newlines and Isabelle-style doubled quotes "" */
QUOTED_TEXT
  : '"' ( '""' | ~'"' )* '"'
  ;

/* Whitespace & ML-style comments */
fragment SPACES : [ \t\r\n] ;
WS       : SPACES+ -> skip ;
COMMENT  : '(*' ( . | '\r' | '\n' )*? '*)' -> skip ;
