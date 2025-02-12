package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_1_array._2_2_1_9_1_32;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check if an array of integers contains two specified elements 65 and 77.</h2>
 */

public class Question32 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 2, 3, 10, 10, 77, 7, 10, 8, 65, 0};
        System.out.print(areNumbersContain65and77(NUMBERS));
    }

    private static boolean areNumbersContain65and77(final int[] NUMBERS) {
        return Arrays.stream(NUMBERS).anyMatch(number -> number == 65) &&
                Arrays.stream(NUMBERS).anyMatch(number -> number == 77);
    }
}