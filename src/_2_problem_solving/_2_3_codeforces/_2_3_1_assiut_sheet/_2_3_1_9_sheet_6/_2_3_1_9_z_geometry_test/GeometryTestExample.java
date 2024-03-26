package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_z_geometry_test;

import java.util.Scanner;

/**
 * <h1>Z. Geometry Test</h1>
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
 * <h2>Given two numbers R and S that donate radius of a circle and side length of a square. Determine which shape holds the other or it's complex to be determined.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 6</h2>
 * <h1>Output:</h1>
 * <h2>Circle</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3 8</h2>
 * <h1>Output:</h1>
 * <h2>Square</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 8</h2>
 * <h1>Output:</h1>
 * <h2>Complex</h2>
 */

public class GeometryTestExample {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int RADIUS = scanner.nextInt(),
                SIDE_LENGTH = scanner.nextInt();
        System.out.print(checkWhoIsInsideWho(SIDE_LENGTH, RADIUS));
    }

    private static String checkWhoIsInsideWho(final int SIDE_LENGTH, final int RADIUS) {
        if (SIDE_LENGTH >= RADIUS * 2) return "Square";
        else if (RADIUS * 2 > Math.sqrt(Math.pow(SIDE_LENGTH, 2) + Math.pow(SIDE_LENGTH, 2))) return "Circle";
        else return "Complex";
    }
}