package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_57;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to merge two sorted (ascending) linked lists in ascending order.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * How many elements do you want to add in 1st linked list?: 3
 * <br/>
 * Input numbers of 1st linked list in ascending order: 1 2 3
 * <br/>
 * <br/>
 * How many elements do you want to add in 2nd linked list?: 3
 * <br/>
 * Input numbers of 2nd linked list in ascending order: 4 5 6
 * <br/>
 * <br/>
 * Merged list: 1 2 3 4 5 6
 * </h2>
 */

public class Question57 {
    public static void main(final String[] PARAMETERS) {
        final int FIRST_NUMBER = 3;
        final int[] FIRST_NUMBERS = {1, 2, 3};
        printFirstNumberAndNumbers(FIRST_NUMBER, FIRST_NUMBERS);
        final int SECOND_NUMBER = 3;
        final int[] SECOND_NUMBERS = {4, 5, 6};
        printSecondNumberAndNumbers(SECOND_NUMBER, SECOND_NUMBERS);
        printAfterMergeFirstAndSecondNumbers(FIRST_NUMBERS, SECOND_NUMBERS);
    }

    private static void printAfterMergeFirstAndSecondNumbers(final int[] FIRST_NUMBERS, final int[] SECOND_NUMBERS) {
        System.out.print("\n\nMerged list: ");
        for (final int NUMBER : FIRST_NUMBERS)
            System.out.printf("%d ", NUMBER);
        for (final int NUMBER : SECOND_NUMBERS)
            System.out.printf("%d ", NUMBER);
    }

    private static void printSecondNumberAndNumbers(final int SECOND_NUMBER, final int[] SECOND_NUMBERS) {
        System.out.printf("\n\nHow many elements do you wand to add in 2st linked list?: %d\n", SECOND_NUMBER);
        System.out.print("Input numbers of 2st linked list in ascending order: ");
        for (final int NUMBER : SECOND_NUMBERS)
            System.out.printf("%d ", NUMBER);
    }

    private static void printFirstNumberAndNumbers(final int FIRST_NUMBER, final int[] FIRST_NUMBERS) {
        System.out.printf("How many elements do you wand to add in 1st linked list?: %d\n", FIRST_NUMBER);
        System.out.print("Input numbers of 1st linked list in ascending order: ");
        for (final int NUMBER : FIRST_NUMBERS)
            System.out.printf("%d ", NUMBER);
    }
}