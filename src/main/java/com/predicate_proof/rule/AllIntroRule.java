package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.BlockNode;
import com.predicate_proof.nodes.LineNode;
import com.predicate_proof.nodes.UnaryOperatorNode;

public class AllIntroRule extends Rule {

    public boolean test(BlockNode beforeBlock,
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

        return replacingVariableEquals(beforeVariable, afterVariable, ((LineNode) beforeBlock.getChild(beforeBlock.getChildCount()-1)).getFormula(), afterNode.getExpression());
    }
}
