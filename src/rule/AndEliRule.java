package rule;

import copied.RelationOperator;
import nodes.FormulaNode;
import nodes.Node;

public class AndEliRule extends Rule {

    public boolean test(boolean ruleNumber,
                        FormulaNode beforeFormula,
                        Node afterFormula) {

        //FormulaNode node = beforeFormula.searchOperator(RelationOperator.AND);
        if (beforeFormula.getOperator() != RelationOperator.AND) {
            return false;
        }

        if (ruleNumber) {
            return equals(beforeFormula.getLeftExpression(), afterFormula);
        } else {
            return equals(beforeFormula.getRightExpression(), afterFormula);
        }
    }

}
