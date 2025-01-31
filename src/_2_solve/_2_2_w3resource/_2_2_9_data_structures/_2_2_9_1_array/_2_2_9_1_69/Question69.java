package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_69;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the minimum sub-array sum of specified size in a given array of integers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Sub-array size: 4
 * <br/>
 * Sub-array from 0 to 3 and sum is: 10
 * </h2>
 */

public class Question69 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int SPECIFIED_SIZE = 4;
        System.out.println(Arrays.toString(NUMBERS));
        System.out.println("Sub-array size: " + SPECIFIED_SIZE);
        printMinimumSumOfSubArray(NUMBERS, SPECIFIED_SIZE);
    }

    private static void printMinimumSumOfSubArray(final int[] NUMBERS, final int SPECIFIED_SIZE) {
        int startIndexOfMinimumSumSubArray = 0,
                stopIndexOfMinimumSumSubArray = SPECIFIED_SIZE;
        int minimumSumOfSubArray = Arrays.stream(
                Arrays.copyOfRange(
                        NUMBERS,
                        startIndexOfMinimumSumSubArray,
                        stopIndexOfMinimumSumSubArray)
        ).sum();
        for (int currentStartIndex = startIndexOfMinimumSumSubArray, currentStopIndex = stopIndexOfMinimumSumSubArray;
             currentStopIndex <= NUMBERS.length;
             currentStartIndex++, currentStopIndex++) {
            final int CURRENT_SUM_OF_SUB_ARRAY = Arrays.stream(
                    Arrays.copyOfRange(
                            NUMBERS,
                            currentStartIndex,
                            currentStopIndex)
            ).sum();
            if (CURRENT_SUM_OF_SUB_ARRAY < minimumSumOfSubArray) {
                startIndexOfMinimumSumSubArray = currentStartIndex;
                stopIndexOfMinimumSumSubArray = currentStopIndex;
                minimumSumOfSubArray = CURRENT_SUM_OF_SUB_ARRAY;
            }
        }
        System.out.printf("Sub-array from %d to %d and sum is: %d",
                startIndexOfMinimumSumSubArray,
                stopIndexOfMinimumSumSubArray - 1,
                minimumSumOfSubArray);
    }
}