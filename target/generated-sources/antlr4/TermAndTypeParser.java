// Generated from TermAndType.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TermAndTypeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, INT=42, REAL=43, STRING=44, BOOLEAN=45, 
		PORTVAR_SUFFIX=46, ID=47, PROB=48, IGNORE=49;
	public static final int
		RULE_terms = 0, RULE_term = 1, RULE_value = 2, RULE_type = 3, RULE_typeorvalue = 4, 
		RULE_scopedID = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"terms", "term", "value", "type", "typeorvalue", "scopedID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'['", "']'", "'{'", "'='", "'}'", "'-'", 
			"'!'", "'.'", "'%'", "'*'", "'/'", "'+'", "'<'", "'<='", "'>'", "'>='", 
			"'=='", "'!='", "'^'", "'^^'", "'&'", "'&&'", "'|'", "'||'", "'?'", "':'", 
			"'null'", "'int'", "'..'", "'char'", "'double'", "'bool'", "'enum'", 
			"'struct'", "';'", "'init'", "'type'", "'NULL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "INT", "REAL", "STRING", "BOOLEAN", 
			"PORTVAR_SUFFIX", "ID", "PROB", "IGNORE"
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
	public String getGrammarFileName() { return "TermAndType.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TermAndTypeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TermsContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitTerms(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__39) | (1L << T__40) | (1L << INT) | (1L << REAL) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				setState(12);
				term(0);
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(13);
					match(T__0);
					setState(14);
					term(0);
					}
					}
					setState(19);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueTermContext extends TermContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterValueTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitValueTerm(this);
		}
	}
	public static class IteTermContext extends TermContext {
		public TermContext condition;
		public TermContext ifTrue;
		public TermContext ifFalse;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public IteTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterIteTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitIteTerm(this);
		}
	}
	public static class BinaryOprTermContext extends TermContext {
		public TermContext left;
		public Token opr;
		public TermContext right;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public BinaryOprTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterBinaryOprTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitBinaryOprTerm(this);
		}
	}
	public static class ElementTermContext extends TermContext {
		public TermContext container;
		public TermContext key;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ElementTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterElementTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitElementTerm(this);
		}
	}
	public static class BracketTermContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public BracketTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterBracketTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitBracketTerm(this);
		}
	}
	public static class StructTermContext extends TermContext {
		public List<TerminalNode> ID() { return getTokens(TermAndTypeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TermAndTypeParser.ID, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public StructTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterStructTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitStructTerm(this);
		}
	}
	public static class TupleTermContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TupleTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterTupleTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitTupleTerm(this);
		}
	}
	public static class SingleOprTermContext extends TermContext {
		public Token opr;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SingleOprTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterSingleOprTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitSingleOprTerm(this);
		}
	}
	public static class ListTermContext extends TermContext {
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public ListTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterListTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitListTerm(this);
		}
	}
	public static class CallTermContext extends TermContext {
		public TypeContext callee;
		public TermsContext args;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public CallTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterCallTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitCallTerm(this);
		}
	}
	public static class FieldTermContext extends TermContext {
		public TermContext structure;
		public Token key;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ID() { return getToken(TermAndTypeParser.ID, 0); }
		public FieldTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterFieldTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitFieldTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new BracketTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(23);
				match(T__1);
				setState(24);
				term(0);
				setState(25);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new TupleTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				match(T__1);
				setState(28);
				term(0);
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(29);
					match(T__0);
					setState(30);
					term(0);
					}
					}
					setState(33); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				setState(35);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new ListTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(T__3);
				setState(38);
				terms();
				setState(39);
				match(T__4);
				}
				break;
			case 4:
				{
				_localctx = new StructTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(T__5);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(42);
					match(ID);
					setState(43);
					match(T__6);
					setState(44);
					term(0);
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(45);
						match(T__0);
						setState(46);
						match(ID);
						setState(47);
						match(T__6);
						setState(48);
						term(0);
						}
						}
						setState(53);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(56);
				match(T__7);
				}
				break;
			case 5:
				{
				_localctx = new SingleOprTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				((SingleOprTermContext)_localctx).opr = match(T__8);
				setState(58);
				term(24);
				}
				break;
			case 6:
				{
				_localctx = new SingleOprTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				((SingleOprTermContext)_localctx).opr = match(T__9);
				setState(60);
				term(23);
				}
				break;
			case 7:
				{
				_localctx = new CallTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				((CallTermContext)_localctx).callee = type(0);
				setState(62);
				match(T__1);
				setState(63);
				((CallTermContext)_localctx).args = terms();
				setState(64);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new ValueTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(134);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(69);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(70);
						((BinaryOprTermContext)_localctx).opr = match(T__11);
						setState(71);
						((BinaryOprTermContext)_localctx).right = term(20);
						}
						break;
					case 2:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(72);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(73);
						((BinaryOprTermContext)_localctx).opr = match(T__12);
						setState(74);
						((BinaryOprTermContext)_localctx).right = term(19);
						}
						break;
					case 3:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(75);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(76);
						((BinaryOprTermContext)_localctx).opr = match(T__13);
						setState(77);
						((BinaryOprTermContext)_localctx).right = term(18);
						}
						break;
					case 4:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(78);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(79);
						((BinaryOprTermContext)_localctx).opr = match(T__14);
						setState(80);
						((BinaryOprTermContext)_localctx).right = term(17);
						}
						break;
					case 5:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(81);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(82);
						((BinaryOprTermContext)_localctx).opr = match(T__8);
						setState(83);
						((BinaryOprTermContext)_localctx).right = term(16);
						}
						break;
					case 6:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(84);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(85);
						((BinaryOprTermContext)_localctx).opr = match(T__15);
						setState(86);
						((BinaryOprTermContext)_localctx).right = term(15);
						}
						break;
					case 7:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(87);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(88);
						((BinaryOprTermContext)_localctx).opr = match(T__16);
						setState(89);
						((BinaryOprTermContext)_localctx).right = term(14);
						}
						break;
					case 8:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(90);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(91);
						((BinaryOprTermContext)_localctx).opr = match(T__17);
						setState(92);
						((BinaryOprTermContext)_localctx).right = term(13);
						}
						break;
					case 9:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(93);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(94);
						((BinaryOprTermContext)_localctx).opr = match(T__18);
						setState(95);
						((BinaryOprTermContext)_localctx).right = term(12);
						}
						break;
					case 10:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(96);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(97);
						((BinaryOprTermContext)_localctx).opr = match(T__19);
						setState(98);
						((BinaryOprTermContext)_localctx).right = term(11);
						}
						break;
					case 11:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(99);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(100);
						((BinaryOprTermContext)_localctx).opr = match(T__20);
						setState(101);
						((BinaryOprTermContext)_localctx).right = term(10);
						}
						break;
					case 12:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(102);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(103);
						((BinaryOprTermContext)_localctx).opr = match(T__21);
						setState(104);
						((BinaryOprTermContext)_localctx).right = term(9);
						}
						break;
					case 13:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(105);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(106);
						((BinaryOprTermContext)_localctx).opr = match(T__22);
						setState(107);
						((BinaryOprTermContext)_localctx).right = term(8);
						}
						break;
					case 14:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(108);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(109);
						((BinaryOprTermContext)_localctx).opr = match(T__23);
						setState(110);
						((BinaryOprTermContext)_localctx).right = term(7);
						}
						break;
					case 15:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(111);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(112);
						((BinaryOprTermContext)_localctx).opr = match(T__24);
						setState(113);
						((BinaryOprTermContext)_localctx).right = term(6);
						}
						break;
					case 16:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(114);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(115);
						((BinaryOprTermContext)_localctx).opr = match(T__25);
						setState(116);
						((BinaryOprTermContext)_localctx).right = term(5);
						}
						break;
					case 17:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(117);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(118);
						((BinaryOprTermContext)_localctx).opr = match(T__26);
						setState(119);
						((BinaryOprTermContext)_localctx).right = term(4);
						}
						break;
					case 18:
						{
						_localctx = new IteTermContext(new TermContext(_parentctx, _parentState));
						((IteTermContext)_localctx).condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(120);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(121);
						match(T__27);
						setState(122);
						((IteTermContext)_localctx).ifTrue = term(0);
						setState(123);
						match(T__28);
						setState(124);
						((IteTermContext)_localctx).ifFalse = term(3);
						}
						break;
					case 19:
						{
						_localctx = new ElementTermContext(new TermContext(_parentctx, _parentState));
						((ElementTermContext)_localctx).container = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(126);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(127);
						match(T__3);
						setState(128);
						((ElementTermContext)_localctx).key = term(0);
						setState(129);
						match(T__4);
						}
						break;
					case 20:
						{
						_localctx = new FieldTermContext(new TermContext(_parentctx, _parentState));
						((FieldTermContext)_localctx).structure = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(131);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(132);
						match(T__10);
						setState(133);
						((FieldTermContext)_localctx).key = match(ID);
						}
						break;
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntValueContext extends ValueContext {
		public TerminalNode INT() { return getToken(TermAndTypeParser.INT, 0); }
		public IntValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterIntValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitIntValue(this);
		}
	}
	public static class PortVarValueContext extends ValueContext {
		public ScopedIDContext scopedID() {
			return getRuleContext(ScopedIDContext.class,0);
		}
		public TerminalNode PORTVAR_SUFFIX() { return getToken(TermAndTypeParser.PORTVAR_SUFFIX, 0); }
		public PortVarValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterPortVarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitPortVarValue(this);
		}
	}
	public static class BoolValueContext extends ValueContext {
		public TerminalNode BOOLEAN() { return getToken(TermAndTypeParser.BOOLEAN, 0); }
		public BoolValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitBoolValue(this);
		}
	}
	public static class IdValueContext extends ValueContext {
		public ScopedIDContext scopedID() {
			return getRuleContext(ScopedIDContext.class,0);
		}
		public IdValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterIdValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitIdValue(this);
		}
	}
	public static class DoubleValueContext extends ValueContext {
		public TerminalNode REAL() { return getToken(TermAndTypeParser.REAL, 0); }
		public DoubleValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterDoubleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitDoubleValue(this);
		}
	}
	public static class StrValueContext extends ValueContext {
		public TerminalNode STRING() { return getToken(TermAndTypeParser.STRING, 0); }
		public StrValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterStrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitStrValue(this);
		}
	}
	public static class NullValueContext extends ValueContext {
		public NullValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterNullValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitNullValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new IntValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(INT);
				}
				break;
			case 2:
				_localctx = new DoubleValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(REAL);
				}
				break;
			case 3:
				_localctx = new StrValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new BoolValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(BOOLEAN);
				}
				break;
			case 5:
				_localctx = new PortVarValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				scopedID();
				setState(144);
				match(T__10);
				setState(145);
				match(PORTVAR_SUFFIX);
				}
				break;
			case 6:
				_localctx = new IdValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				scopedID();
				}
				break;
			case 7:
				_localctx = new NullValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(148);
				match(T__29);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BracketTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BracketTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterBracketType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitBracketType(this);
		}
	}
	public static class CharTypeContext extends TypeContext {
		public CharTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterCharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitCharType(this);
		}
	}
	public static class DoubleTypeContext extends TypeContext {
		public DoubleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitDoubleType(this);
		}
	}
	public static class TemplateTypeContext extends TypeContext {
		public ScopedIDContext scopedID() {
			return getRuleContext(ScopedIDContext.class,0);
		}
		public List<TypeorvalueContext> typeorvalue() {
			return getRuleContexts(TypeorvalueContext.class);
		}
		public TypeorvalueContext typeorvalue(int i) {
			return getRuleContext(TypeorvalueContext.class,i);
		}
		public TemplateTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterTemplateType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitTemplateType(this);
		}
	}
	public static class IdTypeContext extends TypeContext {
		public ScopedIDContext scopedID() {
			return getRuleContext(ScopedIDContext.class,0);
		}
		public IdTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterIdType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitIdType(this);
		}
	}
	public static class AbstractTypeContext extends TypeContext {
		public AbstractTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterAbstractType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitAbstractType(this);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitIntType(this);
		}
	}
	public static class EnumTypeContext extends TypeContext {
		public List<TerminalNode> ID() { return getTokens(TermAndTypeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TermAndTypeParser.ID, i);
		}
		public EnumTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitEnumType(this);
		}
	}
	public static class TupleTypeContext extends TypeContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TupleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitTupleType(this);
		}
	}
	public static class InitTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public InitTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterInitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitInitType(this);
		}
	}
	public static class ListTypeContext extends TypeContext {
		public TermContext capacity;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ListTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitListType(this);
		}
	}
	public static class BoolTypeContext extends TypeContext {
		public BoolTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitBoolType(this);
		}
	}
	public static class BoundedIntTypeContext extends TypeContext {
		public TermContext lbound;
		public TermContext ubound;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public BoundedIntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterBoundedIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitBoundedIntType(this);
		}
	}
	public static class StructTypeContext extends TypeContext {
		public List<TerminalNode> ID() { return getTokens(TermAndTypeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TermAndTypeParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public StructTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitStructType(this);
		}
	}
	public static class NullTypeContext extends TypeContext {
		public NullTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterNullType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitNullType(this);
		}
	}
	public static class UnionTypeContext extends TypeContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public UnionTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterUnionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitUnionType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new BracketTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(152);
				match(T__1);
				setState(153);
				type(0);
				setState(154);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new TupleTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(T__1);
				setState(157);
				type(0);
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(158);
					match(T__0);
					setState(159);
					type(0);
					}
					}
					setState(162); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				setState(164);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new IntTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(T__30);
				}
				break;
			case 4:
				{
				_localctx = new BoundedIntTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(T__30);
				setState(168);
				((BoundedIntTypeContext)_localctx).lbound = term(0);
				setState(169);
				match(T__31);
				setState(170);
				((BoundedIntTypeContext)_localctx).ubound = term(0);
				}
				break;
			case 5:
				{
				_localctx = new CharTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(T__32);
				}
				break;
			case 6:
				{
				_localctx = new DoubleTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(T__33);
				}
				break;
			case 7:
				{
				_localctx = new BoolTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(T__34);
				}
				break;
			case 8:
				{
				_localctx = new EnumTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(T__35);
				setState(176);
				match(T__5);
				setState(177);
				match(ID);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(178);
					match(T__0);
					setState(179);
					match(ID);
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(T__7);
				}
				break;
			case 9:
				{
				_localctx = new StructTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(T__36);
				setState(187);
				match(T__5);
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(188);
					match(ID);
					setState(189);
					match(T__28);
					setState(190);
					type(0);
					setState(191);
					match(T__37);
					}
					}
					setState(195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(197);
				match(T__7);
				}
				break;
			case 10:
				{
				_localctx = new AbstractTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(T__39);
				}
				break;
			case 11:
				{
				_localctx = new NullTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				match(T__40);
				}
				break;
			case 12:
				{
				_localctx = new IdTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				scopedID();
				}
				break;
			case 13:
				{
				_localctx = new TemplateTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				scopedID();
				setState(214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(203);
					match(T__15);
					setState(204);
					typeorvalue();
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(205);
						match(T__0);
						setState(206);
						typeorvalue();
						}
						}
						setState(211);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(212);
					match(T__17);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new UnionTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(218);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(219);
						match(T__25);
						setState(220);
						type(6);
						}
						break;
					case 2:
						{
						_localctx = new ListTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(221);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(222);
						match(T__3);
						setState(224);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__39) | (1L << T__40) | (1L << INT) | (1L << REAL) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
							{
							setState(223);
							((ListTypeContext)_localctx).capacity = term(0);
							}
						}

						setState(226);
						match(T__4);
						}
						break;
					case 3:
						{
						_localctx = new InitTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(227);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(228);
						match(T__38);
						setState(229);
						term(0);
						}
						break;
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class TypeorvalueContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TypeorvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeorvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterTypeorvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitTypeorvalue(this);
		}
	}

	public final TypeorvalueContext typeorvalue() throws RecognitionException {
		TypeorvalueContext _localctx = new TypeorvalueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeorvalue);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				value();
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

	public static class ScopedIDContext extends ParserRuleContext {
		public Token ID;
		public List<Token> scopes = new ArrayList<Token>();
		public Token identifier;
		public List<TerminalNode> ID() { return getTokens(TermAndTypeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TermAndTypeParser.ID, i);
		}
		public ScopedIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopedID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).enterScopedID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TermAndTypeListener ) ((TermAndTypeListener)listener).exitScopedID(this);
		}
	}

	public final ScopedIDContext scopedID() throws RecognitionException {
		ScopedIDContext _localctx = new ScopedIDContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_scopedID);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(239);
					((ScopedIDContext)_localctx).ID = match(ID);
					((ScopedIDContext)_localctx).scopes.add(((ScopedIDContext)_localctx).ID);
					setState(240);
					match(T__10);
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(246);
			((ScopedIDContext)_localctx).identifier = match(ID);
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
		case 1:
			return term_sempred((TermContext)_localctx, predIndex);
		case 3:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 6);
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 21);
		case 19:
			return precpred(_ctx, 20);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 5);
		case 21:
			return precpred(_ctx, 7);
		case 22:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u00fb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\7\2\22\n\2\f\2\16"+
		"\2\25\13\2\5\2\27\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3\"\n\3\r"+
		"\3\16\3#\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\64"+
		"\n\3\f\3\16\3\67\13\3\5\39\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3F\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0089"+
		"\n\3\f\3\16\3\u008c\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0098"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u00a3\n\5\r\5\16\5\u00a4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00b7"+
		"\n\5\f\5\16\5\u00ba\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u00c4\n\5"+
		"\r\5\16\5\u00c5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00d2\n\5"+
		"\f\5\16\5\u00d5\13\5\3\5\3\5\5\5\u00d9\n\5\5\5\u00db\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u00e3\n\5\3\5\3\5\3\5\3\5\7\5\u00e9\n\5\f\5\16\5\u00ec"+
		"\13\5\3\6\3\6\5\6\u00f0\n\6\3\7\3\7\7\7\u00f4\n\7\f\7\16\7\u00f7\13\7"+
		"\3\7\3\7\3\7\2\4\4\b\b\2\4\6\b\n\f\2\2\2\u0131\2\26\3\2\2\2\4E\3\2\2\2"+
		"\6\u0097\3\2\2\2\b\u00da\3\2\2\2\n\u00ef\3\2\2\2\f\u00f5\3\2\2\2\16\23"+
		"\5\4\3\2\17\20\7\3\2\2\20\22\5\4\3\2\21\17\3\2\2\2\22\25\3\2\2\2\23\21"+
		"\3\2\2\2\23\24\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\26\16\3\2\2\2\26\27"+
		"\3\2\2\2\27\3\3\2\2\2\30\31\b\3\1\2\31\32\7\4\2\2\32\33\5\4\3\2\33\34"+
		"\7\5\2\2\34F\3\2\2\2\35\36\7\4\2\2\36!\5\4\3\2\37 \7\3\2\2 \"\5\4\3\2"+
		"!\37\3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\7\5\2\2&F\3\2"+
		"\2\2\'(\7\6\2\2()\5\2\2\2)*\7\7\2\2*F\3\2\2\2+8\7\b\2\2,-\7\61\2\2-.\7"+
		"\t\2\2.\65\5\4\3\2/\60\7\3\2\2\60\61\7\61\2\2\61\62\7\t\2\2\62\64\5\4"+
		"\3\2\63/\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\669\3\2\2\2"+
		"\67\65\3\2\2\28,\3\2\2\289\3\2\2\29:\3\2\2\2:F\7\n\2\2;<\7\13\2\2<F\5"+
		"\4\3\32=>\7\f\2\2>F\5\4\3\31?@\5\b\5\2@A\7\4\2\2AB\5\2\2\2BC\7\5\2\2C"+
		"F\3\2\2\2DF\5\6\4\2E\30\3\2\2\2E\35\3\2\2\2E\'\3\2\2\2E+\3\2\2\2E;\3\2"+
		"\2\2E=\3\2\2\2E?\3\2\2\2ED\3\2\2\2F\u008a\3\2\2\2GH\f\25\2\2HI\7\16\2"+
		"\2I\u0089\5\4\3\26JK\f\24\2\2KL\7\17\2\2L\u0089\5\4\3\25MN\f\23\2\2NO"+
		"\7\20\2\2O\u0089\5\4\3\24PQ\f\22\2\2QR\7\21\2\2R\u0089\5\4\3\23ST\f\21"+
		"\2\2TU\7\13\2\2U\u0089\5\4\3\22VW\f\20\2\2WX\7\22\2\2X\u0089\5\4\3\21"+
		"YZ\f\17\2\2Z[\7\23\2\2[\u0089\5\4\3\20\\]\f\16\2\2]^\7\24\2\2^\u0089\5"+
		"\4\3\17_`\f\r\2\2`a\7\25\2\2a\u0089\5\4\3\16bc\f\f\2\2cd\7\26\2\2d\u0089"+
		"\5\4\3\ref\f\13\2\2fg\7\27\2\2g\u0089\5\4\3\fhi\f\n\2\2ij\7\30\2\2j\u0089"+
		"\5\4\3\13kl\f\t\2\2lm\7\31\2\2m\u0089\5\4\3\nno\f\b\2\2op\7\32\2\2p\u0089"+
		"\5\4\3\tqr\f\7\2\2rs\7\33\2\2s\u0089\5\4\3\btu\f\6\2\2uv\7\34\2\2v\u0089"+
		"\5\4\3\7wx\f\5\2\2xy\7\35\2\2y\u0089\5\4\3\6z{\f\4\2\2{|\7\36\2\2|}\5"+
		"\4\3\2}~\7\37\2\2~\177\5\4\3\5\177\u0089\3\2\2\2\u0080\u0081\f\27\2\2"+
		"\u0081\u0082\7\6\2\2\u0082\u0083\5\4\3\2\u0083\u0084\7\7\2\2\u0084\u0089"+
		"\3\2\2\2\u0085\u0086\f\26\2\2\u0086\u0087\7\r\2\2\u0087\u0089\7\61\2\2"+
		"\u0088G\3\2\2\2\u0088J\3\2\2\2\u0088M\3\2\2\2\u0088P\3\2\2\2\u0088S\3"+
		"\2\2\2\u0088V\3\2\2\2\u0088Y\3\2\2\2\u0088\\\3\2\2\2\u0088_\3\2\2\2\u0088"+
		"b\3\2\2\2\u0088e\3\2\2\2\u0088h\3\2\2\2\u0088k\3\2\2\2\u0088n\3\2\2\2"+
		"\u0088q\3\2\2\2\u0088t\3\2\2\2\u0088w\3\2\2\2\u0088z\3\2\2\2\u0088\u0080"+
		"\3\2\2\2\u0088\u0085\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\5\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0098\7,\2\2"+
		"\u008e\u0098\7-\2\2\u008f\u0098\7.\2\2\u0090\u0098\7/\2\2\u0091\u0092"+
		"\5\f\7\2\u0092\u0093\7\r\2\2\u0093\u0094\7\60\2\2\u0094\u0098\3\2\2\2"+
		"\u0095\u0098\5\f\7\2\u0096\u0098\7 \2\2\u0097\u008d\3\2\2\2\u0097\u008e"+
		"\3\2\2\2\u0097\u008f\3\2\2\2\u0097\u0090\3\2\2\2\u0097\u0091\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\7\3\2\2\2\u0099\u009a\b\5\1\2"+
		"\u009a\u009b\7\4\2\2\u009b\u009c\5\b\5\2\u009c\u009d\7\5\2\2\u009d\u00db"+
		"\3\2\2\2\u009e\u009f\7\4\2\2\u009f\u00a2\5\b\5\2\u00a0\u00a1\7\3\2\2\u00a1"+
		"\u00a3\5\b\5\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\5\2\2\u00a7"+
		"\u00db\3\2\2\2\u00a8\u00db\7!\2\2\u00a9\u00aa\7!\2\2\u00aa\u00ab\5\4\3"+
		"\2\u00ab\u00ac\7\"\2\2\u00ac\u00ad\5\4\3\2\u00ad\u00db\3\2\2\2\u00ae\u00db"+
		"\7#\2\2\u00af\u00db\7$\2\2\u00b0\u00db\7%\2\2\u00b1\u00b2\7&\2\2\u00b2"+
		"\u00b3\7\b\2\2\u00b3\u00b8\7\61\2\2\u00b4\u00b5\7\3\2\2\u00b5\u00b7\7"+
		"\61\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00db\7\n"+
		"\2\2\u00bc\u00bd\7\'\2\2\u00bd\u00c3\7\b\2\2\u00be\u00bf\7\61\2\2\u00bf"+
		"\u00c0\7\37\2\2\u00c0\u00c1\5\b\5\2\u00c1\u00c2\7(\2\2\u00c2\u00c4\3\2"+
		"\2\2\u00c3\u00be\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\n\2\2\u00c8\u00db\3\2"+
		"\2\2\u00c9\u00db\7*\2\2\u00ca\u00db\7+\2\2\u00cb\u00db\5\f\7\2\u00cc\u00d8"+
		"\5\f\7\2\u00cd\u00ce\7\22\2\2\u00ce\u00d3\5\n\6\2\u00cf\u00d0\7\3\2\2"+
		"\u00d0\u00d2\5\n\6\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00d7\7\24\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00cd\3\2\2\2\u00d8\u00d9\3"+
		"\2\2\2\u00d9\u00db\3\2\2\2\u00da\u0099\3\2\2\2\u00da\u009e\3\2\2\2\u00da"+
		"\u00a8\3\2\2\2\u00da\u00a9\3\2\2\2\u00da\u00ae\3\2\2\2\u00da\u00af\3\2"+
		"\2\2\u00da\u00b0\3\2\2\2\u00da\u00b1\3\2\2\2\u00da\u00bc\3\2\2\2\u00da"+
		"\u00c9\3\2\2\2\u00da\u00ca\3\2\2\2\u00da\u00cb\3\2\2\2\u00da\u00cc\3\2"+
		"\2\2\u00db\u00ea\3\2\2\2\u00dc\u00dd\f\7\2\2\u00dd\u00de\7\34\2\2\u00de"+
		"\u00e9\5\b\5\b\u00df\u00e0\f\t\2\2\u00e0\u00e2\7\6\2\2\u00e1\u00e3\5\4"+
		"\3\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e9\7\7\2\2\u00e5\u00e6\f\b\2\2\u00e6\u00e7\7)\2\2\u00e7\u00e9\5\4"+
		"\3\2\u00e8\u00dc\3\2\2\2\u00e8\u00df\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\t\3\2\2\2"+
		"\u00ec\u00ea\3\2\2\2\u00ed\u00f0\5\b\5\2\u00ee\u00f0\5\6\4\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\13\3\2\2\2\u00f1\u00f2\7\61\2\2\u00f2"+
		"\u00f4\7\r\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00f9\7\61\2\2\u00f9\r\3\2\2\2\26\23\26#\658E\u0088\u008a\u0097\u00a4"+
		"\u00b8\u00c5\u00d3\u00d8\u00da\u00e2\u00e8\u00ea\u00ef\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}