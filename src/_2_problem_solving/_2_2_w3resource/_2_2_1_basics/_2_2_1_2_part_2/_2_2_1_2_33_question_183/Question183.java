package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_33_question_183;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to accept a positive number and repeatedly add all its digits until the result has only one digit.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a positive integer: 25
 * <br/>
 * 7
 * </h2>
 */

public class Question183 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 25;
        System.out.printf("Input a positive integer: %d\n", NUMBER);
        final int NUMBER_AFTER_ADDITION = getNumberAfterAddition(NUMBER, 0);
        System.out.print(NUMBER_AFTER_ADDITION);
    }

    private static int getNumberAfterAddition(int number, int numberAfterAddition) {
        while (number != 0) {
            numberAfterAddition += number % 10;
            number /= 10;
        }
        return numberAfterAddition;
    }
}