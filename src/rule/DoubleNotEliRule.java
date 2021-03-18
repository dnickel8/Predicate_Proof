package rule;

import copied.RelationOperator;
import nodes.UnaryOperatorNode;
import nodes.Node;

public class DoubleNotEliRule extends Rule {

    public boolean test(UnaryOperatorNode beforeNode,
                        Node afterNode){
        if (beforeNode.getOperator() != RelationOperator.NOT) {
            return false;
        }

        if(beforeNode.getExpression() instanceof UnaryOperatorNode) {
            UnaryOperatorNode beforeNode2 = (UnaryOperatorNode) beforeNode.getExpression();
            if (beforeNode2.getOperator() == RelationOperator.NOT
                    && equals(beforeNode2.getExpression(),afterNode)) {
                return true;
            }
        }

        return false;
    }
}
