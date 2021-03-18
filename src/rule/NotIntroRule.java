package rule;

import copied.RelationOperator;
import nodes.*;

public class NotIntroRule extends Rule {

    public boolean test(BlockNode beforeBlock,
                        UnaryOperatorNode afterNode) {

        if (afterNode.getOperator() != RelationOperator.NOT) {
            return false;
        }

        Node beforeBlockFirst = ((LineNode) beforeBlock.getChild(0)).getFormula();
        Node beforeBlockLast = ((LineNode) beforeBlock.getChild(beforeBlock.getChildCount()-1)).getFormula();

        if (!(beforeBlockLast instanceof BottomNode)) {
            return false;
        }

        if (equals(beforeBlockFirst, afterNode.getExpression())) {
            return true;
        }

        return false;
    }
}
