package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_146;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert an array of sorted items into a binary search tree. Maintain the minimal height of the tree.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * 2
 * <br/>
 * 1
 * <br/>
 * 4
 * <br/>
 * 6
 * <br/>
 * 5
 * <br/>
 * 3
 * </h2>
 */

class Node {
    public int data;
    public Node left,
            right;

    public Node(int data) {
        this.data = data;
    }
}

class BinarySearchTree {
    Node root;

    public void sortedArrayToBinarySearchTree(int[] arr) {
        if (arr.length == 0) return;
        root = sortedArrayToBinarySearchTreeRecursion(arr, 0, arr.length - 1);
    }

    private Node sortedArrayToBinarySearchTreeRecursion(int[] arr, int start, int end) {
        Node node = new Node(0);

        if (start == end - 1) {
            node = new Node(arr[start]);
            node.right = new Node(arr[end]);
        } else if (start == end) return new Node(arr[start]);
        else {
            int mid = (start + end) / 2;
            node.data = arr[mid];
            node.left = sortedArrayToBinarySearchTreeRecursion(arr, start, mid - 1);
            node.right = sortedArrayToBinarySearchTreeRecursion(arr, mid + 1, end);
        }
        return node;
    }

    public void postorder() {
        postorderRecursion(root);
    }

    private void postorderRecursion(Node root) {
        if (root != null) {
            postorderRecursion(root.left);
            postorderRecursion(root.right);
            System.out.println(root.data);
        }
    }

    public void printTreePreOrder(String prefix, boolean isLeft) {
        printTreePreorderRecursion(root, prefix, isLeft);
    }

    private void printTreePreorderRecursion(Node root, String prefix, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.data);
            printTreePreorderRecursion(root.left, prefix + (isLeft ? "│   " : "    "), true);
            printTreePreorderRecursion(root.right, prefix + (isLeft ? "│   " : "    "), false);
        }
    }
}

public class Question146 {
    private static final BinarySearchTree BINARY_SEARCH_TREE = new BinarySearchTree();

    public static void main(final String[] PARAMETERS) {
        final int[] ARRAY = {1, 2, 3, 4, 5, 6, 7};
        BINARY_SEARCH_TREE.sortedArrayToBinarySearchTree(ARRAY);
        BINARY_SEARCH_TREE.postorder();
        System.out.println();
        BINARY_SEARCH_TREE.printTreePreOrder("", false);
    }
}