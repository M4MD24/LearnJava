package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_101_symmetric_tree;

/**
 * <h1>Problem:</h1>
 * <h2>Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).</h2>
 */

public class SymmetricTree {
    public static void main(final String[] PARAMETERS) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(isSymmetric(root));
    }

    private static boolean isSymmetric(final TreeNode ROOT) {
        return ROOT == null || isMirror(ROOT.left, ROOT.right);
    }

    private static boolean isMirror(final TreeNode FIRST_BRANCH, final TreeNode SECOND_BRANCH) {
        return FIRST_BRANCH == null &&
                SECOND_BRANCH == null ||
                FIRST_BRANCH != null &&
                        SECOND_BRANCH != null &&
                        FIRST_BRANCH.val == SECOND_BRANCH.val &&
                        isMirror(FIRST_BRANCH.left, SECOND_BRANCH.right) &&
                        isMirror(FIRST_BRANCH.right, SECOND_BRANCH.left);
    }
}