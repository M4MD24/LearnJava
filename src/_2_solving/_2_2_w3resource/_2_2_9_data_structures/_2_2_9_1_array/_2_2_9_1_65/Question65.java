package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_65;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the maximum difference between two elements in a given array of integers such that the smaller element appears before the larger element.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h1>Input Data:</h1>
 * <h2>Numbers = {2, 3, 1, 7, 9, 5, 11, 3, 5}</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The maximum difference between two elements of the said array elements: 10</h2>
 */

public class Question65 {
    public static void main(final String[] ARGS) {
        final int[] NUMBERS = {2, 3, 1, 7, 9, 5, 11, 3, 5};
        System.out.println(Arrays.toString(NUMBERS));
        System.out.print("The maximum difference between two elements of the said array elements: " + getMaximumDifferenceBetweenTwoNumbersInNumbers(NUMBERS));
    }

    private static int getMaximumDifferenceBetweenTwoNumbersInNumbers(final int[] NUMBERS) {
        final int MAXIMUM_NUMBER = Arrays.stream(NUMBERS)
                .max()
                .getAsInt(),
                MINIMUM_NUMBER = Arrays.stream(NUMBERS)
                        .min()
                        .getAsInt();
        return MAXIMUM_NUMBER - MINIMUM_NUMBER;
    }
}