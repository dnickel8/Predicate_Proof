// Generated from C:/Users/admin/Documents/Studium/Master/Forschungsprojekt/predicate_proof/src/main/java/com/predicate_proof/grammar\predicate_proof_grammar.g4 by ANTLR 4.9.1
package com.predicate_proof.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link predicate_proof_grammarParser}.
 */
public interface predicate_proof_grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#predicateProof}.
	 * @param ctx the parse tree
	 */
	void enterPredicateProof(predicate_proof_grammarParser.PredicateProofContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#predicateProof}.
	 * @param ctx the parse tree
	 */
	void exitPredicateProof(predicate_proof_grammarParser.PredicateProofContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(predicate_proof_grammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(predicate_proof_grammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#lineWithVariableSymbol}.
	 * @param ctx the parse tree
	 */
	void enterLineWithVariableSymbol(predicate_proof_grammarParser.LineWithVariableSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#lineWithVariableSymbol}.
	 * @param ctx the parse tree
	 */
	void exitLineWithVariableSymbol(predicate_proof_grammarParser.LineWithVariableSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(predicate_proof_grammarParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(predicate_proof_grammarParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#logicFormula}.
	 * @param ctx the parse tree
	 */
	void enterLogicFormula(predicate_proof_grammarParser.LogicFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#logicFormula}.
	 * @param ctx the parse tree
	 */
	void exitLogicFormula(predicate_proof_grammarParser.LogicFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#implicationExpression}.
	 * @param ctx the parse tree
	 */
	void enterImplicationExpression(predicate_proof_grammarParser.ImplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#implicationExpression}.
	 * @param ctx the parse tree
	 */
	void exitImplicationExpression(predicate_proof_grammarParser.ImplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#orAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrAndExpression(predicate_proof_grammarParser.OrAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#orAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrAndExpression(predicate_proof_grammarParser.OrAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(predicate_proof_grammarParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(predicate_proof_grammarParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(predicate_proof_grammarParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(predicate_proof_grammarParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#predicateOrFunction}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOrFunction(predicate_proof_grammarParser.PredicateOrFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#predicateOrFunction}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOrFunction(predicate_proof_grammarParser.PredicateOrFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(predicate_proof_grammarParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(predicate_proof_grammarParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(predicate_proof_grammarParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(predicate_proof_grammarParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#andIntroduction}.
	 * @param ctx the parse tree
	 */
	void enterAndIntroduction(predicate_proof_grammarParser.AndIntroductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#andIntroduction}.
	 * @param ctx the parse tree
	 */
	void exitAndIntroduction(predicate_proof_grammarParser.AndIntroductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#andElimination1}.
	 * @param ctx the parse tree
	 */
	void enterAndElimination1(predicate_proof_grammarParser.AndElimination1Context ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#andElimination1}.
	 * @param ctx the parse tree
	 */
	void exitAndElimination1(predicate_proof_grammarParser.AndElimination1Context ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#andElimination2}.
	 * @param ctx the parse tree
	 */
	void enterAndElimination2(predicate_proof_grammarParser.AndElimination2Context ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#andElimination2}.
	 * @param ctx the parse tree
	 */
	void exitAndElimination2(predicate_proof_grammarParser.AndElimination2Context ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#orIntroduction1}.
	 * @param ctx the parse tree
	 */
	void enterOrIntroduction1(predicate_proof_grammarParser.OrIntroduction1Context ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#orIntroduction1}.
	 * @param ctx the parse tree
	 */
	void exitOrIntroduction1(predicate_proof_grammarParser.OrIntroduction1Context ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#orIntroduction2}.
	 * @param ctx the parse tree
	 */
	void enterOrIntroduction2(predicate_proof_grammarParser.OrIntroduction2Context ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#orIntroduction2}.
	 * @param ctx the parse tree
	 */
	void exitOrIntroduction2(predicate_proof_grammarParser.OrIntroduction2Context ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#orElimination}.
	 * @param ctx the parse tree
	 */
	void enterOrElimination(predicate_proof_grammarParser.OrEliminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#orElimination}.
	 * @param ctx the parse tree
	 */
	void exitOrElimination(predicate_proof_grammarParser.OrEliminationContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#impliesIntroduction}.
	 * @param ctx the parse tree
	 */
	void enterImpliesIntroduction(predicate_proof_grammarParser.ImpliesIntroductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#impliesIntroduction}.
	 * @param ctx the parse tree
	 */
	void exitImpliesIntroduction(predicate_proof_grammarParser.ImpliesIntroductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#impliesElimination}.
	 * @param ctx the parse tree
	 */
	void enterImpliesElimination(predicate_proof_grammarParser.ImpliesEliminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#impliesElimination}.
	 * @param ctx the parse tree
	 */
	void exitImpliesElimination(predicate_proof_grammarParser.ImpliesEliminationContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#notIntroduction}.
	 * @param ctx the parse tree
	 */
	void enterNotIntroduction(predicate_proof_grammarParser.NotIntroductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#notIntroduction}.
	 * @param ctx the parse tree
	 */
	void exitNotIntroduction(predicate_proof_grammarParser.NotIntroductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#notElimination}.
	 * @param ctx the parse tree
	 */
	void enterNotElimination(predicate_proof_grammarParser.NotEliminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#notElimination}.
	 * @param ctx the parse tree
	 */
	void exitNotElimination(predicate_proof_grammarParser.NotEliminationContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#bottomElimination}.
	 * @param ctx the parse tree
	 */
	void enterBottomElimination(predicate_proof_grammarParser.BottomEliminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#bottomElimination}.
	 * @param ctx the parse tree
	 */
	void exitBottomElimination(predicate_proof_grammarParser.BottomEliminationContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#doubleNotIntroduction}.
	 * @param ctx the parse tree
	 */
	void enterDoubleNotIntroduction(predicate_proof_grammarParser.DoubleNotIntroductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#doubleNotIntroduction}.
	 * @param ctx the parse tree
	 */
	void exitDoubleNotIntroduction(predicate_proof_grammarParser.DoubleNotIntroductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#doubleNotElimination}.
	 * @param ctx the parse tree
	 */
	void enterDoubleNotElimination(predicate_proof_grammarParser.DoubleNotEliminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#doubleNotElimination}.
	 * @param ctx the parse tree
	 */
	void exitDoubleNotElimination(predicate_proof_grammarParser.DoubleNotEliminationContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#modusTollens}.
	 * @param ctx the parse tree
	 */
	void enterModusTollens(predicate_proof_grammarParser.ModusTollensContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#modusTollens}.
	 * @param ctx the parse tree
	 */
	void exitModusTollens(predicate_proof_grammarParser.ModusTollensContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#pbc}.
	 * @param ctx the parse tree
	 */
	void enterPbc(predicate_proof_grammarParser.PbcContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#pbc}.
	 * @param ctx the parse tree
	 */
	void exitPbc(predicate_proof_grammarParser.PbcContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#excludedMiddle}.
	 * @param ctx the parse tree
	 */
	void enterExcludedMiddle(predicate_proof_grammarParser.ExcludedMiddleContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#excludedMiddle}.
	 * @param ctx the parse tree
	 */
	void exitExcludedMiddle(predicate_proof_grammarParser.ExcludedMiddleContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#allquantorIntroduction}.
	 * @param ctx the parse tree
	 */
	void enterAllquantorIntroduction(predicate_proof_grammarParser.AllquantorIntroductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#allquantorIntroduction}.
	 * @param ctx the parse tree
	 */
	void exitAllquantorIntroduction(predicate_proof_grammarParser.AllquantorIntroductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#allquantorElimination}.
	 * @param ctx the parse tree
	 */
	void enterAllquantorElimination(predicate_proof_grammarParser.AllquantorEliminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#allquantorElimination}.
	 * @param ctx the parse tree
	 */
	void exitAllquantorElimination(predicate_proof_grammarParser.AllquantorEliminationContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#existsquantorIntroduction}.
	 * @param ctx the parse tree
	 */
	void enterExistsquantorIntroduction(predicate_proof_grammarParser.ExistsquantorIntroductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#existsquantorIntroduction}.
	 * @param ctx the parse tree
	 */
	void exitExistsquantorIntroduction(predicate_proof_grammarParser.ExistsquantorIntroductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#existsquantorElimination}.
	 * @param ctx the parse tree
	 */
	void enterExistsquantorElimination(predicate_proof_grammarParser.ExistsquantorEliminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#existsquantorElimination}.
	 * @param ctx the parse tree
	 */
	void exitExistsquantorElimination(predicate_proof_grammarParser.ExistsquantorEliminationContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#copyRule}.
	 * @param ctx the parse tree
	 */
	void enterCopyRule(predicate_proof_grammarParser.CopyRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#copyRule}.
	 * @param ctx the parse tree
	 */
	void exitCopyRule(predicate_proof_grammarParser.CopyRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#alreadyProofed}.
	 * @param ctx the parse tree
	 */
	void enterAlreadyProofed(predicate_proof_grammarParser.AlreadyProofedContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#alreadyProofed}.
	 * @param ctx the parse tree
	 */
	void exitAlreadyProofed(predicate_proof_grammarParser.AlreadyProofedContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(predicate_proof_grammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(predicate_proof_grammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#singleScope}.
	 * @param ctx the parse tree
	 */
	void enterSingleScope(predicate_proof_grammarParser.SingleScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#singleScope}.
	 * @param ctx the parse tree
	 */
	void exitSingleScope(predicate_proof_grammarParser.SingleScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#multiScope}.
	 * @param ctx the parse tree
	 */
	void enterMultiScope(predicate_proof_grammarParser.MultiScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#multiScope}.
	 * @param ctx the parse tree
	 */
	void exitMultiScope(predicate_proof_grammarParser.MultiScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#lineNumber}.
	 * @param ctx the parse tree
	 */
	void enterLineNumber(predicate_proof_grammarParser.LineNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#lineNumber}.
	 * @param ctx the parse tree
	 */
	void exitLineNumber(predicate_proof_grammarParser.LineNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link predicate_proof_grammarParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(predicate_proof_grammarParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link predicate_proof_grammarParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(predicate_proof_grammarParser.IntegerContext ctx);
}