package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_g_pyramid;

import java.util.Scanner;

/**
 * <h1>G. Pyramid</h1>
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
 * <h2>Given a number N. Print a pyramid of height N.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 *
 * @see _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_g_pyramid.images <h2>Examples and Note</h2>
 */

public class PyramidExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static short length = INPUT.nextShort();
    private static final String SPACE = " ",
            STAR = "*";
    private static short startsCount = 1;
    private static short spacesCount = (short) (length - startsCount);

    public static void main(String[] args) {
        printPyramid();
    }

    private static void printPyramid() {
        if (length-- > 0) {
            System.out.println(returnLine());
            spacesCount--;
            startsCount += 2;
            printPyramid();
        }
    }

    private static StringBuffer returnLine() {
        return new StringBuffer(SPACE.repeat(spacesCount) + STAR.repeat(startsCount));
    }
}