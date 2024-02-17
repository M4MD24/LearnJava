package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_sheets._2_3_1_1_data_types_and_conditions._e_area_of_circle;

import java.util.Scanner;

/**
 * <h1>E. Difference</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input standard input
 * <br/>
 * output standard output
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>2.00</h2>
 * <br/>
 * <h1>Output:</h1>
 * <h2>12.566370612</h2>
 */

public class AreaOfCircleExample {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        final double PI = 3.141592653,
                RADIUS_SQUARED = input.nextFloat();
        final double AREA_OF_CIRCLE = PI * (RADIUS_SQUARED * RADIUS_SQUARED);
        System.out.print(AREA_OF_CIRCLE);
    }
}