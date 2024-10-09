package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_s_dzy_loves_chessboard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <h1>S. DZY Loves Chessboard</h1>
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
 * DZY loves chessboard, and he enjoys playing with it.
 * <br/>
 * He has a chessboard of n rows and m columns. Some cells of the chessboard are bad, others are good. For every good cell, DZY wants to put a chessman on it. Each chessman is either white or black. After putting all chessmen, DZY wants that no two chessmen with the same color are on two adjacent cells. Two cells are adjacent if and only if they share a common edge.
 * <br/>
 * You task is to find any suitable placement of chessmen on the given chessboard.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 1 1
 * <br/>
 * .
 * </h2>
 * <h1>Output:</h1>
 * <h2>B</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2 2
 * <br/>
 * ..
 * <br/>
 * ..
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * BW
 * <br/>
 * WB
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3 3
 * <br/>
 * .-.
 * <br/>
 * ---
 * <br/>
 * --.
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * B-B
 * <br/>
 * ---
 * <br/>
 * --B
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first sample, DZY puts a single black chessman. Of course putting a white one is also OK.
 * <br/>
 * In the second sample, all 4 cells are good. No two same chessmen share an edge in the sample output.
 * <br/>
 * In the third sample, no good cells are adjacent. So you can just put 3 chessmen, no matter what their colors are.
 * </h2>
 */

public class DzyLovesChessboardExample {
    private static byte rows, columns;
    private static StringBuffer[] chessboard;

    public static void main(final String[] PARAMETERS) throws IOException {
        inputValues();
        printChessboardPrintThatDzyLoved();
    }

    private static void printChessboardPrintThatDzyLoved() throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        for (byte row = 0; row < rows; row++) {
            for (byte column = 0; column < columns; column++) OUTPUT.write(chessboard[row].charAt(column));
            OUTPUT.newLine();
        }
        OUTPUT.flush();
    }

    private static void inputValues() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final StringTokenizer LINE = new StringTokenizer(INPUT.readLine());
        rows = Byte.parseByte(LINE.nextToken());
        columns = Byte.parseByte(LINE.nextToken());
        chessboard = new StringBuffer[rows];
        boolean isFirst = true;
        for (byte row = 0; row < rows; row++) {
            final String CHESSBOARD_LINE = INPUT.readLine();
            chessboard[row] = new StringBuffer();
            for (byte column = 0; column < columns; column++) {
                chessboard[row].append(CHESSBOARD_LINE.charAt(column) == '-'
                        ? '-'
                        : (isFirst)
                        ? (column % 2 == 0)
                        ? 'B'
                        : 'W'
                        : (column % 2 != 0)
                        ? 'B'
                        : 'W');
            }
            isFirst = !isFirst;
        }
    }
}