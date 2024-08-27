package _2_problem_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_65;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program to find the maximum difference between two elements in a given array of integers such that the smaller element appears before the larger element.
 * <br/>
 * In computer science, the maximum sum sub-array problem is the task of finding a contiguous sub-array with the largest sum, within a given one-dimensional array A[1...n] of numbers. Formally, the task is to find indices and with, such that the sum is as large as possible.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Numbers = {1, 2, -3, -4, 0, 6, 7, 8, 9}</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The largest sum of contiguous sub-array: 30</h2>
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