package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_11;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to reverse an array of integer values.</h2>
 */

public class Question11 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("Original Numbers: " + Arrays.toString(NUMBERS));
        System.out.print("Reverse Numbers: " + Arrays.toString(IntStream.range(0, NUMBERS.length)
                .map(index -> NUMBERS[NUMBERS.length - 1 - index])
                .toArray()));
    }
}