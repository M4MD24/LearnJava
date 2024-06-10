package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_78;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original Array: [5, 7]
 * <br/>
 * true
 * </h2>
 */

public class Question78 {
    public static void main(final String[] ARGS) {
        final int[] originalArray = {5, 7};
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        boolean condition = false;
        for (int index : originalArray) {
            if (index == 4 || index == 7) {
                condition = true;
                break;
            }
        }
        System.out.print(condition);
    }
}