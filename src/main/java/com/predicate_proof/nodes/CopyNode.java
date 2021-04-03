package com.predicate_proof.nodes;


/**
 * copyRule
 * :
 *     'copy' lineNumber
 * ;
 * @author David Nickel
 */
public class CopyNode extends RuleNode {

    private final int singleScope;

    public CopyNode(int singleScope) {
        this.singleScope = singleScope;
    }

    public int getSingleScope() {
        return singleScope;
    }
}
