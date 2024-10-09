package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_1_easy._2_6_2_1_392_is_sub_sequence;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * <br/>
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * </h2>
 */

public class IsSubSequence {
    public static void main(final String[] PARAMETERS) {
        System.out.print(isSubSequence("abc", "ahbgdc"));
    }

    private static boolean isSubSequence(final String TARGET, final String SOURCE) {
        int currentIndex = -1;
        for (final char TARGET_CHARACTER : TARGET.toCharArray())
            if ((currentIndex = SOURCE.indexOf(TARGET_CHARACTER, currentIndex + 1)) == -1)
                return false;
        return true;
    }
}