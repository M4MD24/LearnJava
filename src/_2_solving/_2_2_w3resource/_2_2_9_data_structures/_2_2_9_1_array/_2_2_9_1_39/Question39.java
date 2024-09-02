package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_39;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to print all the LEADERS in the array.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>An element is leader if it is greater than all the elements to its right side.</h2>
 */

public class Question39 {
    public static void main(final String[] ARGS) {
        final int[] NUMBERS = {654, 23, 421, 543, 5, 43, 52, 3, 4, 5, 34, 650, 544, 53, 324};
        printAllLeadersNumbers(NUMBERS);
    }

    private static void printAllLeadersNumbers(final int[] NUMBERS) {
        for (int firstIndex = 0, secondIndex = 1; secondIndex < NUMBERS.length - 1; firstIndex++, secondIndex++) {
            final int CURRENT_NUMBER = NUMBERS[firstIndex],
                    MAXIMUM_NUMBER_IN_RIGHT_SIDE = Arrays.stream(NUMBERS).skip(secondIndex).max().getAsInt();
            if (CURRENT_NUMBER > MAXIMUM_NUMBER_IN_RIGHT_SIDE)
                System.out.print(CURRENT_NUMBER + " ");
        }
    }
}