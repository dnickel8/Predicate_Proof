package com.predicate_proof.nodes;

/**
 * alreadyProofed
 * :
 *     'already proofed' lineNumber
 * ;
 * @author David Nickel
 */
public class AlreadyProofedNode extends RuleNode{

    private final int singleScope;

    public AlreadyProofedNode(int singleScope) {
        this.singleScope = singleScope;
    }

    public int getSingleScope() {
        return singleScope;
    }
}
