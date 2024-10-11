package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_1_easy._2_6_2_1_100_same_tree;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * <br/>
 * <br/>
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 * </h2>
 */

public class SameTree {
    public static void main(final String[] PARAMETERS) {
        final TreeNode FIRST_TREE = new TreeNode(1, new TreeNode(2), new TreeNode(3)),
                SECOND_TREE = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.print(areSameTrees(FIRST_TREE, SECOND_TREE));
    }

    private static boolean areSameTrees(final TreeNode FIRST_TREE, final TreeNode SECOND_TREE) {
        if (FIRST_TREE == null && SECOND_TREE == null)
            return true;
        if (FIRST_TREE == null || SECOND_TREE == null)
            return false;
        if (FIRST_TREE.val != SECOND_TREE.val)
            return false;
        return areSameTrees(FIRST_TREE.left, SECOND_TREE.left) &&
                areSameTrees(FIRST_TREE.right, SECOND_TREE.right);
    }
}