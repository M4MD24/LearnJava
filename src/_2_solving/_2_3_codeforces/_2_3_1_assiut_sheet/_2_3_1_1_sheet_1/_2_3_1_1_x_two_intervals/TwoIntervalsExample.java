package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_x_two_intervals;

import java.util.Scanner;

/**
 * <h1>X. Two Intervals</h1>
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
 * <h2>Given the boundaries of 2 intervals. Print the boundaries of their intersection.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>1 15 5 27</h2>
 * <h1>Output:</h1>
 * <h2>5 15</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>2 5 6 12</h2>
 * <h1>Output:</h1>
 * <h2>-1</h2>
 */

public class TwoIntervalsExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final int FIRST_NUMBER_INTERVAL_1 = Integer.parseInt(INPUT.next()),
                SECOND_NUMBER_INTERVAL_1 = Integer.parseInt(INPUT.next()),
                FIRST_NUMBER_INTERVAL_2 = Integer.parseInt(INPUT.next()),
                SECOND_NUMBER_INTERVAL_2 = Integer.parseInt(INPUT.next()),
                FIRST_INTERSECTION = Math.max(FIRST_NUMBER_INTERVAL_1, FIRST_NUMBER_INTERVAL_2),
                SECOND_INTERSECTION = Math.min(SECOND_NUMBER_INTERVAL_1, SECOND_NUMBER_INTERVAL_2);

        System.out.print((FIRST_INTERSECTION <= SECOND_INTERSECTION) ? FIRST_INTERSECTION + " " + SECOND_INTERSECTION : -1);
    }
}