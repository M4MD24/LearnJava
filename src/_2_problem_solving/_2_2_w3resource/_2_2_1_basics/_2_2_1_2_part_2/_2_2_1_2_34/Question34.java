package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_34;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the length of the longest consecutive sequence path in a given binary tree.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Length of the longest consecutive sequence path: 4</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>The longest consecutive path need to be from parent to child.</h2>
 */

public class Question34 {
    private static final BinaryTree<Integer> BINARY_TREE = new BinaryTree<>();

    public static void main(final String[] ARGS) {
        inputValues();
        System.out.printf("Length of the longest consecutive sequence path: %d", BINARY_TREE.maximumDepth());
    }

    private static void inputValues() {
        BINARY_TREE.insert(1);
        BINARY_TREE.insert(3);
        BINARY_TREE.insert(2);
        BINARY_TREE.insert(4);
        BINARY_TREE.insert(5);
        BINARY_TREE.insert(6);
    }
}


class BinaryTree<Type extends Comparable<Type>> {
    private Node<Type> root;

    public void insert(Type data) {
        root = insertRecursion(root, data);
    }

    private Node<Type> insertRecursion(Node<Type> root, Type data) {
        if (root == null) root = new Node<>(data);
        else if (data.compareTo(root.data) < 0) root.left = insertRecursion(root.left, data);
        else if (data.compareTo(root.data) >= 0) root.right = insertRecursion(root.right, data);
        return root;
    }

    public int maximumDepth() {
        return maximumDepthRecursion(root) - 1;
    }

    private int maximumDepthRecursion(Node<Type> root) {
        if (root == null) return 0;
        int leftDepth = maximumDepthRecursion(root.left),
                rightDepth = maximumDepthRecursion(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}

class Node<Type> {
    Type data;
    Node<Type> right,
            left;

    public Node(Type data) {
        this.data = data;
    }
}