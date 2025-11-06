grammar IsaVODEtoPLC;

/* =====================
 * Parser rules
 * ===================== */

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
  | methodDecl
  | methodSetupDecl
  | mlBlock
  | mlFileDecl
  | sectionCommand
  | subsectionCommand
  | textCommand
  ;

/* ---- theory ---- */

theoryBlock
  : THEORY dottedName importsClause? keywordsClause? BEGIN theoryBody END?
  ;

importsClause
  : IMPORTS importItem+
  ;

importItem
  : importName
  | QUOTED_TEXT
  ;

importName
  : dottedName
  ;

dottedName
  : ident (DOT ident)*
  ;

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
    | methodDecl
    | methodSetupDecl
    | mlBlock
    | mlFileDecl
    | sectionCommand
    | subsectionCommand
    | textCommand
    )*
  ;

/* ---- section / subsection / text ---- */

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
    | methodDecl
    | methodSetupDecl
    | mlBlock
    | mlFileDecl
    | sectionCommand
    | subsectionCommand
    | textCommand
    )*
  ;

/* ---- bundle ---- */

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
    | methodDecl
    | methodSetupDecl
    | mlBlock
    | mlFileDecl
    | sectionCommand
    | subsectionCommand
    | textCommand
    )*
  ;

/* ---- definition ---- */

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
    | methodDecl
    | methodSetupDecl
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
  : ident COLON QUOTED_TEXT+
  ;

variablesClause
  : VARIABLES varDecl+
  ;

varDecl
  : ident D_COLON typeSpec
  ;

/* ---- type synonym ---- */

typeSynDecl
  : TYPE_SYNONYM typeSpec ASSIGN typeSpec
  ;

/* ---- abbreviation ---- */

abbrevDecl
  : ABBREVIATION (DOT)? QUOTED_TEXT
  | ABBREVIATION (LPAREN ASCII_ID RPAREN)? ident (D_COLON QUOTED_TEXT)?
      printSpec? precedenceAnn? WHERE QUOTED_TEXT
  ;

/* print spec & precedence */

printSpec
  : LPAREN ( QUOTED_TEXT | mixfixForm | antiquotBlock )? innerPrec? RPAREN
  ;

precedenceAnn
  : (LBRACK numberList RBRACK (NUMBER)?) | NUMBER
  ;

innerPrec
  : LBRACK numberList RBRACK (NUMBER)?
  ;

mixfixForm
  : ASCII_ID QUOTED_TEXT (NUMBER)?
  ;

/* ---- lemma ---- */

lemmaDecl
  : LEMMA lemmaPrefix? lemmaHeadGeneric lemmaProof
  ;

lemmaPrefix
  : lemmaNameAndAttrs COLON?
  ;

lemmaNameAndAttrs
  : ident attributes?
  | attributes
  ;

attributes
  : LBRACK attrList RBRACK
  ;

attrList
  : attribute (COMMA attribute)*
  ;

attribute
  : ident (BANG)?
  ;

/* lemma head: everything until first proof keyword */

lemmaHeadGeneric
  : lemmaHeadToken+
  ;

lemmaHeadToken
  : QUOTED_TEXT
  | antiquotBlock
  | ident
  | NUMBER
  | SUPERSCRIPT | SUBSCRIPT
  | LPAREN | RPAREN | LBRACK | RBRACK | LBRACE | RBRACE
  | COMMA | CARET | STAR | PLUS | MINUS | DOT | SLASH
  | ASSIGN | COLON | D_COLON
  | EQEQ | ARROW | REV_ARROW
  | AND | FOR
  | ASSUMES | SHOWS | FIXES | IS
  ;

/* proofs */

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
  | LBRACK | RBRACK
  | COMMA | CARET | STAR | PLUS | MINUS | DOT | SLASH
  | ASSIGN | COLON | D_COLON
  | BANG
  | SEMI | QUESTION | BAR
  | WHERE
  ;

/* ---- lemmas (collections) ---- */

lemmasDecl
  : LEMMAS_CMD
  ;

/* ---- method / method_setup ---- */

// force every 'method' to have a body
methodDecl
  : METHOD methodBody
  ;

// match:  method_setup kstar = \<open> ... \<close> "introduce an invariant"
methodSetupDecl
  : METHOD_SETUP methodBody
  ;

methodBody
  : methodAtom+
  ;

methodAtom
  : QUOTED_TEXT
  | antiquotBlock
  | ident
  | NUMBER
  | SUPERSCRIPT | SUBSCRIPT
  | LPAREN | RPAREN | LBRACK | RBRACK | LBRACE | RBRACE
  | COMMA | CARET | STAR | PLUS | MINUS | DOT | SLASH
  | ASSIGN | COLON | D_COLON
  | EQEQ | ARROW | REV_ARROW
  | BANG | SEMI | QUESTION | BAR
  | AND
  | FOR
  | WHERE
  | BY | APPLY | USING | UNFOLDING | INTRO | SUBGOAL | DONE | QED | OOPS
  | FIND_LOCAL_FLOW
  ;


/* ---- nested antiquotation ---- */

antiquotBlock
  : ML_BLOCK
  ;

antiquotContent
  : (antiquotUnit)*
  ;

antiquotUnit
  : antiquotBlock
  | QUOTED_TEXT
  | ident
  | NUMBER
  | SUPERSCRIPT | SUBSCRIPT
  | ARROW | REV_ARROW | EQEQ | LPAREN | RPAREN
  | LBRACK | RBRACK | COMMA | LBRACE | RBRACE
  | CARET | STAR | PLUS | MINUS | DOT | SLASH
  | ASSIGN | COLON | D_COLON
  | SEMI | QUESTION | BAR | AT | GT
  | DATASPACE | CONSTANTS | ASSUMES | VARIABLES | ABBREVIATION | WHERE | AND | FOR | FIXES
  | CONTEXT | BEGIN | END | DEFINITION
  | THEORY | IMPORTS | LEMMA | SHOWS | BY | APPLY | USING | UNFOLDING | FIND_LOCAL_FLOW | OOPS
  | CONTROL_IDENT
  | BANG
  ;

/* ---- ML ---- */

mlBlock
  : ML_BLOCK
  ;

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

declareDecl
  : DECLARE (ATTR_CONFIG | declTail)
  ;

declTail
  : (declAtom)+
  ;

declAtom
  : QUOTED_TEXT
  | antiquotBlock
  | ident
  | NUMBER
  | SUPERSCRIPT | SUBSCRIPT
  | LPAREN | RPAREN | LBRACK | RBRACK | LBRACE | RBRACE
  | COMMA | CARET | STAR | PLUS | MINUS | DOT | SLASH
  | ASSIGN | COLON | D_COLON
  | EQEQ | ARROW | REV_ARROW
  | BANG
  | SEMI | QUESTION | BAR
  | AND
  | FOR
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
  | SEMI | QUESTION | BAR
  | AND
  ;

/* opaque single-line commands */

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
  | typeAtom+
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

/* helper list */

numberList
  : NUMBER (COMMA NUMBER)*
  ;

/* =====================
 * Lexer rules
 * ===================== */

fragment LETTER      : [\p{L}] ;
fragment DIGIT       : [0-9] ;
fragment APOSTROPHE  : '\'' ;
fragment SPACES      : [ \t\r\n] ;
fragment SYMBOL_NAME : [a-zA-Z0-9_]+ ('.' [a-zA-Z0-9_]+)* ;

/* \<comment> \<open> … \<close> */

ISABELLE_COMMENT_BLOCK
  : '\\' '<' 'comment' '>' SPACES* '\\' '<' 'open' '>'
    ( . | '\r' | '\n' )*?
    '\\' '<' 'close' '>'
    -> skip
  ;

/* section/subsection/text blocks */

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

/* ML blocks */

ML_BLOCK
  : ('ML' SPACES*)? '\\' '<' 'open' '>'
    ( . | '\r' | '\n' )*
    '\\' '<' 'close' '>'
  ;

ML_FILE_CMD
  : 'ML_file' SPACES* '\\' '<' 'open' '>'
    ( . | '\r' | '\n' )*
    '\\' '<' 'close' '>'
  ;

/* antiquotation delimiters */

ANTI_OPEN   : '\\' '<' 'open' '>' ;
ANTI_CLOSE  : '\\' '<' 'close' '>' ;

/* keywords */

THEORY       : 'theory' ;
IMPORTS      : 'imports' ;
KEYWORDS     : 'keywords' ;
DATASPACE    : 'dataspace' ;
CONSTANTS    : 'constants' ;
ASSUMES      : 'assumes' ;
SHOWS        : 'shows' ;
FIXES        : 'fixes' ;
IS           : 'is' ;
FOR          : 'for' ;
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

METHOD        : 'method' ;
METHOD_SETUP  : 'method_setup' ;

EQEQ       : '==';
ARROW      : '=>' ;
REV_ARROW  : '<=' ;

ATTR_CONFIG
  : '[[' ( . | '\r' | '\n' )*? ']]'
  ;

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

/* punctuation */

LPAREN     : '(' ;
RPAREN     : ')' ;
LBRACK     : '[' ;
RBRACK     : ']' ;
LBRACE     : '{' ;
RBRACE     : '}' ;
COMMA      : ',' ;
CARET      : '^' ;
STAR       : '*' ;
PLUS       : '+' ;
MINUS      : '-' ;
DOT        : '.' ;
SLASH      : '/' ;
BANG       : '!' ;
SEMI       : ';' ;
QUESTION   : '?' ;
BAR        : '|' ;
AT         : '@' ;
GT         : '>' ;

/* sub/superscripts / control symbols */

SUBSCRIPT
  : '\\' '<^sub>'
  ;

SUPERSCRIPT
  : '\\' '<^sup>'
  ;

CONTROL_IDENT
  : '\\' '<^' SYMBOL_NAME '>'
  ;

SYMBOL_IDENT
  : '\\' '<' SYMBOL_NAME '>'
  ;

/* identifiers */

ASCII_ID
  : (LETTER | '_' | APOSTROPHE) (LETTER | DIGIT | '_' | APOSTROPHE)*
  ;

/* numbers */

NUMBER : DIGIT+ ;

/* quoted text */

QUOTED_TEXT
  : '"' ( '""' | ~'"' )* '"'
  ;

/* whitespace & comments */

WS       : SPACES+ -> skip ;
COMMENT  : '(*' ( . | '\r' | '\n' )*? '*)' -> skip ;
