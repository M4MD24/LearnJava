package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_38;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to print the result of removing duplicates from a given string.</h2>
 */

public class Question38 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "pickoutthelongestsubstring";
        System.out.print(getTextAfterRemovingDuplicatesCharacters(TEXT));
    }

    private static StringBuilder getTextAfterRemovingDuplicatesCharacters(final String TEXT) {
        return TEXT.chars()
                .distinct()
                .collect(
                        StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append
                );
    }
}