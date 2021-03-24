package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.Node;
import com.predicate_proof.nodes.UnaryOperatorNode;

public class AllEliRule extends Rule {

    public boolean test(UnaryOperatorNode beforeNode,
                        Node afterNode) {
        if(beforeNode.getOperator() != RelationOperator.ALLQUANTOR) {
            return false;
        }

        String variable = beforeNode.getVariable();

        return replacingVariableEquals(variable, afterNode, beforeNode.getExpression());
    }

}
