package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.Node;
import com.predicate_proof.nodes.UnaryOperatorNode;

public class DoubleNotEliRule extends Rule {

    public boolean test(UnaryOperatorNode beforeNode,
                        Node afterNode){
        if (beforeNode.getOperator() != RelationOperator.NOT) {
            return false;
        }

        if(beforeNode.getExpression() instanceof UnaryOperatorNode) {
            UnaryOperatorNode beforeNode2 = (UnaryOperatorNode) beforeNode.getExpression();
            if (beforeNode2.getOperator() == RelationOperator.NOT
                    && equals(beforeNode2.getExpression(),afterNode)) {
                return true;
            }
        }

        return false;
    }
}
