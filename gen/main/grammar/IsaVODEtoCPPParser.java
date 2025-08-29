// Generated from D:/10/New/Prague/Parsing/IsaVODEtoCPP/IsaVODEtoCPP/src/main/grammar/IsaVODEtoCPP.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class IsaVODEtoCPPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ISABELLE_COMMENT_BLOCK=1, ANTI_OPEN=2, ANTI_CLOSE=3, THEORY=4, IMPORTS=5, 
		DATASPACE=6, CONSTANTS=7, ASSUMES=8, VARIABLES=9, ABBREVIATION=10, DEFINITION=11, 
		WHERE=12, AND=13, CONTEXT=14, BEGIN=15, END=16, ASSIGN=17, D_COLON=18, 
		COLON=19, ARROW=20, LPAREN=21, RPAREN=22, LBRACK=23, RBRACK=24, COMMA=25, 
		CARET=26, STAR=27, PLUS=28, MINUS=29, DOT=30, SLASH=31, ASCII_ID=32, SYMBOL_IDENT=33, 
		SUBSCRIPT=34, SUPERSCRIPT=35, NUMBER=36, QUOTED_TEXT=37, WS=38, COMMENT=39;
	public static final int
		RULE_program = 0, RULE_theoryBlock = 1, RULE_importsClause = 2, RULE_importName = 3, 
		RULE_dottedName = 4, RULE_theoryBody = 5, RULE_contextBlock = 6, RULE_contextBody = 7, 
		RULE_definitionDecl = 8, RULE_dataspaceDecl = 9, RULE_dataspaceBody = 10, 
		RULE_constantsClause = 11, RULE_constantDecl = 12, RULE_assumesClause = 13, 
		RULE_assumptionDecl = 14, RULE_variablesClause = 15, RULE_varDecl = 16, 
		RULE_abbrevDecl = 17, RULE_printSpec = 18, RULE_precedenceAnn = 19, RULE_innerPrec = 20, 
		RULE_mixfixForm = 21, RULE_antiquotBlock = 22, RULE_antiquotContent = 23, 
		RULE_antiquotUnit = 24, RULE_typeSpec = 25, RULE_typeAtom = 26, RULE_ident = 27, 
		RULE_idseg = 28, RULE_idsegOrNum = 29, RULE_numberList = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "theoryBlock", "importsClause", "importName", "dottedName", 
			"theoryBody", "contextBlock", "contextBody", "definitionDecl", "dataspaceDecl", 
			"dataspaceBody", "constantsClause", "constantDecl", "assumesClause", 
			"assumptionDecl", "variablesClause", "varDecl", "abbrevDecl", "printSpec", 
			"precedenceAnn", "innerPrec", "mixfixForm", "antiquotBlock", "antiquotContent", 
			"antiquotUnit", "typeSpec", "typeAtom", "ident", "idseg", "idsegOrNum", 
			"numberList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'theory'", "'imports'", "'dataspace'", "'constants'", 
			"'assumes'", "'variables'", "'abbreviation'", "'definition'", "'where'", 
			"'and'", "'context'", "'begin'", "'end'", "'='", "'::'", "':'", "'=>'", 
			"'('", "')'", "'['", "']'", "','", "'^'", "'*'", "'+'", "'-'", "'.'", 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ISABELLE_COMMENT_BLOCK", "ANTI_OPEN", "ANTI_CLOSE", "THEORY", 
			"IMPORTS", "DATASPACE", "CONSTANTS", "ASSUMES", "VARIABLES", "ABBREVIATION", 
			"DEFINITION", "WHERE", "AND", "CONTEXT", "BEGIN", "END", "ASSIGN", "D_COLON", 
			"COLON", "ARROW", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "COMMA", "CARET", 
			"STAR", "PLUS", "MINUS", "DOT", "SLASH", "ASCII_ID", "SYMBOL_IDENT", 
			"SUBSCRIPT", "SUPERSCRIPT", "NUMBER", "QUOTED_TEXT", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "IsaVODEtoCPP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IsaVODEtoCPPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(IsaVODEtoCPPParser.EOF, 0); }
		public List<TheoryBlockContext> theoryBlock() {
			return getRuleContexts(TheoryBlockContext.class);
		}
		public TheoryBlockContext theoryBlock(int i) {
			return getRuleContext(TheoryBlockContext.class,i);
		}
		public List<ContextBlockContext> contextBlock() {
			return getRuleContexts(ContextBlockContext.class);
		}
		public ContextBlockContext contextBlock(int i) {
			return getRuleContext(ContextBlockContext.class,i);
		}
		public List<DataspaceDeclContext> dataspaceDecl() {
			return getRuleContexts(DataspaceDeclContext.class);
		}
		public DataspaceDeclContext dataspaceDecl(int i) {
			return getRuleContext(DataspaceDeclContext.class,i);
		}
		public List<AbbrevDeclContext> abbrevDecl() {
			return getRuleContexts(AbbrevDeclContext.class);
		}
		public AbbrevDeclContext abbrevDecl(int i) {
			return getRuleContext(AbbrevDeclContext.class,i);
		}
		public List<DefinitionDeclContext> definitionDecl() {
			return getRuleContexts(DefinitionDeclContext.class);
		}
		public DefinitionDeclContext definitionDecl(int i) {
			return getRuleContext(DefinitionDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19536L) != 0)) {
				{
				setState(67);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case THEORY:
					{
					setState(62);
					theoryBlock();
					}
					break;
				case CONTEXT:
					{
					setState(63);
					contextBlock();
					}
					break;
				case DATASPACE:
					{
					setState(64);
					dataspaceDecl();
					}
					break;
				case ABBREVIATION:
					{
					setState(65);
					abbrevDecl();
					}
					break;
				case DEFINITION:
					{
					setState(66);
					definitionDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TheoryBlockContext extends ParserRuleContext {
		public TerminalNode THEORY() { return getToken(IsaVODEtoCPPParser.THEORY, 0); }
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(IsaVODEtoCPPParser.BEGIN, 0); }
		public TheoryBodyContext theoryBody() {
			return getRuleContext(TheoryBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(IsaVODEtoCPPParser.END, 0); }
		public ImportsClauseContext importsClause() {
			return getRuleContext(ImportsClauseContext.class,0);
		}
		public TheoryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theoryBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterTheoryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitTheoryBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitTheoryBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheoryBlockContext theoryBlock() throws RecognitionException {
		TheoryBlockContext _localctx = new TheoryBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_theoryBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(THEORY);
			setState(75);
			dottedName();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTS) {
				{
				setState(76);
				importsClause();
				}
			}

			setState(79);
			match(BEGIN);
			setState(80);
			theoryBody();
			setState(81);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsClauseContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(IsaVODEtoCPPParser.IMPORTS, 0); }
		public List<ImportNameContext> importName() {
			return getRuleContexts(ImportNameContext.class);
		}
		public ImportNameContext importName(int i) {
			return getRuleContext(ImportNameContext.class,i);
		}
		public ImportsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterImportsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitImportsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitImportsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsClauseContext importsClause() throws RecognitionException {
		ImportsClauseContext _localctx = new ImportsClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(IMPORTS);
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				importName();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ASCII_ID || _la==SYMBOL_IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportNameContext extends ParserRuleContext {
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public ImportNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterImportName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitImportName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitImportName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNameContext importName() throws RecognitionException {
		ImportNameContext _localctx = new ImportNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			dottedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DottedNameContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(IsaVODEtoCPPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(IsaVODEtoCPPParser.DOT, i);
		}
		public DottedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dottedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterDottedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitDottedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitDottedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DottedNameContext dottedName() throws RecognitionException {
		DottedNameContext _localctx = new DottedNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dottedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			ident();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(92);
				match(DOT);
				setState(93);
				ident();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TheoryBodyContext extends ParserRuleContext {
		public List<ContextBlockContext> contextBlock() {
			return getRuleContexts(ContextBlockContext.class);
		}
		public ContextBlockContext contextBlock(int i) {
			return getRuleContext(ContextBlockContext.class,i);
		}
		public List<DataspaceDeclContext> dataspaceDecl() {
			return getRuleContexts(DataspaceDeclContext.class);
		}
		public DataspaceDeclContext dataspaceDecl(int i) {
			return getRuleContext(DataspaceDeclContext.class,i);
		}
		public List<AbbrevDeclContext> abbrevDecl() {
			return getRuleContexts(AbbrevDeclContext.class);
		}
		public AbbrevDeclContext abbrevDecl(int i) {
			return getRuleContext(AbbrevDeclContext.class,i);
		}
		public List<DefinitionDeclContext> definitionDecl() {
			return getRuleContexts(DefinitionDeclContext.class);
		}
		public DefinitionDeclContext definitionDecl(int i) {
			return getRuleContext(DefinitionDeclContext.class,i);
		}
		public List<ConstantsClauseContext> constantsClause() {
			return getRuleContexts(ConstantsClauseContext.class);
		}
		public ConstantsClauseContext constantsClause(int i) {
			return getRuleContext(ConstantsClauseContext.class,i);
		}
		public List<AssumesClauseContext> assumesClause() {
			return getRuleContexts(AssumesClauseContext.class);
		}
		public AssumesClauseContext assumesClause(int i) {
			return getRuleContext(AssumesClauseContext.class,i);
		}
		public List<VariablesClauseContext> variablesClause() {
			return getRuleContexts(VariablesClauseContext.class);
		}
		public VariablesClauseContext variablesClause(int i) {
			return getRuleContext(VariablesClauseContext.class,i);
		}
		public TheoryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theoryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterTheoryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitTheoryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitTheoryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheoryBodyContext theoryBody() throws RecognitionException {
		TheoryBodyContext _localctx = new TheoryBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_theoryBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20416L) != 0)) {
				{
				setState(106);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTEXT:
					{
					setState(99);
					contextBlock();
					}
					break;
				case DATASPACE:
					{
					setState(100);
					dataspaceDecl();
					}
					break;
				case ABBREVIATION:
					{
					setState(101);
					abbrevDecl();
					}
					break;
				case DEFINITION:
					{
					setState(102);
					definitionDecl();
					}
					break;
				case CONSTANTS:
					{
					setState(103);
					constantsClause();
					}
					break;
				case ASSUMES:
					{
					setState(104);
					assumesClause();
					}
					break;
				case VARIABLES:
					{
					setState(105);
					variablesClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContextBlockContext extends ParserRuleContext {
		public TerminalNode CONTEXT() { return getToken(IsaVODEtoCPPParser.CONTEXT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(IsaVODEtoCPPParser.BEGIN, 0); }
		public ContextBodyContext contextBody() {
			return getRuleContext(ContextBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(IsaVODEtoCPPParser.END, 0); }
		public ContextBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterContextBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitContextBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitContextBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContextBlockContext contextBlock() throws RecognitionException {
		ContextBlockContext _localctx = new ContextBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_contextBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(CONTEXT);
			setState(112);
			ident();
			setState(113);
			match(BEGIN);
			setState(114);
			contextBody();
			setState(115);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContextBodyContext extends ParserRuleContext {
		public List<AbbrevDeclContext> abbrevDecl() {
			return getRuleContexts(AbbrevDeclContext.class);
		}
		public AbbrevDeclContext abbrevDecl(int i) {
			return getRuleContext(AbbrevDeclContext.class,i);
		}
		public List<DefinitionDeclContext> definitionDecl() {
			return getRuleContexts(DefinitionDeclContext.class);
		}
		public DefinitionDeclContext definitionDecl(int i) {
			return getRuleContext(DefinitionDeclContext.class,i);
		}
		public List<ConstantsClauseContext> constantsClause() {
			return getRuleContexts(ConstantsClauseContext.class);
		}
		public ConstantsClauseContext constantsClause(int i) {
			return getRuleContext(ConstantsClauseContext.class,i);
		}
		public List<AssumesClauseContext> assumesClause() {
			return getRuleContexts(AssumesClauseContext.class);
		}
		public AssumesClauseContext assumesClause(int i) {
			return getRuleContext(AssumesClauseContext.class,i);
		}
		public List<VariablesClauseContext> variablesClause() {
			return getRuleContexts(VariablesClauseContext.class);
		}
		public VariablesClauseContext variablesClause(int i) {
			return getRuleContext(VariablesClauseContext.class,i);
		}
		public ContextBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterContextBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitContextBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitContextBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContextBodyContext contextBody() throws RecognitionException {
		ContextBodyContext _localctx = new ContextBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_contextBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3968L) != 0)) {
				{
				setState(122);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ABBREVIATION:
					{
					setState(117);
					abbrevDecl();
					}
					break;
				case DEFINITION:
					{
					setState(118);
					definitionDecl();
					}
					break;
				case CONSTANTS:
					{
					setState(119);
					constantsClause();
					}
					break;
				case ASSUMES:
					{
					setState(120);
					assumesClause();
					}
					break;
				case VARIABLES:
					{
					setState(121);
					variablesClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionDeclContext extends ParserRuleContext {
		public TerminalNode DEFINITION() { return getToken(IsaVODEtoCPPParser.DEFINITION, 0); }
		public TerminalNode QUOTED_TEXT() { return getToken(IsaVODEtoCPPParser.QUOTED_TEXT, 0); }
		public DefinitionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterDefinitionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitDefinitionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitDefinitionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionDeclContext definitionDecl() throws RecognitionException {
		DefinitionDeclContext _localctx = new DefinitionDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_definitionDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(DEFINITION);
			setState(128);
			match(QUOTED_TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataspaceDeclContext extends ParserRuleContext {
		public TerminalNode DATASPACE() { return getToken(IsaVODEtoCPPParser.DATASPACE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(IsaVODEtoCPPParser.ASSIGN, 0); }
		public DataspaceBodyContext dataspaceBody() {
			return getRuleContext(DataspaceBodyContext.class,0);
		}
		public DataspaceDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataspaceDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterDataspaceDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitDataspaceDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitDataspaceDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataspaceDeclContext dataspaceDecl() throws RecognitionException {
		DataspaceDeclContext _localctx = new DataspaceDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dataspaceDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(DATASPACE);
			setState(131);
			ident();
			setState(132);
			match(ASSIGN);
			setState(133);
			dataspaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataspaceBodyContext extends ParserRuleContext {
		public List<ConstantsClauseContext> constantsClause() {
			return getRuleContexts(ConstantsClauseContext.class);
		}
		public ConstantsClauseContext constantsClause(int i) {
			return getRuleContext(ConstantsClauseContext.class,i);
		}
		public List<AssumesClauseContext> assumesClause() {
			return getRuleContexts(AssumesClauseContext.class);
		}
		public AssumesClauseContext assumesClause(int i) {
			return getRuleContext(AssumesClauseContext.class,i);
		}
		public List<VariablesClauseContext> variablesClause() {
			return getRuleContexts(VariablesClauseContext.class);
		}
		public VariablesClauseContext variablesClause(int i) {
			return getRuleContext(VariablesClauseContext.class,i);
		}
		public List<AbbrevDeclContext> abbrevDecl() {
			return getRuleContexts(AbbrevDeclContext.class);
		}
		public AbbrevDeclContext abbrevDecl(int i) {
			return getRuleContext(AbbrevDeclContext.class,i);
		}
		public List<DefinitionDeclContext> definitionDecl() {
			return getRuleContexts(DefinitionDeclContext.class);
		}
		public DefinitionDeclContext definitionDecl(int i) {
			return getRuleContext(DefinitionDeclContext.class,i);
		}
		public DataspaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataspaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterDataspaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitDataspaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitDataspaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataspaceBodyContext dataspaceBody() throws RecognitionException {
		DataspaceBodyContext _localctx = new DataspaceBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dataspaceBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(140);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CONSTANTS:
						{
						setState(135);
						constantsClause();
						}
						break;
					case ASSUMES:
						{
						setState(136);
						assumesClause();
						}
						break;
					case VARIABLES:
						{
						setState(137);
						variablesClause();
						}
						break;
					case ABBREVIATION:
						{
						setState(138);
						abbrevDecl();
						}
						break;
					case DEFINITION:
						{
						setState(139);
						definitionDecl();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantsClauseContext extends ParserRuleContext {
		public TerminalNode CONSTANTS() { return getToken(IsaVODEtoCPPParser.CONSTANTS, 0); }
		public List<ConstantDeclContext> constantDecl() {
			return getRuleContexts(ConstantDeclContext.class);
		}
		public ConstantDeclContext constantDecl(int i) {
			return getRuleContext(ConstantDeclContext.class,i);
		}
		public ConstantsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterConstantsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitConstantsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitConstantsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantsClauseContext constantsClause() throws RecognitionException {
		ConstantsClauseContext _localctx = new ConstantsClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constantsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(CONSTANTS);
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				constantDecl();
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ASCII_ID || _la==SYMBOL_IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantDeclContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode D_COLON() { return getToken(IsaVODEtoCPPParser.D_COLON, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public ConstantDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterConstantDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitConstantDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitConstantDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclContext constantDecl() throws RecognitionException {
		ConstantDeclContext _localctx = new ConstantDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constantDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			ident();
			setState(152);
			match(D_COLON);
			setState(153);
			typeSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssumesClauseContext extends ParserRuleContext {
		public TerminalNode ASSUMES() { return getToken(IsaVODEtoCPPParser.ASSUMES, 0); }
		public List<AssumptionDeclContext> assumptionDecl() {
			return getRuleContexts(AssumptionDeclContext.class);
		}
		public AssumptionDeclContext assumptionDecl(int i) {
			return getRuleContext(AssumptionDeclContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(IsaVODEtoCPPParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(IsaVODEtoCPPParser.AND, i);
		}
		public AssumesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assumesClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterAssumesClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitAssumesClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitAssumesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssumesClauseContext assumesClause() throws RecognitionException {
		AssumesClauseContext _localctx = new AssumesClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assumesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ASSUMES);
			setState(156);
			assumptionDecl();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(157);
				match(AND);
				setState(158);
				assumptionDecl();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssumptionDeclContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode COLON() { return getToken(IsaVODEtoCPPParser.COLON, 0); }
		public List<TerminalNode> QUOTED_TEXT() { return getTokens(IsaVODEtoCPPParser.QUOTED_TEXT); }
		public TerminalNode QUOTED_TEXT(int i) {
			return getToken(IsaVODEtoCPPParser.QUOTED_TEXT, i);
		}
		public AssumptionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assumptionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterAssumptionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitAssumptionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitAssumptionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssumptionDeclContext assumptionDecl() throws RecognitionException {
		AssumptionDeclContext _localctx = new AssumptionDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assumptionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			ident();
			setState(165);
			match(COLON);
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
				match(QUOTED_TEXT);
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==QUOTED_TEXT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesClauseContext extends ParserRuleContext {
		public TerminalNode VARIABLES() { return getToken(IsaVODEtoCPPParser.VARIABLES, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public VariablesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablesClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterVariablesClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitVariablesClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitVariablesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesClauseContext variablesClause() throws RecognitionException {
		VariablesClauseContext _localctx = new VariablesClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variablesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(VARIABLES);
			setState(173); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(172);
				varDecl();
				}
				}
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ASCII_ID || _la==SYMBOL_IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode D_COLON() { return getToken(IsaVODEtoCPPParser.D_COLON, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			ident();
			setState(178);
			match(D_COLON);
			setState(179);
			typeSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AbbrevDeclContext extends ParserRuleContext {
		public TerminalNode ABBREVIATION() { return getToken(IsaVODEtoCPPParser.ABBREVIATION, 0); }
		public List<TerminalNode> QUOTED_TEXT() { return getTokens(IsaVODEtoCPPParser.QUOTED_TEXT); }
		public TerminalNode QUOTED_TEXT(int i) {
			return getToken(IsaVODEtoCPPParser.QUOTED_TEXT, i);
		}
		public TerminalNode DOT() { return getToken(IsaVODEtoCPPParser.DOT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(IsaVODEtoCPPParser.WHERE, 0); }
		public TerminalNode LPAREN() { return getToken(IsaVODEtoCPPParser.LPAREN, 0); }
		public TerminalNode ASCII_ID() { return getToken(IsaVODEtoCPPParser.ASCII_ID, 0); }
		public TerminalNode RPAREN() { return getToken(IsaVODEtoCPPParser.RPAREN, 0); }
		public TerminalNode D_COLON() { return getToken(IsaVODEtoCPPParser.D_COLON, 0); }
		public PrintSpecContext printSpec() {
			return getRuleContext(PrintSpecContext.class,0);
		}
		public PrecedenceAnnContext precedenceAnn() {
			return getRuleContext(PrecedenceAnnContext.class,0);
		}
		public AbbrevDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abbrevDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterAbbrevDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitAbbrevDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitAbbrevDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbbrevDeclContext abbrevDecl() throws RecognitionException {
		AbbrevDeclContext _localctx = new AbbrevDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_abbrevDecl);
		int _la;
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(ABBREVIATION);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(182);
					match(DOT);
					}
				}

				setState(185);
				match(QUOTED_TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(ABBREVIATION);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(187);
					match(LPAREN);
					setState(188);
					match(ASCII_ID);
					setState(189);
					match(RPAREN);
					}
				}

				setState(192);
				ident();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==D_COLON) {
					{
					setState(193);
					match(D_COLON);
					setState(194);
					match(QUOTED_TEXT);
					}
				}

				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(197);
					printSpec();
					}
				}

				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK || _la==NUMBER) {
					{
					setState(200);
					precedenceAnn();
					}
				}

				setState(203);
				match(WHERE);
				setState(204);
				match(QUOTED_TEXT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintSpecContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(IsaVODEtoCPPParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(IsaVODEtoCPPParser.RPAREN, 0); }
		public TerminalNode QUOTED_TEXT() { return getToken(IsaVODEtoCPPParser.QUOTED_TEXT, 0); }
		public MixfixFormContext mixfixForm() {
			return getRuleContext(MixfixFormContext.class,0);
		}
		public AntiquotBlockContext antiquotBlock() {
			return getRuleContext(AntiquotBlockContext.class,0);
		}
		public InnerPrecContext innerPrec() {
			return getRuleContext(InnerPrecContext.class,0);
		}
		public PrintSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterPrintSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitPrintSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitPrintSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintSpecContext printSpec() throws RecognitionException {
		PrintSpecContext _localctx = new PrintSpecContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_printSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(LPAREN);
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				{
				setState(209);
				match(QUOTED_TEXT);
				}
				break;
			case ASCII_ID:
				{
				setState(210);
				mixfixForm();
				}
				break;
			case ANTI_OPEN:
				{
				setState(211);
				antiquotBlock();
				}
				break;
			case RPAREN:
			case LBRACK:
				break;
			default:
				break;
			}
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(214);
				innerPrec();
				}
			}

			setState(217);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrecedenceAnnContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(IsaVODEtoCPPParser.LBRACK, 0); }
		public NumberListContext numberList() {
			return getRuleContext(NumberListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(IsaVODEtoCPPParser.RBRACK, 0); }
		public TerminalNode NUMBER() { return getToken(IsaVODEtoCPPParser.NUMBER, 0); }
		public PrecedenceAnnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceAnn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterPrecedenceAnn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitPrecedenceAnn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitPrecedenceAnn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrecedenceAnnContext precedenceAnn() throws RecognitionException {
		PrecedenceAnnContext _localctx = new PrecedenceAnnContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_precedenceAnn);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(219);
				match(LBRACK);
				setState(220);
				numberList();
				setState(221);
				match(RBRACK);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(222);
					match(NUMBER);
					}
				}

				}
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InnerPrecContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(IsaVODEtoCPPParser.LBRACK, 0); }
		public NumberListContext numberList() {
			return getRuleContext(NumberListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(IsaVODEtoCPPParser.RBRACK, 0); }
		public TerminalNode NUMBER() { return getToken(IsaVODEtoCPPParser.NUMBER, 0); }
		public InnerPrecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerPrec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterInnerPrec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitInnerPrec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitInnerPrec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerPrecContext innerPrec() throws RecognitionException {
		InnerPrecContext _localctx = new InnerPrecContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_innerPrec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(LBRACK);
			setState(229);
			numberList();
			setState(230);
			match(RBRACK);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(231);
				match(NUMBER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MixfixFormContext extends ParserRuleContext {
		public TerminalNode ASCII_ID() { return getToken(IsaVODEtoCPPParser.ASCII_ID, 0); }
		public TerminalNode QUOTED_TEXT() { return getToken(IsaVODEtoCPPParser.QUOTED_TEXT, 0); }
		public TerminalNode NUMBER() { return getToken(IsaVODEtoCPPParser.NUMBER, 0); }
		public MixfixFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixfixForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterMixfixForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitMixfixForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitMixfixForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixfixFormContext mixfixForm() throws RecognitionException {
		MixfixFormContext _localctx = new MixfixFormContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mixfixForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(ASCII_ID);
			setState(235);
			match(QUOTED_TEXT);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(236);
				match(NUMBER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AntiquotBlockContext extends ParserRuleContext {
		public TerminalNode ANTI_OPEN() { return getToken(IsaVODEtoCPPParser.ANTI_OPEN, 0); }
		public AntiquotContentContext antiquotContent() {
			return getRuleContext(AntiquotContentContext.class,0);
		}
		public TerminalNode ANTI_CLOSE() { return getToken(IsaVODEtoCPPParser.ANTI_CLOSE, 0); }
		public AntiquotBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_antiquotBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterAntiquotBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitAntiquotBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitAntiquotBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AntiquotBlockContext antiquotBlock() throws RecognitionException {
		AntiquotBlockContext _localctx = new AntiquotBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_antiquotBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(ANTI_OPEN);
			setState(240);
			antiquotContent();
			setState(241);
			match(ANTI_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AntiquotContentContext extends ParserRuleContext {
		public List<AntiquotUnitContext> antiquotUnit() {
			return getRuleContexts(AntiquotUnitContext.class);
		}
		public AntiquotUnitContext antiquotUnit(int i) {
			return getRuleContext(AntiquotUnitContext.class,i);
		}
		public AntiquotContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_antiquotContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterAntiquotContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitAntiquotContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitAntiquotContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AntiquotContentContext antiquotContent() throws RecognitionException {
		AntiquotContentContext _localctx = new AntiquotContentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_antiquotContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698037748L) != 0)) {
				{
				{
				setState(243);
				antiquotUnit();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AntiquotUnitContext extends ParserRuleContext {
		public AntiquotBlockContext antiquotBlock() {
			return getRuleContext(AntiquotBlockContext.class,0);
		}
		public TerminalNode QUOTED_TEXT() { return getToken(IsaVODEtoCPPParser.QUOTED_TEXT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(IsaVODEtoCPPParser.NUMBER, 0); }
		public TerminalNode SUPERSCRIPT() { return getToken(IsaVODEtoCPPParser.SUPERSCRIPT, 0); }
		public TerminalNode ARROW() { return getToken(IsaVODEtoCPPParser.ARROW, 0); }
		public TerminalNode LPAREN() { return getToken(IsaVODEtoCPPParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(IsaVODEtoCPPParser.RPAREN, 0); }
		public TerminalNode LBRACK() { return getToken(IsaVODEtoCPPParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(IsaVODEtoCPPParser.RBRACK, 0); }
		public TerminalNode COMMA() { return getToken(IsaVODEtoCPPParser.COMMA, 0); }
		public TerminalNode CARET() { return getToken(IsaVODEtoCPPParser.CARET, 0); }
		public TerminalNode STAR() { return getToken(IsaVODEtoCPPParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(IsaVODEtoCPPParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(IsaVODEtoCPPParser.MINUS, 0); }
		public TerminalNode DOT() { return getToken(IsaVODEtoCPPParser.DOT, 0); }
		public TerminalNode SLASH() { return getToken(IsaVODEtoCPPParser.SLASH, 0); }
		public TerminalNode ASSIGN() { return getToken(IsaVODEtoCPPParser.ASSIGN, 0); }
		public TerminalNode COLON() { return getToken(IsaVODEtoCPPParser.COLON, 0); }
		public TerminalNode D_COLON() { return getToken(IsaVODEtoCPPParser.D_COLON, 0); }
		public TerminalNode DATASPACE() { return getToken(IsaVODEtoCPPParser.DATASPACE, 0); }
		public TerminalNode CONSTANTS() { return getToken(IsaVODEtoCPPParser.CONSTANTS, 0); }
		public TerminalNode ASSUMES() { return getToken(IsaVODEtoCPPParser.ASSUMES, 0); }
		public TerminalNode VARIABLES() { return getToken(IsaVODEtoCPPParser.VARIABLES, 0); }
		public TerminalNode ABBREVIATION() { return getToken(IsaVODEtoCPPParser.ABBREVIATION, 0); }
		public TerminalNode WHERE() { return getToken(IsaVODEtoCPPParser.WHERE, 0); }
		public TerminalNode AND() { return getToken(IsaVODEtoCPPParser.AND, 0); }
		public TerminalNode CONTEXT() { return getToken(IsaVODEtoCPPParser.CONTEXT, 0); }
		public TerminalNode BEGIN() { return getToken(IsaVODEtoCPPParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(IsaVODEtoCPPParser.END, 0); }
		public TerminalNode DEFINITION() { return getToken(IsaVODEtoCPPParser.DEFINITION, 0); }
		public TerminalNode THEORY() { return getToken(IsaVODEtoCPPParser.THEORY, 0); }
		public TerminalNode IMPORTS() { return getToken(IsaVODEtoCPPParser.IMPORTS, 0); }
		public AntiquotUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_antiquotUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterAntiquotUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitAntiquotUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitAntiquotUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AntiquotUnitContext antiquotUnit() throws RecognitionException {
		AntiquotUnitContext _localctx = new AntiquotUnitContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_antiquotUnit);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				antiquotBlock();
				}
				break;
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(QUOTED_TEXT);
				}
				break;
			case ASCII_ID:
			case SYMBOL_IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				ident();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				match(NUMBER);
				}
				break;
			case SUPERSCRIPT:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				match(SUPERSCRIPT);
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				match(ARROW);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(255);
				match(LPAREN);
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 8);
				{
				setState(256);
				match(RPAREN);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 9);
				{
				setState(257);
				match(LBRACK);
				}
				break;
			case RBRACK:
				enterOuterAlt(_localctx, 10);
				{
				setState(258);
				match(RBRACK);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 11);
				{
				setState(259);
				match(COMMA);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 12);
				{
				setState(260);
				match(CARET);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 13);
				{
				setState(261);
				match(STAR);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 14);
				{
				setState(262);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 15);
				{
				setState(263);
				match(MINUS);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 16);
				{
				setState(264);
				match(DOT);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 17);
				{
				setState(265);
				match(SLASH);
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 18);
				{
				setState(266);
				match(ASSIGN);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 19);
				{
				setState(267);
				match(COLON);
				}
				break;
			case D_COLON:
				enterOuterAlt(_localctx, 20);
				{
				setState(268);
				match(D_COLON);
				}
				break;
			case DATASPACE:
				enterOuterAlt(_localctx, 21);
				{
				setState(269);
				match(DATASPACE);
				}
				break;
			case CONSTANTS:
				enterOuterAlt(_localctx, 22);
				{
				setState(270);
				match(CONSTANTS);
				}
				break;
			case ASSUMES:
				enterOuterAlt(_localctx, 23);
				{
				setState(271);
				match(ASSUMES);
				}
				break;
			case VARIABLES:
				enterOuterAlt(_localctx, 24);
				{
				setState(272);
				match(VARIABLES);
				}
				break;
			case ABBREVIATION:
				enterOuterAlt(_localctx, 25);
				{
				setState(273);
				match(ABBREVIATION);
				}
				break;
			case WHERE:
				enterOuterAlt(_localctx, 26);
				{
				setState(274);
				match(WHERE);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 27);
				{
				setState(275);
				match(AND);
				}
				break;
			case CONTEXT:
				enterOuterAlt(_localctx, 28);
				{
				setState(276);
				match(CONTEXT);
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 29);
				{
				setState(277);
				match(BEGIN);
				}
				break;
			case END:
				enterOuterAlt(_localctx, 30);
				{
				setState(278);
				match(END);
				}
				break;
			case DEFINITION:
				enterOuterAlt(_localctx, 31);
				{
				setState(279);
				match(DEFINITION);
				}
				break;
			case THEORY:
				enterOuterAlt(_localctx, 32);
				{
				setState(280);
				match(THEORY);
				}
				break;
			case IMPORTS:
				enterOuterAlt(_localctx, 33);
				{
				setState(281);
				match(IMPORTS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecContext extends ParserRuleContext {
		public TerminalNode QUOTED_TEXT() { return getToken(IsaVODEtoCPPParser.QUOTED_TEXT, 0); }
		public List<TypeAtomContext> typeAtom() {
			return getRuleContexts(TypeAtomContext.class);
		}
		public TypeAtomContext typeAtom(int i) {
			return getRuleContext(TypeAtomContext.class,i);
		}
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitTypeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeSpec);
		try {
			int _alt;
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(QUOTED_TEXT);
				}
				break;
			case ARROW:
			case LPAREN:
			case RPAREN:
			case LBRACK:
			case RBRACK:
			case COMMA:
			case CARET:
			case STAR:
			case PLUS:
			case MINUS:
			case DOT:
			case SLASH:
			case ASCII_ID:
			case SYMBOL_IDENT:
			case SUPERSCRIPT:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(286); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(285);
						typeAtom();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(288); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAtomContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(IsaVODEtoCPPParser.NUMBER, 0); }
		public TerminalNode SUPERSCRIPT() { return getToken(IsaVODEtoCPPParser.SUPERSCRIPT, 0); }
		public TerminalNode ARROW() { return getToken(IsaVODEtoCPPParser.ARROW, 0); }
		public TerminalNode LPAREN() { return getToken(IsaVODEtoCPPParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(IsaVODEtoCPPParser.RPAREN, 0); }
		public TerminalNode LBRACK() { return getToken(IsaVODEtoCPPParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(IsaVODEtoCPPParser.RBRACK, 0); }
		public TerminalNode COMMA() { return getToken(IsaVODEtoCPPParser.COMMA, 0); }
		public TerminalNode CARET() { return getToken(IsaVODEtoCPPParser.CARET, 0); }
		public TerminalNode STAR() { return getToken(IsaVODEtoCPPParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(IsaVODEtoCPPParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(IsaVODEtoCPPParser.MINUS, 0); }
		public TerminalNode DOT() { return getToken(IsaVODEtoCPPParser.DOT, 0); }
		public TerminalNode SLASH() { return getToken(IsaVODEtoCPPParser.SLASH, 0); }
		public TypeAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterTypeAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitTypeAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitTypeAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAtomContext typeAtom() throws RecognitionException {
		TypeAtomContext _localctx = new TypeAtomContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeAtom);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII_ID:
			case SYMBOL_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				ident();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(NUMBER);
				}
				break;
			case SUPERSCRIPT:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(SUPERSCRIPT);
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				match(ARROW);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				match(LPAREN);
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(297);
				match(RPAREN);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 7);
				{
				setState(298);
				match(LBRACK);
				}
				break;
			case RBRACK:
				enterOuterAlt(_localctx, 8);
				{
				setState(299);
				match(RBRACK);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 9);
				{
				setState(300);
				match(COMMA);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 10);
				{
				setState(301);
				match(CARET);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(302);
				match(STAR);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 12);
				{
				setState(303);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 13);
				{
				setState(304);
				match(MINUS);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 14);
				{
				setState(305);
				match(DOT);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 15);
				{
				setState(306);
				match(SLASH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentContext extends ParserRuleContext {
		public IdsegContext idseg() {
			return getRuleContext(IdsegContext.class,0);
		}
		public List<TerminalNode> SUBSCRIPT() { return getTokens(IsaVODEtoCPPParser.SUBSCRIPT); }
		public TerminalNode SUBSCRIPT(int i) {
			return getToken(IsaVODEtoCPPParser.SUBSCRIPT, i);
		}
		public List<IdsegOrNumContext> idsegOrNum() {
			return getRuleContexts(IdsegOrNumContext.class);
		}
		public IdsegOrNumContext idsegOrNum(int i) {
			return getRuleContext(IdsegOrNumContext.class,i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			idseg();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUBSCRIPT) {
				{
				{
				setState(310);
				match(SUBSCRIPT);
				setState(311);
				idsegOrNum();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdsegContext extends ParserRuleContext {
		public TerminalNode ASCII_ID() { return getToken(IsaVODEtoCPPParser.ASCII_ID, 0); }
		public TerminalNode SYMBOL_IDENT() { return getToken(IsaVODEtoCPPParser.SYMBOL_IDENT, 0); }
		public IdsegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idseg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterIdseg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitIdseg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitIdseg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsegContext idseg() throws RecognitionException {
		IdsegContext _localctx = new IdsegContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_idseg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ( !(_la==ASCII_ID || _la==SYMBOL_IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdsegOrNumContext extends ParserRuleContext {
		public IdsegContext idseg() {
			return getRuleContext(IdsegContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(IsaVODEtoCPPParser.NUMBER, 0); }
		public IdsegOrNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idsegOrNum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterIdsegOrNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitIdsegOrNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitIdsegOrNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsegOrNumContext idsegOrNum() throws RecognitionException {
		IdsegOrNumContext _localctx = new IdsegOrNumContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_idsegOrNum);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII_ID:
			case SYMBOL_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				idseg();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberListContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(IsaVODEtoCPPParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(IsaVODEtoCPPParser.NUMBER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IsaVODEtoCPPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IsaVODEtoCPPParser.COMMA, i);
		}
		public NumberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterNumberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitNumberList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitNumberList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberListContext numberList() throws RecognitionException {
		NumberListContext _localctx = new NumberListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_numberList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(NUMBER);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(324);
				match(COMMA);
				setState(325);
				match(NUMBER);
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u014c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"D\b\u0000\n\u0000\f\u0000G\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001N\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0004\u0002V\b\u0002"+
		"\u000b\u0002\f\u0002W\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004_\b\u0004\n\u0004\f\u0004b\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005k\b\u0005\n\u0005\f\u0005n\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007{\b\u0007\n\u0007\f\u0007"+
		"~\t\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u008d\b\n\n\n\f\n\u0090"+
		"\t\n\u0001\u000b\u0001\u000b\u0004\u000b\u0094\b\u000b\u000b\u000b\f\u000b"+
		"\u0095\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0005\r\u00a0\b\r\n\r\f\r\u00a3\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0004\u000e\u00a8\b\u000e\u000b\u000e\f\u000e\u00a9\u0001\u000f\u0001"+
		"\u000f\u0004\u000f\u00ae\b\u000f\u000b\u000f\f\u000f\u00af\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00b8\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00bf\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00c4\b\u0011\u0001\u0011\u0003\u0011\u00c7\b\u0011\u0001\u0011\u0003"+
		"\u0011\u00ca\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00cf"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00d5"+
		"\b\u0012\u0001\u0012\u0003\u0012\u00d8\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00e0\b\u0013"+
		"\u0001\u0013\u0003\u0013\u00e3\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u00e9\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u00ee\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0005\u0017\u00f5\b\u0017\n\u0017\f\u0017\u00f8\t\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u011b\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0004\u0019\u011f\b\u0019\u000b\u0019\f\u0019\u0120\u0003\u0019"+
		"\u0123\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0134\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0139\b\u001b\n\u001b"+
		"\f\u001b\u013c\t\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u0142\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u0147\b\u001e\n\u001e\f\u001e\u014a\t\u001e\u0001\u001e\u0000\u0000\u001f"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<\u0000\u0001\u0001\u0000 !\u018b\u0000E\u0001"+
		"\u0000\u0000\u0000\u0002J\u0001\u0000\u0000\u0000\u0004S\u0001\u0000\u0000"+
		"\u0000\u0006Y\u0001\u0000\u0000\u0000\b[\u0001\u0000\u0000\u0000\nl\u0001"+
		"\u0000\u0000\u0000\fo\u0001\u0000\u0000\u0000\u000e|\u0001\u0000\u0000"+
		"\u0000\u0010\u007f\u0001\u0000\u0000\u0000\u0012\u0082\u0001\u0000\u0000"+
		"\u0000\u0014\u008e\u0001\u0000\u0000\u0000\u0016\u0091\u0001\u0000\u0000"+
		"\u0000\u0018\u0097\u0001\u0000\u0000\u0000\u001a\u009b\u0001\u0000\u0000"+
		"\u0000\u001c\u00a4\u0001\u0000\u0000\u0000\u001e\u00ab\u0001\u0000\u0000"+
		"\u0000 \u00b1\u0001\u0000\u0000\u0000\"\u00ce\u0001\u0000\u0000\u0000"+
		"$\u00d0\u0001\u0000\u0000\u0000&\u00e2\u0001\u0000\u0000\u0000(\u00e4"+
		"\u0001\u0000\u0000\u0000*\u00ea\u0001\u0000\u0000\u0000,\u00ef\u0001\u0000"+
		"\u0000\u0000.\u00f6\u0001\u0000\u0000\u00000\u011a\u0001\u0000\u0000\u0000"+
		"2\u0122\u0001\u0000\u0000\u00004\u0133\u0001\u0000\u0000\u00006\u0135"+
		"\u0001\u0000\u0000\u00008\u013d\u0001\u0000\u0000\u0000:\u0141\u0001\u0000"+
		"\u0000\u0000<\u0143\u0001\u0000\u0000\u0000>D\u0003\u0002\u0001\u0000"+
		"?D\u0003\f\u0006\u0000@D\u0003\u0012\t\u0000AD\u0003\"\u0011\u0000BD\u0003"+
		"\u0010\b\u0000C>\u0001\u0000\u0000\u0000C?\u0001\u0000\u0000\u0000C@\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000"+
		"DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u0000"+
		"\u0000\u0001I\u0001\u0001\u0000\u0000\u0000JK\u0005\u0004\u0000\u0000"+
		"KM\u0003\b\u0004\u0000LN\u0003\u0004\u0002\u0000ML\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0005\u000f\u0000"+
		"\u0000PQ\u0003\n\u0005\u0000QR\u0005\u0010\u0000\u0000R\u0003\u0001\u0000"+
		"\u0000\u0000SU\u0005\u0005\u0000\u0000TV\u0003\u0006\u0003\u0000UT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000X\u0005\u0001\u0000\u0000\u0000YZ\u0003\b\u0004"+
		"\u0000Z\u0007\u0001\u0000\u0000\u0000[`\u00036\u001b\u0000\\]\u0005\u001e"+
		"\u0000\u0000]_\u00036\u001b\u0000^\\\u0001\u0000\u0000\u0000_b\u0001\u0000"+
		"\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\t\u0001"+
		"\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ck\u0003\f\u0006\u0000dk\u0003"+
		"\u0012\t\u0000ek\u0003\"\u0011\u0000fk\u0003\u0010\b\u0000gk\u0003\u0016"+
		"\u000b\u0000hk\u0003\u001a\r\u0000ik\u0003\u001e\u000f\u0000jc\u0001\u0000"+
		"\u0000\u0000jd\u0001\u0000\u0000\u0000je\u0001\u0000\u0000\u0000jf\u0001"+
		"\u0000\u0000\u0000jg\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000m\u000b\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000op\u0005\u000e\u0000\u0000pq\u00036\u001b\u0000qr\u0005"+
		"\u000f\u0000\u0000rs\u0003\u000e\u0007\u0000st\u0005\u0010\u0000\u0000"+
		"t\r\u0001\u0000\u0000\u0000u{\u0003\"\u0011\u0000v{\u0003\u0010\b\u0000"+
		"w{\u0003\u0016\u000b\u0000x{\u0003\u001a\r\u0000y{\u0003\u001e\u000f\u0000"+
		"zu\u0001\u0000\u0000\u0000zv\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u000f"+
		"\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u000b"+
		"\u0000\u0000\u0080\u0081\u0005%\u0000\u0000\u0081\u0011\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005\u0006\u0000\u0000\u0083\u0084\u00036\u001b\u0000"+
		"\u0084\u0085\u0005\u0011\u0000\u0000\u0085\u0086\u0003\u0014\n\u0000\u0086"+
		"\u0013\u0001\u0000\u0000\u0000\u0087\u008d\u0003\u0016\u000b\u0000\u0088"+
		"\u008d\u0003\u001a\r\u0000\u0089\u008d\u0003\u001e\u000f\u0000\u008a\u008d"+
		"\u0003\"\u0011\u0000\u008b\u008d\u0003\u0010\b\u0000\u008c\u0087\u0001"+
		"\u0000\u0000\u0000\u008c\u0088\u0001\u0000\u0000\u0000\u008c\u0089\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0015\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0093\u0005"+
		"\u0007\u0000\u0000\u0092\u0094\u0003\u0018\f\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0017\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u00036\u001b\u0000\u0098\u0099\u0005\u0012\u0000"+
		"\u0000\u0099\u009a\u00032\u0019\u0000\u009a\u0019\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0005\b\u0000\u0000\u009c\u00a1\u0003\u001c\u000e\u0000\u009d"+
		"\u009e\u0005\r\u0000\u0000\u009e\u00a0\u0003\u001c\u000e\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u001b"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u00036\u001b\u0000\u00a5\u00a7\u0005\u0013\u0000\u0000\u00a6\u00a8\u0005"+
		"%\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u001d\u0001\u0000\u0000\u0000\u00ab\u00ad\u0005\t\u0000"+
		"\u0000\u00ac\u00ae\u0003 \u0010\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u001f\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u00036\u001b\u0000\u00b2\u00b3\u0005\u0012\u0000\u0000\u00b3"+
		"\u00b4\u00032\u0019\u0000\u00b4!\u0001\u0000\u0000\u0000\u00b5\u00b7\u0005"+
		"\n\u0000\u0000\u00b6\u00b8\u0005\u001e\u0000\u0000\u00b7\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\u00cf\u0005%\u0000\u0000\u00ba\u00be\u0005\n\u0000"+
		"\u0000\u00bb\u00bc\u0005\u0015\u0000\u0000\u00bc\u00bd\u0005 \u0000\u0000"+
		"\u00bd\u00bf\u0005\u0016\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c3\u00036\u001b\u0000\u00c1\u00c2\u0005\u0012\u0000\u0000\u00c2"+
		"\u00c4\u0005%\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c7"+
		"\u0003$\u0012\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00ca\u0003"+
		"&\u0013\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\f\u0000"+
		"\u0000\u00cc\u00cd\u0005%\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000"+
		"\u00ce\u00b5\u0001\u0000\u0000\u0000\u00ce\u00ba\u0001\u0000\u0000\u0000"+
		"\u00cf#\u0001\u0000\u0000\u0000\u00d0\u00d4\u0005\u0015\u0000\u0000\u00d1"+
		"\u00d5\u0005%\u0000\u0000\u00d2\u00d5\u0003*\u0015\u0000\u00d3\u00d5\u0003"+
		",\u0016\u0000\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00d8\u0003(\u0014"+
		"\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u0016\u0000"+
		"\u0000\u00da%\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u0017\u0000\u0000"+
		"\u00dc\u00dd\u0003<\u001e\u0000\u00dd\u00df\u0005\u0018\u0000\u0000\u00de"+
		"\u00e0\u0005$\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00e3"+
		"\u0005$\u0000\u0000\u00e2\u00db\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e3\'\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u0017"+
		"\u0000\u0000\u00e5\u00e6\u0003<\u001e\u0000\u00e6\u00e8\u0005\u0018\u0000"+
		"\u0000\u00e7\u00e9\u0005$\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9)\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0005 \u0000\u0000\u00eb\u00ed\u0005%\u0000\u0000\u00ec\u00ee\u0005"+
		"$\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee+\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u0002\u0000"+
		"\u0000\u00f0\u00f1\u0003.\u0017\u0000\u00f1\u00f2\u0005\u0003\u0000\u0000"+
		"\u00f2-\u0001\u0000\u0000\u0000\u00f3\u00f5\u00030\u0018\u0000\u00f4\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7/\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u011b\u0003"+
		",\u0016\u0000\u00fa\u011b\u0005%\u0000\u0000\u00fb\u011b\u00036\u001b"+
		"\u0000\u00fc\u011b\u0005$\u0000\u0000\u00fd\u011b\u0005#\u0000\u0000\u00fe"+
		"\u011b\u0005\u0014\u0000\u0000\u00ff\u011b\u0005\u0015\u0000\u0000\u0100"+
		"\u011b\u0005\u0016\u0000\u0000\u0101\u011b\u0005\u0017\u0000\u0000\u0102"+
		"\u011b\u0005\u0018\u0000\u0000\u0103\u011b\u0005\u0019\u0000\u0000\u0104"+
		"\u011b\u0005\u001a\u0000\u0000\u0105\u011b\u0005\u001b\u0000\u0000\u0106"+
		"\u011b\u0005\u001c\u0000\u0000\u0107\u011b\u0005\u001d\u0000\u0000\u0108"+
		"\u011b\u0005\u001e\u0000\u0000\u0109\u011b\u0005\u001f\u0000\u0000\u010a"+
		"\u011b\u0005\u0011\u0000\u0000\u010b\u011b\u0005\u0013\u0000\u0000\u010c"+
		"\u011b\u0005\u0012\u0000\u0000\u010d\u011b\u0005\u0006\u0000\u0000\u010e"+
		"\u011b\u0005\u0007\u0000\u0000\u010f\u011b\u0005\b\u0000\u0000\u0110\u011b"+
		"\u0005\t\u0000\u0000\u0111\u011b\u0005\n\u0000\u0000\u0112\u011b\u0005"+
		"\f\u0000\u0000\u0113\u011b\u0005\r\u0000\u0000\u0114\u011b\u0005\u000e"+
		"\u0000\u0000\u0115\u011b\u0005\u000f\u0000\u0000\u0116\u011b\u0005\u0010"+
		"\u0000\u0000\u0117\u011b\u0005\u000b\u0000\u0000\u0118\u011b\u0005\u0004"+
		"\u0000\u0000\u0119\u011b\u0005\u0005\u0000\u0000\u011a\u00f9\u0001\u0000"+
		"\u0000\u0000\u011a\u00fa\u0001\u0000\u0000\u0000\u011a\u00fb\u0001\u0000"+
		"\u0000\u0000\u011a\u00fc\u0001\u0000\u0000\u0000\u011a\u00fd\u0001\u0000"+
		"\u0000\u0000\u011a\u00fe\u0001\u0000\u0000\u0000\u011a\u00ff\u0001\u0000"+
		"\u0000\u0000\u011a\u0100\u0001\u0000\u0000\u0000\u011a\u0101\u0001\u0000"+
		"\u0000\u0000\u011a\u0102\u0001\u0000\u0000\u0000\u011a\u0103\u0001\u0000"+
		"\u0000\u0000\u011a\u0104\u0001\u0000\u0000\u0000\u011a\u0105\u0001\u0000"+
		"\u0000\u0000\u011a\u0106\u0001\u0000\u0000\u0000\u011a\u0107\u0001\u0000"+
		"\u0000\u0000\u011a\u0108\u0001\u0000\u0000\u0000\u011a\u0109\u0001\u0000"+
		"\u0000\u0000\u011a\u010a\u0001\u0000\u0000\u0000\u011a\u010b\u0001\u0000"+
		"\u0000\u0000\u011a\u010c\u0001\u0000\u0000\u0000\u011a\u010d\u0001\u0000"+
		"\u0000\u0000\u011a\u010e\u0001\u0000\u0000\u0000\u011a\u010f\u0001\u0000"+
		"\u0000\u0000\u011a\u0110\u0001\u0000\u0000\u0000\u011a\u0111\u0001\u0000"+
		"\u0000\u0000\u011a\u0112\u0001\u0000\u0000\u0000\u011a\u0113\u0001\u0000"+
		"\u0000\u0000\u011a\u0114\u0001\u0000\u0000\u0000\u011a\u0115\u0001\u0000"+
		"\u0000\u0000\u011a\u0116\u0001\u0000\u0000\u0000\u011a\u0117\u0001\u0000"+
		"\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u0119\u0001\u0000"+
		"\u0000\u0000\u011b1\u0001\u0000\u0000\u0000\u011c\u0123\u0005%\u0000\u0000"+
		"\u011d\u011f\u00034\u001a\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\u0001\u0000\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122"+
		"\u011c\u0001\u0000\u0000\u0000\u0122\u011e\u0001\u0000\u0000\u0000\u0123"+
		"3\u0001\u0000\u0000\u0000\u0124\u0134\u00036\u001b\u0000\u0125\u0134\u0005"+
		"$\u0000\u0000\u0126\u0134\u0005#\u0000\u0000\u0127\u0134\u0005\u0014\u0000"+
		"\u0000\u0128\u0134\u0005\u0015\u0000\u0000\u0129\u0134\u0005\u0016\u0000"+
		"\u0000\u012a\u0134\u0005\u0017\u0000\u0000\u012b\u0134\u0005\u0018\u0000"+
		"\u0000\u012c\u0134\u0005\u0019\u0000\u0000\u012d\u0134\u0005\u001a\u0000"+
		"\u0000\u012e\u0134\u0005\u001b\u0000\u0000\u012f\u0134\u0005\u001c\u0000"+
		"\u0000\u0130\u0134\u0005\u001d\u0000\u0000\u0131\u0134\u0005\u001e\u0000"+
		"\u0000\u0132\u0134\u0005\u001f\u0000\u0000\u0133\u0124\u0001\u0000\u0000"+
		"\u0000\u0133\u0125\u0001\u0000\u0000\u0000\u0133\u0126\u0001\u0000\u0000"+
		"\u0000\u0133\u0127\u0001\u0000\u0000\u0000\u0133\u0128\u0001\u0000\u0000"+
		"\u0000\u0133\u0129\u0001\u0000\u0000\u0000\u0133\u012a\u0001\u0000\u0000"+
		"\u0000\u0133\u012b\u0001\u0000\u0000\u0000\u0133\u012c\u0001\u0000\u0000"+
		"\u0000\u0133\u012d\u0001\u0000\u0000\u0000\u0133\u012e\u0001\u0000\u0000"+
		"\u0000\u0133\u012f\u0001\u0000\u0000\u0000\u0133\u0130\u0001\u0000\u0000"+
		"\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000\u0000"+
		"\u0000\u01345\u0001\u0000\u0000\u0000\u0135\u013a\u00038\u001c\u0000\u0136"+
		"\u0137\u0005\"\u0000\u0000\u0137\u0139\u0003:\u001d\u0000\u0138\u0136"+
		"\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b7\u0001"+
		"\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u013e\u0007"+
		"\u0000\u0000\u0000\u013e9\u0001\u0000\u0000\u0000\u013f\u0142\u00038\u001c"+
		"\u0000\u0140\u0142\u0005$\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000"+
		"\u0141\u0140\u0001\u0000\u0000\u0000\u0142;\u0001\u0000\u0000\u0000\u0143"+
		"\u0148\u0005$\u0000\u0000\u0144\u0145\u0005\u0019\u0000\u0000\u0145\u0147"+
		"\u0005$\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u014a\u0001"+
		"\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001"+
		"\u0000\u0000\u0000\u0149=\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000"+
		"\u0000\u0000#CEMW`jlz|\u008c\u008e\u0095\u00a1\u00a9\u00af\u00b7\u00be"+
		"\u00c3\u00c6\u00c9\u00ce\u00d4\u00d7\u00df\u00e2\u00e8\u00ed\u00f6\u011a"+
		"\u0120\u0122\u0133\u013a\u0141\u0148";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}