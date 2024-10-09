package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_17;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the second largest element in an array.</h2>
 */

public class Question17 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 2, 3, 456, 4, 5, 6, 7, 20, 9, 0};
        System.out.print(Arrays
                .stream(NUMBERS)
                .distinct()
                .sorted()
                .skip(NUMBERS.length - 2)
                .findFirst()
                .getAsInt());
    }
}