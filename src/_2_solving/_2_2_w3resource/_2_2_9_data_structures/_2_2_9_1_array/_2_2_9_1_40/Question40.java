package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_40;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the two elements in a given array of positive and negative numbers such that their sum is close to zero.</h2>
 */

public class Question40 {
    public static void main(final String[] ARGS) {
        final int[] NUMBERS = {654, 23, 421, 543, -5, 43, 52, 3, -1, 4, 5, 34, 650, 544, 53, 324};
        System.out.println("Nearest Positive Number to Zero: " + getNearestPositiveNumberToZero(NUMBERS));
        System.out.print("Nearest Negative Number to Zero: " + getNearestNegativeNumberToZero(NUMBERS));
    }

    private static int getNearestNegativeNumberToZero(final int[] NUMBERS) {
        Arrays.sort(NUMBERS);
        final int[] NEGATIVE_NUMBERS_TO_ZERO = Arrays.stream(NUMBERS)
                .filter(number -> number < 0)
                .toArray();
        return NEGATIVE_NUMBERS_TO_ZERO[NEGATIVE_NUMBERS_TO_ZERO.length - 1];
    }

    private static int getNearestPositiveNumberToZero(final int[] NUMBERS) {
        Arrays.sort(NUMBERS);
        final int[] POSITIVE_NUMBERS_TO_ZERO = Arrays.stream(NUMBERS)
                .filter(number -> number > 0)
                .toArray();
        return POSITIVE_NUMBERS_TO_ZERO[0];
    }
}