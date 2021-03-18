package rule;

import copied.RelationOperator;
import nodes.BottomNode;
import nodes.FormulaNode;
import nodes.Node;

public class LEMRule extends Rule {

    public boolean test(Node beforeNode,
                     FormulaNode afterNode) {
        if (beforeNode == null
                || beforeNode instanceof BottomNode) {
            if (afterNode.getOperator() == RelationOperator.NOT) {
                return negativeEquals(afterNode.getLeftExpression(), afterNode.getRightExpression());
            }
        }
        return false;
    }

    public boolean test(FormulaNode afterNode) {
        return test(null, afterNode);
    }
}
