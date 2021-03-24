package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.BlockNode;
import com.predicate_proof.nodes.LineNode;
import com.predicate_proof.nodes.Node;
import com.predicate_proof.nodes.UnaryOperatorNode;

public class ExistEliRule extends Rule {

    public boolean test(UnaryOperatorNode beforeFormula,
                        BlockNode beforeBlock,
                        Node afterFormula) {

        if (beforeFormula.getOperator() != RelationOperator.EXISTQUANTOR) {
            return false;
        }
        if (!(((LineNode) beforeBlock.getChild(0)).isWithVariableSymbol())) {
            return false;
        }
        String beforeVariable = beforeFormula.getVariable();
        String afterVariable = ((LineNode) beforeBlock.getChild(0)).getVariableSymbol();

        if (replacingVariableEquals(beforeVariable, afterVariable, beforeFormula.getExpression(), ((LineNode) beforeBlock.getChild(0)).getFormula())
        ){//&& variableNotInFormula(beforeBlock.getDeclaredVariable(), afterFormula)) {
            return equals(afterFormula, ((LineNode) beforeBlock.getChild(beforeBlock.getChildCount()-1)).getFormula());
        }
        return false;
    }
}
