package com.predicate_proof.nodes;

/**
 * pbc
 * :
 *     'PBC' multiScope
 * ;
 *
 * @author David Nickel
 */
public class PBCNode extends RuleNode {

    private final int multiScopeFirstLine;
    private final int multiScopeLastLine;

    public PBCNode(int multiScopeFirstLine, int multiScopeLastLine) {
        this.multiScopeFirstLine = multiScopeFirstLine;
        this.multiScopeLastLine = multiScopeLastLine;
    }

    public int getMultiScopeFirstLine() {
        return multiScopeFirstLine;
    }

    public int getMultiScopeLastLine() {
        return multiScopeLastLine;
    }
}
