package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_77;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that checks whether an array of integers alternates between positive and negative values.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Original array: [1, -2, 5, -4, 3, -6]</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Check the said array of integers alternates between positive and negative values! true</h2>
 */

public class Question77 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, -2, 5, -4, 3, -6};
        System.out.println("Original numbers: " + Arrays.toString(NUMBERS));
        System.out.print("Check the said array of integers alternates between positive and negative values! " + areAlternatesBetweenPositiveAndNegativeNumbers(NUMBERS));
    }

    private static boolean areAlternatesBetweenPositiveAndNegativeNumbers(final int[] NUMBERS) {
        for (int firstNumberIndex = 0, secondNumberIndex = 1; secondNumberIndex < NUMBERS.length; firstNumberIndex += 2, secondNumberIndex += 2)
            if (NUMBERS[firstNumberIndex] <= 0 || NUMBERS[secondNumberIndex] >= 0)
                return false;
        return true;
    }
}