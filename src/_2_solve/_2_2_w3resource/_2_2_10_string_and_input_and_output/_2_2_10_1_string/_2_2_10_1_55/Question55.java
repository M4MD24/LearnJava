package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_55;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to remove all adjacent duplicates recursively from a given string.</h2>
 */

public class Question55 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getTextAfterRemoveAllAdjacentDuplicatesCharacters("aabaarbarccrabmq"));
    }

    private static String getTextAfterRemoveAllAdjacentDuplicatesCharacters(final String TEXT) {
        for (int index = 1; index < TEXT.length(); index++)
            if (TEXT.charAt(index - 1) == TEXT.charAt(index))
                return getTextAfterRemoveAllAdjacentDuplicatesCharacters(TEXT.substring(0, index - 1) + TEXT.substring(index + 1));
        return TEXT;
    }
}