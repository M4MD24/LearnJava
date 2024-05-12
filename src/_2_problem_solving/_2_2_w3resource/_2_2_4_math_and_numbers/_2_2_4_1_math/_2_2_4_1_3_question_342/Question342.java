package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_3_question_342;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to test if a double number is an integer.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>It's a double number</h2>
 */

public class Question342 {
    public static void main(final String[] ARGS) {
        final double NUMBER = 5.44444D;
        System.out.printf("It's a %s number",
                NUMBER % 1 == 0
                        ? "integer"
                        : "double");
    }
}