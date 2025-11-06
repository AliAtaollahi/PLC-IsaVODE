grammar IsaVODEtoPLC;

/* =====================
 * Parser rules
 * ===================== */

/* Allow all outer commands at top-level */
program
  : (topItem)* EOF
  ;

topItem
  : theoryBlock
  | contextBlock
  | dataspaceDecl
  | abbrevDecl
  | definitionDecl
  | lemmaDecl
  | lemmasDecl
  | constantsClause
  | assumesClause
  | variablesClause
  | typeSynDecl
  | syntaxDecl
  | translationsDecl
  | bundleBlock
  | unbundleDecl
  | declareDecl
  | noNotationDecl
  | notationDecl
  | namedTheoremsDecl
  | exprConstructorDecl
  | mlBlock
  | mlFileDecl
  | sectionCommand
  | subsectionCommand
  | textCommand
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
  : ( contextBlock
    | dataspaceDecl
    | abbrevDecl
    | definitionDecl
    | lemmaDecl
    | lemmasDecl
    | constantsClause
    | assumesClause
    | variablesClause
    | typeSynDecl
    | syntaxDecl
    | translationsDecl
    | bundleBlock
    | unbundleDecl
    | declareDecl
    | noNotationDecl
    | notationDecl
    | namedTheoremsDecl
    | exprConstructorDecl
    | mlBlock
    | mlFileDecl
    | sectionCommand
    | subsectionCommand
    | textCommand
    )*
  ;

/* ---- section / subsection / text ----
   These are treated as opaque blocks: section \<open>...\<close>, etc.
*/

sectionCommand
  : SECTION_BLOCK
  ;

subsectionCommand
  : SUBSECTION_BLOCK
  ;

textCommand
  : TEXT_BLOCK
  ;

/* ---- context ---- */
contextBlock
  : CONTEXT ident BEGIN contextBody END
  ;

contextBody
  : ( abbrevDecl
    | definitionDecl
    | lemmaDecl
    | lemmasDecl
    | constantsClause
    | assumesClause
    | variablesClause
    | typeSynDecl
    | syntaxDecl
    | translationsDecl
    | bundleBlock
    | unbundleDecl
    | declareDecl
    | noNotationDecl
    | notationDecl
    | namedTheoremsDecl
    | exprConstructorDecl
    | mlBlock
    | mlFileDecl
    | sectionCommand
    | subsectionCommand
    | textCommand
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
  : ( noNotationDecl
    | syntaxDecl
    | translationsDecl
    | declareDecl
    | notationDecl
    | namedTheoremsDecl
    | exprConstructorDecl
    | lemmaDecl
    | lemmasDecl
    | abbrevDecl
    | mlBlock
    | mlFileDecl
    | sectionCommand
    | subsectionCommand
    | textCommand
    )*
  ;

/* Minimal 'definition' + simple named form */
definitionDecl
  : DEFINITION QUOTED_TEXT
  | DEFINITION ident (D_COLON QUOTED_TEXT)? WHERE QUOTED_TEXT
  ;

/* ---- dataspace ---- */
dataspaceDecl
  : DATASPACE ident ASSIGN dataspaceBody
  ;

dataspaceBody
  : ( constantsClause
    | assumesClause
    | variablesClause
    | abbrevDecl
    | definitionDecl
    | lemmaDecl
    | lemmasDecl
    | typeSynDecl
    | syntaxDecl
    | translationsDecl
    | bundleBlock
    | unbundleDecl
    | declareDecl
    | noNotationDecl
    | notationDecl
    | namedTheoremsDecl
    | exprConstructorDecl
    | mlBlock
    | mlFileDecl
    | sectionCommand
    | subsectionCommand
    | textCommand
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

/* ---- type synonym ---- */
/* type_synonym 'a pred = "'a \<Rightarrow> bool" */
typeSynDecl
  : TYPE_SYNONYM typeSpec ASSIGN typeSpec
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

/* lemma proofs:
   - oops
   - unfolding ... using ... by ...
   - script style (apply/using/...) with optional trailing oops
*/
lemmaProof
  : OOPS
  | (UNFOLDING proofItems)? (USING proofItems)? BY proofItems
  | (FIND_LOCAL_FLOW proofItems? )? proofScript+ OOPS?
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

/* ---- lemmas (collections) ----
   Treat the whole line as opaque.
   Example: lemmas fbox_conseq_alt = fbox_conseq[unfolded impl_eq_leq]
*/
lemmasDecl
  : LEMMAS_CMD
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

/* ---- ML blocks ----
   ML \<open> ... arbitrary ML code ... \<close>
   We treat the whole block as opaque (one token).
*/
mlBlock
  : ML_BLOCK
  ;

/* ML_file \<open> ... \<close> */
mlFileDecl
  : ML_FILE_CMD
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

/* no_notation ...  (ASCII) ... and ... */
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

/* notation / named_theorems / expr_constructor:
   Each full line is opaque.
*/
notationDecl
  : NOTATION_CMD
  ;

namedTheoremsDecl
  : NAMED_THEOREMS_CMD
  ;

exprConstructorDecl
  : EXPR_CONSTRUCTOR_CMD
  ;

/* ---- types ---- */
typeSpec
  : QUOTED_TEXT
  | typeAtom+                                // e.g., real vec[2], R^n, 'a pred
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

/* Section / subsection / text blocks: section \<open>...\<close>, etc. */
SECTION_BLOCK
  : 'section' SPACES* '\\' '<' 'open' '>'
    ( . | '\r' | '\n' )*?
    '\\' '<' 'close' '>'
  ;

SUBSECTION_BLOCK
  : 'subsection' SPACES* '\\' '<' 'open' '>'
    ( . | '\r' | '\n' )*?
    '\\' '<' 'close' '>'
  ;

TEXT_BLOCK
  : 'text' SPACES* '\\' '<' 'open' '>'
    ( . | '\r' | '\n' )*?
    '\\' '<' 'close' '>'
  ;

/* ML block: greedy until the LAST \<close> after ML \<open> */
ML_BLOCK
  : 'ML' SPACES* '\\' '<' 'open' '>'
    ( . | '\r' | '\n' )*
    '\\' '<' 'close' '>'
  ;

/* ML_file \<open> ... \<close> as opaque */
ML_FILE_CMD
  : 'ML_file' SPACES* '\\' '<' 'open' '>'
    ( . | '\r' | '\n' )*
    '\\' '<' 'close' '>'
  ;

/* Tokenize antiquotation delimiters for nested parsing (outside the block tokens) */
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

TYPE_SYNONYM  : 'type_synonym' ;

/* arrows and equivalence used in translations etc */
EQEQ       : '==';
ARROW      : '=>' ;
REV_ARROW  : '<=' ;

/* Attribute config block: [[ ... ]] */
ATTR_CONFIG
  : '[[' ( . | '\r' | '\n' )*? ']]'
  ;

/* Single-line opaque commands */
NOTATION_CMD
  : 'notation' ~[\r\n]*
  ;

NAMED_THEOREMS_CMD
  : 'named_theorems' ~[\r\n]*
  ;

EXPR_CONSTRUCTOR_CMD
  : 'expr_constructor' ~[\r\n]*
  ;

LEMMAS_CMD
  : 'lemmas' ~[\r\n]*
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
