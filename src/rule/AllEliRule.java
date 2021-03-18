package rule;

import copied.RelationOperator;
import nodes.Node;
import nodes.UnaryOperatorNode;

public class AllEliRule extends Rule {

    public boolean test(UnaryOperatorNode beforeNode,
                        Node afterNode) {
        if(beforeNode.getOperator() != RelationOperator.ALLQUANTOR) {
            return false;
        }

        String variable = beforeNode.getVariable();

        return replacingVariableEquals(variable, afterNode, beforeNode.getExpression());
    }

}
