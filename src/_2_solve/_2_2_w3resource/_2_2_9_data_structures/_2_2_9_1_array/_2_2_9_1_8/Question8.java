package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_8;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to copy an array by iterating the array.</h2>
 */

public class Question8 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
                COPY_OF_NUMBERS = new int[NUMBERS.length];
        System.out.println("Original Numbers: " + Arrays.toString(NUMBERS));
        System.arraycopy(NUMBERS, 0, COPY_OF_NUMBERS, 0, NUMBERS.length);
        System.out.print("Copy of Numbers: " + Arrays.toString(COPY_OF_NUMBERS));
    }
}