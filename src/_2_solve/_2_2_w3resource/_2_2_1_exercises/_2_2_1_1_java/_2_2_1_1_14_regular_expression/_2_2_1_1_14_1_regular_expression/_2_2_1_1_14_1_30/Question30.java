package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_14_regular_expression._2_2_1_1_14_1_regular_expression._2_2_1_1_14_1_30;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to insert a dash (-) between an upper case letter and a lower case letter in a string.</h2>
 */

public class Question30 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Mm NN oo lL";
        System.out.print(getTextAfterUppercaseLetterAndLowercaseLetter(TEXT));
    }

    private static String getTextAfterUppercaseLetterAndLowercaseLetter(final String TEXT) {
        return TEXT.replaceAll(
                "([A-Z])([a-z])",
                "$1-$2"
        ).replaceAll(
                "([a-z])([A-Z])",
                "$1-$2"
        );
    }
}