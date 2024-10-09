package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_c_even_and_odd_and_positive_and_negative;

import java.util.Scanner;

/**
 * <h1>C. Even, Odd, Positive and Negative</h1>
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
 * <h2>Given N numbers. Count how many of these values are even, odd, positive and negative.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * -5 0 -3 -4 12
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * Even: 3
 * <br/>
 * Odd: 2
 * <br/>
 * Positive: 1
 * <br/>
 * Negative: 3
 * </h2>
 */

public class EvenAndOddAndPositiveAndNegativeExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static int sumEvenNumbers = 0,
            sumOddNumbers = 0,
            sumPositiveNumbers = 0,
            sumNegativeNumbers = 0;

    public static void main(final String[] PARAMETERS) {
        final int LENGTH = INPUT.nextInt();
        enterValues(LENGTH);
        printSumOfEvenAndOddAndPositiveAndNegativeNumbers();
    }

    private static void enterValues(final int LENGTH) {
        for (int index = 0; index < LENGTH; index++) {
            final int NUMBER = INPUT.nextInt();
            calculateSumOfEvenNumbers(NUMBER);
            calculateSumOfOddNumbers(NUMBER);
            calculateSumOfPositiveNumbers(NUMBER);
            calculateSumOfNegativeNumbers(NUMBER);
        }
    }

    private static void printSumOfEvenAndOddAndPositiveAndNegativeNumbers() {
        System.out.printf("Even: %d\nOdd: %d\nPositive: %d\nNegative: %d",
                sumEvenNumbers,
                sumOddNumbers,
                sumPositiveNumbers,
                sumNegativeNumbers);
    }

    private static void calculateSumOfNegativeNumbers(final int NUMBER) {
        if (NUMBER < 0) sumNegativeNumbers++;
    }

    private static void calculateSumOfPositiveNumbers(final int NUMBER) {
        if (NUMBER > 0) sumPositiveNumbers++;
    }

    private static void calculateSumOfOddNumbers(final int NUMBER) {
        if (NUMBER % 2 != 0) sumOddNumbers++;
    }

    private static void calculateSumOfEvenNumbers(final int NUMBER) {
        if (NUMBER % 2 == 0) sumEvenNumbers++;
    }
}