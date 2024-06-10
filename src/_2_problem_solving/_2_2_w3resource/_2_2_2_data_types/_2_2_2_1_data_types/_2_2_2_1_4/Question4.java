package _2_problem_solving._2_2_w3resource._2_2_2_data_types._2_2_2_1_data_types._2_2_2_1_4;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to convert minutes into years and days.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input the number of minutes: 3456789</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>3456789 minutes is approximately 6 years and 2400 days</h2>
 */

public class Question4 {
    public static void main(final String[] ARGS) {
        final int MINUTES = 3456789;
        System.out.printf("%d minutes is approximately %d years and %d days",
                MINUTES,
                MINUTES / 60 / 24 / 365,
                MINUTES / 60 / 24);
    }
}