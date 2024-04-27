package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_83_question_83;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to multiply the corresponding elements of two integer arrays.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Array1: [1, 3, -5, 4]
 * <br/>
 * Array2: [1, 4, -5, -2]
 * <br/>
 * Result: 1 12 25 -8
 * </h2>
 */

public class Question83 {
    public static void main(final String[] ARGS) {
        final int[] FIRST_ARRAY = {1, 3, -5, 4},
                SECOND_ARRAY = {1, 4, -5, -2};
        System.out.println("Array1: " + Arrays.toString(FIRST_ARRAY));
        System.out.println("Array2: " + Arrays.toString(SECOND_ARRAY));
        System.out.print("Result: " + displayMultiplyBetweenTwoArrays(FIRST_ARRAY, SECOND_ARRAY));
    }

    private static StringBuilder displayMultiplyBetweenTwoArrays(final int[] FIRST_ARRAY, int[] SECOND_ARRAY) {
        int number1, number2;
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < FIRST_ARRAY.length; index++) {
            number1 = FIRST_ARRAY[index];
            number2 = SECOND_ARRAY[index];
            result.append(number1 * number2)
                    .append((index < FIRST_ARRAY.length - 1) ? " " : "");
        }
        return result;
    }
}