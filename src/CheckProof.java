import nodes.*;
import rule.*;

import java.util.ArrayList;
import java.util.List;

public class CheckProof {


    private List<BlockNode> blockNodes;
    private List<LineNode> lineNodes;
    public boolean checkProof (BlockNode tree) {
        blockNodes = new ArrayList<>();
        lineNodes = new ArrayList<>();

        return checkBlock(tree);
    }

    private boolean checkBlock(BlockNode node) {
        List<Node> children = node.getChildren();
        for(Node child : children) {
            if (child instanceof LineNode) {
                if (!(checkLine((LineNode) child))){
                    throw new IllegalStateException("Line ist falsch");
                    //return false;
                }
            } else if (child instanceof BlockNode) {
                if (checkBlock((BlockNode) child)) {
                    return true;
                }
                return false;
            }
        }
        blockNodes.add(node);
        return true;
    }

    private boolean checkLine(LineNode node) {
        lineNodes.add(node);
        RuleNode ruleNode = (RuleNode) node.getRule();
        if (ruleNode instanceof AllEliNode) {
            return allEliNodeMethod(node, (AllEliNode) ruleNode);
        } else if (ruleNode instanceof AllIntroNode) {
            return allIntroNodeMethod(node, (AllIntroNode) ruleNode);
        } else if (ruleNode instanceof AndEliNode) {
            return andEliNodeMethod(node, (AndEliNode) ruleNode);
        } else if (ruleNode instanceof AndIntroNode) {
            return andIntroNodeMethod(node, (AndIntroNode) ruleNode);
        } else if (ruleNode instanceof BottomEliNode) {
            return bottomEliNodeMethod(node, (BottomEliNode) ruleNode);
        } else if (ruleNode instanceof DoubleNotEliNode) {
            return doubleNotEliNodeMethod(node, (DoubleNotEliNode) ruleNode);
        } else if (ruleNode instanceof DoubleNotIntroNode) {
            return doubleNotIntroNodeMethod(node, (DoubleNotIntroNode) ruleNode);
        } else if (ruleNode instanceof ExistEliNode) {
            return existEliNodeMethod(node, (ExistEliNode) ruleNode);
        } else if (ruleNode instanceof ExistIntroNode) {
            return existIntroNodeMethod(node, (ExistIntroNode) ruleNode);
        } else if (ruleNode instanceof ImpliesEliNode) {
            return impliesEliNodeMethod(node, (ImpliesEliNode) ruleNode);
        } else if (ruleNode instanceof ImpliesIntroNode) {
            return impliesIntroNodeMethod(node, (ImpliesIntroNode) ruleNode);
        } else if (ruleNode instanceof LEMNode) {
            return lemNodeMethod(node, (LEMNode) ruleNode);
        } else if (ruleNode instanceof MTNode) {
            return mtNodeMethod(node, (MTNode) ruleNode);
        } else if (ruleNode instanceof NotEliNode) {
            return notEliNodeMethod(node, (NotEliNode) ruleNode);
        } else if (ruleNode instanceof NotIntroNode) {
            return notIntroNodeMethod(node, (NotIntroNode) ruleNode);
        } else if (ruleNode instanceof OrEliNode) {
            return orEliNodeMethod(node, (OrEliNode) ruleNode);
        } else if (ruleNode instanceof OrIntroNode) {
            return orIntroNodeMethod(node, (OrIntroNode) ruleNode);
        } else if (ruleNode instanceof PBCNode) {
            return pbcNodeMethod(node, (PBCNode) ruleNode);
        } else if (ruleNode == null) {
            return true;
        } else {
            System.out.println("Unbekannte RuleNode: checkLine");
            return false;
        }
    }

    private boolean allEliNodeMethod(LineNode node, AllEliNode ruleNode) {
        LineNode beforeNode;
        if ((beforeNode = searchLineNode(ruleNode.getSingleScope())) == null) {
            return false;
        }
        AllEliRule rule = new AllEliRule();
        return rule.test((UnaryOperatorNode) beforeNode.getFormula(), node.getFormula());
    }

    private boolean allIntroNodeMethod(LineNode node, AllIntroNode ruleNode) {
        BlockNode beforeBlock;
        if ((beforeBlock = searchBlockNode(ruleNode.getMultiScopeFirstLine(), ruleNode.getMultiScopeLastLine())) == null) {
            return false;
        }
        if (node.getFormula() instanceof UnaryOperatorNode) {
            AllIntroRule rule = new AllIntroRule();
            return rule.test(beforeBlock, (UnaryOperatorNode) node.getFormula());
        } else {
            return false;
        }
    }

    private boolean andEliNodeMethod(LineNode node, AndEliNode ruleNode) {
        LineNode beforeNode;
        if ((beforeNode = searchLineNode(ruleNode.getSingleScope())) == null)
            return false;
        AndEliRule rule = new AndEliRule();
        return rule.test(ruleNode.isRuleEinsTrueZweiFalse(),
                (FormulaNode) beforeNode.getFormula(),
                node.getFormula());
    }

    private boolean andIntroNodeMethod(LineNode node, AndIntroNode ruleNode) {
        LineNode beforeLine1;
        LineNode beforeLine2;
        if ((beforeLine1 = searchLineNode(ruleNode.getSingleScope1())) == null) {
            return false;
        }
        if ((beforeLine2 = searchLineNode(ruleNode.getSingleScope2())) == null) {
            return false;
        }

        AndIntroRule rule = new AndIntroRule();
        return rule.test(beforeLine1.getFormula(), beforeLine2.getFormula(), (FormulaNode) node.getFormula());
    }

    private boolean bottomEliNodeMethod(LineNode node, BottomEliNode ruleNode) {
        LineNode beforeLine;
        if((beforeLine = searchLineNode(ruleNode.getSingleScope())) == null) {
            return false;
        }
        BottomEliRule rule = new BottomEliRule();
        return rule.test(beforeLine.getFormula(), node.getFormula());
    }

    private boolean doubleNotEliNodeMethod(LineNode node, DoubleNotEliNode ruleNode) {
        LineNode beforeLine;
        if ((beforeLine = searchLineNode(ruleNode.getSingleScope())) == null) {
            return false;
        }
        DoubleNotEliRule rule = new DoubleNotEliRule();
        if (beforeLine.getFormula() instanceof UnaryOperatorNode) {
            return rule.test((UnaryOperatorNode) beforeLine.getFormula(),node.getFormula());
        }
        return false;
    }

    private boolean doubleNotIntroNodeMethod(LineNode node, DoubleNotIntroNode ruleNode) {
        LineNode beforeLine;
        if ((beforeLine = searchLineNode(ruleNode.getSingleScope())) == null) {
            return false;
        }
        DoubleNotIntroRule rule =new DoubleNotIntroRule();
        if (node.getFormula() instanceof UnaryOperatorNode) {
            return rule.test((beforeLine.getFormula()), (UnaryOperatorNode) node.getFormula());
        }
        return false;
    }

    private boolean existEliNodeMethod(LineNode node, ExistEliNode ruleNode) {
        LineNode beforeLine;
        BlockNode beforeBlock;
        if ((beforeLine = searchLineNode(ruleNode.getSingleScope())) == null) {
            return false;
        }
        if ((beforeBlock = searchBlockNode(ruleNode.getMultiScopeFirstLine(), ruleNode.getMultiScopeLastLine())) == null) {
            return false;
        }
        ExistEliRule rule = new ExistEliRule();
        if (beforeLine.getFormula() instanceof UnaryOperatorNode) {
            return rule.test((UnaryOperatorNode) beforeLine.getFormula(), beforeBlock, node.getFormula());
        }
        return false;
    }

    private boolean existIntroNodeMethod(LineNode node, ExistIntroNode ruleNode) {
        LineNode beforeLine;
        if ((beforeLine = searchLineNode(ruleNode.getSingleScope())) == null) {
            return false;
        }
        ExistIntroRule rule = new ExistIntroRule();
        if (node.getFormula() instanceof UnaryOperatorNode) {
            return rule.test(beforeLine.getFormula(), (UnaryOperatorNode) node.getFormula());
        }
        return false;
    }

    private boolean impliesEliNodeMethod(LineNode node, ImpliesEliNode ruleNode) {
        LineNode beforeLine1;
        LineNode beforeLine2;
        if ((beforeLine1 = searchLineNode(ruleNode.getSingleScope1())) == null) {
            return false;
        }
        if ((beforeLine2 = searchLineNode(ruleNode.getSingleScope2())) == null) {
            return false;
        }

        ImpliesEliRule rule = new ImpliesEliRule();
        return rule.test(beforeLine1.getFormula(),beforeLine2.getFormula(),node.getFormula());
    }

    private boolean impliesIntroNodeMethod(LineNode node, ImpliesIntroNode ruleNode) {
        BlockNode beforeBlock;
        if ((beforeBlock = searchBlockNode(ruleNode.getMulitScopeFirstLine(), ruleNode.getMulitScopeLastLine())) == null) {
            return false;
        }
        ImpliesIntroRule rule = new ImpliesIntroRule();
        if (node.getFormula() instanceof FormulaNode) {
            return rule.test(beforeBlock, (FormulaNode) node.getFormula());
        }
        return false;
    }

    private boolean lemNodeMethod(LineNode node, LEMNode ruleNode) {
        LEMRule rule = new LEMRule();
        LineNode beforeLine;
        if (node.getFormula() instanceof FormulaNode) {
            if (ruleNode.getSingleScope() >= 0) {
                if ((beforeLine = searchLineNode(ruleNode.getSingleScope())) == null) {
                    return false;
                } else {
                    return rule.test(beforeLine.getFormula(),(FormulaNode) node.getFormula());
                }
            } else {
                return rule.test((FormulaNode) node.getFormula());
            }
        } else {
            return false;
        }
    }

    private boolean mtNodeMethod(LineNode node, MTNode ruleNode) {
        LineNode beforeLine1;
        LineNode beforeLine2;
        if ((beforeLine1 = searchLineNode(ruleNode.getSingleScope1())) == null) {
            return false;
        }
        if ((beforeLine2 = searchLineNode(ruleNode.getSingleScope2())) == null) {
            return false;
        }
        MTRule rule = new MTRule();
        return rule.test(beforeLine1.getFormula(), beforeLine2.getFormula(), node.getFormula());
    }

    private boolean notEliNodeMethod(LineNode node, NotEliNode ruleNode) {
        LineNode beforeLine1;
        LineNode beforeLine2;
        if ((beforeLine1 = searchLineNode(ruleNode.getSingleScope1())) == null) {
            return false;
        }
        if ((beforeLine2 = searchLineNode(ruleNode.getSingleScope2())) == null) {
            return false;
        }

        NotEliRule rule = new NotEliRule();
        return rule.test(beforeLine1.getFormula(), beforeLine2.getFormula(), node.getFormula());
    }

    private boolean notIntroNodeMethod(LineNode node, NotIntroNode ruleNode) {
        BlockNode beforeBlock;
        if ((beforeBlock = searchBlockNode(ruleNode.getMultiScopeFirstLine(), ruleNode.getMulitScopeLastLine())) == null) {
            return false;
        }
        NotIntroRule rule = new NotIntroRule();

        if(node.getFormula() instanceof UnaryOperatorNode) {
            return rule.test(beforeBlock, (UnaryOperatorNode) node.getFormula());
        }
        return false;
    }

    private boolean orEliNodeMethod(LineNode node, OrEliNode ruleNode) {
        LineNode beforeLine;
        BlockNode beforeBlock1;
        BlockNode beforeBlock2;
        if ((beforeLine = searchLineNode(ruleNode.getSingleScope())) == null) {
            return false;
        }
        if ((beforeBlock1 = searchBlockNode(ruleNode.getMultiScopeFirstLine1(), ruleNode.getMultiScopeLastLine1())) == null) {
            return false;
        }
        if ((beforeBlock2 = searchBlockNode(ruleNode.getMultiScopeFirstLine2(), ruleNode.getMultiScopeLastLine2())) == null) {
            return false;
        }

        OrEliRule rule = new OrEliRule();
        if (beforeLine.getFormula() instanceof FormulaNode) {
            return rule.test((FormulaNode) beforeLine.getFormula(), beforeBlock1, beforeBlock2, node.getFormula());
        }
        return false;
    }

    private boolean orIntroNodeMethod(LineNode node, OrIntroNode ruleNode) {
        LineNode beforeLine;
        if ((beforeLine = searchLineNode(ruleNode.getSingleScope())) == null) {
            return false;
        }
        OrIntroRule rule = new OrIntroRule();
        if (node.getFormula() instanceof FormulaNode) {
            return rule.test(ruleNode.isRuleEinsTrueZweiFalse(),
                    beforeLine.getFormula(),
                    (FormulaNode) node.getFormula());
        }
        return false;
    }

    private boolean pbcNodeMethod(LineNode node, PBCNode ruleNode) {
        BlockNode beforeBlock;
        if ((beforeBlock = searchBlockNode(ruleNode.getMultiScopeFirstLine(), ruleNode.getMultiScopeLastLine())) == null) {
            return false;
        }

        PBCRule rule = new PBCRule();
        return rule.test(beforeBlock, node.getFormula());
    }

    private LineNode searchLineNode(int lineNumber) {
        for (LineNode node : lineNodes) {
            if (node.getLinenumber() == lineNumber) {
                return node;
            }
        }
        return null;
    }

    private BlockNode searchBlockNode(int firstLine, int lastLine) {
        for (BlockNode node : blockNodes) {
            if (node.getFirstLine() == firstLine
                    && node.getLastLine() == lastLine) {
                return node;
            }
        }
        return null;
    }
}
