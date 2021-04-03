package com.predicate_proof.nodes;

/**
 * notIntroduction
 * :
 *     NOT 'i' multiScope
 * ;
 * @author David Nickel
 */
public class NotIntroNode extends RuleNode {

    private final int multiScopeFirstLine;
    private final int mulitScopeLastLine;

    public NotIntroNode(int multiScopeFirstLine, int mulitScopeLastLine) {
        this.multiScopeFirstLine = multiScopeFirstLine;
        this.mulitScopeLastLine = mulitScopeLastLine;
    }

    public int getMultiScopeFirstLine() {
        return multiScopeFirstLine;
    }

    public int getMulitScopeLastLine() {
        return mulitScopeLastLine;
    }
}
