package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_f_fox_and_snake;

import java.util.Scanner;

/**
 * <h1>F. Fox and Snake</h1>
 * <h2>
 * time limit per test: 2 second
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
 * Fox Ciel starts to learn programming. The first task is drawing a fox! However, that turns out to be too hard for a beginner, so she decides to draw a snake instead.
 * <br/>
 * A snake is a pattern on a n by m table. Denote c-th cell of r-th row as (r, c). The tail of the snake is located at (1, 1), then it's body extends to (1, m), then goes down 2 rows to (3, m), then goes left to (3, 1) and so on.
 * <br/>
 * Your task is to draw this snake for Fox Ciel: the empty cells should be represented as dot characters ('.') and the snake cells should be filled with number signs ('#').
 * <br/>
 * Consider sample tests in order to understand the snake pattern.
 * </h2>
 *
 * @see _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_f_fox_and_snake.images <h2>Examples</h2>
 */

public class FoxAndSnakeExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        printShape(INPUT.nextByte(), INPUT.nextByte());
    }

    private static void printShape(final byte ROWS, final byte COLUMNS) {
        boolean isRight = true;
        for (byte row = 0; row < ROWS; row++) {
            if (row % 2 == 0)
                System.out.println("#".repeat(COLUMNS));
            else {
                System.out.println(isRight
                        ? ".".repeat(COLUMNS - 1) + "#"
                        : "#" + ".".repeat(COLUMNS - 1));
                isRight = !isRight;
            }
        }
    }
}