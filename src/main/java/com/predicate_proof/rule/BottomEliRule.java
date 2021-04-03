package com.predicate_proof.rule;

import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.Node;

/**
 * \ll
 *      1 \bot \mid premise \\
 *      2 q \mid \bot e 1 \\
 * \gg
 * @author David Nickel
 * @version 1.0 24/03/2021
 */
public class BottomEliRule extends Rule {

    public boolean check(Node beforeNode,
                         Node afterNode) {
        if (!(beforeNode instanceof BottomNode)) {
            return false;
        }

        if (afterNode instanceof BottomNode) {
            return false;
        }

        if (afterNode == null) {
            return false;
        }

        return true;
    }
}
