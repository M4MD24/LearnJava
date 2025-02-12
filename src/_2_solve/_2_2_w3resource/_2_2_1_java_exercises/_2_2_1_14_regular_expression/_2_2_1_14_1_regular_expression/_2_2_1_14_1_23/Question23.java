package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_14_regular_expression._2_2_1_14_1_regular_expression._2_2_1_14_1_23;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to move all lower case letters to the front of a given word. This will keep the relative position of all the letters (both upper and lower case) same.</h2>
 */

public class Question23 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Rana";
        System.out.print(getTextAfterMoveAllLowercaseLettersToFrontOfText(TEXT));
    }

    private static String getTextAfterMoveAllLowercaseLettersToFrontOfText(final String TEXT) {
        return TEXT.replaceAll(
                "[A-Z]",
                ""
        ) + TEXT.replaceAll(
                "[a-z]",
                ""
        );
    }
}