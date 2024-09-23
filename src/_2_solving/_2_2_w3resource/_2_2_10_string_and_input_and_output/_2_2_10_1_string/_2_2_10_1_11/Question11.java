package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_11;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a String object with a character array.</h2>
 */

public class Question11 {
    public static void main(final String[] PARAMETERS) {
        final char[] FIRST_TEXT = {'a', 'b', 'c', 'd', 'z'};
        System.out.print(String.copyValueOf(FIRST_TEXT, 1, 3));
    }
}