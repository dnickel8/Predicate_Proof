// Generated from C:/Users/admin/Documents/Studium/Master/Forschungsprojekt/predicate_proof/src/main/java/com/predicate_proof/grammar\predicate_proof_grammar.g4 by ANTLR 4.9.1
package com.predicate_proof.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link predicate_proof_grammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface predicate_proof_grammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#predicateProof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateProof(predicate_proof_grammarParser.PredicateProofContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(predicate_proof_grammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#lineWithVariableSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineWithVariableSymbol(predicate_proof_grammarParser.LineWithVariableSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(predicate_proof_grammarParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#logicFormula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicFormula(predicate_proof_grammarParser.LogicFormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#implicationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicationExpression(predicate_proof_grammarParser.ImplicationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#orAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrAndExpression(predicate_proof_grammarParser.OrAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(predicate_proof_grammarParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(predicate_proof_grammarParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#predicateOrFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateOrFunction(predicate_proof_grammarParser.PredicateOrFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(predicate_proof_grammarParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(predicate_proof_grammarParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#andIntroduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndIntroduction(predicate_proof_grammarParser.AndIntroductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#andElimination1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndElimination1(predicate_proof_grammarParser.AndElimination1Context ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#andElimination2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndElimination2(predicate_proof_grammarParser.AndElimination2Context ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#orIntroduction1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrIntroduction1(predicate_proof_grammarParser.OrIntroduction1Context ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#orIntroduction2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrIntroduction2(predicate_proof_grammarParser.OrIntroduction2Context ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#orElimination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrElimination(predicate_proof_grammarParser.OrEliminationContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#impliesIntroduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpliesIntroduction(predicate_proof_grammarParser.ImpliesIntroductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#impliesElimination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpliesElimination(predicate_proof_grammarParser.ImpliesEliminationContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#notIntroduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotIntroduction(predicate_proof_grammarParser.NotIntroductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#notElimination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotElimination(predicate_proof_grammarParser.NotEliminationContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#bottomElimination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBottomElimination(predicate_proof_grammarParser.BottomEliminationContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#doubleNotIntroduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleNotIntroduction(predicate_proof_grammarParser.DoubleNotIntroductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#doubleNotElimination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleNotElimination(predicate_proof_grammarParser.DoubleNotEliminationContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#modusTollens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModusTollens(predicate_proof_grammarParser.ModusTollensContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#pbc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPbc(predicate_proof_grammarParser.PbcContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#excludedMiddle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcludedMiddle(predicate_proof_grammarParser.ExcludedMiddleContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#allquantorIntroduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllquantorIntroduction(predicate_proof_grammarParser.AllquantorIntroductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#allquantorElimination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllquantorElimination(predicate_proof_grammarParser.AllquantorEliminationContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#existsquantorIntroduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsquantorIntroduction(predicate_proof_grammarParser.ExistsquantorIntroductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#existsquantorElimination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsquantorElimination(predicate_proof_grammarParser.ExistsquantorEliminationContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#copyRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyRule(predicate_proof_grammarParser.CopyRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#alreadyProofed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlreadyProofed(predicate_proof_grammarParser.AlreadyProofedContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(predicate_proof_grammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#singleScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleScope(predicate_proof_grammarParser.SingleScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#multiScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiScope(predicate_proof_grammarParser.MultiScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#lineNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineNumber(predicate_proof_grammarParser.LineNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link predicate_proof_grammarParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(predicate_proof_grammarParser.IntegerContext ctx);
}