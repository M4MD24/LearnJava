package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_k_max_number;

import java.util.Scanner;

/**
 * <h1>K. Max Number</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a number N and an array A of N numbers. Print the maximum value in this array.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 1 -3 5 4 -6
 * </h2>
 * <h1>Output:</h1>
 * <h2>5</h2>
 */

public class MaxNumberExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static short targetNumber = INPUT.nextShort();
    private static int maximumNumber = INPUT.nextInt();

    public static void main(final String[] ARGS) {
        System.out.print(inputValuesRecursion(maximumNumber));
    }

    private static long inputValuesRecursion(final int CURRENT_NUMBER) {
        if (targetNumber-- > 1) return isMaximumNumber(CURRENT_NUMBER);
        else return maximumNumber;
    }

    private static long isMaximumNumber(final int CURRENT_NUMBER) {
        if (CURRENT_NUMBER > maximumNumber) maximumNumber = CURRENT_NUMBER;
        return inputValuesRecursion(INPUT.nextInt());
    }
}