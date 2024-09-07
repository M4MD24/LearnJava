package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_10;

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

public class Question10 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 4, 17, 7, 25, 3, 100};
        System.out.printf("Original Array:\n%s\n", Arrays.toString(NUMBERS));
        Arrays.sort(NUMBERS);
        System.out.printf("3 largest elements of the said array are:\n%d %d %d", NUMBERS[0], NUMBERS[1], NUMBERS[2]);
    }
}