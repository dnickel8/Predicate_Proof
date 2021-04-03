package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.Node;
import com.predicate_proof.nodes.UnaryOperatorNode;

/**
 * Class to proof Forall-elimination rule for predicate logic.
 * @author David Nickel
 * @version 1.0 24/03/2021
 */
public class AllEliRule extends Rule {

    /**
     * Example:
     *  \ll
     *      1 \forall x P(x) \mid premise \\
     *      2 P(t) \mid \forall x e 1 \\
     *  \gg
     * @param beforeNode    Node from which the forall-quantor should eliminate.
     * @param afterNode     Node where the forall-quantor is eliminated
     * @return is the proof correct?
     */
    public boolean check(UnaryOperatorNode beforeNode,
                         Node afterNode) {
        if(beforeNode.getOperator() != RelationOperator.ALLQUANTOR) {
            return false;
        }

        String variable = beforeNode.getVariable();

        return replacingVariableEquals(variable, afterNode, beforeNode.getExpression());
    }

}
