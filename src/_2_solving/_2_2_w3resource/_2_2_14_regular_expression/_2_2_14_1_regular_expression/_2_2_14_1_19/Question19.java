package _2_solving._2_2_w3resource._2_2_14_regular_expression._2_2_14_1_regular_expression._2_2_14_1_19;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to remove specific letters from a string and return the updated string.
 * <br/>
 * Specific letters: "p", "q", or "r".
 * </h2>
 */

public class Question19 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "Rana";
        final String SPECIFIC_CHARACTERS = "pqr";
        System.out.print(getTextAfterRemoveAllSpecificCharacters(TEXT, SPECIFIC_CHARACTERS));
    }

    private static String getTextAfterRemoveAllSpecificCharacters(final String TEXT, final String SPECIFIC_CHARACTERS) {
        return TEXT.replaceAll(
                "(?i)[" + SPECIFIC_CHARACTERS + "]",
                ""
        );
    }
}