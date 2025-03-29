package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_77;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to add a string with a specific number of times separated by a substring.</h2>
 */

public class Question77 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(repeatTwoTextsBetweenFirstText("Mohamed", " Sadawy, ", 3));
    }

    private static String repeatTwoTextsBetweenFirstText(final String FIRST_TEXT, final String SECOND_TEXT, final int COUNT_OF_REPEAT) {
        return (FIRST_TEXT + SECOND_TEXT).repeat(COUNT_OF_REPEAT - 1) + FIRST_TEXT;
    }
}