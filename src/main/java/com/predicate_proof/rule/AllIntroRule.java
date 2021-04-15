package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.BlockNode;
import com.predicate_proof.nodes.LineNode;
import com.predicate_proof.nodes.UnaryOperatorNode;

/**
 * Class to proof Forall-introduction rule for predicate logic.
 * @author David Nickel
 * @version 1.0 24/03/2021
 */
public class AllIntroRule extends Rule {

    /**
     * Example:
     *  \ll
     *      1 \forall x (P(x) -> Q(x)) \mid premise \\
     *      2 \forall x (P(x)) \mid premise \\
     *      \ll
     *          3 t \mid P(t) -> Q(t) \mid \forall x e 1 \\
     *          4 P(t) \mid \forall e 2 \\
     *          5 Q(t) \mid -> e 3,4 \\
     *      \gg
     *      6 \forall x Q(x) \mid forall i 3-5 \\
     *  \gg
     * @param beforeBlock Block to which last line the forall-quantor should be introduced
     * @param afterNode Node where the forall-quantor is introduced
     * @return is the proof correct?
     */
    public boolean check(BlockNode beforeBlock,
                         UnaryOperatorNode afterNode) {

        if (afterNode.getOperator() != RelationOperator.ALLQUANTOR) {
            return false;
        }

        String beforeVariable;
        if (((LineNode) beforeBlock.getChild(0)).isWithVariableSymbol()) {
            beforeVariable = ((LineNode) beforeBlock.getChild(0)).getVariableSymbol();
        } else {
            return false;
        }
        String afterVariable = afterNode.getVariable();

        return replacingVariableEquals(beforeVariable,
                afterVariable,
                ((LineNode) beforeBlock.getChild(beforeBlock.getChildCount()-1)).getFormula(), afterNode.getExpression());
    }
}
