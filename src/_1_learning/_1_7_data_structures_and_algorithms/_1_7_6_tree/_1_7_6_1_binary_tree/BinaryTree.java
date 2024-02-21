package _1_learning._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_1_binary_tree;

public class BinaryTree<Type extends Comparable<Type>> {
    Node<Type> root;

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
}