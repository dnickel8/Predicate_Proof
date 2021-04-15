package com.predicate_proof.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.UnaryOperatorNode;
import org.junit.jupiter.api.Test;

public class AllEliRuleTest {
    @Test
    public void testCheck() {
        AllEliRule allEliRule = new AllEliRule();
        UnaryOperatorNode beforeNode = new UnaryOperatorNode();
        assertFalse(allEliRule.check(beforeNode, new BottomNode()));
    }
}

