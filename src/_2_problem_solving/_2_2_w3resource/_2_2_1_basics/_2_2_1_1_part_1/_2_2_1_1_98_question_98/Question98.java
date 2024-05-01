package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_98_question_98;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to check and count if the value 20 appears three times or above, and no 20's are next to each other in the array of integers.</h2>
 */

public class Question98 {
    public static void main(final String[] ARGS) {
        Scanner input = new Scanner(System.in);

        final int ARRAY_LENGTH = arrayLength(input);
        final int[] ARRAY = arrayValues(ARRAY_LENGTH, input);

        checkAndCountIfValueSpecificNumberAppearsThreeTimesOrAbove(ARRAY_LENGTH, ARRAY);
    }

    private static int arrayLength(Scanner input) {
        System.out.print("Enter array length: ");
        return input.nextInt();
    }

    private static int[] arrayValues(final int ARRAY_LENGTH, Scanner input) {
        final int[] ARRAY = new int[ARRAY_LENGTH];
        for (int index = 0; index < ARRAY_LENGTH; index++) {
            System.out.print("Enter value of index " + (index + 1) + ": ");
            ARRAY[index] = input.nextInt();
        }
        return ARRAY;
    }

    private static void checkAndCountIfValueSpecificNumberAppearsThreeTimesOrAbove(final int ARRAY_LENGTH, final int[] ARRAY) {
        final int specificNumber = 20;
        boolean foundIt = false;
        int count = 0;
        for (int index = 0; index < ARRAY_LENGTH; index++) {
            if (ARRAY[index] == specificNumber) {
                if (!foundIt) {
                    foundIt = true;
                    ++count;
                } else {
                    System.out.print("\n◘ 20's are next to each other in the array!");
                    return;
                }
            } else foundIt = false;
        }
        System.out.print("\n◘ Array: " + Arrays.toString(ARRAY) +
                "\n• The value 20 appears three times or above?\n- " + (count > 2) +
                "\n• how much?\n- " + count);
    }
}