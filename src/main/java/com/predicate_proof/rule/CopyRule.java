package com.predicate_proof.rule;

import com.predicate_proof.nodes.Node;

/**
 * \ll
 *      1 q \mid \premise \\
 *      2 q \mid copy 1 \\
 * \gg
 * @author David Nickel
 * @version 1.0 24/03/2021
 */
public class CopyRule extends Rule{

    public boolean check(Node beforeNode,
                         Node afterNode) {

        return equals(beforeNode, afterNode);
    }

}
