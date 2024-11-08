package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_2914_minimum_number_of_changes_to_make_binary_string_beautiful;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given a 0-indexed binary string s having an even length.
 * <br/>
 * <br/>
 * A string is beautiful if it's possible to partition it into one or more substrings such that:
 * <br/>
 * <br/>
 * • Each substring has an even length.
 * <br/>
 * • Each substring contains only 1's or only 0's.
 * <br/>
 * <br/>
 * You can change any character in s to 0 or 1.
 * <br/>
 * <br/>
 * Return the minimum number of changes required to make the string s beautiful.
 * </h2>
 */

public class MinimumNumberOfChangesToMakeBinaryStringBeautiful {
    public static void main(final String[] PARAMETERS) {
        System.out.print(minimumChangesToMakeBeautiful("1001"));
    }

    private static int minimumChangesToMakeBeautiful(final String BINARY_SYSTEM_NUMBER) {
        int changesRequired = 0;
        int currentSum = 0;
        for (int index = 0; index < BINARY_SYSTEM_NUMBER.length(); index++) {
            currentSum += BINARY_SYSTEM_NUMBER.charAt(index) - '0';
            if (index % 2 == 1) {
                changesRequired += (currentSum % 2);
                currentSum = 0;
            }
        }
        return changesRequired;
    }
}