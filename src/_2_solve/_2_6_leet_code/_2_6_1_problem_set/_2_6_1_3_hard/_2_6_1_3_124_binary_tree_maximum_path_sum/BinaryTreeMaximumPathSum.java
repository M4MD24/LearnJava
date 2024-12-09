package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_3_hard._2_6_1_3_124_binary_tree_maximum_path_sum;

/**
 * <h1>Problem:</h1>
 * <h2>
 * A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.
 * <br/>
 * <br/>
 * The path sum of a path is the sum of the node's values in the path.
 * <br/>
 * <br/>
 * Given the root of a binary tree, return the maximum path sum of any non-empty path.
 * </h2>
 */

public class BinaryTreeMaximumPathSum {
    public static void main(final String[] PARAMETERS) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.print(maxPathSum(root));
    }

    private static int maximumPathSum = Integer.MIN_VALUE;

    private static int maxPathSum(final TreeNode ROOT) {
        calculateMaximumPathSum(ROOT);
        return maximumPathSum;
    }

    private static int calculateMaximumPathSum(final TreeNode CURRENT_NODE) {
        if (CURRENT_NODE == null)
            return 0;
        else {
            final int LEFT_SUB_TREE_SUM = Math.max(calculateMaximumPathSum(CURRENT_NODE.left), 0),
                    RIGHT_SUB_TREE_SUM = Math.max(calculateMaximumPathSum(CURRENT_NODE.right), 0);
            maximumPathSum = Math.max(maximumPathSum, CURRENT_NODE.val + LEFT_SUB_TREE_SUM + RIGHT_SUB_TREE_SUM);
            return CURRENT_NODE.val + Math.max(LEFT_SUB_TREE_SUM, RIGHT_SUB_TREE_SUM);
        }
    }
}