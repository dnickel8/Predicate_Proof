package rule;

import copied.RelationOperator;
import nodes.BlockNode;
import nodes.LineNode;
import nodes.Node;
import nodes.UnaryOperatorNode;

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

        if (replacingVariableEquals(beforeVariable, afterVariable, beforeFormula.getExpression(), ((LineNode) beforeBlock.getChild(0)).getFormula())) {
            return equals(afterFormula, ((LineNode) beforeBlock.getChild(beforeBlock.getChildCount()-1)).getFormula());
        }
        return false;
    }
}
