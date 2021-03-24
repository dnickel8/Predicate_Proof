package com.predicate_proof.rule;

import com.predicate_proof.nodes.BlockNode;
import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.LineNode;
import com.predicate_proof.nodes.Node;

public class PBCRule extends Rule {

    public boolean test (BlockNode beforeBlock,
                         Node afterNode) {
        if (!(((LineNode) beforeBlock.getChild(beforeBlock.getChildCount()-1)).getFormula() instanceof BottomNode)) {
            return false;
        }

        return negativeEquals(((LineNode) beforeBlock.getChild(0)).getFormula(),afterNode);

    }
}
