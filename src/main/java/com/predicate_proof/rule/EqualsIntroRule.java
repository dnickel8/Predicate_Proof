package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.FormulaNode;
import com.predicate_proof.nodes.Node;

/**
 * @author David Nickel
 */
public class EqualsIntroRule extends Rule {

    public boolean check(Node afterNode) {
        if (afterNode instanceof FormulaNode
                && (((FormulaNode) afterNode).getOperator() == RelationOperator.EQUIVALENZ
                    || ((FormulaNode) afterNode).getOperator() == RelationOperator.EQ)) {
            return equals(((FormulaNode) afterNode).getLeftExpression(), ((FormulaNode) afterNode).getRightExpression());
        } else {
            return false;
        }
    }
}
