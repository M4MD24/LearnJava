package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_23;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to test two array's equality.</h2>
 */

public class Question23 {
    public static void main(final String[] PARAMETERS) {
        final int[] FIRST_NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
                SECOND_NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.print(Arrays.equals(FIRST_NUMBERS, SECOND_NUMBERS));
    }
}