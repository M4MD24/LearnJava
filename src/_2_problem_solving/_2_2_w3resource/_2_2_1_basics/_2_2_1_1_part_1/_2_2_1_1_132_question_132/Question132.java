package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_132_question_132;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the updated length of a given sorted array where duplicate elements appear at most twice.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original array: [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7]
 * <br/>
 * The length of the original array is: 13
 * <br/>
 * After removing duplicates, the new length of the array is: 10
 * </h2>
 */

public class Question132 {
    public static void main(final String[] ARGS) {
        final int[] ORIGINAL_ARRAY = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7};
        updatedLengthSortedArrayWhereEachElementAppearsAtMostTwice(ORIGINAL_ARRAY);
    }

    private static void updatedLengthSortedArrayWhereEachElementAppearsAtMostTwice(final int[] ORIGINAL_ARRAY) {
        final int ORIGINAL_ARRAY_LENGTH = ORIGINAL_ARRAY.length;
        int NEW_ARRAY_LENGTH = ORIGINAL_ARRAY_LENGTH;
        for (int index = 0; index < ORIGINAL_ARRAY_LENGTH - 2; index++)
            if (ORIGINAL_ARRAY[index] == ORIGINAL_ARRAY[index + 1] && ORIGINAL_ARRAY[index + 1] == ORIGINAL_ARRAY[index + 2]) NEW_ARRAY_LENGTH--;
        printResult(ORIGINAL_ARRAY_LENGTH, ORIGINAL_ARRAY, NEW_ARRAY_LENGTH);
    }

    private static void printResult(final int ORIGINAL_ARRAY_LENGTH, final int[] ORIGINAL_ARRAY, final int NEW_ARRAY_LENGTH) {
        System.out.println("Original array: " + Arrays.toString(ORIGINAL_ARRAY));
        System.out.println("The length of the original array is: " + ORIGINAL_ARRAY_LENGTH);
        System.out.print("After removing duplicates, the new length of the array is: " + NEW_ARRAY_LENGTH);
    }
}