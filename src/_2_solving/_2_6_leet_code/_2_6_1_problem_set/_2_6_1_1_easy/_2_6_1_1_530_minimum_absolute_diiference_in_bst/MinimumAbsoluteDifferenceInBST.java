package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_530_minimum_absolute_diiference_in_bst;

/**
 * <h1>Problem:</h1>
 * <h2>Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.</h2>
 */

public class MinimumAbsoluteDifferenceInBST {
    public static void main(final String[] PARAMETERS) {
        final TreeNode ROOT = new TreeNode(4);
        ROOT.left = new TreeNode(2);
        ROOT.right = new TreeNode(6);
        ROOT.left.left = new TreeNode(1);
        ROOT.left.right = new TreeNode(3);
        System.out.print(getMinimumDifference(ROOT));
    }

    private static int previousValue = -1;
    private static int minimumDifference = Integer.MAX_VALUE;

    private static int getMinimumDifference(final TreeNode ROOT) {
        performInOrderTraversal(ROOT);
        return minimumDifference;
    }

    private static void performInOrderTraversal(final TreeNode NODE) {
        if (NODE != null) {
            performInOrderTraversal(NODE.left);
            if (previousValue >= 0)
                minimumDifference = Math.min(minimumDifference, NODE.val - previousValue);
            previousValue = NODE.val;
            performInOrderTraversal(NODE.right);
        }
    }
}