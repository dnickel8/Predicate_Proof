package nodes;

public class VariableNode extends Node{
    private String variable;

    public VariableNode(String name, String variable) {
        super(name);
        this.variable = variable;
    }

    public String getVariable() {
        return variable;
    }
}
