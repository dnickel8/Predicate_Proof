package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.Node;
import com.predicate_proof.nodes.UnaryOperatorNode;

public class NotEliRule extends Rule {

    public boolean test(Node beforeFormula1,
                        Node beforeFormula2,
                        Node afterFormula) {
        if(beforeFormula1 instanceof UnaryOperatorNode
                && ((UnaryOperatorNode) beforeFormula1).getOperator() == RelationOperator.NOT
                && beforeFormula2 instanceof UnaryOperatorNode
                && ((UnaryOperatorNode) beforeFormula2).getOperator() == RelationOperator.NOT) {
            return helpMethod(beforeFormula1, (UnaryOperatorNode) beforeFormula2, afterFormula)
                    || helpMethod(beforeFormula2, (UnaryOperatorNode) beforeFormula1, afterFormula);
        } else if (beforeFormula1 instanceof UnaryOperatorNode
                && ((UnaryOperatorNode) beforeFormula1).getOperator() == RelationOperator.NOT) {
            return helpMethod(beforeFormula2, (UnaryOperatorNode) beforeFormula1, afterFormula);
        } else if (beforeFormula2 instanceof UnaryOperatorNode
                && ((UnaryOperatorNode) beforeFormula2).getOperator() == RelationOperator.NOT) {
            return helpMethod(beforeFormula1, (UnaryOperatorNode) beforeFormula2, afterFormula);
        } else {
            return false;
        }
    }

    private boolean helpMethod(Node positivNode,
                        UnaryOperatorNode negativNode,
                        Node afterNode) {

        if (negativNode.getOperator() != RelationOperator.NOT) {
            return false;
        }

        if (!(afterNode instanceof BottomNode)) {
            return false;
        }

        if (equals(positivNode,negativNode.getExpression())) {
            return true;
        }

        return false;

    }


}