package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_4_contest_2._2_3_1_4_e_hady_rides_the_train;

import java.util.Scanner;

/**
 * <h1>E. Hady Rides the Train</h1>
 * <h2>
 * time limit per test: 0.5 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Hady wants to ride a train. He knows his seat number, but he doesn't know the corresponding row or column number of his seat. However, he knows that each row consists of exactly 4 seats. The train seats are numbered from zero as shown in the (Figure 1):</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5</h2>
 * <h1>Output:</h1>
 * <h2>1 2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>2</h2>
 * <h1>Output:</h1>
 * <h2>0 2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>0</h2>
 * <h1>Output:</h1>
 * <h2>0 0</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>13</h2>
 * <h1>Output:</h1>
 * <h2>3 2</h2>
 *
 * @see _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_4_contest_2._2_3_1_4_e_hady_rides_the_train.images <h2>Figure 1</h2>
 */

public class HadyRidesTheTrainExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final long SEAT = INPUT.nextLong();

    public static void main(final String[] ARGS) {
        final long row = SEAT / 4,
                column = (row % 2 == 0) ? SEAT % 4 : 3 - (SEAT % 4);
        System.out.print(row + " " + column);
    }
}