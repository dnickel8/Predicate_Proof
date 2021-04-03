package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.Node;
import com.predicate_proof.nodes.UnaryOperatorNode;

/**
 * \ll
 *      1 Q(x0) \mid premise \\
 *      2 \exists x Q(x) \mid \exists x i 1 \\
 * \gg
 * @author David Nickel
 * @version 1.0 26/03/2021
 */
public class ExistIntroRule extends Rule {

    public boolean check(Node beforeFormula,
                         UnaryOperatorNode afterFormula) {

        if (afterFormula.getOperator() == RelationOperator.EXISTQUANTOR){
            return replacingVariableEquals(afterFormula.getVariable(),
                                            beforeFormula,
                                            afterFormula.getExpression());
        } else {
            return false;
        }
    }
}
