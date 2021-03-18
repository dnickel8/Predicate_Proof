package generated;// Generated from C:/Users/admin/Documents/Studium/Master/Forschungsprojekt/predicate_proof/src\predicate_proof_grammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class predicate_proof_grammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, FORMULAEND=11, VARIABLEEND=12, ASSUMPTION=13, PREMISE=14, BOTTOM=15, 
		NOT=16, EXISTQUANTOR=17, ALLQUANTOR=18, AND=19, OR=20, TRANSFORMATION_ARROW=21, 
		EUQIVALENZ_ARROW=22, BLOCKBEGIN=23, BLOCKEND=24, LPAREN=25, RPAREN=26, 
		COMMA=27, EOL=28, DIGIT=29, CHAR=30, WS=31;
	public static final int
		RULE_predicateProof = 0, RULE_block = 1, RULE_lineWithVariableSymbol = 2, 
		RULE_line = 3, RULE_logicFormula = 4, RULE_implicationExpression = 5, 
		RULE_orAndExpression = 6, RULE_unaryExpression = 7, RULE_unaryOperator = 8, 
		RULE_predicateOrFunction = 9, RULE_parameter = 10, RULE_description = 11, 
		RULE_andIntroduction = 12, RULE_andElimination1 = 13, RULE_andElimination2 = 14, 
		RULE_orIntroduction1 = 15, RULE_orIntroduction2 = 16, RULE_orElimination = 17, 
		RULE_impliesIntroduction = 18, RULE_impliesElimination = 19, RULE_notIntroduction = 20, 
		RULE_notElimination = 21, RULE_bottomElimination = 22, RULE_doubleNotIntroduction = 23, 
		RULE_doubleNotElimination = 24, RULE_modusTollens = 25, RULE_pbc = 26, 
		RULE_excludedMiddle = 27, RULE_allquantorIntroduction = 28, RULE_allquantorElimination = 29, 
		RULE_existsquantorIntroduction = 30, RULE_existsquantorElimination = 31, 
		RULE_variable = 32, RULE_singleScope = 33, RULE_multiScope = 34, RULE_lineNumber = 35, 
		RULE_integer = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"predicateProof", "block", "lineWithVariableSymbol", "line", "logicFormula", 
			"implicationExpression", "orAndExpression", "unaryExpression", "unaryOperator", 
			"predicateOrFunction", "parameter", "description", "andIntroduction", 
			"andElimination1", "andElimination2", "orIntroduction1", "orIntroduction2", 
			"orElimination", "impliesIntroduction", "impliesElimination", "notIntroduction", 
			"notElimination", "bottomElimination", "doubleNotIntroduction", "doubleNotElimination", 
			"modusTollens", "pbc", "excludedMiddle", "allquantorIntroduction", "allquantorElimination", 
			"existsquantorIntroduction", "existsquantorElimination", "variable", 
			"singleScope", "multiScope", "lineNumber", "integer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'i'", "'e1'", "'e2'", "'i1'", "'i2'", "'e'", "'MT'", "'PBC'", 
			"'LEM'", "'-'", "'\\formula_end'", "'\\variable_end'", null, null, "'\\bot'", 
			"'\\neg'", "'\\exists'", "'\\forall'", "'\\wedge'", "'\\vee'", null, 
			"'\\leftrightarrow'", "'\\block_begin'", "'\\block_end'", null, null, 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "FORMULAEND", 
			"VARIABLEEND", "ASSUMPTION", "PREMISE", "BOTTOM", "NOT", "EXISTQUANTOR", 
			"ALLQUANTOR", "AND", "OR", "TRANSFORMATION_ARROW", "EUQIVALENZ_ARROW", 
			"BLOCKBEGIN", "BLOCKEND", "LPAREN", "RPAREN", "COMMA", "EOL", "DIGIT", 
			"CHAR", "WS"
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
	public String getGrammarFileName() { return "predicate_proof_grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public predicate_proof_grammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PredicateProofContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PredicateProofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateProof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterPredicateProof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitPredicateProof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitPredicateProof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateProofContext predicateProof() throws RecognitionException {
		PredicateProofContext _localctx = new PredicateProofContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_predicateProof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BLOCKBEGIN() { return getToken(predicate_proof_grammarParser.BLOCKBEGIN, 0); }
		public TerminalNode BLOCKEND() { return getToken(predicate_proof_grammarParser.BLOCKEND, 0); }
		public LineWithVariableSymbolContext lineWithVariableSymbol() {
			return getRuleContext(LineWithVariableSymbolContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(BLOCKBEGIN);
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(77);
				lineWithVariableSymbol();
				}
				break;
			}
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(82);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIGIT:
					{
					setState(80);
					line();
					}
					break;
				case BLOCKBEGIN:
					{
					setState(81);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BLOCKBEGIN || _la==DIGIT );
			setState(86);
			match(BLOCKEND);
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

	public static class LineWithVariableSymbolContext extends ParserRuleContext {
		public LineNumberContext lineNumber() {
			return getRuleContext(LineNumberContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode VARIABLEEND() { return getToken(predicate_proof_grammarParser.VARIABLEEND, 0); }
		public TerminalNode EOL() { return getToken(predicate_proof_grammarParser.EOL, 0); }
		public LogicFormulaContext logicFormula() {
			return getRuleContext(LogicFormulaContext.class,0);
		}
		public TerminalNode FORMULAEND() { return getToken(predicate_proof_grammarParser.FORMULAEND, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public LineWithVariableSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineWithVariableSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterLineWithVariableSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitLineWithVariableSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitLineWithVariableSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineWithVariableSymbolContext lineWithVariableSymbol() throws RecognitionException {
		LineWithVariableSymbolContext _localctx = new LineWithVariableSymbolContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lineWithVariableSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			lineNumber();
			setState(89);
			variable();
			setState(90);
			match(VARIABLEEND);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOTTOM) | (1L << NOT) | (1L << EXISTQUANTOR) | (1L << ALLQUANTOR) | (1L << LPAREN) | (1L << CHAR))) != 0)) {
				{
				setState(91);
				logicFormula(0);
				setState(92);
				match(FORMULAEND);
				setState(93);
				description();
				}
			}

			setState(97);
			match(EOL);
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

	public static class LineContext extends ParserRuleContext {
		public LineNumberContext lineNumber() {
			return getRuleContext(LineNumberContext.class,0);
		}
		public LogicFormulaContext logicFormula() {
			return getRuleContext(LogicFormulaContext.class,0);
		}
		public TerminalNode FORMULAEND() { return getToken(predicate_proof_grammarParser.FORMULAEND, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public TerminalNode EOL() { return getToken(predicate_proof_grammarParser.EOL, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			lineNumber();
			setState(100);
			logicFormula(0);
			setState(101);
			match(FORMULAEND);
			setState(102);
			description();
			setState(103);
			match(EOL);
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

	public static class LogicFormulaContext extends ParserRuleContext {
		public ImplicationExpressionContext implicationExpression() {
			return getRuleContext(ImplicationExpressionContext.class,0);
		}
		public LogicFormulaContext logicFormula() {
			return getRuleContext(LogicFormulaContext.class,0);
		}
		public TerminalNode EUQIVALENZ_ARROW() { return getToken(predicate_proof_grammarParser.EUQIVALENZ_ARROW, 0); }
		public LogicFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterLogicFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitLogicFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitLogicFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicFormulaContext logicFormula() throws RecognitionException {
		return logicFormula(0);
	}

	private LogicFormulaContext logicFormula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicFormulaContext _localctx = new LogicFormulaContext(_ctx, _parentState);
		LogicFormulaContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_logicFormula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(106);
			implicationExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicFormulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicFormula);
					setState(108);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(109);
					match(EUQIVALENZ_ARROW);
					setState(110);
					implicationExpression(0);
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ImplicationExpressionContext extends ParserRuleContext {
		public OrAndExpressionContext orAndExpression() {
			return getRuleContext(OrAndExpressionContext.class,0);
		}
		public ImplicationExpressionContext implicationExpression() {
			return getRuleContext(ImplicationExpressionContext.class,0);
		}
		public TerminalNode TRANSFORMATION_ARROW() { return getToken(predicate_proof_grammarParser.TRANSFORMATION_ARROW, 0); }
		public ImplicationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterImplicationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitImplicationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitImplicationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicationExpressionContext implicationExpression() throws RecognitionException {
		return implicationExpression(0);
	}

	private ImplicationExpressionContext implicationExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ImplicationExpressionContext _localctx = new ImplicationExpressionContext(_ctx, _parentState);
		ImplicationExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_implicationExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(117);
			orAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ImplicationExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_implicationExpression);
					setState(119);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(120);
					match(TRANSFORMATION_ARROW);
					setState(121);
					orAndExpression(0);
					}
					} 
				}
				setState(126);
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

	public static class OrAndExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public OrAndExpressionContext orAndExpression() {
			return getRuleContext(OrAndExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(predicate_proof_grammarParser.OR, 0); }
		public TerminalNode AND() { return getToken(predicate_proof_grammarParser.AND, 0); }
		public OrAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterOrAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitOrAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitOrAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrAndExpressionContext orAndExpression() throws RecognitionException {
		return orAndExpression(0);
	}

	private OrAndExpressionContext orAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrAndExpressionContext _localctx = new OrAndExpressionContext(_ctx, _parentState);
		OrAndExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_orAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(128);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new OrAndExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_orAndExpression);
						setState(130);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(131);
						match(OR);
						setState(132);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new OrAndExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_orAndExpression);
						setState(133);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(134);
						match(AND);
						setState(135);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(140);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(predicate_proof_grammarParser.LPAREN, 0); }
		public LogicFormulaContext logicFormula() {
			return getRuleContext(LogicFormulaContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(predicate_proof_grammarParser.RPAREN, 0); }
		public PredicateOrFunctionContext predicateOrFunction() {
			return getRuleContext(PredicateOrFunctionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode BOTTOM() { return getToken(predicate_proof_grammarParser.BOTTOM, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unaryExpression);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				unaryOperator();
				setState(142);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(LPAREN);
				setState(145);
				logicFormula(0);
				setState(146);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				predicateOrFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				match(BOTTOM);
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode ALLQUANTOR() { return getToken(predicate_proof_grammarParser.ALLQUANTOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EXISTQUANTOR() { return getToken(predicate_proof_grammarParser.EXISTQUANTOR, 0); }
		public TerminalNode NOT() { return getToken(predicate_proof_grammarParser.NOT, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unaryOperator);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALLQUANTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(ALLQUANTOR);
				setState(154);
				variable();
				}
				break;
			case EXISTQUANTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(EXISTQUANTOR);
				setState(156);
				variable();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(NOT);
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

	public static class PredicateOrFunctionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(predicate_proof_grammarParser.LPAREN, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(predicate_proof_grammarParser.RPAREN, 0); }
		public PredicateOrFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOrFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterPredicateOrFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitPredicateOrFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitPredicateOrFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOrFunctionContext predicateOrFunction() throws RecognitionException {
		PredicateOrFunctionContext _localctx = new PredicateOrFunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_predicateOrFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			variable();
			setState(161);
			match(LPAREN);
			setState(162);
			parameter();
			setState(163);
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

	public static class ParameterContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(predicate_proof_grammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(predicate_proof_grammarParser.COMMA, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				variable();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(166);
					match(COMMA);
					setState(167);
					variable();
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode PREMISE() { return getToken(predicate_proof_grammarParser.PREMISE, 0); }
		public TerminalNode ASSUMPTION() { return getToken(predicate_proof_grammarParser.ASSUMPTION, 0); }
		public AndIntroductionContext andIntroduction() {
			return getRuleContext(AndIntroductionContext.class,0);
		}
		public AndElimination1Context andElimination1() {
			return getRuleContext(AndElimination1Context.class,0);
		}
		public AndElimination2Context andElimination2() {
			return getRuleContext(AndElimination2Context.class,0);
		}
		public OrIntroduction1Context orIntroduction1() {
			return getRuleContext(OrIntroduction1Context.class,0);
		}
		public OrIntroduction2Context orIntroduction2() {
			return getRuleContext(OrIntroduction2Context.class,0);
		}
		public OrEliminationContext orElimination() {
			return getRuleContext(OrEliminationContext.class,0);
		}
		public ImpliesIntroductionContext impliesIntroduction() {
			return getRuleContext(ImpliesIntroductionContext.class,0);
		}
		public ImpliesEliminationContext impliesElimination() {
			return getRuleContext(ImpliesEliminationContext.class,0);
		}
		public NotIntroductionContext notIntroduction() {
			return getRuleContext(NotIntroductionContext.class,0);
		}
		public NotEliminationContext notElimination() {
			return getRuleContext(NotEliminationContext.class,0);
		}
		public BottomEliminationContext bottomElimination() {
			return getRuleContext(BottomEliminationContext.class,0);
		}
		public DoubleNotIntroductionContext doubleNotIntroduction() {
			return getRuleContext(DoubleNotIntroductionContext.class,0);
		}
		public DoubleNotEliminationContext doubleNotElimination() {
			return getRuleContext(DoubleNotEliminationContext.class,0);
		}
		public PbcContext pbc() {
			return getRuleContext(PbcContext.class,0);
		}
		public ModusTollensContext modusTollens() {
			return getRuleContext(ModusTollensContext.class,0);
		}
		public ExcludedMiddleContext excludedMiddle() {
			return getRuleContext(ExcludedMiddleContext.class,0);
		}
		public AllquantorIntroductionContext allquantorIntroduction() {
			return getRuleContext(AllquantorIntroductionContext.class,0);
		}
		public AllquantorEliminationContext allquantorElimination() {
			return getRuleContext(AllquantorEliminationContext.class,0);
		}
		public ExistsquantorIntroductionContext existsquantorIntroduction() {
			return getRuleContext(ExistsquantorIntroductionContext.class,0);
		}
		public ExistsquantorEliminationContext existsquantorElimination() {
			return getRuleContext(ExistsquantorEliminationContext.class,0);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_description);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(PREMISE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(ASSUMPTION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				andIntroduction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				andElimination1();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				andElimination2();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				orIntroduction1();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				orIntroduction2();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(183);
				orElimination();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(184);
				impliesIntroduction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(185);
				impliesElimination();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(186);
				notIntroduction();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(187);
				notElimination();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(188);
				bottomElimination();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(189);
				doubleNotIntroduction();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(190);
				doubleNotElimination();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(191);
				pbc();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(192);
				modusTollens();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(193);
				excludedMiddle();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(194);
				allquantorIntroduction();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(195);
				allquantorElimination();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(196);
				existsquantorIntroduction();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(197);
				existsquantorElimination();
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

	public static class AndIntroductionContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(predicate_proof_grammarParser.AND, 0); }
		public List<SingleScopeContext> singleScope() {
			return getRuleContexts(SingleScopeContext.class);
		}
		public SingleScopeContext singleScope(int i) {
			return getRuleContext(SingleScopeContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(predicate_proof_grammarParser.COMMA, 0); }
		public AndIntroductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andIntroduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterAndIntroduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitAndIntroduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitAndIntroduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndIntroductionContext andIntroduction() throws RecognitionException {
		AndIntroductionContext _localctx = new AndIntroductionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_andIntroduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(AND);
			setState(201);
			match(T__0);
			setState(202);
			singleScope();
			setState(203);
			match(COMMA);
			setState(204);
			singleScope();
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

	public static class AndElimination1Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(predicate_proof_grammarParser.AND, 0); }
		public SingleScopeContext singleScope() {
			return getRuleContext(SingleScopeContext.class,0);
		}
		public AndElimination1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andElimination1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterAndElimination1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitAndElimination1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitAndElimination1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndElimination1Context andElimination1() throws RecognitionException {
		AndElimination1Context _localctx = new AndElimination1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_andElimination1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(AND);
			setState(207);
			match(T__1);
			setState(208);
			singleScope();
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

	public static class AndElimination2Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(predicate_proof_grammarParser.AND, 0); }
		public SingleScopeContext singleScope() {
			return getRuleContext(SingleScopeContext.class,0);
		}
		public AndElimination2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andElimination2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterAndElimination2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitAndElimination2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitAndElimination2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndElimination2Context andElimination2() throws RecognitionException {
		AndElimination2Context _localctx = new AndElimination2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_andElimination2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(AND);
			setState(211);
			match(T__2);
			setState(212);
			singleScope();
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

	public static class OrIntroduction1Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(predicate_proof_grammarParser.OR, 0); }
		public SingleScopeContext singleScope() {
			return getRuleContext(SingleScopeContext.class,0);
		}
		public OrIntroduction1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orIntroduction1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterOrIntroduction1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitOrIntroduction1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitOrIntroduction1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrIntroduction1Context orIntroduction1() throws RecognitionException {
		OrIntroduction1Context _localctx = new OrIntroduction1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_orIntroduction1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(OR);
			setState(215);
			match(T__3);
			setState(216);
			singleScope();
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

	public static class OrIntroduction2Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(predicate_proof_grammarParser.OR, 0); }
		public SingleScopeContext singleScope() {
			return getRuleContext(SingleScopeContext.class,0);
		}
		public OrIntroduction2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orIntroduction2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterOrIntroduction2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitOrIntroduction2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitOrIntroduction2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrIntroduction2Context orIntroduction2() throws RecognitionException {
		OrIntroduction2Context _localctx = new OrIntroduction2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_orIntroduction2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(OR);
			setState(219);
			match(T__4);
			setState(220);
			singleScope();
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

	public static class OrEliminationContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(predicate_proof_grammarParser.OR, 0); }
		public SingleScopeContext singleScope() {
			return getRuleContext(SingleScopeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(predicate_proof_grammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(predicate_proof_grammarParser.COMMA, i);
		}
		public List<MultiScopeContext> multiScope() {
			return getRuleContexts(MultiScopeContext.class);
		}
		public MultiScopeContext multiScope(int i) {
			return getRuleContext(MultiScopeContext.class,i);
		}
		public OrEliminationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orElimination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterOrElimination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitOrElimination(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitOrElimination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrEliminationContext orElimination() throws RecognitionException {
		OrEliminationContext _localctx = new OrEliminationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_orElimination);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(OR);
			setState(223);
			match(T__5);
			setState(224);
			singleScope();
			setState(225);
			match(COMMA);
			setState(226);
			multiScope();
			setState(227);
			match(COMMA);
			setState(228);
			multiScope();
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

	public static class ImpliesIntroductionContext extends ParserRuleContext {
		public TerminalNode TRANSFORMATION_ARROW() { return getToken(predicate_proof_grammarParser.TRANSFORMATION_ARROW, 0); }
		public MultiScopeContext multiScope() {
			return getRuleContext(MultiScopeContext.class,0);
		}
		public ImpliesIntroductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impliesIntroduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterImpliesIntroduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitImpliesIntroduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitImpliesIntroduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpliesIntroductionContext impliesIntroduction() throws RecognitionException {
		ImpliesIntroductionContext _localctx = new ImpliesIntroductionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_impliesIntroduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(TRANSFORMATION_ARROW);
			setState(231);
			match(T__0);
			setState(232);
			multiScope();
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

	public static class ImpliesEliminationContext extends ParserRuleContext {
		public TerminalNode TRANSFORMATION_ARROW() { return getToken(predicate_proof_grammarParser.TRANSFORMATION_ARROW, 0); }
		public List<SingleScopeContext> singleScope() {
			return getRuleContexts(SingleScopeContext.class);
		}
		public SingleScopeContext singleScope(int i) {
			return getRuleContext(SingleScopeContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(predicate_proof_grammarParser.COMMA, 0); }
		public ImpliesEliminationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impliesElimination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterImpliesElimination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitImpliesElimination(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitImpliesElimination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpliesEliminationContext impliesElimination() throws RecognitionException {
		ImpliesEliminationContext _localctx = new ImpliesEliminationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_impliesElimination);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(TRANSFORMATION_ARROW);
			setState(235);
			match(T__5);
			setState(236);
			singleScope();
			setState(237);
			match(COMMA);
			setState(238);
			singleScope();
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

	public static class NotIntroductionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(predicate_proof_grammarParser.NOT, 0); }
		public MultiScopeContext multiScope() {
			return getRuleContext(MultiScopeContext.class,0);
		}
		public NotIntroductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notIntroduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterNotIntroduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitNotIntroduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitNotIntroduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotIntroductionContext notIntroduction() throws RecognitionException {
		NotIntroductionContext _localctx = new NotIntroductionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_notIntroduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(NOT);
			setState(241);
			match(T__0);
			setState(242);
			multiScope();
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

	public static class NotEliminationContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(predicate_proof_grammarParser.NOT, 0); }
		public List<SingleScopeContext> singleScope() {
			return getRuleContexts(SingleScopeContext.class);
		}
		public SingleScopeContext singleScope(int i) {
			return getRuleContext(SingleScopeContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(predicate_proof_grammarParser.COMMA, 0); }
		public NotEliminationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notElimination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterNotElimination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitNotElimination(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitNotElimination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotEliminationContext notElimination() throws RecognitionException {
		NotEliminationContext _localctx = new NotEliminationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_notElimination);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(NOT);
			setState(245);
			match(T__5);
			setState(246);
			singleScope();
			setState(247);
			match(COMMA);
			setState(248);
			singleScope();
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

	public static class BottomEliminationContext extends ParserRuleContext {
		public TerminalNode BOTTOM() { return getToken(predicate_proof_grammarParser.BOTTOM, 0); }
		public SingleScopeContext singleScope() {
			return getRuleContext(SingleScopeContext.class,0);
		}
		public BottomEliminationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bottomElimination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterBottomElimination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitBottomElimination(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitBottomElimination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BottomEliminationContext bottomElimination() throws RecognitionException {
		BottomEliminationContext _localctx = new BottomEliminationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bottomElimination);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(BOTTOM);
			setState(251);
			match(T__5);
			setState(252);
			singleScope();
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

	public static class DoubleNotIntroductionContext extends ParserRuleContext {
		public List<TerminalNode> NOT() { return getTokens(predicate_proof_grammarParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(predicate_proof_grammarParser.NOT, i);
		}
		public SingleScopeContext singleScope() {
			return getRuleContext(SingleScopeContext.class,0);
		}
		public DoubleNotIntroductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleNotIntroduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterDoubleNotIntroduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitDoubleNotIntroduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitDoubleNotIntroduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleNotIntroductionContext doubleNotIntroduction() throws RecognitionException {
		DoubleNotIntroductionContext _localctx = new DoubleNotIntroductionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_doubleNotIntroduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(NOT);
			setState(255);
			match(NOT);
			setState(256);
			match(T__0);
			setState(257);
			singleScope();
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

	public static class DoubleNotEliminationContext extends ParserRuleContext {
		public List<TerminalNode> NOT() { return getTokens(predicate_proof_grammarParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(predicate_proof_grammarParser.NOT, i);
		}
		public SingleScopeContext singleScope() {
			return getRuleContext(SingleScopeContext.class,0);
		}
		public DoubleNotEliminationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleNotElimination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterDoubleNotElimination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitDoubleNotElimination(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitDoubleNotElimination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleNotEliminationContext doubleNotElimination() throws RecognitionException {
		DoubleNotEliminationContext _localctx = new DoubleNotEliminationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_doubleNotElimination);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(NOT);
			setState(260);
			match(NOT);
			setState(261);
			match(T__5);
			setState(262);
			singleScope();
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

	public static class ModusTollensContext extends ParserRuleContext {
		public List<SingleScopeContext> singleScope() {
			return getRuleContexts(SingleScopeContext.class);
		}
		public SingleScopeContext singleScope(int i) {
			return getRuleContext(SingleScopeContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(predicate_proof_grammarParser.COMMA, 0); }
		public ModusTollensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modusTollens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterModusTollens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitModusTollens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitModusTollens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModusTollensContext modusTollens() throws RecognitionException {
		ModusTollensContext _localctx = new ModusTollensContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_modusTollens);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__6);
			setState(265);
			singleScope();
			setState(266);
			match(COMMA);
			setState(267);
			singleScope();
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

	public static class PbcContext extends ParserRuleContext {
		public MultiScopeContext multiScope() {
			return getRuleContext(MultiScopeContext.class,0);
		}
		public PbcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pbc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterPbc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitPbc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitPbc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PbcContext pbc() throws RecognitionException {
		PbcContext _localctx = new PbcContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pbc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__7);
			setState(270);
			multiScope();
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

	public static class ExcludedMiddleContext extends ParserRuleContext {
		public SingleScopeContext singleScope() {
			return getRuleContext(SingleScopeContext.class,0);
		}
		public ExcludedMiddleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_excludedMiddle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterExcludedMiddle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitExcludedMiddle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitExcludedMiddle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExcludedMiddleContext excludedMiddle() throws RecognitionException {
		ExcludedMiddleContext _localctx = new ExcludedMiddleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_excludedMiddle);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(T__8);
				setState(273);
				singleScope();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(T__8);
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

	public static class AllquantorIntroductionContext extends ParserRuleContext {
		public TerminalNode ALLQUANTOR() { return getToken(predicate_proof_grammarParser.ALLQUANTOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MultiScopeContext multiScope() {
			return getRuleContext(MultiScopeContext.class,0);
		}
		public AllquantorIntroductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allquantorIntroduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterAllquantorIntroduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitAllquantorIntroduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitAllquantorIntroduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllquantorIntroductionContext allquantorIntroduction() throws RecognitionException {
		AllquantorIntroductionContext _localctx = new AllquantorIntroductionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_allquantorIntroduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(ALLQUANTOR);
			setState(278);
			variable();
			setState(279);
			match(T__0);
			setState(280);
			multiScope();
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

	public static class AllquantorEliminationContext extends ParserRuleContext {
		public TerminalNode ALLQUANTOR() { return getToken(predicate_proof_grammarParser.ALLQUANTOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SingleScopeContext singleScope() {
			return getRuleContext(SingleScopeContext.class,0);
		}
		public AllquantorEliminationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allquantorElimination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterAllquantorElimination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitAllquantorElimination(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitAllquantorElimination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllquantorEliminationContext allquantorElimination() throws RecognitionException {
		AllquantorEliminationContext _localctx = new AllquantorEliminationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_allquantorElimination);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(ALLQUANTOR);
			setState(283);
			variable();
			setState(284);
			match(T__5);
			setState(285);
			singleScope();
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

	public static class ExistsquantorIntroductionContext extends ParserRuleContext {
		public TerminalNode EXISTQUANTOR() { return getToken(predicate_proof_grammarParser.EXISTQUANTOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SingleScopeContext singleScope() {
			return getRuleContext(SingleScopeContext.class,0);
		}
		public ExistsquantorIntroductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existsquantorIntroduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterExistsquantorIntroduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitExistsquantorIntroduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitExistsquantorIntroduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistsquantorIntroductionContext existsquantorIntroduction() throws RecognitionException {
		ExistsquantorIntroductionContext _localctx = new ExistsquantorIntroductionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_existsquantorIntroduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(EXISTQUANTOR);
			setState(288);
			variable();
			setState(289);
			match(T__0);
			setState(290);
			singleScope();
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

	public static class ExistsquantorEliminationContext extends ParserRuleContext {
		public TerminalNode EXISTQUANTOR() { return getToken(predicate_proof_grammarParser.EXISTQUANTOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SingleScopeContext singleScope() {
			return getRuleContext(SingleScopeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(predicate_proof_grammarParser.COMMA, 0); }
		public MultiScopeContext multiScope() {
			return getRuleContext(MultiScopeContext.class,0);
		}
		public ExistsquantorEliminationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existsquantorElimination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterExistsquantorElimination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitExistsquantorElimination(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitExistsquantorElimination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistsquantorEliminationContext existsquantorElimination() throws RecognitionException {
		ExistsquantorEliminationContext _localctx = new ExistsquantorEliminationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_existsquantorElimination);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(EXISTQUANTOR);
			setState(293);
			variable();
			setState(294);
			match(T__5);
			setState(295);
			singleScope();
			setState(296);
			match(COMMA);
			setState(297);
			multiScope();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(predicate_proof_grammarParser.CHAR, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(CHAR);
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

	public static class SingleScopeContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public SingleScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterSingleScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitSingleScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitSingleScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleScopeContext singleScope() throws RecognitionException {
		SingleScopeContext _localctx = new SingleScopeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_singleScope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			integer();
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

	public static class MultiScopeContext extends ParserRuleContext {
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public MultiScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterMultiScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitMultiScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitMultiScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiScopeContext multiScope() throws RecognitionException {
		MultiScopeContext _localctx = new MultiScopeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_multiScope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			integer();
			setState(304);
			match(T__9);
			setState(305);
			integer();
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

	public static class LineNumberContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public LineNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterLineNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitLineNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitLineNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineNumberContext lineNumber() throws RecognitionException {
		LineNumberContext _localctx = new LineNumberContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_lineNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			integer();
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

	public static class IntegerContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(predicate_proof_grammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(predicate_proof_grammarParser.DIGIT, i);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof predicate_proof_grammarListener) ((predicate_proof_grammarListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof predicate_proof_grammarVisitor ) return ((predicate_proof_grammarVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(309);
				match(DIGIT);
				}
				}
				setState(312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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
		case 4:
			return logicFormula_sempred((LogicFormulaContext)_localctx, predIndex);
		case 5:
			return implicationExpression_sempred((ImplicationExpressionContext)_localctx, predIndex);
		case 6:
			return orAndExpression_sempred((OrAndExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicFormula_sempred(LogicFormulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean implicationExpression_sempred(ImplicationExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean orAndExpression_sempred(OrAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u013d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\5\3Q\n\3\3\3\3\3\6"+
		"\3U\n\3\r\3\16\3V\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4b\n\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6r\n\6\f\6\16\6u\13"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7}\n\7\f\7\16\7\u0080\13\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\b\u008b\n\b\f\b\16\b\u008e\13\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009a\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00a1"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00ab\n\f\f\f\16\f\u00ae"+
		"\13\f\3\f\5\f\u00b1\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c9\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\5\35\u0116\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3"+
		"%\3%\3&\6&\u0139\n&\r&\16&\u013a\3&\2\5\n\f\16\'\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\2\2\u013e\2L\3\2\2"+
		"\2\4N\3\2\2\2\6Z\3\2\2\2\be\3\2\2\2\nk\3\2\2\2\fv\3\2\2\2\16\u0081\3\2"+
		"\2\2\20\u0099\3\2\2\2\22\u00a0\3\2\2\2\24\u00a2\3\2\2\2\26\u00b0\3\2\2"+
		"\2\30\u00c8\3\2\2\2\32\u00ca\3\2\2\2\34\u00d0\3\2\2\2\36\u00d4\3\2\2\2"+
		" \u00d8\3\2\2\2\"\u00dc\3\2\2\2$\u00e0\3\2\2\2&\u00e8\3\2\2\2(\u00ec\3"+
		"\2\2\2*\u00f2\3\2\2\2,\u00f6\3\2\2\2.\u00fc\3\2\2\2\60\u0100\3\2\2\2\62"+
		"\u0105\3\2\2\2\64\u010a\3\2\2\2\66\u010f\3\2\2\28\u0115\3\2\2\2:\u0117"+
		"\3\2\2\2<\u011c\3\2\2\2>\u0121\3\2\2\2@\u0126\3\2\2\2B\u012d\3\2\2\2D"+
		"\u012f\3\2\2\2F\u0131\3\2\2\2H\u0135\3\2\2\2J\u0138\3\2\2\2LM\5\4\3\2"+
		"M\3\3\2\2\2NP\7\31\2\2OQ\5\6\4\2PO\3\2\2\2PQ\3\2\2\2QT\3\2\2\2RU\5\b\5"+
		"\2SU\5\4\3\2TR\3\2\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2"+
		"\2XY\7\32\2\2Y\5\3\2\2\2Z[\5H%\2[\\\5B\"\2\\a\7\16\2\2]^\5\n\6\2^_\7\r"+
		"\2\2_`\5\30\r\2`b\3\2\2\2a]\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\36\2\2d\7"+
		"\3\2\2\2ef\5H%\2fg\5\n\6\2gh\7\r\2\2hi\5\30\r\2ij\7\36\2\2j\t\3\2\2\2"+
		"kl\b\6\1\2lm\5\f\7\2ms\3\2\2\2no\f\4\2\2op\7\30\2\2pr\5\f\7\2qn\3\2\2"+
		"\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\13\3\2\2\2us\3\2\2\2vw\b\7\1\2wx\5\16"+
		"\b\2x~\3\2\2\2yz\f\4\2\2z{\7\27\2\2{}\5\16\b\2|y\3\2\2\2}\u0080\3\2\2"+
		"\2~|\3\2\2\2~\177\3\2\2\2\177\r\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\b\b"+
		"\1\2\u0082\u0083\5\20\t\2\u0083\u008c\3\2\2\2\u0084\u0085\f\5\2\2\u0085"+
		"\u0086\7\26\2\2\u0086\u008b\5\20\t\2\u0087\u0088\f\4\2\2\u0088\u0089\7"+
		"\25\2\2\u0089\u008b\5\20\t\2\u008a\u0084\3\2\2\2\u008a\u0087\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\17\3\2\2"+
		"\2\u008e\u008c\3\2\2\2\u008f\u0090\5\22\n\2\u0090\u0091\5\20\t\2\u0091"+
		"\u009a\3\2\2\2\u0092\u0093\7\33\2\2\u0093\u0094\5\n\6\2\u0094\u0095\7"+
		"\34\2\2\u0095\u009a\3\2\2\2\u0096\u009a\5\24\13\2\u0097\u009a\5B\"\2\u0098"+
		"\u009a\7\21\2\2\u0099\u008f\3\2\2\2\u0099\u0092\3\2\2\2\u0099\u0096\3"+
		"\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\21\3\2\2\2\u009b"+
		"\u009c\7\24\2\2\u009c\u00a1\5B\"\2\u009d\u009e\7\23\2\2\u009e\u00a1\5"+
		"B\"\2\u009f\u00a1\7\22\2\2\u00a0\u009b\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\23\3\2\2\2\u00a2\u00a3\5B\"\2\u00a3\u00a4\7\33\2"+
		"\2\u00a4\u00a5\5\26\f\2\u00a5\u00a6\7\34\2\2\u00a6\25\3\2\2\2\u00a7\u00ac"+
		"\5B\"\2\u00a8\u00a9\7\35\2\2\u00a9\u00ab\5B\"\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b1\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00a7\3\2\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\27\3\2\2\2\u00b2\u00c9\7\20\2\2\u00b3\u00c9\7\17"+
		"\2\2\u00b4\u00c9\5\32\16\2\u00b5\u00c9\5\34\17\2\u00b6\u00c9\5\36\20\2"+
		"\u00b7\u00c9\5 \21\2\u00b8\u00c9\5\"\22\2\u00b9\u00c9\5$\23\2\u00ba\u00c9"+
		"\5&\24\2\u00bb\u00c9\5(\25\2\u00bc\u00c9\5*\26\2\u00bd\u00c9\5,\27\2\u00be"+
		"\u00c9\5.\30\2\u00bf\u00c9\5\60\31\2\u00c0\u00c9\5\62\32\2\u00c1\u00c9"+
		"\5\66\34\2\u00c2\u00c9\5\64\33\2\u00c3\u00c9\58\35\2\u00c4\u00c9\5:\36"+
		"\2\u00c5\u00c9\5<\37\2\u00c6\u00c9\5> \2\u00c7\u00c9\5@!\2\u00c8\u00b2"+
		"\3\2\2\2\u00c8\u00b3\3\2\2\2\u00c8\u00b4\3\2\2\2\u00c8\u00b5\3\2\2\2\u00c8"+
		"\u00b6\3\2\2\2\u00c8\u00b7\3\2\2\2\u00c8\u00b8\3\2\2\2\u00c8\u00b9\3\2"+
		"\2\2\u00c8\u00ba\3\2\2\2\u00c8\u00bb\3\2\2\2\u00c8\u00bc\3\2\2\2\u00c8"+
		"\u00bd\3\2\2\2\u00c8\u00be\3\2\2\2\u00c8\u00bf\3\2\2\2\u00c8\u00c0\3\2"+
		"\2\2\u00c8\u00c1\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8"+
		"\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2"+
		"\2\2\u00c9\31\3\2\2\2\u00ca\u00cb\7\25\2\2\u00cb\u00cc\7\3\2\2\u00cc\u00cd"+
		"\5D#\2\u00cd\u00ce\7\35\2\2\u00ce\u00cf\5D#\2\u00cf\33\3\2\2\2\u00d0\u00d1"+
		"\7\25\2\2\u00d1\u00d2\7\4\2\2\u00d2\u00d3\5D#\2\u00d3\35\3\2\2\2\u00d4"+
		"\u00d5\7\25\2\2\u00d5\u00d6\7\5\2\2\u00d6\u00d7\5D#\2\u00d7\37\3\2\2\2"+
		"\u00d8\u00d9\7\26\2\2\u00d9\u00da\7\6\2\2\u00da\u00db\5D#\2\u00db!\3\2"+
		"\2\2\u00dc\u00dd\7\26\2\2\u00dd\u00de\7\7\2\2\u00de\u00df\5D#\2\u00df"+
		"#\3\2\2\2\u00e0\u00e1\7\26\2\2\u00e1\u00e2\7\b\2\2\u00e2\u00e3\5D#\2\u00e3"+
		"\u00e4\7\35\2\2\u00e4\u00e5\5F$\2\u00e5\u00e6\7\35\2\2\u00e6\u00e7\5F"+
		"$\2\u00e7%\3\2\2\2\u00e8\u00e9\7\27\2\2\u00e9\u00ea\7\3\2\2\u00ea\u00eb"+
		"\5F$\2\u00eb\'\3\2\2\2\u00ec\u00ed\7\27\2\2\u00ed\u00ee\7\b\2\2\u00ee"+
		"\u00ef\5D#\2\u00ef\u00f0\7\35\2\2\u00f0\u00f1\5D#\2\u00f1)\3\2\2\2\u00f2"+
		"\u00f3\7\22\2\2\u00f3\u00f4\7\3\2\2\u00f4\u00f5\5F$\2\u00f5+\3\2\2\2\u00f6"+
		"\u00f7\7\22\2\2\u00f7\u00f8\7\b\2\2\u00f8\u00f9\5D#\2\u00f9\u00fa\7\35"+
		"\2\2\u00fa\u00fb\5D#\2\u00fb-\3\2\2\2\u00fc\u00fd\7\21\2\2\u00fd\u00fe"+
		"\7\b\2\2\u00fe\u00ff\5D#\2\u00ff/\3\2\2\2\u0100\u0101\7\22\2\2\u0101\u0102"+
		"\7\22\2\2\u0102\u0103\7\3\2\2\u0103\u0104\5D#\2\u0104\61\3\2\2\2\u0105"+
		"\u0106\7\22\2\2\u0106\u0107\7\22\2\2\u0107\u0108\7\b\2\2\u0108\u0109\5"+
		"D#\2\u0109\63\3\2\2\2\u010a\u010b\7\t\2\2\u010b\u010c\5D#\2\u010c\u010d"+
		"\7\35\2\2\u010d\u010e\5D#\2\u010e\65\3\2\2\2\u010f\u0110\7\n\2\2\u0110"+
		"\u0111\5F$\2\u0111\67\3\2\2\2\u0112\u0113\7\13\2\2\u0113\u0116\5D#\2\u0114"+
		"\u0116\7\13\2\2\u0115\u0112\3\2\2\2\u0115\u0114\3\2\2\2\u01169\3\2\2\2"+
		"\u0117\u0118\7\24\2\2\u0118\u0119\5B\"\2\u0119\u011a\7\3\2\2\u011a\u011b"+
		"\5F$\2\u011b;\3\2\2\2\u011c\u011d\7\24\2\2\u011d\u011e\5B\"\2\u011e\u011f"+
		"\7\b\2\2\u011f\u0120\5D#\2\u0120=\3\2\2\2\u0121\u0122\7\23\2\2\u0122\u0123"+
		"\5B\"\2\u0123\u0124\7\3\2\2\u0124\u0125\5D#\2\u0125?\3\2\2\2\u0126\u0127"+
		"\7\23\2\2\u0127\u0128\5B\"\2\u0128\u0129\7\b\2\2\u0129\u012a\5D#\2\u012a"+
		"\u012b\7\35\2\2\u012b\u012c\5F$\2\u012cA\3\2\2\2\u012d\u012e\7 \2\2\u012e"+
		"C\3\2\2\2\u012f\u0130\5J&\2\u0130E\3\2\2\2\u0131\u0132\5J&\2\u0132\u0133"+
		"\7\f\2\2\u0133\u0134\5J&\2\u0134G\3\2\2\2\u0135\u0136\5J&\2\u0136I\3\2"+
		"\2\2\u0137\u0139\7\37\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013bK\3\2\2\2\21PTVas~\u008a\u008c"+
		"\u0099\u00a0\u00ac\u00b0\u00c8\u0115\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}