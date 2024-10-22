package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_114_flatten_binary_tree_to_linked_list;

/**
 * <h1>Problem:</h1>
 * <h2>Given the root of a binary tree, flatten the tree into a "linked list":</h2>
 * <ul>
 * <li>The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.</li>
 * <li>The "linked list" should be in the same order as a pre-order traversal of the binary tree.</li>
 * </ul>
 */

public class FlattenBinaryTreeToLinkedList {
    public static void main(final String[] PARAMETERS) {
        final TreeNode ROOT = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(3),
                        new TreeNode(4)
                ),
                new TreeNode(5,
                        null,
                        new TreeNode(6)
                )
        );
        flatten(ROOT);
    }

    private static void flatten(final TreeNode ROOT) {
        if (ROOT != null) {
            TreeNode currentNode = ROOT;
            while (currentNode != null) {
                if (currentNode.left != null) {
                    final TreeNode ORIGINAL_RIGHT_SUB_TREE = currentNode.right;
                    TreeNode leftSubtreeRunner = currentNode.left;
                    currentNode.left = null;
                    currentNode.right = leftSubtreeRunner;
                    while (leftSubtreeRunner.right != null)
                        leftSubtreeRunner = leftSubtreeRunner.right;
                    leftSubtreeRunner.right = ORIGINAL_RIGHT_SUB_TREE;
                }
                currentNode = currentNode.right;
            }
        }
    }
}