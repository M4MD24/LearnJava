package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_c_sum_of_range;

import java.util.Scanner;

/**
 * <h1>C. Sum of Range</h1>
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
 * <h1>Problem:</h1>
 * <h2>Given 2 numbers A and B. Print three lines that contain the following respectively:</h2>
 * <ul>
 *     <li>summation of all numbers between A and B (inclusive).</li>
 *     <li>summation of even numbers between A and B (inclusive).</li>
 *     <li>summation of odd numbers between A and B (inclusive).</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4 6</h2>
 * <h1>Output:</h1>
 * <h2>
 * 15
 * <br/>
 * 10
 * <br/>
 * 5
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>7 1</h2>
 * <h1>Output:</h1>
 * <h2>
 * 28
 * <br/>
 * 12
 * <br/>
 * 16
 * </h2>
 */

public class SumOfRangeExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        printSummations(INPUT.nextInt(), INPUT.nextInt());
    }

    private static void printSummations(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            firstNumber += secondNumber;
            secondNumber = firstNumber - secondNumber;
            firstNumber -= secondNumber;
        }
        System.out.println(summationOfAllFromMinimumNumberToMaximumNumberInclusive(firstNumber, secondNumber));
        System.out.println(summationOfEvenFromMinimumNumberToMaximumNumberInclusive(firstNumber, secondNumber));
        System.out.print(summationOfOddFromMinimumNumberToMaximumNumberInclusive(firstNumber, secondNumber));
    }

    private static long summationOfAllFromMinimumNumberToMaximumNumberInclusive(final int MINIMUM_NUMBER, final int MAXIMUM_NUMBER) {
        return (long) ((MAXIMUM_NUMBER - MINIMUM_NUMBER) + 1) * (MINIMUM_NUMBER + MAXIMUM_NUMBER) / 2;
    }

    private static long summationOfEvenFromMinimumNumberToMaximumNumberInclusive(final int MINIMUM_NUMBER, final int MAXIMUM_NUMBER) {
        return summationOfEvenFromZeroToTargetNumber(MAXIMUM_NUMBER / 2) -
                summationOfEvenFromZeroToTargetNumber((MINIMUM_NUMBER - 1) / 2);
    }

    private static long summationOfEvenFromZeroToTargetNumber(final int TARGET_NUMBER) {
        return TARGET_NUMBER * (TARGET_NUMBER + 1L);
    }

    private static long summationOfOddFromMinimumNumberToMaximumNumberInclusive(final int MINIMUM_NUMBER, final int MAXIMUM_NUMBER) {
        return summationOfOddFromZeroToTargetNumber(MAXIMUM_NUMBER) -
                summationOfOddFromZeroToTargetNumber(MINIMUM_NUMBER - 1);
    }

    private static long summationOfOddFromZeroToTargetNumber(final int TARGET_NUMBER) {
        return (long) ((TARGET_NUMBER + 1) / 2) * ((TARGET_NUMBER + 1) / 2);
    }
}