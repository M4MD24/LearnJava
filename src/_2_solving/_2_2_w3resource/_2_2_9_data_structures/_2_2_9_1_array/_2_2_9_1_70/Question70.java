package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_70;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program to find the smallest length of a contiguous sub-array of which the sum is greater than or equal to a specified value.
 * <br/>
 * Return 0 instead.
 * </h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Numbers = {1, 2, 3, 4, 6}</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Minimum length of a contiguous sub-array of which the sum is 8,0
 * </h2>
 */

public class Question70 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 2, 3, 4, 6};
        final int SPECIFIED_NUMBER = 8;
        System.out.println(Arrays.toString(NUMBERS));
        System.out.printf("Minimum length of a contiguous sub-array of which the sum is %d,%d",
                SPECIFIED_NUMBER,
                getMinimumLengthOfContiguousSubArray(NUMBERS, SPECIFIED_NUMBER));
    }

    private static int getMinimumLengthOfContiguousSubArray(final int[] NUMBERS, final int SPECIFIED_NUMBER) {
        int minimumLength = 0;
        int countOfLength = 2;
        while (countOfLength <= NUMBERS.length) {
            for (int startIndex = 0, stopIndex = countOfLength; stopIndex <= NUMBERS.length; startIndex++, stopIndex++) {
                final int[] CURRENT_CONTIGUOUS_SUB_ARRAY = Arrays.copyOfRange(
                        NUMBERS,
                        startIndex,
                        stopIndex
                );
                final int CURRENT_SUM_OF_SUB_ARRAY = Arrays.stream(
                        CURRENT_CONTIGUOUS_SUB_ARRAY
                ).sum();
                if (CURRENT_SUM_OF_SUB_ARRAY == SPECIFIED_NUMBER)
                    minimumLength = CURRENT_CONTIGUOUS_SUB_ARRAY.length;
            }
            countOfLength++;
        }
        return minimumLength;
    }
}