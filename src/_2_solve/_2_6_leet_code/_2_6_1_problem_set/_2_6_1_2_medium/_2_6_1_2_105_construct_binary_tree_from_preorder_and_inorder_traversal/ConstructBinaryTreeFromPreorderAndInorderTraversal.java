package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_105_construct_binary_tree_from_preorder_and_inorder_traversal;

/**
 * <h1>Problem:</h1>
 * <h2>Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.</h2>
 */

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(new ConstructBinaryTreeFromPreorderAndInorderTraversal().buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7}));
    }

    private TreeNode buildTree(final int[] PREORDER, final int[] INORDER) {
        return addNode(PREORDER, INORDER, Integer.MIN_VALUE);
    }

    private int preorderIndex = 0,
            inorderIndex = 0;

    private TreeNode addNode(final int[] PREORDER, final int[] INORDER, final int STOP) {
        if (preorderIndex >= PREORDER.length)
            return null;
        if (INORDER[inorderIndex] == STOP) {
            ++inorderIndex;
            return null;
        }
        final TreeNode NODE = new TreeNode(PREORDER[preorderIndex++]);
        NODE.left = addNode(
                PREORDER,
                INORDER,
                NODE.val
        );
        NODE.right = addNode(
                PREORDER,
                INORDER,
                STOP
        );
        return NODE;
    }
}