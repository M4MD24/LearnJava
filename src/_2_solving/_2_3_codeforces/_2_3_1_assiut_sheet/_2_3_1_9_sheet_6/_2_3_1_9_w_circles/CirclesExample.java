package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_w_circles;

import java.util.Scanner;

/**
 * <h1>W. Circles</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given four cartesian points (X1, Y1), (X2, Y2), (X3, Y3) and (X4, Y4) that donate two endpoints of a diameter of circle A and circle B respectively. Determine whether these two circles intersect or not.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 1 2 1 -2
 * <br/>
 * 4 3 1 0
 * </h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 0 0 6 0
 * <br/>
 * -8 7 -12 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 */

public class CirclesExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int FIRST_POINT_FIRST_CIRCLE = INPUT.nextInt(),
            FIRST_POINT_SECOND_LINE = INPUT.nextInt(),
            SECOND_POINT_FIRST_CIRCLE = INPUT.nextInt(),
            SECOND_POINT_SECOND_LINE = INPUT.nextInt(),
            THIRD_POINT_FIRST_CIRCLE = INPUT.nextInt(),
            THIRD_POINT_SECOND_LINE = INPUT.nextInt(),
            FOURTH_POINT_FIRST_CIRCLE = INPUT.nextInt(),
            FOURTH_POINT_SECOND_LINE = INPUT.nextInt();

    public static void main(final String[] PARAMETERS) {
        System.out.print((isCirclesIntersect()) ? "NO" : "YES");
    }

    private static boolean isCirclesIntersect() {
        final float FIRST_MIDDLE_POINT_FIRST_CIRCLE = (FIRST_POINT_FIRST_CIRCLE + SECOND_POINT_FIRST_CIRCLE) / 2F,
                FIRST_MIDDLE_POINT_SECOND_CIRCLE = (FIRST_POINT_SECOND_LINE + SECOND_POINT_SECOND_LINE) / 2F,
                SECOND_MIDDLE_POINT_FIRST_CIRCLE = (THIRD_POINT_FIRST_CIRCLE + FOURTH_POINT_FIRST_CIRCLE) / 2F,
                SECOND_MIDDLE_POINT_SECOND_CIRCLE = (THIRD_POINT_SECOND_LINE + FOURTH_POINT_SECOND_LINE) / 2F,
                RADIUS_FIRST_CIRCLE = (float) (Math.sqrt(Math.pow(FIRST_POINT_FIRST_CIRCLE - SECOND_POINT_FIRST_CIRCLE, 2) +
                        Math.pow(FIRST_POINT_SECOND_LINE - SECOND_POINT_SECOND_LINE, 2)) / 2),
                RADIUS_SECOND_CIRCLE = (float) (Math.sqrt(Math.pow(THIRD_POINT_FIRST_CIRCLE - FOURTH_POINT_FIRST_CIRCLE, 2) +
                        Math.pow(THIRD_POINT_SECOND_LINE - FOURTH_POINT_SECOND_LINE, 2)) / 2),
                DISTANCE = (float) Math.sqrt(Math.pow(FIRST_MIDDLE_POINT_FIRST_CIRCLE - SECOND_MIDDLE_POINT_FIRST_CIRCLE, 2) +
                        Math.pow(FIRST_MIDDLE_POINT_SECOND_CIRCLE - SECOND_MIDDLE_POINT_SECOND_CIRCLE, 2)),
                SUM_OF_RADIUS = RADIUS_FIRST_CIRCLE + RADIUS_SECOND_CIRCLE;
        return (DISTANCE > SUM_OF_RADIUS);
    }
}