package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_3_longest_sub_string_without_repeating_characters;

/**
 * <h1>Problem:</h1>
 * <h2>Given a string s, find the length of the longest substring without repeating characters.</h2>
 */

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "au";
        System.out.print(lengthOfLongestSubstring(TEXT));
    }

    private static int lengthOfLongestSubstring(final String TEXT) {
        int maxLength = 0;
        for (int startPosition = 0, endPosition = 0; endPosition < TEXT.length(); endPosition++)
            maxLength = Math.max(
                    maxLength,
                    endPosition - (startPosition = Math.max(
                            TEXT.lastIndexOf(
                                    TEXT.charAt(endPosition),
                                    endPosition - 1
                            ) + 1,
                            startPosition
                    )) + 1
            );
        return maxLength;
    }
}