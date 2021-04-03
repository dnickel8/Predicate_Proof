package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.FormulaNode;
import com.predicate_proof.nodes.Node;
import com.predicate_proof.nodes.UnaryOperatorNode;

import java.text.Normalizer;

/**
 * \ll
 *      1 p \wedge q \mid premise \\
 *      2 q \mid \wedge e2 1 \\
 * \gg
 * @author David Nickel
 * @version 1.0 24/03/2021
 */
public class AndEliRule extends Rule {

    public boolean check(boolean ruleNumber,
                         Node beforeFormula, //ehemals FormulaNode
                         Node afterFormula) {

        while (true) {
            if (beforeFormula instanceof FormulaNode) {
                FormulaNode beforeFormula2 = (FormulaNode) beforeFormula;
                if (beforeFormula2.getOperator() == RelationOperator.AND) {
                    if (ruleNumber) { //there are two rules for and elimination
                        return equals(beforeFormula2.getLeftExpression(), afterFormula);
                    } else {
                        return equals(beforeFormula2.getRightExpression(), afterFormula);
                    }
                } else if(afterFormula instanceof FormulaNode){
                    if(check(ruleNumber,beforeFormula2.getLeftExpression(),((FormulaNode) afterFormula).getLeftExpression())) {
                        return equals(beforeFormula2.getRightExpression(),((FormulaNode) afterFormula).getRightExpression());
                    } else if(check(ruleNumber,beforeFormula2.getRightExpression(),((FormulaNode) afterFormula).getRightExpression())){
                        return equals(beforeFormula2.getLeftExpression(), ((FormulaNode) afterFormula).getLeftExpression());
                    }
                }
            } else if (beforeFormula instanceof UnaryOperatorNode && afterFormula instanceof UnaryOperatorNode) {
                return check(ruleNumber, ((UnaryOperatorNode) beforeFormula).getExpression(), ((UnaryOperatorNode) afterFormula).getExpression());
            }
        }

        //FormulaNode node = beforeFormula.searchOperator(RelationOperator.AND);
       /* if (beforeFormula.getOperator() != RelationOperator.AND) {
            return false;
        }

        if (ruleNumber) { //there are two rules for and elimination
            return equals(beforeFormula.getLeftExpression(), afterFormula);
        } else {
            return equals(beforeFormula.getRightExpression(), afterFormula);
        }*/


    }

    /*public FormulaNode searchOperator(RelationOperator operator) {
        if (this.operator == operator) {
            return this;
        } else {
            FormulaNode node = new FormulaNode();
            if((node = ((FormulaNode) leftExpression).searchOperator(operator)) != null) {
                return node;
            } else if ((node = ((FormulaNode) rightExpression).searchOperator(operator)) != null) {
                return node;
            } else {
                return null;
            }
        }
    }*/

}
