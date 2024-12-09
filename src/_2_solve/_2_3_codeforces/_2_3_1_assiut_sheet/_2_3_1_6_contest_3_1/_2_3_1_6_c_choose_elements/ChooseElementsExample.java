package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_6_contest_3_1._2_3_1_6_c_choose_elements;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>C. Choose Elements</h1>
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
 * <h2>
 * You are given an array a of n integers, and an integer k
 * <br/>
 * You can choose at most k elements and get their summation.
 * <br/>
 * What is the maximum summation you can get?
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2 2
 * <br/>
 * 1 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>3</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2 1
 * <br/>
 * 1 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3 3
 * <br/>
 * 1 2 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>6</h2>
 */

public class ChooseElementsExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int LENGTH = INPUT.nextInt();
    private static int TARGET_NUMBER = INPUT.nextInt();
    private static final long[] NUMBERS = new long[LENGTH];

    public static void main(final String[] PARAMETERS) {
        inputValues();
        System.out.print(calculateSumOfLargestElements());
    }

    private static long calculateSumOfLargestElements() {
        Arrays.sort(NUMBERS);
        long sum = 0;
        int index = LENGTH;
        while (TARGET_NUMBER-- > 0) {
            if (NUMBERS[--index] < 0) break;
            sum += NUMBERS[index];
        }
        return sum;
    }

    private static void inputValues() {
        for (int index = 0; index < LENGTH; index++) NUMBERS[index] = INPUT.nextLong();
    }
}