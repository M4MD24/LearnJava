package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_107_question_107;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to check if an array of integers contains three increasing adjacent numbers.</h2>
 */

public class Question107 {
    public static void main(final String[] ARGS) {
        final int[] ARRAY = {5, 11, 12, 13, 14, 45, 20};
        System.out.println("Array: " + Arrays.toString(ARRAY));
        System.out.print(checkContainsThreeIncreasingAdjacentNumbers(ARRAY));
    }

    private static boolean checkContainsThreeIncreasingAdjacentNumbers(final int[] ARRAY) {
        boolean status = false;
        for (int indexNumber1 = 0, indexNumber2 = 1, indexNumber3 = 2; indexNumber3 < ARRAY.length; indexNumber1++, indexNumber2++, indexNumber3++)
            if (ARRAY[indexNumber1] == (ARRAY[indexNumber2] - 1) && ARRAY[indexNumber2] == (ARRAY[indexNumber3] - 1)) {
                status = true;
                break;
            }
        return status;
    }
}