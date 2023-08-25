// Generated from TemporalLogic.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TemporalLogicParser extends Parser {
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, INT=51, REAL=52, STRING=53, 
		BOOLEAN=54, PORTVAR_SUFFIX=55, ID=56, PROB=57, IGNORE=58;
	public static final int
		RULE_pathFormulae = 0, RULE_stateFormulae = 1, RULE_terms = 2, RULE_term = 3, 
		RULE_value = 4, RULE_type = 5, RULE_typeorvalue = 6, RULE_scopedID = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"pathFormulae", "stateFormulae", "terms", "term", "value", "type", "typeorvalue", 
			"scopedID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'A'", "'E'", "'->'", "'<-'", "'<->'", "'&&'", "'||'", "'('", 
			"')'", "'X'", "'F'", "'G'", "'['", "'U'", "']'", "','", "'{'", "'='", 
			"'}'", "'-'", "'.'", "'%'", "'*'", "'/'", "'+'", "'<'", "'<='", "'>'", 
			"'>='", "'=='", "'!='", "'^'", "'^^'", "'&'", "'|'", "'?'", "':'", "'null'", 
			"'int'", "'..'", "'char'", "'double'", "'bool'", "'enum'", "'struct'", 
			"';'", "'init'", "'type'", "'NULL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INT", "REAL", "STRING", "BOOLEAN", "PORTVAR_SUFFIX", 
			"ID", "PROB", "IGNORE"
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
	public String getGrammarFileName() { return "TemporalLogic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TemporalLogicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PathFormulaeContext extends ParserRuleContext {
		public PathFormulaeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathFormulae; }
	 
		public PathFormulaeContext() { }
		public void copyFrom(PathFormulaeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotPathFormulaeContext extends PathFormulaeContext {
		public PathFormulaeContext pathFormulae() {
			return getRuleContext(PathFormulaeContext.class,0);
		}
		public NotPathFormulaeContext(PathFormulaeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterNotPathFormulae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitNotPathFormulae(this);
		}
	}
	public static class ExistsPathFormulaeContext extends PathFormulaeContext {
		public StateFormulaeContext stateFormulae() {
			return getRuleContext(StateFormulaeContext.class,0);
		}
		public ExistsPathFormulaeContext(PathFormulaeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterExistsPathFormulae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitExistsPathFormulae(this);
		}
	}
	public static class BracketPathFormulaeContext extends PathFormulaeContext {
		public PathFormulaeContext pathFormulae() {
			return getRuleContext(PathFormulaeContext.class,0);
		}
		public BracketPathFormulaeContext(PathFormulaeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterBracketPathFormulae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitBracketPathFormulae(this);
		}
	}
	public static class AllPathFormulaeContext extends PathFormulaeContext {
		public StateFormulaeContext stateFormulae() {
			return getRuleContext(StateFormulaeContext.class,0);
		}
		public AllPathFormulaeContext(PathFormulaeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterAllPathFormulae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitAllPathFormulae(this);
		}
	}
	public static class BinaryPathFormulaeContext extends PathFormulaeContext {
		public PathFormulaeContext left;
		public Token opr;
		public PathFormulaeContext right;
		public List<PathFormulaeContext> pathFormulae() {
			return getRuleContexts(PathFormulaeContext.class);
		}
		public PathFormulaeContext pathFormulae(int i) {
			return getRuleContext(PathFormulaeContext.class,i);
		}
		public BinaryPathFormulaeContext(PathFormulaeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterBinaryPathFormulae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitBinaryPathFormulae(this);
		}
	}
	public static class AtomicPathFormulaeContext extends PathFormulaeContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AtomicPathFormulaeContext(PathFormulaeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterAtomicPathFormulae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitAtomicPathFormulae(this);
		}
	}

	public final PathFormulaeContext pathFormulae() throws RecognitionException {
		return pathFormulae(0);
	}

	private PathFormulaeContext pathFormulae(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PathFormulaeContext _localctx = new PathFormulaeContext(_ctx, _parentState);
		PathFormulaeContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_pathFormulae, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new AtomicPathFormulaeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(17);
				term(0);
				}
				break;
			case 2:
				{
				_localctx = new NotPathFormulaeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(18);
				match(T__0);
				setState(19);
				pathFormulae(9);
				}
				break;
			case 3:
				{
				_localctx = new AllPathFormulaeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				match(T__1);
				setState(21);
				stateFormulae(0);
				}
				break;
			case 4:
				{
				_localctx = new ExistsPathFormulaeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22);
				match(T__2);
				setState(23);
				stateFormulae(0);
				}
				break;
			case 5:
				{
				_localctx = new BracketPathFormulaeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				match(T__8);
				setState(25);
				pathFormulae(0);
				setState(26);
				match(T__9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryPathFormulaeContext(new PathFormulaeContext(_parentctx, _parentState));
						((BinaryPathFormulaeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_pathFormulae);
						setState(30);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(31);
						((BinaryPathFormulaeContext)_localctx).opr = match(T__3);
						setState(32);
						((BinaryPathFormulaeContext)_localctx).right = pathFormulae(7);
						}
						break;
					case 2:
						{
						_localctx = new BinaryPathFormulaeContext(new PathFormulaeContext(_parentctx, _parentState));
						((BinaryPathFormulaeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_pathFormulae);
						setState(33);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(34);
						((BinaryPathFormulaeContext)_localctx).opr = match(T__4);
						setState(35);
						((BinaryPathFormulaeContext)_localctx).right = pathFormulae(6);
						}
						break;
					case 3:
						{
						_localctx = new BinaryPathFormulaeContext(new PathFormulaeContext(_parentctx, _parentState));
						((BinaryPathFormulaeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_pathFormulae);
						setState(36);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(37);
						((BinaryPathFormulaeContext)_localctx).opr = match(T__5);
						setState(38);
						((BinaryPathFormulaeContext)_localctx).right = pathFormulae(5);
						}
						break;
					case 4:
						{
						_localctx = new BinaryPathFormulaeContext(new PathFormulaeContext(_parentctx, _parentState));
						((BinaryPathFormulaeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_pathFormulae);
						setState(39);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(40);
						((BinaryPathFormulaeContext)_localctx).opr = match(T__6);
						setState(41);
						((BinaryPathFormulaeContext)_localctx).right = pathFormulae(4);
						}
						break;
					case 5:
						{
						_localctx = new BinaryPathFormulaeContext(new PathFormulaeContext(_parentctx, _parentState));
						((BinaryPathFormulaeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_pathFormulae);
						setState(42);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(43);
						((BinaryPathFormulaeContext)_localctx).opr = match(T__7);
						setState(44);
						((BinaryPathFormulaeContext)_localctx).right = pathFormulae(3);
						}
						break;
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class StateFormulaeContext extends ParserRuleContext {
		public StateFormulaeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateFormulae; }
	 
		public StateFormulaeContext() { }
		public void copyFrom(StateFormulaeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotStateFormulaeContext extends StateFormulaeContext {
		public StateFormulaeContext stateFormulae() {
			return getRuleContext(StateFormulaeContext.class,0);
		}
		public NotStateFormulaeContext(StateFormulaeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterNotStateFormulae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitNotStateFormulae(this);
		}
	}
	public static class PathStateFormulaeContext extends StateFormulaeContext {
		public PathFormulaeContext pathFormulae() {
			return getRuleContext(PathFormulaeContext.class,0);
		}
		public PathStateFormulaeContext(StateFormulaeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterPathStateFormulae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitPathStateFormulae(this);
		}
	}
	public static class GloballyStateFormulaeContext extends StateFormulaeContext {
		public StateFormulaeContext stateFormulae() {
			return getRuleContext(StateFormulaeContext.class,0);
		}
		public GloballyStateFormulaeContext(StateFormulaeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterGloballyStateFormulae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitGloballyStateFormulae(this);
		}
	}
	public static class BinaryStateFormulaeContext extends StateFormulaeContext {
		public StateFormulaeContext left;
		public Token opr;
		public StateFormulaeContext right;
		public List<StateFormulaeContext> stateFormulae() {
			return getRuleContexts(StateFormulaeContext.class);
		}
		public StateFormulaeContext stateFormulae(int i) {
			return getRuleContext(StateFormulaeContext.class,i);
		}
		public BinaryStateFormulaeContext(StateFormulaeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterBinaryStateFormulae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitBinaryStateFormulae(this);
		}
	}
	public static class BracketStateFormulaeContext extends StateFormulaeContext {
		public StateFormulaeContext stateFormulae() {
			return getRuleContext(StateFormulaeContext.class,0);
		}
		public BracketStateFormulaeContext(StateFormulaeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterBracketStateFormulae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitBracketStateFormulae(this);
		}
	}
	public static class FinallyStateFormulaeContext extends StateFormulaeContext {
		public StateFormulaeContext stateFormulae() {
			return getRuleContext(StateFormulaeContext.class,0);
		}
		public FinallyStateFormulaeContext(StateFormulaeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterFinallyStateFormulae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitFinallyStateFormulae(this);
		}
	}
	public static class NextStateFormulaeContext extends StateFormulaeContext {
		public StateFormulaeContext stateFormulae() {
			return getRuleContext(StateFormulaeContext.class,0);
		}
		public NextStateFormulaeContext(StateFormulaeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterNextStateFormulae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitNextStateFormulae(this);
		}
	}
	public static class UntilStateFormulaeContext extends StateFormulaeContext {
		public StateFormulaeContext keep;
		public StateFormulaeContext until;
		public List<StateFormulaeContext> stateFormulae() {
			return getRuleContexts(StateFormulaeContext.class);
		}
		public StateFormulaeContext stateFormulae(int i) {
			return getRuleContext(StateFormulaeContext.class,i);
		}
		public UntilStateFormulaeContext(StateFormulaeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterUntilStateFormulae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitUntilStateFormulae(this);
		}
	}

	public final StateFormulaeContext stateFormulae() throws RecognitionException {
		return stateFormulae(0);
	}

	private StateFormulaeContext stateFormulae(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StateFormulaeContext _localctx = new StateFormulaeContext(_ctx, _parentState);
		StateFormulaeContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_stateFormulae, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new PathStateFormulaeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51);
				pathFormulae(0);
				}
				break;
			case 2:
				{
				_localctx = new NotStateFormulaeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(T__0);
				setState(53);
				stateFormulae(11);
				}
				break;
			case 3:
				{
				_localctx = new NextStateFormulaeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(T__10);
				setState(55);
				stateFormulae(5);
				}
				break;
			case 4:
				{
				_localctx = new FinallyStateFormulaeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(T__11);
				setState(57);
				stateFormulae(4);
				}
				break;
			case 5:
				{
				_localctx = new GloballyStateFormulaeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(T__12);
				setState(59);
				stateFormulae(3);
				}
				break;
			case 6:
				{
				_localctx = new UntilStateFormulaeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(T__13);
				setState(61);
				((UntilStateFormulaeContext)_localctx).keep = stateFormulae(0);
				setState(62);
				match(T__14);
				setState(63);
				((UntilStateFormulaeContext)_localctx).until = stateFormulae(0);
				setState(64);
				match(T__15);
				}
				break;
			case 7:
				{
				_localctx = new BracketStateFormulaeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(T__8);
				setState(67);
				stateFormulae(0);
				setState(68);
				match(T__9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(87);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryStateFormulaeContext(new StateFormulaeContext(_parentctx, _parentState));
						((BinaryStateFormulaeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_stateFormulae);
						setState(72);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(73);
						((BinaryStateFormulaeContext)_localctx).opr = match(T__3);
						setState(74);
						((BinaryStateFormulaeContext)_localctx).right = stateFormulae(11);
						}
						break;
					case 2:
						{
						_localctx = new BinaryStateFormulaeContext(new StateFormulaeContext(_parentctx, _parentState));
						((BinaryStateFormulaeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_stateFormulae);
						setState(75);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(76);
						((BinaryStateFormulaeContext)_localctx).opr = match(T__4);
						setState(77);
						((BinaryStateFormulaeContext)_localctx).right = stateFormulae(10);
						}
						break;
					case 3:
						{
						_localctx = new BinaryStateFormulaeContext(new StateFormulaeContext(_parentctx, _parentState));
						((BinaryStateFormulaeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_stateFormulae);
						setState(78);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(79);
						((BinaryStateFormulaeContext)_localctx).opr = match(T__5);
						setState(80);
						((BinaryStateFormulaeContext)_localctx).right = stateFormulae(9);
						}
						break;
					case 4:
						{
						_localctx = new BinaryStateFormulaeContext(new StateFormulaeContext(_parentctx, _parentState));
						((BinaryStateFormulaeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_stateFormulae);
						setState(81);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(82);
						((BinaryStateFormulaeContext)_localctx).opr = match(T__6);
						setState(83);
						((BinaryStateFormulaeContext)_localctx).right = stateFormulae(8);
						}
						break;
					case 5:
						{
						_localctx = new BinaryStateFormulaeContext(new StateFormulaeContext(_parentctx, _parentState));
						((BinaryStateFormulaeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_stateFormulae);
						setState(84);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(85);
						((BinaryStateFormulaeContext)_localctx).opr = match(T__7);
						setState(86);
						((BinaryStateFormulaeContext)_localctx).right = stateFormulae(7);
						}
						break;
					}
					} 
				}
				setState(91);
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
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitTerms(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__13) | (1L << T__17) | (1L << T__20) | (1L << T__38) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__48) | (1L << T__49) | (1L << INT) | (1L << REAL) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				setState(92);
				term(0);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(93);
					match(T__16);
					setState(94);
					term(0);
					}
					}
					setState(99);
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
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterValueTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitValueTerm(this);
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
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterIteTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitIteTerm(this);
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
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterBinaryOprTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitBinaryOprTerm(this);
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
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterElementTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitElementTerm(this);
		}
	}
	public static class BracketTermContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public BracketTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterBracketTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitBracketTerm(this);
		}
	}
	public static class StructTermContext extends TermContext {
		public List<TerminalNode> ID() { return getTokens(TemporalLogicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TemporalLogicParser.ID, i);
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
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterStructTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitStructTerm(this);
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
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterTupleTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitTupleTerm(this);
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
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterSingleOprTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitSingleOprTerm(this);
		}
	}
	public static class ListTermContext extends TermContext {
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public ListTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterListTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitListTerm(this);
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
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterCallTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitCallTerm(this);
		}
	}
	public static class FieldTermContext extends TermContext {
		public TermContext structure;
		public Token key;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ID() { return getToken(TemporalLogicParser.ID, 0); }
		public FieldTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterFieldTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitFieldTerm(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new BracketTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(103);
				match(T__8);
				setState(104);
				term(0);
				setState(105);
				match(T__9);
				}
				break;
			case 2:
				{
				_localctx = new TupleTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(T__8);
				setState(108);
				term(0);
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(109);
					match(T__16);
					setState(110);
					term(0);
					}
					}
					setState(113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__16 );
				setState(115);
				match(T__9);
				}
				break;
			case 3:
				{
				_localctx = new ListTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(T__13);
				setState(118);
				terms();
				setState(119);
				match(T__15);
				}
				break;
			case 4:
				{
				_localctx = new StructTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(T__17);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(122);
					match(ID);
					setState(123);
					match(T__18);
					setState(124);
					term(0);
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__16) {
						{
						{
						setState(125);
						match(T__16);
						setState(126);
						match(ID);
						setState(127);
						match(T__18);
						setState(128);
						term(0);
						}
						}
						setState(133);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(136);
				match(T__19);
				}
				break;
			case 5:
				{
				_localctx = new SingleOprTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				((SingleOprTermContext)_localctx).opr = match(T__20);
				setState(138);
				term(24);
				}
				break;
			case 6:
				{
				_localctx = new SingleOprTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				((SingleOprTermContext)_localctx).opr = match(T__0);
				setState(140);
				term(23);
				}
				break;
			case 7:
				{
				_localctx = new CallTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				((CallTermContext)_localctx).callee = type(0);
				setState(142);
				match(T__8);
				setState(143);
				((CallTermContext)_localctx).args = terms();
				setState(144);
				match(T__9);
				}
				break;
			case 8:
				{
				_localctx = new ValueTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(214);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(149);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(150);
						((BinaryOprTermContext)_localctx).opr = match(T__22);
						setState(151);
						((BinaryOprTermContext)_localctx).right = term(20);
						}
						break;
					case 2:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(152);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(153);
						((BinaryOprTermContext)_localctx).opr = match(T__23);
						setState(154);
						((BinaryOprTermContext)_localctx).right = term(19);
						}
						break;
					case 3:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(155);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(156);
						((BinaryOprTermContext)_localctx).opr = match(T__24);
						setState(157);
						((BinaryOprTermContext)_localctx).right = term(18);
						}
						break;
					case 4:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(158);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(159);
						((BinaryOprTermContext)_localctx).opr = match(T__25);
						setState(160);
						((BinaryOprTermContext)_localctx).right = term(17);
						}
						break;
					case 5:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(161);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(162);
						((BinaryOprTermContext)_localctx).opr = match(T__20);
						setState(163);
						((BinaryOprTermContext)_localctx).right = term(16);
						}
						break;
					case 6:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(164);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(165);
						((BinaryOprTermContext)_localctx).opr = match(T__26);
						setState(166);
						((BinaryOprTermContext)_localctx).right = term(15);
						}
						break;
					case 7:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(167);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(168);
						((BinaryOprTermContext)_localctx).opr = match(T__27);
						setState(169);
						((BinaryOprTermContext)_localctx).right = term(14);
						}
						break;
					case 8:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(170);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(171);
						((BinaryOprTermContext)_localctx).opr = match(T__28);
						setState(172);
						((BinaryOprTermContext)_localctx).right = term(13);
						}
						break;
					case 9:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(173);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(174);
						((BinaryOprTermContext)_localctx).opr = match(T__29);
						setState(175);
						((BinaryOprTermContext)_localctx).right = term(12);
						}
						break;
					case 10:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(176);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(177);
						((BinaryOprTermContext)_localctx).opr = match(T__30);
						setState(178);
						((BinaryOprTermContext)_localctx).right = term(11);
						}
						break;
					case 11:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(179);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(180);
						((BinaryOprTermContext)_localctx).opr = match(T__31);
						setState(181);
						((BinaryOprTermContext)_localctx).right = term(10);
						}
						break;
					case 12:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(182);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(183);
						((BinaryOprTermContext)_localctx).opr = match(T__32);
						setState(184);
						((BinaryOprTermContext)_localctx).right = term(9);
						}
						break;
					case 13:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(185);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(186);
						((BinaryOprTermContext)_localctx).opr = match(T__33);
						setState(187);
						((BinaryOprTermContext)_localctx).right = term(8);
						}
						break;
					case 14:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(188);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(189);
						((BinaryOprTermContext)_localctx).opr = match(T__34);
						setState(190);
						((BinaryOprTermContext)_localctx).right = term(7);
						}
						break;
					case 15:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(191);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(192);
						((BinaryOprTermContext)_localctx).opr = match(T__6);
						setState(193);
						((BinaryOprTermContext)_localctx).right = term(6);
						}
						break;
					case 16:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(194);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(195);
						((BinaryOprTermContext)_localctx).opr = match(T__35);
						setState(196);
						((BinaryOprTermContext)_localctx).right = term(5);
						}
						break;
					case 17:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(197);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(198);
						((BinaryOprTermContext)_localctx).opr = match(T__7);
						setState(199);
						((BinaryOprTermContext)_localctx).right = term(4);
						}
						break;
					case 18:
						{
						_localctx = new IteTermContext(new TermContext(_parentctx, _parentState));
						((IteTermContext)_localctx).condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(200);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(201);
						match(T__36);
						setState(202);
						((IteTermContext)_localctx).ifTrue = term(0);
						setState(203);
						match(T__37);
						setState(204);
						((IteTermContext)_localctx).ifFalse = term(3);
						}
						break;
					case 19:
						{
						_localctx = new ElementTermContext(new TermContext(_parentctx, _parentState));
						((ElementTermContext)_localctx).container = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(206);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(207);
						match(T__13);
						setState(208);
						((ElementTermContext)_localctx).key = term(0);
						setState(209);
						match(T__15);
						}
						break;
					case 20:
						{
						_localctx = new FieldTermContext(new TermContext(_parentctx, _parentState));
						((FieldTermContext)_localctx).structure = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(211);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(212);
						match(T__21);
						setState(213);
						((FieldTermContext)_localctx).key = match(ID);
						}
						break;
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public TerminalNode INT() { return getToken(TemporalLogicParser.INT, 0); }
		public IntValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterIntValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitIntValue(this);
		}
	}
	public static class PortVarValueContext extends ValueContext {
		public ScopedIDContext scopedID() {
			return getRuleContext(ScopedIDContext.class,0);
		}
		public TerminalNode PORTVAR_SUFFIX() { return getToken(TemporalLogicParser.PORTVAR_SUFFIX, 0); }
		public PortVarValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterPortVarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitPortVarValue(this);
		}
	}
	public static class BoolValueContext extends ValueContext {
		public TerminalNode BOOLEAN() { return getToken(TemporalLogicParser.BOOLEAN, 0); }
		public BoolValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitBoolValue(this);
		}
	}
	public static class IdValueContext extends ValueContext {
		public ScopedIDContext scopedID() {
			return getRuleContext(ScopedIDContext.class,0);
		}
		public IdValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterIdValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitIdValue(this);
		}
	}
	public static class DoubleValueContext extends ValueContext {
		public TerminalNode REAL() { return getToken(TemporalLogicParser.REAL, 0); }
		public DoubleValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterDoubleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitDoubleValue(this);
		}
	}
	public static class StrValueContext extends ValueContext {
		public TerminalNode STRING() { return getToken(TemporalLogicParser.STRING, 0); }
		public StrValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterStrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitStrValue(this);
		}
	}
	public static class NullValueContext extends ValueContext {
		public NullValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterNullValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitNullValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new IntValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(INT);
				}
				break;
			case 2:
				_localctx = new DoubleValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(REAL);
				}
				break;
			case 3:
				_localctx = new StrValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new BoolValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				match(BOOLEAN);
				}
				break;
			case 5:
				_localctx = new PortVarValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				scopedID();
				setState(224);
				match(T__21);
				setState(225);
				match(PORTVAR_SUFFIX);
				}
				break;
			case 6:
				_localctx = new IdValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(227);
				scopedID();
				}
				break;
			case 7:
				_localctx = new NullValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(228);
				match(T__38);
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
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterBracketType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitBracketType(this);
		}
	}
	public static class CharTypeContext extends TypeContext {
		public CharTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterCharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitCharType(this);
		}
	}
	public static class DoubleTypeContext extends TypeContext {
		public DoubleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitDoubleType(this);
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
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterTemplateType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitTemplateType(this);
		}
	}
	public static class IdTypeContext extends TypeContext {
		public ScopedIDContext scopedID() {
			return getRuleContext(ScopedIDContext.class,0);
		}
		public IdTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterIdType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitIdType(this);
		}
	}
	public static class AbstractTypeContext extends TypeContext {
		public AbstractTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterAbstractType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitAbstractType(this);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitIntType(this);
		}
	}
	public static class EnumTypeContext extends TypeContext {
		public List<TerminalNode> ID() { return getTokens(TemporalLogicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TemporalLogicParser.ID, i);
		}
		public EnumTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitEnumType(this);
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
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitTupleType(this);
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
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterInitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitInitType(this);
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
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitListType(this);
		}
	}
	public static class BoolTypeContext extends TypeContext {
		public BoolTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitBoolType(this);
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
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterBoundedIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitBoundedIntType(this);
		}
	}
	public static class StructTypeContext extends TypeContext {
		public List<TerminalNode> ID() { return getTokens(TemporalLogicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TemporalLogicParser.ID, i);
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
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitStructType(this);
		}
	}
	public static class NullTypeContext extends TypeContext {
		public NullTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterNullType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitNullType(this);
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
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterUnionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitUnionType(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new BracketTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(232);
				match(T__8);
				setState(233);
				type(0);
				setState(234);
				match(T__9);
				}
				break;
			case 2:
				{
				_localctx = new TupleTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				match(T__8);
				setState(237);
				type(0);
				setState(240); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(238);
					match(T__16);
					setState(239);
					type(0);
					}
					}
					setState(242); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__16 );
				setState(244);
				match(T__9);
				}
				break;
			case 3:
				{
				_localctx = new IntTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246);
				match(T__39);
				}
				break;
			case 4:
				{
				_localctx = new BoundedIntTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				match(T__39);
				setState(248);
				((BoundedIntTypeContext)_localctx).lbound = term(0);
				setState(249);
				match(T__40);
				setState(250);
				((BoundedIntTypeContext)_localctx).ubound = term(0);
				}
				break;
			case 5:
				{
				_localctx = new CharTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				match(T__41);
				}
				break;
			case 6:
				{
				_localctx = new DoubleTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(T__42);
				}
				break;
			case 7:
				{
				_localctx = new BoolTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254);
				match(T__43);
				}
				break;
			case 8:
				{
				_localctx = new EnumTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255);
				match(T__44);
				setState(256);
				match(T__17);
				setState(257);
				match(ID);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(258);
					match(T__16);
					setState(259);
					match(ID);
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(265);
				match(T__19);
				}
				break;
			case 9:
				{
				_localctx = new StructTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				match(T__45);
				setState(267);
				match(T__17);
				setState(273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(268);
					match(ID);
					setState(269);
					match(T__37);
					setState(270);
					type(0);
					setState(271);
					match(T__46);
					}
					}
					setState(275); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(277);
				match(T__19);
				}
				break;
			case 10:
				{
				_localctx = new AbstractTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279);
				match(T__48);
				}
				break;
			case 11:
				{
				_localctx = new NullTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(280);
				match(T__49);
				}
				break;
			case 12:
				{
				_localctx = new IdTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(281);
				scopedID();
				}
				break;
			case 13:
				{
				_localctx = new TemplateTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282);
				scopedID();
				setState(294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(283);
					match(T__26);
					setState(284);
					typeorvalue();
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__16) {
						{
						{
						setState(285);
						match(T__16);
						setState(286);
						typeorvalue();
						}
						}
						setState(291);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(292);
					match(T__28);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(310);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new UnionTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(298);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(299);
						match(T__35);
						setState(300);
						type(6);
						}
						break;
					case 2:
						{
						_localctx = new ListTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(301);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(302);
						match(T__13);
						setState(304);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__13) | (1L << T__17) | (1L << T__20) | (1L << T__38) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__48) | (1L << T__49) | (1L << INT) | (1L << REAL) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
							{
							setState(303);
							((ListTypeContext)_localctx).capacity = term(0);
							}
						}

						setState(306);
						match(T__15);
						}
						break;
					case 3:
						{
						_localctx = new InitTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(307);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(308);
						match(T__47);
						setState(309);
						term(0);
						}
						break;
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterTypeorvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitTypeorvalue(this);
		}
	}

	public final TypeorvalueContext typeorvalue() throws RecognitionException {
		TypeorvalueContext _localctx = new TypeorvalueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeorvalue);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
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
		public List<TerminalNode> ID() { return getTokens(TemporalLogicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TemporalLogicParser.ID, i);
		}
		public ScopedIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopedID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).enterScopedID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemporalLogicListener ) ((TemporalLogicListener)listener).exitScopedID(this);
		}
	}

	public final ScopedIDContext scopedID() throws RecognitionException {
		ScopedIDContext _localctx = new ScopedIDContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_scopedID);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(319);
					((ScopedIDContext)_localctx).ID = match(ID);
					((ScopedIDContext)_localctx).scopes.add(((ScopedIDContext)_localctx).ID);
					setState(320);
					match(T__21);
					}
					} 
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(326);
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
		case 0:
			return pathFormulae_sempred((PathFormulaeContext)_localctx, predIndex);
		case 1:
			return stateFormulae_sempred((StateFormulaeContext)_localctx, predIndex);
		case 3:
			return term_sempred((TermContext)_localctx, predIndex);
		case 5:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean pathFormulae_sempred(PathFormulaeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean stateFormulae_sempred(StateFormulaeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 19);
		case 11:
			return precpred(_ctx, 18);
		case 12:
			return precpred(_ctx, 17);
		case 13:
			return precpred(_ctx, 16);
		case 14:
			return precpred(_ctx, 15);
		case 15:
			return precpred(_ctx, 14);
		case 16:
			return precpred(_ctx, 13);
		case 17:
			return precpred(_ctx, 12);
		case 18:
			return precpred(_ctx, 11);
		case 19:
			return precpred(_ctx, 10);
		case 20:
			return precpred(_ctx, 9);
		case 21:
			return precpred(_ctx, 8);
		case 22:
			return precpred(_ctx, 7);
		case 23:
			return precpred(_ctx, 6);
		case 24:
			return precpred(_ctx, 5);
		case 25:
			return precpred(_ctx, 4);
		case 26:
			return precpred(_ctx, 3);
		case 27:
			return precpred(_ctx, 2);
		case 28:
			return precpred(_ctx, 21);
		case 29:
			return precpred(_ctx, 20);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 5);
		case 31:
			return precpred(_ctx, 7);
		case 32:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u014b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\37\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16\2\63\13\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3I\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3Z\n\3\f\3\16\3]\13\3\3\4\3\4\3\4\7\4b\n\4\f\4\16\4e\13\4\5\4g\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5r\n\5\r\5\16\5s\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0084\n\5\f\5\16\5\u0087"+
		"\13\5\5\5\u0089\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0096"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00d9\n\5\f"+
		"\5\16\5\u00dc\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00e8\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00f3\n\7\r\7\16\7\u00f4\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0107"+
		"\n\7\f\7\16\7\u010a\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u0114\n\7"+
		"\r\7\16\7\u0115\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0122\n\7"+
		"\f\7\16\7\u0125\13\7\3\7\3\7\5\7\u0129\n\7\5\7\u012b\n\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u0133\n\7\3\7\3\7\3\7\3\7\7\7\u0139\n\7\f\7\16\7\u013c"+
		"\13\7\3\b\3\b\5\b\u0140\n\b\3\t\3\t\7\t\u0144\n\t\f\t\16\t\u0147\13\t"+
		"\3\t\3\t\3\t\2\6\2\4\b\f\n\2\4\6\b\n\f\16\20\2\2\2\u0193\2\36\3\2\2\2"+
		"\4H\3\2\2\2\6f\3\2\2\2\b\u0095\3\2\2\2\n\u00e7\3\2\2\2\f\u012a\3\2\2\2"+
		"\16\u013f\3\2\2\2\20\u0145\3\2\2\2\22\23\b\2\1\2\23\37\5\b\5\2\24\25\7"+
		"\3\2\2\25\37\5\2\2\13\26\27\7\4\2\2\27\37\5\4\3\2\30\31\7\5\2\2\31\37"+
		"\5\4\3\2\32\33\7\13\2\2\33\34\5\2\2\2\34\35\7\f\2\2\35\37\3\2\2\2\36\22"+
		"\3\2\2\2\36\24\3\2\2\2\36\26\3\2\2\2\36\30\3\2\2\2\36\32\3\2\2\2\37\61"+
		"\3\2\2\2 !\f\b\2\2!\"\7\6\2\2\"\60\5\2\2\t#$\f\7\2\2$%\7\7\2\2%\60\5\2"+
		"\2\b&\'\f\6\2\2\'(\7\b\2\2(\60\5\2\2\7)*\f\5\2\2*+\7\t\2\2+\60\5\2\2\6"+
		",-\f\4\2\2-.\7\n\2\2.\60\5\2\2\5/ \3\2\2\2/#\3\2\2\2/&\3\2\2\2/)\3\2\2"+
		"\2/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\61"+
		"\3\2\2\2\64\65\b\3\1\2\65I\5\2\2\2\66\67\7\3\2\2\67I\5\4\3\r89\7\r\2\2"+
		"9I\5\4\3\7:;\7\16\2\2;I\5\4\3\6<=\7\17\2\2=I\5\4\3\5>?\7\20\2\2?@\5\4"+
		"\3\2@A\7\21\2\2AB\5\4\3\2BC\7\22\2\2CI\3\2\2\2DE\7\13\2\2EF\5\4\3\2FG"+
		"\7\f\2\2GI\3\2\2\2H\64\3\2\2\2H\66\3\2\2\2H8\3\2\2\2H:\3\2\2\2H<\3\2\2"+
		"\2H>\3\2\2\2HD\3\2\2\2I[\3\2\2\2JK\f\f\2\2KL\7\6\2\2LZ\5\4\3\rMN\f\13"+
		"\2\2NO\7\7\2\2OZ\5\4\3\fPQ\f\n\2\2QR\7\b\2\2RZ\5\4\3\13ST\f\t\2\2TU\7"+
		"\t\2\2UZ\5\4\3\nVW\f\b\2\2WX\7\n\2\2XZ\5\4\3\tYJ\3\2\2\2YM\3\2\2\2YP\3"+
		"\2\2\2YS\3\2\2\2YV\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\5\3\2\2\2"+
		"][\3\2\2\2^c\5\b\5\2_`\7\23\2\2`b\5\b\5\2a_\3\2\2\2be\3\2\2\2ca\3\2\2"+
		"\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2f^\3\2\2\2fg\3\2\2\2g\7\3\2\2\2hi\b\5"+
		"\1\2ij\7\13\2\2jk\5\b\5\2kl\7\f\2\2l\u0096\3\2\2\2mn\7\13\2\2nq\5\b\5"+
		"\2op\7\23\2\2pr\5\b\5\2qo\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2"+
		"\2\2uv\7\f\2\2v\u0096\3\2\2\2wx\7\20\2\2xy\5\6\4\2yz\7\22\2\2z\u0096\3"+
		"\2\2\2{\u0088\7\24\2\2|}\7:\2\2}~\7\25\2\2~\u0085\5\b\5\2\177\u0080\7"+
		"\23\2\2\u0080\u0081\7:\2\2\u0081\u0082\7\25\2\2\u0082\u0084\5\b\5\2\u0083"+
		"\177\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2"+
		"\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0088|\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0096\7\26\2\2\u008b\u008c\7\27\2\2"+
		"\u008c\u0096\5\b\5\32\u008d\u008e\7\3\2\2\u008e\u0096\5\b\5\31\u008f\u0090"+
		"\5\f\7\2\u0090\u0091\7\13\2\2\u0091\u0092\5\6\4\2\u0092\u0093\7\f\2\2"+
		"\u0093\u0096\3\2\2\2\u0094\u0096\5\n\6\2\u0095h\3\2\2\2\u0095m\3\2\2\2"+
		"\u0095w\3\2\2\2\u0095{\3\2\2\2\u0095\u008b\3\2\2\2\u0095\u008d\3\2\2\2"+
		"\u0095\u008f\3\2\2\2\u0095\u0094\3\2\2\2\u0096\u00da\3\2\2\2\u0097\u0098"+
		"\f\25\2\2\u0098\u0099\7\31\2\2\u0099\u00d9\5\b\5\26\u009a\u009b\f\24\2"+
		"\2\u009b\u009c\7\32\2\2\u009c\u00d9\5\b\5\25\u009d\u009e\f\23\2\2\u009e"+
		"\u009f\7\33\2\2\u009f\u00d9\5\b\5\24\u00a0\u00a1\f\22\2\2\u00a1\u00a2"+
		"\7\34\2\2\u00a2\u00d9\5\b\5\23\u00a3\u00a4\f\21\2\2\u00a4\u00a5\7\27\2"+
		"\2\u00a5\u00d9\5\b\5\22\u00a6\u00a7\f\20\2\2\u00a7\u00a8\7\35\2\2\u00a8"+
		"\u00d9\5\b\5\21\u00a9\u00aa\f\17\2\2\u00aa\u00ab\7\36\2\2\u00ab\u00d9"+
		"\5\b\5\20\u00ac\u00ad\f\16\2\2\u00ad\u00ae\7\37\2\2\u00ae\u00d9\5\b\5"+
		"\17\u00af\u00b0\f\r\2\2\u00b0\u00b1\7 \2\2\u00b1\u00d9\5\b\5\16\u00b2"+
		"\u00b3\f\f\2\2\u00b3\u00b4\7!\2\2\u00b4\u00d9\5\b\5\r\u00b5\u00b6\f\13"+
		"\2\2\u00b6\u00b7\7\"\2\2\u00b7\u00d9\5\b\5\f\u00b8\u00b9\f\n\2\2\u00b9"+
		"\u00ba\7#\2\2\u00ba\u00d9\5\b\5\13\u00bb\u00bc\f\t\2\2\u00bc\u00bd\7$"+
		"\2\2\u00bd\u00d9\5\b\5\n\u00be\u00bf\f\b\2\2\u00bf\u00c0\7%\2\2\u00c0"+
		"\u00d9\5\b\5\t\u00c1\u00c2\f\7\2\2\u00c2\u00c3\7\t\2\2\u00c3\u00d9\5\b"+
		"\5\b\u00c4\u00c5\f\6\2\2\u00c5\u00c6\7&\2\2\u00c6\u00d9\5\b\5\7\u00c7"+
		"\u00c8\f\5\2\2\u00c8\u00c9\7\n\2\2\u00c9\u00d9\5\b\5\6\u00ca\u00cb\f\4"+
		"\2\2\u00cb\u00cc\7\'\2\2\u00cc\u00cd\5\b\5\2\u00cd\u00ce\7(\2\2\u00ce"+
		"\u00cf\5\b\5\5\u00cf\u00d9\3\2\2\2\u00d0\u00d1\f\27\2\2\u00d1\u00d2\7"+
		"\20\2\2\u00d2\u00d3\5\b\5\2\u00d3\u00d4\7\22\2\2\u00d4\u00d9\3\2\2\2\u00d5"+
		"\u00d6\f\26\2\2\u00d6\u00d7\7\30\2\2\u00d7\u00d9\7:\2\2\u00d8\u0097\3"+
		"\2\2\2\u00d8\u009a\3\2\2\2\u00d8\u009d\3\2\2\2\u00d8\u00a0\3\2\2\2\u00d8"+
		"\u00a3\3\2\2\2\u00d8\u00a6\3\2\2\2\u00d8\u00a9\3\2\2\2\u00d8\u00ac\3\2"+
		"\2\2\u00d8\u00af\3\2\2\2\u00d8\u00b2\3\2\2\2\u00d8\u00b5\3\2\2\2\u00d8"+
		"\u00b8\3\2\2\2\u00d8\u00bb\3\2\2\2\u00d8\u00be\3\2\2\2\u00d8\u00c1\3\2"+
		"\2\2\u00d8\u00c4\3\2\2\2\u00d8\u00c7\3\2\2\2\u00d8\u00ca\3\2\2\2\u00d8"+
		"\u00d0\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\t\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e8"+
		"\7\65\2\2\u00de\u00e8\7\66\2\2\u00df\u00e8\7\67\2\2\u00e0\u00e8\78\2\2"+
		"\u00e1\u00e2\5\20\t\2\u00e2\u00e3\7\30\2\2\u00e3\u00e4\79\2\2\u00e4\u00e8"+
		"\3\2\2\2\u00e5\u00e8\5\20\t\2\u00e6\u00e8\7)\2\2\u00e7\u00dd\3\2\2\2\u00e7"+
		"\u00de\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e7\u00e1\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\13\3\2\2\2\u00e9\u00ea"+
		"\b\7\1\2\u00ea\u00eb\7\13\2\2\u00eb\u00ec\5\f\7\2\u00ec\u00ed\7\f\2\2"+
		"\u00ed\u012b\3\2\2\2\u00ee\u00ef\7\13\2\2\u00ef\u00f2\5\f\7\2\u00f0\u00f1"+
		"\7\23\2\2\u00f1\u00f3\5\f\7\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\3\2\2\2"+
		"\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7"+
		"\7\f\2\2\u00f7\u012b\3\2\2\2\u00f8\u012b\7*\2\2\u00f9\u00fa\7*\2\2\u00fa"+
		"\u00fb\5\b\5\2\u00fb\u00fc\7+\2\2\u00fc\u00fd\5\b\5\2\u00fd\u012b\3\2"+
		"\2\2\u00fe\u012b\7,\2\2\u00ff\u012b\7-\2\2\u0100\u012b\7.\2\2\u0101\u0102"+
		"\7/\2\2\u0102\u0103\7\24\2\2\u0103\u0108\7:\2\2\u0104\u0105\7\23\2\2\u0105"+
		"\u0107\7:\2\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u012b\7\26\2\2\u010c\u010d\7\60\2\2\u010d\u0113\7\24\2\2\u010e\u010f"+
		"\7:\2\2\u010f\u0110\7(\2\2\u0110\u0111\5\f\7\2\u0111\u0112\7\61\2\2\u0112"+
		"\u0114\3\2\2\2\u0113\u010e\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7\26\2\2\u0118"+
		"\u012b\3\2\2\2\u0119\u012b\7\63\2\2\u011a\u012b\7\64\2\2\u011b\u012b\5"+
		"\20\t\2\u011c\u0128\5\20\t\2\u011d\u011e\7\35\2\2\u011e\u0123\5\16\b\2"+
		"\u011f\u0120\7\23\2\2\u0120\u0122\5\16\b\2\u0121\u011f\3\2\2\2\u0122\u0125"+
		"\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0126\u0127\7\37\2\2\u0127\u0129\3\2\2\2\u0128\u011d\3"+
		"\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u00e9\3\2\2\2\u012a"+
		"\u00ee\3\2\2\2\u012a\u00f8\3\2\2\2\u012a\u00f9\3\2\2\2\u012a\u00fe\3\2"+
		"\2\2\u012a\u00ff\3\2\2\2\u012a\u0100\3\2\2\2\u012a\u0101\3\2\2\2\u012a"+
		"\u010c\3\2\2\2\u012a\u0119\3\2\2\2\u012a\u011a\3\2\2\2\u012a\u011b\3\2"+
		"\2\2\u012a\u011c\3\2\2\2\u012b\u013a\3\2\2\2\u012c\u012d\f\7\2\2\u012d"+
		"\u012e\7&\2\2\u012e\u0139\5\f\7\b\u012f\u0130\f\t\2\2\u0130\u0132\7\20"+
		"\2\2\u0131\u0133\5\b\5\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0139\7\22\2\2\u0135\u0136\f\b\2\2\u0136\u0137\7"+
		"\62\2\2\u0137\u0139\5\b\5\2\u0138\u012c\3\2\2\2\u0138\u012f\3\2\2\2\u0138"+
		"\u0135\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\r\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u0140\5\f\7\2\u013e\u0140"+
		"\5\n\6\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140\17\3\2\2\2\u0141"+
		"\u0142\7:\2\2\u0142\u0144\7\30\2\2\u0143\u0141\3\2\2\2\u0144\u0147\3\2"+
		"\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0148\u0149\7:\2\2\u0149\21\3\2\2\2\34\36/\61HY[cfs\u0085"+
		"\u0088\u0095\u00d8\u00da\u00e7\u00f4\u0108\u0115\u0123\u0128\u012a\u0132"+
		"\u0138\u013a\u013f\u0145";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}