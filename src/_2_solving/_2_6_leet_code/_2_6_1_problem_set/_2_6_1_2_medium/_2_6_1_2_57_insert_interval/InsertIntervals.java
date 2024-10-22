package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_57_insert_interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
 * <br/>
 * <br/>
 * Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
 * <br/>
 * <br/>
 * Return intervals after the insertion.
 * </h2>
 * <br/>
 * <br/>
 * <h1>Note:</h1>
 * <h2>that you don't need to modify intervals in-place. You can make a new array and return it.</h2>
 */

public class InsertIntervals {
    public static void main(final String[] PARAMETERS) {
        final int[][] INTERVALS = {
                {1, 3},
                {6, 9}
        };
        final int[] NEW_INTERVAL = {2, 5};
        System.out.print(Arrays.deepToString(insert(INTERVALS, NEW_INTERVAL)));
    }

    private static int[][] insert(final int[][] INTERVALS, final int[] NEW_INTERVAL) {
        final List<int[]> NEW_INTERVALS = new ArrayList<>();
        int index = 0;
        final int MAXIMUM_LENGTH = INTERVALS.length;
        while (index < MAXIMUM_LENGTH && INTERVALS[index][1] < NEW_INTERVAL[0])
            NEW_INTERVALS.add(INTERVALS[index++]);
        while (index < MAXIMUM_LENGTH && INTERVALS[index][0] <= NEW_INTERVAL[1]) {
            NEW_INTERVAL[0] = Math.min(NEW_INTERVAL[0], INTERVALS[index][0]);
            NEW_INTERVAL[1] = Math.max(NEW_INTERVAL[1], INTERVALS[index++][1]);
        }
        NEW_INTERVALS.add(NEW_INTERVAL);
        while (index < MAXIMUM_LENGTH)
            NEW_INTERVALS.add(INTERVALS[index++]);
        return NEW_INTERVALS.toArray(new int[NEW_INTERVALS.size()][]);
    }
}