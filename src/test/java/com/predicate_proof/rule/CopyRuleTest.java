package com.predicate_proof.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.FormulaNode;
import org.junit.jupiter.api.Test;

public class CopyRuleTest {
    @Test
    public void testCheck() {
        CopyRule copyRule = new CopyRule();
        BottomNode beforeNode = new BottomNode();
        assertFalse(copyRule.check(beforeNode, new BottomNode()));
    }

    @Test
    public void testCheck2() {
        CopyRule copyRule = new CopyRule();

        FormulaNode formulaNode = new FormulaNode();
        formulaNode.setOperator(RelationOperator.EQ);
        assertFalse(copyRule.check(formulaNode, new FormulaNode()));
    }
}

