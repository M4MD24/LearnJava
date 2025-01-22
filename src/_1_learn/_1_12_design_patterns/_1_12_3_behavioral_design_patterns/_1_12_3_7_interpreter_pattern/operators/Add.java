package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_7_interpreter_pattern.operators;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_7_interpreter_pattern.Expression;

public class Add implements Expression {
    private final Expression left, right;

    public Add(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret() {
        return left.interpret() + right.interpret();
    }
}