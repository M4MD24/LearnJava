package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_34;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program to find the length of the longest consecutive elements sequence from an unsorted array of integers.
 * <br/>
 * Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
 * <br/>
 * The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5.
 * </h2>
 */

public class Question34 {
    public static void main(final String[] PARAMETERS) {
        final Integer[] NUMBERS = {49, 1, 3, 200, 2, 4, 70, 5};
        System.out.println(Arrays.toString(NUMBERS));
        final Integer[] LONGEST_CONSECUTIVE_NUMBERS = getLongestConsecutiveNumbers(NUMBERS);
        System.out.println(Arrays.toString(LONGEST_CONSECUTIVE_NUMBERS));
        System.out.print(LONGEST_CONSECUTIVE_NUMBERS.length);
    }

    private static Integer[] getLongestConsecutiveNumbers(final Integer[] NUMBERS) {
        ArrayList<Integer> currentConsecutiveNumbers = new ArrayList<>(),
                longestConsecutiveNumbers = new ArrayList<>();
        Arrays.sort(NUMBERS);
        int currentNumber = NUMBERS[0];
        currentConsecutiveNumbers.add(currentNumber);
        for (int index = 1; index < NUMBERS.length; index++) {
            final int NEXT_NUMBER = NUMBERS[index];
            if (currentNumber == NEXT_NUMBER - 1) {
                currentConsecutiveNumbers.add(NEXT_NUMBER);
                currentNumber = NEXT_NUMBER;
            } else {
                if (longestConsecutiveNumbers.size() < currentConsecutiveNumbers.size()) {
                    longestConsecutiveNumbers = currentConsecutiveNumbers;
                    currentConsecutiveNumbers = new ArrayList<>();
                }
                if (longestConsecutiveNumbers.size() >= NUMBERS.length - index)
                    return longestConsecutiveNumbers.toArray(new Integer[0]);
            }
        }
        return longestConsecutiveNumbers.toArray(new Integer[0]);
    }
}