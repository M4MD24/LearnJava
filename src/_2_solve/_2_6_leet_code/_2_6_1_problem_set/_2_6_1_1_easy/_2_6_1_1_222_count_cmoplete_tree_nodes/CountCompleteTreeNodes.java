package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_222_count_cmoplete_tree_nodes;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given the root of a complete binary tree, return the number of the nodes in the tree.
 * <br/>
 * <br/>
 * According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
 * <br/>
 * <br/>
 * Design an algorithm that runs in less than O(n) time complexity.
 * </h2>
 */

public class CountCompleteTreeNodes {
    public static void main(final String[] PARAMETERS) {
        final TreeNode ROOT = new TreeNode(1);
        ROOT.left = new TreeNode(2);
        ROOT.right = new TreeNode(3);
        ROOT.left.left = new TreeNode(4);
        ROOT.left.right = new TreeNode(5);
        ROOT.right.left = new TreeNode(6);
        System.out.print(countNodes(ROOT));
    }

    private static int countNodes(final TreeNode ROOT_NODE) {
        final int HEIGHT = height(ROOT_NODE);
        return HEIGHT < 0
                ? 0
                : height(ROOT_NODE.right) == HEIGHT - 1
                ? (1 << HEIGHT) + countNodes(ROOT_NODE.right)
                : (1 << HEIGHT - 1) + countNodes(ROOT_NODE.left);
    }

    private static int height(final TreeNode ROOT_NODE) {
        return ROOT_NODE == null
                ? -1
                : 1 + height(ROOT_NODE.left);
    }
}