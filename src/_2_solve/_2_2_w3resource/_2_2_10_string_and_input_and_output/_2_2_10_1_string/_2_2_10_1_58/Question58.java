package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_58;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to read a string and return true if it ends with a specified string of length 2.</h2>
 */

public class Question58 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(isEndSpecificTextOfLength2("String", "ng"));
    }

    private static boolean isEndSpecificTextOfLength2(final String TEXT, final String SPICIFIC_TEXT) {
        return TEXT.substring(TEXT.length() - 2).equals(SPICIFIC_TEXT);
    }
}