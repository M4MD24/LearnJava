package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_2;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the character (Unicode code point) at the given index within the string.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>Nullexia</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>
 * The character (unicode point) at position 4: 101
 * </h2>
 */

public class Question2 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "Nullexia";
        final int TARGET_INDEX = 4;
        System.out.print("The character (unicode point) at position " + TARGET_INDEX + ": " + TEXT.codePointAt(TARGET_INDEX));
    }
}