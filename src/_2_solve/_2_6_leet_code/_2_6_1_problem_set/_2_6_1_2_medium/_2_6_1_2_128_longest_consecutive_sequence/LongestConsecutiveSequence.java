package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_128_longest_consecutive_sequence;

import java.util.HashSet;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * <br/>
 * <br/>
 * You must write an algorithm that runs in O(n) time.
 * </h2>
 */

public class LongestConsecutiveSequence {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {100, 4, 200, 1, 3, 2};
        System.out.print(longestConsecutive(NUMBERS));
    }

    private static int longestConsecutive(final int[] NUMBERS) {
        final HashSet<Integer> UNIQUE_NUMBERS = new HashSet<>();
        for (final int NUMBER : NUMBERS)
            UNIQUE_NUMBERS.add(NUMBER);
        return UNIQUE_NUMBERS.stream()
                .filter(number -> !UNIQUE_NUMBERS.contains(number - 1))
                .mapToInt(number -> {
                    int length = 1;
                    while (UNIQUE_NUMBERS.contains(++number))
                        length++;
                    return length;
                })
                .max()
                .orElse(0);
    }
}