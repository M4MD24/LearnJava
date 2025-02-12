package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_14_regular_expression._2_2_1_14_1_regular_expression._2_2_1_14_1_27;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to add a dash before and after every vowel in a given string.</h2>
 */

public class Question27 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Java";
        System.out.print(getTextAfterAddDashSymbolBeforeAndAfterEveryVowel(TEXT));
    }

    private static String getTextAfterAddDashSymbolBeforeAndAfterEveryVowel(final String TEXT) {
        return TEXT.replaceAll(
                "(?i)([AEIOUaeiou])",
                "-$1-"
        );
    }
}