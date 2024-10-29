package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_5_longest_palindromic_sub_string;

/**
 * <h1>Problem:</h1>
 * <h2>Given a string s, return the longest palindromic substring in s.</h2>
 */

public class LongestPalindromicSubString {
    public static void main(final String[] PARAMETERS) {
        System.out.print(longestPalindrome("cbbd"));
    }

    private static String longestPalindrome(final String TEXT) {
        final String MODIFIED_STRING = "#" + String.join(
                "#",
                TEXT.split("")
        ) + "#";
        final int[] PALINDROME_LENGTHS = new int[MODIFIED_STRING.length()];
        int centerIndex = 0,
                rightBoundary = 0;
        for (int currentIndex = 0; currentIndex < MODIFIED_STRING.length(); currentIndex++) {
            final int MIRROR_INDEX = 2 * centerIndex - currentIndex;
            if (currentIndex < rightBoundary)
                PALINDROME_LENGTHS[currentIndex] = Math.min(rightBoundary - currentIndex, PALINDROME_LENGTHS[MIRROR_INDEX]);
            int rightExpand = currentIndex + (1 + PALINDROME_LENGTHS[currentIndex]),
                    leftExpand = currentIndex - (1 + PALINDROME_LENGTHS[currentIndex]);
            while (
                    rightExpand < MODIFIED_STRING.length() &&
                            leftExpand >= 0 &&
                            MODIFIED_STRING.charAt(rightExpand) == MODIFIED_STRING.charAt(leftExpand)
            ) {
                PALINDROME_LENGTHS[currentIndex]++;
                rightExpand++;
                leftExpand--;
            }
            if (currentIndex + PALINDROME_LENGTHS[currentIndex] > rightBoundary) {
                centerIndex = currentIndex;
                rightBoundary = currentIndex + PALINDROME_LENGTHS[currentIndex];
            }
        }
        int maximumLength = 0,
                maximumCenterIndex = 0;
        for (int index = 0; index < PALINDROME_LENGTHS.length; index++)
            if (PALINDROME_LENGTHS[index] > maximumLength)
                maximumLength = PALINDROME_LENGTHS[maximumCenterIndex = index];
        return TEXT.substring(
                (maximumCenterIndex - maximumLength) / 2,
                (maximumCenterIndex + maximumLength) / 2
        );
    }
}