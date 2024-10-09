package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_112;

/**
 * <h1>Problem:</h1>
 * <h2>A string is created by using another string's letters. Letters are case sensitive. Write a Java program that checks the letters of the second string are present in the first string. Return true otherwise false.</h2>
 */

public class Question112 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(areSecondTextCharactersContainedInFirstText("Red Green Blue", "Green"));
    }

    private static boolean areSecondTextCharactersContainedInFirstText(final String FIRST_TEXT, final String SECOND_TEXT) {
        return SECOND_TEXT.chars()
                .allMatch(character -> FIRST_TEXT.indexOf(character) != -1);
    }
}