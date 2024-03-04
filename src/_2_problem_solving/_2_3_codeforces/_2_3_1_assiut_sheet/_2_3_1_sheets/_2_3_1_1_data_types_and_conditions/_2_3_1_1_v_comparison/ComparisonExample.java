package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_sheets._2_3_1_1_data_types_and_conditions._2_3_1_1_v_comparison;

import java.util.Scanner;

/**
 * <h1>V. Comparison</h1>
 * <h2>
 * time limit per test: 1 second
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
 * Given a comparison symbol S between two numbers A and B. Determine whether it is Right or Wrong.
 * <Br/>
 * The comparison is as follows: A < B, A > B, A = B.
 * <Br/>
 * Where A,B are two integer numbers and S refers to the sign between them.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 > 4</h2>
 * <h1>Output:</h1>
 * <h2>Right</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>9 < 1</h2>
 * <h1>Output:</h1>
 * <h2>Wrong</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4 = 4</h2>
 * <h1>Output:</h1>
 * <h2>Right</h2>
 */

public class ComparisonExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        final int FIRST_NUMBER = Integer.parseInt(INPUT.next());
        final String LOGICAL_OPERATOR = INPUT.next();
        final int SECOND_NUMBER = Integer.parseInt(INPUT.next());
        System.out.print(compareToNumbers(FIRST_NUMBER, LOGICAL_OPERATOR, SECOND_NUMBER));
    }

    private static String compareToNumbers(final int FIRST_NUMBER, final String LOGICAL_OPERATOR, final int SECOND_NUMBER) {
        switch (LOGICAL_OPERATOR) {
            case ">" -> {
                if (FIRST_NUMBER > SECOND_NUMBER) return "Right";
                else return "Wrong";
            }
            case "<" -> {
                if (FIRST_NUMBER < SECOND_NUMBER) return "Right";
                else return "Wrong";
            }
            case "=" -> {
                if (FIRST_NUMBER == SECOND_NUMBER) return "Right";
                else return "Wrong";
            }
            default -> {
                return "";
            }
        }
    }
}