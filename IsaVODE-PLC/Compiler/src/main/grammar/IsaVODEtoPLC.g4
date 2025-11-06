grammar IsaVODEtoPLC;

/* =====================
 * Parser rules
 * ===================== */

program
  : (theoryBlock | contextBlock | dataspaceDecl | abbrevDecl | definitionDecl | lemmaDecl)* EOF
  ;

/* ---- theory ----
   Allows missing final 'end' at EOF to accommodate some generated files.
*/
theoryBlock
  : THEORY dottedName importsClause? keywordsClause? BEGIN theoryBody END?
  ;

importsClause
  : IMPORTS importItem+
  ;

importItem
  : importName
  | QUOTED_TEXT                        // e.g. "Hybrid-Verification.Hybrid_Verification"
  ;

importName
  : dottedName
  ;

dottedName
  : ident (DOT ident)*
  ;

/* keywords "find_local_flow" :: diag */
keywordsClause
  : KEYWORDS keywordSpec+
  ;

keywordSpec
  : QUOTED_TEXT (D_COLON ident)?
  ;

theoryBody
  : (contextBlock
    | dataspaceDecl
    | abbrevDecl
    | definitionDecl
    | lemmaDecl
    | constantsClause
    | assumesClause
    | variablesClause
    | mlBlock                          // ML \<open> ... \<close>
    )*
  ;

/* ---- context ---- */
contextBlock
  : CONTEXT ident BEGIN contextBody END
  ;

contextBody
  : (abbrevDecl
    | definitionDecl
    | lemmaDecl
    | constantsClause
    | assumesClause
    | variablesClause
    | mlBlock                          // allow ML inside contexts
    )*
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
    | lemmaDecl
    | mlBlock                          // allow ML in dataspaces, just in case
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

/* Precedence AFTER printSpec: [1000,200] 999 | [1000] | 999 */
precedenceAnn
  : (LBRACK numberList RBRACK (NUMBER)?) | NUMBER
  ;

/* Precedence INSIDE parens (used by printSpec) */
innerPrec
  : LBRACK numberList RBRACK (NUMBER)?
  ;

mixfixForm
  : ASCII_ID QUOTED_TEXT (NUMBER)?
  ;

/* ---- lemma ----
   Supports:
     lemma "…"
       (unfolding …)? (using …)? by …
     lemma name: "…" …
     lemma name: assumes "…" and … shows "…" and …
       unfolding … using … by …
     lemma "…" … oops
*/
lemmaDecl
  : LEMMA (ident COLON)? lemmaHead lemmaProof?
  ;

lemmaHead
  : QUOTED_TEXT+                                                    // one or more quoted chunks
  | lemmaAssumesShows                                               // structured head, non-empty
  ;

// At least one of ASSUMES / SHOWS must be present
lemmaAssumesShows
  : ASSUMES QUOTED_TEXT (AND QUOTED_TEXT)*                          // only assumes
  | (ASSUMES QUOTED_TEXT (AND QUOTED_TEXT)*)?
    SHOWS   QUOTED_TEXT (AND QUOTED_TEXT)*                          // shows (with optional assumes)
  ;

lemmaProof
  : OOPS                                                            // abort proof
  | (UNFOLDING proofItems)? (USING proofItems)? BY proofItems        // one-liner
  | (FIND_LOCAL_FLOW proofItems? )? proofScript+                     // script style; at least one cmd
  ;

proofScript
  : APPLY  proofItems
  | INTRO  proofItems
  | SUBGOAL proofItems
  | USING  proofItems
  | UNFOLDING proofItems
  | BY     proofItems
  | DONE
  | QED
  ;

proofItems
  : (proofItem)+
  ;

proofItem
  : QUOTED_TEXT
  | antiquotBlock
  | ident | NUMBER
  | SUPERSCRIPT | SUBSCRIPT
  | ARROW | LPAREN | RPAREN
  | LBRACK | RBRACK | COMMA
  | CARET | STAR | PLUS | MINUS | DOT | SLASH
  | ASSIGN | COLON | D_COLON
  ;

/* ---- nested antiquotation as a parser construct ----
   \<open> (content … possibly nested) \<close>
*/
antiquotBlock
  : ANTI_OPEN antiquotContent ANTI_CLOSE
  ;

antiquotContent
  : (antiquotUnit)*
  ;

antiquotUnit
  : antiquotBlock
  | QUOTED_TEXT
  | ident
  | NUMBER
  | SUPERSCRIPT
  | ARROW | LPAREN | RPAREN
  | LBRACK | RBRACK | COMMA
  | CARET | STAR | PLUS | MINUS | DOT | SLASH
  | ASSIGN | COLON | D_COLON
  | DATASPACE | CONSTANTS | ASSUMES | VARIABLES | ABBREVIATION | WHERE | AND
  | CONTEXT | BEGIN | END | DEFINITION
  | THEORY | IMPORTS | LEMMA | SHOWS | BY | APPLY | USING | UNFOLDING | FIND_LOCAL_FLOW | OOPS
  | CONTROL_IDENT                                         // e.g. \<^command_keyword>
  ;

/* ---- ML blocks ----
   ML \<open> ... arbitrary ML code ... \<close>
   We treat the whole block as opaque (one token).
*/
mlBlock
  : ML_BLOCK
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

/* ---- identifiers ---- */
ident
  : idseg (SUBSCRIPT idsegOrNum)*
  ;

idseg
  : ASCII_ID
  | SYMBOL_IDENT
  | CONTROL_IDENT
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

/* --- fragments --- */
fragment LETTER      : [\p{L}] ;
fragment DIGIT       : [0-9] ;
fragment APOSTROPHE  : '\'' ;
fragment SPACES      : [ \t\r\n] ;
fragment SYMBOL_NAME : [a-zA-Z0-9_]+ ('.' [a-zA-Z0-9_]+)* ;

/* Skip \<comment> \<open> … \<close> completely */
ISABELLE_COMMENT_BLOCK
  : '\\' '<' 'comment' '>' SPACES* '\\' '<' 'open' '>'
    ( . | '\r' | '\n' )*?
    '\\' '<' 'close' '>'
    -> skip
  ;

/* ML block: greedy until the LAST \<close> after ML \<open> */
ML_BLOCK
  : 'ML' SPACES* '\\' '<' 'open' '>'
    ( . | '\r' | '\n' )*
    '\\' '<' 'close' '>'
  ;

/* Tokenize antiquotation delimiters for nested parsing (outside ML_BLOCK) */
ANTI_OPEN   : '\\' '<' 'open' '>' ;
ANTI_CLOSE  : '\\' '<' 'close' '>' ;

/* Keywords / punctuation */
THEORY       : 'theory' ;
IMPORTS      : 'imports' ;
KEYWORDS     : 'keywords' ;
DATASPACE    : 'dataspace' ;
CONSTANTS    : 'constants' ;
ASSUMES      : 'assumes' ;
SHOWS        : 'shows' ;
VARIABLES    : 'variables' ;
ABBREVIATION : 'abbreviation' ;
DEFINITION   : 'definition' ;
LEMMA        : 'lemma' ;
OOPS         : 'oops' ;
WHERE        : 'where' ;
AND          : 'and' ;
CONTEXT      : 'context' ;
BEGIN        : 'begin' ;
END          : 'end' ;
ASSIGN       : '=' ;
D_COLON      : '::' ;
COLON        : ':' ;
BY           : 'by' ;
APPLY        : 'apply' ;
USING        : 'using' ;
UNFOLDING    : 'unfolding' ;
INTRO        : 'intro' ;
SUBGOAL      : 'subgoal' ;
DONE         : 'done' ;
QED          : 'qed' ;
FIND_LOCAL_FLOW : 'find_local_flow' ;

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

/* Subscript / superscript / control symbols:  \<^sub>, \<^sup>, \<^command_keyword>, etc. */
SUBSCRIPT
  : '\\' '<^sub>'
  ;

SUPERSCRIPT
  : '\\' '<^sup>'
  ;

/* General control symbols like \<^command_keyword> */
CONTROL_IDENT
  : '\\' '<^' SYMBOL_NAME '>'
  ;

/* Isabelle symbol: \<phi>, \<epsilon>, \<le>, \<tau>, etc. */
SYMBOL_IDENT
  : '\\' '<' SYMBOL_NAME '>'
  ;

/* Identifiers */
ASCII_ID
  : (LETTER | '_' | APOSTROPHE) (LETTER | DIGIT | '_' | APOSTROPHE)*
  ;

/* Numbers for precedences, vec dims, etc. */
NUMBER : DIGIT+ ;

/* Quoted text — allows newlines and Isabelle-style doubled quotes "" */
QUOTED_TEXT
  : '"' ( '""' | ~'"' )* '"'
  ;

/* Whitespace & ML-style comments */
WS       : SPACES+ -> skip ;
COMMENT  : '(*' ( . | '\r' | '\n' )*? '*)' -> skip ;
