package com.predicate_proof.visitors;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.generated.predicate_proof_grammarBaseVisitor;
import com.predicate_proof.generated.predicate_proof_grammarParser;
import com.predicate_proof.generated.predicate_proof_grammarParser.VariableContext;
import com.predicate_proof.nodes.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author David Nickel
 * @version 1.0 24/03/2021
 */
public class FormulaNodeBaseVisitorImpl extends predicate_proof_grammarBaseVisitor<Node> {

    @Override public Node visitLogicFormula(predicate_proof_grammarParser.LogicFormulaContext ctx) {
        if (ctx.getChildCount() == 3) { //rule-alternativ with three children: logicFormula EUQIVALENZ_ARROW implicationExpression
            FormulaNode node = new FormulaNode();
            node.setOperator(RelationOperator.EQUIVALENZ);
            node.setLeftExpression(visitLogicFormula(ctx.logicFormula()));
            node.setRightExpression(visitImplicationExpression(ctx.implicationExpression()));
            return node;
        } else if ( ctx.getChildCount() == 1) { //rule-alternativ with one child: implicationExpression
            return visitImplicationExpression(ctx.implicationExpression());
        } else {
            throw new IllegalStateException("FormulaNodeBaseVisitorImpl.visitLogicFormula konnte nicht richtig ausgeführt werden. Bei: "
                    + ctx.getText());
        }
    }

    @Override public Node visitImplicationExpression(predicate_proof_grammarParser.ImplicationExpressionContext ctx) {
        if (ctx.getChildCount() == 3) { //rule-alternativ with three children: implicationExpression TRANSFORMATION_ARROW orAndExpression
            FormulaNode node = new FormulaNode();
            node.setOperator(RelationOperator.IMPLICATION);
            node.setLeftExpression(visitImplicationExpression(ctx.implicationExpression()));
            node.setRightExpression(visitOrAndExpression(ctx.orAndExpression()));
            return node;
        } else if ( ctx.getChildCount() == 1) { //rule-alternativ with one child: orAndExpression
            return visitOrAndExpression(ctx.orAndExpression());
        } else {
            throw new IllegalStateException("FormulaNodeBaseVisitorImpl.visitImplicationExpression konnte nicht richtig ausgeführt werden. Bei: "
                    + ctx.getText());
        }
    }

    @Override public Node visitOrAndExpression(predicate_proof_grammarParser.OrAndExpressionContext ctx) {
        if (ctx.AND() != null) { //rule-alternatv: orAndExpression OR unaryExpression
            FormulaNode node = new FormulaNode();
            node.setOperator(RelationOperator.AND);
            node.setLeftExpression(visitOrAndExpression(ctx.orAndExpression()));
            node.setRightExpression(visitUnaryExpression(ctx.unaryExpression()));
            return node;
        } else if (ctx.OR() != null) { //rule-alternatv: orAndExpression AND unaryExpression
            FormulaNode node = new FormulaNode();
            node.setOperator(RelationOperator.OR);
            node.setLeftExpression(visitOrAndExpression(ctx.orAndExpression()));
            node.setRightExpression(visitUnaryExpression(ctx.unaryExpression()));
            return node;
        } else { //rule-alternatv: unaryExpression
            return visitUnaryExpression(ctx.unaryExpression());
        }
    }

    @Override public Node visitUnaryExpression(predicate_proof_grammarParser.UnaryExpressionContext ctx) {
        if (ctx.getChildCount() == 2) { //rule-alternatv: unaryOperator unaryExpression
            UnaryOperatorNode node = new UnaryOperatorNode();
            if (ctx.unaryOperator().variable() != null) {
                node.setVariable(ctx.unaryOperator().variable().getText());
            }
            if (ctx.unaryOperator().NOT() != null) {  //rule-alternatv from unaryOperator: NOT
                node.setOperator(RelationOperator.NOT);
            } else if (ctx.unaryOperator().ALLQUANTOR() != null) { //rule-alternatv from unaryOperator: ALLQUANTOR variable
                node.setOperator(RelationOperator.ALLQUANTOR);
            } else if (ctx.unaryOperator().EXISTQUANTOR() != null) { //rule-alternatv from unaryOperator: EXISTQUANTOR variable
                node.setOperator(RelationOperator.EXISTQUANTOR);
            }
            node.setExpression(visitUnaryExpression(ctx.unaryExpression()));
            return node;
        } else if (ctx.getChildCount() == 3) { //rule-alternatv: LPAREN logicFormula RPAREN
            return visitLogicFormula(ctx.logicFormula());
        } else if (ctx.variable() != null) { //rule-alternatv: variable
            return new VariableNode(ctx.variable().getText());
        } else if (ctx.BOTTOM() != null) { //rule-alternatv: BOTTOM
            return new BottomNode();
        } else if (ctx.predicateOrFunction() != null) { //rule-alternatv: predicateOrFunction
            return visitPredicateOrFunction(ctx.predicateOrFunction());
        } else {
            throw new IllegalStateException("FormulaNodeBaseVisitorImpl.visitUnaryExpression konnte nicht richtig ausgeführt werden. Bei: "
                    + ctx.getText());
        }
    }

    @Override public Node visitPredicateOrFunction(predicate_proof_grammarParser.PredicateOrFunctionContext ctx) {
        PredicateNode node = new PredicateNode(ctx.variable().getText());
        List<VariableNode> variableNodeList = new ArrayList<>();
        List<VariableContext> parameterList = ctx.parameter().variable(); //variable() returns the list with all variableContexts
        for (VariableContext parameter : parameterList) {
            variableNodeList.add(new VariableNode(parameter.getText()));
        }
        node.setParameter(variableNodeList);
        return node;
    }
}
