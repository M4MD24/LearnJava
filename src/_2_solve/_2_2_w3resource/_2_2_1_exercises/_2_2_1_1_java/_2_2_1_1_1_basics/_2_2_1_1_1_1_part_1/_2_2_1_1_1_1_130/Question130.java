package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_1_part_1._2_2_1_1_1_1_130;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the maximum depth of a given binary tree.
 * Sample Output: The Maximum depth of the binary tree is: 3</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The Maximum depth of the binary tree is: 3</h2>
 * <br/>
 * <h1>Example:</h1>
 */

/*
        55
     /      \
   21       80
  /  \     /  \
9    29  76    91
*/

class Node<Type> {
    Type data;
    Node<Type> left,
            right;

    public Node(Type data) {
        this.data = data;
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
        return maximumDepthRecursion(root);
    }

    private int maximumDepthRecursion(Node<Type> root) {
        if (root == null) return 0;
        int leftDepth = maximumDepthRecursion(root.left);
        int rightDepth = maximumDepthRecursion(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}

public class Question130 {
    private static final BinaryTree<Integer> BINARY_TREE = new BinaryTree<>();

    public static void main(final String[] ARGUMENTS) {
        insert();
        System.out.print("The Maximum depth of the binary tree is: " + BINARY_TREE.maximumDepth());
    }

    private static void insert() {
        BINARY_TREE.insert(55);
        BINARY_TREE.insert(21);
        BINARY_TREE.insert(9);
        BINARY_TREE.insert(29);
        BINARY_TREE.insert(80);
        BINARY_TREE.insert(76);
        BINARY_TREE.insert(91);
    }
}