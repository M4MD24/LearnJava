package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_14_regular_expression._2_2_1_1_14_1_regular_expression._2_2_1_1_14_1_9;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program where a string starts with a specific number.</h2>
 */

public class Question9 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "123NullexiaForProgramming";
        final int SPECIFIC_NUMBER = 123;
        System.out.print(isContainSpecificNumber(TEXT, SPECIFIC_NUMBER));
    }

    private static boolean isContainSpecificNumber(final String TEXT, final int SPECIFIC_NUMBER) {
        return TEXT.matches("^" + SPECIFIC_NUMBER + ".*");
    }
}