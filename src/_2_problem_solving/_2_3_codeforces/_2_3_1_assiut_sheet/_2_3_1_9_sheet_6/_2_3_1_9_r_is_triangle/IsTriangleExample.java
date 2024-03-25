package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_r_is_triangle;

import java.util.Scanner;

/**
 * <h1>S. Is Triangle</h1>
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
 * <h2>Given three numbers A, B and C that donate the lengths of the three sides of a triangle. Determine whether this triangle is valid or not and if it is valid print its area.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>7 10 5</h2>
 * <h1>Output:</h1>
 * <h2>
 * Valid
 * <br/>
 * 16.248077
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3 4 1</h2>
 * <h1>Output:</h1>
 * <h2>Invalid</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Your answer will be considered correct if its absolute or relative error does not exceed 10^-4.</h2>
 */

public class IsTriangleExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final short FIRST_SIDE_LENGTH = INPUT.nextShort(),
            SECOND_SIDE_LENGTH = INPUT.nextShort(),
            THIRD_SIDE_LENGTH = INPUT.nextShort();

    public static void main(String[] args) {
        if (isTriangle())
            System.out.printf("%.6f", equilateralTriangleArea((short) (FIRST_SIDE_LENGTH + SECOND_SIDE_LENGTH + THIRD_SIDE_LENGTH)));
    }

    private static boolean isTriangle() {
        if (FIRST_SIDE_LENGTH + SECOND_SIDE_LENGTH > THIRD_SIDE_LENGTH &&
                FIRST_SIDE_LENGTH + THIRD_SIDE_LENGTH > SECOND_SIDE_LENGTH &&
                SECOND_SIDE_LENGTH + THIRD_SIDE_LENGTH > FIRST_SIDE_LENGTH) {
            System.out.println("Valid");
            return true;
        } else {
            System.out.print("Invalid");
            return false;
        }
    }

    private static double equilateralTriangleArea(final short SUMMATION) {
        return Math.sqrt(((double) SUMMATION / 2) * ((double) SUMMATION / 2 - FIRST_SIDE_LENGTH) * ((double) SUMMATION / 2 - SECOND_SIDE_LENGTH) * ((double) SUMMATION / 2 - THIRD_SIDE_LENGTH));
    }
}