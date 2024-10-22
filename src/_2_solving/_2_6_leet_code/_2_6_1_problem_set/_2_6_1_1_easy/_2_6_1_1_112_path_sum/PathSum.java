package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_112_path_sum;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
 * <br/>
 * <br/>
 * A leaf is a node with no children.
 * </h2>
 */

public class PathSum {
    public static void main(final String[] PARAMETERS) {
        final TreeNode ROOT = new TreeNode(
                5,
                new TreeNode(
                        4,
                        new TreeNode(
                                11,
                                new TreeNode(7),
                                new TreeNode(2)
                        ),
                        null
                ),
                new TreeNode(
                        8,
                        new TreeNode(13),
                        new TreeNode(4,
                                null,
                                new TreeNode(1)
                        )
                )
        );
        final int TARGET_SUM = 22;
        System.out.print(hasPathSum(ROOT, TARGET_SUM));
    }

    private static boolean hasPathSum(final TreeNode NODE, int sum) {
        if (NODE == null)
            return false;
        else {
            sum -= NODE.val;
            return (NODE.left == null && NODE.right == null && sum == 0) ||
                    hasPathSum(NODE.left, sum) ||
                    hasPathSum(NODE.right, sum);
        }
    }
}