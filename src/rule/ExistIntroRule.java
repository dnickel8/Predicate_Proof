package rule;

import copied.RelationOperator;
import nodes.Node;
import nodes.UnaryOperatorNode;

public class ExistIntroRule extends Rule {

    public boolean test(Node beforeFormula,
                        UnaryOperatorNode afterFormula) {

        if (!(afterFormula.getOperator() == RelationOperator.EXISTQUANTOR)){
            return false;
        }

        return replacingVariableEquals(afterFormula.getVariable(), beforeFormula, afterFormula.getExpression());
    }
}
