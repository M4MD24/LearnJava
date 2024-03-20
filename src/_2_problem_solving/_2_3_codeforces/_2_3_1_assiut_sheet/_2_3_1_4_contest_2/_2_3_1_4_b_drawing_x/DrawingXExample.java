package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_4_contest_2._2_3_1_4_b_drawing_x;

import java.util.Scanner;

/**
 * <h1>B. Drawing X</h1>
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
 * <h2>
 * Some day, an artist wanted to draw an X mark on the wall in a fashionable way.
 * <br/>
 * He wanted to do so by grouping snippets of slashes /, backslashes \, asterisks * and a capital X letter in an N×N
 * square as shown in the sample.
 * <br/>
 * Can you help him?
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5</h2>
 * <h1>Output:</h1>
 */
// \***/
// *\*/*
// **X**
// */*\*
// /***\

public class DrawingXExample {
    public static void main(String[] args) {
        final Scanner INPUT = new Scanner(System.in);
        final byte LENGTH = INPUT.nextByte();
        printX(LENGTH);
    }

    private static void printX(final byte LENGTH) {
        if (LENGTH > 0) {
            final String SPACE = "*",
                    LEFT_BRANCH = "\\",
                    RIGHT_BRANCH = "/",
                    MIDDLE = "X";
            if (LENGTH == 1) System.out.print(MIDDLE);
            else if (LENGTH == 2) {
                System.out.println(LEFT_BRANCH + RIGHT_BRANCH);
                System.out.print(RIGHT_BRANCH + LEFT_BRANCH);
            } else {
                if (isOdd(LENGTH)) {
                    final byte MIDDLE_LENGTH = (byte) (LENGTH / 2);
                    byte startLength = 0,
                            endLength = (byte) (LENGTH - 1);
                    for (byte round = 0; round < LENGTH; round++, startLength++, endLength--) {
                        boolean printLeftBranch = true,
                                printRightBranch = true;
                        for (byte index = 0; index < LENGTH; index++) {
                            boolean printLeftBranchCondition = printLeftBranch && index == startLength && index != MIDDLE_LENGTH,
                                    printMiddleCondition = printLeftBranch && printRightBranch && round == MIDDLE_LENGTH && index == MIDDLE_LENGTH,
                                    printRightBranchCondition = printRightBranch && index == endLength && index != MIDDLE_LENGTH;
                            if (printLeftBranchCondition) {
                                System.out.print(LEFT_BRANCH);
                                printLeftBranch = false;
                            }
                            if (printMiddleCondition) {
                                System.out.print(MIDDLE);
                                printLeftBranch = false;
                                printRightBranch = false;
                            }
                            if (printRightBranchCondition) {
                                System.out.print(RIGHT_BRANCH);
                                printRightBranch = false;
                            }
                            if (!printLeftBranchCondition && !printMiddleCondition && !printRightBranchCondition) System.out.print(SPACE);
                        }
                        if (round != LENGTH - 1) System.out.println();
                    }
                }
            }
        }
    }

    private static boolean isOdd(final byte LENGTH) {
        return LENGTH % 2 != 0;
    }
}