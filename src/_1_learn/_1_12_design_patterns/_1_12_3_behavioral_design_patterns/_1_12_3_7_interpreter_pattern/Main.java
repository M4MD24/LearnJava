package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_7_interpreter_pattern;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_7_interpreter_pattern.operators.Add;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_7_interpreter_pattern.operators.Subtract;

public class Main {
    public static void main(final String[] PARAMETERS) {
        Expression expression = new Add(
                new Number(5),
                new Subtract(new Number(10),
                        new Number(3)
                )
        );
        System.out.print(expression.interpret());
    }
}