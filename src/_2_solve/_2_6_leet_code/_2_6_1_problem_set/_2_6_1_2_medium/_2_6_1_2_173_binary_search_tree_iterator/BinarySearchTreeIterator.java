package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_173_binary_search_tree_iterator;

import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Implement the BSTIterator class that represents an iterator over the in-order traversal of a binary search tree (BST):</h2>
 * <br/>
 * <br/>
 * <ul>
 * <li>BSTIterator(TreeNode root) Initializes an object of the BSTIterator class. The root of the BST is given as part of the constructor. The pointer should be initialized to a non-existent number smaller than any element in the BST.</li>
 * <li>boolean hasNext() Returns true if there exists a number in the traversal to the right of the pointer, otherwise returns false.</li>
 * <li>int next() Moves the pointer to the right, then returns the number at the pointer.</li>
 * </ul>
 * <br/>
 * <br/>
 * <h2>Notice that by initializing the pointer to a non-existent smallest number, the first call to next() will return the smallest element in the BST.</h2>
 * <h2>You may assume that next() calls will always be valid. That is, there will be at least a next number in the in-order traversal when next() is called.</h2>
 */

public class BinarySearchTreeIterator {
    public static void main(final String[] ARGUMENTS) {
        final TreeNode ROOT = new TreeNode(7);
        ROOT.left = new TreeNode(3);
        ROOT.right = new TreeNode(15);
        ROOT.right.left = new TreeNode(9);
        ROOT.right.right = new TreeNode(20);
        final BinarySearchTreeIterator ITERATOR = new BinarySearchTreeIterator(ROOT);
        System.out.println(ITERATOR.next());
        System.out.println(ITERATOR.next());
        System.out.println(ITERATOR.hasNext());
        System.out.println(ITERATOR.next());
        System.out.println(ITERATOR.hasNext());
        System.out.println(ITERATOR.next());
        System.out.println(ITERATOR.hasNext());
        System.out.println(ITERATOR.next());
        System.out.print(ITERATOR.hasNext());
    }

    private final Stack<TreeNode> ELEMENTS;

    private BinarySearchTreeIterator(final TreeNode ROOT) {
        ELEMENTS = new Stack<>();
        pushLeftSubtree(ROOT);
    }

    private void pushLeftSubtree(TreeNode node) {
        while (node != null) {
            ELEMENTS.push(node);
            node = node.left;
        }
    }

    private int next() {
        final TreeNode NEXT_NODE = ELEMENTS.pop();
        if (NEXT_NODE.right != null)
            pushLeftSubtree(NEXT_NODE.right);
        return NEXT_NODE.val;
    }

    private boolean hasNext() {
        return !ELEMENTS.isEmpty();
    }
}