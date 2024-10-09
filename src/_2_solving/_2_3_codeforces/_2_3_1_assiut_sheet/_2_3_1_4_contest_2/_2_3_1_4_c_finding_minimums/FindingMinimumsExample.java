package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_4_contest_2._2_3_1_4_c_finding_minimums;

import java.util.Scanner;

/**
 * <h1>C. Finding Minimums</h1>
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
 * <h2>You are given N numbers, and you should divide them into consecutive groups of size K, then print the minimum among each group. If the last group is of size < K, print the minimum number found just after the last number received.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 8 3
 * <br/>
 * 4 -1 2 3 5 0 2 7
 * </h2>
 * <h1>Output:</h1>
 * <h2>-1 0 2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 8 4
 * <br/>
 * 4 -1 2 3 5 0 2 7
 * </h2>
 * <h1>Output:</h1>
 * <h2>-1 0</h2>
 */

public class FindingMinimumsExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int LENGTH = INPUT.nextInt(),
            SPLIT_AT = INPUT.nextInt();

    public static void main(final String[] PARAMETERS) {
        int minimumNumber = 0,
                flag = 1,
                counter = 0;
        for (int index = 1; index <= LENGTH; index++) {
            int CURRENT_VALUE = INPUT.nextInt();
            if (flag > 0) {
                minimumNumber = CURRENT_VALUE;
                flag = 0;
            } else if (CURRENT_VALUE < minimumNumber) minimumNumber = CURRENT_VALUE;
            counter++;
            if (counter == SPLIT_AT || index == LENGTH) {
                System.out.print(minimumNumber);
                if (index != LENGTH) System.out.print(" ");
                counter = 0;
                flag = 1;
            }
        }
    }
}