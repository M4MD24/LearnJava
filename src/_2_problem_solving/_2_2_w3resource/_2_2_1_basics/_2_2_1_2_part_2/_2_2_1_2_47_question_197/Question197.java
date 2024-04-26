package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_47_question_197;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to test if a given number (positive integer) is a perfect square or not.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a positive integer:  6
 * <br/>
 * Is the said number perfect square? false
 * </h2>
 */

public class Question197 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 25;
        System.out.println(STR."Input a positive integer: \{NUMBER}");
        System.out.print(STR."Is the said number perfect square? \{isPerfectSquare(NUMBER)}");
    }

    private static boolean isPerfectSquare(final int NUMBER) {
        final int INTEGER_NUMBER = (int) Math.sqrt(NUMBER);
        final double DOUBLE_NUMBER = Math.sqrt(NUMBER);
        return INTEGER_NUMBER == DOUBLE_NUMBER;
    }
}