package com.predicate_proof.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.UnaryOperatorNode;
import org.junit.jupiter.api.Test;

public class DoubleNotEliRuleTest {
    @Test
    public void testCheck() {
        DoubleNotEliRule doubleNotEliRule = new DoubleNotEliRule();
        UnaryOperatorNode beforeNode = new UnaryOperatorNode();
        assertFalse(doubleNotEliRule.check(beforeNode, new BottomNode()));
    }
}

