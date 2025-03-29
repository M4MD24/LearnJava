package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_2_part_2._2_2_1_1_1_2_9;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
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

public class Question9 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 4, 17, 7, 25, 3, 100};
        System.out.printf("Original Array:\n%s\n", Arrays.toString(NUMBERS));
        Arrays.sort(NUMBERS);
        System.out.printf("3 largest elements of the said array are:\n%d %d %d",
                NUMBERS[NUMBERS.length - 1],
                NUMBERS[NUMBERS.length - 2],
                NUMBERS[NUMBERS.length - 3]);
    }
}