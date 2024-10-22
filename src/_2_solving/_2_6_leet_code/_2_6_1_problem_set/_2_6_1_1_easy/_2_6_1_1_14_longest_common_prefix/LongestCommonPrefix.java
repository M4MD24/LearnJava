package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_14_longest_common_prefix;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <br/>
 * If there is no common prefix, return an empty string "".
 * </h2>
 */

public class LongestCommonPrefix {
    public static void main(final String[] PARAMETERS) {
        final String[] TEXT = {"cir", "car"};
        System.out.print(longestCommonPrefix(TEXT));
    }

    private static String longestCommonPrefix(final String[] WORDS) {
        if (WORDS.length == 0)
            return "";
        else {
            String prefix = WORDS[0];
            for (int index = 1; index < WORDS.length; index++)
                while (WORDS[index].indexOf(prefix) != 0)
                    prefix = prefix.substring(0, prefix.length() - 1);
            return prefix;
        }
    }
}