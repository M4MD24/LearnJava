package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_4_contest_2._2_3_1_2_c_finding_minimums;

import java.util.Scanner;

/**
 * <h1>C. Finding Minimums</h1>
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
            SPLIT = INPUT.nextInt();

    public static void main(String[] args) {
        inputAndSplitAndGetMinimumsNumbers();
    }

    private static void inputAndSplitAndGetMinimumsNumbers() {
        if (SPLIT > 1) {
            long minimumNumber = INPUT.nextLong(),
                    minimumsNumbersIndex = 0,
                    index = 1;
            boolean smallSplitCondition = LENGTH % SPLIT == 0;
            for (; index < LENGTH; index++) {
                final long ANOTHER_NUMBER = INPUT.nextLong();
                if (ANOTHER_NUMBER < minimumNumber) minimumNumber = ANOTHER_NUMBER;
                if (((smallSplitCondition) ? index + 2 : index + 1) % SPLIT == 0 && index != 0) {
                    System.out.print(minimumNumber + " ");
                    minimumsNumbersIndex++;
                    if (minimumsNumbersIndex < Math.ceil((double) LENGTH / SPLIT)) {
                        minimumNumber = INPUT.nextLong();
                        index++;
                    }
                }
            }
            if (minimumsNumbersIndex != Math.ceil((double) LENGTH / SPLIT)) System.out.print(minimumNumber);
        } else if (LENGTH > 0) {
            for (int index = 0; index < LENGTH; index++) {
                final long MINIMUM_NUMBER = INPUT.nextLong();
                System.out.print(MINIMUM_NUMBER + " ");
            }
        }
    }
}