package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_e_area_of_circle;

import java.util.Scanner;

/**
 * <h1>E. Difference</h1>
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
 * <h2>Given a number R calculate the area of a circle</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>2.00</h2>
 * <br/>
 * <h1>Output:</h1>
 * <h2>12.566370612</h2>
 */

public class AreaOfCircleExample {
    public static void main(final String[] ARGS) {
    final Scanner INPUT = new Scanner(System.in);
        final double PI = 3.141592653,
                RADIUS_SQUARED = INPUT.nextFloat();
        final double AREA_OF_CIRCLE = PI * (RADIUS_SQUARED * RADIUS_SQUARED);
        System.out.print(AREA_OF_CIRCLE);
    }
}