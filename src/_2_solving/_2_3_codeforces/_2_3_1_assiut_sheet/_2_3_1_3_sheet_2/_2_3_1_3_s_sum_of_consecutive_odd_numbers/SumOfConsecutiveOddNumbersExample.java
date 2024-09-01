package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_s_sum_of_consecutive_odd_numbers;

import java.util.Scanner;

/**
 * <h1>S. Sum of Consecutive Odd Numbers</h1>
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
 * <h2>Given two numbers X and Y. Print the sum of all odd numbers between them, excluding X and Y.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 5 6
 * <br/>
 * 10 4
 * <br/>
 * 4 9
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 0
 * <br/>
 * 21
 * <br/>
 * 12
 * </h2>
 */
public class SumOfConsecutiveOddNumbersExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] ARGS) {
        final int LENGTH = INPUT.nextInt();
        inputValues(LENGTH);
    }

    private static void inputValues(int length) {
        while (length-- > 0) {
            final int NUMBER_1 = INPUT.nextInt(),
                    NUMBER_2 = INPUT.nextInt();
            calculateAndPrintSumOddNumbersBetweenTwoNumbers(NUMBER_1, NUMBER_2);
            if (length != 0) System.out.println();
        }
    }

    private static void calculateAndPrintSumOddNumbersBetweenTwoNumbers(final int NUMBER_1, final int NUMBER_2) {
        int sum = 0;
        final int MAXIMUM_NUMBER = Math.max(NUMBER_1, NUMBER_2);
        for (int number = Math.min(NUMBER_1, NUMBER_2) + 1; number < MAXIMUM_NUMBER; number++)
            if (number % 2 != 0) sum += number;
        System.out.print(sum);
    }
}