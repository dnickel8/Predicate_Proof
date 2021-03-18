package rule;

import copied.RelationOperator;
import nodes.BlockNode;
import nodes.LineNode;
import nodes.UnaryOperatorNode;

public class AllIntroRule extends Rule {

    public boolean test(BlockNode beforeBlock,
                        UnaryOperatorNode afterNode) {

        if (afterNode.getOperator() != RelationOperator.ALLQUANTOR) {
            return false;
        }

        String beforeVariable;
        if (((LineNode) beforeBlock.getChild(0)).isWithVariableSymbol()) {
            beforeVariable = ((LineNode) beforeBlock.getChild(0)).getVariableSymbol();
        } else {
            return false;
        }
        String afterVariable = afterNode.getVariable();

        return replacingVariableEquals(beforeVariable, afterVariable, ((LineNode) beforeBlock.getChild(0)).getFormula(), afterNode.getExpression());
    }
}
