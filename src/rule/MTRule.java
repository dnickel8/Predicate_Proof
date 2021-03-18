package rule;

import copied.RelationOperator;
import nodes.Node;
import nodes.FormulaNode;

public class MTRule extends Rule {

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

    private boolean helpMethod(Node beforeFormula,
                               FormulaNode implicationFormula,
                               Node afterFormula) {
        if(negativeEquals(implicationFormula.getRightExpression(),beforeFormula)) {
            return negativeEquals(afterFormula,implicationFormula.getLeftExpression());
        }

        return false;
    }
}
