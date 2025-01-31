package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_199_binary_tree_right_side_view;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.</h2>
 */

public class BinaryTreeRightSideView {
    public static void main(final String[] ARGUMENTS) {
        final TreeNode ROOT = new TreeNode(1);
        ROOT.left = new TreeNode(2);
        ROOT.right = new TreeNode(3);
        ROOT.left.right = new TreeNode(5);
        ROOT.right.right = new TreeNode(4);
        System.out.print(rightSideView(ROOT));
    }

    private static final List<Integer> ELEMENTS = new ArrayList<>();

    private static List<Integer> rightSideView(final TreeNode ROOT) {
        if (ROOT != null)
            traverseRightSide(ROOT, 0);
        return ELEMENTS;
    }

    private static void traverseRightSide(final TreeNode NODE, final int CURRENT_SIZE) {
        if (CURRENT_SIZE == ELEMENTS.size())
            ELEMENTS.add(NODE.val);
        else {
            if (NODE.right != null)
                traverseRightSide(NODE.right, CURRENT_SIZE + 1);
            if (NODE.left != null)
                traverseRightSide(NODE.left, CURRENT_SIZE + 1);
        }
    }
}