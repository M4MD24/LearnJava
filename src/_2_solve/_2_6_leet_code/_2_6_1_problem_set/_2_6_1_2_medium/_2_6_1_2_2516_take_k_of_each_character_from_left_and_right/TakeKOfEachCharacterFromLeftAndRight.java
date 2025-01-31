package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_2516_take_k_of_each_character_from_left_and_right;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given a string s consisting of the characters 'a', 'b', and 'c' and a non-negative integer k. Each minute, you may take either the leftmost character of s, or the rightmost character of s.
 * <br/>
 * <br/>
 * Return the minimum number of minutes needed for you to take at least k of each character, or return -1 if it is not possible to take k of each character.
 * </h2>
 */

public class TakeKOfEachCharacterFromLeftAndRight {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(takeCharacters(
                "aabaaaacaabc",
                2
        ));
    }

    private static int takeCharacters(final String TEXT, final int TARGET_NUMBER) {
        System.gc();
        final int TEXT_LENGTH = TEXT.length();
        final int[] COUNT_OF_A_AND_B_AND_C = new int[3];
        for (final char CHARACTER : TEXT.toCharArray())
            COUNT_OF_A_AND_B_AND_C[CHARACTER - 'a']++;
        if (COUNT_OF_A_AND_B_AND_C[0] < TARGET_NUMBER || COUNT_OF_A_AND_B_AND_C[1] < TARGET_NUMBER || COUNT_OF_A_AND_B_AND_C[2] < TARGET_NUMBER)
            return -1;
        else {
            int maximumWindow = 0;
            final int[] CURRENT_COUNT_OF_A_AND_B_AND_C = new int[3];
            for (int left = 0, right = 0; right < TEXT_LENGTH; right++) {
                CURRENT_COUNT_OF_A_AND_B_AND_C[TEXT.charAt(right) - 'a']++;
                while (CURRENT_COUNT_OF_A_AND_B_AND_C[0] > COUNT_OF_A_AND_B_AND_C[0] - TARGET_NUMBER ||
                        CURRENT_COUNT_OF_A_AND_B_AND_C[1] > COUNT_OF_A_AND_B_AND_C[1] - TARGET_NUMBER ||
                        CURRENT_COUNT_OF_A_AND_B_AND_C[2] > COUNT_OF_A_AND_B_AND_C[2] - TARGET_NUMBER)
                    CURRENT_COUNT_OF_A_AND_B_AND_C[TEXT.charAt(left++) - 'a']--;
                maximumWindow = Math.max(maximumWindow, right - left + 1);
            }
            return TEXT_LENGTH - maximumWindow;
        }
    }
}