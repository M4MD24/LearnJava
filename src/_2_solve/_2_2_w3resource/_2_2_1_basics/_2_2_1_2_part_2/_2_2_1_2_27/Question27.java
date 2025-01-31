package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_27;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get an updated binary tree with the same structure and value as a given binary tree.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original Treenode:
 * <br/>
 * 4
 * <br/>
 * 5
 * <br/>
 * 2
 * <br/>
 * 3
 * <br/>
 * 1
 * <br/>
 * <br/>
 * Clone of the said Treenode:
 * <br/>
 * 4
 * <br/>
 * 5
 * <br/>
 * 2
 * <br/>
 * 3
 * <br/>
 * 1
 * </h2>
 */

public class Question27 {
    public static void main(final String[] ARGUMENTS) {
        final BinaryTree NODES = new BinaryTree();
        final BinaryTree COPY_OF_NODES;
        inputNodesValues(NODES);
        System.out.println("Original Treenode:");
        NODES.preorderReversed();
        System.out.println("\nClone of the said Treenode:");
        COPY_OF_NODES = NODES;
        COPY_OF_NODES.preorderReversed();
    }

    private static void inputNodesValues(BinaryTree NODES) {
        NODES.insert((byte) 4);
        NODES.insert((byte) 5);
        NODES.insert((byte) 2);
        NODES.insert((byte) 3);
        NODES.insert((byte) 1);
    }
}

class BinaryTree {
    Node root;

    public void insert(byte value) {
        root = insertRecursion(root, value);
    }

    private Node insertRecursion(Node root, byte value) {
        if (root == null) root = new Node(value);
        else if (value < root.value) root.left = insertRecursion(root.left, value);
        else root.right = insertRecursion(root.right, value);
        return root;
    }

    public void preorderReversed() {
        preorderReversedRecursion(root);
    }

    private void preorderReversedRecursion(Node root) {
        if (root != null) {
            System.out.println(root.value);
            preorderReversedRecursion(root.right);
            preorderReversedRecursion(root.left);
        }
    }
}

class Node {
    byte value;
    Node left,
            right;

    public Node(byte value) {
        this.value = value;
    }
}