package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.FormulaNode;
import com.predicate_proof.nodes.Node;

/**
 *  \ll
 *      1 \neg \p -> q \mid premise \\
 *      2 \q \mid premise \\
 *      3 \neg \neg p \mid MT 1,2 \\
 *  \gg
 * @author David Nickel
 * @version 1.0 26/03/2021
 */
public class MTRule extends Rule {

    public boolean check(Node beforeFormula1,
                         Node beforeFormula2,
                         Node afterFormula) {

        /*
        It is not known which of the beforeFormulas is the Implication that is solved.
        That´s why three possibilities that are tested. Both are implication or one of them is an implication.
         */
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

    private boolean helpMethod(Node beforeFormula,
                               FormulaNode implicationFormula,
                               Node afterFormula) {
        if(negativeEquals(implicationFormula.getRightExpression(),beforeFormula)) {
            return negativeEquals(afterFormula,implicationFormula.getLeftExpression());
        }

        return false;
    }
}
