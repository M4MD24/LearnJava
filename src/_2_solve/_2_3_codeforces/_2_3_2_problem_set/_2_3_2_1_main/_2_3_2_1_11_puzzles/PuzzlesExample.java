package _2_solve._2_3_codeforces._2_3_2_problem_set._2_3_2_1_main._2_3_2_1_11_puzzles;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>F. Puzzles</h1>
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
 * <h2>
 * The end of the school year is near and Ms. Manana, the teacher, will soon have to say goodbye to a yet another class. She decided to prepare a goodbye present for her n students and give each of them a jigsaw puzzle (which, as wikipedia states, is a tiling puzzle that requires the assembly of numerous small, often oddly shaped, interlocking and tessellating pieces).
 * <br/>
 * The shop assistant told the teacher that there are m puzzles in the shop, but they might differ in difficulty and size. Specifically, the first jigsaw puzzle consists of f1 pieces, the second one consists of f2 pieces and so on.
 * <br/>
 * Ms. Manana doesn't want to upset the children, so she decided that the difference between the numbers of pieces in her presents must be as small as possible. Let A be the number of pieces in the largest puzzle that the teacher buys and B be the number of pieces in the smallest such puzzle. She wants to choose such n puzzles that A-B is minimum possible. Help the teacher and find the least possible value of A-B.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4 6
 * <br/>
 * 10 12 10 7 5 22
 * </h2>
 * <h1>Output:</h1>
 * <h2>5</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Sample 1. The class has 4 students. The shop sells 6 puzzles. If Ms. Manana buys the first four puzzles consisting of 10, 12, 10 and 7 pieces correspondingly, then the difference between the sizes of the largest and the smallest puzzle will be equal to 5. It is impossible to obtain a smaller difference. Note that the teacher can also buy puzzles 1, 3, 4 and 5 to obtain the difference 5.</h2>
 */

public class PuzzlesExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final byte COUNT_OF_STUDENTS = INPUT.nextByte(),
            PUZZLES_COUNT = INPUT.nextByte();
    private static final short[] PUZZLES = new short[PUZZLES_COUNT];

    public static void main(final String[] ARGUMENTS) {
        inputPuzzles();
        Arrays.sort(PUZZLES);
        System.out.print(returnCountOfMinimumDifference());
    }

    private static short returnCountOfMinimumDifference() {
        short minDifference = (short) (PUZZLES[COUNT_OF_STUDENTS - 1] - PUZZLES[0]);
        for (byte index = 1; index <= PUZZLES_COUNT - COUNT_OF_STUDENTS; index++) {
            final short DIFFERENCE = (short) (PUZZLES[index + COUNT_OF_STUDENTS - 1] - PUZZLES[index]);
            minDifference = (short) Math.min(minDifference, DIFFERENCE);
        }
        return minDifference;
    }

    private static void inputPuzzles() {
        for (byte index = 0; index < PUZZLES_COUNT; index++) PUZZLES[index] = INPUT.nextShort();
    }
}