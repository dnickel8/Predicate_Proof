package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.BlockNode;
import com.predicate_proof.nodes.LineNode;
import com.predicate_proof.nodes.Node;
import com.predicate_proof.nodes.UnaryOperatorNode;

/**
 * \ll
 *      1 \forall x (P(x) -> Q(x)) \mid premise \\
 *      2 \exists x P(x) \mid premise \\
 *      \ll
 *          3 x0 \mid P(x0) \mid assumption \\
 *          4 P(x0) -> Q(x0) \mid \forall x e 1 \\
 *          5 Q(x0) \mid -> e 4,3 \\
 *          6 \exists x Q(x) \mid \exists x i 5 \\
 *      \gg
 *      7 \exists x Q(x) \mid \exists x e 2,3-6 \\
 * \gg
 * @author David Nickel
 * @version 1.0 26/03/2021
 */
public class ExistEliRule extends Rule {

    public boolean check(UnaryOperatorNode beforeFormula,
                         BlockNode beforeBlock,
                         Node afterFormula) {

        String beforeVariable;
        if (beforeFormula.getOperator() == RelationOperator.EXISTQUANTOR) {
            beforeVariable = beforeFormula.getVariable();
        } else {
            return false;
        }

        String afterVariable;
        if (((LineNode) beforeBlock.getChild(0)).isWithVariableSymbol()) {
            afterVariable = ((LineNode) beforeBlock.getChild(0)).getVariableSymbol();
        } else {
            return false;
        }

        if (replacingVariableEquals(beforeVariable, afterVariable, beforeFormula.getExpression(),   //the first line in the block is equals to the line from which the exists-operator is eliminated
                ((LineNode) beforeBlock.getChild(0)).getFormula())                                  //but the declared variable replaces the variable is boundes from the exists-wuantor
            && variableNotInFormula(beforeBlock.getDeclaredVariable(), afterFormula)) {
            return equals(afterFormula, ((LineNode) beforeBlock.getChild(beforeBlock.getChildCount()-1)).getFormula()); //the last line of the block is like the new/after line
        } else {
            return false;
        }
    }
}
