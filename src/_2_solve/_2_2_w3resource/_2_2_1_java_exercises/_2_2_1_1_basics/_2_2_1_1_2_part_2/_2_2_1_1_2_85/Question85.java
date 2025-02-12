package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_2_part_2._2_2_1_1_2_85;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>here are four different points on a plane: P(xp, yp), Q(xq, yq), R(xr, yr) and S(xs, ys). Write a Java program to test whether AB and CD are orthogonal or not.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input xp, yp, xq, yq, xr, yr, xs, ys:
 * <br/>
 * 3.5 4.5 2.5 -1.5 3.5 1.0 0.0 4.5
 * <br/>
 * Two lines are not orthogonal.
 * </h2>
 */

public class Question85 {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.println("Input StartX1, StartY1, EndX1, EndY1, StartX2, StartY2, EndX2, EndY2:");
        System.out.printf("Two lines are %sorthogonal",
                areLinesOrthogonal(INPUT.nextDouble(),
                        INPUT.nextDouble(),
                        INPUT.nextDouble(),
                        INPUT.nextDouble(),
                        INPUT.nextDouble(),
                        INPUT.nextDouble(),
                        INPUT.nextDouble(),
                        INPUT.nextDouble()) ? "" : "not ");
    }

    private static boolean areLinesOrthogonal(final double START_X1, final double START_Y1,
                                              final double END_X1, final double END_Y1,
                                              final double START_X2, final double START_Y2,
                                              final double END_X2, final double END_Y2) {
        final double VECTOR_1X = END_X1 - START_X1,
                VECTOR_1Y = END_Y1 - START_Y1,
                VECTOR_2X = END_X2 - START_X2,
                VECTOR_2Y = END_Y2 - START_Y2,
                DOT_PRODUCT = VECTOR_1X * VECTOR_2X + VECTOR_1Y * VECTOR_2Y;
        return DOT_PRODUCT == 0;
    }
}