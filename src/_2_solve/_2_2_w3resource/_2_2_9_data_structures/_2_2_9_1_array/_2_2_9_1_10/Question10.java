package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_10;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the maximum and minimum value of an array.</h2>
 */

public class Question10 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("Maximum number: " + Arrays.stream(NUMBERS).max().getAsInt());
        System.out.print("Minimum number: " + Arrays.stream(NUMBERS).min().getAsInt());
    }
}