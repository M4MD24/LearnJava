package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_r_distance_points;

import java.util.Scanner;

/**
 * <h1>R. Distance Points</h1>
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
 * <h1>Problem:</h1>
 * <h2>Given 2 Cartesian points (X1, Y1) and (X2, Y2). Print the distance between the two points.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 3 22 11</h2>
 * <h1>Output:</h1>
 * <h2>18.788294228</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>2 3 1 1</h2>
 * <h1>Output:</h1>
 * <h2>2.236067977</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Your answer will be considered correct if its absolute or relative error does not exceed 10^-6.</h2>
 */

public class DistancePointsExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int LATITUDE_NUMBER_1 = INPUT.nextInt(),
            LONGITUDE_NUMBER_1 = INPUT.nextInt(),
            LATITUDE_NUMBER_2 = INPUT.nextInt(),
            LONGITUDE_NUMBER_2 = INPUT.nextInt();
    private static final double LATITUDE = LATITUDE_NUMBER_1 - LATITUDE_NUMBER_2,
            LONGITUDE = LONGITUDE_NUMBER_1 - LONGITUDE_NUMBER_2;
    private static final double DISTANCE_POINTS = Math.sqrt((LATITUDE * LATITUDE) + (LONGITUDE * LONGITUDE));

    public static void main(final String[] ARGUMENTS) {
        System.out.printf("%.9f", DISTANCE_POINTS);
    }
}