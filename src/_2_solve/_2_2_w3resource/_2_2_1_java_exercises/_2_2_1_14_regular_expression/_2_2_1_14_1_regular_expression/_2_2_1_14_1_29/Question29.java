package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_14_regular_expression._2_2_1_14_1_regular_expression._2_2_1_14_1_29;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check if a given string is a mathematical expression or not.</h2>
 */

public class Question29 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "1 - 2 + 3 / 4 % 5^2 + -1e2 * 0";
        System.out.print(isMathematicalExpression(TEXT));
    }

    private static boolean isMathematicalExpression(final String TEXT) {
        return TEXT.matches("(?:(?:^|[-+*/%^])\\s*-?\\d+(\\.\\d+)?(?:[eE][+-]?\\d+)?\\s*)+$");
    }
}