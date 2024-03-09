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
            SPLIT = INPUT.nextInt(),
            MINIMUMS_NUMBERS_LENGTH = (int) Math.ceil((double) LENGTH / SPLIT);
    private static final long[] NUMBERS = new long[LENGTH];

    public static void main(String[] args) {
        inputValues();
        splitAndGetMinimumsNumbers();
    }

    private static void splitAndGetMinimumsNumbers() {
        int minimumNumbersIndex = -1,
                stoppedAt = 0;
        for (int round = 0; round < LENGTH; round++) {
            if ((round + 1) % SPLIT == 0 && round != 0) {
                minimumNumbersIndex++;
                long minimumNumber = NUMBERS[stoppedAt];
                while (stoppedAt <= round) {
                    if (NUMBERS[stoppedAt] < minimumNumber) minimumNumber = NUMBERS[stoppedAt];
                    stoppedAt++;
                }
                System.out.print(minimumNumber + " ");
            }
        }
        if (minimumNumbersIndex != MINIMUMS_NUMBERS_LENGTH - 1) {
            long minimumNumber = NUMBERS[stoppedAt];
            while (stoppedAt < LENGTH) {
                if (NUMBERS[stoppedAt] < minimumNumber) minimumNumber = NUMBERS[stoppedAt];
                stoppedAt++;
            }
            System.out.print(minimumNumber);
        }
    }

    private static void inputValues() {
        for (int index = 0; index < NUMBERS.length; index++) NUMBERS[index] = INPUT.nextLong();
    }
}