package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_14_regular_expression._2_2_1_1_14_1_regular_expression._2_2_1_1_14_1_3;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find sequences of lowercase letters joined by an underscore.</h2>
 */

public class Question3 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "nullexia_for_programming";
        System.out.print(isContainLowercaseLettersAndJoinedByUnderscore(TEXT));
    }

    private static boolean isContainLowercaseLettersAndJoinedByUnderscore(final String TEXT) {
        return TEXT.matches("([a-z]+_)*[a-z]+_?");
    }
}