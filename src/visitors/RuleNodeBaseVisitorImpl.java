package visitors;

import generated.predicate_proof_grammarBaseVisitor;
import generated.predicate_proof_grammarParser;
import generated.predicate_proof_grammarParser.*;
import nodes.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class RuleNodeBaseVisitorImpl extends predicate_proof_grammarBaseVisitor<Node> {

    @Override public Node visitDescription(predicate_proof_grammarParser.DescriptionContext ctx) {
        ParseTree rule = ctx.getChild(0);
        if (ctx.PREMISE() != null){
            return null;
        } else if (ctx.ASSUMPTION() != null) {
            return null;
        } else if (rule instanceof AndIntroductionContext) {
            return visitAndIntroduction((AndIntroductionContext) rule);
        } else if (rule instanceof AndElimination1Context){
            return visitAndElimination1((AndElimination1Context) rule);
        } else if (rule instanceof AndElimination2Context) {
            return visitAndElimination2((AndElimination2Context) rule);
        } else if (rule instanceof OrIntroduction1Context) {
            return visitOrIntroduction1((OrIntroduction1Context) rule);
        } else if (rule instanceof OrIntroduction2Context) {
            return visitOrIntroduction2((OrIntroduction2Context) rule);
        } else if (rule instanceof OrEliminationContext) {
            return visitOrElimination((OrEliminationContext) rule);
        } else if (rule instanceof ImpliesIntroductionContext) {
            return visitImpliesIntroduction((ImpliesIntroductionContext) rule);
        } else if (rule instanceof ImpliesEliminationContext) {
            return visitImpliesElimination((ImpliesEliminationContext) rule);
        } else if (rule instanceof NotIntroductionContext) {
            return visitNotIntroduction((NotIntroductionContext) rule);
        } else if (rule instanceof NotEliminationContext) {
            return visitNotElimination((NotEliminationContext) rule);
        } else if (rule instanceof BottomEliminationContext) {
            return visitBottomElimination((BottomEliminationContext) rule);
        } else if (rule instanceof DoubleNotIntroductionContext) {
            return visitDoubleNotIntroduction((DoubleNotIntroductionContext) rule);
        } else if (rule instanceof DoubleNotEliminationContext) {
            return visitDoubleNotElimination((DoubleNotEliminationContext) rule);
        } else if (rule instanceof PbcContext) {
            return visitPbc((PbcContext) rule);
        } else if (rule instanceof ModusTollensContext) {
            return visitModusTollens((ModusTollensContext) rule);
        } else if (rule instanceof ExcludedMiddleContext) {
            return visitExcludedMiddle((ExcludedMiddleContext) rule);
        } else if (rule instanceof AllquantorIntroductionContext) {
            return visitAllquantorIntroduction((AllquantorIntroductionContext) rule);
        } else if (rule instanceof AllquantorEliminationContext) {
            return visitAllquantorElimination((AllquantorEliminationContext) rule);
        } else if (rule instanceof ExistsquantorIntroductionContext) {
            return visitExistsquantorIntroduction((ExistsquantorIntroductionContext) rule);
        } else if (rule instanceof ExistsquantorEliminationContext) {
            return visitExistsquantorElimination((ExistsquantorEliminationContext) rule);
        }
        System.out.println("Irgendetwas läuft falsch: visitDescription.");
        return visitChildren(ctx);
    }

    @Override public Node visitAndIntroduction(AndIntroductionContext ctx) {
        int singleScope1 = Integer.parseInt(ctx.singleScope(0).getText());
        int singleScope2 = Integer.parseInt(ctx.singleScope(1).getText());
        AndIntroNode node = new AndIntroNode(singleScope1, singleScope2);
        return node;
    }

    @Override public Node visitAndElimination1(AndElimination1Context ctx) {
        int singleScope = Integer.parseInt(ctx.singleScope().getText());
        AndEliNode node = new AndEliNode(true, singleScope);
        return node;
    }

    @Override public Node visitAndElimination2(AndElimination2Context ctx) {
        int singleScope = Integer.parseInt(ctx.singleScope().getText());
        AndEliNode node = new AndEliNode(false, singleScope);
        return node;
    }

    @Override public Node visitOrIntroduction1(OrIntroduction1Context ctx) {
        int singleScope = Integer.parseInt(ctx.singleScope().getText());
        OrIntroNode node = new OrIntroNode(true, singleScope);
        return node;
    }

    @Override public Node visitOrIntroduction2(OrIntroduction2Context ctx) {
        int singleScope = Integer.parseInt(ctx.singleScope().getText());
        OrIntroNode node = new OrIntroNode(false, singleScope);
        return node;
    }

    @Override public Node visitOrElimination(OrEliminationContext ctx) {
        int singleScope = Integer.parseInt(ctx.singleScope().getText());
        int multiScopeFirstLine1 = Integer.parseInt(ctx.multiScope(0).integer(0).getText());
        int multiScopeLastLine1 = Integer.parseInt(ctx.multiScope(0).integer(1).getText());
        int multiScopeFirstLine2 = Integer.parseInt(ctx.multiScope(1).integer(0).getText());
        int multiScopeLastLine2 = Integer.parseInt(ctx.multiScope(1).integer(1).getText());
        OrEliNode node = new OrEliNode(singleScope,
                multiScopeFirstLine1,
                multiScopeLastLine1,
                multiScopeFirstLine2,
                multiScopeLastLine2);
        return node;
    }

    @Override public Node visitImpliesIntroduction(ImpliesIntroductionContext ctx) {
        int mulitScopeFirstLine = Integer.parseInt(ctx.multiScope().integer(0).getText());
        int mulitScopeLastLine = Integer.parseInt(ctx.multiScope().integer(1).getText());
        ImpliesIntroNode node = new ImpliesIntroNode(mulitScopeFirstLine, mulitScopeLastLine);
        return node;
    }

    @Override public Node visitImpliesElimination(ImpliesEliminationContext ctx) {
        int singleScope1 = Integer.parseInt(ctx.singleScope(0).getText());
        int singleScope2 = Integer.parseInt(ctx.singleScope(1).getText());
        ImpliesEliNode node = new ImpliesEliNode(singleScope1, singleScope2);
        return node;
    }

    @Override public Node visitNotIntroduction(NotIntroductionContext ctx) {
        int multiScopeFirstLine = Integer.parseInt(ctx.multiScope().integer(0).getText());
        int multiScopeLastLine = Integer.parseInt(ctx.multiScope().integer(1).getText());
        NotIntroNode node = new NotIntroNode(multiScopeFirstLine, multiScopeLastLine);
        return node;
    }

    @Override public Node visitNotElimination(NotEliminationContext ctx) {
        int singleScope1 = Integer.parseInt(ctx.singleScope(0).getText());
        int singleScope2 = Integer.parseInt(ctx.singleScope(1).getText());
        NotEliNode node = new NotEliNode(singleScope1, singleScope2);
        return node;
    }

    @Override public Node visitBottomElimination(BottomEliminationContext ctx) {
        int singleScope = Integer.parseInt(ctx.singleScope().getText());
        BottomEliNode node = new BottomEliNode(singleScope);
        return node;
    }

    @Override public Node visitDoubleNotIntroduction(DoubleNotIntroductionContext ctx) {
        int singleScope = Integer.parseInt(ctx.singleScope().getText());
        DoubleNotIntroNode node = new DoubleNotIntroNode(singleScope);
        return node;
    }

    @Override public Node visitDoubleNotElimination(DoubleNotEliminationContext ctx) {
        int singleScope = Integer.parseInt(ctx.singleScope().getText());
        DoubleNotEliNode node = new DoubleNotEliNode(singleScope);
        return node;
    }

    @Override public Node visitPbc(PbcContext ctx) {
        int multiScopeFirstLine = Integer.parseInt(ctx.multiScope().integer(0).getText());
        int multiScopeLastLine = Integer.parseInt(ctx.multiScope().integer(1).getText());
        PBCNode node = new PBCNode(multiScopeFirstLine, multiScopeLastLine);
        return node;
    }

    @Override public Node visitModusTollens(ModusTollensContext ctx) {
        int singleScope1 = Integer.parseInt(ctx.singleScope(0).getText());
        int singleScope2 = Integer.parseInt(ctx.singleScope(1).getText());
        MTNode node = new MTNode(singleScope1, singleScope2);
        return node;
    }

    @Override public Node visitExcludedMiddle(ExcludedMiddleContext ctx) {
        int singleScope;
        if (ctx.getChildCount() == 2) {
            singleScope = Integer.parseInt(ctx.singleScope().getText());
        } else {
            singleScope = -1;
        }
        LEMNode node = new LEMNode(singleScope);
        return node;

    }

    @Override public Node visitAllquantorIntroduction(AllquantorIntroductionContext ctx) {
        String variable = ctx.variable().getText();
        int multiScopeFirstLine = Integer.parseInt(ctx.multiScope().integer(0).getText());
        int multiScopeLastLine = Integer.parseInt(ctx.multiScope().integer(1).getText());
        AllIntroNode node = new AllIntroNode(variable, multiScopeFirstLine, multiScopeLastLine);
        return node;
    }

    @Override public Node visitAllquantorElimination(AllquantorEliminationContext ctx) {
        String variable = ctx.variable().getText();
        int singleScope = Integer.parseInt(ctx.singleScope().getText());
        AllEliNode node = new AllEliNode(variable, singleScope);
        return node;
    }

    @Override public Node visitExistsquantorIntroduction(ExistsquantorIntroductionContext ctx) {
        String variable = ctx.variable().getText();
        int singleScope = Integer.parseInt(ctx.singleScope().getText());
        ExistIntroNode node = new ExistIntroNode(variable, singleScope);
        return node;
    }

    @Override public Node visitExistsquantorElimination(ExistsquantorEliminationContext ctx) {
        String variable = ctx.variable().getText();
        int singleScope = Integer.parseInt(ctx.singleScope().getText());
        int multiScopeFirstLine = Integer.parseInt(ctx.multiScope().integer(0).getText());
        int multiScopeLastLine = Integer.parseInt(ctx.multiScope().integer(1).getText());
        ExistEliNode node = new ExistEliNode(variable,
                singleScope,
                multiScopeFirstLine,
                multiScopeLastLine);
        return node;
    }
}
