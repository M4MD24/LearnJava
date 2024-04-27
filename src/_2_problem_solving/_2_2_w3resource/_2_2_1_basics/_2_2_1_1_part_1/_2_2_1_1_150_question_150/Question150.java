package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_150_question_150;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to test if a binary tree is a subtree of another binary tree.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * true
 * </h2>
 */

class Node {
    int data;
    Node left,
            right;

    public Node(int data) {
        this.data = data;
    }
}

class BinaryTree {
    Node root;

    public void insert(int data) {
        root = insertRecursion(root, data);
    }

    public Node insertRecursion(Node root, int data) {
        if (root == null) root = new Node(data);
        else if (data < root.data) root.left = insertRecursion(root.left, data);
        else if (data > root.data) root.right = insertRecursion(root.right, data);
        return root;
    }

    public void preorder() {
        preorderRecursion(root);
    }

    private void preorderRecursion(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRecursion(root.left);
            preorderRecursion(root.right);
        }
    }

    public void printTreePreorder(String prefix, boolean isLeft) {
        printTreePreorderRecursion(root, prefix, isLeft);
    }

    private void printTreePreorderRecursion(Node root, String prefix, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + (isLeft ? "├─── " : "└─── ") + root.data);
            printTreePreorderRecursion(root.left, prefix + (isLeft ? "│    " : "     "), true);
            printTreePreorderRecursion(root.right, prefix + (isLeft ? "│    " : "     "), false);
        }
    }

    public boolean areSameTrees(BinaryTree anotherTree) {
        return areSameTreesRecursion(root, anotherTree.root);
    }

    private boolean areSameTreesRecursion(Node current, Node another) {
        if (current == null && another == null) return true;

        if (current != null && another != null)
            return (current.data == another.data)
                    && areSameTreesRecursion(current.left, another.left)
                    && areSameTreesRecursion(current.right, another.right);

        return false;
    }

    public boolean isSubTree(BinaryTree sub) {
        return isSubTree(root, sub.root);
    }

    private boolean isSubTree(Node current, Node sub) {
        if (sub == null) return false;
        if (areSameTreesRecursion(current, sub)) return true;
        return isSubTree(current, sub.left) || isSubTree(current, sub.right);
    }
}

public class Question150 {
    private static final BinaryTree BINARY_TREE_1 = new BinaryTree(),
            BINARY_TREE_2 = new BinaryTree();

    public static void main(final String[] ARGS) {
        insertion();
        showAll();
        printAll();
        System.out.println(BINARY_TREE_1.areSameTrees(BINARY_TREE_2));
        System.out.println(BINARY_TREE_1.isSubTree(BINARY_TREE_2));
    }

    private static void insertion() {
        insertionBinaryTree1();
        insertionBinaryTree2();
    }

    private static void insertionBinaryTree1() {
        BINARY_TREE_1.insert(2);
        BINARY_TREE_1.insert(3);
        BINARY_TREE_1.insert(4);
    }

    private static void insertionBinaryTree2() {
        BINARY_TREE_2.insert(1);
        BINARY_TREE_2.insert(2);
        BINARY_TREE_2.insert(3);
        BINARY_TREE_2.insert(4);
    }

    private static void showAll() {
        BINARY_TREE_1.preorder();
        System.out.println();
        BINARY_TREE_2.preorder();
        System.out.println();
    }

    private static void printAll() {
        System.out.println();
        BINARY_TREE_1.printTreePreorder("", true);
        System.out.println();
        BINARY_TREE_2.printTreePreorder("", true);
    }
}