package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_10;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to compare a given string to a specified string buffer.</h2>
 */

public class Question10 {
    public static void main(final String[] ARGUMENTS) {
        final String FIRST_TEXT = "Barmajaa 1";
        final StringBuffer SECOND_TEXT = new StringBuffer("Barmajaa 2");
        System.out.print(FIRST_TEXT.contentEquals(SECOND_TEXT));
    }
}