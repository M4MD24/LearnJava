package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_39_question_189;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to two non-negative integers num1 and num2 represented as strings, return the sum of num1 and num2.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>"123" + "456" = 579</h2>
 */

public class Question189 {
    public static void main(final String[] ARGS) {
        final String FIRST_NUMBER = "123", SECOND_NUMBER = "456";
        System.out.printf("\"%s\" + \"%s\" = %d",
                FIRST_NUMBER,
                SECOND_NUMBER,
                Integer.parseInt(FIRST_NUMBER) + Integer.parseInt(SECOND_NUMBER));
    }
}