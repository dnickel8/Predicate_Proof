package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.FormulaNode;
import com.predicate_proof.nodes.Node;

public class LEMRule extends Rule {

    public boolean test(Node beforeNode,
                     FormulaNode afterNode) {
        if (beforeNode == null
                || beforeNode instanceof BottomNode) {
            if (afterNode.getOperator() == RelationOperator.OR) {
                return negativeEquals(afterNode.getLeftExpression(), afterNode.getRightExpression());
            }
        }
        return false;
    }

    public boolean test(FormulaNode afterNode) {
        return test(null, afterNode);
    }
}
