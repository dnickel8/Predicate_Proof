package com.predicate_proof.nodes;

/**
 * impliesElimination
 * :
 *     TRANSFORMATION_ARROW 'e' singleScope COMMA singleScope
 * ;
 * @author David Nickel
 */
public class ImpliesEliNode extends RuleNode {

    private final int singleScope1;
    private final int singleScope2;

    public ImpliesEliNode(int singleScope1, int singleScope2) {
        this.singleScope1 = singleScope1;
        this.singleScope2 = singleScope2;
    }

    public int getSingleScope1() {
        return singleScope1;
    }

    public int getSingleScope2() {
        return singleScope2;
    }
}
