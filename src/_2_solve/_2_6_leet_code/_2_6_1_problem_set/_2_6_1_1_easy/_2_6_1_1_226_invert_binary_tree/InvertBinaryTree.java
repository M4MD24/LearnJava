package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_226_invert_binary_tree;

/**
 * <h1>Problem:</h1>
 * <h2>Given the root of a binary tree, invert the tree, and return its root.</h2>
 */

public class InvertBinaryTree {
    public static void main(final String[] PARAMETERS) {
        final TreeNode HEAD_NODE = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.print(invertTree(HEAD_NODE));

    }

    private static TreeNode invertTree(final TreeNode ROOT) {
        if (ROOT == null)
            return null;
        else {
            final TreeNode TEMPORARY_BRANCH = ROOT.left;
            ROOT.left = invertTree(ROOT.right);
            ROOT.right = invertTree(TEMPORARY_BRANCH);
            return ROOT;
        }
    }
}