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
		DATASPACE=6, CONSTANTS=7, ASSUMES=8, SHOWS=9, VARIABLES=10, ABBREVIATION=11, 
		DEFINITION=12, LEMMA=13, OOPS=14, WHERE=15, AND=16, CONTEXT=17, BEGIN=18, 
		END=19, ASSIGN=20, D_COLON=21, COLON=22, BY=23, APPLY=24, USING=25, UNFOLDING=26, 
		INTRO=27, SUBGOAL=28, DONE=29, QED=30, FIND_LOCAL_FLOW=31, ARROW=32, LPAREN=33, 
		RPAREN=34, LBRACK=35, RBRACK=36, COMMA=37, CARET=38, STAR=39, PLUS=40, 
		MINUS=41, DOT=42, SLASH=43, ASCII_ID=44, SYMBOL_IDENT=45, SUBSCRIPT=46, 
		SUPERSCRIPT=47, NUMBER=48, QUOTED_TEXT=49, WS=50, COMMENT=51;
	public static final int
		RULE_program = 0, RULE_theoryBlock = 1, RULE_importsClause = 2, RULE_importItem = 3, 
		RULE_importName = 4, RULE_dottedName = 5, RULE_theoryBody = 6, RULE_contextBlock = 7, 
		RULE_contextBody = 8, RULE_definitionDecl = 9, RULE_dataspaceDecl = 10, 
		RULE_dataspaceBody = 11, RULE_constantsClause = 12, RULE_constantDecl = 13, 
		RULE_assumesClause = 14, RULE_assumptionDecl = 15, RULE_variablesClause = 16, 
		RULE_varDecl = 17, RULE_abbrevDecl = 18, RULE_printSpec = 19, RULE_precedenceAnn = 20, 
		RULE_innerPrec = 21, RULE_mixfixForm = 22, RULE_lemmaDecl = 23, RULE_lemmaHead = 24, 
		RULE_lemmaAssumesShows = 25, RULE_lemmaProof = 26, RULE_proofScript = 27, 
		RULE_proofItems = 28, RULE_proofItem = 29, RULE_antiquotBlock = 30, RULE_antiquotContent = 31, 
		RULE_antiquotUnit = 32, RULE_typeSpec = 33, RULE_typeAtom = 34, RULE_ident = 35, 
		RULE_idseg = 36, RULE_idsegOrNum = 37, RULE_numberList = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "theoryBlock", "importsClause", "importItem", "importName", 
			"dottedName", "theoryBody", "contextBlock", "contextBody", "definitionDecl", 
			"dataspaceDecl", "dataspaceBody", "constantsClause", "constantDecl", 
			"assumesClause", "assumptionDecl", "variablesClause", "varDecl", "abbrevDecl", 
			"printSpec", "precedenceAnn", "innerPrec", "mixfixForm", "lemmaDecl", 
			"lemmaHead", "lemmaAssumesShows", "lemmaProof", "proofScript", "proofItems", 
			"proofItem", "antiquotBlock", "antiquotContent", "antiquotUnit", "typeSpec", 
			"typeAtom", "ident", "idseg", "idsegOrNum", "numberList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'theory'", "'imports'", "'dataspace'", "'constants'", 
			"'assumes'", "'shows'", "'variables'", "'abbreviation'", "'definition'", 
			"'lemma'", "'oops'", "'where'", "'and'", "'context'", "'begin'", "'end'", 
			"'='", "'::'", "':'", "'by'", "'apply'", "'using'", "'unfolding'", "'intro'", 
			"'subgoal'", "'done'", "'qed'", "'find_local_flow'", "'=>'", "'('", "')'", 
			"'['", "']'", "','", "'^'", "'*'", "'+'", "'-'", "'.'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ISABELLE_COMMENT_BLOCK", "ANTI_OPEN", "ANTI_CLOSE", "THEORY", 
			"IMPORTS", "DATASPACE", "CONSTANTS", "ASSUMES", "SHOWS", "VARIABLES", 
			"ABBREVIATION", "DEFINITION", "LEMMA", "OOPS", "WHERE", "AND", "CONTEXT", 
			"BEGIN", "END", "ASSIGN", "D_COLON", "COLON", "BY", "APPLY", "USING", 
			"UNFOLDING", "INTRO", "SUBGOAL", "DONE", "QED", "FIND_LOCAL_FLOW", "ARROW", 
			"LPAREN", "RPAREN", "LBRACK", "RBRACK", "COMMA", "CARET", "STAR", "PLUS", 
			"MINUS", "DOT", "SLASH", "ASCII_ID", "SYMBOL_IDENT", "SUBSCRIPT", "SUPERSCRIPT", 
			"NUMBER", "QUOTED_TEXT", "WS", "COMMENT"
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
		public List<LemmaDeclContext> lemmaDecl() {
			return getRuleContexts(LemmaDeclContext.class);
		}
		public LemmaDeclContext lemmaDecl(int i) {
			return getRuleContext(LemmaDeclContext.class,i);
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
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 145488L) != 0)) {
				{
				setState(84);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case THEORY:
					{
					setState(78);
					theoryBlock();
					}
					break;
				case CONTEXT:
					{
					setState(79);
					contextBlock();
					}
					break;
				case DATASPACE:
					{
					setState(80);
					dataspaceDecl();
					}
					break;
				case ABBREVIATION:
					{
					setState(81);
					abbrevDecl();
					}
					break;
				case DEFINITION:
					{
					setState(82);
					definitionDecl();
					}
					break;
				case LEMMA:
					{
					setState(83);
					lemmaDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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
		public ImportsClauseContext importsClause() {
			return getRuleContext(ImportsClauseContext.class,0);
		}
		public TerminalNode END() { return getToken(IsaVODEtoCPPParser.END, 0); }
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
			setState(91);
			match(THEORY);
			setState(92);
			dottedName();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTS) {
				{
				setState(93);
				importsClause();
				}
			}

			setState(96);
			match(BEGIN);
			setState(97);
			theoryBody();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END) {
				{
				setState(98);
				match(END);
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
	public static class ImportsClauseContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(IsaVODEtoCPPParser.IMPORTS, 0); }
		public List<ImportItemContext> importItem() {
			return getRuleContexts(ImportItemContext.class);
		}
		public ImportItemContext importItem(int i) {
			return getRuleContext(ImportItemContext.class,i);
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
			setState(101);
			match(IMPORTS);
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				importItem();
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 615726511554560L) != 0) );
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
	public static class ImportItemContext extends ParserRuleContext {
		public ImportNameContext importName() {
			return getRuleContext(ImportNameContext.class,0);
		}
		public TerminalNode QUOTED_TEXT() { return getToken(IsaVODEtoCPPParser.QUOTED_TEXT, 0); }
		public ImportItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterImportItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitImportItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitImportItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportItemContext importItem() throws RecognitionException {
		ImportItemContext _localctx = new ImportItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importItem);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII_ID:
			case SYMBOL_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				importName();
				}
				break;
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(QUOTED_TEXT);
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
		enterRule(_localctx, 8, RULE_importName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
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
		enterRule(_localctx, 10, RULE_dottedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			ident();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(114);
				match(DOT);
				setState(115);
				ident();
				}
				}
				setState(120);
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
		public List<LemmaDeclContext> lemmaDecl() {
			return getRuleContexts(LemmaDeclContext.class);
		}
		public LemmaDeclContext lemmaDecl(int i) {
			return getRuleContext(LemmaDeclContext.class,i);
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
		enterRule(_localctx, 12, RULE_theoryBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(129);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CONTEXT:
						{
						setState(121);
						contextBlock();
						}
						break;
					case DATASPACE:
						{
						setState(122);
						dataspaceDecl();
						}
						break;
					case ABBREVIATION:
						{
						setState(123);
						abbrevDecl();
						}
						break;
					case DEFINITION:
						{
						setState(124);
						definitionDecl();
						}
						break;
					case LEMMA:
						{
						setState(125);
						lemmaDecl();
						}
						break;
					case CONSTANTS:
						{
						setState(126);
						constantsClause();
						}
						break;
					case ASSUMES:
						{
						setState(127);
						assumesClause();
						}
						break;
					case VARIABLES:
						{
						setState(128);
						variablesClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 14, RULE_contextBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(CONTEXT);
			setState(135);
			ident();
			setState(136);
			match(BEGIN);
			setState(137);
			contextBody();
			setState(138);
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
		public List<LemmaDeclContext> lemmaDecl() {
			return getRuleContexts(LemmaDeclContext.class);
		}
		public LemmaDeclContext lemmaDecl(int i) {
			return getRuleContext(LemmaDeclContext.class,i);
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
		enterRule(_localctx, 16, RULE_contextBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15744L) != 0)) {
				{
				setState(146);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ABBREVIATION:
					{
					setState(140);
					abbrevDecl();
					}
					break;
				case DEFINITION:
					{
					setState(141);
					definitionDecl();
					}
					break;
				case LEMMA:
					{
					setState(142);
					lemmaDecl();
					}
					break;
				case CONSTANTS:
					{
					setState(143);
					constantsClause();
					}
					break;
				case ASSUMES:
					{
					setState(144);
					assumesClause();
					}
					break;
				case VARIABLES:
					{
					setState(145);
					variablesClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(150);
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
		enterRule(_localctx, 18, RULE_definitionDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(DEFINITION);
			setState(152);
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
		enterRule(_localctx, 20, RULE_dataspaceDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(DATASPACE);
			setState(155);
			ident();
			setState(156);
			match(ASSIGN);
			setState(157);
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
		public List<LemmaDeclContext> lemmaDecl() {
			return getRuleContexts(LemmaDeclContext.class);
		}
		public LemmaDeclContext lemmaDecl(int i) {
			return getRuleContext(LemmaDeclContext.class,i);
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
		enterRule(_localctx, 22, RULE_dataspaceBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(165);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CONSTANTS:
						{
						setState(159);
						constantsClause();
						}
						break;
					case ASSUMES:
						{
						setState(160);
						assumesClause();
						}
						break;
					case VARIABLES:
						{
						setState(161);
						variablesClause();
						}
						break;
					case ABBREVIATION:
						{
						setState(162);
						abbrevDecl();
						}
						break;
					case DEFINITION:
						{
						setState(163);
						definitionDecl();
						}
						break;
					case LEMMA:
						{
						setState(164);
						lemmaDecl();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 24, RULE_constantsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(CONSTANTS);
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				constantDecl();
				}
				}
				setState(174); 
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
		enterRule(_localctx, 26, RULE_constantDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			ident();
			setState(177);
			match(D_COLON);
			setState(178);
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
		enterRule(_localctx, 28, RULE_assumesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ASSUMES);
			setState(181);
			assumptionDecl();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(182);
				match(AND);
				setState(183);
				assumptionDecl();
				}
				}
				setState(188);
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
		enterRule(_localctx, 30, RULE_assumptionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			ident();
			setState(190);
			match(COLON);
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				match(QUOTED_TEXT);
				}
				}
				setState(194); 
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
		enterRule(_localctx, 32, RULE_variablesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(VARIABLES);
			setState(198); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(197);
				varDecl();
				}
				}
				setState(200); 
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
		enterRule(_localctx, 34, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			ident();
			setState(203);
			match(D_COLON);
			setState(204);
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
		enterRule(_localctx, 36, RULE_abbrevDecl);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(ABBREVIATION);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(207);
					match(DOT);
					}
				}

				setState(210);
				match(QUOTED_TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(ABBREVIATION);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(212);
					match(LPAREN);
					setState(213);
					match(ASCII_ID);
					setState(214);
					match(RPAREN);
					}
				}

				setState(217);
				ident();
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==D_COLON) {
					{
					setState(218);
					match(D_COLON);
					setState(219);
					match(QUOTED_TEXT);
					}
				}

				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(222);
					printSpec();
					}
				}

				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK || _la==NUMBER) {
					{
					setState(225);
					precedenceAnn();
					}
				}

				setState(228);
				match(WHERE);
				setState(229);
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
		enterRule(_localctx, 38, RULE_printSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(LPAREN);
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				{
				setState(234);
				match(QUOTED_TEXT);
				}
				break;
			case ASCII_ID:
				{
				setState(235);
				mixfixForm();
				}
				break;
			case ANTI_OPEN:
				{
				setState(236);
				antiquotBlock();
				}
				break;
			case RPAREN:
			case LBRACK:
				break;
			default:
				break;
			}
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(239);
				innerPrec();
				}
			}

			setState(242);
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
		enterRule(_localctx, 40, RULE_precedenceAnn);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(244);
				match(LBRACK);
				setState(245);
				numberList();
				setState(246);
				match(RBRACK);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(247);
					match(NUMBER);
					}
				}

				}
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
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
		enterRule(_localctx, 42, RULE_innerPrec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(LBRACK);
			setState(254);
			numberList();
			setState(255);
			match(RBRACK);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(256);
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
		enterRule(_localctx, 44, RULE_mixfixForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ASCII_ID);
			setState(260);
			match(QUOTED_TEXT);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(261);
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
	public static class LemmaDeclContext extends ParserRuleContext {
		public TerminalNode LEMMA() { return getToken(IsaVODEtoCPPParser.LEMMA, 0); }
		public LemmaHeadContext lemmaHead() {
			return getRuleContext(LemmaHeadContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode COLON() { return getToken(IsaVODEtoCPPParser.COLON, 0); }
		public LemmaProofContext lemmaProof() {
			return getRuleContext(LemmaProofContext.class,0);
		}
		public LemmaDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lemmaDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterLemmaDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitLemmaDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitLemmaDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LemmaDeclContext lemmaDecl() throws RecognitionException {
		LemmaDeclContext _localctx = new LemmaDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lemmaDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(LEMMA);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASCII_ID || _la==SYMBOL_IDENT) {
				{
				setState(265);
				ident();
				setState(266);
				match(COLON);
				}
			}

			setState(270);
			lemmaHead();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4286595072L) != 0)) {
				{
				setState(271);
				lemmaProof();
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
	public static class LemmaHeadContext extends ParserRuleContext {
		public List<TerminalNode> QUOTED_TEXT() { return getTokens(IsaVODEtoCPPParser.QUOTED_TEXT); }
		public TerminalNode QUOTED_TEXT(int i) {
			return getToken(IsaVODEtoCPPParser.QUOTED_TEXT, i);
		}
		public LemmaAssumesShowsContext lemmaAssumesShows() {
			return getRuleContext(LemmaAssumesShowsContext.class,0);
		}
		public LemmaHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lemmaHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterLemmaHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitLemmaHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitLemmaHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LemmaHeadContext lemmaHead() throws RecognitionException {
		LemmaHeadContext _localctx = new LemmaHeadContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lemmaHead);
		int _la;
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(274);
					match(QUOTED_TEXT);
					}
					}
					setState(277); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==QUOTED_TEXT );
				}
				break;
			case ASSUMES:
			case SHOWS:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				lemmaAssumesShows();
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
	public static class LemmaAssumesShowsContext extends ParserRuleContext {
		public TerminalNode ASSUMES() { return getToken(IsaVODEtoCPPParser.ASSUMES, 0); }
		public List<TerminalNode> QUOTED_TEXT() { return getTokens(IsaVODEtoCPPParser.QUOTED_TEXT); }
		public TerminalNode QUOTED_TEXT(int i) {
			return getToken(IsaVODEtoCPPParser.QUOTED_TEXT, i);
		}
		public List<TerminalNode> AND() { return getTokens(IsaVODEtoCPPParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(IsaVODEtoCPPParser.AND, i);
		}
		public TerminalNode SHOWS() { return getToken(IsaVODEtoCPPParser.SHOWS, 0); }
		public LemmaAssumesShowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lemmaAssumesShows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterLemmaAssumesShows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitLemmaAssumesShows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitLemmaAssumesShows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LemmaAssumesShowsContext lemmaAssumesShows() throws RecognitionException {
		LemmaAssumesShowsContext _localctx = new LemmaAssumesShowsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lemmaAssumesShows);
		int _la;
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(ASSUMES);
				setState(283);
				match(QUOTED_TEXT);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(284);
					match(AND);
					setState(285);
					match(QUOTED_TEXT);
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSUMES) {
					{
					setState(291);
					match(ASSUMES);
					setState(292);
					match(QUOTED_TEXT);
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AND) {
						{
						{
						setState(293);
						match(AND);
						setState(294);
						match(QUOTED_TEXT);
						}
						}
						setState(299);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(302);
				match(SHOWS);
				setState(303);
				match(QUOTED_TEXT);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(304);
					match(AND);
					setState(305);
					match(QUOTED_TEXT);
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class LemmaProofContext extends ParserRuleContext {
		public TerminalNode OOPS() { return getToken(IsaVODEtoCPPParser.OOPS, 0); }
		public TerminalNode BY() { return getToken(IsaVODEtoCPPParser.BY, 0); }
		public List<ProofItemsContext> proofItems() {
			return getRuleContexts(ProofItemsContext.class);
		}
		public ProofItemsContext proofItems(int i) {
			return getRuleContext(ProofItemsContext.class,i);
		}
		public TerminalNode UNFOLDING() { return getToken(IsaVODEtoCPPParser.UNFOLDING, 0); }
		public TerminalNode USING() { return getToken(IsaVODEtoCPPParser.USING, 0); }
		public TerminalNode FIND_LOCAL_FLOW() { return getToken(IsaVODEtoCPPParser.FIND_LOCAL_FLOW, 0); }
		public List<ProofScriptContext> proofScript() {
			return getRuleContexts(ProofScriptContext.class);
		}
		public ProofScriptContext proofScript(int i) {
			return getRuleContext(ProofScriptContext.class,i);
		}
		public LemmaProofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lemmaProof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterLemmaProof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitLemmaProof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitLemmaProof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LemmaProofContext lemmaProof() throws RecognitionException {
		LemmaProofContext _localctx = new LemmaProofContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lemmaProof);
		int _la;
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(OOPS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNFOLDING) {
					{
					setState(314);
					match(UNFOLDING);
					setState(315);
					proofItems();
					}
				}

				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(318);
					match(USING);
					setState(319);
					proofItems();
					}
				}

				setState(322);
				match(BY);
				setState(323);
				proofItems();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FIND_LOCAL_FLOW) {
					{
					setState(324);
					match(FIND_LOCAL_FLOW);
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125895619215364L) != 0)) {
						{
						setState(325);
						proofItems();
						}
					}

					}
				}

				setState(331); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(330);
					proofScript();
					}
					}
					setState(333); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2139095040L) != 0) );
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
	public static class ProofScriptContext extends ParserRuleContext {
		public TerminalNode APPLY() { return getToken(IsaVODEtoCPPParser.APPLY, 0); }
		public ProofItemsContext proofItems() {
			return getRuleContext(ProofItemsContext.class,0);
		}
		public TerminalNode INTRO() { return getToken(IsaVODEtoCPPParser.INTRO, 0); }
		public TerminalNode SUBGOAL() { return getToken(IsaVODEtoCPPParser.SUBGOAL, 0); }
		public TerminalNode USING() { return getToken(IsaVODEtoCPPParser.USING, 0); }
		public TerminalNode UNFOLDING() { return getToken(IsaVODEtoCPPParser.UNFOLDING, 0); }
		public TerminalNode BY() { return getToken(IsaVODEtoCPPParser.BY, 0); }
		public TerminalNode DONE() { return getToken(IsaVODEtoCPPParser.DONE, 0); }
		public TerminalNode QED() { return getToken(IsaVODEtoCPPParser.QED, 0); }
		public ProofScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proofScript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterProofScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitProofScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitProofScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProofScriptContext proofScript() throws RecognitionException {
		ProofScriptContext _localctx = new ProofScriptContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_proofScript);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APPLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(APPLY);
				setState(338);
				proofItems();
				}
				break;
			case INTRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(INTRO);
				setState(340);
				proofItems();
				}
				break;
			case SUBGOAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				match(SUBGOAL);
				setState(342);
				proofItems();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 4);
				{
				setState(343);
				match(USING);
				setState(344);
				proofItems();
				}
				break;
			case UNFOLDING:
				enterOuterAlt(_localctx, 5);
				{
				setState(345);
				match(UNFOLDING);
				setState(346);
				proofItems();
				}
				break;
			case BY:
				enterOuterAlt(_localctx, 6);
				{
				setState(347);
				match(BY);
				setState(348);
				proofItems();
				}
				break;
			case DONE:
				enterOuterAlt(_localctx, 7);
				{
				setState(349);
				match(DONE);
				}
				break;
			case QED:
				enterOuterAlt(_localctx, 8);
				{
				setState(350);
				match(QED);
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
	public static class ProofItemsContext extends ParserRuleContext {
		public List<ProofItemContext> proofItem() {
			return getRuleContexts(ProofItemContext.class);
		}
		public ProofItemContext proofItem(int i) {
			return getRuleContext(ProofItemContext.class,i);
		}
		public ProofItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proofItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterProofItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitProofItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitProofItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProofItemsContext proofItems() throws RecognitionException {
		ProofItemsContext _localctx = new ProofItemsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_proofItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(353);
				proofItem();
				}
				}
				setState(356); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1125895619215364L) != 0) );
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
	public static class ProofItemContext extends ParserRuleContext {
		public TerminalNode QUOTED_TEXT() { return getToken(IsaVODEtoCPPParser.QUOTED_TEXT, 0); }
		public AntiquotBlockContext antiquotBlock() {
			return getRuleContext(AntiquotBlockContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(IsaVODEtoCPPParser.NUMBER, 0); }
		public TerminalNode SUPERSCRIPT() { return getToken(IsaVODEtoCPPParser.SUPERSCRIPT, 0); }
		public TerminalNode SUBSCRIPT() { return getToken(IsaVODEtoCPPParser.SUBSCRIPT, 0); }
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
		public ProofItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proofItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).enterProofItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsaVODEtoCPPListener ) ((IsaVODEtoCPPListener)listener).exitProofItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsaVODEtoCPPVisitor ) return ((IsaVODEtoCPPVisitor<? extends T>)visitor).visitProofItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProofItemContext proofItem() throws RecognitionException {
		ProofItemContext _localctx = new ProofItemContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_proofItem);
		try {
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(QUOTED_TEXT);
				}
				break;
			case ANTI_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				antiquotBlock();
				}
				break;
			case ASCII_ID:
			case SYMBOL_IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				ident();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(361);
				match(NUMBER);
				}
				break;
			case SUPERSCRIPT:
				enterOuterAlt(_localctx, 5);
				{
				setState(362);
				match(SUPERSCRIPT);
				}
				break;
			case SUBSCRIPT:
				enterOuterAlt(_localctx, 6);
				{
				setState(363);
				match(SUBSCRIPT);
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 7);
				{
				setState(364);
				match(ARROW);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 8);
				{
				setState(365);
				match(LPAREN);
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 9);
				{
				setState(366);
				match(RPAREN);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 10);
				{
				setState(367);
				match(LBRACK);
				}
				break;
			case RBRACK:
				enterOuterAlt(_localctx, 11);
				{
				setState(368);
				match(RBRACK);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 12);
				{
				setState(369);
				match(COMMA);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 13);
				{
				setState(370);
				match(CARET);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 14);
				{
				setState(371);
				match(STAR);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 15);
				{
				setState(372);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 16);
				{
				setState(373);
				match(MINUS);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 17);
				{
				setState(374);
				match(DOT);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 18);
				{
				setState(375);
				match(SLASH);
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 19);
				{
				setState(376);
				match(ASSIGN);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 20);
				{
				setState(377);
				match(COLON);
				}
				break;
			case D_COLON:
				enterOuterAlt(_localctx, 21);
				{
				setState(378);
				match(D_COLON);
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
		enterRule(_localctx, 60, RULE_antiquotBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(ANTI_OPEN);
			setState(382);
			antiquotContent();
			setState(383);
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
		enterRule(_localctx, 62, RULE_antiquotContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055529149399028L) != 0)) {
				{
				{
				setState(385);
				antiquotUnit();
				}
				}
				setState(390);
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
		public TerminalNode LEMMA() { return getToken(IsaVODEtoCPPParser.LEMMA, 0); }
		public TerminalNode SHOWS() { return getToken(IsaVODEtoCPPParser.SHOWS, 0); }
		public TerminalNode BY() { return getToken(IsaVODEtoCPPParser.BY, 0); }
		public TerminalNode APPLY() { return getToken(IsaVODEtoCPPParser.APPLY, 0); }
		public TerminalNode USING() { return getToken(IsaVODEtoCPPParser.USING, 0); }
		public TerminalNode UNFOLDING() { return getToken(IsaVODEtoCPPParser.UNFOLDING, 0); }
		public TerminalNode FIND_LOCAL_FLOW() { return getToken(IsaVODEtoCPPParser.FIND_LOCAL_FLOW, 0); }
		public TerminalNode OOPS() { return getToken(IsaVODEtoCPPParser.OOPS, 0); }
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
		enterRule(_localctx, 64, RULE_antiquotUnit);
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				antiquotBlock();
				}
				break;
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(QUOTED_TEXT);
				}
				break;
			case ASCII_ID:
			case SYMBOL_IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				ident();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(394);
				match(NUMBER);
				}
				break;
			case SUPERSCRIPT:
				enterOuterAlt(_localctx, 5);
				{
				setState(395);
				match(SUPERSCRIPT);
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 6);
				{
				setState(396);
				match(ARROW);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(397);
				match(LPAREN);
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 8);
				{
				setState(398);
				match(RPAREN);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 9);
				{
				setState(399);
				match(LBRACK);
				}
				break;
			case RBRACK:
				enterOuterAlt(_localctx, 10);
				{
				setState(400);
				match(RBRACK);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 11);
				{
				setState(401);
				match(COMMA);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 12);
				{
				setState(402);
				match(CARET);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 13);
				{
				setState(403);
				match(STAR);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 14);
				{
				setState(404);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 15);
				{
				setState(405);
				match(MINUS);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 16);
				{
				setState(406);
				match(DOT);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 17);
				{
				setState(407);
				match(SLASH);
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 18);
				{
				setState(408);
				match(ASSIGN);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 19);
				{
				setState(409);
				match(COLON);
				}
				break;
			case D_COLON:
				enterOuterAlt(_localctx, 20);
				{
				setState(410);
				match(D_COLON);
				}
				break;
			case DATASPACE:
				enterOuterAlt(_localctx, 21);
				{
				setState(411);
				match(DATASPACE);
				}
				break;
			case CONSTANTS:
				enterOuterAlt(_localctx, 22);
				{
				setState(412);
				match(CONSTANTS);
				}
				break;
			case ASSUMES:
				enterOuterAlt(_localctx, 23);
				{
				setState(413);
				match(ASSUMES);
				}
				break;
			case VARIABLES:
				enterOuterAlt(_localctx, 24);
				{
				setState(414);
				match(VARIABLES);
				}
				break;
			case ABBREVIATION:
				enterOuterAlt(_localctx, 25);
				{
				setState(415);
				match(ABBREVIATION);
				}
				break;
			case WHERE:
				enterOuterAlt(_localctx, 26);
				{
				setState(416);
				match(WHERE);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 27);
				{
				setState(417);
				match(AND);
				}
				break;
			case CONTEXT:
				enterOuterAlt(_localctx, 28);
				{
				setState(418);
				match(CONTEXT);
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 29);
				{
				setState(419);
				match(BEGIN);
				}
				break;
			case END:
				enterOuterAlt(_localctx, 30);
				{
				setState(420);
				match(END);
				}
				break;
			case DEFINITION:
				enterOuterAlt(_localctx, 31);
				{
				setState(421);
				match(DEFINITION);
				}
				break;
			case THEORY:
				enterOuterAlt(_localctx, 32);
				{
				setState(422);
				match(THEORY);
				}
				break;
			case IMPORTS:
				enterOuterAlt(_localctx, 33);
				{
				setState(423);
				match(IMPORTS);
				}
				break;
			case LEMMA:
				enterOuterAlt(_localctx, 34);
				{
				setState(424);
				match(LEMMA);
				}
				break;
			case SHOWS:
				enterOuterAlt(_localctx, 35);
				{
				setState(425);
				match(SHOWS);
				}
				break;
			case BY:
				enterOuterAlt(_localctx, 36);
				{
				setState(426);
				match(BY);
				}
				break;
			case APPLY:
				enterOuterAlt(_localctx, 37);
				{
				setState(427);
				match(APPLY);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 38);
				{
				setState(428);
				match(USING);
				}
				break;
			case UNFOLDING:
				enterOuterAlt(_localctx, 39);
				{
				setState(429);
				match(UNFOLDING);
				}
				break;
			case FIND_LOCAL_FLOW:
				enterOuterAlt(_localctx, 40);
				{
				setState(430);
				match(FIND_LOCAL_FLOW);
				}
				break;
			case OOPS:
				enterOuterAlt(_localctx, 41);
				{
				setState(431);
				match(OOPS);
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
		enterRule(_localctx, 66, RULE_typeSpec);
		try {
			int _alt;
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
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
				setState(436); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(435);
						typeAtom();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(438); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 68, RULE_typeAtom);
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII_ID:
			case SYMBOL_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				ident();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				match(NUMBER);
				}
				break;
			case SUPERSCRIPT:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				match(SUPERSCRIPT);
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 4);
				{
				setState(445);
				match(ARROW);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(446);
				match(LPAREN);
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(447);
				match(RPAREN);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 7);
				{
				setState(448);
				match(LBRACK);
				}
				break;
			case RBRACK:
				enterOuterAlt(_localctx, 8);
				{
				setState(449);
				match(RBRACK);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 9);
				{
				setState(450);
				match(COMMA);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 10);
				{
				setState(451);
				match(CARET);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(452);
				match(STAR);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 12);
				{
				setState(453);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 13);
				{
				setState(454);
				match(MINUS);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 14);
				{
				setState(455);
				match(DOT);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 15);
				{
				setState(456);
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
		enterRule(_localctx, 70, RULE_ident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			idseg();
			setState(464);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(460);
					match(SUBSCRIPT);
					setState(461);
					idsegOrNum();
					}
					} 
				}
				setState(466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		enterRule(_localctx, 72, RULE_idseg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
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
		enterRule(_localctx, 74, RULE_idsegOrNum);
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII_ID:
			case SYMBOL_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				idseg();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
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
		enterRule(_localctx, 76, RULE_numberList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(NUMBER);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(474);
				match(COMMA);
				setState(475);
				match(NUMBER);
				}
				}
				setState(480);
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
		"\u0004\u00013\u01e2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000U\b\u0000"+
		"\n\u0000\f\u0000X\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001_\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001d\b\u0001\u0001\u0002\u0001\u0002\u0004\u0002h\b\u0002\u000b"+
		"\u0002\f\u0002i\u0001\u0003\u0001\u0003\u0003\u0003n\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005u\b\u0005"+
		"\n\u0005\f\u0005x\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0082\b\u0006"+
		"\n\u0006\f\u0006\u0085\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0005\b\u0093\b\b\n\b\f\b\u0096\t\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00a6\b\u000b\n\u000b"+
		"\f\u000b\u00a9\t\u000b\u0001\f\u0001\f\u0004\f\u00ad\b\f\u000b\f\f\f\u00ae"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00b9\b\u000e\n\u000e\f\u000e\u00bc\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0004\u000f\u00c1\b\u000f\u000b\u000f\f\u000f"+
		"\u00c2\u0001\u0010\u0001\u0010\u0004\u0010\u00c7\b\u0010\u000b\u0010\f"+
		"\u0010\u00c8\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00d1\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00d8\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00dd\b\u0012\u0001\u0012\u0003\u0012\u00e0\b"+
		"\u0012\u0001\u0012\u0003\u0012\u00e3\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00e8\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00ee\b\u0013\u0001\u0013\u0003\u0013\u00f1\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u00f9\b\u0014\u0001\u0014\u0003\u0014\u00fc\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0102\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0107\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u010d\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0111\b\u0017\u0001\u0018\u0004\u0018\u0114\b\u0018"+
		"\u000b\u0018\f\u0018\u0115\u0001\u0018\u0003\u0018\u0119\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u011f\b\u0019\n"+
		"\u0019\f\u0019\u0122\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u0128\b\u0019\n\u0019\f\u0019\u012b\t\u0019\u0003\u0019"+
		"\u012d\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u0133\b\u0019\n\u0019\f\u0019\u0136\t\u0019\u0003\u0019\u0138\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u013d\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u0141\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u0147\b\u001a\u0003\u001a\u0149\b\u001a\u0001"+
		"\u001a\u0004\u001a\u014c\b\u001a\u000b\u001a\f\u001a\u014d\u0003\u001a"+
		"\u0150\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0160\b\u001b\u0001\u001c"+
		"\u0004\u001c\u0163\b\u001c\u000b\u001c\f\u001c\u0164\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u017c\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0005\u001f\u0183\b\u001f\n\u001f\f\u001f"+
		"\u0186\t\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u01b1\b \u0001!\u0001!\u0004!\u01b5\b!\u000b"+
		"!\f!\u01b6\u0003!\u01b9\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u01ca\b\"\u0001#\u0001#\u0001#\u0005#\u01cf\b#\n#\f#\u01d2"+
		"\t#\u0001$\u0001$\u0001%\u0001%\u0003%\u01d8\b%\u0001&\u0001&\u0001&\u0005"+
		"&\u01dd\b&\n&\f&\u01e0\t&\u0001&\u0000\u0000\'\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJL\u0000\u0001\u0001\u0000,-\u0253\u0000V\u0001\u0000\u0000"+
		"\u0000\u0002[\u0001\u0000\u0000\u0000\u0004e\u0001\u0000\u0000\u0000\u0006"+
		"m\u0001\u0000\u0000\u0000\bo\u0001\u0000\u0000\u0000\nq\u0001\u0000\u0000"+
		"\u0000\f\u0083\u0001\u0000\u0000\u0000\u000e\u0086\u0001\u0000\u0000\u0000"+
		"\u0010\u0094\u0001\u0000\u0000\u0000\u0012\u0097\u0001\u0000\u0000\u0000"+
		"\u0014\u009a\u0001\u0000\u0000\u0000\u0016\u00a7\u0001\u0000\u0000\u0000"+
		"\u0018\u00aa\u0001\u0000\u0000\u0000\u001a\u00b0\u0001\u0000\u0000\u0000"+
		"\u001c\u00b4\u0001\u0000\u0000\u0000\u001e\u00bd\u0001\u0000\u0000\u0000"+
		" \u00c4\u0001\u0000\u0000\u0000\"\u00ca\u0001\u0000\u0000\u0000$\u00e7"+
		"\u0001\u0000\u0000\u0000&\u00e9\u0001\u0000\u0000\u0000(\u00fb\u0001\u0000"+
		"\u0000\u0000*\u00fd\u0001\u0000\u0000\u0000,\u0103\u0001\u0000\u0000\u0000"+
		".\u0108\u0001\u0000\u0000\u00000\u0118\u0001\u0000\u0000\u00002\u0137"+
		"\u0001\u0000\u0000\u00004\u014f\u0001\u0000\u0000\u00006\u015f\u0001\u0000"+
		"\u0000\u00008\u0162\u0001\u0000\u0000\u0000:\u017b\u0001\u0000\u0000\u0000"+
		"<\u017d\u0001\u0000\u0000\u0000>\u0184\u0001\u0000\u0000\u0000@\u01b0"+
		"\u0001\u0000\u0000\u0000B\u01b8\u0001\u0000\u0000\u0000D\u01c9\u0001\u0000"+
		"\u0000\u0000F\u01cb\u0001\u0000\u0000\u0000H\u01d3\u0001\u0000\u0000\u0000"+
		"J\u01d7\u0001\u0000\u0000\u0000L\u01d9\u0001\u0000\u0000\u0000NU\u0003"+
		"\u0002\u0001\u0000OU\u0003\u000e\u0007\u0000PU\u0003\u0014\n\u0000QU\u0003"+
		"$\u0012\u0000RU\u0003\u0012\t\u0000SU\u0003.\u0017\u0000TN\u0001\u0000"+
		"\u0000\u0000TO\u0001\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000TQ\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000"+
		"UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0005\u0000"+
		"\u0000\u0001Z\u0001\u0001\u0000\u0000\u0000[\\\u0005\u0004\u0000\u0000"+
		"\\^\u0003\n\u0005\u0000]_\u0003\u0004\u0002\u0000^]\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0005\u0012"+
		"\u0000\u0000ac\u0003\f\u0006\u0000bd\u0005\u0013\u0000\u0000cb\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000d\u0003\u0001\u0000\u0000\u0000"+
		"eg\u0005\u0005\u0000\u0000fh\u0003\u0006\u0003\u0000gf\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000j\u0005\u0001\u0000\u0000\u0000kn\u0003\b\u0004\u0000ln\u0005"+
		"1\u0000\u0000mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000n\u0007"+
		"\u0001\u0000\u0000\u0000op\u0003\n\u0005\u0000p\t\u0001\u0000\u0000\u0000"+
		"qv\u0003F#\u0000rs\u0005*\u0000\u0000su\u0003F#\u0000tr\u0001\u0000\u0000"+
		"\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000w\u000b\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"y\u0082\u0003\u000e\u0007\u0000z\u0082\u0003\u0014\n\u0000{\u0082\u0003"+
		"$\u0012\u0000|\u0082\u0003\u0012\t\u0000}\u0082\u0003.\u0017\u0000~\u0082"+
		"\u0003\u0018\f\u0000\u007f\u0082\u0003\u001c\u000e\u0000\u0080\u0082\u0003"+
		" \u0010\u0000\u0081y\u0001\u0000\u0000\u0000\u0081z\u0001\u0000\u0000"+
		"\u0000\u0081{\u0001\u0000\u0000\u0000\u0081|\u0001\u0000\u0000\u0000\u0081"+
		"}\u0001\u0000\u0000\u0000\u0081~\u0001\u0000\u0000\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\r\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0005\u0011\u0000\u0000\u0087\u0088\u0003F#\u0000"+
		"\u0088\u0089\u0005\u0012\u0000\u0000\u0089\u008a\u0003\u0010\b\u0000\u008a"+
		"\u008b\u0005\u0013\u0000\u0000\u008b\u000f\u0001\u0000\u0000\u0000\u008c"+
		"\u0093\u0003$\u0012\u0000\u008d\u0093\u0003\u0012\t\u0000\u008e\u0093"+
		"\u0003.\u0017\u0000\u008f\u0093\u0003\u0018\f\u0000\u0090\u0093\u0003"+
		"\u001c\u000e\u0000\u0091\u0093\u0003 \u0010\u0000\u0092\u008c\u0001\u0000"+
		"\u0000\u0000\u0092\u008d\u0001\u0000\u0000\u0000\u0092\u008e\u0001\u0000"+
		"\u0000\u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0011\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005\f\u0000\u0000\u0098\u0099\u00051\u0000"+
		"\u0000\u0099\u0013\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0006\u0000"+
		"\u0000\u009b\u009c\u0003F#\u0000\u009c\u009d\u0005\u0014\u0000\u0000\u009d"+
		"\u009e\u0003\u0016\u000b\u0000\u009e\u0015\u0001\u0000\u0000\u0000\u009f"+
		"\u00a6\u0003\u0018\f\u0000\u00a0\u00a6\u0003\u001c\u000e\u0000\u00a1\u00a6"+
		"\u0003 \u0010\u0000\u00a2\u00a6\u0003$\u0012\u0000\u00a3\u00a6\u0003\u0012"+
		"\t\u0000\u00a4\u00a6\u0003.\u0017\u0000\u00a5\u009f\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a0\u0001\u0000\u0000\u0000\u00a5\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u0017\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ac\u0005\u0007\u0000\u0000\u00ab\u00ad\u0003\u001a\r\u0000"+
		"\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000"+
		"\u00af\u0019\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003F#\u0000\u00b1\u00b2"+
		"\u0005\u0015\u0000\u0000\u00b2\u00b3\u0003B!\u0000\u00b3\u001b\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0005\b\u0000\u0000\u00b5\u00ba\u0003\u001e\u000f"+
		"\u0000\u00b6\u00b7\u0005\u0010\u0000\u0000\u00b7\u00b9\u0003\u001e\u000f"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u001d\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0003F#\u0000\u00be\u00c0\u0005\u0016\u0000\u0000\u00bf"+
		"\u00c1\u00051\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c3\u001f\u0001\u0000\u0000\u0000\u00c4\u00c6"+
		"\u0005\n\u0000\u0000\u00c5\u00c7\u0003\"\u0011\u0000\u00c6\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9!\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0003F#\u0000\u00cb\u00cc\u0005\u0015\u0000\u0000"+
		"\u00cc\u00cd\u0003B!\u0000\u00cd#\u0001\u0000\u0000\u0000\u00ce\u00d0"+
		"\u0005\u000b\u0000\u0000\u00cf\u00d1\u0005*\u0000\u0000\u00d0\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00e8\u00051\u0000\u0000\u00d3\u00d7\u0005\u000b"+
		"\u0000\u0000\u00d4\u00d5\u0005!\u0000\u0000\u00d5\u00d6\u0005,\u0000\u0000"+
		"\u00d6\u00d8\u0005\"\u0000\u0000\u00d7\u00d4\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u00dc\u0003F#\u0000\u00da\u00db\u0005\u0015\u0000\u0000\u00db\u00dd\u0005"+
		"1\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00e0\u0003&\u0013"+
		"\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00e3\u0003(\u0014\u0000"+
		"\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u000f\u0000\u0000"+
		"\u00e5\u00e6\u00051\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7"+
		"\u00ce\u0001\u0000\u0000\u0000\u00e7\u00d3\u0001\u0000\u0000\u0000\u00e8"+
		"%\u0001\u0000\u0000\u0000\u00e9\u00ed\u0005!\u0000\u0000\u00ea\u00ee\u0005"+
		"1\u0000\u0000\u00eb\u00ee\u0003,\u0016\u0000\u00ec\u00ee\u0003<\u001e"+
		"\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00f1\u0003*\u0015\u0000"+
		"\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\"\u0000\u0000\u00f3"+
		"\'\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005#\u0000\u0000\u00f5\u00f6"+
		"\u0003L&\u0000\u00f6\u00f8\u0005$\u0000\u0000\u00f7\u00f9\u00050\u0000"+
		"\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00fc\u00050\u0000\u0000"+
		"\u00fb\u00f4\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fc)\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005#\u0000\u0000\u00fe\u00ff"+
		"\u0003L&\u0000\u00ff\u0101\u0005$\u0000\u0000\u0100\u0102\u00050\u0000"+
		"\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000"+
		"\u0000\u0102+\u0001\u0000\u0000\u0000\u0103\u0104\u0005,\u0000\u0000\u0104"+
		"\u0106\u00051\u0000\u0000\u0105\u0107\u00050\u0000\u0000\u0106\u0105\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107-\u0001\u0000"+
		"\u0000\u0000\u0108\u010c\u0005\r\u0000\u0000\u0109\u010a\u0003F#\u0000"+
		"\u010a\u010b\u0005\u0016\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000"+
		"\u010c\u0109\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u00030\u0018\u0000\u010f"+
		"\u0111\u00034\u001a\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0001\u0000\u0000\u0000\u0111/\u0001\u0000\u0000\u0000\u0112\u0114\u0005"+
		"1\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000"+
		"\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000"+
		"\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0119\u00032\u0019"+
		"\u0000\u0118\u0113\u0001\u0000\u0000\u0000\u0118\u0117\u0001\u0000\u0000"+
		"\u0000\u01191\u0001\u0000\u0000\u0000\u011a\u011b\u0005\b\u0000\u0000"+
		"\u011b\u0120\u00051\u0000\u0000\u011c\u011d\u0005\u0010\u0000\u0000\u011d"+
		"\u011f\u00051\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0122"+
		"\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u0121\u0138\u0001\u0000\u0000\u0000\u0122\u0120"+
		"\u0001\u0000\u0000\u0000\u0123\u0124\u0005\b\u0000\u0000\u0124\u0129\u0005"+
		"1\u0000\u0000\u0125\u0126\u0005\u0010\u0000\u0000\u0126\u0128\u00051\u0000"+
		"\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000"+
		"\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000"+
		"\u0000\u012a\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000"+
		"\u0000\u012c\u0123\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0005\t\u0000\u0000"+
		"\u012f\u0134\u00051\u0000\u0000\u0130\u0131\u0005\u0010\u0000\u0000\u0131"+
		"\u0133\u00051\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0136"+
		"\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0001\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134"+
		"\u0001\u0000\u0000\u0000\u0137\u011a\u0001\u0000\u0000\u0000\u0137\u012c"+
		"\u0001\u0000\u0000\u0000\u01383\u0001\u0000\u0000\u0000\u0139\u0150\u0005"+
		"\u000e\u0000\u0000\u013a\u013b\u0005\u001a\u0000\u0000\u013b\u013d\u0003"+
		"8\u001c\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000"+
		"\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u013f\u0005\u0019"+
		"\u0000\u0000\u013f\u0141\u00038\u001c\u0000\u0140\u013e\u0001\u0000\u0000"+
		"\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000"+
		"\u0000\u0142\u0143\u0005\u0017\u0000\u0000\u0143\u0150\u00038\u001c\u0000"+
		"\u0144\u0146\u0005\u001f\u0000\u0000\u0145\u0147\u00038\u001c\u0000\u0146"+
		"\u0145\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147"+
		"\u0149\u0001\u0000\u0000\u0000\u0148\u0144\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0001\u0000\u0000\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a"+
		"\u014c\u00036\u001b\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0001\u0000\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000\u014f\u0139"+
		"\u0001\u0000\u0000\u0000\u014f\u013c\u0001\u0000\u0000\u0000\u014f\u0148"+
		"\u0001\u0000\u0000\u0000\u01505\u0001\u0000\u0000\u0000\u0151\u0152\u0005"+
		"\u0018\u0000\u0000\u0152\u0160\u00038\u001c\u0000\u0153\u0154\u0005\u001b"+
		"\u0000\u0000\u0154\u0160\u00038\u001c\u0000\u0155\u0156\u0005\u001c\u0000"+
		"\u0000\u0156\u0160\u00038\u001c\u0000\u0157\u0158\u0005\u0019\u0000\u0000"+
		"\u0158\u0160\u00038\u001c\u0000\u0159\u015a\u0005\u001a\u0000\u0000\u015a"+
		"\u0160\u00038\u001c\u0000\u015b\u015c\u0005\u0017\u0000\u0000\u015c\u0160"+
		"\u00038\u001c\u0000\u015d\u0160\u0005\u001d\u0000\u0000\u015e\u0160\u0005"+
		"\u001e\u0000\u0000\u015f\u0151\u0001\u0000\u0000\u0000\u015f\u0153\u0001"+
		"\u0000\u0000\u0000\u015f\u0155\u0001\u0000\u0000\u0000\u015f\u0157\u0001"+
		"\u0000\u0000\u0000\u015f\u0159\u0001\u0000\u0000\u0000\u015f\u015b\u0001"+
		"\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u015e\u0001"+
		"\u0000\u0000\u0000\u01607\u0001\u0000\u0000\u0000\u0161\u0163\u0003:\u001d"+
		"\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000"+
		"\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000"+
		"\u0000\u01659\u0001\u0000\u0000\u0000\u0166\u017c\u00051\u0000\u0000\u0167"+
		"\u017c\u0003<\u001e\u0000\u0168\u017c\u0003F#\u0000\u0169\u017c\u0005"+
		"0\u0000\u0000\u016a\u017c\u0005/\u0000\u0000\u016b\u017c\u0005.\u0000"+
		"\u0000\u016c\u017c\u0005 \u0000\u0000\u016d\u017c\u0005!\u0000\u0000\u016e"+
		"\u017c\u0005\"\u0000\u0000\u016f\u017c\u0005#\u0000\u0000\u0170\u017c"+
		"\u0005$\u0000\u0000\u0171\u017c\u0005%\u0000\u0000\u0172\u017c\u0005&"+
		"\u0000\u0000\u0173\u017c\u0005\'\u0000\u0000\u0174\u017c\u0005(\u0000"+
		"\u0000\u0175\u017c\u0005)\u0000\u0000\u0176\u017c\u0005*\u0000\u0000\u0177"+
		"\u017c\u0005+\u0000\u0000\u0178\u017c\u0005\u0014\u0000\u0000\u0179\u017c"+
		"\u0005\u0016\u0000\u0000\u017a\u017c\u0005\u0015\u0000\u0000\u017b\u0166"+
		"\u0001\u0000\u0000\u0000\u017b\u0167\u0001\u0000\u0000\u0000\u017b\u0168"+
		"\u0001\u0000\u0000\u0000\u017b\u0169\u0001\u0000\u0000\u0000\u017b\u016a"+
		"\u0001\u0000\u0000\u0000\u017b\u016b\u0001\u0000\u0000\u0000\u017b\u016c"+
		"\u0001\u0000\u0000\u0000\u017b\u016d\u0001\u0000\u0000\u0000\u017b\u016e"+
		"\u0001\u0000\u0000\u0000\u017b\u016f\u0001\u0000\u0000\u0000\u017b\u0170"+
		"\u0001\u0000\u0000\u0000\u017b\u0171\u0001\u0000\u0000\u0000\u017b\u0172"+
		"\u0001\u0000\u0000\u0000\u017b\u0173\u0001\u0000\u0000\u0000\u017b\u0174"+
		"\u0001\u0000\u0000\u0000\u017b\u0175\u0001\u0000\u0000\u0000\u017b\u0176"+
		"\u0001\u0000\u0000\u0000\u017b\u0177\u0001\u0000\u0000\u0000\u017b\u0178"+
		"\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017a"+
		"\u0001\u0000\u0000\u0000\u017c;\u0001\u0000\u0000\u0000\u017d\u017e\u0005"+
		"\u0002\u0000\u0000\u017e\u017f\u0003>\u001f\u0000\u017f\u0180\u0005\u0003"+
		"\u0000\u0000\u0180=\u0001\u0000\u0000\u0000\u0181\u0183\u0003@ \u0000"+
		"\u0182\u0181\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000\u0000"+
		"\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000"+
		"\u0185?\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187"+
		"\u01b1\u0003<\u001e\u0000\u0188\u01b1\u00051\u0000\u0000\u0189\u01b1\u0003"+
		"F#\u0000\u018a\u01b1\u00050\u0000\u0000\u018b\u01b1\u0005/\u0000\u0000"+
		"\u018c\u01b1\u0005 \u0000\u0000\u018d\u01b1\u0005!\u0000\u0000\u018e\u01b1"+
		"\u0005\"\u0000\u0000\u018f\u01b1\u0005#\u0000\u0000\u0190\u01b1\u0005"+
		"$\u0000\u0000\u0191\u01b1\u0005%\u0000\u0000\u0192\u01b1\u0005&\u0000"+
		"\u0000\u0193\u01b1\u0005\'\u0000\u0000\u0194\u01b1\u0005(\u0000\u0000"+
		"\u0195\u01b1\u0005)\u0000\u0000\u0196\u01b1\u0005*\u0000\u0000\u0197\u01b1"+
		"\u0005+\u0000\u0000\u0198\u01b1\u0005\u0014\u0000\u0000\u0199\u01b1\u0005"+
		"\u0016\u0000\u0000\u019a\u01b1\u0005\u0015\u0000\u0000\u019b\u01b1\u0005"+
		"\u0006\u0000\u0000\u019c\u01b1\u0005\u0007\u0000\u0000\u019d\u01b1\u0005"+
		"\b\u0000\u0000\u019e\u01b1\u0005\n\u0000\u0000\u019f\u01b1\u0005\u000b"+
		"\u0000\u0000\u01a0\u01b1\u0005\u000f\u0000\u0000\u01a1\u01b1\u0005\u0010"+
		"\u0000\u0000\u01a2\u01b1\u0005\u0011\u0000\u0000\u01a3\u01b1\u0005\u0012"+
		"\u0000\u0000\u01a4\u01b1\u0005\u0013\u0000\u0000\u01a5\u01b1\u0005\f\u0000"+
		"\u0000\u01a6\u01b1\u0005\u0004\u0000\u0000\u01a7\u01b1\u0005\u0005\u0000"+
		"\u0000\u01a8\u01b1\u0005\r\u0000\u0000\u01a9\u01b1\u0005\t\u0000\u0000"+
		"\u01aa\u01b1\u0005\u0017\u0000\u0000\u01ab\u01b1\u0005\u0018\u0000\u0000"+
		"\u01ac\u01b1\u0005\u0019\u0000\u0000\u01ad\u01b1\u0005\u001a\u0000\u0000"+
		"\u01ae\u01b1\u0005\u001f\u0000\u0000\u01af\u01b1\u0005\u000e\u0000\u0000"+
		"\u01b0\u0187\u0001\u0000\u0000\u0000\u01b0\u0188\u0001\u0000\u0000\u0000"+
		"\u01b0\u0189\u0001\u0000\u0000\u0000\u01b0\u018a\u0001\u0000\u0000\u0000"+
		"\u01b0\u018b\u0001\u0000\u0000\u0000\u01b0\u018c\u0001\u0000\u0000\u0000"+
		"\u01b0\u018d\u0001\u0000\u0000\u0000\u01b0\u018e\u0001\u0000\u0000\u0000"+
		"\u01b0\u018f\u0001\u0000\u0000\u0000\u01b0\u0190\u0001\u0000\u0000\u0000"+
		"\u01b0\u0191\u0001\u0000\u0000\u0000\u01b0\u0192\u0001\u0000\u0000\u0000"+
		"\u01b0\u0193\u0001\u0000\u0000\u0000\u01b0\u0194\u0001\u0000\u0000\u0000"+
		"\u01b0\u0195\u0001\u0000\u0000\u0000\u01b0\u0196\u0001\u0000\u0000\u0000"+
		"\u01b0\u0197\u0001\u0000\u0000\u0000\u01b0\u0198\u0001\u0000\u0000\u0000"+
		"\u01b0\u0199\u0001\u0000\u0000\u0000\u01b0\u019a\u0001\u0000\u0000\u0000"+
		"\u01b0\u019b\u0001\u0000\u0000\u0000\u01b0\u019c\u0001\u0000\u0000\u0000"+
		"\u01b0\u019d\u0001\u0000\u0000\u0000\u01b0\u019e\u0001\u0000\u0000\u0000"+
		"\u01b0\u019f\u0001\u0000\u0000\u0000\u01b0\u01a0\u0001\u0000\u0000\u0000"+
		"\u01b0\u01a1\u0001\u0000\u0000\u0000\u01b0\u01a2\u0001\u0000\u0000\u0000"+
		"\u01b0\u01a3\u0001\u0000\u0000\u0000\u01b0\u01a4\u0001\u0000\u0000\u0000"+
		"\u01b0\u01a5\u0001\u0000\u0000\u0000\u01b0\u01a6\u0001\u0000\u0000\u0000"+
		"\u01b0\u01a7\u0001\u0000\u0000\u0000\u01b0\u01a8\u0001\u0000\u0000\u0000"+
		"\u01b0\u01a9\u0001\u0000\u0000\u0000\u01b0\u01aa\u0001\u0000\u0000\u0000"+
		"\u01b0\u01ab\u0001\u0000\u0000\u0000\u01b0\u01ac\u0001\u0000\u0000\u0000"+
		"\u01b0\u01ad\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000"+
		"\u01b0\u01af\u0001\u0000\u0000\u0000\u01b1A\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b9\u00051\u0000\u0000\u01b3\u01b5\u0003D\"\u0000\u01b4\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b9\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b2\u0001\u0000\u0000\u0000\u01b8\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b9C\u0001\u0000\u0000\u0000\u01ba\u01ca\u0003F#"+
		"\u0000\u01bb\u01ca\u00050\u0000\u0000\u01bc\u01ca\u0005/\u0000\u0000\u01bd"+
		"\u01ca\u0005 \u0000\u0000\u01be\u01ca\u0005!\u0000\u0000\u01bf\u01ca\u0005"+
		"\"\u0000\u0000\u01c0\u01ca\u0005#\u0000\u0000\u01c1\u01ca\u0005$\u0000"+
		"\u0000\u01c2\u01ca\u0005%\u0000\u0000\u01c3\u01ca\u0005&\u0000\u0000\u01c4"+
		"\u01ca\u0005\'\u0000\u0000\u01c5\u01ca\u0005(\u0000\u0000\u01c6\u01ca"+
		"\u0005)\u0000\u0000\u01c7\u01ca\u0005*\u0000\u0000\u01c8\u01ca\u0005+"+
		"\u0000\u0000\u01c9\u01ba\u0001\u0000\u0000\u0000\u01c9\u01bb\u0001\u0000"+
		"\u0000\u0000\u01c9\u01bc\u0001\u0000\u0000\u0000\u01c9\u01bd\u0001\u0000"+
		"\u0000\u0000\u01c9\u01be\u0001\u0000\u0000\u0000\u01c9\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c0\u0001\u0000\u0000\u0000\u01c9\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c2\u0001\u0000\u0000\u0000\u01c9\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c4\u0001\u0000\u0000\u0000\u01c9\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c6\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01caE\u0001\u0000\u0000"+
		"\u0000\u01cb\u01d0\u0003H$\u0000\u01cc\u01cd\u0005.\u0000\u0000\u01cd"+
		"\u01cf\u0003J%\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001"+
		"\u0000\u0000\u0000\u01d1G\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d4\u0007\u0000\u0000\u0000\u01d4I\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d8\u0003H$\u0000\u01d6\u01d8\u00050\u0000\u0000\u01d7"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d8"+
		"K\u0001\u0000\u0000\u0000\u01d9\u01de\u00050\u0000\u0000\u01da\u01db\u0005"+
		"%\u0000\u0000\u01db\u01dd\u00050\u0000\u0000\u01dc\u01da\u0001\u0000\u0000"+
		"\u0000\u01dd\u01e0\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000"+
		"\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01dfM\u0001\u0000\u0000\u0000"+
		"\u01e0\u01de\u0001\u0000\u0000\u00007TV^cimv\u0081\u0083\u0092\u0094\u00a5"+
		"\u00a7\u00ae\u00ba\u00c2\u00c8\u00d0\u00d7\u00dc\u00df\u00e2\u00e7\u00ed"+
		"\u00f0\u00f8\u00fb\u0101\u0106\u010c\u0110\u0115\u0118\u0120\u0129\u012c"+
		"\u0134\u0137\u013c\u0140\u0146\u0148\u014d\u014f\u015f\u0164\u017b\u0184"+
		"\u01b0\u01b6\u01b8\u01c9\u01d0\u01d7\u01de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}