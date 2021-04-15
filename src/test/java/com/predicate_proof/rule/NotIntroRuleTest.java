package com.predicate_proof.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.predicate_proof.nodes.BlockNode;
import com.predicate_proof.nodes.UnaryOperatorNode;
import org.junit.jupiter.api.Test;

public class NotIntroRuleTest {
    @Test
    public void testCheck() {
        NotIntroRule notIntroRule = new NotIntroRule();
        BlockNode beforeBlock = new BlockNode(2, 2);
        assertFalse(notIntroRule.check(beforeBlock, new UnaryOperatorNode()));
    }
}

