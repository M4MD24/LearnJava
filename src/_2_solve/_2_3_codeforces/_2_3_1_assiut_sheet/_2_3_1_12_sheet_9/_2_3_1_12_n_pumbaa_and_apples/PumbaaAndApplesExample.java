package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_n_pumbaa_and_apples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * <h1>N. Pumbaa And Apples</h1>
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
 * <h2>Pop stores some secret information about a farm with n∗m apples represents a rectangle. Each apple has it's own number. The order of apples in the farm is changing. That's why Pop receives the following instructions:</h2>
 * <ul>
 *     <li>The instruction to swap two rows of the farm;</li>
 *     <li>The instruction to swap two columns of the farm;</li>
 *     <li>The instruction to obtain the number of the apple that exists in some cell.</li>
 * </ul>
 * <h2>As Pop is not clever, he asked Alice to execute these instructions.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3 3 5
 * <br/>
 * 1 2 3
 * <br/>
 * 4 5 6
 * <br/>
 * 7 8 9
 * <br/>
 * g 3 2
 * <br/>
 * r 3 2
 * <br/>
 * c 2 3
 * <br/>
 * g 2 2
 * <br/>
 * g 3 2
 * </h2>
 * <h1>Output</h1>
 * <h2>
 * 8
 * <br/>
 * 9
 * <br/>
 * 6
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2 3 3
 * <br/>
 * 1 2 4
 * <br/>
 * 3 1 5
 * <br/>
 * c 2 1
 * <br/>
 * r 1 2
 * <br/>
 * g 1 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>5</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * Let's see how the farm changes in the second test case.
 * <br/>
 * After the first instruction is fulfilled, the table looks like that:
 * <br/>
 * 2 1 4
 * <br/>
 * 1 3 5
 * <br/>
 * After the second instruction is fulfilled, the table looks like that:
 * <br/>
 * 1 3 5
 * <br/>
 * 2 1 4
 * <br/>
 * So the answer to the third instruction (the number located in the first row and in the third column) will be 5.
 * </h2>
 */

public class PumbaaAndApplesExample {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer line;
    private static short rows,
            columns;
    private static int countOfOperations;
    private static int[][] farm;

    public static void main(final String[] ARGUMENTS) throws IOException {
        inputApplesNumbers();
        printFinalResultOfApplesArrangement();
    }

    private static void printFinalResultOfApplesArrangement() throws IOException {
        final short[] APPLES_ROW = new short[rows],
                APPLES_COLUMN = new short[columns];
        initializeApplesNumbersForRowsAndColumn(APPLES_ROW, APPLES_COLUMN);
        for (int index = 0; index < countOfOperations; index++) {
            line = new StringTokenizer(INPUT.readLine());
            final char OPERATION_CHARACTER = line.nextToken().charAt(0);
            final short FIRST_THING_INDEX = (short) (Short.parseShort(line.nextToken()) - 1),
                    SECOND_THING_INDEX = (short) (Short.parseShort(line.nextToken()) - 1);
            switch (OPERATION_CHARACTER) {
                case 'c':
                    swap(APPLES_COLUMN, FIRST_THING_INDEX, SECOND_THING_INDEX);
                    break;
                case 'r':
                    swap(APPLES_ROW, FIRST_THING_INDEX, SECOND_THING_INDEX);
                    break;
                default: {
                    OUTPUT.write(String.valueOf(farm[APPLES_ROW[FIRST_THING_INDEX]][APPLES_COLUMN[SECOND_THING_INDEX]]));
                    OUTPUT.newLine();
                }
            }
        }
        OUTPUT.flush();
    }

    private static void initializeApplesNumbersForRowsAndColumn(final short[] APPLES_ROW, final short[] APPLES_COLUMN) {
        for (short row = 0; row < rows; row++) APPLES_ROW[row] = row;
        for (short column = 0; column < columns; column++) APPLES_COLUMN[column] = column;
    }

    private static void inputApplesNumbers() throws IOException {
        line = new StringTokenizer(INPUT.readLine());
        rows = Short.parseShort(line.nextToken());
        columns = Short.parseShort(line.nextToken());
        countOfOperations = Integer.parseInt(line.nextToken());
        farm = new int[rows][columns];
        for (short row = 0; row < rows; row++) {
            line = new StringTokenizer(INPUT.readLine());
            for (short column = 0; column < columns; column++)
                farm[row][column] = Integer.parseInt(line.nextToken());
        }
    }

    private static void swap(final short[] APPLES, final short FIRST_THING_INDEX, short SECOND_THING_INDEX) {
        APPLES[FIRST_THING_INDEX] += APPLES[SECOND_THING_INDEX];
        APPLES[SECOND_THING_INDEX] = (short) (APPLES[FIRST_THING_INDEX] - APPLES[SECOND_THING_INDEX]);
        APPLES[FIRST_THING_INDEX] -= APPLES[SECOND_THING_INDEX];
    }
}