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
		ASSUMES=6, VARIABLES=7, ABBREVIATION=8, WHERE=9, AND=10, ASSIGN=11, D_COLON=12, 
		COLON=13, ARROW=14, LPAREN=15, RPAREN=16, LBRACK=17, RBRACK=18, COMMA=19, 
		CARET=20, STAR=21, PLUS=22, MINUS=23, DOT=24, SLASH=25, ASCII_ID=26, SYMBOL_IDENT=27, 
		SUBSCRIPT=28, SUPERSCRIPT=29, NUMBER=30, QUOTED_TEXT=31, WS=32, COMMENT=33;
	public static final int
		RULE_program = 0, RULE_dataspaceDecl = 1, RULE_dataspaceBody = 2, RULE_constantsClause = 3, 
		RULE_constantDecl = 4, RULE_assumesClause = 5, RULE_assumptionDecl = 6, 
		RULE_variablesClause = 7, RULE_varDecl = 8, RULE_abbrevDecl = 9, RULE_printSpec = 10, 
		RULE_precedenceAnn = 11, RULE_innerPrec = 12, RULE_mixfixForm = 13, RULE_antiquotBlock = 14, 
		RULE_antiquotContent = 15, RULE_antiquotUnit = 16, RULE_typeSpec = 17, 
		RULE_typeAtom = 18, RULE_ident = 19, RULE_idseg = 20, RULE_idsegOrNum = 21, 
		RULE_numberList = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "dataspaceDecl", "dataspaceBody", "constantsClause", "constantDecl", 
			"assumesClause", "assumptionDecl", "variablesClause", "varDecl", "abbrevDecl", 
			"printSpec", "precedenceAnn", "innerPrec", "mixfixForm", "antiquotBlock", 
			"antiquotContent", "antiquotUnit", "typeSpec", "typeAtom", "ident", "idseg", 
			"idsegOrNum", "numberList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'dataspace'", "'constants'", "'assumes'", "'variables'", 
			"'abbreviation'", "'where'", "'and'", "'='", "'::'", "':'", "'=>'", "'('", 
			"')'", "'['", "']'", "','", "'^'", "'*'", "'+'", "'-'", "'.'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ISABELLE_COMMENT_BLOCK", "ANTI_OPEN", "ANTI_CLOSE", "DATASPACE", 
			"CONSTANTS", "ASSUMES", "VARIABLES", "ABBREVIATION", "WHERE", "AND", 
			"ASSIGN", "D_COLON", "COLON", "ARROW", "LPAREN", "RPAREN", "LBRACK", 
			"RBRACK", "COMMA", "CARET", "STAR", "PLUS", "MINUS", "DOT", "SLASH", 
			"ASCII_ID", "SYMBOL_IDENT", "SUBSCRIPT", "SUPERSCRIPT", "NUMBER", "QUOTED_TEXT", 
			"WS", "COMMENT"
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
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATASPACE || _la==ABBREVIATION) {
				{
				setState(48);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATASPACE:
					{
					setState(46);
					dataspaceDecl();
					}
					break;
				case ABBREVIATION:
					{
					setState(47);
					abbrevDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
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
		enterRule(_localctx, 2, RULE_dataspaceDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(DATASPACE);
			setState(56);
			ident();
			setState(57);
			match(ASSIGN);
			setState(58);
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
		enterRule(_localctx, 4, RULE_dataspaceBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(64);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CONSTANTS:
						{
						setState(60);
						constantsClause();
						}
						break;
					case ASSUMES:
						{
						setState(61);
						assumesClause();
						}
						break;
					case VARIABLES:
						{
						setState(62);
						variablesClause();
						}
						break;
					case ABBREVIATION:
						{
						setState(63);
						abbrevDecl();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		enterRule(_localctx, 6, RULE_constantsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(CONSTANTS);
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				constantDecl();
				}
				}
				setState(73); 
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
		enterRule(_localctx, 8, RULE_constantDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			ident();
			setState(76);
			match(D_COLON);
			setState(77);
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
		enterRule(_localctx, 10, RULE_assumesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(ASSUMES);
			setState(80);
			assumptionDecl();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(81);
				match(AND);
				setState(82);
				assumptionDecl();
				}
				}
				setState(87);
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
		enterRule(_localctx, 12, RULE_assumptionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			ident();
			setState(89);
			match(COLON);
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				match(QUOTED_TEXT);
				}
				}
				setState(93); 
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
		enterRule(_localctx, 14, RULE_variablesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(VARIABLES);
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				varDecl();
				}
				}
				setState(99); 
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
		enterRule(_localctx, 16, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			ident();
			setState(102);
			match(D_COLON);
			setState(103);
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
		enterRule(_localctx, 18, RULE_abbrevDecl);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(ABBREVIATION);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(106);
					match(DOT);
					}
				}

				setState(109);
				match(QUOTED_TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(ABBREVIATION);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(111);
					match(LPAREN);
					setState(112);
					match(ASCII_ID);
					setState(113);
					match(RPAREN);
					}
				}

				setState(116);
				ident();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==D_COLON) {
					{
					setState(117);
					match(D_COLON);
					setState(118);
					match(QUOTED_TEXT);
					}
				}

				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(121);
					printSpec();
					}
				}

				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK || _la==NUMBER) {
					{
					setState(124);
					precedenceAnn();
					}
				}

				setState(127);
				match(WHERE);
				setState(128);
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
		enterRule(_localctx, 20, RULE_printSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(LPAREN);
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				{
				setState(133);
				match(QUOTED_TEXT);
				}
				break;
			case ASCII_ID:
				{
				setState(134);
				mixfixForm();
				}
				break;
			case ANTI_OPEN:
				{
				setState(135);
				antiquotBlock();
				}
				break;
			case RPAREN:
			case LBRACK:
				break;
			default:
				break;
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(138);
				innerPrec();
				}
			}

			setState(141);
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
		enterRule(_localctx, 22, RULE_precedenceAnn);
		int _la;
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(143);
				match(LBRACK);
				setState(144);
				numberList();
				setState(145);
				match(RBRACK);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(146);
					match(NUMBER);
					}
				}

				}
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
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
		enterRule(_localctx, 24, RULE_innerPrec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(LBRACK);
			setState(153);
			numberList();
			setState(154);
			match(RBRACK);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(155);
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
		enterRule(_localctx, 26, RULE_mixfixForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ASCII_ID);
			setState(159);
			match(QUOTED_TEXT);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(160);
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
		enterRule(_localctx, 28, RULE_antiquotBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ANTI_OPEN);
			setState(164);
			antiquotContent();
			setState(165);
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
		enterRule(_localctx, 30, RULE_antiquotContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4026531828L) != 0)) {
				{
				{
				setState(167);
				antiquotUnit();
				}
				}
				setState(172);
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
		enterRule(_localctx, 32, RULE_antiquotUnit);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				antiquotBlock();
				}
				break;
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(QUOTED_TEXT);
				}
				break;
			case ASCII_ID:
			case SYMBOL_IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				ident();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(NUMBER);
				}
				break;
			case SUPERSCRIPT:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(SUPERSCRIPT);
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				match(ARROW);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				match(LPAREN);
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 8);
				{
				setState(180);
				match(RPAREN);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 9);
				{
				setState(181);
				match(LBRACK);
				}
				break;
			case RBRACK:
				enterOuterAlt(_localctx, 10);
				{
				setState(182);
				match(RBRACK);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 11);
				{
				setState(183);
				match(COMMA);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 12);
				{
				setState(184);
				match(CARET);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 13);
				{
				setState(185);
				match(STAR);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 14);
				{
				setState(186);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 15);
				{
				setState(187);
				match(MINUS);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 16);
				{
				setState(188);
				match(DOT);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 17);
				{
				setState(189);
				match(SLASH);
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 18);
				{
				setState(190);
				match(ASSIGN);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 19);
				{
				setState(191);
				match(COLON);
				}
				break;
			case D_COLON:
				enterOuterAlt(_localctx, 20);
				{
				setState(192);
				match(D_COLON);
				}
				break;
			case DATASPACE:
				enterOuterAlt(_localctx, 21);
				{
				setState(193);
				match(DATASPACE);
				}
				break;
			case CONSTANTS:
				enterOuterAlt(_localctx, 22);
				{
				setState(194);
				match(CONSTANTS);
				}
				break;
			case ASSUMES:
				enterOuterAlt(_localctx, 23);
				{
				setState(195);
				match(ASSUMES);
				}
				break;
			case VARIABLES:
				enterOuterAlt(_localctx, 24);
				{
				setState(196);
				match(VARIABLES);
				}
				break;
			case ABBREVIATION:
				enterOuterAlt(_localctx, 25);
				{
				setState(197);
				match(ABBREVIATION);
				}
				break;
			case WHERE:
				enterOuterAlt(_localctx, 26);
				{
				setState(198);
				match(WHERE);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 27);
				{
				setState(199);
				match(AND);
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
		enterRule(_localctx, 34, RULE_typeSpec);
		try {
			int _alt;
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
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
				setState(204); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(203);
						typeAtom();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(206); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 36, RULE_typeAtom);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII_ID:
			case SYMBOL_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				ident();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(NUMBER);
				}
				break;
			case SUPERSCRIPT:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(SUPERSCRIPT);
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(ARROW);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				match(LPAREN);
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(215);
				match(RPAREN);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 7);
				{
				setState(216);
				match(LBRACK);
				}
				break;
			case RBRACK:
				enterOuterAlt(_localctx, 8);
				{
				setState(217);
				match(RBRACK);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 9);
				{
				setState(218);
				match(COMMA);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 10);
				{
				setState(219);
				match(CARET);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(220);
				match(STAR);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 12);
				{
				setState(221);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 13);
				{
				setState(222);
				match(MINUS);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 14);
				{
				setState(223);
				match(DOT);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 15);
				{
				setState(224);
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
		enterRule(_localctx, 38, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			idseg();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUBSCRIPT) {
				{
				{
				setState(228);
				match(SUBSCRIPT);
				setState(229);
				idsegOrNum();
				}
				}
				setState(234);
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
		enterRule(_localctx, 40, RULE_idseg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
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
		enterRule(_localctx, 42, RULE_idsegOrNum);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII_ID:
			case SYMBOL_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				idseg();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
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
		enterRule(_localctx, 44, RULE_numberList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(NUMBER);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(242);
				match(COMMA);
				setState(243);
				match(NUMBER);
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

	public static final String _serializedATN =
		"\u0004\u0001!\u00fa\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0005\u00001\b\u0000"+
		"\n\u0000\f\u00004\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002A\b\u0002\n\u0002\f\u0002D\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0004\u0003H\b\u0003\u000b\u0003\f\u0003I\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005T\b\u0005\n\u0005\f\u0005W\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0004\u0006\\\b\u0006\u000b\u0006\f\u0006]\u0001\u0007"+
		"\u0001\u0007\u0004\u0007b\b\u0007\u000b\u0007\f\u0007c\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0003\tl\b\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\ts\b\t\u0001\t\u0001\t\u0001\t\u0003\tx\b\t\u0001"+
		"\t\u0003\t{\b\t\u0001\t\u0003\t~\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u0083"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0089\b\n\u0001\n\u0003\n"+
		"\u008c\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0094\b\u000b\u0001\u000b\u0003\u000b\u0097\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u009d\b\f\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00a2\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0005\u000f\u00a9\b\u000f\n\u000f\f\u000f\u00ac\t\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00c9\b\u0010\u0001\u0011\u0001\u0011\u0004"+
		"\u0011\u00cd\b\u0011\u000b\u0011\f\u0011\u00ce\u0003\u0011\u00d1\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00e2\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u00e7\b\u0013\n\u0013\f\u0013\u00ea"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u00f0"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00f5\b\u0016"+
		"\n\u0016\f\u0016\u00f8\t\u0016\u0001\u0016\u0000\u0000\u0017\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,\u0000\u0001\u0001\u0000\u001a\u001b\u0128\u00002\u0001\u0000"+
		"\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u0004B\u0001\u0000\u0000\u0000"+
		"\u0006E\u0001\u0000\u0000\u0000\bK\u0001\u0000\u0000\u0000\nO\u0001\u0000"+
		"\u0000\u0000\fX\u0001\u0000\u0000\u0000\u000e_\u0001\u0000\u0000\u0000"+
		"\u0010e\u0001\u0000\u0000\u0000\u0012\u0082\u0001\u0000\u0000\u0000\u0014"+
		"\u0084\u0001\u0000\u0000\u0000\u0016\u0096\u0001\u0000\u0000\u0000\u0018"+
		"\u0098\u0001\u0000\u0000\u0000\u001a\u009e\u0001\u0000\u0000\u0000\u001c"+
		"\u00a3\u0001\u0000\u0000\u0000\u001e\u00aa\u0001\u0000\u0000\u0000 \u00c8"+
		"\u0001\u0000\u0000\u0000\"\u00d0\u0001\u0000\u0000\u0000$\u00e1\u0001"+
		"\u0000\u0000\u0000&\u00e3\u0001\u0000\u0000\u0000(\u00eb\u0001\u0000\u0000"+
		"\u0000*\u00ef\u0001\u0000\u0000\u0000,\u00f1\u0001\u0000\u0000\u0000."+
		"1\u0003\u0002\u0001\u0000/1\u0003\u0012\t\u00000.\u0001\u0000\u0000\u0000"+
		"0/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000035\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000056\u0005\u0000\u0000\u00016\u0001\u0001\u0000\u0000\u0000"+
		"78\u0005\u0004\u0000\u000089\u0003&\u0013\u00009:\u0005\u000b\u0000\u0000"+
		":;\u0003\u0004\u0002\u0000;\u0003\u0001\u0000\u0000\u0000<A\u0003\u0006"+
		"\u0003\u0000=A\u0003\n\u0005\u0000>A\u0003\u000e\u0007\u0000?A\u0003\u0012"+
		"\t\u0000@<\u0001\u0000\u0000\u0000@=\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0005\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000EG\u0005\u0005\u0000\u0000FH\u0003\b\u0004"+
		"\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0007\u0001\u0000\u0000\u0000"+
		"KL\u0003&\u0013\u0000LM\u0005\f\u0000\u0000MN\u0003\"\u0011\u0000N\t\u0001"+
		"\u0000\u0000\u0000OP\u0005\u0006\u0000\u0000PU\u0003\f\u0006\u0000QR\u0005"+
		"\n\u0000\u0000RT\u0003\f\u0006\u0000SQ\u0001\u0000\u0000\u0000TW\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"V\u000b\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0003&\u0013"+
		"\u0000Y[\u0005\r\u0000\u0000Z\\\u0005\u001f\u0000\u0000[Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^\r\u0001\u0000\u0000\u0000_a\u0005\u0007\u0000\u0000"+
		"`b\u0003\u0010\b\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u000f\u0001\u0000"+
		"\u0000\u0000ef\u0003&\u0013\u0000fg\u0005\f\u0000\u0000gh\u0003\"\u0011"+
		"\u0000h\u0011\u0001\u0000\u0000\u0000ik\u0005\b\u0000\u0000jl\u0005\u0018"+
		"\u0000\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000m\u0083\u0005\u001f\u0000\u0000nr\u0005\b\u0000\u0000"+
		"op\u0005\u000f\u0000\u0000pq\u0005\u001a\u0000\u0000qs\u0005\u0010\u0000"+
		"\u0000ro\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tw\u0003&\u0013\u0000uv\u0005\f\u0000\u0000vx\u0005\u001f"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001"+
		"\u0000\u0000\u0000y{\u0003\u0014\n\u0000zy\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|~\u0003\u0016\u000b\u0000"+
		"}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005\t\u0000\u0000\u0080\u0081\u0005\u001f\u0000"+
		"\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082i\u0001\u0000\u0000\u0000"+
		"\u0082n\u0001\u0000\u0000\u0000\u0083\u0013\u0001\u0000\u0000\u0000\u0084"+
		"\u0088\u0005\u000f\u0000\u0000\u0085\u0089\u0005\u001f\u0000\u0000\u0086"+
		"\u0089\u0003\u001a\r\u0000\u0087\u0089\u0003\u001c\u000e\u0000\u0088\u0085"+
		"\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0087"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b"+
		"\u0001\u0000\u0000\u0000\u008a\u008c\u0003\u0018\f\u0000\u008b\u008a\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0005\u0010\u0000\u0000\u008e\u0015\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0005\u0011\u0000\u0000\u0090\u0091\u0003"+
		",\u0016\u0000\u0091\u0093\u0005\u0012\u0000\u0000\u0092\u0094\u0005\u001e"+
		"\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0097\u0005\u001e"+
		"\u0000\u0000\u0096\u008f\u0001\u0000\u0000\u0000\u0096\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u0017\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0011"+
		"\u0000\u0000\u0099\u009a\u0003,\u0016\u0000\u009a\u009c\u0005\u0012\u0000"+
		"\u0000\u009b\u009d\u0005\u001e\u0000\u0000\u009c\u009b\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u0019\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005\u001a\u0000\u0000\u009f\u00a1\u0005\u001f\u0000"+
		"\u0000\u00a0\u00a2\u0005\u001e\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u001b\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0005\u0002\u0000\u0000\u00a4\u00a5\u0003\u001e\u000f"+
		"\u0000\u00a5\u00a6\u0005\u0003\u0000\u0000\u00a6\u001d\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a9\u0003 \u0010\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u001f\u0001\u0000\u0000\u0000"+
		"\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00c9\u0003\u001c\u000e\u0000"+
		"\u00ae\u00c9\u0005\u001f\u0000\u0000\u00af\u00c9\u0003&\u0013\u0000\u00b0"+
		"\u00c9\u0005\u001e\u0000\u0000\u00b1\u00c9\u0005\u001d\u0000\u0000\u00b2"+
		"\u00c9\u0005\u000e\u0000\u0000\u00b3\u00c9\u0005\u000f\u0000\u0000\u00b4"+
		"\u00c9\u0005\u0010\u0000\u0000\u00b5\u00c9\u0005\u0011\u0000\u0000\u00b6"+
		"\u00c9\u0005\u0012\u0000\u0000\u00b7\u00c9\u0005\u0013\u0000\u0000\u00b8"+
		"\u00c9\u0005\u0014\u0000\u0000\u00b9\u00c9\u0005\u0015\u0000\u0000\u00ba"+
		"\u00c9\u0005\u0016\u0000\u0000\u00bb\u00c9\u0005\u0017\u0000\u0000\u00bc"+
		"\u00c9\u0005\u0018\u0000\u0000\u00bd\u00c9\u0005\u0019\u0000\u0000\u00be"+
		"\u00c9\u0005\u000b\u0000\u0000\u00bf\u00c9\u0005\r\u0000\u0000\u00c0\u00c9"+
		"\u0005\f\u0000\u0000\u00c1\u00c9\u0005\u0004\u0000\u0000\u00c2\u00c9\u0005"+
		"\u0005\u0000\u0000\u00c3\u00c9\u0005\u0006\u0000\u0000\u00c4\u00c9\u0005"+
		"\u0007\u0000\u0000\u00c5\u00c9\u0005\b\u0000\u0000\u00c6\u00c9\u0005\t"+
		"\u0000\u0000\u00c7\u00c9\u0005\n\u0000\u0000\u00c8\u00ad\u0001\u0000\u0000"+
		"\u0000\u00c8\u00ae\u0001\u0000\u0000\u0000\u00c8\u00af\u0001\u0000\u0000"+
		"\u0000\u00c8\u00b0\u0001\u0000\u0000\u0000\u00c8\u00b1\u0001\u0000\u0000"+
		"\u0000\u00c8\u00b2\u0001\u0000\u0000\u0000\u00c8\u00b3\u0001\u0000\u0000"+
		"\u0000\u00c8\u00b4\u0001\u0000\u0000\u0000\u00c8\u00b5\u0001\u0000\u0000"+
		"\u0000\u00c8\u00b6\u0001\u0000\u0000\u0000\u00c8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00c8\u00b8\u0001\u0000\u0000\u0000\u00c8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00c8\u00ba\u0001\u0000\u0000\u0000\u00c8\u00bb\u0001\u0000\u0000"+
		"\u0000\u00c8\u00bc\u0001\u0000\u0000\u0000\u00c8\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c8\u00be\u0001\u0000\u0000\u0000\u00c8\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c0\u0001\u0000\u0000\u0000\u00c8\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c2\u0001\u0000\u0000\u0000\u00c8\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9!\u0001\u0000\u0000\u0000\u00ca\u00d1\u0005\u001f\u0000\u0000"+
		"\u00cb\u00cd\u0003$\u0012\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ca\u0001\u0000\u0000\u0000\u00d0\u00cc\u0001\u0000\u0000\u0000\u00d1"+
		"#\u0001\u0000\u0000\u0000\u00d2\u00e2\u0003&\u0013\u0000\u00d3\u00e2\u0005"+
		"\u001e\u0000\u0000\u00d4\u00e2\u0005\u001d\u0000\u0000\u00d5\u00e2\u0005"+
		"\u000e\u0000\u0000\u00d6\u00e2\u0005\u000f\u0000\u0000\u00d7\u00e2\u0005"+
		"\u0010\u0000\u0000\u00d8\u00e2\u0005\u0011\u0000\u0000\u00d9\u00e2\u0005"+
		"\u0012\u0000\u0000\u00da\u00e2\u0005\u0013\u0000\u0000\u00db\u00e2\u0005"+
		"\u0014\u0000\u0000\u00dc\u00e2\u0005\u0015\u0000\u0000\u00dd\u00e2\u0005"+
		"\u0016\u0000\u0000\u00de\u00e2\u0005\u0017\u0000\u0000\u00df\u00e2\u0005"+
		"\u0018\u0000\u0000\u00e0\u00e2\u0005\u0019\u0000\u0000\u00e1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00e1\u00d3\u0001\u0000\u0000\u0000\u00e1\u00d4\u0001"+
		"\u0000\u0000\u0000\u00e1\u00d5\u0001\u0000\u0000\u0000\u00e1\u00d6\u0001"+
		"\u0000\u0000\u0000\u00e1\u00d7\u0001\u0000\u0000\u0000\u00e1\u00d8\u0001"+
		"\u0000\u0000\u0000\u00e1\u00d9\u0001\u0000\u0000\u0000\u00e1\u00da\u0001"+
		"\u0000\u0000\u0000\u00e1\u00db\u0001\u0000\u0000\u0000\u00e1\u00dc\u0001"+
		"\u0000\u0000\u0000\u00e1\u00dd\u0001\u0000\u0000\u0000\u00e1\u00de\u0001"+
		"\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e2%\u0001\u0000\u0000\u0000\u00e3\u00e8\u0003(\u0014"+
		"\u0000\u00e4\u00e5\u0005\u001c\u0000\u0000\u00e5\u00e7\u0003*\u0015\u0000"+
		"\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e9\'\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0007\u0000\u0000\u0000\u00ec)\u0001\u0000\u0000\u0000\u00ed\u00f0"+
		"\u0003(\u0014\u0000\u00ee\u00f0\u0005\u001e\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0+\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f6\u0005\u001e\u0000\u0000\u00f2\u00f3\u0005\u0013"+
		"\u0000\u0000\u00f3\u00f5\u0005\u001e\u0000\u0000\u00f4\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7-\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u001c02@BIU]ckrwz}\u0082\u0088"+
		"\u008b\u0093\u0096\u009c\u00a1\u00aa\u00c8\u00ce\u00d0\u00e1\u00e8\u00ef"+
		"\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}