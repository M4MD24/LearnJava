package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_14_regular_expression._2_2_1_1_14_1_regular_expression._2_2_1_1_14_1_6;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check if a text contains the character 'g' in a given string.</h2>
 */

public class Question6 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Nullexia For Programming";
        System.out.print(isContain_g_Letter(TEXT));
    }

    private static boolean isContain_g_Letter(final String TEXT) {
        return TEXT.matches(".*g.*");
    }
}