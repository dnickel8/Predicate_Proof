package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.FormulaNode;
import com.predicate_proof.nodes.Node;

/**
 * Example
 *  \ll
 *      1 p -> q \mid premise \\
 *      2 \neg p \vee q \mid already proofed 1 \\
 *  \gg
 * @author David Nickel
 * @version 1.0 24/03/2021
 */
public class AlreadyProofedRule extends Rule{

    public boolean check(Node beforeNode,
                         Node afterNode) {

        if (!(beforeNode instanceof FormulaNode && afterNode instanceof FormulaNode)) {
            return false;
        }
        //the reshape is possible in two directions
        if (((FormulaNode) beforeNode).getOperator() == RelationOperator.OR
                && ((FormulaNode) afterNode).getOperator() == RelationOperator.IMPLICATION
                && negativeEquals(((FormulaNode) beforeNode).getLeftExpression(), ((FormulaNode) afterNode).getLeftExpression())
                && equals(((FormulaNode) beforeNode).getRightExpression(), ((FormulaNode) afterNode).getRightExpression())) {
            return true;
        } else if (((FormulaNode) beforeNode).getOperator() == RelationOperator.IMPLICATION
                && ((FormulaNode) afterNode).getOperator() == RelationOperator.OR
                && negativeEquals(((FormulaNode) beforeNode).getLeftExpression(), ((FormulaNode) afterNode).getLeftExpression())
                && equals(((FormulaNode) beforeNode).getRightExpression(), ((FormulaNode) afterNode).getRightExpression())) {
            return true;
        } else {
            return false;
        }
    }
}
