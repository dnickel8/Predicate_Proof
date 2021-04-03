package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.Node;
import com.predicate_proof.nodes.UnaryOperatorNode;

/**
 * \ll
 *      1 q \mid \premise \\
 *      2 \neg \neg q \mid \neg \neg i 1 \\
 * \gg
 * @author David Nickel
 * @version 1.0 26/03/2021
 */
public class DoubleNotIntroRule extends Rule {

    public boolean check(Node beforeNode,
                         UnaryOperatorNode afterNode) {
        if (afterNode.getOperator() != RelationOperator.NOT) {
            return false;
        }

        //there must be two UnaryOpertorNodes with the Operator Not in each other
        if (afterNode.getExpression() instanceof UnaryOperatorNode) {
            UnaryOperatorNode afterNode2 = (UnaryOperatorNode) afterNode.getExpression();
            if (afterNode2.getOperator() == RelationOperator.NOT
                    && equals(afterNode2.getExpression(),beforeNode)) {
                return true;
            }
        }

        return false;
    }
}
