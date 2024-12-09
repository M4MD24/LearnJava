package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_a_drawing_task;

import java.util.Scanner;

/**
 * <h1>A. Drawing Task</h1>
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
 * A young little boy is feeling boredom and didn't know what to do. by chance, he read on the internet that: drawing helps get rid of boredom. unfortunately, he didn't know how to draw but he is very creative.so he asks you to help him.
 * <br/>
 * He got an empty grid of size n×m, its rows are numbered from 1 through n and its columns are numbered from 1 through m, and it is initially filled with dots "."
 * <br/>
 * He will give you some instructions and you have to apply them one by one in the order they were given to you or He still feel bored and then kill himself, each instruction contains 4 integers r1,c1,r2,c2 and a lowercase Latin letter c, meaning that have to fill the sub-grid between rows r1 and r2 and columns c1 and c2, with the letter c.
 * <br/>
 * Can you help the little boy ...?
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 6 6 3
 * <br/>
 * 1 1 2 6 a
 * <br/>
 * 5 1 6 6 c
 * <br/>
 * 2 3 5 4 b
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * aaaaaa
 * <br/>
 * aabbaa
 * <br/>
 * ..bb..
 * <br/>
 * ..bb..
 * <br/>
 * ccbbcc
 * <br/>
 * cccccc
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Don't print any extra spaces.</h2>
 */

public class DrawingTaskExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final byte ROWS = INPUT.nextByte(),
            COLUMNS = INPUT.nextByte();
    private static byte countOfLines = INPUT.nextByte();
    private static final char[][] MATRIX = new char[ROWS][COLUMNS];

    public static void main(final String[] PARAMETERS) {
        initializeMatrix();
        inputValues();
        draw();
    }

    private static void draw() {
        for (byte row = 0; row < ROWS; row++) {
            for (byte column = 0; column < COLUMNS; column++)
                System.out.print(MATRIX[row][column]);
            if (row < ROWS - 1) System.out.println();
        }
    }

    private static void initializeMatrix() {
        for (byte row = 0; row < ROWS; row++)
            for (byte column = 0; column < COLUMNS; column++)
                MATRIX[row][column] = '.';
    }

    private static void inputValues() {
        while (countOfLines-- > 0) {
            byte startRow = (byte) (INPUT.nextByte() - 1),
                    startColumn = (byte) (INPUT.nextByte() - 1),
                    endRow = (byte) (INPUT.nextByte() - 1),
                    endColumn = (byte) (INPUT.nextByte() - 1);
            if (startRow > endRow) {
                startRow += endRow;
                endRow = (byte) (startRow - endRow);
                startRow -= endRow;
            }
            if (startColumn > endColumn) {
                startColumn += endColumn;
                endColumn = (byte) (startColumn - endColumn);
                startColumn -= endColumn;
            }
            drawInMatrix(startRow, startColumn, endRow, endColumn, INPUT.next().charAt(0));
        }
    }

    private static void drawInMatrix(byte startRow, byte startColumn, final byte END_ROW, final byte END_COLUMN, final char CHARACTER) {
        for (byte row = startRow; row <= END_ROW; row++)
            for (byte column = startColumn; column <= END_COLUMN; column++)
                MATRIX[row][column] = CHARACTER;
    }
}