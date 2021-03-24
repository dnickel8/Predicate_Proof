package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.FormulaNode;
import com.predicate_proof.nodes.Node;

public class AndIntroRule extends Rule {

    public boolean test(Node beforeFormula1,
                        Node beforeFormula2,
                        FormulaNode afterFormula) {

        //FormulaNode node = afterFormula.searchOperator(RelationOperator.AND);
        if (afterFormula.getOperator() != RelationOperator.AND) {
            return false;
        }

        return (equals(afterFormula.getLeftExpression(),beforeFormula1)
                    && equals(afterFormula.getRightExpression(),beforeFormula2))
                || (equals(afterFormula.getLeftExpression(),beforeFormula2)
                    && equals(afterFormula.getRightExpression(),beforeFormula1));

    }
}
