package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_133;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find a path from top left to bottom in the right direction which minimizes the sum of all numbers along its path.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Move either down or right at any point in time.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Sum of all numbers along its path: 13</h2>
 */

public class Question133 {
    public static String minimumPathSum(final int[][] GRID) {
        if (GRID == null || GRID.length == 0 || GRID[0] == null || GRID[0].length == 0) return "Nothing";
        final int HEIGHT = GRID.length,
                WIDTH = GRID[0].length;
        int[][] temporary = new int[HEIGHT][WIDTH];

        for (int index = 0; index < HEIGHT; index++) {
            for (int index2 = 0; index2 < WIDTH; index2++) {
                if (index == 0 && index2 == 0) {
                    temporary[index][index2] = GRID[index][index2];
                    continue;
                }
                final int FROM_UP = index == 0 ? Integer.MAX_VALUE : temporary[index - 1][index2],
                        FROM_LEFT = index2 == 0 ? Integer.MAX_VALUE : temporary[index][index2 - 1];
                temporary[index][index2] = Math.min(FROM_UP, FROM_LEFT) + GRID[index][index2];
            }
        }
        return String.valueOf(temporary[HEIGHT - 1][WIDTH - 1]);
    }

    public static void main(final String[] PARAMETERS) {
        final int[][] GRID = new int[][]{
                {7, 4, 2},
                {0, 5, 6},
                {3, 1, 2}
        };
        System.out.println("Sum of all numbers along its path: " + minimumPathSum(GRID));
    }
}