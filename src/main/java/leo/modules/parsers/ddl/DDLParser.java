// Generated from ../contrib/DDL.g4 by ANTLR 4.7

  package leo.modules.parsers.ddl;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, Integer=21, Positive_decimal=22, Lower_word=23, 
		WS=24, Line_comment=25, Block_comment=26;
	public static final int
		RULE_file = 0, RULE_input = 1, RULE_name = 2, RULE_annotated_formula = 3, 
		RULE_formula_role = 4, RULE_formula = 5, RULE_unary_formula = 6, RULE_binary_formula = 7, 
		RULE_binary_assoc = 8, RULE_conjunction = 9, RULE_disjunction = 10, RULE_nonassoc_connective = 11, 
		RULE_binary_nonassoc = 12, RULE_unitary_formula = 13, RULE_atomic_formula = 14, 
		RULE_atom = 15, RULE_defined_atom = 16, RULE_defined_function = 17, RULE_dyadic_defined_function = 18, 
		RULE_monadic_defined_function = 19, RULE_monadic_defined_functor = 20;
	public static final String[] ruleNames = {
		"file", "input", "name", "annotated_formula", "formula_role", "formula", 
		"unary_formula", "binary_formula", "binary_assoc", "conjunction", "disjunction", 
		"nonassoc_connective", "binary_nonassoc", "unitary_formula", "atomic_formula", 
		"atom", "defined_atom", "defined_function", "dyadic_defined_function", 
		"monadic_defined_function", "monadic_defined_functor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ddl'", "'('", "','", "')'", "'.'", "'~'", "'&'", "'|'", "'<=>'", 
		"'=>'", "'<='", "'$true'", "'$false'", "'$O'", "'/'", "'$O_a'", "'$O_p'", 
		"'$box_a'", "'$box_p'", "'$box'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "Integer", "Positive_decimal", 
		"Lower_word", "WS", "Line_comment", "Block_comment"
	};
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
	public String getGrammarFileName() { return "DDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DDLParser.EOF, 0); }
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(42);
				input();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
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

	public static class InputContext extends ParserRuleContext {
		public Annotated_formulaContext annotated_formula() {
			return getRuleContext(Annotated_formulaContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			annotated_formula();
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode Lower_word() { return getToken(DDLParser.Lower_word, 0); }
		public TerminalNode Integer() { return getToken(DDLParser.Integer, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==Integer || _la==Lower_word) ) {
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

	public static class Annotated_formulaContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Formula_roleContext formula_role() {
			return getRuleContext(Formula_roleContext.class,0);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public Annotated_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotated_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterAnnotated_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitAnnotated_formula(this);
		}
	}

	public final Annotated_formulaContext annotated_formula() throws RecognitionException {
		Annotated_formulaContext _localctx = new Annotated_formulaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_annotated_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__0);
			setState(55);
			match(T__1);
			setState(56);
			name();
			setState(57);
			match(T__2);
			setState(58);
			formula_role();
			setState(59);
			match(T__2);
			setState(60);
			formula();
			setState(61);
			match(T__3);
			setState(62);
			match(T__4);
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

	public static class Formula_roleContext extends ParserRuleContext {
		public TerminalNode Lower_word() { return getToken(DDLParser.Lower_word, 0); }
		public Formula_roleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula_role; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterFormula_role(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitFormula_role(this);
		}
	}

	public final Formula_roleContext formula_role() throws RecognitionException {
		Formula_roleContext _localctx = new Formula_roleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formula_role);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(Lower_word);
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

	public static class FormulaContext extends ParserRuleContext {
		public Unary_formulaContext unary_formula() {
			return getRuleContext(Unary_formulaContext.class,0);
		}
		public Binary_formulaContext binary_formula() {
			return getRuleContext(Binary_formulaContext.class,0);
		}
		public Unitary_formulaContext unitary_formula() {
			return getRuleContext(Unitary_formulaContext.class,0);
		}
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitFormula(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formula);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				unary_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				binary_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				unitary_formula();
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

	public static class Unary_formulaContext extends ParserRuleContext {
		public Atomic_formulaContext atomic_formula() {
			return getRuleContext(Atomic_formulaContext.class,0);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public Unary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterUnary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitUnary_formula(this);
		}
	}

	public final Unary_formulaContext unary_formula() throws RecognitionException {
		Unary_formulaContext _localctx = new Unary_formulaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unary_formula);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(T__5);
				setState(72);
				atomic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(T__5);
				setState(74);
				match(T__1);
				setState(75);
				formula();
				setState(76);
				match(T__3);
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

	public static class Binary_formulaContext extends ParserRuleContext {
		public Binary_assocContext binary_assoc() {
			return getRuleContext(Binary_assocContext.class,0);
		}
		public Binary_nonassocContext binary_nonassoc() {
			return getRuleContext(Binary_nonassocContext.class,0);
		}
		public Binary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterBinary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitBinary_formula(this);
		}
	}

	public final Binary_formulaContext binary_formula() throws RecognitionException {
		Binary_formulaContext _localctx = new Binary_formulaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_binary_formula);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				binary_assoc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				binary_nonassoc();
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

	public static class Binary_assocContext extends ParserRuleContext {
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public Binary_assocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_assoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterBinary_assoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitBinary_assoc(this);
		}
	}

	public final Binary_assocContext binary_assoc() throws RecognitionException {
		Binary_assocContext _localctx = new Binary_assocContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_binary_assoc);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				conjunction(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				disjunction(0);
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

	public static class ConjunctionContext extends ParserRuleContext {
		public List<Unitary_formulaContext> unitary_formula() {
			return getRuleContexts(Unitary_formulaContext.class);
		}
		public Unitary_formulaContext unitary_formula(int i) {
			return getRuleContext(Unitary_formulaContext.class,i);
		}
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitConjunction(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		return conjunction(0);
	}

	private ConjunctionContext conjunction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, _parentState);
		ConjunctionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_conjunction, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(89);
			unitary_formula();
			setState(90);
			match(T__6);
			setState(91);
			unitary_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConjunctionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conjunction);
					setState(93);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(94);
					match(T__6);
					setState(95);
					unitary_formula();
					}
					} 
				}
				setState(100);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DisjunctionContext extends ParserRuleContext {
		public List<Unitary_formulaContext> unitary_formula() {
			return getRuleContexts(Unitary_formulaContext.class);
		}
		public Unitary_formulaContext unitary_formula(int i) {
			return getRuleContext(Unitary_formulaContext.class,i);
		}
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitDisjunction(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		return disjunction(0);
	}

	private DisjunctionContext disjunction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, _parentState);
		DisjunctionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_disjunction, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(102);
			unitary_formula();
			setState(103);
			match(T__7);
			setState(104);
			unitary_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DisjunctionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_disjunction);
					setState(106);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(107);
					match(T__7);
					setState(108);
					unitary_formula();
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Nonassoc_connectiveContext extends ParserRuleContext {
		public Nonassoc_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonassoc_connective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterNonassoc_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitNonassoc_connective(this);
		}
	}

	public final Nonassoc_connectiveContext nonassoc_connective() throws RecognitionException {
		Nonassoc_connectiveContext _localctx = new Nonassoc_connectiveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nonassoc_connective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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

	public static class Binary_nonassocContext extends ParserRuleContext {
		public List<Unitary_formulaContext> unitary_formula() {
			return getRuleContexts(Unitary_formulaContext.class);
		}
		public Unitary_formulaContext unitary_formula(int i) {
			return getRuleContext(Unitary_formulaContext.class,i);
		}
		public Nonassoc_connectiveContext nonassoc_connective() {
			return getRuleContext(Nonassoc_connectiveContext.class,0);
		}
		public Binary_nonassocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_nonassoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterBinary_nonassoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitBinary_nonassoc(this);
		}
	}

	public final Binary_nonassocContext binary_nonassoc() throws RecognitionException {
		Binary_nonassocContext _localctx = new Binary_nonassocContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_binary_nonassoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			unitary_formula();
			setState(117);
			nonassoc_connective();
			setState(118);
			unitary_formula();
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

	public static class Unitary_formulaContext extends ParserRuleContext {
		public Atomic_formulaContext atomic_formula() {
			return getRuleContext(Atomic_formulaContext.class,0);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public Unitary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitary_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterUnitary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitUnitary_formula(this);
		}
	}

	public final Unitary_formulaContext unitary_formula() throws RecognitionException {
		Unitary_formulaContext _localctx = new Unitary_formulaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unitary_formula);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case T__13:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case Lower_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				atomic_formula();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(T__1);
				setState(122);
				formula();
				setState(123);
				match(T__3);
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

	public static class Atomic_formulaContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Defined_atomContext defined_atom() {
			return getRuleContext(Defined_atomContext.class,0);
		}
		public Atomic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterAtomic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitAtomic_formula(this);
		}
	}

	public final Atomic_formulaContext atomic_formula() throws RecognitionException {
		Atomic_formulaContext _localctx = new Atomic_formulaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atomic_formula);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lower_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				atom();
				}
				break;
			case T__11:
			case T__12:
			case T__13:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				defined_atom();
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode Lower_word() { return getToken(DDLParser.Lower_word, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(Lower_word);
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

	public static class Defined_atomContext extends ParserRuleContext {
		public Defined_functionContext defined_function() {
			return getRuleContext(Defined_functionContext.class,0);
		}
		public Defined_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterDefined_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitDefined_atom(this);
		}
	}

	public final Defined_atomContext defined_atom() throws RecognitionException {
		Defined_atomContext _localctx = new Defined_atomContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_defined_atom);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__12);
				}
				break;
			case T__13:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				defined_function();
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

	public static class Defined_functionContext extends ParserRuleContext {
		public Dyadic_defined_functionContext dyadic_defined_function() {
			return getRuleContext(Dyadic_defined_functionContext.class,0);
		}
		public Monadic_defined_functionContext monadic_defined_function() {
			return getRuleContext(Monadic_defined_functionContext.class,0);
		}
		public Defined_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterDefined_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitDefined_function(this);
		}
	}

	public final Defined_functionContext defined_function() throws RecognitionException {
		Defined_functionContext _localctx = new Defined_functionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_defined_function);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				dyadic_defined_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				monadic_defined_function();
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

	public static class Dyadic_defined_functionContext extends ParserRuleContext {
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public Dyadic_defined_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dyadic_defined_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterDyadic_defined_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitDyadic_defined_function(this);
		}
	}

	public final Dyadic_defined_functionContext dyadic_defined_function() throws RecognitionException {
		Dyadic_defined_functionContext _localctx = new Dyadic_defined_functionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dyadic_defined_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__13);
			setState(143);
			match(T__1);
			setState(144);
			formula();
			setState(145);
			match(T__14);
			setState(146);
			formula();
			setState(147);
			match(T__3);
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

	public static class Monadic_defined_functionContext extends ParserRuleContext {
		public Monadic_defined_functorContext monadic_defined_functor() {
			return getRuleContext(Monadic_defined_functorContext.class,0);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public Monadic_defined_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monadic_defined_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterMonadic_defined_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitMonadic_defined_function(this);
		}
	}

	public final Monadic_defined_functionContext monadic_defined_function() throws RecognitionException {
		Monadic_defined_functionContext _localctx = new Monadic_defined_functionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_monadic_defined_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			monadic_defined_functor();
			setState(150);
			match(T__1);
			setState(151);
			formula();
			setState(152);
			match(T__3);
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

	public static class Monadic_defined_functorContext extends ParserRuleContext {
		public Monadic_defined_functorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monadic_defined_functor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterMonadic_defined_functor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitMonadic_defined_functor(this);
		}
	}

	public final Monadic_defined_functorContext monadic_defined_functor() throws RecognitionException {
		Monadic_defined_functorContext _localctx = new Monadic_defined_functorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_monadic_defined_functor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return conjunction_sempred((ConjunctionContext)_localctx, predIndex);
		case 10:
			return disjunction_sempred((DisjunctionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean conjunction_sempred(ConjunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean disjunction_sempred(DisjunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u009f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\5\7H\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bQ\n\b\3\t\3\t\5"+
		"\tU\n\t\3\n\3\n\5\nY\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"c\n\13\f\13\16\13f\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\fp\n\f\f\f"+
		"\16\fs\13\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0080\n\17\3\20\3\20\5\20\u0084\n\20\3\21\3\21\3\22\3\22\3\22\5\22\u008b"+
		"\n\22\3\23\3\23\5\23\u008f\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\2\4\24\26\27\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*\2\5\4\2\27\27\31\31\3\2\13\r\4\2\20\20\22\26"+
		"\2\u0096\2/\3\2\2\2\4\64\3\2\2\2\6\66\3\2\2\2\b8\3\2\2\2\nB\3\2\2\2\f"+
		"G\3\2\2\2\16P\3\2\2\2\20T\3\2\2\2\22X\3\2\2\2\24Z\3\2\2\2\26g\3\2\2\2"+
		"\30t\3\2\2\2\32v\3\2\2\2\34\177\3\2\2\2\36\u0083\3\2\2\2 \u0085\3\2\2"+
		"\2\"\u008a\3\2\2\2$\u008e\3\2\2\2&\u0090\3\2\2\2(\u0097\3\2\2\2*\u009c"+
		"\3\2\2\2,.\5\4\3\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3"+
		"\2\2\2\61/\3\2\2\2\62\63\7\2\2\3\63\3\3\2\2\2\64\65\5\b\5\2\65\5\3\2\2"+
		"\2\66\67\t\2\2\2\67\7\3\2\2\289\7\3\2\29:\7\4\2\2:;\5\6\4\2;<\7\5\2\2"+
		"<=\5\n\6\2=>\7\5\2\2>?\5\f\7\2?@\7\6\2\2@A\7\7\2\2A\t\3\2\2\2BC\7\31\2"+
		"\2C\13\3\2\2\2DH\5\16\b\2EH\5\20\t\2FH\5\34\17\2GD\3\2\2\2GE\3\2\2\2G"+
		"F\3\2\2\2H\r\3\2\2\2IJ\7\b\2\2JQ\5\36\20\2KL\7\b\2\2LM\7\4\2\2MN\5\f\7"+
		"\2NO\7\6\2\2OQ\3\2\2\2PI\3\2\2\2PK\3\2\2\2Q\17\3\2\2\2RU\5\22\n\2SU\5"+
		"\32\16\2TR\3\2\2\2TS\3\2\2\2U\21\3\2\2\2VY\5\24\13\2WY\5\26\f\2XV\3\2"+
		"\2\2XW\3\2\2\2Y\23\3\2\2\2Z[\b\13\1\2[\\\5\34\17\2\\]\7\t\2\2]^\5\34\17"+
		"\2^d\3\2\2\2_`\f\3\2\2`a\7\t\2\2ac\5\34\17\2b_\3\2\2\2cf\3\2\2\2db\3\2"+
		"\2\2de\3\2\2\2e\25\3\2\2\2fd\3\2\2\2gh\b\f\1\2hi\5\34\17\2ij\7\n\2\2j"+
		"k\5\34\17\2kq\3\2\2\2lm\f\3\2\2mn\7\n\2\2np\5\34\17\2ol\3\2\2\2ps\3\2"+
		"\2\2qo\3\2\2\2qr\3\2\2\2r\27\3\2\2\2sq\3\2\2\2tu\t\3\2\2u\31\3\2\2\2v"+
		"w\5\34\17\2wx\5\30\r\2xy\5\34\17\2y\33\3\2\2\2z\u0080\5\36\20\2{|\7\4"+
		"\2\2|}\5\f\7\2}~\7\6\2\2~\u0080\3\2\2\2\177z\3\2\2\2\177{\3\2\2\2\u0080"+
		"\35\3\2\2\2\u0081\u0084\5 \21\2\u0082\u0084\5\"\22\2\u0083\u0081\3\2\2"+
		"\2\u0083\u0082\3\2\2\2\u0084\37\3\2\2\2\u0085\u0086\7\31\2\2\u0086!\3"+
		"\2\2\2\u0087\u008b\7\16\2\2\u0088\u008b\7\17\2\2\u0089\u008b\5$\23\2\u008a"+
		"\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b#\3\2\2\2"+
		"\u008c\u008f\5&\24\2\u008d\u008f\5(\25\2\u008e\u008c\3\2\2\2\u008e\u008d"+
		"\3\2\2\2\u008f%\3\2\2\2\u0090\u0091\7\20\2\2\u0091\u0092\7\4\2\2\u0092"+
		"\u0093\5\f\7\2\u0093\u0094\7\21\2\2\u0094\u0095\5\f\7\2\u0095\u0096\7"+
		"\6\2\2\u0096\'\3\2\2\2\u0097\u0098\5*\26\2\u0098\u0099\7\4\2\2\u0099\u009a"+
		"\5\f\7\2\u009a\u009b\7\6\2\2\u009b)\3\2\2\2\u009c\u009d\t\4\2\2\u009d"+
		"+\3\2\2\2\r/GPTXdq\177\u0083\u008a\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}