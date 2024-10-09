package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_7;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to concatenate a given string to the end of another string.</h2>
 */

public class Question7 {
    public static void main(final String[] PARAMETERS) {
        final String FIRST_TEXT = "Mohamed",
                SECOND_TEXT = "Sadawy";
        System.out.print(FIRST_TEXT.concat(' ' + SECOND_TEXT));
    }
}