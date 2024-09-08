package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_52;

import java.util.ArrayList;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the total number of continuous sub-arrays in a given array of integers whose sum equals an integer.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original Array: [4, 2, 3, 3, 7, 2, 4]
 * <br/>
 * Target sum: 6
 * <br/>
 * Total number of continuous sub-arrays: 3
 * </h2>
 */

public class Question52 {
    public static void main(final String[] PARAMETERS) {
        final ArrayList<Integer> NUMBERS = new ArrayList<>();
        final int TARGET_SUM = 6;
        inputNumbers(NUMBERS);
        System.out.printf("Original array: %s\n", NUMBERS);
        System.out.printf("Target sum: %d", TARGET_SUM);
        System.out.printf("Total number of continuous sub-arrays: %d", totalNumberOfContinuousSubArrays(NUMBERS, TARGET_SUM));
    }

    private static int totalNumberOfContinuousSubArrays(final ArrayList<Integer> NUMBERS, final int TARGET_NUMBER_OF_SUBSETS) {
        int totalNumberOfContinuousSubArrays = 0;
        for (int index = 0; index < NUMBERS.size(); index++)
            if (NUMBERS.get(index) == TARGET_NUMBER_OF_SUBSETS) {
                NUMBERS.removeIf(NUMBER -> NUMBER == TARGET_NUMBER_OF_SUBSETS);
                totalNumberOfContinuousSubArrays++;
                index--;
            }
        for (int round = 0; round < NUMBERS.size(); round++) {
            for (int index = round + 1; index < NUMBERS.size(); index++) {
                if ((NUMBERS.get(round) + NUMBERS.get(index)) == TARGET_NUMBER_OF_SUBSETS) {
                    NUMBERS.remove(NUMBERS.get(index));
                    NUMBERS.remove(NUMBERS.get(round--));
                    totalNumberOfContinuousSubArrays++;
                    break;
                }
            }
        }
        return totalNumberOfContinuousSubArrays;
    }

    private static void inputNumbers(final ArrayList<Integer> NUMBERS) {
        NUMBERS.add(4);
        NUMBERS.add(2);
        NUMBERS.add(3);
        NUMBERS.add(3);
        NUMBERS.add(7);
        NUMBERS.add(2);
        NUMBERS.add(4);
    }
}