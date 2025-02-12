package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_1_array._2_2_1_9_1_18;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the second smallest element in an array.</h2>
 */

public class Question18 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {21, 2, 3, 456, 4, 5, 6, 7, 20, 9, 0};
        System.out.print(Arrays
                .stream(NUMBERS)
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .getAsInt());
    }
}