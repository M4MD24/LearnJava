package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_i_smallest_pair;

import java.util.Scanner;

/**
 * <h1>I. Smallest Pair</h1>
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
 * <h2>Given a number N and an array A of N numbers. Print the smallest possible result of Ai + Aj + j - i , where 1 ≤ i < j ≤ N.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 1
 * <br/>
 * 4
 * <br/>
 * 20 1 9 4
 * </h2>
 * <h1>Output:</h1>
 * <h2>7</h2>
 */

public class SmallestPairExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static int countOfTestCases = INPUT.nextInt(),
            length;
    private static int[] values;

    public static void main(final String[] PARAMETERS) {
        while (countOfTestCases-- > 0) {
            inputValues();
            System.out.println(smallestPairSum());
        }
    }

    private static void inputValues() {
        length = INPUT.nextInt();
        values = new int[length];
        for (int index = 0; index < length; index++) values[index] = INPUT.nextInt();
    }

    static int smallestPairSum() {
        int round = 0,
                index = round + 1,
                minimumSum = values[round] + values[index] + (index - round);
        index++;
        while (round < length - 1) {
            while (index < length) {
                final int CURRENT_SUM = values[round] + values[index] + (index - round);
                if (CURRENT_SUM < minimumSum) minimumSum = CURRENT_SUM;
                index++;
            }
            round++;
            index = round + 1;
        }
        return minimumSum;
    }
}