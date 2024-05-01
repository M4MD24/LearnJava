package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_10_question_160;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the k smallest elements in a given array. Elements in the array can be in any order.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original Array:
 * <br/>
 * [1, 4, 17, 7, 25, 3, 100]
 * <br/>
 * 3 smallest elements of the said array are:
 * <br/>
 * 1 3 4
 * </h2>
 */

public class Question160 {
    public static void main(final String[] ARGS) {
        final int[] NUMBERS = {1, 4, 17, 7, 25, 3, 100};
        System.out.println(STR."Original Array:\n\{Arrays.toString(NUMBERS)}");
        Arrays.sort(NUMBERS);
        System.out.print(STR."3 largest elements of the said array are:\n\{NUMBERS[0]} \{NUMBERS[1]} \{NUMBERS[2]}");
    }
}