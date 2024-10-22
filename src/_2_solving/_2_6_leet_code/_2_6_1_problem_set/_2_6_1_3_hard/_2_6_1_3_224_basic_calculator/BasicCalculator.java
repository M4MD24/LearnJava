package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_3_hard._2_6_1_3_224_basic_calculator;

import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().</h2>
 */

public class BasicCalculator {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "(1+(4+5+2)-3)+(6+8)";
        System.out.print(calculate(TEXT));
    }

    private static int calculate(final String TEXT) {
        int result = 0,
                number = 0,
                sign = 1;
        final Stack<Integer> ELEMENTS = new Stack<>();
        for (final char CHARACTER : TEXT.toCharArray())
            if (Character.isDigit(CHARACTER))
                number = number * 10 + (CHARACTER - '0');
            else if (CHARACTER == '+' || CHARACTER == '-') {
                result += sign * number;
                number = 0;
                sign = (CHARACTER == '+')
                        ? 1
                        : -1;
            } else if (CHARACTER == '(') {
                ELEMENTS.push(result);
                ELEMENTS.push(sign);
                result = 0;
                sign = 1;
            } else if (CHARACTER == ')') {
                result += sign * number;
                result *= ELEMENTS.pop();
                result += ELEMENTS.pop();
                number = 0;
            }
        return result + sign * number;
    }
}