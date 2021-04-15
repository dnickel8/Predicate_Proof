package com.predicate_proof.visitors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.predicate_proof.generated.predicate_proof_grammarParser;
import com.predicate_proof.nodes.LEMNode;
import com.predicate_proof.nodes.Node;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNodeImpl;
import org.junit.jupiter.api.Test;

public class RuleNodeBaseVisitorImplTest {
    @Test
    public void testVisitDescription() {
        RuleNodeBaseVisitorImpl ruleNodeBaseVisitorImpl = new RuleNodeBaseVisitorImpl();
        assertThrows(IllegalStateException.class, () -> ruleNodeBaseVisitorImpl
                .visitDescription(new predicate_proof_grammarParser.DescriptionContext(new ParserRuleContext(), 1)));
    }

    @Test
    public void testVisitDescription2() {
        RuleNodeBaseVisitorImpl ruleNodeBaseVisitorImpl = new RuleNodeBaseVisitorImpl();

        predicate_proof_grammarParser.DescriptionContext descriptionContext = new predicate_proof_grammarParser.DescriptionContext(
                new ParserRuleContext(), 1);
        descriptionContext.addChild(new ErrorNodeImpl(new CommonToken(1)));
        assertThrows(IllegalStateException.class, () -> ruleNodeBaseVisitorImpl.visitDescription(descriptionContext));
    }

    @Test
    public void testVisitDescription3() {
        RuleNodeBaseVisitorImpl ruleNodeBaseVisitorImpl = new RuleNodeBaseVisitorImpl();

        predicate_proof_grammarParser.DescriptionContext descriptionContext = new predicate_proof_grammarParser.DescriptionContext(
                new ParserRuleContext(), 1);
        descriptionContext.addChild(new ErrorNodeImpl(new CommonToken(18)));
        assertNull(ruleNodeBaseVisitorImpl.visitDescription(descriptionContext));
    }

    @Test
    public void testVisitDescription4() {
        RuleNodeBaseVisitorImpl ruleNodeBaseVisitorImpl = new RuleNodeBaseVisitorImpl();

        predicate_proof_grammarParser.DescriptionContext descriptionContext = new predicate_proof_grammarParser.DescriptionContext(
                new ParserRuleContext(), 1);
        descriptionContext.addChild(new ErrorNodeImpl(new CommonToken(17)));
        assertNull(ruleNodeBaseVisitorImpl.visitDescription(descriptionContext));
    }

    @Test
    public void testVisitExcludedMiddle() {
        RuleNodeBaseVisitorImpl ruleNodeBaseVisitorImpl = new RuleNodeBaseVisitorImpl();
        Node actualVisitExcludedMiddleResult = ruleNodeBaseVisitorImpl
                .visitExcludedMiddle(new predicate_proof_grammarParser.ExcludedMiddleContext(new ParserRuleContext(), 1));
        assertEquals(0, actualVisitExcludedMiddleResult.getChildCount());
        assertEquals(-1, ((LEMNode) actualVisitExcludedMiddleResult).getSingleScope());
    }

    @Test
    public void testVisitExcludedMiddle2() {
        RuleNodeBaseVisitorImpl ruleNodeBaseVisitorImpl = new RuleNodeBaseVisitorImpl();

        predicate_proof_grammarParser.ExcludedMiddleContext excludedMiddleContext = new predicate_proof_grammarParser.ExcludedMiddleContext(
                new ParserRuleContext(), 1);
        excludedMiddleContext.addChild(new ErrorNodeImpl(new CommonToken(1)));
        Node actualVisitExcludedMiddleResult = ruleNodeBaseVisitorImpl.visitExcludedMiddle(excludedMiddleContext);
        assertEquals(0, actualVisitExcludedMiddleResult.getChildCount());
        assertEquals(-1, ((LEMNode) actualVisitExcludedMiddleResult).getSingleScope());
    }
}

