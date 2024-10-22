package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_230_kth_smallest_element_in_a_bst;

/**
 * <h1>Problem:</h1>
 * <h2>Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.</h2>
 */

public class KthSmallestElementInBST {
    public static void main(final String[] PARAMETERS) {
        final TreeNode ROOT = new TreeNode(3);
        ROOT.left = new TreeNode(1);
        ROOT.right = new TreeNode(4);
        ROOT.left.right = new TreeNode(2);
        System.out.print(findKthSmallest(ROOT, 1));
    }

    private static int visitedCount = 0,
            smallestKthValue = 0;

    private static int findKthSmallest(TreeNode rootNode, final int KTH_POSITION) {
        performInOrderTraversal(rootNode, KTH_POSITION);
        return smallestKthValue;
    }

    private static void performInOrderTraversal(final TreeNode CURRENT_NODE, final int KTH_POSITION) {
        if (CURRENT_NODE != null) {
            performInOrderTraversal(CURRENT_NODE.left, KTH_POSITION);
            if (++visitedCount == KTH_POSITION)
                smallestKthValue = CURRENT_NODE.val;
            performInOrderTraversal(CURRENT_NODE.right, KTH_POSITION);
        }
    }
}