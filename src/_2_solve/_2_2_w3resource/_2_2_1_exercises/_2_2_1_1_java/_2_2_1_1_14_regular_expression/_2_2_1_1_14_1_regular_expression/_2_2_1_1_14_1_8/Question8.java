package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_14_regular_expression._2_2_1_1_14_1_regular_expression._2_2_1_1_14_1_8;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to match a string containing only upper and lowercase letters, numbers, and underscores.</h2>
 */

public class Question8 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Nullexia_4_Programming";
        System.out.print(isContainLettersAndNumbersOnlyAndUnderscore(TEXT));
    }

    private static boolean isContainLettersAndNumbersOnlyAndUnderscore(final String TEXT) {
        return TEXT.matches("^\\w+$");
    }

// >
//    private static boolean isContainLettersAndNumbersOnlyAndUnderscore(final String TEXT) {
//        return TEXT.matches("^[a-zA-Z0-9_]+$");
//    }
}