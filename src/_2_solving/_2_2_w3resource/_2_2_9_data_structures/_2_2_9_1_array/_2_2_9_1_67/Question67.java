package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_67;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the sub-array with the largest sum in a given circular array of integers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * First Numbers = {2, 1, -5, 4, -3, 1, -3, 4, -1}
 * <br/>
 * Second Numbers = {1, -2, 3, 0, 7, 8, 1, 2, -3}
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * The sum of sub-array with the largest sum is 6
 * <br/>
 * The sum of sub-array with the largest sum is 21
 * </h2>
 */

public class Question67 {
    public static void main(final String[] PARAMETERS) {
        final int[] FIRST_NUMBERS = {2, 1, -5, 4, -3, 1, -3, 4, -1},
                SECOND_NUMBERS = {1, -2, 3, 0, 7, 8, 1, 2, -3};
        System.out.println(Arrays.toString(FIRST_NUMBERS));
        printSumOfSubArrayWithLargestSum(FIRST_NUMBERS);

        System.out.println('\n');

        System.out.println(Arrays.toString(SECOND_NUMBERS));
        printSumOfSubArrayWithLargestSum(SECOND_NUMBERS);
    }

    private static void printSumOfSubArrayWithLargestSum(final int[] NUMBERS) {
        System.out.print("The sum of sub-array with the largest sum is " + getSumOfSubArrayWithLargestSum(NUMBERS));
    }

    private static int getSumOfSubArrayWithLargestSum(final int[] NUMBERS) {
        final int MAX_KADANE = kadaneAlgorithm(NUMBERS);
        int sumOfNumbers = 0;
        for (int index = 0; index < NUMBERS.length; index++) {
            sumOfNumbers += NUMBERS[index];
            NUMBERS[index] = -NUMBERS[index];
        }
        final int MAX_WRAP = sumOfNumbers + kadaneAlgorithm(NUMBERS);
        return Math.max(MAX_KADANE, MAX_WRAP);
    }

    private static int kadaneAlgorithm(final int[] NUMBERS) {
        int maxEndingHere = NUMBERS[0],
                maxSoFar = NUMBERS[0];
        for (int index = 1; index < NUMBERS.length; index++) {
            maxEndingHere = Math.max(
                    NUMBERS[index],
                    maxEndingHere + NUMBERS[index]
            );
            maxSoFar = Math.max(
                    maxSoFar,
                    maxEndingHere
            );
        }
        return maxSoFar;
    }
}