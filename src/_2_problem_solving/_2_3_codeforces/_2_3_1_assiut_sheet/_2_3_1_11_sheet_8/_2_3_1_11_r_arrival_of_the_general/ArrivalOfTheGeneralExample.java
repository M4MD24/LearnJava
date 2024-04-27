package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_r_arrival_of_the_general;

import java.util.Scanner;

/**
 * <h1>R. Arrival of the General</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>
 * A Ministry for Defense sent a general to inspect the Super Secret Military Squad under the command of the Colonel SuperDuper. Having learned the news, the colonel ordered to all n squad soldiers to line up on the parade ground.
 * <br/>
 * By the military charter the soldiers should stand in the order of non-increasing of their height. But as there's virtually no time to do that, the soldiers lined up in the arbitrary order. However, the general is rather short-sighted and he thinks that the soldiers lined up correctly if the first soldier in the line has the maximum height and the last soldier has the minimum height. Please note that the way other solders are positioned does not matter, including the case when there are several soldiers whose height is maximum or minimum. Only the heights of the first and the last soldier are important.
 * <br/>
 * For example, the general considers the sequence of heights (4, 3, 4, 2, 1, 1) correct and the sequence (4, 3, 1, 2, 2) wrong.
 * <br/>
 * Within one second the colonel can swap any two neighboring soldiers. Help him count the minimum time needed to form a line-up which the general will consider correct.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 33 44 11 22
 * </h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 7
 * <br/>
 * 10 10 58 31 63 40 76
 * </h2>
 * <h1>Output:</h1>
 * <h2>10</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first sample the colonel will need to swap the first and second soldier and then the third and fourth soldier. That will take 2 seconds. The resulting position of the soldiers is (44, 33, 22, 11).
 * <br/>
 * In the second sample the colonel may swap the soldiers in the following sequence:
 * </h2>
 * <ol>
 *     <li>(10, 10, 58, 31, 63, 40, 76)</li>
 *     <li>(10, 58, 10, 31, 63, 40, 76)</li>
 *     <li>(10, 58, 10, 31, 63, 76, 40)</li>
 *     <li>(10, 58, 10, 31, 76, 63, 40)</li>
 *     <li>(10, 58, 31, 10, 76, 63, 40)</li>
 *     <li>(10, 58, 31, 76, 10, 63, 40)</li>
 *     <li>(10, 58, 31, 76, 63, 10, 40)</li>
 *     <li>(10, 58, 76, 31, 63, 10, 40)</li>
 *     <li>(10, 76, 58, 31, 63, 10, 40)</li>
 *     <li>(76, 10, 58, 31, 63, 10, 40)</li>
 *     <li>(76, 10, 58, 31, 63, 40, 10)</li>
 * </ol>
 */

public class ArrivalOfTheGeneralExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int LENGTH = INPUT.nextInt();
    private static int minimumNumberIndex = 0,
            maximumNumberIndex = 0,
            minimumNumber = 101,
            maximumNumber = 0;

    public static void main(final String[] ARGS) {
        inputValues();
        System.out.print(getSumMovements());
    }

    private static int getSumMovements() {
        final int LENGTH = ArrivalOfTheGeneralExample.LENGTH - 1;
        return minimumNumberIndex < maximumNumberIndex
                ? LENGTH - minimumNumberIndex + (maximumNumberIndex - 1)
                : LENGTH - minimumNumberIndex + maximumNumberIndex;
    }

    private static void inputValues() {
        minimumNumber = maximumNumber = INPUT.nextInt();
        for (int index = 1; index < LENGTH; index++) {
            final int CURRENT_VALUE = INPUT.nextInt();
            isMinimum(CURRENT_VALUE, index);
            isMaximum(CURRENT_VALUE, index);
        }
    }

    private static void isMaximum(final int CURRENT_VALUE, final int INDEX) {
        if (CURRENT_VALUE > maximumNumber) {
            maximumNumber = CURRENT_VALUE;
            maximumNumberIndex = INDEX;
        }
    }

    private static void isMinimum(final int CURRENT_VALUE, final int INDEX) {
        if (CURRENT_VALUE <= minimumNumber) {
            minimumNumber = CURRENT_VALUE;
            minimumNumberIndex = INDEX;
        }
    }
}