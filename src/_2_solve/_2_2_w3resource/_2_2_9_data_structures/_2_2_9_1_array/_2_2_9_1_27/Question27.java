package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_27;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the number of even and odd integers in a given array of integers.</h2>
 */

public class Question27 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final long COUNT_OF_ODD_NUMBERS = Arrays.stream(NUMBERS)
                .filter(NUMBER -> NUMBER % 2 != 0)
                .count(),
                COUNT_OF_EVEN_NUMBERS = Arrays.stream(NUMBERS)
                        .filter(NUMBER -> NUMBER % 2 == 0)
                        .count();
        System.out.println("Count of odd numbers: " + COUNT_OF_ODD_NUMBERS);
        System.out.print("Count of even numbers: " + COUNT_OF_EVEN_NUMBERS);
    }
}