package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_99;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that checks if a specified number appears in every pair of adjacent integers of a given array of integers.</h2>
 */

public class Question99 {
    public static void main(final String[] ARGUMENTS) {
        Scanner input = new Scanner(System.in);

        final int SPECIFIC_NUMBER = specificNumber(input),
                ARRAY_LENGTH = arrayLength(input);
        final int[] ARRAY = arrayValues(ARRAY_LENGTH, input);

        checkIfSpecificNumberAppearsInEveryPair(SPECIFIC_NUMBER, ARRAY_LENGTH, ARRAY);
    }

    private static int specificNumber(Scanner input) {
        System.out.print("Enter specific number: ");
        return input.nextInt();
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

    private static void checkIfSpecificNumberAppearsInEveryPair(final int SPECIFIC_NUMBER, final int ARRAY_LENGTH, final int[] ARRAY) {
        boolean status = false;
        for (int index = 0; index < ARRAY_LENGTH - 1; index += 2) status = ARRAY[index] == SPECIFIC_NUMBER || ARRAY[index + 1] == SPECIFIC_NUMBER;
        System.out.print("\n" + status);
    }
}