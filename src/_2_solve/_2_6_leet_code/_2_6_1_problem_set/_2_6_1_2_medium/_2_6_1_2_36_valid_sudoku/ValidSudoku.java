package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_36_valid_sudoku;

/**
 * <h1>Problem:</h1>
 * <h2>Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:</h2>
 * <ol>
 * <br/>
 * <li>Each row must contain the digits 1-9 without repetition.</li>
 * <br/>
 * <li>Each column must contain the digits 1-9 without repetition.</li>
 * <br/>
 * <li>Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.</li>
 * </ol>
 * <br/>
 * <h1>Note:</h1>
 * <ul>
 * <li>A Sudoku board (partially filled) could be valid but is not necessarily solvable.</li>
 * <br/>
 * <li>Only the filled cells need to be validated according to the mentioned rules.</li>
 * </ul>
 */

public class ValidSudoku {
    public static void main(final String[] ARGUMENTS) {
        final char[][] BOARD = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
//        final char[][] BOARD = new char[][]{
//                {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
//                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
//                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
//                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
//                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
//                {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
//                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
//                {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
//                {'.', '.', '4', '.', '.', '.', '.', '.', '.'}
//        };
//        final char[][] BOARD = new char[][]{
//                {'1', '2', '3', '4', '5', '6', '7', '8', '9'},
//                {'1', '2', '3', '4', '5', '6', '7', '8', '9'},
//                {'1', '2', '3', '4', '5', '6', '7', '8', '9'},
//                {'1', '2', '3', '4', '5', '6', '7', '8', '9'},
//                {'1', '2', '3', '4', '5', '6', '7', '8', '9'},
//                {'1', '2', '3', '4', '5', '6', '7', '8', '9'},
//                {'1', '2', '3', '4', '5', '6', '7', '8', '9'},
//                {'1', '2', '3', '4', '5', '6', '7', '8', '9'},
//                {'1', '2', '3', '4', '5', '6', '7', '8', '9'},
//        };
        System.out.print(isValidSudoku(BOARD));
    }

    private static boolean isValidSudoku(final char[][] BOARD) {
        final boolean[][] ROWS = new boolean[9][9],
                COLUMNS = new boolean[9][9],
                BOXES = new boolean[9][9];
        for (int row = 0; row < 9; row++)
            for (int column = 0; column < 9; column++) {
                final char CURRENT_DIGIT_CHARACTER = BOARD[row][column];
                if (CURRENT_DIGIT_CHARACTER != '.') {
                    final int NUMBER = CURRENT_DIGIT_CHARACTER - '1',
                            BOX_INDEX = (row / 3) * 3 + column / 3;
                    if (ROWS[row][NUMBER] || COLUMNS[column][NUMBER] || BOXES[BOX_INDEX][NUMBER])
                        return false;
                    else
                        ROWS[row][NUMBER] = COLUMNS[column][NUMBER] = BOXES[BOX_INDEX][NUMBER] = true;
                }
            }
        return true;
    }

// >
    /*private static boolean isValidSudoku(final char[][] BOARD) {
        return areBoardRowsValid(BOARD) &&
                areBoardColumnsValid(BOARD) &&
                areSubBoxesValid(BOARD);
    }

    private static boolean[] digits_seen;

    private static boolean areSubBoxesValid(final char[][] BOARD) {
        for (int countOfRowSubBox = 0; countOfRowSubBox < 9; countOfRowSubBox += 3)
            for (int countOfColumnSubBox = 0; countOfColumnSubBox < 9; countOfColumnSubBox += 3) {
                digits_seen = new boolean[9];
                for (int row = countOfRowSubBox; row < countOfRowSubBox + 3; row++)
                    for (int column = countOfColumnSubBox; column < countOfColumnSubBox + 3; column++) {
                        final char CURRENT_DIGIT = BOARD[row][column];
                        if (CURRENT_DIGIT != '.') {
                            if (digits_seen[CURRENT_DIGIT - '1'])
                                return false;
                            digits_seen[CURRENT_DIGIT - '1'] = true;
                        }
                    }
            }
        return true;
    }

    private static boolean areBoardRowsValid(final char[][] BOARD) {
        for (int row = 0; row < 9; row++) {
            digits_seen = new boolean[9];
            for (int column = 0; column < 9; column++) {
                final char CURRENT_DIGIT = BOARD[row][column];
                if (CURRENT_DIGIT != '.') {
                    if (digits_seen[CURRENT_DIGIT - '1'])
                        return false;
                    digits_seen[CURRENT_DIGIT - '1'] = true;
                }
            }
        }
        return true;
    }

    private static boolean areBoardColumnsValid(final char[][] BOARD) {
        for (int column = 0; column < 9; column++) {
            digits_seen = new boolean[9];
            for (int row = 0; row < 9; row++) {
                final char CURRENT_DIGIT = BOARD[row][column];
                if (CURRENT_DIGIT != '.') {
                    if (digits_seen[CURRENT_DIGIT - '1'])
                        return false;
                    digits_seen[CURRENT_DIGIT - '1'] = true;
                }
            }
        }
        return true;
    }*/
}