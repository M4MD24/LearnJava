package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_6;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the index of an array element.</h2>
 */

public class Question6 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int SPECIFIC_NUMBER = 5;
        System.out.print(Arrays.stream(NUMBERS)
                .boxed()
                .toList()
                .indexOf(SPECIFIC_NUMBER));
    }
}