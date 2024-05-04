package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_10_question_349;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to accept a float value of a number and return a rounded float value.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a float number: 12.53
 * <br/>
 * The rounded value of 12.530000 is: 13.00
 * </h2>
 */

public class Question349 {
    public static void main(final String[] ARGS) {
        final float NUMBER = 12.53F;
        System.out.printf(STR."""
                Input a float number:\s\{NUMBER}
                The abslute value of\s\{String.format("%.6f", NUMBER)} is: \{String.format("%.2f", (float) Math.round(NUMBER))}""");
    }
}