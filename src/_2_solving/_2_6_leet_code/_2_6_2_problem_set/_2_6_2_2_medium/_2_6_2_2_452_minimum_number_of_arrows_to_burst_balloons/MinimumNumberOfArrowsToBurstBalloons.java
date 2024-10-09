package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_2_medium._2_6_2_2_452_minimum_number_of_arrows_to_burst_balloons;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <h1>Problem:</h1>
 * <h2>
 * There are some spherical balloons taped onto a flat wall that represents the XY-plane. The balloons are represented as a 2D integer array points where points[i] = [xstart, xend] denotes a balloon whose horizontal diameter stretches between xstart and xend. You do not know the exact y-coordinates of the balloons.
 * <br/>
 * <br/>
 * Arrows can be shot up directly vertically (in the positive y-direction) from different points along the x-axis. A balloon with xstart and xend is burst by an arrow shot at x if xstart <= x <= xend. There is no limit to the number of arrows that can be shot. A shot arrow keeps traveling up infinitely, bursting any balloons in its path.
 * <br/>
 * <br/>
 * Given the array points, return the minimum number of arrows that must be shot to burst all balloons.
 * </h2>
 */

public class MinimumNumberOfArrowsToBurstBalloons {
    public static void main(final String[] PARAMETERS) {
        final int[][] POINTS = {
                {10, 16},
                {2, 8},
                {1, 6},
                {7, 12}
        };
        System.out.print(findMinArrowShots(POINTS));
    }

    private static int findMinArrowShots(final int[][] POINTS) {
        Arrays.sort(POINTS, Comparator.comparingInt(point -> point[1]));
        int arrows = 1,
                end = POINTS[0][1];
        for (int index = 1; index < POINTS.length; index++)
            if (POINTS[index][0] > end) {
                arrows++;
                end = POINTS[index][1];
            }
        return arrows;
    }
}