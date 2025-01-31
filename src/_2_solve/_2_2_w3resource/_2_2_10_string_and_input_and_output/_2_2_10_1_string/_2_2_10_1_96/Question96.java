package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_96;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a new string after removing a specified character from a given string. This is except the first and last position.</h2>
 */

public class Question96 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getTextAfterRemoveSpecificCharacterExceptFirstAndLastPosition("_Null_e__xia_ _for ___Pr_ogramming_", '_'));
    }

    private static String getTextAfterRemoveSpecificCharacterExceptFirstAndLastPosition(final String TEXT, final char SPECIFIC_CHARACTER) {
        return TEXT.charAt(0) +
                TEXT.substring(1, TEXT.length() - 1)
                        .replaceAll("" + SPECIFIC_CHARACTER, "") +
                TEXT.charAt(TEXT.length() - 1);
    }
}