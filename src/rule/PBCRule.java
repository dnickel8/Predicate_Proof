package rule;

import nodes.BlockNode;
import nodes.BottomNode;
import nodes.LineNode;
import nodes.Node;

public class PBCRule extends Rule {

    public boolean test (BlockNode beforeBlock,
                         Node afterNode) {
        if (!(((LineNode) beforeBlock.getChild(beforeBlock.getChildCount()-1)).getFormula() instanceof BottomNode)) {
            return false;
        }

        return negativeEquals(((LineNode) beforeBlock.getChild(0)).getFormula(),afterNode);

    }
}
