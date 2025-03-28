package _2_solve._2_3_codeforces._2_3_2_problem_set._2_3_2_1_main._2_3_2_1_20_help_vasilisa_the_wise_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashSet;

/**
 * <h1>J. Help Vasilisa the Wise 2</h1>
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
 * <h1>Input:</h1>
 * <h2>
 * 3 7
 * <br/>
 * 4 6
 * <br/>
 * 5 5
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 1 2
 * <br/>
 * 3 4
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 11 10
 * <br/>
 * 13 8
 * <br/>
 * 5 16
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 4 7
 * <br/>
 * 9 1
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 1 2
 * <br/>
 * 3 4
 * <br/>
 * 5 6
 * </h2>
 * <h1>Output:</h1>
 * <h2>-1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 10 10
 * <br/>
 * 10 10
 * <br/>
 * 10 10
 * </h2>
 * <h1>Output:</h1>
 * <h2>-1</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Pay attention to the last test from the statement: it is impossible to open the box because for that Vasilisa the Wise would need 4 identical gems containing number "5". However, Vasilisa only has one gem with each number from 1 to 9.</h2>
 *
 * @see _2_solve._2_3_codeforces._2_3_2_problem_set._2_3_2_1_main._2_3_2_1_20_help_vasilisa_the_wise_2.images <h2>Question</h2>
 */

public class HelpVasilisaTheWiseTwoExample {
    private static byte sumOfFirstRow, sumOfSecondRow, sumOfFirstColumn, sumOfSecondColumn, sumOfFirstDiagonal, sumOfSecondDiagonal;

    public static void main(final String[] ARGUMENTS) throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        inputValues();
        OUTPUT.write(String.valueOf(getGemsNumbers(sumOfFirstRow, sumOfSecondRow, sumOfFirstColumn, sumOfSecondColumn, sumOfFirstDiagonal, sumOfSecondDiagonal)));
        OUTPUT.flush();
    }

    private static void inputValues() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer line = new StringTokenizer(INPUT.readLine());
        sumOfFirstRow = Byte.parseByte(line.nextToken());
        sumOfSecondRow = Byte.parseByte(line.nextToken());
        line = new StringTokenizer(INPUT.readLine());
        sumOfFirstColumn = Byte.parseByte(line.nextToken());
        sumOfSecondColumn = Byte.parseByte(line.nextToken());
        line = new StringTokenizer(INPUT.readLine());
        sumOfFirstDiagonal = Byte.parseByte(line.nextToken());
        sumOfSecondDiagonal = Byte.parseByte(line.nextToken());
    }

    private static StringBuffer getGemsNumbers(final byte SUM_OF_FIRST_ROW, final byte SUM_OF_SECOND_ROW, final byte SUM_OF_FIRST_COLUMN, final byte SUM_OF_SECOND_COLUMN, final byte SUM_OF_FIRST_DIAGONAL, final byte SUM_OF_SECOND_DIAGONAL) {
        final byte SUM_OF_ROWS = (byte) (SUM_OF_FIRST_ROW + SUM_OF_SECOND_ROW),
                SUM_OF_COLUMNS = (byte) (SUM_OF_FIRST_COLUMN + SUM_OF_SECOND_COLUMN),
                SUM_OF_DIAGONALS = (byte) (SUM_OF_FIRST_DIAGONAL + SUM_OF_SECOND_DIAGONAL);
        if (SUM_OF_FIRST_ROW > 18 || SUM_OF_SECOND_ROW > 18 || SUM_OF_FIRST_COLUMN > 18 || SUM_OF_SECOND_COLUMN > 18 || SUM_OF_FIRST_DIAGONAL > 18 || SUM_OF_SECOND_DIAGONAL > 18 || SUM_OF_ROWS != SUM_OF_COLUMNS || SUM_OF_COLUMNS != SUM_OF_DIAGONALS) return new StringBuffer("-1");
        else {
            final HashSet<Byte> GEMS = new HashSet<>();
            final byte FIRST_GEM = (byte) (((SUM_OF_FIRST_ROW + SUM_OF_FIRST_COLUMN) - SUM_OF_SECOND_DIAGONAL) / 2),
                    SECOND_GEM = (byte) (((SUM_OF_FIRST_ROW + SUM_OF_SECOND_COLUMN) - SUM_OF_FIRST_DIAGONAL) / 2),
                    THIRD_GEM = (byte) (((SUM_OF_SECOND_ROW + SUM_OF_FIRST_COLUMN) - SUM_OF_FIRST_DIAGONAL) / 2),
                    FOURTH_GEM = (byte) (((SUM_OF_SECOND_COLUMN + SUM_OF_SECOND_ROW) - SUM_OF_SECOND_DIAGONAL) / 2);
            GEMS.add(FIRST_GEM);
            GEMS.add(SECOND_GEM);
            GEMS.add(THIRD_GEM);
            GEMS.add(FOURTH_GEM);
            if (GEMS.size() < 4 || FIRST_GEM > 9 || FIRST_GEM < 1 || SECOND_GEM > 9 || SECOND_GEM < 1 || THIRD_GEM > 9 || THIRD_GEM < 1 || FOURTH_GEM > 9 || FOURTH_GEM < 1) return new StringBuffer("-1");
            else return new StringBuffer(FIRST_GEM + " " + SECOND_GEM + "\n" + THIRD_GEM + " " + FOURTH_GEM);
        }
    }
}