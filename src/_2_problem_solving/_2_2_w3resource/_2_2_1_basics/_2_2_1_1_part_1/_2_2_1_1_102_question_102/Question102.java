package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_102_question_102;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to check if a specified array of integers contains 10 or 30.</h2>
 */

public class Question102 {
    public static void main(final String[] ARGS) {
        final int[] ARRAY = {11, 11, 13, 31, 45, 20, 33, 53};
        System.out.print(Contains10Or30(ARRAY));
    }

    private static boolean Contains10Or30(final int[] ARRAY) {
        boolean status = false;
        for (int number : ARRAY) {
            if (number == 10 || number == 30) {
                status = true;
                break;
            }
        }
        return status;
    }
}