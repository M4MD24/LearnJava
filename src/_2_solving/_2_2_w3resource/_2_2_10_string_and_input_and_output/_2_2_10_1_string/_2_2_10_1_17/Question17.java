package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_17;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the contents of a given string as a character array.</h2>
 */

public class Question17 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "Nullexia";
        final char[] CHARACTERS = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        TEXT.getChars(2, 7, CHARACTERS, 2);
        System.out.print(CHARACTERS);
    }
}