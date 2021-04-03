package com.predicate_proof.nodes;

/**
 * Line consists of a formula, a rule and sometimes a declared variable
 * @author David Nickel
 */
public class LineNode extends Node{

    private final int linenumber;
    private Node rule;
    private Node formula;
    private boolean withVariableSymbol = false;
    private String variableSymbol;

    public LineNode(int linenumber) {
        this.linenumber = linenumber;
    }

    public LineNode(int linenumber, boolean withVariableSymbol, String variableSymbol) {
        this.linenumber = linenumber;
        this.withVariableSymbol = withVariableSymbol;
        this.variableSymbol = variableSymbol;
    }

    public int getLinenumber() {
        return linenumber;
    }

    public Node getRule() {
        return rule;
    }

    public void setRule(RuleNode rule) {
        this.rule = rule;
    }

    public Node getFormula() {
        return formula;
    }

    public void setFormula(Node formula) {
        this.formula = formula;
    }

    public void setRule(Node rule) {
        this.rule = rule;
    }

    public boolean isWithVariableSymbol() {
        return withVariableSymbol;
    }

    public String getVariableSymbol() {
        return variableSymbol;
    }

}
