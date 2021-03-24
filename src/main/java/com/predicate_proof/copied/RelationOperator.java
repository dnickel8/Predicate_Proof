/**
 * 
 */
package com.predicate_proof.copied;

/**
 * @author Nils Dralle
 *
 */
public enum RelationOperator implements IOperator{
	EQ("=","eq"), GT(">","gt"), LT("<","lt"), GE(">=","ge"), LE("<=","le"), NE("<>","ne"),
	IMPLICATION("->", "to"), AND("and","wedge"),OR("v","vee"),ALLQUANTOR("forall","forall"),
	EXISTQUANTOR("exists","exists"),EQUIVALENZ("equivalenz","leftrightarrow"),NOT("not","neg");
	private String operator;
	private String functionForm;
	
	private RelationOperator(String operator, String functionForm) {
		this.operator=operator;
		this.functionForm=functionForm;
	}
	
	public String getOperator() {
		return operator;
	}
	public String getFunctionForm() {
		return functionForm;
	}
	
}
