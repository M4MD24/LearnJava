package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_78;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that checks whether an array is negative dominant or not. If the array is negative dominant return true otherwise false.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Original array: [1, -2, -5, -4, 3, -6]</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Check Negative Dominance in the said array! true</h2>
 */

public class Question78 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, -2, -5, -4, 3, -6};
        System.out.println(Arrays.toString(NUMBERS));
        System.out.print("Check Negative Dominance in the said array! " + areNegativeNumbersDominance(NUMBERS));
    }

    private static boolean areNegativeNumbersDominance(final int[] NUMBERS) {
        return Arrays.stream(NUMBERS).filter(number -> number < 0).toArray().length >
                Arrays.stream(NUMBERS).filter(number -> number > 0).toArray().length;
    }
}