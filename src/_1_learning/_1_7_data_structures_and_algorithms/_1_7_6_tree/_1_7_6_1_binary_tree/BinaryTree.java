package _1_learning._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_1_binary_tree;

public class BinaryTree<Type extends Comparable<Type>> {
    private Node<Type> root;

    public void insert(Type data) {
        root = insertRecursion(root, data);
    }

    private Node<Type> insertRecursion(Node<Type> root, Type data) {
        if (root == null) root = new Node<>(data);
        else if (data.compareTo(root.data) < 0) root.left = insertRecursion(root.left, data);
        else if (data.compareTo(root.data) > 0) root.right = insertRecursion(root.right, data);
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

    public int maximumDepth() {
        return maximumDepthRecursion(root);
    }

    private int maximumDepthRecursion(Node<Type> root) {
        if (root == null) return 0;
        int leftDepth = maximumDepthRecursion(root.left),
                rightDepth = maximumDepthRecursion(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public int minimumDepth() {
        return minimumDepthRecursion(root);
    }

    private int minimumDepthRecursion(Node<Type> root) {
        if (root == null) return 0;
        int leftDepth = maximumDepthRecursion(root.left),
                rightDepth = maximumDepthRecursion(root.right);
        return Math.min(leftDepth, rightDepth) + 1;
    }
}