package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_103_binary_tree_zigzag_level_order_traversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).</h2>
 */

public class BinaryTreeZigzagOrderTraversal {
    public static void main(final String[] PARAMETERS) {
        final TreeNode ROOT = new TreeNode(3);
        ROOT.left = new TreeNode(9);
        ROOT.right = new TreeNode(20);
        ROOT.right.left = new TreeNode(15);
        ROOT.right.right = new TreeNode(7);
        System.out.print(zigzagLevelOrder(ROOT));
    }

    private static List<List<Integer>> zigzagLevelOrder(final TreeNode ROOT) {
        if (ROOT == null)
            return new ArrayList<>();
        else {
            final List<List<Integer>> ELEMENTS = new ArrayList<>();
            final Deque<TreeNode> DEQUE = new ArrayDeque<>();
            DEQUE.add(ROOT);
            boolean leftToRight = true;
            while (!DEQUE.isEmpty()) {
                final int SIZE = DEQUE.size();
                final List<Integer> LEVEL = new ArrayList<>();
                for (int index = 0; index < SIZE; index++) {
                    final TreeNode NODE = leftToRight
                            ? DEQUE.pollFirst()
                            : DEQUE.pollLast();
                    assert NODE != null;
                    LEVEL.add(NODE.val);
                    if (leftToRight) {
                        if (NODE.left != null)
                            DEQUE.addLast(NODE.left);
                        if (NODE.right != null)
                            DEQUE.addLast(NODE.right);
                    } else {
                        if (NODE.right != null)
                            DEQUE.addFirst(NODE.right);
                        if (NODE.left != null)
                            DEQUE.addFirst(NODE.left);
                    }
                }
                ELEMENTS.add(LEVEL);
                leftToRight = !leftToRight;
            }
            return ELEMENTS;
        }
    }
}