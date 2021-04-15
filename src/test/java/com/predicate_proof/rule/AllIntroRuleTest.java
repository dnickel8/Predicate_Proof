package com.predicate_proof.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.predicate_proof.nodes.BlockNode;
import com.predicate_proof.nodes.UnaryOperatorNode;
import org.junit.jupiter.api.Test;

public class AllIntroRuleTest {
    @Test
    public void testCheck() {
        AllIntroRule allIntroRule = new AllIntroRule();
        BlockNode beforeBlock = new BlockNode(2, 2);
        assertFalse(allIntroRule.check(beforeBlock, new UnaryOperatorNode()));
    }
}

