package com.predicate_proof.nodes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author David Nickel
 */
public abstract class Node {

    private List<Node> children = new ArrayList<>();

    public Node(List<Node> children) {
        this.children = children;
    }

    public Node() {
    }


    public void addChild(Node child){
        this.children.add(child);
    };

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public Node getChild(int number) {
        return children.get(number);
    }

    public int getChildCount() {
        return children.size();
    }
}
