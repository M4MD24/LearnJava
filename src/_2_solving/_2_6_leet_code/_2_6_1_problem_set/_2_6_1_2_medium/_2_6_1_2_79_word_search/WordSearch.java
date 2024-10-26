package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_79_word_search;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an m x n grid of characters board and a string word, return true if word exists in the grid.
 * <br/>
 * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
 * </h2>
 */

public class WordSearch {
    public static void main(final String[] PARAMETERS) {
        final char[][] BOARD = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        final String WORD = "ABCCED";
        System.out.print(exist(BOARD, WORD));
    }

    private static boolean exist(final char[][] BOARD, final String WORD) {
        for (int row = 0; row < BOARD.length; row++)
            for (int column = 0; column < BOARD[0].length; column++)
                if (search(
                        BOARD,
                        WORD,
                        row,
                        column,
                        0
                )) return true;
        return false;
    }

    private static boolean search(
            final char[][] BOARD,
            final String WORD,
            final int ROW,
            final int COLUMN,
            final int INDEX
    ) {
        if (INDEX == WORD.length())
            return true;
        else if (ROW < 0 ||
                COLUMN < 0 ||
                ROW >= BOARD.length ||
                COLUMN >= BOARD[0].length ||
                BOARD[ROW][COLUMN] != WORD.charAt(INDEX))
            return false;
        else {
            final char TEMPORARY_CHARACTER = BOARD[ROW][COLUMN];
            BOARD[ROW][COLUMN] = '#';
            final boolean FOUND = search(BOARD, WORD, ROW + 1, COLUMN, INDEX + 1) ||
                    search(BOARD, WORD, ROW - 1, COLUMN, INDEX + 1) ||
                    search(BOARD, WORD, ROW, COLUMN + 1, INDEX + 1) ||
                    search(BOARD, WORD, ROW, COLUMN - 1, INDEX + 1);
            BOARD[ROW][COLUMN] = TEMPORARY_CHARACTER;
            return FOUND;
        }
    }
}