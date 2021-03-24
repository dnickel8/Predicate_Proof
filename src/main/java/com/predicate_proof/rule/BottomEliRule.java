package com.predicate_proof.rule;

import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.Node;

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
