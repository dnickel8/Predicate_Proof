package visitors;

import copied.RelationOperator;
import generated.predicate_proof_grammarBaseVisitor;
import generated.predicate_proof_grammarParser;
import generated.predicate_proof_grammarParser.VariableContext;
import nodes.*;

import java.util.ArrayList;
import java.util.List;

public class FormulaNodeBaseVisitorImpl extends predicate_proof_grammarBaseVisitor<Node> {

    @Override public Node visitLogicFormula(predicate_proof_grammarParser.LogicFormulaContext ctx) {
        if (ctx.getChildCount() == 3) {
            FormulaNode node = new FormulaNode();
            node.setOperator(RelationOperator.EQUIVALENZ);
            node.setLeftExpression(visitLogicFormula(ctx.logicFormula()));
            node.setRightExpression(visitImplicationExpression(ctx.implicationExpression()));
            return node;
        } else if ( ctx.getChildCount() == 1) {
            return visitImplicationExpression(ctx.implicationExpression());
        }
        System.out.println("Irgendetwas läuft falsch: visitLogicFormula.");
        return visitChildren(ctx);
    }

    @Override public Node visitImplicationExpression(predicate_proof_grammarParser.ImplicationExpressionContext ctx) {
        if (ctx.getChildCount() == 3) {
            FormulaNode node = new FormulaNode();
            node.setOperator(RelationOperator.IMPLICATION);
            node.setLeftExpression(visitImplicationExpression(ctx.implicationExpression()));
            node.setRightExpression(visitOrAndExpression(ctx.orAndExpression()));
            return node;
        } else if ( ctx.getChildCount() == 1) {
            return visitOrAndExpression(ctx.orAndExpression());
        }
        System.out.println("Irgendetwas läuft falsch: visitImplicationExpression.");
        return visitChildren(ctx);
    }

    @Override public Node visitOrAndExpression(predicate_proof_grammarParser.OrAndExpressionContext ctx) {
        if (ctx.AND() != null) {
            FormulaNode node = new FormulaNode();
            node.setOperator(RelationOperator.AND);
            node.setLeftExpression(visitOrAndExpression(ctx.orAndExpression()));
            node.setRightExpression(visitUnaryExpression(ctx.unaryExpression()));
            return node;
        } else if (ctx.OR() != null) {
            FormulaNode node = new FormulaNode();
            node.setOperator(RelationOperator.OR);
            node.setLeftExpression(visitOrAndExpression(ctx.orAndExpression()));
            node.setRightExpression(visitUnaryExpression(ctx.unaryExpression()));
            return node;
        } else {
            return visitUnaryExpression(ctx.unaryExpression());
        }
    }

    @Override public Node visitUnaryExpression(predicate_proof_grammarParser.UnaryExpressionContext ctx) {
        if (ctx.getChildCount() == 2) {
            UnaryOperatorNode node = new UnaryOperatorNode();
            if (ctx.variable() != null) {
                node.setVariable(ctx.variable().getText());
            }
            if (ctx.unaryOperator().NOT() != null) {
                node.setOperator(RelationOperator.NOT);
            } else if (ctx.unaryOperator().ALLQUANTOR() != null) {
                node.setOperator(RelationOperator.ALLQUANTOR);
            } else if (ctx.unaryOperator().EXISTQUANTOR() != null) {
                node.setOperator(RelationOperator.EXISTQUANTOR);
            }
            node.setExpression(visitUnaryExpression(ctx.unaryExpression()));
            return node;
        } else if (ctx.getChildCount() == 3) {
            return visitLogicFormula(ctx.logicFormula());
        } else if (ctx.variable() != null) {
            return new VariableNode("Variable", ctx.variable().getText());
        } else if (ctx.BOTTOM() != null) {
            return new BottomNode();
        } else if (ctx.predicateOrFunction() != null) {
            return visitPredicateOrFunction(ctx.predicateOrFunction());
        } else {
            return null;
        }
    }

    @Override public Node visitPredicateOrFunction(predicate_proof_grammarParser.PredicateOrFunctionContext ctx) {
        PredicateNode node = new PredicateNode("Predicate", ctx.variable().getText());
        List<VariableNode> variableNodeList = new ArrayList<>();
        List<VariableContext> parameterList = ctx.parameter().variable();
        for (VariableContext parameter : parameterList) {
            variableNodeList.add(new VariableNode("Variable",parameter.getText()));
        }
        node.setParameter(variableNodeList);
        return node;
    }
}
