package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_14_regular_expression._2_2_1_14_1_regular_expression._2_2_1_14_1_26;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check whether a given string is valid hex code or not.</h2>
 */

public class Question26 {
    public static void main(final String[] ARGUMENTS) {
        final String NUMBER = "#FFFFFF";
        System.out.print(isHexadecimal(NUMBER));
    }

    private static boolean isHexadecimal(final String TEXT) {
        return TEXT.matches("#[0-9A-Fa-f]{6}");
    }
}