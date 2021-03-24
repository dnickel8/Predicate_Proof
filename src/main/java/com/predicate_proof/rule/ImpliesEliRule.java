package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.FormulaNode;
import com.predicate_proof.nodes.Node;

public class ImpliesEliRule extends Rule {

    public boolean test(Node beforeFormula1,
                        Node beforeFormula2,
                        Node afterFormula) {
        if(beforeFormula1 instanceof FormulaNode
                && ((FormulaNode) beforeFormula1).getOperator() == RelationOperator.IMPLICATION
                && beforeFormula2 instanceof FormulaNode
                && ((FormulaNode) beforeFormula2).getOperator() == RelationOperator.IMPLICATION) {
            return helpMethod(beforeFormula1, (FormulaNode) beforeFormula2, afterFormula)
                    || helpMethod(beforeFormula2, (FormulaNode) beforeFormula1, afterFormula);
        } else if (beforeFormula1 instanceof FormulaNode
                && ((FormulaNode) beforeFormula1).getOperator() == RelationOperator.IMPLICATION) {
            return helpMethod(beforeFormula2, (FormulaNode) beforeFormula1, afterFormula);
        } else if (beforeFormula2 instanceof FormulaNode
                && ((FormulaNode) beforeFormula2).getOperator() == RelationOperator.IMPLICATION) {
            return helpMethod(beforeFormula1, (FormulaNode) beforeFormula2, afterFormula);
        } else {
            return false;
        }
    }

    private boolean helpMethod (Node beforeFormula,
                                FormulaNode implicationFormula,
                                Node afterFormula) {
        if (equals(implicationFormula.getLeftExpression(), beforeFormula)
                && equals(implicationFormula.getRightExpression(), afterFormula)) {
            return true;
        } else {
            return false;
        }
    }
}
