package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_79;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a string from a given string. This is done after removing the 2nd character from the substring of length three starting with 'a' and ending with 'z' presents in the said string.</h2>
 */

public class Question79 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getTextAfterRemoveSecondCharacterIfStartCharacterEqual_z_And_EndCharacterEqual_g_InFirstThreeCharacters("aNz"));
    }

    private static String getTextAfterRemoveSecondCharacterIfStartCharacterEqual_z_And_EndCharacterEqual_g_InFirstThreeCharacters(final String TEXT) {
        if (TEXT.charAt(0) == 'a' && TEXT.charAt(2) == 'z')
            return TEXT.charAt(0) + TEXT.substring(2);
        else
            return TEXT;
    }
}