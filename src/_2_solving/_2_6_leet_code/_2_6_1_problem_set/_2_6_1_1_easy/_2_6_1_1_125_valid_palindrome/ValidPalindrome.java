package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_125_valid_palindrome;

/**
 * <h1>Problem:</h1>
 * <h2>
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * <br/>
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * </h2>
 */

public class ValidPalindrome {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "A man, a plan, a canal: Panama";
        System.out.print(isPalindrome(TEXT));
    }

    private static boolean isPalindrome(final String TEXT) {
        final StringBuilder TEXT_AFTER_CLEAN = new StringBuilder();
        for (final char CHARACTER : TEXT.toLowerCase().toCharArray())
            if (Character.isLetterOrDigit(CHARACTER))
                TEXT_AFTER_CLEAN.append(CHARACTER);
        return TEXT_AFTER_CLEAN.toString().contentEquals(TEXT_AFTER_CLEAN.reverse());
    }
}