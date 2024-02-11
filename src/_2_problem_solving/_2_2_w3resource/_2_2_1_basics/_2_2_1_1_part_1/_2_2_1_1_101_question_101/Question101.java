package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_101_question_101;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to determine whether the specific number 10 in a given array of integers exceeds 20.</h2>
 */

public class Question101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int ARRAY_LENGTH = arrayLength(input);
        final int[] ARRAY = arrayValues(ARRAY_LENGTH, input);

        determineWhetherSpecificNumberExceeds20(ARRAY_LENGTH, ARRAY);
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

    private static void determineWhetherSpecificNumberExceeds20(final int ARRAY_LENGTH, final int[] ARRAY) {
        final int SPECIFIC_NUMBER = 10,
                END_AT_VALUE = 20;
        int countSpecificElements = 0;
        boolean status = false;
        for (int index = 0; index < ARRAY_LENGTH; index++) {
            if (ARRAY[index] == SPECIFIC_NUMBER) ++countSpecificElements;
            if (ARRAY[index] == END_AT_VALUE && countSpecificElements > 0) {
                status = true;
                break;
            }
        }
        System.out.print("\n" + status);
    }
}