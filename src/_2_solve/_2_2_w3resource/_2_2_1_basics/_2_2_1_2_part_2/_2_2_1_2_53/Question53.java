package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_53;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the contiguous sub-array of given length k which has the maximum average value of a given array of integers. Display the maximum average value.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original array: [4, 2, 3, 3, 7, 2, 4]
 * <br/>
 * Sub-array number: 3
 * <br/>
 * Maximum average value: 4.333333333333333
 * </h2>
 */

public class Question53 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {4, 2, 3, 3, 7, 2, 4};
        final int SUB_ARRAY_NUMBER = 3;
        System.out.printf("Original array: %s", Arrays.toString(NUMBERS));
        System.out.printf("Sub-array number: %d", SUB_ARRAY_NUMBER);
        System.out.printf("Maximum average value: %f", getMaximumAverageValue(NUMBERS, SUB_ARRAY_NUMBER));
    }

    private static double getMaximumAverageValue(final int[] NUMBERS, final int SUB_ARRAY_NUMBER) {
        double maximumAverageValue = 0;
        for (int startIndex = 0, endIndex = SUB_ARRAY_NUMBER; endIndex < NUMBERS.length; startIndex++, endIndex++) {
            int currentSum = 0;
            for (int index = startIndex; index < endIndex; index++)
                currentSum += NUMBERS[index];
            final double CURRENT_AVERAGE = (double) currentSum / SUB_ARRAY_NUMBER;
            if (CURRENT_AVERAGE > maximumAverageValue) maximumAverageValue = CURRENT_AVERAGE;
        }
        return maximumAverageValue;
    }
}