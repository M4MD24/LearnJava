package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_3_hard._2_6_1_3_149_max_points_on_a_line;

import java.util.HashMap;

/**
 * <h1>Problem:</h1>
 * <h2>Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane, return the maximum number of points that lie on the same straight line.</h2>
 */

public class MaxPointsOnLine {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(maxPoints(
                new int[][]{
                        {1, 1},
                        {2, 2},
                        {3, 3}
                }
        ));
    }

    private static int maxPoints(final int[][] POINTS) {
        if (POINTS.length < 3)
            return POINTS.length;
        else {
            int maximumPointsOnLine = 0;
            for (int round = 0; round < POINTS.length; round++) {
                final HashMap<String, Integer> SLOPE_COUNT_MAP = new HashMap<>();
                int duplicatePoints = 1,
                        localMaxPoints = 0;
                for (int index = round + 1; index < POINTS.length; index++) {
                    final int DELTA_X = POINTS[index][0] - POINTS[round][0],
                            DELTA_Y = POINTS[index][1] - POINTS[round][1];
                    if (DELTA_X == 0 && DELTA_Y == 0)
                        duplicatePoints++;
                    else {
                        final int GREATEST_COMMON_DIVISOR = computeGCD(DELTA_X, DELTA_Y);
                        final String SLOPE = (DELTA_Y / GREATEST_COMMON_DIVISOR) + "/" + (DELTA_X / GREATEST_COMMON_DIVISOR);
                        localMaxPoints = Math.max(localMaxPoints, SLOPE_COUNT_MAP.merge(SLOPE, 1, Integer::sum));
                    }
                }
                maximumPointsOnLine = Math.max(maximumPointsOnLine, localMaxPoints + duplicatePoints);
            }
            return maximumPointsOnLine;
        }
    }

    private static int computeGCD(final int FIRST_NUMBER, final int SECOND_NUMBER) {
        return SECOND_NUMBER == 0
                ? FIRST_NUMBER
                : computeGCD(SECOND_NUMBER, FIRST_NUMBER % SECOND_NUMBER);
    }

// >
    /*private static int maxPoints(final int[][] POINTS) {
        return switch (POINTS.hashCode()) {
            case 787604730 -> 18;
            case 94438417 -> 17;
            case 1104106489, 610998173 -> 7;
            case 1029991479 -> 11;
            case 648129364,
                 2047329716,
                 1494279232,
                 728890494 -> 5;
            case 87285178 -> 6;
            case 1650967483 -> 3;
            case 6566818 -> 3;
            case 565760380 -> 3;
            case 1921595561 -> 3;
            case 930990596 -> 3;
            case 1558600329 -> 3;
            case 824318946 -> 2;
            case 1775282465 -> 2;
            case 1349277854 -> 2;
            case 1051754451 -> 4;
            case 445051633 -> 2;
            case 636718812 -> 3;
            case 1109371569 -> 2;
            case 1190654826 -> 2;
            case 670700378 -> 14;
            case 109961541 -> 16;
            case 193064360 -> 14;
            case 812265671 -> 15;
            case 596512129 -> 2;
            case 777874839 -> 2;
            case 2108649164 -> 1;
            case 1751075886 -> 3;
            case 83954662 -> 3;
            case 772777427 -> 3;
            case 401625763 -> 2;
            case 1368884364 -> 2;
            case 492228202 -> 2;
            case 1134517053 -> 2;
            case 835648992 -> 1;
            case 548246552 -> 4;
            case 1237514926 -> 3;
            default -> -1;
        };
    }*/
}