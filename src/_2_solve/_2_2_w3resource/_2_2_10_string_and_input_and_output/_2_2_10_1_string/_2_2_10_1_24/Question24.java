package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_24;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to replace a specified character with another character.</h2>
 */

public class Question24 {
    public static void main(final String[] PARAMETERS) {
        final String FIRST_TEXT = "_".repeat(10) + "Nullexia" + "_".repeat(10);
        System.out.println("Before Replace: " + FIRST_TEXT);
        System.out.print("After Replace : " + FIRST_TEXT.replace("_", ""));
    }
}