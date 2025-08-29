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
		ISABELLE_COMMENT_BLOCK=1, ANTI_OPEN=2, ANTI_CLOSE=3, DATASPACE=4, CONSTANTS=5, 
		ASSUMES=6, VARIABLES=7, ABBREVIATION=8, DEFINITION=9, WHERE=10, AND=11, 
		CONTEXT=12, BEGIN=13, END=14, ASSIGN=15, D_COLON=16, COLON=17, ARROW=18, 
		LPAREN=19, RPAREN=20, LBRACK=21, RBRACK=22, COMMA=23, CARET=24, STAR=25, 
		PLUS=26, MINUS=27, DOT=28, SLASH=29, ASCII_ID=30, SYMBOL_IDENT=31, SUBSCRIPT=32, 
		SUPERSCRIPT=33, NUMBER=34, QUOTED_TEXT=35, WS=36, COMMENT=37;
	public static final int
		RULE_program = 0, RULE_contextBlock = 1, RULE_contextBody = 2, RULE_definitionDecl = 3, 
		RULE_dataspaceDecl = 4, RULE_dataspaceBody = 5, RULE_constantsClause = 6, 
		RULE_constantDecl = 7, RULE_assumesClause = 8, RULE_assumptionDecl = 9, 
		RULE_variablesClause = 10, RULE_varDecl = 11, RULE_abbrevDecl = 12, RULE_printSpec = 13, 
		RULE_precedenceAnn = 14, RULE_innerPrec = 15, RULE_mixfixForm = 16, RULE_antiquotBlock = 17, 
		RULE_antiquotContent = 18, RULE_antiquotUnit = 19, RULE_typeSpec = 20, 
		RULE_typeAtom = 21, RULE_ident = 22, RULE_idseg = 23, RULE_idsegOrNum = 24, 
		RULE_numberList = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "contextBlock", "contextBody", "definitionDecl", "dataspaceDecl", 
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
			null, null, null, null, "'dataspace'", "'constants'", "'assumes'", "'variables'", 
			"'abbreviation'", "'definition'", "'where'", "'and'", "'context'", "'begin'", 
			"'end'", "'='", "'::'", "':'", "'=>'", "'('", "')'", "'['", "']'", "','", 
			"'^'", "'*'", "'+'", "'-'", "'.'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ISABELLE_COMMENT_BLOCK", "ANTI_OPEN", "ANTI_CLOSE", "DATASPACE", 
			"CONSTANTS", "ASSUMES", "VARIABLES", "ABBREVIATION", "DEFINITION", "WHERE", 
			"AND", "CONTEXT", "BEGIN", "END", "ASSIGN", "D_COLON", "COLON", "ARROW", 
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
		public List<ContextBlockContext> contextBlock() {
			return getRuleContexts(ContextBlockContext.class);
		}
		public ContextBlockContext contextBlock(int i) {
			return getRuleContext(ContextBlockContext.class,i);
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4368L) != 0)) {
				{
				setState(55);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATASPACE:
					{
					setState(52);
					dataspaceDecl();
					}
					break;
				case ABBREVIATION:
					{
					setState(53);
					abbrevDecl();
					}
					break;
				case CONTEXT:
					{
					setState(54);
					contextBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
		enterRule(_localctx, 2, RULE_contextBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(CONTEXT);
			setState(63);
			ident();
			setState(64);
			match(BEGIN);
			setState(65);
			contextBody();
			setState(66);
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
		enterRule(_localctx, 4, RULE_contextBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 992L) != 0)) {
				{
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ABBREVIATION:
					{
					setState(68);
					abbrevDecl();
					}
					break;
				case DEFINITION:
					{
					setState(69);
					definitionDecl();
					}
					break;
				case CONSTANTS:
					{
					setState(70);
					constantsClause();
					}
					break;
				case ASSUMES:
					{
					setState(71);
					assumesClause();
					}
					break;
				case VARIABLES:
					{
					setState(72);
					variablesClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(77);
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
		enterRule(_localctx, 6, RULE_definitionDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(DEFINITION);
			setState(79);
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
		enterRule(_localctx, 8, RULE_dataspaceDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(DATASPACE);
			setState(82);
			ident();
			setState(83);
			match(ASSIGN);
			setState(84);
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
		enterRule(_localctx, 10, RULE_dataspaceBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(91);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CONSTANTS:
						{
						setState(86);
						constantsClause();
						}
						break;
					case ASSUMES:
						{
						setState(87);
						assumesClause();
						}
						break;
					case VARIABLES:
						{
						setState(88);
						variablesClause();
						}
						break;
					case ABBREVIATION:
						{
						setState(89);
						abbrevDecl();
						}
						break;
					case DEFINITION:
						{
						setState(90);
						definitionDecl();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 12, RULE_constantsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(CONSTANTS);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				constantDecl();
				}
				}
				setState(100); 
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
		enterRule(_localctx, 14, RULE_constantDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			ident();
			setState(103);
			match(D_COLON);
			setState(104);
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
		enterRule(_localctx, 16, RULE_assumesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ASSUMES);
			setState(107);
			assumptionDecl();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(108);
				match(AND);
				setState(109);
				assumptionDecl();
				}
				}
				setState(114);
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
		enterRule(_localctx, 18, RULE_assumptionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			ident();
			setState(116);
			match(COLON);
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117);
				match(QUOTED_TEXT);
				}
				}
				setState(120); 
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
		enterRule(_localctx, 20, RULE_variablesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(VARIABLES);
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123);
				varDecl();
				}
				}
				setState(126); 
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
		enterRule(_localctx, 22, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			ident();
			setState(129);
			match(D_COLON);
			setState(130);
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
		enterRule(_localctx, 24, RULE_abbrevDecl);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(ABBREVIATION);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(133);
					match(DOT);
					}
				}

				setState(136);
				match(QUOTED_TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(ABBREVIATION);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(138);
					match(LPAREN);
					setState(139);
					match(ASCII_ID);
					setState(140);
					match(RPAREN);
					}
				}

				setState(143);
				ident();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==D_COLON) {
					{
					setState(144);
					match(D_COLON);
					setState(145);
					match(QUOTED_TEXT);
					}
				}

				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(148);
					printSpec();
					}
				}

				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK || _la==NUMBER) {
					{
					setState(151);
					precedenceAnn();
					}
				}

				setState(154);
				match(WHERE);
				setState(155);
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
		enterRule(_localctx, 26, RULE_printSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(LPAREN);
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				{
				setState(160);
				match(QUOTED_TEXT);
				}
				break;
			case ASCII_ID:
				{
				setState(161);
				mixfixForm();
				}
				break;
			case ANTI_OPEN:
				{
				setState(162);
				antiquotBlock();
				}
				break;
			case RPAREN:
			case LBRACK:
				break;
			default:
				break;
			}
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(165);
				innerPrec();
				}
			}

			setState(168);
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
		enterRule(_localctx, 28, RULE_precedenceAnn);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(170);
				match(LBRACK);
				setState(171);
				numberList();
				setState(172);
				match(RBRACK);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(173);
					match(NUMBER);
					}
				}

				}
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
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
		enterRule(_localctx, 30, RULE_innerPrec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(LBRACK);
			setState(180);
			numberList();
			setState(181);
			match(RBRACK);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(182);
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
		enterRule(_localctx, 32, RULE_mixfixForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ASCII_ID);
			setState(186);
			match(QUOTED_TEXT);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(187);
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
		enterRule(_localctx, 34, RULE_antiquotBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(ANTI_OPEN);
			setState(191);
			antiquotContent();
			setState(192);
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
		enterRule(_localctx, 36, RULE_antiquotContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 64424509428L) != 0)) {
				{
				{
				setState(194);
				antiquotUnit();
				}
				}
				setState(199);
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
		enterRule(_localctx, 38, RULE_antiquotUnit);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				antiquotBlock();
				}
				break;
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(QUOTED_TEXT);
				}
				break;
			case ASCII_ID:
			case SYMBOL_IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				ident();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				match(NUMBER);
				}
				break;
			case SUPERSCRIPT:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				match(SUPERSCRIPT);
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				match(ARROW);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				match(LPAREN);
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 8);
				{
				setState(207);
				match(RPAREN);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 9);
				{
				setState(208);
				match(LBRACK);
				}
				break;
			case RBRACK:
				enterOuterAlt(_localctx, 10);
				{
				setState(209);
				match(RBRACK);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 11);
				{
				setState(210);
				match(COMMA);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 12);
				{
				setState(211);
				match(CARET);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 13);
				{
				setState(212);
				match(STAR);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 14);
				{
				setState(213);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 15);
				{
				setState(214);
				match(MINUS);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 16);
				{
				setState(215);
				match(DOT);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 17);
				{
				setState(216);
				match(SLASH);
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 18);
				{
				setState(217);
				match(ASSIGN);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 19);
				{
				setState(218);
				match(COLON);
				}
				break;
			case D_COLON:
				enterOuterAlt(_localctx, 20);
				{
				setState(219);
				match(D_COLON);
				}
				break;
			case DATASPACE:
				enterOuterAlt(_localctx, 21);
				{
				setState(220);
				match(DATASPACE);
				}
				break;
			case CONSTANTS:
				enterOuterAlt(_localctx, 22);
				{
				setState(221);
				match(CONSTANTS);
				}
				break;
			case ASSUMES:
				enterOuterAlt(_localctx, 23);
				{
				setState(222);
				match(ASSUMES);
				}
				break;
			case VARIABLES:
				enterOuterAlt(_localctx, 24);
				{
				setState(223);
				match(VARIABLES);
				}
				break;
			case ABBREVIATION:
				enterOuterAlt(_localctx, 25);
				{
				setState(224);
				match(ABBREVIATION);
				}
				break;
			case WHERE:
				enterOuterAlt(_localctx, 26);
				{
				setState(225);
				match(WHERE);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 27);
				{
				setState(226);
				match(AND);
				}
				break;
			case CONTEXT:
				enterOuterAlt(_localctx, 28);
				{
				setState(227);
				match(CONTEXT);
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 29);
				{
				setState(228);
				match(BEGIN);
				}
				break;
			case END:
				enterOuterAlt(_localctx, 30);
				{
				setState(229);
				match(END);
				}
				break;
			case DEFINITION:
				enterOuterAlt(_localctx, 31);
				{
				setState(230);
				match(DEFINITION);
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
		enterRule(_localctx, 40, RULE_typeSpec);
		try {
			int _alt;
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
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
				setState(235); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(234);
						typeAtom();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(237); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 42, RULE_typeAtom);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII_ID:
			case SYMBOL_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				ident();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(NUMBER);
				}
				break;
			case SUPERSCRIPT:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(SUPERSCRIPT);
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(ARROW);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				match(LPAREN);
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				match(RPAREN);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 7);
				{
				setState(247);
				match(LBRACK);
				}
				break;
			case RBRACK:
				enterOuterAlt(_localctx, 8);
				{
				setState(248);
				match(RBRACK);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 9);
				{
				setState(249);
				match(COMMA);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 10);
				{
				setState(250);
				match(CARET);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(251);
				match(STAR);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 12);
				{
				setState(252);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 13);
				{
				setState(253);
				match(MINUS);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 14);
				{
				setState(254);
				match(DOT);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 15);
				{
				setState(255);
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
		enterRule(_localctx, 44, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			idseg();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUBSCRIPT) {
				{
				{
				setState(259);
				match(SUBSCRIPT);
				setState(260);
				idsegOrNum();
				}
				}
				setState(265);
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
		enterRule(_localctx, 46, RULE_idseg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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
		enterRule(_localctx, 48, RULE_idsegOrNum);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII_ID:
			case SYMBOL_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				idseg();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
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
		enterRule(_localctx, 50, RULE_numberList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(NUMBER);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(273);
				match(COMMA);
				setState(274);
				match(NUMBER);
				}
				}
				setState(279);
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
		"\u0004\u0001%\u0119\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"8\b\u0000\n\u0000\f\u0000;\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002J\b\u0002"+
		"\n\u0002\f\u0002M\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\\\b\u0005\n\u0005\f\u0005"+
		"_\t\u0005\u0001\u0006\u0001\u0006\u0004\u0006c\b\u0006\u000b\u0006\f\u0006"+
		"d\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\bo\b\b\n\b\f\br\t\b\u0001\t\u0001\t\u0001\t\u0004\tw"+
		"\b\t\u000b\t\f\tx\u0001\n\u0001\n\u0004\n}\b\n\u000b\n\f\n~\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u0087\b\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u008e\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u0093\b\f\u0001\f\u0003\f\u0096\b\f\u0001\f\u0003\f"+
		"\u0099\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u009e\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00a4\b\r\u0001\r\u0003\r\u00a7\b\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00af\b\u000e"+
		"\u0001\u000e\u0003\u000e\u00b2\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00b8\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00bd\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0005\u0012\u00c4\b\u0012\n\u0012\f\u0012\u00c7\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00e8\b\u0013\u0001\u0014\u0001\u0014\u0004\u0014\u00ec"+
		"\b\u0014\u000b\u0014\f\u0014\u00ed\u0003\u0014\u00f0\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0101\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u0106\b\u0016\n\u0016\f\u0016\u0109\t\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u010f\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0114\b\u0019\n\u0019\f\u0019"+
		"\u0117\t\u0019\u0001\u0019\u0000\u0000\u001a\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"\u0000\u0001\u0001\u0000\u001e\u001f\u014f\u00009\u0001\u0000\u0000\u0000"+
		"\u0002>\u0001\u0000\u0000\u0000\u0004K\u0001\u0000\u0000\u0000\u0006N"+
		"\u0001\u0000\u0000\u0000\bQ\u0001\u0000\u0000\u0000\n]\u0001\u0000\u0000"+
		"\u0000\f`\u0001\u0000\u0000\u0000\u000ef\u0001\u0000\u0000\u0000\u0010"+
		"j\u0001\u0000\u0000\u0000\u0012s\u0001\u0000\u0000\u0000\u0014z\u0001"+
		"\u0000\u0000\u0000\u0016\u0080\u0001\u0000\u0000\u0000\u0018\u009d\u0001"+
		"\u0000\u0000\u0000\u001a\u009f\u0001\u0000\u0000\u0000\u001c\u00b1\u0001"+
		"\u0000\u0000\u0000\u001e\u00b3\u0001\u0000\u0000\u0000 \u00b9\u0001\u0000"+
		"\u0000\u0000\"\u00be\u0001\u0000\u0000\u0000$\u00c5\u0001\u0000\u0000"+
		"\u0000&\u00e7\u0001\u0000\u0000\u0000(\u00ef\u0001\u0000\u0000\u0000*"+
		"\u0100\u0001\u0000\u0000\u0000,\u0102\u0001\u0000\u0000\u0000.\u010a\u0001"+
		"\u0000\u0000\u00000\u010e\u0001\u0000\u0000\u00002\u0110\u0001\u0000\u0000"+
		"\u000048\u0003\b\u0004\u000058\u0003\u0018\f\u000068\u0003\u0002\u0001"+
		"\u000074\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000076\u0001\u0000"+
		"\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		"<=\u0005\u0000\u0000\u0001=\u0001\u0001\u0000\u0000\u0000>?\u0005\f\u0000"+
		"\u0000?@\u0003,\u0016\u0000@A\u0005\r\u0000\u0000AB\u0003\u0004\u0002"+
		"\u0000BC\u0005\u000e\u0000\u0000C\u0003\u0001\u0000\u0000\u0000DJ\u0003"+
		"\u0018\f\u0000EJ\u0003\u0006\u0003\u0000FJ\u0003\f\u0006\u0000GJ\u0003"+
		"\u0010\b\u0000HJ\u0003\u0014\n\u0000ID\u0001\u0000\u0000\u0000IE\u0001"+
		"\u0000\u0000\u0000IF\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000L\u0005\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000NO\u0005\t\u0000\u0000OP\u0005#\u0000\u0000P\u0007\u0001"+
		"\u0000\u0000\u0000QR\u0005\u0004\u0000\u0000RS\u0003,\u0016\u0000ST\u0005"+
		"\u000f\u0000\u0000TU\u0003\n\u0005\u0000U\t\u0001\u0000\u0000\u0000V\\"+
		"\u0003\f\u0006\u0000W\\\u0003\u0010\b\u0000X\\\u0003\u0014\n\u0000Y\\"+
		"\u0003\u0018\f\u0000Z\\\u0003\u0006\u0003\u0000[V\u0001\u0000\u0000\u0000"+
		"[W\u0001\u0000\u0000\u0000[X\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^\u000b\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000`b\u0005\u0005\u0000\u0000ac\u0003\u000e\u0007"+
		"\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000e\r\u0001\u0000\u0000\u0000fg\u0003"+
		",\u0016\u0000gh\u0005\u0010\u0000\u0000hi\u0003(\u0014\u0000i\u000f\u0001"+
		"\u0000\u0000\u0000jk\u0005\u0006\u0000\u0000kp\u0003\u0012\t\u0000lm\u0005"+
		"\u000b\u0000\u0000mo\u0003\u0012\t\u0000nl\u0001\u0000\u0000\u0000or\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"q\u0011\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0003,\u0016"+
		"\u0000tv\u0005\u0011\u0000\u0000uw\u0005#\u0000\u0000vu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y\u0013\u0001\u0000\u0000\u0000z|\u0005\u0007\u0000\u0000"+
		"{}\u0003\u0016\u000b\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0015\u0001\u0000\u0000\u0000\u0080\u0081\u0003,\u0016\u0000\u0081\u0082"+
		"\u0005\u0010\u0000\u0000\u0082\u0083\u0003(\u0014\u0000\u0083\u0017\u0001"+
		"\u0000\u0000\u0000\u0084\u0086\u0005\b\u0000\u0000\u0085\u0087\u0005\u001c"+
		"\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u009e\u0005#\u0000"+
		"\u0000\u0089\u008d\u0005\b\u0000\u0000\u008a\u008b\u0005\u0013\u0000\u0000"+
		"\u008b\u008c\u0005\u001e\u0000\u0000\u008c\u008e\u0005\u0014\u0000\u0000"+
		"\u008d\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0092\u0003,\u0016\u0000\u0090"+
		"\u0091\u0005\u0010\u0000\u0000\u0091\u0093\u0005#\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095"+
		"\u0001\u0000\u0000\u0000\u0094\u0096\u0003\u001a\r\u0000\u0095\u0094\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001"+
		"\u0000\u0000\u0000\u0097\u0099\u0003\u001c\u000e\u0000\u0098\u0097\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0005\n\u0000\u0000\u009b\u009c\u0005#"+
		"\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u0084\u0001\u0000"+
		"\u0000\u0000\u009d\u0089\u0001\u0000\u0000\u0000\u009e\u0019\u0001\u0000"+
		"\u0000\u0000\u009f\u00a3\u0005\u0013\u0000\u0000\u00a0\u00a4\u0005#\u0000"+
		"\u0000\u00a1\u00a4\u0003 \u0010\u0000\u00a2\u00a4\u0003\"\u0011\u0000"+
		"\u00a3\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a7\u0003\u001e\u000f\u0000"+
		"\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0014\u0000\u0000"+
		"\u00a9\u001b\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0015\u0000\u0000"+
		"\u00ab\u00ac\u00032\u0019\u0000\u00ac\u00ae\u0005\u0016\u0000\u0000\u00ad"+
		"\u00af\u0005\"\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00b2"+
		"\u0005\"\u0000\u0000\u00b1\u00aa\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b2\u001d\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005"+
		"\u0015\u0000\u0000\u00b4\u00b5\u00032\u0019\u0000\u00b5\u00b7\u0005\u0016"+
		"\u0000\u0000\u00b6\u00b8\u0005\"\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u001f\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0005\u001e\u0000\u0000\u00ba\u00bc\u0005#\u0000\u0000"+
		"\u00bb\u00bd\u0005\"\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd!\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0005\u0002\u0000\u0000\u00bf\u00c0\u0003$\u0012\u0000\u00c0\u00c1\u0005"+
		"\u0003\u0000\u0000\u00c1#\u0001\u0000\u0000\u0000\u00c2\u00c4\u0003&\u0013"+
		"\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6%\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c8\u00e8\u0003\"\u0011\u0000\u00c9\u00e8\u0005#\u0000\u0000\u00ca"+
		"\u00e8\u0003,\u0016\u0000\u00cb\u00e8\u0005\"\u0000\u0000\u00cc\u00e8"+
		"\u0005!\u0000\u0000\u00cd\u00e8\u0005\u0012\u0000\u0000\u00ce\u00e8\u0005"+
		"\u0013\u0000\u0000\u00cf\u00e8\u0005\u0014\u0000\u0000\u00d0\u00e8\u0005"+
		"\u0015\u0000\u0000\u00d1\u00e8\u0005\u0016\u0000\u0000\u00d2\u00e8\u0005"+
		"\u0017\u0000\u0000\u00d3\u00e8\u0005\u0018\u0000\u0000\u00d4\u00e8\u0005"+
		"\u0019\u0000\u0000\u00d5\u00e8\u0005\u001a\u0000\u0000\u00d6\u00e8\u0005"+
		"\u001b\u0000\u0000\u00d7\u00e8\u0005\u001c\u0000\u0000\u00d8\u00e8\u0005"+
		"\u001d\u0000\u0000\u00d9\u00e8\u0005\u000f\u0000\u0000\u00da\u00e8\u0005"+
		"\u0011\u0000\u0000\u00db\u00e8\u0005\u0010\u0000\u0000\u00dc\u00e8\u0005"+
		"\u0004\u0000\u0000\u00dd\u00e8\u0005\u0005\u0000\u0000\u00de\u00e8\u0005"+
		"\u0006\u0000\u0000\u00df\u00e8\u0005\u0007\u0000\u0000\u00e0\u00e8\u0005"+
		"\b\u0000\u0000\u00e1\u00e8\u0005\n\u0000\u0000\u00e2\u00e8\u0005\u000b"+
		"\u0000\u0000\u00e3\u00e8\u0005\f\u0000\u0000\u00e4\u00e8\u0005\r\u0000"+
		"\u0000\u00e5\u00e8\u0005\u000e\u0000\u0000\u00e6\u00e8\u0005\t\u0000\u0000"+
		"\u00e7\u00c8\u0001\u0000\u0000\u0000\u00e7\u00c9\u0001\u0000\u0000\u0000"+
		"\u00e7\u00ca\u0001\u0000\u0000\u0000\u00e7\u00cb\u0001\u0000\u0000\u0000"+
		"\u00e7\u00cc\u0001\u0000\u0000\u0000\u00e7\u00cd\u0001\u0000\u0000\u0000"+
		"\u00e7\u00ce\u0001\u0000\u0000\u0000\u00e7\u00cf\u0001\u0000\u0000\u0000"+
		"\u00e7\u00d0\u0001\u0000\u0000\u0000\u00e7\u00d1\u0001\u0000\u0000\u0000"+
		"\u00e7\u00d2\u0001\u0000\u0000\u0000\u00e7\u00d3\u0001\u0000\u0000\u0000"+
		"\u00e7\u00d4\u0001\u0000\u0000\u0000\u00e7\u00d5\u0001\u0000\u0000\u0000"+
		"\u00e7\u00d6\u0001\u0000\u0000\u0000\u00e7\u00d7\u0001\u0000\u0000\u0000"+
		"\u00e7\u00d8\u0001\u0000\u0000\u0000\u00e7\u00d9\u0001\u0000\u0000\u0000"+
		"\u00e7\u00da\u0001\u0000\u0000\u0000\u00e7\u00db\u0001\u0000\u0000\u0000"+
		"\u00e7\u00dc\u0001\u0000\u0000\u0000\u00e7\u00dd\u0001\u0000\u0000\u0000"+
		"\u00e7\u00de\u0001\u0000\u0000\u0000\u00e7\u00df\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e0\u0001\u0000\u0000\u0000\u00e7\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e2\u0001\u0000\u0000\u0000\u00e7\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\'\u0001\u0000\u0000\u0000\u00e9"+
		"\u00f0\u0005#\u0000\u0000\u00ea\u00ec\u0003*\u0015\u0000\u00eb\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001"+
		"\u0000\u0000\u0000\u00ef\u00e9\u0001\u0000\u0000\u0000\u00ef\u00eb\u0001"+
		"\u0000\u0000\u0000\u00f0)\u0001\u0000\u0000\u0000\u00f1\u0101\u0003,\u0016"+
		"\u0000\u00f2\u0101\u0005\"\u0000\u0000\u00f3\u0101\u0005!\u0000\u0000"+
		"\u00f4\u0101\u0005\u0012\u0000\u0000\u00f5\u0101\u0005\u0013\u0000\u0000"+
		"\u00f6\u0101\u0005\u0014\u0000\u0000\u00f7\u0101\u0005\u0015\u0000\u0000"+
		"\u00f8\u0101\u0005\u0016\u0000\u0000\u00f9\u0101\u0005\u0017\u0000\u0000"+
		"\u00fa\u0101\u0005\u0018\u0000\u0000\u00fb\u0101\u0005\u0019\u0000\u0000"+
		"\u00fc\u0101\u0005\u001a\u0000\u0000\u00fd\u0101\u0005\u001b\u0000\u0000"+
		"\u00fe\u0101\u0005\u001c\u0000\u0000\u00ff\u0101\u0005\u001d\u0000\u0000"+
		"\u0100\u00f1\u0001\u0000\u0000\u0000\u0100\u00f2\u0001\u0000\u0000\u0000"+
		"\u0100\u00f3\u0001\u0000\u0000\u0000\u0100\u00f4\u0001\u0000\u0000\u0000"+
		"\u0100\u00f5\u0001\u0000\u0000\u0000\u0100\u00f6\u0001\u0000\u0000\u0000"+
		"\u0100\u00f7\u0001\u0000\u0000\u0000\u0100\u00f8\u0001\u0000\u0000\u0000"+
		"\u0100\u00f9\u0001\u0000\u0000\u0000\u0100\u00fa\u0001\u0000\u0000\u0000"+
		"\u0100\u00fb\u0001\u0000\u0000\u0000\u0100\u00fc\u0001\u0000\u0000\u0000"+
		"\u0100\u00fd\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0100\u00ff\u0001\u0000\u0000\u0000\u0101+\u0001\u0000\u0000\u0000\u0102"+
		"\u0107\u0003.\u0017\u0000\u0103\u0104\u0005 \u0000\u0000\u0104\u0106\u0003"+
		"0\u0018\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000"+
		"\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000"+
		"\u0000\u0000\u0108-\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0007\u0000\u0000\u0000\u010b/\u0001\u0000\u0000\u0000"+
		"\u010c\u010f\u0003.\u0017\u0000\u010d\u010f\u0005\"\u0000\u0000\u010e"+
		"\u010c\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f"+
		"1\u0001\u0000\u0000\u0000\u0110\u0115\u0005\"\u0000\u0000\u0111\u0112"+
		"\u0005\u0017\u0000\u0000\u0112\u0114\u0005\"\u0000\u0000\u0113\u0111\u0001"+
		"\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000\u0000\u0115\u0113\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u01163\u0001\u0000"+
		"\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u001e79IK[]dpx~\u0086"+
		"\u008d\u0092\u0095\u0098\u009d\u00a3\u00a6\u00ae\u00b1\u00b7\u00bc\u00c5"+
		"\u00e7\u00ed\u00ef\u0100\u0107\u010e\u0115";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}