package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_5;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to test if an array contains a specific value.</h2>
 */

public class Question5 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int SPECIFIC_NUMBER = 5;
        System.out.println(Arrays.stream(NUMBERS).anyMatch(number -> number == SPECIFIC_NUMBER));
    }
}