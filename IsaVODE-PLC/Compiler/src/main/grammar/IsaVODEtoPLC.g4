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
    | mlBlock
    | bundleBlock
    | syntaxDecl
    | translationsDecl
    | unbundleDecl
    | declareDecl
    | noNotationDecl
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
    | mlBlock
    | bundleBlock
    | syntaxDecl
    | translationsDecl
    | unbundleDecl
    | declareDecl
    | noNotationDecl
    )*
  ;

/* ---- bundle ----
   bundle Hybrid_Program_Syntax
   begin
     ...
   end
*/
bundleBlock
  : BUNDLE ident BEGIN bundleBody END
  ;

bundleBody
  : (noNotationDecl
    | syntaxDecl
    | translationsDecl
    | declareDecl
    | lemmaDecl
    | abbrevDecl
    | mlBlock
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
    | mlBlock
    | bundleBlock
    | syntaxDecl
    | translationsDecl
    | unbundleDecl
    | declareDecl
    | noNotationDecl
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

/* ---- lemma ---- */
lemmaDecl
  : LEMMA lemmaPrefix? lemmaHead lemmaProof?
  ;

/* optional name + attributes + colon */
lemmaPrefix
  : lemmaNameAndAttrs COLON?
  ;

lemmaNameAndAttrs
  : ident attributes?       // named lemma, optional attributes
  | attributes              // unnamed lemma with attributes
  ;

attributes
  : LBRACK attrList RBRACK
  ;

attrList
  : attribute (COMMA attribute)*
  ;

attribute
  : ident (BANG)?           // e.g. simp, intro!
  ;

lemmaHead
  : QUOTED_TEXT+                                                    // one or more quoted chunks
  | lemmaAssumesShows                                               // structured head, non-empty
  ;

/* structured lemma head with multiple quoted facts per assumes/shows */
lemmaAssumesShows
  : ASSUMES lemmaFacts (AND lemmaFacts)*                            // only assumes
  | (ASSUMES lemmaFacts (AND lemmaFacts)*)?
    SHOWS   lemmaFacts (AND lemmaFacts)*                            // shows (with optional assumes)
  ;

lemmaFacts
  : QUOTED_TEXT+
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
  | ARROW | REV_ARROW | EQEQ
  | LPAREN | RPAREN
  | LBRACK | RBRACK | COMMA
  | CARET | STAR | PLUS | MINUS | DOT | SLASH
  | ASSIGN | COLON | D_COLON
  | BANG
  ;

/* ---- nested antiquotation as a parser construct ---- */
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
  | ARROW | REV_ARROW | EQEQ | LPAREN | RPAREN
  | LBRACK | RBRACK | COMMA
  | CARET | STAR | PLUS | MINUS | DOT | SLASH
  | ASSIGN | COLON | D_COLON
  | DATASPACE | CONSTANTS | ASSUMES | VARIABLES | ABBREVIATION | WHERE | AND
  | CONTEXT | BEGIN | END | DEFINITION
  | THEORY | IMPORTS | LEMMA | SHOWS | BY | APPLY | USING | UNFOLDING | FIND_LOCAL_FLOW | OOPS
  | CONTROL_IDENT
  | BANG
  ;

/* ---- ML blocks ---- */
mlBlock
  : ML_BLOCK
  ;

/* ---- syntax / translations / unbundle / declare / no_notation ---- */

syntaxDecl
  : SYNTAX syntaxEntry+
  ;

syntaxEntry
  : QUOTED_TEXT D_COLON QUOTED_TEXT printSpec?
  ;

translationsDecl
  : TRANSLATIONS translationRule+
  ;

translationRule
  : QUOTED_TEXT (ARROW | REV_ARROW | EQEQ) QUOTED_TEXT
  ;

unbundleDecl
  : UNBUNDLE ident+
  ;

/* declare lens_indep_impl_scene_indep_var [lens]
   declare [[literal_variables, pretty_print_exprs, mark_state_variables=false]]
*/
declareDecl
  : DECLARE (declItem+ | ATTR_CONFIG)
  ;

declItem
  : ident attributes?
  ;

noNotationDecl
  : NO_NOTATION noNotationTail
  ;

noNotationTail
  : (noNotationToken)+
  ;

noNotationToken
  : QUOTED_TEXT
  | antiquotBlock
  | ident
  | NUMBER
  | SUPERSCRIPT | SUBSCRIPT
  | LPAREN | RPAREN
  | LBRACK | RBRACK
  | COMMA | CARET | STAR | PLUS | MINUS | DOT | SLASH
  | ASSIGN | COLON | D_COLON
  | ARROW | REV_ARROW | EQEQ
  | BANG
  | AND
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
  | ARROW | REV_ARROW | EQEQ | LPAREN | RPAREN | LBRACK | RBRACK
  | COMMA | CARET | STAR | PLUS | MINUS | DOT | SLASH
  | BANG
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

BUNDLE        : 'bundle' ;
SYNTAX        : 'syntax' ;
TRANSLATIONS  : 'translations' ;
UNBUNDLE      : 'unbundle' ;
DECLARE       : 'declare' ;
NO_NOTATION   : 'no_notation' ;

EQEQ       : '==';
ARROW      : '=>' ;
REV_ARROW  : '<=' ;

/* Attribute config block: [[ ... ]] */
ATTR_CONFIG
  : '[[' ( . | '\r' | '\n' )*? ']]'
  ;

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
BANG       : '!' ;

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
