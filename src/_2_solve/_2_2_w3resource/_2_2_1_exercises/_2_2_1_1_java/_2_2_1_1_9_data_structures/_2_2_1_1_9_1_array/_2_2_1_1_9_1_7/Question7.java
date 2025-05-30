package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_7;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to remove a specific element from an array.</h2>
 */

public class Question7 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int SPECIFIC_NUMBER = 5;
        System.out.println("Before Remove Specific Number: " + Arrays.toString(NUMBERS));
        System.out.print("After Remove Specific Number: " + Arrays.toString(
                Arrays.stream(NUMBERS)
                        .filter(number -> number != SPECIFIC_NUMBER)
                        .toArray()
        ));
    }
}