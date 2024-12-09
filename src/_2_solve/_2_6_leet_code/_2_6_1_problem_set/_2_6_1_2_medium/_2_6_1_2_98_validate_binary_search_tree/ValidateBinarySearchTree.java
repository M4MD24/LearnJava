package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_98_validate_binary_search_tree;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * <br/>
 * <br/>
 * A valid BST is defined as follows:
 * </h2>
 * <ul>
 *     <li>The left subtree of a node contains only nodes with keys less than the node's key.</li>
 *     <li>The right subtree of a node contains only nodes with keys greater than the node's key.</li>
 *     <li>Both the left and right subtrees must also be binary search trees.</li>
 * </ul>
 */

public class ValidateBinarySearchTree {
    public static void main(final String[] PARAMETERS) {
        final TreeNode ROOT = new TreeNode(5);
        ROOT.left = new TreeNode(1);
        ROOT.right = new TreeNode(4);
        ROOT.right.left = new TreeNode(3);
        ROOT.right.right = new TreeNode(6);
        System.out.print(isValidBST(ROOT));
    }

    private static boolean isValidBST(final TreeNode ROOT) {
        return isValid(
                ROOT,
                Long.MIN_VALUE,
                Long.MAX_VALUE
        );
    }

    private static boolean isValid(final TreeNode NODE, final long MINIMUM_VALUE, final long MAXIMUM_VALUE) {
        return NODE == null ||
                (
                        NODE.val > MINIMUM_VALUE &&
                                NODE.val < MAXIMUM_VALUE &&
                                isValid(
                                        NODE.left,
                                        MINIMUM_VALUE,
                                        NODE.val
                                ) &&
                                isValid(
                                        NODE.right,
                                        NODE.val,
                                        MAXIMUM_VALUE
                                )
                );
    }
}