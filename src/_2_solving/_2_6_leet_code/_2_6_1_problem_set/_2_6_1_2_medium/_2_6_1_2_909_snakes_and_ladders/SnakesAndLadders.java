package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_909_snakes_and_ladders;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given an n x n integer matrix board where the cells are labeled from 1 to n2 in a Boustrophedon style starting from the bottom left of the board (i.e. board[n - 1][0]) and alternating direction each row.
 * <br/>
 * <br/>
 * You start on square 1 of the board. In each move, starting from square curr, do the following:
 * </h2>
 * <br/>
 * <ul>
 *     <li>Choose a destination square next with a label in the range [curr + 1, min(curr + 6, n2)].
 *         <ul>
 *             <li>This choice simulates the result of a standard 6-sided die roll: i.e., there are always at most 6 destinations, regardless of the size of the board.</li>
 *         </ul>
 *     </li>
 *     <li>If next has a snake or ladder, you must move to the destination of that snake or ladder. Otherwise, you move to next.</li>
 *     <li>The game ends when you reach the square n2.</li>
 * </ul>
 * <br/>
 * <h2>
 * A board square on row r and column c has a snake or ladder if board[r][c] != -1. The destination of that snake or ladder is board[r][c]. Squares 1 and n2 are not the starting points of any snake or ladder.
 * <br/>
 * <br/>
 * Note that you only take a snake or ladder at most once per move. If the destination to a snake or ladder is the start of another snake or ladder, you do not follow the subsequent snake or ladder.
 * <br/>
 * <br/>
 * For example, suppose the board is [[-1,4],[-1,3]], and on the first move, your destination square is 2. You follow the ladder to square 3, but do not follow the subsequent ladder to 4.
 * <br/>
 * <br/>
 * Return the least number of moves required to reach the square n2. If it is not possible to reach the square, return -1.
 * </h2>
 */

public class SnakesAndLadders {
    public static void main(final String[] PARAMETERS) {
        final int[][] BOARD = new int[][]{
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 35, -1, -1, 13, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 15, -1, -1, -1, -1}
        };
        System.out.print(snakesAndLadders(BOARD));
    }

    private static int snakesAndLadders(final int[][] BOARD) {
        final int MAXIMUM_LENGTH = BOARD.length,
                TARGET_SQUARE = MAXIMUM_LENGTH * MAXIMUM_LENGTH;
        final int[] FLAT_BOARD = flattenBoard(BOARD, MAXIMUM_LENGTH);
        final Queue<Integer> POSITIONS = new LinkedList<>();
        final boolean[] VISITED = new boolean[TARGET_SQUARE + 1];
        POSITIONS.offer(1);
        VISITED[1] = true;
        for (int moves = 0; !POSITIONS.isEmpty(); moves++)
            for (int size = POSITIONS.size(); size > 0; size--) {
                assert POSITIONS.peek() != null;
                final int CURRENT_SQUARE = POSITIONS.poll();
                if (CURRENT_SQUARE == TARGET_SQUARE)
                    return moves;
                else
                    for (int nextSquare = CURRENT_SQUARE + 1; nextSquare <= Math.min(CURRENT_SQUARE + 6, TARGET_SQUARE); nextSquare++) {
                        final int DESTINATION_SQUARE = FLAT_BOARD[nextSquare] == -1
                                ? nextSquare
                                : FLAT_BOARD[nextSquare];
                        if (!VISITED[DESTINATION_SQUARE]) {
                            VISITED[DESTINATION_SQUARE] = true;
                            POSITIONS.offer(DESTINATION_SQUARE);
                        }
                    }
            }
        return -1;
    }

    private static int[] flattenBoard(final int[][] BOARD, final int SIZE) {
        final int[] FLATTENED_BOARD = new int[SIZE * SIZE + 1];
        boolean moveLeftToRight = true;
        for (int row = SIZE - 1, index = 1; row >= 0; row--, moveLeftToRight = !moveLeftToRight)
            if (moveLeftToRight)
                for (int column = 0; column < SIZE; column++)
                    FLATTENED_BOARD[index++] = BOARD[row][column];
            else
                for (int column = SIZE - 1; column >= 0; column--)
                    FLATTENED_BOARD[index++] = BOARD[row][column];
        return FLATTENED_BOARD;
    }
}
