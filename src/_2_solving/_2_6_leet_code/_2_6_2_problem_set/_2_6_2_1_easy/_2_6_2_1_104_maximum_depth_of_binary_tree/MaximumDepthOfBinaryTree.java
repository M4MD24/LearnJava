package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_1_easy._2_6_2_1_104_maximum_depth_of_binary_tree;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given the root of a binary tree, return its maximum depth.
 * <br/>
 * <br/>
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * </h2>
 */

public class MaximumDepthOfBinaryTree {
    public static void main(final String[] PARAMETERS) {
        final TreeNode ROOT = new TreeNode(3);
        ROOT.left = new TreeNode(9);
        ROOT.right = new TreeNode(20);
        ROOT.right.left = new TreeNode(15);
        ROOT.right.right = new TreeNode(7);
        System.out.print(maxDepth(ROOT));
    }

    private static int maxDepth(final TreeNode ROOT) {
        if (ROOT == null)
            return 0;
        else
            return Math.max(maxDepth(ROOT.left), maxDepth(ROOT.right)) + 1;
    }
}