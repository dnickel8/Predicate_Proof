package test.com.predicate_proof.rule; 

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.BlockNode;
import com.predicate_proof.nodes.LineNode;
import com.predicate_proof.nodes.UnaryOperatorNode;
import com.predicate_proof.nodes.VariableNode;
import com.predicate_proof.rule.AllIntroRule;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/** 
* AllIntroRule Tester. 
* 
* @author <David Nickel>
* @since <pre>März 24, 2021</pre> 
* @version 1.0 
*/ 
public class AllIntroRuleTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: check(BlockNode beforeBlock, UnaryOperatorNode afterNode) 
* 
*/ 
@Test
public void testCheckTrue() throws Exception {
    LineNode lineNodeFirst = new LineNode(2,true, "t");
    VariableNode variableNode = new VariableNode("t");
    LineNode lineNodeLast = new LineNode(5);
    lineNodeLast.setFormula(variableNode);
    BlockNode blockNode = new BlockNode(2,5);
    blockNode.addChild(lineNodeFirst);
    blockNode.addChild(lineNodeLast);
    blockNode.setDeclaredVariable("t");

    VariableNode variableNode2 = new VariableNode("x");
    UnaryOperatorNode unaryOperatorNode = new UnaryOperatorNode(RelationOperator.ALLQUANTOR, "x", variableNode2);

    AllIntroRule rule = new AllIntroRule();
    assertTrue(rule.check(blockNode, unaryOperatorNode));
}

    /**
     *
     * Method: check(BlockNode beforeBlock, UnaryOperatorNode afterNode)
     *
     */
    @Test
    public void testCheckFalse() throws Exception {
        LineNode lineNodeFirst = new LineNode(2,true, "t");
        VariableNode variableNode = new VariableNode("t");
        LineNode lineNodeLast = new LineNode(5);
        lineNodeLast.setFormula(variableNode);
        BlockNode blockNode = new BlockNode(2,5);
        blockNode.addChild(lineNodeFirst);
        blockNode.addChild(lineNodeLast);
        blockNode.setDeclaredVariable("t");

        VariableNode variableNode2 = new VariableNode("m"); //different from quantor variable
        UnaryOperatorNode unaryOperatorNode = new UnaryOperatorNode(RelationOperator.ALLQUANTOR, "x", variableNode2);

        AllIntroRule rule = new AllIntroRule();
        assertFalse(rule.check(blockNode, unaryOperatorNode));
    }


} 
