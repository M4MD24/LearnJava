package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_6_contest_3_1._2_3_1_6_a_square_or_rectangle;

import java.util.Scanner;

/**
 * <h1>A. Square or Rectangle</h1>
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
 * <h2>Given the width and the height of a shape determine whether it's for a square or a rectangle?</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 10 10
 * <br/>
 * 13 200
 * <br/>
 * 300 300
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * Square
 * <br/>
 * Rectangle
 * <br/>
 * Square
 * </h2>
 */

public class SquareOrRectangleExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        short countOfTestCases = INPUT.nextShort();
        while (countOfTestCases > 0) {
            System.out.print(squareOrRectangle(INPUT.nextInt(), INPUT.nextInt()));
            if (countOfTestCases-- > 1) System.out.println();
        }
    }

    private static String squareOrRectangle(final int LENGTH, final int WIDTH) {
        if (LENGTH == WIDTH) return "Square";
        else return "Rectangle";
    }
}