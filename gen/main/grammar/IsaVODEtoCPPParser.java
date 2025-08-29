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
		ISABELLE_COMMENT_BLOCK=1, ISABELLE_OPEN_BLOCK=2, DATASPACE=3, CONSTANTS=4, 
		ASSUMES=5, VARIABLES=6, AND=7, ASSIGN=8, D_COLON=9, COLON=10, ARROW=11, 
		LPAREN=12, RPAREN=13, LBRACK=14, RBRACK=15, COMMA=16, CARET=17, STAR=18, 
		PLUS=19, MINUS=20, DOT=21, ASCII_ID=22, SYMBOL_IDENT=23, SUBSCRIPT=24, 
		NUMBER=25, QUOTED_TEXT=26, WS=27, COMMENT=28;
	public static final int
		RULE_program = 0, RULE_dataspaceDecl = 1, RULE_dataspaceBody = 2, RULE_constantsClause = 3, 
		RULE_constantDecl = 4, RULE_assumesClause = 5, RULE_assumptionDecl = 6, 
		RULE_variablesClause = 7, RULE_varDecl = 8, RULE_typeSpec = 9, RULE_typeAtom = 10, 
		RULE_ident = 11, RULE_idseg = 12, RULE_idsegOrNum = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "dataspaceDecl", "dataspaceBody", "constantsClause", "constantDecl", 
			"assumesClause", "assumptionDecl", "variablesClause", "varDecl", "typeSpec", 
			"typeAtom", "ident", "idseg", "idsegOrNum"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'dataspace'", "'constants'", "'assumes'", "'variables'", 
			"'and'", "'='", "'::'", "':'", "'=>'", "'('", "')'", "'['", "']'", "','", 
			"'^'", "'*'", "'+'", "'-'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ISABELLE_COMMENT_BLOCK", "ISABELLE_OPEN_BLOCK", "DATASPACE", "CONSTANTS", 
			"ASSUMES", "VARIABLES", "AND", "ASSIGN", "D_COLON", "COLON", "ARROW", 
			"LPAREN", "RPAREN", "LBRACK", "RBRACK", "COMMA", "CARET", "STAR", "PLUS", 
			"MINUS", "DOT", "ASCII_ID", "SYMBOL_IDENT", "SUBSCRIPT", "NUMBER", "QUOTED_TEXT", 
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATASPACE) {
				{
				{
				setState(28);
				dataspaceDecl();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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
			setState(36);
			match(DATASPACE);
			setState(37);
			ident();
			setState(38);
			match(ASSIGN);
			setState(39);
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
		public ConstantsClauseContext constantsClause() {
			return getRuleContext(ConstantsClauseContext.class,0);
		}
		public AssumesClauseContext assumesClause() {
			return getRuleContext(AssumesClauseContext.class,0);
		}
		public VariablesClauseContext variablesClause() {
			return getRuleContext(VariablesClauseContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTANTS) {
				{
				setState(41);
				constantsClause();
				}
			}

			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSUMES) {
				{
				setState(44);
				assumesClause();
				}
			}

			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLES) {
				{
				setState(47);
				variablesClause();
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
			setState(50);
			match(CONSTANTS);
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				constantDecl();
				}
				}
				setState(54); 
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
			setState(56);
			ident();
			setState(57);
			match(D_COLON);
			setState(58);
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
			setState(60);
			match(ASSUMES);
			setState(61);
			assumptionDecl();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(62);
				match(AND);
				setState(63);
				assumptionDecl();
				}
				}
				setState(68);
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
			setState(69);
			ident();
			setState(70);
			match(COLON);
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				match(QUOTED_TEXT);
				}
				}
				setState(74); 
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
			setState(76);
			match(VARIABLES);
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				varDecl();
				}
				}
				setState(80); 
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
			setState(82);
			ident();
			setState(83);
			match(D_COLON);
			setState(84);
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
		enterRule(_localctx, 18, RULE_typeSpec);
		try {
			int _alt;
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
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
			case ASCII_ID:
			case SYMBOL_IDENT:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(88); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(87);
						typeAtom();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(90); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 20, RULE_typeAtom);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII_ID:
			case SYMBOL_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				ident();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(NUMBER);
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(ARROW);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(LPAREN);
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				match(RPAREN);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				match(LBRACK);
				}
				break;
			case RBRACK:
				enterOuterAlt(_localctx, 7);
				{
				setState(100);
				match(RBRACK);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 8);
				{
				setState(101);
				match(COMMA);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 9);
				{
				setState(102);
				match(CARET);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 10);
				{
				setState(103);
				match(STAR);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 11);
				{
				setState(104);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 12);
				{
				setState(105);
				match(MINUS);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 13);
				{
				setState(106);
				match(DOT);
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
		enterRule(_localctx, 22, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			idseg();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUBSCRIPT) {
				{
				{
				setState(110);
				match(SUBSCRIPT);
				setState(111);
				idsegOrNum();
				}
				}
				setState(116);
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
		enterRule(_localctx, 24, RULE_idseg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
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
		enterRule(_localctx, 26, RULE_idsegOrNum);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII_ID:
			case SYMBOL_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				idseg();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001c|\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000\n\u0000"+
		"\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0003\u0002+\b\u0002\u0001"+
		"\u0002\u0003\u0002.\b\u0002\u0001\u0002\u0003\u00021\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0004\u00035\b\u0003\u000b\u0003\f\u00036\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005A\b\u0005\n\u0005\f\u0005D\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0004\u0006I\b\u0006\u000b\u0006\f\u0006J\u0001\u0007"+
		"\u0001\u0007\u0004\u0007O\b\u0007\u000b\u0007\f\u0007P\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0004\tY\b\t\u000b\t\f\tZ\u0003\t]\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nl\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000bq\b\u000b\n\u000b\f\u000bt\t\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0003\rz\b\r\u0001\r\u0000\u0000\u000e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0001"+
		"\u0001\u0000\u0016\u0017\u0085\u0000\u001f\u0001\u0000\u0000\u0000\u0002"+
		"$\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u00062\u0001"+
		"\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\n<\u0001\u0000\u0000\u0000"+
		"\fE\u0001\u0000\u0000\u0000\u000eL\u0001\u0000\u0000\u0000\u0010R\u0001"+
		"\u0000\u0000\u0000\u0012\\\u0001\u0000\u0000\u0000\u0014k\u0001\u0000"+
		"\u0000\u0000\u0016m\u0001\u0000\u0000\u0000\u0018u\u0001\u0000\u0000\u0000"+
		"\u001ay\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0002\u0001\u0000\u001d"+
		"\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000"+
		"\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0005\u0000\u0000\u0001"+
		"#\u0001\u0001\u0000\u0000\u0000$%\u0005\u0003\u0000\u0000%&\u0003\u0016"+
		"\u000b\u0000&\'\u0005\b\u0000\u0000\'(\u0003\u0004\u0002\u0000(\u0003"+
		"\u0001\u0000\u0000\u0000)+\u0003\u0006\u0003\u0000*)\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,.\u0003\n\u0005"+
		"\u0000-,\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001\u0000"+
		"\u0000\u0000/1\u0003\u000e\u0007\u00000/\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u00001\u0005\u0001\u0000\u0000\u000024\u0005\u0004\u0000"+
		"\u000035\u0003\b\u0004\u000043\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0007\u0001"+
		"\u0000\u0000\u000089\u0003\u0016\u000b\u00009:\u0005\t\u0000\u0000:;\u0003"+
		"\u0012\t\u0000;\t\u0001\u0000\u0000\u0000<=\u0005\u0005\u0000\u0000=B"+
		"\u0003\f\u0006\u0000>?\u0005\u0007\u0000\u0000?A\u0003\f\u0006\u0000@"+
		">\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000C\u000b\u0001\u0000\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000EF\u0003\u0016\u000b\u0000FH\u0005\n\u0000\u0000GI\u0005"+
		"\u001a\u0000\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\r\u0001\u0000\u0000"+
		"\u0000LN\u0005\u0006\u0000\u0000MO\u0003\u0010\b\u0000NM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000Q\u000f\u0001\u0000\u0000\u0000RS\u0003\u0016\u000b\u0000"+
		"ST\u0005\t\u0000\u0000TU\u0003\u0012\t\u0000U\u0011\u0001\u0000\u0000"+
		"\u0000V]\u0005\u001a\u0000\u0000WY\u0003\u0014\n\u0000XW\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[]\u0001\u0000\u0000\u0000\\V\u0001\u0000\u0000\u0000\\X\u0001"+
		"\u0000\u0000\u0000]\u0013\u0001\u0000\u0000\u0000^l\u0003\u0016\u000b"+
		"\u0000_l\u0005\u0019\u0000\u0000`l\u0005\u000b\u0000\u0000al\u0005\f\u0000"+
		"\u0000bl\u0005\r\u0000\u0000cl\u0005\u000e\u0000\u0000dl\u0005\u000f\u0000"+
		"\u0000el\u0005\u0010\u0000\u0000fl\u0005\u0011\u0000\u0000gl\u0005\u0012"+
		"\u0000\u0000hl\u0005\u0013\u0000\u0000il\u0005\u0014\u0000\u0000jl\u0005"+
		"\u0015\u0000\u0000k^\u0001\u0000\u0000\u0000k_\u0001\u0000\u0000\u0000"+
		"k`\u0001\u0000\u0000\u0000ka\u0001\u0000\u0000\u0000kb\u0001\u0000\u0000"+
		"\u0000kc\u0001\u0000\u0000\u0000kd\u0001\u0000\u0000\u0000ke\u0001\u0000"+
		"\u0000\u0000kf\u0001\u0000\u0000\u0000kg\u0001\u0000\u0000\u0000kh\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000"+
		"l\u0015\u0001\u0000\u0000\u0000mr\u0003\u0018\f\u0000no\u0005\u0018\u0000"+
		"\u0000oq\u0003\u001a\r\u0000pn\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u0017\u0001"+
		"\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0007\u0000\u0000\u0000"+
		"v\u0019\u0001\u0000\u0000\u0000wz\u0003\u0018\f\u0000xz\u0005\u0019\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z\u001b\u0001"+
		"\u0000\u0000\u0000\r\u001f*-06BJPZ\\kry";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}