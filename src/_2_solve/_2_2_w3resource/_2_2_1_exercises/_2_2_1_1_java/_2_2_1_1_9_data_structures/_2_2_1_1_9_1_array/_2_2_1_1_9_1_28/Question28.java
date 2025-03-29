package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_28;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the difference between the largest and smallest values in an array of integers. The array must have a length of at least 1.</h2>
 */

public class Question28 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 20, 3, 4, 5, 6, 7, 8, 90};
        System.out.println(Arrays.toString(NUMBERS));
        System.out.print(
                (NUMBERS.length > 0)
                        ? getDifferenceBetweenLargestAndSmallestNumbers(NUMBERS)
                        : "There are no numbers!"
        );
    }

    private static String getDifferenceBetweenLargestAndSmallestNumbers(final int[] NUMBERS) {
        final int LARGEST_NUMBER = Arrays.stream(NUMBERS).max().getAsInt(),
                SMALLEST_NUMBER = Arrays.stream(NUMBERS).min().getAsInt();
        return String.format("""
                        %d - %d = %d""",
                LARGEST_NUMBER,
                SMALLEST_NUMBER,
                LARGEST_NUMBER - SMALLEST_NUMBER);
    }
}