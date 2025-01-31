package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_56_merge_intervals;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <h1>Problem:</h1>
 * <h2>Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.</h2>
 */

public class MergeIntervals {
    public static void main(final String[] ARGUMENTS) {
        final int[][] INTERVALS = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };
        System.out.print(Arrays.deepToString(merge(INTERVALS)));
    }

    private static int[][] merge(final int[][] INTERVALS) {
        Arrays.sort(INTERVALS, Comparator.comparingInt(interval -> interval[0]));
        final int[][] NEW_INTERVALS = new int[INTERVALS.length][2];
        int index = -1;
        for (final int[] INTERVAL : INTERVALS)
            if (index == -1 || NEW_INTERVALS[index][1] < INTERVAL[0])
                NEW_INTERVALS[++index] = INTERVAL;
            else
                NEW_INTERVALS[index][1] = Math.max(NEW_INTERVALS[index][1], INTERVAL[1]);
        return Arrays.copyOf(
            NEW_INTERVALS,
            index + 1
        );
    }
}