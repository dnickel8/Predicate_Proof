package visitors;

import generated.predicate_proof_grammarBaseVisitor;
import generated.predicate_proof_grammarParser;
import nodes.LineNode;
import nodes.Node;
import nodes.RuleNode;


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
                lineNode.setFormula(formulaVisitor.visitLogicFormula(ctx.logicFormula()));
                lineNode.setRule((RuleNode) ruleVisitor.visitDescription(ctx.description()));
                return lineNode;
        }
     }
