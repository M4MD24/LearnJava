package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_15;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to move every positive number to the right and every negative number to the left of a given array of integers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original array: [-2, 3, 4, -1, -3, 1, 2, -4, 0]
 * <br/>
 * Result: [-4, -3, -2, -1, 0, 1, 2, 3, 4]
 * </h2>
 */

public class Question15 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {-2, 3, 4, -1, -3, 1, 2, -4, 0};
        System.out.printf("Original Array: %s\n", Arrays.toString(NUMBERS));
        Arrays.sort(NUMBERS);
        System.out.printf("Result: %s", Arrays.toString(NUMBERS));
    }
}