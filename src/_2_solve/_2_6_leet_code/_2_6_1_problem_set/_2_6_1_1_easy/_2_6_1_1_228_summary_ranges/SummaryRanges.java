package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_228_summary_ranges;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given a sorted unique integer array nums.
 * <br/>
 * <br/>
 * A range [a,b] is the set of all integers from a to b (inclusive).
 * <br/>
 * <br/>
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
 * <br/>
 * <br/>
 * Each range [a,b] in the list should be output as:
 * <br/>
 * <br/>
 * </h2>
 * <ul>
 * <li>"a->b" if a != b</li>
 * <li>"a" if a == b</li>
 * </ul>
 */

public class SummaryRanges {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {0, 1, 2, 4, 5, 7, 9};
        System.out.print(summaryRanges(NUMBERS));
    }

    private static List<String> summaryRanges(final int[] NUMBERS) {
        final List<String> INTERVALS = new ArrayList<>();
        final StringBuilder INTERVAL = new StringBuilder();
        final int NUMBERS_LENGTH = NUMBERS.length;
        int index = 0;
        while (index < NUMBERS_LENGTH) {
            INTERVAL.append(NUMBERS[index]);
            final int PREVIOUS = NUMBERS[index];
            do {
                index++;
            } while (index < NUMBERS_LENGTH && NUMBERS[index] - 1 == NUMBERS[index - 1]);
            if (PREVIOUS != NUMBERS[index - 1])
                INTERVAL.append("->")
                        .append(NUMBERS[index - 1]);
            INTERVALS.add(INTERVAL.toString());
            INTERVAL.setLength(0);
        }
        return INTERVALS;
    }
}