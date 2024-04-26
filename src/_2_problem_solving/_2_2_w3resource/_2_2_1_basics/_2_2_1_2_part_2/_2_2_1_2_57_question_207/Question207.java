package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_57_question_207;

/**
 * <h1>Question:</h1>
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

public class Question207 {
    public static void main(final String[] ARGS) {
        final int FIRST_NUMBER = 3;
        final int[] FIRST_NUMBERS = {1, 2, 3};
        printFirstNumberAndNumbers(FIRST_NUMBER, FIRST_NUMBERS);
        final int SECOND_NUMBER = 3;
        final int[] SECOND_NUMBERS = {4, 5, 6};
        printSecondNumberAndNumbers(SECOND_NUMBER, SECOND_NUMBERS);
        printAfterMergeFirstAndSecondNumbers(FIRST_NUMBERS, SECOND_NUMBERS);
    }

    private static void printAfterMergeFirstAndSecondNumbers(int[] FIRST_NUMBERS, int[] SECOND_NUMBERS) {
        System.out.print("\n\nMerged list: ");
        for (final int NUMBER : FIRST_NUMBERS)
            System.out.print(STR."\{NUMBER} ");
        for (final int NUMBER : SECOND_NUMBERS)
            System.out.print(STR."\{NUMBER} ");
    }

    private static void printSecondNumberAndNumbers(final int SECOND_NUMBER, final int[] SECOND_NUMBERS) {
        System.out.println(STR."\n\nHow many elements do you wand to add in 2st linked list?: \{SECOND_NUMBER}");
        System.out.print("Input numbers of 2st linked list in ascending order: ");
        for (final int NUMBER : SECOND_NUMBERS)
            System.out.print(STR."\{NUMBER} ");
    }

    private static void printFirstNumberAndNumbers(final int FIRST_NUMBER, final int[] FIRST_NUMBERS) {
        System.out.println(STR."How many elements do you wand to add in 1st linked list?: \{FIRST_NUMBER}");
        System.out.print("Input numbers of 1st linked list in ascending order: ");
        for (final int NUMBER : FIRST_NUMBERS)
            System.out.print(STR."\{NUMBER} ");
    }
}