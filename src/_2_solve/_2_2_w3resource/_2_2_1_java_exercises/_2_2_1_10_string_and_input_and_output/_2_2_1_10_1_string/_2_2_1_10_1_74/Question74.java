package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_10_string_and_input_and_output._2_2_1_10_1_string._2_2_1_10_1_74;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check whether a prefix string created using the first specific character in a given string appears somewhere else in the string.</h2>
 */

public class Question74 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(isPrefixTextAppearsSomewhereElse("Mr Mohamed And Mr Ahmed", 2));
    }

    private static boolean isPrefixTextAppearsSomewhereElse(final String TEXT, final int PREFIX_TEXT_NUMBER) {
        return TEXT.indexOf(TEXT.substring(0, PREFIX_TEXT_NUMBER), PREFIX_TEXT_NUMBER) != -1;
    }
}