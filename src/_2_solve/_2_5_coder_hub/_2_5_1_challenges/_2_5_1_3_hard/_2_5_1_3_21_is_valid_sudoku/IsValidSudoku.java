package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_3_hard._2_5_1_3_21_is_valid_sudoku;

import java.util.HashSet;
import java.util.Set;

public class IsValidSudoku {
    public static void main(final String[] ARGUMENTS) {
        final String[][] BOARDS = {
                {"53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"},
                {"83..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"},
                {"..3..7...", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"},
                {"55.......", ".........", ".........", ".........", ".........", ".........", ".........", ".........", "........."}
        };

        for (final String[] board : BOARDS)
            System.out.println(
                    isValidSudoku(
                            board
                    )
            );
    }

    private static boolean isValidSudoku(final String[] BOARD) {
        Set<Character>[] rows    = new HashSet[9];
        Set<Character>[] columns = new HashSet[9];
        Set<Character>[] boxes   = new HashSet[9];

        for (int index = 0; index < 9; index++) {
            rows[index] = new HashSet<>();
            columns[index] = new HashSet<>();
            boxes[index] = new HashSet<>();
        }

        for (int row = 0; row < 9; row++) {
            String currentRow = BOARD[row];

            if (currentRow.length() != 9)
                throw new IllegalArgumentException("Each row must have length 9.");

            for (int column = 0; column < 9; column++) {
                final char CHARACTER = currentRow.charAt(column);

                if (CHARACTER == '.')
                    continue;

                if (CHARACTER < '1' || CHARACTER > '9')
                    return false;

                int boxIndex = (row / 3) * 3 + (column / 3);

                if (rows[row].contains(CHARACTER))
                    return false;
                rows[row].add(CHARACTER);

                if (columns[column].contains(CHARACTER))
                    return false;
                columns[column].add(CHARACTER);

                if (boxes[boxIndex].contains(CHARACTER))
                    return false;
                boxes[boxIndex].add(CHARACTER);
            }
        }
        return true;
    }
}
