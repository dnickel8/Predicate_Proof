package test.com.predicate_proof.rule; 

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.PredicateNode;
import com.predicate_proof.nodes.UnaryOperatorNode;
import com.predicate_proof.nodes.VariableNode;
import com.predicate_proof.rule.AllEliRule;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/** 
* AllEliRule Tester. 
* 
* @author <David Nickel>
* @since <pre>März 24, 2021</pre> 
* @version 1.0 
*/ 
public class AllEliRuleTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: check(UnaryOperatorNode beforeNode, Node afterNode) 
* 
*/ 
@Test
public void testCheckTrue() throws Exception {
    VariableNode variableNode = new VariableNode("x");
    PredicateNode predicateNode = new PredicateNode("P");
    predicateNode.addParameter(variableNode);
    UnaryOperatorNode beforeNode = new UnaryOperatorNode(RelationOperator.ALLQUANTOR,
            "x",
            predicateNode);

    variableNode = new VariableNode("t");
    predicateNode = new PredicateNode("P");
    predicateNode.addParameter(variableNode);

    AllEliRule rule = new AllEliRule();
    assertTrue(rule.check(beforeNode, predicateNode));
}

@Test
    public void testCheckFalse() throws Exception {
        VariableNode variableNode = new VariableNode("x");
        PredicateNode predicateNode = new PredicateNode("P");
        predicateNode.addParameter(variableNode);
        UnaryOperatorNode beforeNode = new UnaryOperatorNode(RelationOperator.ALLQUANTOR,
                "x",
                predicateNode);

        variableNode = new VariableNode("t");
        predicateNode = new PredicateNode("Q");//different Predicates
        predicateNode.addParameter(variableNode);

        AllEliRule rule = new AllEliRule();
        assertFalse(rule.check(beforeNode, predicateNode));
    }
} 
