package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_4;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to count Unicode code points in the specified text range of a string.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>Nullexia</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>
 * Codepoint count from 4 to 2: 108
 * </h2>
 */

public class Question4 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "Nullexia";
        final int START_INDEX_TARGET = 2,
                END_INDEX_TARGET = 4;
        System.out.print("Codepoint count from " + START_INDEX_TARGET + " to " + END_INDEX_TARGET + ": " + TEXT.codePointCount(START_INDEX_TARGET, END_INDEX_TARGET));
    }
}