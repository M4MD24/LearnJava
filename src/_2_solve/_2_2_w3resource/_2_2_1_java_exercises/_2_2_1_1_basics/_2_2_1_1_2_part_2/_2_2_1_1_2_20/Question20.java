package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_2_part_2._2_2_1_1_2_20;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the length of the longest consecutive sequence in a given array of integers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original array: [1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2]
 * <br/>
 * 7
 * </h2>
 */

public class Question20 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2};
        System.out.printf("Original array: %s\n", Arrays.toString(NUMBERS));
        System.out.print(getLengthOfTheLongestConsecutiveSequence(NUMBERS));
    }

    private static int getLengthOfTheLongestConsecutiveSequence(final int[] NUMBERS) {
        int lengthOfTheLongestConsecutiveSequence = 0, lengthOfTheCurrentConsecutiveSequence = 1;
        for (int firstIndex = 0, secondIndex = 1; secondIndex < NUMBERS.length; firstIndex++, secondIndex++)
            if (NUMBERS[firstIndex] < NUMBERS[secondIndex]) lengthOfTheCurrentConsecutiveSequence++;
            else {
                if (lengthOfTheCurrentConsecutiveSequence > lengthOfTheLongestConsecutiveSequence)
                    lengthOfTheLongestConsecutiveSequence = lengthOfTheCurrentConsecutiveSequence;
                lengthOfTheCurrentConsecutiveSequence = 1;
            }
        return lengthOfTheLongestConsecutiveSequence;
    }
}