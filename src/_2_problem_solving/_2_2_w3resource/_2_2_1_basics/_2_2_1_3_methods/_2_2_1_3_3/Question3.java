package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_methods._2_2_1_3_3;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java method to display the middle character of a string.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <ol>
 *     <li>If the length of the string is odd there will be two middle characters.</li>
 *     <li>If the length of the string is even there will be one middle character.</li>
 * </ol>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a text: 350</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The middle character in the string: 5</h2>
 */

public class Question3 {
    public static void main(final String[] ARGS) {
        final String TEXT = "3550";
        System.out.printf("Input a text: %s\n", TEXT);
        System.out.printf("The middle character in the text: %s", getMiddleCharacter(TEXT));
    }

    private static String getMiddleCharacter(final String TEXT) {
        return (TEXT.length() % 2 != 0)
                ? String.valueOf(TEXT.charAt(TEXT.length() / 2))
                : TEXT.substring(TEXT.length() / 2 - 1, TEXT.length() / 2 + 1);
    }
}