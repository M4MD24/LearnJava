package _1_learn._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_2_binary_search_tree;

public class BinarySearchTree<Type extends Comparable<Type>> {
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

    public void inorder() {
        inorderRecursion(root);
    }

    private void inorderRecursion(Node<Type> root) {
        if (root != null) {
            inorderRecursion(root.left);
            System.out.print(root.data + " ");
            inorderRecursion(root.right);
        }
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

    public void postorder() {
        postorderRecursion(root);
    }

    private void postorderRecursion(Node<Type> root) {
        if (root != null) {
            postorderRecursion(root.left);
            postorderRecursion(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void printTreePreorder(String prefix, boolean isLeft) {
        printTreePreorderRecursion(root, prefix, isLeft);
    }

    private void printTreePreorderRecursion(Node<Type> root, String prefix, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + (isLeft ? "├─── " : "└─── ") + root.data);
            printTreePreorderRecursion(root.left, prefix + (isLeft ? "│    " : "     "), true);
            printTreePreorderRecursion(root.right, prefix + (isLeft ? "│    " : "     "), false);
        }
    }

    public void sortedArrayToBinaryTree(Type[] arr) {
        if (arr.length == 0) return;
        root = sortedArrayToBinaryTreeRecursion(arr, 0, arr.length - 1);
    }

    private Node<Type> sortedArrayToBinaryTreeRecursion(Type[] arr, int start, int end) {
        Node<Type> node = new Node<>(null);

        if (start == end - 1) {
            node = new Node<>(arr[start]);
            node.right = new Node<>(arr[end]);
        } else if (start == end) return new Node<>(arr[start]);
        else {
            int mid = (start + end) / 2;
            node.data = arr[mid];
            node.left = sortedArrayToBinaryTreeRecursion(arr, start, mid - 1);
            node.right = sortedArrayToBinaryTreeRecursion(arr, mid + 1, end);
        }
        return node;
    }
}