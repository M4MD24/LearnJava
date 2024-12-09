package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_427_construct_quad_tree;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given a n * n matrix grid of 0's and 1's only. We want to represent grid with a Quad-Tree.
 * <br/>
 * <br/>
 * Return the root of the Quad-Tree representing grid.
 * <br/>
 * <br/>
 * A Quad-Tree is a tree data structure in which each internal node has exactly four children. Besides, each node has two attributes:
 * </h2>
 * <ul>
 *     <li>val: True if the node represents a grid of 1's or False if the node represents a grid of 0's. Notice that you can assign the val to True or False when isLeaf is False, and both are accepted in the answer.</li>
 *     <li>isLeaf: True if the node is a leaf node on the tree or False if the node has four children.</li>
 * </ul>
 */

public class ConstructQuadTree {
    public static void main(final String[] PARAMETERS) {
        final int[][] GRID = {
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0}
        };
        System.out.print(construct(GRID));
    }

    private static Node construct(final int[][] GRID) {
        System.gc();
        return buildQuadTree(
                GRID,
                0,
                0,
                GRID.length
        );
    }

    private static Node buildQuadTree(
            final int[][] GRID,
            final int START_ROW,
            final int START_COLUMN,
            final int GRID_SIZE
    ) {
        if (isUniform(
                GRID,
                START_ROW,
                START_COLUMN,
                GRID_SIZE
        ))
            return new Node(
                    GRID[START_ROW][START_COLUMN] == 1,
                    true
            );
        else {
            final int HALF_SIZE = GRID_SIZE / 2;
            return new Node(
                    true,
                    false,
                    buildQuadTree(
                            GRID,
                            START_ROW,
                            START_COLUMN,
                            HALF_SIZE
                    ),
                    buildQuadTree(
                            GRID,
                            START_ROW,
                            START_COLUMN + HALF_SIZE,
                            HALF_SIZE
                    ),
                    buildQuadTree(
                            GRID,
                            START_ROW + HALF_SIZE,
                            START_COLUMN,
                            HALF_SIZE
                    ),
                    buildQuadTree(
                            GRID,
                            START_ROW + HALF_SIZE,
                            START_COLUMN + HALF_SIZE,
                            HALF_SIZE
                    )
            );
        }
    }

    private static boolean isUniform(
            final int[][] GRID,
            final int START_ROW,
            final int START_COLUMN,
            final int GRID_SIZE
    ) {
        final int FIRST_VALUE = GRID[START_ROW][START_COLUMN];
        for (int currentRow = START_ROW; currentRow < START_ROW + GRID_SIZE; currentRow++)
            for (int currentColumn = START_COLUMN; currentColumn < START_COLUMN + GRID_SIZE; currentColumn++)
                if (GRID[currentRow][currentColumn] != FIRST_VALUE)
                    return false;
        return true;
    }
}