package _2_solve._2_2_w3resource._2_2_13_algorithms._2_2_13_2_sort._2_2_13_2_2;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sort an array of given integers using the Bubble Sorting Algorithm.</h2>
 */


public class Question2 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(bubbleSorting(NUMBERS));
    }

    private static String bubbleSorting(final int[] ARRAY) {
        final int MAXIMUM_LENGTH = ARRAY.length;
        for (int round = 0; round < MAXIMUM_LENGTH; round++)
            for (int index = 0; index < MAXIMUM_LENGTH - 1; index++)
                if (ARRAY[index] > ARRAY[index + 1]) {
                    ARRAY[index] += ARRAY[index + 1];
                    ARRAY[index + 1] = ARRAY[index] - ARRAY[index + 1];
                    ARRAY[index] -= ARRAY[index + 1];
                }
        return Arrays.toString(ARRAY);
    }
}