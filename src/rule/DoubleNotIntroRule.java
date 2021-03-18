package rule;

import copied.RelationOperator;
import nodes.Node;
import nodes.UnaryOperatorNode;

public class DoubleNotIntroRule extends Rule {

    public boolean test(Node beforeNode,
                        UnaryOperatorNode afterNode) {
        if (afterNode.getOperator() != RelationOperator.NOT) {
            return false;
        }

        if (afterNode.getExpression() instanceof UnaryOperatorNode) {
            UnaryOperatorNode afterNode2 = (UnaryOperatorNode) afterNode.getExpression();
            if (afterNode2.getOperator() == RelationOperator.NOT
                    && equals(afterNode2.getExpression(),beforeNode)) {
                return true;
            }
        }

        return false;
    }
}
