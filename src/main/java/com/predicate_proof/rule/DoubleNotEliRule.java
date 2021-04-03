package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.Node;
import com.predicate_proof.nodes.UnaryOperatorNode;

/**
 * \ll
 *      1 \neg \neg q \mid premise \\
 *      2 q \mid \neg \neg e 1 \\
 * \gg
 * @author David Nickel
 * @version 1.0 26/03/2021
 */
public class DoubleNotEliRule extends Rule {

    public boolean check(UnaryOperatorNode beforeNode,
                         Node afterNode){
        if (beforeNode.getOperator() != RelationOperator.NOT) {
            return false;
        }

        //there must be two UnaryOpertorNodes with the Operator Not in each other
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
