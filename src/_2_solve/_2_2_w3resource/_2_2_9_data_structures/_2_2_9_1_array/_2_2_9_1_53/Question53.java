package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_53;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to replace every element with the next greatest element (from the right side) in a given array of integers.
 * <br/>
 * There is no element next to the last element, therefore replace it with -1.
 * </h2>
 */

public class Question53 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {16, 17, 4, 3, 5, 2};
        System.out.println(Arrays.toString(NUMBERS));
        replaceEveryNumbersWithNextGreatestNumbers(NUMBERS);
        System.out.print(Arrays.toString(NUMBERS));
    }

    private static void replaceEveryNumbersWithNextGreatestNumbers(final int[] NUMBERS) {
        final int LENGTH_OF_NUMBERS = NUMBERS.length;
        int maximumFromRightNumbers = NUMBERS[LENGTH_OF_NUMBERS - 1];
        NUMBERS[LENGTH_OF_NUMBERS - 1] = -1;
        for (int index = LENGTH_OF_NUMBERS - 2; index > 0; index--) {
            final int TEMPORARY_NUMBER = NUMBERS[index];
            NUMBERS[index] = maximumFromRightNumbers;
            if (maximumFromRightNumbers < TEMPORARY_NUMBER)
                maximumFromRightNumbers = TEMPORARY_NUMBER;
        }
    }
}
/*
[45, 20, 100, 23, -5, 2, -6]
[100, 100, 23, 2, 2, -6, -1]

Write a Java program
to replace every element with the next greatest element
(from the right side)
in a given array of integers.
There is no element next to the last element,
therefore replace it with -1.

0 - {16, 17, 4, 3, 5, 2}
1 - {16, 17, 4, 3, 5, -1}
2 - {16, 17, 4, 3, 5, -1}
3 - {16, 17, 4, 5, 5, -1}
4 - {16, 17, 5, 5, 5, -1}
5 - {16, 5, 5, 5, 5, -1}
6 - {17, 5, 5, 5, 5, -1}
*/