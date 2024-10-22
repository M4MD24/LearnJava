package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_106_construct_binary_tree_from_inorder_and_postorder_traversal;

/**
 * <h1>Problem:</h1>
 * <h2>Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree.</h2>
 */

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public static void main(final String[] PARAMETERS) {
        System.out.print(new ConstructBinaryTreeFromInorderAndPostorderTraversal().buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3}));
    }

    private int inorderIndex,
            postorderIndex;

    public TreeNode buildTree(final int[] INORDER, final int[] POSTORDER) {
        inorderIndex = INORDER.length - 1;
        postorderIndex = POSTORDER.length - 1;
        return build(POSTORDER, INORDER, Integer.MIN_VALUE);
    }

    private TreeNode build(final int[] INORDER, final int[] POSTORDER, final int STOP) {
        if (postorderIndex < 0)
            return null;
        if (POSTORDER[inorderIndex] == STOP) {
            inorderIndex--;
            return null;
        }
        final TreeNode NODE = new TreeNode(INORDER[postorderIndex--]);
        NODE.right = build(
                INORDER,
                POSTORDER,
                NODE.val
        );
        NODE.left = build(
                INORDER,
                POSTORDER,
                STOP
        );
        return NODE;
    }
}