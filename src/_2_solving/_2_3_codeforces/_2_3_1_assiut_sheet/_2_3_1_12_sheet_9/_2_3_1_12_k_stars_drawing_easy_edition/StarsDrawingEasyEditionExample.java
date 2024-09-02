package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_k_stars_drawing_easy_edition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>K. Stars Drawing (Easy Edition)</h1>
 * <h2>
 * time limit per test: 3 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first example the output
 * <br/>
 * 2
 * <br/>
 * 3 4 1
 * <br/>
 * 3 5 2
 * <br/>
 * is also correct.
 * </h2>
 *
 * @see _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_k_stars_drawing_easy_edition.images <h2>Question and Examples</h2>
 */

public class StarsDrawingEasyEditionExample {
    static class Star {
        final byte ROW, COLUMN;
        int ARM_LENGTH;

        Star(final byte ROW, final byte COLUMN, final int ARM_LENGTH) {
            this.ROW = ROW;
            this.COLUMN = COLUMN;
            this.ARM_LENGTH = ARM_LENGTH;
        }
    }

    static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    static byte ROWS, COLUMNS;
    static char[][] SHAPE;
    static byte[][] ANOTHER_SHAPE;
    static int countOfStars, countOFBigStars = 0, allCutOutShapeCanMakeStars = 1;
    static final Star[] STARS = new Star[9604];

    public static void main(final String[] ARGS) throws IOException {
        inputCutOutShape();
        findBigStars();
        checkHighlightingCutOutShape();
        printStarsArmLengthReports();
    }

    static void checkHighlightingCutOutShape() {
        for (byte row = 0; row < ROWS; row++)
            for (byte column = 0; column < COLUMNS; column++)
                if (SHAPE[row][column] == '*' && ANOTHER_SHAPE[row][column] == 0) {
                    allCutOutShapeCanMakeStars = 0;
                    break;
                }
    }

    static void findBigStars() {
        for (byte row = 1; row < ROWS - 1; row++) {
            for (byte column = 1; column < COLUMNS - 1; column++) {
                countOfStars = 0;
                if (SHAPE[row][column] == '*') findStar(row, column);
                if (countOfStars > 0) STARS[countOFBigStars++] = new Star(row, column, countOfStars);
            }
        }
    }

    static void printStarsArmLengthReports() {
        if (allCutOutShapeCanMakeStars == 1) {
            System.out.println(countOFBigStars);
            for (int index = 0; index < countOFBigStars; index++) System.out.println((STARS[index].ROW + 1) + " " + (STARS[index].COLUMN + 1) + " " + STARS[index].ARM_LENGTH);
        } else System.out.print(-1);
    }

    static boolean check(final byte ROW, final byte COLUMN, final int INDEX) {
        return (ROW + INDEX < ROWS && ROW - INDEX > -1 && COLUMN + INDEX < COLUMNS && COLUMN - INDEX > -1);
    }

    static void findStar(final byte ROW, final byte COLUMN) {
        if (!check(ROW, COLUMN, 1) || SHAPE[ROW + 1][COLUMN] == '.' || SHAPE[ROW - 1][COLUMN] == '.' || SHAPE[ROW][COLUMN + 1] == '.' || SHAPE[ROW][COLUMN - 1] == '.') return;
        ANOTHER_SHAPE[ROW][COLUMN]++;
        for (int index = 1; check(ROW, COLUMN, index); index++) {
            if (SHAPE[ROW + index][COLUMN] == '.' || SHAPE[ROW - index][COLUMN] == '.' || SHAPE[ROW][COLUMN + index] == '.' || SHAPE[ROW][COLUMN - index] == '.') break;
            else {
                countOfStars++;
                ANOTHER_SHAPE[ROW + index][COLUMN]++;
                ANOTHER_SHAPE[ROW - index][COLUMN]++;
                ANOTHER_SHAPE[ROW][COLUMN + index]++;
                ANOTHER_SHAPE[ROW][COLUMN - index]++;
            }
        }
    }

    static void inputCutOutShape() throws IOException {
        final String[] DIMENSIONS = INPUT.readLine().split("\\s+");
        ROWS = Byte.parseByte(DIMENSIONS[0]);
        COLUMNS = Byte.parseByte(DIMENSIONS[1]);
        SHAPE = new char[ROWS][COLUMNS];
        ANOTHER_SHAPE = new byte[ROWS][COLUMNS];
        for (int row = 0; row < ROWS; row++) SHAPE[row] = INPUT.readLine().toCharArray();
    }
}