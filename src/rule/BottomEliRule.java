package rule;

import nodes.BottomNode;
import nodes.Node;

public class BottomEliRule extends Rule {

    public boolean test(Node beforeNode,
                        Node afterNode) {
        if (!(beforeNode instanceof BottomNode)) {
            return false;
        }

        if (afterNode instanceof BottomNode) {
            return false;
        }

        if (afterNode != null) {
            return true;
        }

        return false;
    }
}
