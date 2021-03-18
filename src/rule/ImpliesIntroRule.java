package rule;

import copied.RelationOperator;
import nodes.BlockNode;
import nodes.FormulaNode;
import nodes.LineNode;
import nodes.Node;

public class ImpliesIntroRule extends Rule {

    public boolean test(BlockNode beforeBlock,
                        FormulaNode afterFormula) {
        Node beforeFirstFormula = ((LineNode) beforeBlock.getChild(0)).getFormula();
        Node beforeLastFormula = ((LineNode) beforeBlock.getChild(beforeBlock.getChildCount()-1)).getFormula();

        if (afterFormula.getOperator() != RelationOperator.IMPLICATION) {
            return false;
        }

        if (equals(beforeFirstFormula, afterFormula.getLeftExpression())
                && equals(beforeLastFormula, afterFormula.getRightExpression())) {
            return true;
        } else {
            return false;
        }
    }
}
