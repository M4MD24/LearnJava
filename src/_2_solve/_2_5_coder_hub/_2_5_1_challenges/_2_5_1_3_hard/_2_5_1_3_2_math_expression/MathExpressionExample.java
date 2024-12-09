package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_3_hard._2_5_1_3_2_math_expression;

import java.util.Scanner;

public class MathExpressionExample {
    public static void main(final String[] PARAMETERS) {
        System.out.print("expr= ");
        final String MATH_EXPRESSION = new Scanner(System.in).next();
        System.out.print(mathExpression(MATH_EXPRESSION));
    }

    public static boolean mathExpression(final String MATH_EXPRESSION) {
        return MATH_EXPRESSION.matches("\\d+[-+*/]\\d+");
    }
}