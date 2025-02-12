package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_2_part_2._2_2_1_1_2_32;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check if two binary trees are identical. Assume that two binary trees have the same structure and every identical position has the same value.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Comparing TreeNode a and TreeNode b:
 * <br/>
 * false
 * <br/>
 * <br/>
 * Comparing TreeNode b and TreeNode c:
 * <br/>
 * true
 * </h2>
 */

public class Question32 {
    private static final BinaryTree<Integer> FIRST_BINARY_TREE = new BinaryTree<>(),
            SECOND_BINARY_TREE = new BinaryTree<>(),
            THIRD_BINARY_TREE = new BinaryTree<>();

    public static void main(final String[] ARGUMENTS) {
        inputValues();
        System.out.println("Comparing TreeNode a and TreeNode b:");
        System.out.printf("%s\n\n", FIRST_BINARY_TREE.areSameTrees(SECOND_BINARY_TREE));
        System.out.println("Comparing TreeNode b and TreeNode c:");
        System.out.printf("%s", SECOND_BINARY_TREE.areSameTrees(THIRD_BINARY_TREE));
    }

    private static void inputValues() {
        inputFirstBinaryTreeValues();
        inputSecondBinaryTreeValues();
        inputThirdBinaryTreeValues();
    }

    private static void inputFirstBinaryTreeValues() {
        FIRST_BINARY_TREE.insert(1);
        FIRST_BINARY_TREE.insert(2);
        FIRST_BINARY_TREE.insert(3);
        FIRST_BINARY_TREE.insert(4);
        FIRST_BINARY_TREE.insert(5);
    }

    private static void inputSecondBinaryTreeValues() {
        SECOND_BINARY_TREE.insert(2);
        SECOND_BINARY_TREE.insert(3);
        SECOND_BINARY_TREE.insert(5);
        SECOND_BINARY_TREE.insert(1);
        SECOND_BINARY_TREE.insert(4);
    }

    private static void inputThirdBinaryTreeValues() {
        THIRD_BINARY_TREE.insert(2);
        THIRD_BINARY_TREE.insert(3);
        THIRD_BINARY_TREE.insert(5);
        THIRD_BINARY_TREE.insert(1);
        THIRD_BINARY_TREE.insert(4);
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

    public boolean areSameTrees(BinaryTree<Type> anotherTree) {
        return areSameTreesRecursion(root, anotherTree.root);
    }

    private boolean areSameTreesRecursion(Node<Type> current, Node<Type> another) {
        if (current == null && another == null) return true;

        if (current != null && another != null)
            return (current.data == another.data)
                    && areSameTreesRecursion(current.left, another.left)
                    && areSameTreesRecursion(current.right, another.right);

        return false;
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