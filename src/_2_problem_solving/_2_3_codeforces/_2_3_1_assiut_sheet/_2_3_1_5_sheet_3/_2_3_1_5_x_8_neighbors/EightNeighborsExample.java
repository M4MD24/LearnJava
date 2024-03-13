package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_x_8_neighbors;

import java.util.Scanner;

/**
 * <h1>X. 8 Neighbors</h1>
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
 * <h2>Given two numbers N and M, a 2D array A of size N * M which contains 'x' or '.' only and two numbers X, Y which donates a cell position in A such that X is the row number and Y is the column number. Determine whether all neighbors of the given cell are 'x' or not.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>The neighbor cell is any cell that shares an edge or a corner and it should be inside 2D array.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3 3
 * <br/>
 * xxx
 * <br/>
 * x.x
 * <br/>
 * xxx
 * <br/>
 * 2 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>yes</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3 3
 * <br/>
 * xxx
 * <br/>
 * xxx
 * <br/>
 * xx.
 * <br/>
 * 2 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>no</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3 3
 * <br/>
 * xxx
 * <br/>
 * xxx
 * <br/>
 * xxx
 * <br/>
 * 1 1
 * </h2>
 * <h1>Output:</h1>
 * <h2>yes</h2>
 */

public class EightNeighborsExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final byte ROWS = INPUT.nextByte(),
            COLUMNS = INPUT.nextByte();
    private static final char[][] NEIGHBORS = new char[ROWS][COLUMNS];

    public static void main(String[] args) {
        inputValues();
        System.out.print(checkNeighborExists(INPUT.nextByte(), INPUT.nextByte()));
    }

    private static String checkNeighborExists(final byte IN_ROW, final byte IN_COLUMN) {
        final byte[] ROW_DYMENSION = {0, 1, 1, 1, 0, -1, -1, -1},
                COLUMN_DYMENSION = {1, 1, 0, -1, -1, -1, 0, 1};
        for (byte index = 0; index < 8; index++) {
            final byte SELECTED_ROW = (byte) (IN_ROW - 1 + ROW_DYMENSION[index]),
                    SELECTED_COLUMN = (byte) (IN_COLUMN - 1 + COLUMN_DYMENSION[index]);
            if (SELECTED_ROW >= 0 &&
                    SELECTED_ROW < ROWS &&
                    SELECTED_COLUMN >= 0 &&
                    SELECTED_COLUMN < COLUMNS &&
                    NEIGHBORS[SELECTED_ROW][SELECTED_COLUMN] == '.')
                return "no";
        }
        return "yes";
    }

    private static void inputValues() {
        for (byte row = 0; row < ROWS; row++) {
            final String SEQUENCE = INPUT.next();
            for (byte column = 0; column < COLUMNS; column++)
                NEIGHBORS[row][column] = SEQUENCE.charAt(column);
        }
    }
}