package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_236_lowest_common_ancestor_of_a_binary_tree;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * <br/>
 * <br/>
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 * </h2>
 */

public class LowestCommonAncestorOfBinaryTree {
    public static void main(final String[] PARAMETERS) {
        final TreeNode ROOT = new TreeNode(3);
        ROOT.left = new TreeNode(5);
        ROOT.right = new TreeNode(1);
        ROOT.left.left = new TreeNode(6);
        ROOT.left.right = new TreeNode(2);
        ROOT.right.left = new TreeNode(0);
        ROOT.right.right = new TreeNode(8);
        ROOT.left.right.left = new TreeNode(7);
        ROOT.left.right.right = new TreeNode(4);
        System.out.print("LCA = " + lowestCommonAncestor(ROOT, ROOT.left, ROOT.right).val);
    }

    private static TreeNode lowestCommonAncestor(final TreeNode ROOT, final TreeNode FIRST_NODE, final TreeNode SECOND_NODE) {
        if (ROOT == null)
            return null;
        else {
            if (ROOT.val != FIRST_NODE.val && ROOT.val != SECOND_NODE.val) {
                final TreeNode LEFT_BRANCH = lowestCommonAncestor(ROOT.left, FIRST_NODE, SECOND_NODE),
                        RIGHT_BRANCH = lowestCommonAncestor(ROOT.right, FIRST_NODE, SECOND_NODE);
                if (LEFT_BRANCH == null && RIGHT_BRANCH == null)
                    return null;
                else if (LEFT_BRANCH != null && RIGHT_BRANCH == null)
                    return LEFT_BRANCH;
                else if (LEFT_BRANCH == null)
                    return RIGHT_BRANCH;
            }
            return ROOT;
        }
    }
}