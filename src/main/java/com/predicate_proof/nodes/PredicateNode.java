package com.predicate_proof.nodes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author David Nickel
 */
public class PredicateNode extends Node{

    private final String predicateName;
    private List<VariableNode> parameter;

    public PredicateNode(String predicateName) {
        this.predicateName = predicateName;
    }

    public String getPredicateName() {
        return predicateName;
    }

    public List<VariableNode> getParameter() {
        return parameter;
    }

    public void setParameter(List<VariableNode> parameter) {
        this.parameter = parameter;
    }

    public void addParameter(VariableNode parameter) {
        if (this.parameter == null) {
            this.parameter = new ArrayList<>();
        }
        this.parameter.add(parameter);
    }

    public VariableNode getParameterByIndex(Integer index) {
        return parameter.get(index);
    }
}
