package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_159_question_159;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original Array:
 * <br/>
 * [1, 4, 17, 7, 25, 3, 100]
 * <br/>
 * 3 largest elements of the said array are:
 * <br/>
 * 100 25 17
 * </h2>
 */

public class Question159 {
    public static void main(final String[] ARGS) {
        final int[] NUMBERS = {1, 4, 17, 7, 25, 3, 100};
        System.out.println(STR."Original Array:\n\{Arrays.toString(NUMBERS)}");
        Arrays.sort(NUMBERS);
        System.out.print(STR."3 largest elements of the said array are:\n\{NUMBERS[NUMBERS.length - 1]} \{NUMBERS[NUMBERS.length - 2]} \{NUMBERS[NUMBERS.length - 3]}");
    }
}