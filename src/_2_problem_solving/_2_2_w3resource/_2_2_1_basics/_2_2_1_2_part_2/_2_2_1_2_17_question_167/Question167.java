package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_2_question_167;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to move every zero to the right side of a given array of integers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original array: [0, 3, 4, 0, 1, 2, 5, 0]
 * <br/>
 * Result: [3, 4, 1, 2, 5, 0, 0, 0]
 * </h2>
 */

public class Question167 {
    public static void main(final String[] ARGS) {
        final int[] NUMBERS = {0, 3, 4, 0, 1, 2, 5, 0};
        System.out.println(STR."Original Array: \{Arrays.toString(NUMBERS)}");
        moveZerosToTheRightSide(NUMBERS);
        System.out.print(STR."Result: \{Arrays.toString(NUMBERS)}");
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