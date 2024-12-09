package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_3_hard._2_5_1_3_14_total_n_queens;

public class TotalNQueens {
    public static void main(final String[] PARAMETERS) {
        System.out.println(totalNQueens(1));
        System.out.println(totalNQueens(2));
        System.out.println(totalNQueens(3));
        System.out.print(totalNQueens(4));
    }

    public static int totalNQueens(final int BOARD_SIZE) {
        return solve(
                0,
                BOARD_SIZE,
                new boolean[BOARD_SIZE],
                new boolean[2 * BOARD_SIZE],
                new boolean[2 * BOARD_SIZE]
        );
    }

    private static int solve(final int CURRENT_ROW, final int BOARD_SIZE, final boolean[] OCCUPIED_COLUMNS, final boolean[] OCCUPIED_MAIN_DIAGONALS, final boolean[] OCCUPIED_ANTI_DIAGONALS) {
        if (CURRENT_ROW == BOARD_SIZE)
            return 1;
        else {
            int totalSolutions = 0;
            for (int currentColumn = 0; currentColumn < BOARD_SIZE; currentColumn++) {
                final int MAIN_DIAGONAL_INDEX = CURRENT_ROW - currentColumn + BOARD_SIZE,
                        ANTI_DIAGONAL_INDEX = CURRENT_ROW + currentColumn;
                if (!OCCUPIED_COLUMNS[currentColumn] && !OCCUPIED_MAIN_DIAGONALS[MAIN_DIAGONAL_INDEX] && !OCCUPIED_ANTI_DIAGONALS[ANTI_DIAGONAL_INDEX]) {
                    OCCUPIED_COLUMNS[currentColumn] = OCCUPIED_MAIN_DIAGONALS[MAIN_DIAGONAL_INDEX] = OCCUPIED_ANTI_DIAGONALS[ANTI_DIAGONAL_INDEX] = true;
                    totalSolutions += solve(
                            CURRENT_ROW + 1,
                            BOARD_SIZE,
                            OCCUPIED_COLUMNS,
                            OCCUPIED_MAIN_DIAGONALS,
                            OCCUPIED_ANTI_DIAGONALS
                    );
                    OCCUPIED_COLUMNS[currentColumn] = OCCUPIED_MAIN_DIAGONALS[MAIN_DIAGONAL_INDEX] = OCCUPIED_ANTI_DIAGONALS[ANTI_DIAGONAL_INDEX] = false;
                }
            }
            return totalSolutions;
        }
    }
}