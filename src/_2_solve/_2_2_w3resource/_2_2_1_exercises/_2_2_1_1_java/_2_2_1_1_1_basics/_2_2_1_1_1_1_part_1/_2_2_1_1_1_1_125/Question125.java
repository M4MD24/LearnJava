package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_1_part_1._2_2_1_1_1_1_125;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the preorder traversal of the values of the nodes in a binary tree.?</h2>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Preorder traversal of binary tree is:
 * <br/>
 * 55 21 9 29 80 76 91
 * </h2>
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

    public void preorder() {
        preorderRecursion(root);
    }

    private void preorderRecursion(Node<Type> root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRecursion(root.left);
            preorderRecursion(root.right);
        }
    }
}

public class Question125 {
    private static final BinaryTree<Integer> BINARY_TREE = new BinaryTree<>();

    public static void main(final String[] ARGUMENTS) {
        insert();
        preorder();
    }

    private static void preorder() {
        System.out.print("Preorder traversal of binary tree is:\n");
        BINARY_TREE.preorder();
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