package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_sheets._2_3_1_1_data_types_and_conditions._2_3_1_1_w_mathematical_exepression;

import java.util.Scanner;

/**
 * <h1>W. Mathematical Expression</h1>
 * <h2>
 * time limit per test: 0.25 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input standard input
 * <br/>
 * output standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>
 * Given a mathematical expression. The expression will be one of the following expressions: A+B=C, A-B=C and A*B=C
 * <br/>
 * where A,B,C are three numbers, S is the sign between A and B, and Q the '=' sign
 * <br/>
 * Print "Yes" If the expression is Right , Otherwise print the right answer of the expression.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 + 10 = 15</h2>
 * <h1>Output:</h1>
 * <h2>Yes</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3 - 1 = 2</h2>
 * <h1>Output:</h1>
 * <h2>Yes</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>2 * 10 = 19</h2>
 * <h1>Output:</h1>
 * <h2>20</h2>
 */

public class MathematicalExpressionExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        final int FIRST_NUMBER = Integer.parseInt(INPUT.next());
        final String ARITHMETIC_OPERATOR = INPUT.next();
        final int SECOND_NUMBER = Integer.parseInt(INPUT.next());
        INPUT.next();
        final int MANUAL_RESULT = Integer.parseInt(INPUT.next());
        System.out.print(compareToNumbers(FIRST_NUMBER, ARITHMETIC_OPERATOR, SECOND_NUMBER, MANUAL_RESULT));
    }

    private static String compareToNumbers(final int FIRST_NUMBER, final String ARITHMETIC_OPERATOR, final int SECOND_NUMBER, int MANUAL_RESULT) {
        switch (ARITHMETIC_OPERATOR) {
            case "+" -> {
                int RESULT = FIRST_NUMBER + SECOND_NUMBER;
                if (MANUAL_RESULT == RESULT) return "Yes";
                else return String.valueOf(RESULT);
            }
            case "-" -> {
                int RESULT = FIRST_NUMBER - SECOND_NUMBER;
                if (MANUAL_RESULT == RESULT) return "Yes";
                else return String.valueOf(RESULT);
            }
            case "*" -> {
                int RESULT = FIRST_NUMBER * SECOND_NUMBER;
                if (MANUAL_RESULT == RESULT) return "Yes";
                else return String.valueOf(RESULT);
            }
            default -> {
                return "";
            }
        }
    }
}