package _2_solving._2_2_w3resource._2_2_14_regular_expression._2_2_14_1_regular_expression._2_2_14_1_1;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check whether a string contains only a certain set of characters (in this case a-z, A-Z and 0-9).</h2>
 */

public class Question1 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "Nullexia4Programming";
        System.out.print(isContainLettersAndNumbersOnly(TEXT));
    }

    private static boolean isContainLettersAndNumbersOnly(final String TEXT) {
        return TEXT.matches("[a-zA-Z0-9]+");
    }
}