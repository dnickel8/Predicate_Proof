package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.Node;
import com.predicate_proof.nodes.UnaryOperatorNode;

public class ExistIntroRule extends Rule {

    public boolean test(Node beforeFormula,
                        UnaryOperatorNode afterFormula) {

        if (!(afterFormula.getOperator() == RelationOperator.EXISTQUANTOR)){
            return false;
        }

        return replacingVariableEquals(afterFormula.getVariable(), beforeFormula, afterFormula.getExpression());
    }
}
