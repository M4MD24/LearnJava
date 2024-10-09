package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_103;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to remove a specified character from a given string.</h2>
 */

public class Question103 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(getTextAfterRemoveSpecificCharacter("_Null_e__xia_ _for ___Pr_ogramming_", '_'));
    }

    private static String getTextAfterRemoveSpecificCharacter(final String TEXT, final char SPECIFIC_CHARACTER) {
        return TEXT.replaceAll("" + SPECIFIC_CHARACTER, "");
    }
}