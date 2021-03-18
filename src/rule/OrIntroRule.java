package rule;

import copied.RelationOperator;
import nodes.FormulaNode;
import nodes.Node;

public class OrIntroRule extends Rule {

    public boolean test(boolean isEinsTrueZweiFalse,
                        Node beforeFormula,
                        FormulaNode afterFormula) {

        //FormulaNode node = afterFormula.searchOperator(RelationOperator.OR);

        if (afterFormula.getOperator() != RelationOperator.OR) {
            return false;
        }

        if (isEinsTrueZweiFalse) {
            return equals(afterFormula.getLeftExpression(),beforeFormula);
        } else {
            return equals(afterFormula.getRightExpression(),beforeFormula);
        }
    }
}
