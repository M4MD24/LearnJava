package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_23;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find out whether a region in the current string matches a region in another string.</h2>
 */

public class Question23 {
    public static void main(final String[] ARGUMENTS) {
        final String FIRST_TEXT = "Nullexia",
                SECOND_TEXT = "_Nullexia";
        System.out.print(FIRST_TEXT.regionMatches(4, SECOND_TEXT, 5, 4));
    }
}