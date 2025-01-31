package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_53;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to match two strings where one string contains wildcard characters.</h2>
 */

public class Question53 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(areContainsWildcardCharacters("abcdhgh", "abc*d?*"));
    }

    private static boolean areContainsWildcardCharacters(final String FIRST_TEXT, final String SECOND_TEXT) {
        return FIRST_TEXT.matches(
                SECOND_TEXT.replace(
                        "*",
                        ".*"
                ).replace(
                        "?",
                        "."
                )
        );
    }
}