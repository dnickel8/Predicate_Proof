package test.com.predicate_proof.rule; 

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.FormulaNode;
import com.predicate_proof.nodes.UnaryOperatorNode;
import com.predicate_proof.nodes.VariableNode;
import com.predicate_proof.rule.AlreadyProofedRule;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/** 
* AlreadyProofedRule Tester. 
* 
* @author <David Nickel>
* @since <pre>März 24, 2021</pre> 
* @version 1.0 
*/ 
public class AlreadyProofedRuleTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: check(Node beforeNode, Node afterNode) 
* 
*/ 
@Test
public void testCheckTrue() throws Exception {
    FormulaNode beforeNode = new FormulaNode(RelationOperator.IMPLICATION,
            new VariableNode("p"),
            new VariableNode("q"));

    UnaryOperatorNode unaryOperatorNode = new UnaryOperatorNode(RelationOperator.NOT);
    unaryOperatorNode.setExpression(new VariableNode("p"));
    FormulaNode afterNode = new FormulaNode(RelationOperator.OR,
            unaryOperatorNode,
            new VariableNode("q"));

    AlreadyProofedRule rule = new AlreadyProofedRule();
    assertTrue(rule.check(beforeNode, afterNode));
}

@Test
    public void testCheckFalse() throws Exception {
        FormulaNode beforeNode = new FormulaNode(RelationOperator.IMPLICATION,
                new VariableNode("p"),
                new VariableNode("q"));

        UnaryOperatorNode unaryOperatorNode = new UnaryOperatorNode(RelationOperator.NOT);
        unaryOperatorNode.setExpression(new VariableNode("l")); //different variable
        FormulaNode afterNode = new FormulaNode(RelationOperator.OR,
                unaryOperatorNode,
                new VariableNode("q"));

        AlreadyProofedRule rule = new AlreadyProofedRule();
        assertFalse(rule.check(beforeNode, afterNode));
    }
} 
