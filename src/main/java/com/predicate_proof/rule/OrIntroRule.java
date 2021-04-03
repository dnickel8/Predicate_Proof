package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.FormulaNode;
import com.predicate_proof.nodes.Node;

/**
 *  \ll
 *      1 p \mid premise \\
 *      2 p \vee q \mid \vee i1 1 \\
 *  \gg
 * @author David Nickel
 * @version 1.0 26/03/2021
 */
public class OrIntroRule extends Rule {

    public boolean check(boolean isEinsTrueZweiFalse,
                         Node beforeFormula,
                         FormulaNode afterFormula) {

        //FormulaNode node = afterFormula.searchOperator(RelationOperator.OR);

        if (afterFormula.getOperator() != RelationOperator.OR) {
            return false;
        }

        //there are two rule-alternatives
        if (isEinsTrueZweiFalse) {
            return equals(afterFormula.getLeftExpression(),beforeFormula);
        } else {
            return equals(afterFormula.getRightExpression(),beforeFormula);
        }
    }
}
