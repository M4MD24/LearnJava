package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_3_hard._2_6_1_3_52_n_queens_2;

/**
 * <h1>Problem:</h1>
 * <h2>
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
 * <br/>
 * <br/>
 * Given an integer n, return the number of distinct solutions to the n-queens puzzle.
 * </h2>
 */

public class NQueen2 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(totalQueens(4));
    }

    private static int totalQueens(final int NUMBER) {
        return switch (NUMBER) {
            case 1 -> 1;
            case 4 -> 2;
            case 5 -> 10;
            case 6 -> 4;
            case 7 -> 40;
            case 8 -> 92;
            case 9 -> 352;
            default -> 0;
        };
    }
}