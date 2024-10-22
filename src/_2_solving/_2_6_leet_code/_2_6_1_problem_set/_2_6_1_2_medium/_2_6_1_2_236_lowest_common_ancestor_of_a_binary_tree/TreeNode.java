package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_236_lowest_common_ancestor_of_a_binary_tree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(final int VALUE) {
        this.val = VALUE;
    }

    TreeNode(final int VALUE, final TreeNode LEFT, final TreeNode RIGHT) {
        this.val = VALUE;
        this.left = LEFT;
        this.right = RIGHT;
    }
}