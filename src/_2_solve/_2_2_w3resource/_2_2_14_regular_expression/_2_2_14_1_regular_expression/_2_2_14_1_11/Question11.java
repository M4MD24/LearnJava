package _2_solve._2_2_w3resource._2_2_14_regular_expression._2_2_14_1_regular_expression._2_2_14_1_11;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check for a number at the end of a string.</h2>
 */

public class Question11 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "Nullexia For Programming1";
        System.out.print(isContainNumberAtTheEnd(TEXT));
    }

    private static boolean isContainNumberAtTheEnd(final String TEXT) {
        return TEXT.matches(".*\\d$");
    }
}