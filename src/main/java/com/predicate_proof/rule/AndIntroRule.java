package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.FormulaNode;
import com.predicate_proof.nodes.Node;

/**
 * \ll
 *      1 r \mid premise \\
 *      2 q \mid premise \\
 *      3 q \wedge r \mid \wedge i 2,1 \\
 * \gg
 * @author David Nickel
 * @version 1.0 24/03/2021
 */
public class AndIntroRule extends Rule {

    public boolean check(Node beforeFormula1,
                         Node beforeFormula2,
                         FormulaNode afterFormula) {

        //FormulaNode node = afterFormula.searchOperator(RelationOperator.AND);
        if (afterFormula.getOperator() != RelationOperator.AND) {
            return false;
        }

        //The order could be in two different possibility
        return (equals(afterFormula.getLeftExpression(),beforeFormula1)
                    && equals(afterFormula.getRightExpression(),beforeFormula2))
                || (equals(afterFormula.getLeftExpression(),beforeFormula2)
                    && equals(afterFormula.getRightExpression(),beforeFormula1));

    }
}
