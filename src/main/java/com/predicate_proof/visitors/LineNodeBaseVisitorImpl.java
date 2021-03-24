package com.predicate_proof.visitors;

import com.predicate_proof.generated.predicate_proof_grammarBaseVisitor;
import com.predicate_proof.generated.predicate_proof_grammarParser;
import com.predicate_proof.nodes.LineNode;
import com.predicate_proof.nodes.Node;
import com.predicate_proof.nodes.RuleNode;


public class LineNodeBaseVisitorImpl extends predicate_proof_grammarBaseVisitor<Node> {

        private FormulaNodeBaseVisitorImpl formulaVisitor = new FormulaNodeBaseVisitorImpl();
        private RuleNodeBaseVisitorImpl ruleVisitor = new RuleNodeBaseVisitorImpl();

        @Override public Node visitLine(predicate_proof_grammarParser.LineContext ctx) {
                int line = Integer.parseInt(ctx.lineNumber().integer().getText());
                LineNode lineNode = new LineNode("Line", line);
                Node node = formulaVisitor.visitLogicFormula(ctx.logicFormula());
                lineNode.setFormula(node);
                lineNode.setRule((RuleNode) ruleVisitor.visitDescription(ctx.description()));
                return lineNode;
        }

        @Override public Node visitLineWithVariableSymbol(predicate_proof_grammarParser.LineWithVariableSymbolContext ctx) {
                int line = Integer.parseInt(ctx.lineNumber().integer().getText());
                String variable = ctx.variable().getText();
                LineNode lineNode = new LineNode("Line", line,true, variable);
                if (ctx.logicFormula() != null) {
                        lineNode.setFormula(formulaVisitor.visitLogicFormula(ctx.logicFormula()));
                }
                if (ctx.description() != null) {
                        lineNode.setRule((RuleNode) ruleVisitor.visitDescription(ctx.description()));
                }
                return lineNode;
        }
     }
