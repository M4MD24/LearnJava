package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_v_two_Lines;

import java.util.Scanner;

/**
 * <h1>V. Two Lines</h1>
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
 * <h1>Problem:</h1>
 * <h2>Given two lines L1 and L2, Determine whether they are parallel or not.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 1 1 10 1
 * <br/>
 * 1 2 10 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 10 0 0 10
 * <br/>
 * 0 0 10 10
 * </h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 */

public class TwoLinesExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final short FIRST_NUMBER_FIRST_LINE = INPUT.nextShort(),
            FIRST_NUMBER_SECOND_LINE = INPUT.nextShort(),
            SECOND_NUMBER_FIRST_LINE = INPUT.nextShort(),
            SECOND_NUMBER_SECOND_LINE = INPUT.nextShort(),
            THIRD_NUMBER_FIRST_LINE = INPUT.nextShort(),
            THIRD_NUMBER_SECOND_LINE = INPUT.nextShort(),
            FOURTH_NUMBER_FIRST_LINE = INPUT.nextShort(),
            FOURTH_NUMBER_SECOND_LINE = INPUT.nextShort();

    public static void main(final String[] PARAMETERS) {
        System.out.print((isParallel()) ? "YES" : "NO");
    }

    private static boolean isParallel() {
        final short FIRST_DELTA_FIRST_LINE = (short) (SECOND_NUMBER_FIRST_LINE - FIRST_NUMBER_FIRST_LINE),
                FIRST_DELTA_SECOND_LINE = (short) (SECOND_NUMBER_SECOND_LINE - FIRST_NUMBER_SECOND_LINE),
                SECOND_DELTA_FIRST_LINE = (short) (FOURTH_NUMBER_FIRST_LINE - THIRD_NUMBER_FIRST_LINE),
                SECOND_DELTA_SECOND_LINE = (short) (FOURTH_NUMBER_SECOND_LINE - THIRD_NUMBER_SECOND_LINE);
        return FIRST_DELTA_FIRST_LINE * SECOND_DELTA_SECOND_LINE == SECOND_DELTA_FIRST_LINE * FIRST_DELTA_SECOND_LINE;
    }
}