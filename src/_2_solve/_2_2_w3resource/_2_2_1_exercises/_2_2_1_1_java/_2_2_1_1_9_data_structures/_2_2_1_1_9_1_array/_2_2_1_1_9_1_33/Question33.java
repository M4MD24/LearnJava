package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_33;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to remove duplicate elements from a given array and return the updated array length.
 * <br/>
 * Sample array: [20, 20, 30, 40, 50, 50, 50]
 * <br/>
 * After removing the duplicate elements the program should return 4 as the new length of the array.
 * </h2>
 */

public class Question33 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {20, 20, 30, 40, 50, 50, 50};
        System.out.print(getLengthOfArrays(NUMBERS));
    }

    private static int getLengthOfArrays(final int[] NUMBERS) {
        return Arrays.stream(NUMBERS).distinct().toArray().length;
    }
}