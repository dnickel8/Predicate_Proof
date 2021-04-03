package com.predicate_proof.nodes;

/**
 * impliesIntroduction
 * :
 *     TRANSFORMATION_ARROW 'i' multiScope
 * ;
 * @author David Nickel
 */
public class ImpliesIntroNode extends RuleNode {

    private final int mulitScopeFirstLine;
    private final int mulitScopeLastLine;

    public ImpliesIntroNode(int mulitScopeFirstLine, int mulitScopeLastLine) {
        this.mulitScopeFirstLine = mulitScopeFirstLine;
        this.mulitScopeLastLine = mulitScopeLastLine;
    }

    public int getMulitScopeFirstLine() {
        return mulitScopeFirstLine;
    }

    public int getMulitScopeLastLine() {
        return mulitScopeLastLine;
    }
}
