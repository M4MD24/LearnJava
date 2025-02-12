package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_2_part_2._2_2_1_1_2_17;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to move every zero to the right side of a given array of integers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original array: [0, 3, 4, 0, 1, 2, 5, 0]
 * <br/>
 * Result: [3, 4, 1, 2, 5, 0, 0, 0]
 * </h2>
 */

public class Question17 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {0, 3, 4, 0, 1, 2, 5, 0};
        System.out.printf("Original Array: %s\n", Arrays.toString(NUMBERS));
        moveZerosToTheRightSide(NUMBERS);
        System.out.printf("Result: %s", Arrays.toString(NUMBERS));
    }

    private static void moveZerosToTheRightSide(final int[] NUMBERS) {
        Arrays.sort(NUMBERS);
        for (int firstNumberIndex = 0, lastNumberIndex = NUMBERS.length - 1; NUMBERS[firstNumberIndex] == 0; firstNumberIndex++, lastNumberIndex--) {
            NUMBERS[firstNumberIndex] += NUMBERS[lastNumberIndex];
            NUMBERS[lastNumberIndex] = NUMBERS[firstNumberIndex] - NUMBERS[lastNumberIndex];
            NUMBERS[firstNumberIndex] -= NUMBERS[lastNumberIndex];
        }
    }
}