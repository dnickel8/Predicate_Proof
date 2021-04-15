package com.predicate_proof.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.UnaryOperatorNode;
import org.junit.jupiter.api.Test;

public class DoubleNotIntroRuleTest {
    @Test
    public void testCheck() {
        DoubleNotIntroRule doubleNotIntroRule = new DoubleNotIntroRule();
        BottomNode beforeNode = new BottomNode();
        assertFalse(doubleNotIntroRule.check(beforeNode, new UnaryOperatorNode()));
    }
}

