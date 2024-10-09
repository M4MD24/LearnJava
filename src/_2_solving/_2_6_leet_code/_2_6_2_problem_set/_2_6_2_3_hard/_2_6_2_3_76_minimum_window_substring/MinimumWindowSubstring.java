package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_3_hard._2_6_2_3_76_minimum_window_substring;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
 * <br/>
 * The testcases will be generated such that the answer is unique.
 * </h2>
 */

public class MinimumWindowSubstring {
    public static void main(final String[] PARAMETERS) {
        System.out.print(minimumWindow(
                "ADOBECODEBANC",
                "ABC"
        ));
    }

    private static String minimumWindow(final String SOURCE_TEXT, final String TARGET_TEXT) {
        if (SOURCE_TEXT.length() < TARGET_TEXT.length())
            return "";
        else {
            final int[] REQUIRED_CHARACTERS = new int[128];
            for (final char CHARACTER : TARGET_TEXT.toCharArray())
                REQUIRED_CHARACTERS[CHARACTER]++;
            int startIndex = 0,
                    endIndex = 0,
                    charactersToMatch = TARGET_TEXT.length(),
                    minimumWindowStart = 0,
                    minimumWindowLength = Integer.MAX_VALUE;
            while (endIndex < SOURCE_TEXT.length()) {
                if (REQUIRED_CHARACTERS[SOURCE_TEXT.charAt(endIndex++)]-- > 0)
                    charactersToMatch--;
                while (charactersToMatch == 0) {
                    if (endIndex - startIndex < minimumWindowLength) {
                        minimumWindowStart = startIndex;
                        minimumWindowLength = endIndex - startIndex;
                    }
                    if (REQUIRED_CHARACTERS[SOURCE_TEXT.charAt(startIndex++)]++ == 0)
                        charactersToMatch++;
                }
            }
            return minimumWindowLength == Integer.MAX_VALUE
                    ? ""
                    : SOURCE_TEXT.substring(minimumWindowStart, minimumWindowStart + minimumWindowLength);
        }
    }
}