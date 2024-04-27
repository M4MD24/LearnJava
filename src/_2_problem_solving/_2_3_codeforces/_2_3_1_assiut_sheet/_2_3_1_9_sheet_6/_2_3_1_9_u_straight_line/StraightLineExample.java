package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_u_straight_line;

import java.util.Scanner;

/**
 * <h1>U. Straight Line</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given three points on the Cartesian plane. Determine whether a single straight line can pass through these points or not.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 1 1
 * <br/>
 * 2 2
 * <br/>
 * 3 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 0 1
 * <br/>
 * -4 7
 * <br/>
 * 3 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 */

public class StraightLineExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int FIRST_NUMBER_FIRST_LINE = INPUT.nextInt(),
            FIRST_NUMBER_SECOND_LINE = INPUT.nextInt(),
            SECOND_NUMBER_FIRST_LINE = INPUT.nextInt(),
            SECOND_NUMBER_SECOND_LINE = INPUT.nextInt(),
            THIRD_NUMBER_FIRST_LINE = INPUT.nextInt(),
            THIRD_NUMBER_SECOND_LINE = INPUT.nextInt();

    public static void main(final String[] ARGS) {
        System.out.print((isStraightLine()) ? "YES" : "NO");
    }

    private static boolean isStraightLine() {
        int FIRST_LINE = (THIRD_NUMBER_SECOND_LINE - SECOND_NUMBER_SECOND_LINE) * (SECOND_NUMBER_FIRST_LINE - FIRST_NUMBER_FIRST_LINE),
                SECOND_LINE = (SECOND_NUMBER_SECOND_LINE - FIRST_NUMBER_SECOND_LINE) * (THIRD_NUMBER_FIRST_LINE - SECOND_NUMBER_FIRST_LINE);
        return FIRST_LINE == SECOND_LINE;
    }
}