package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_76;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to determine whether numbers in an array can be rearranged so that each number appears exactly once in a consecutive list of numbers. Return true otherwise false.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Original array: [1, 2, 5, 0, 4, 3, 6]</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Check consecutive numbers in the said array! true</h2>
 */

public class Question76 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 2, 5, 0, 4, 3, 6};
        System.out.println("Original numbers: " + Arrays.toString(NUMBERS));
        System.out.print("Check consecutive numbers in the said array! " + areConsecutiveNumbers(NUMBERS));
    }

    private static boolean areConsecutiveNumbers(final int[] NUMBERS) {
        Arrays.sort(NUMBERS);
        return IntStream.range(1, NUMBERS.length)
                .allMatch(index -> NUMBERS[index - 1] + 1 == NUMBERS[index]);
    }
}