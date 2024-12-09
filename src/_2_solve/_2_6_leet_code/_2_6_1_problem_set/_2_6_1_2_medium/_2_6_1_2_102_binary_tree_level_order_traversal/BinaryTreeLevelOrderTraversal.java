package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_102_binary_tree_level_order_traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).</h2>
 */

public class BinaryTreeLevelOrderTraversal {
    public static void main(final String[] PARAMETERS) {
        final TreeNode ROOT = new TreeNode(3);
        ROOT.left = new TreeNode(9);
        ROOT.right = new TreeNode(20);
        ROOT.right.left = new TreeNode(15);
        ROOT.right.right = new TreeNode(7);
        System.out.print(levelOrder(ROOT));
    }

    private static List<List<Integer>> levelOrder(final TreeNode ROOT) {
        final List<List<Integer>> ELEMENTS = new ArrayList<>();
        traverseTree(
                ROOT,
                ELEMENTS,
                0
        );
        return ELEMENTS;
    }

    private static void traverseTree(final TreeNode ROOT, final List<List<Integer>> ELEMENTS, final int CURRENT_LEVEL) {
        if (ROOT != null) {
            if (ELEMENTS.size() == CURRENT_LEVEL)
                ELEMENTS.add(new ArrayList<>());
            ELEMENTS.get(CURRENT_LEVEL).add(ROOT.val);
            traverseTree(ROOT.left, ELEMENTS, CURRENT_LEVEL + 1);
            traverseTree(ROOT.right, ELEMENTS, CURRENT_LEVEL + 1);
        }
    }
}