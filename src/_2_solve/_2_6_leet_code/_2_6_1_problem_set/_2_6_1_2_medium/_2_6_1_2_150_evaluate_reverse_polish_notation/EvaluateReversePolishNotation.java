package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_150_evaluate_reverse_polish_notation;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
 * <br/>
 * <br/>
 * Evaluate the expression. Return an integer that represents the value of the expression.
 * </h2>
 * <br/>
 * <br/>
 * <h1>Note:</h1>
 * <ul>
 * <li>The valid operators are '+', '-', '*', and '/'.</li>
 * <li>Each operand may be an integer or another expression.</li>
 * <li>The division between two integers always truncates toward zero.</li>
 * <li>There will not be any division by zero.</li>
 * <li>The input represents a valid arithmetic expression in a reverse polish notation.</li>
 * <li>The answer and all the intermediate calculations can be represented in a 32-bit integer.</li>
 * </ul>
 */

public class EvaluateReversePolishNotation {
    public static void main(final String[] PARAMETERS) {
        System.out.print(evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

    private static int evalRPN(final String[] TOKENS) {
        final int[] ELEMENTS = new int[TOKENS.length];
        int index = -1;
        for (final String TOKEN : TOKENS)
            switch (TOKEN) {
                case "+" -> ELEMENTS[--index] += ELEMENTS[index + 1];
                case "-" -> ELEMENTS[--index] -= ELEMENTS[index + 1];
                case "*" -> ELEMENTS[--index] *= ELEMENTS[index + 1];
                case "/" -> ELEMENTS[--index] /= ELEMENTS[index + 1];
                default -> ELEMENTS[++index] = Integer.parseInt(TOKEN);
            }
        return ELEMENTS[0];
    }

// >
//    private static int evalRPN(final String[] TOKENS) {
//        final int[] ELEMENTS = new int[TOKENS.length];
//        int index = -1;
//        for (final String TOKEN : TOKENS) {
//            if ("+-*/".contains(TOKEN)) {
//                int b = ELEMENTS[index--];
//                int a = ELEMENTS[index];
//                switch (TOKEN) {
//                    case "+" -> ELEMENTS[index] = a + b;
//                    case "-" -> ELEMENTS[index] = a - b;
//                    case "*" -> ELEMENTS[index] = a * b;
//                    case "/" -> {
//                        if (b == 0)
//                            throw new ArithmeticException("Division by zero");
//                        ELEMENTS[index] = a / b;
//                    }
//                }
//            } else
//                ELEMENTS[++index] = Integer.parseInt(TOKEN);
//        }
//        return ELEMENTS[0];
//    }
}