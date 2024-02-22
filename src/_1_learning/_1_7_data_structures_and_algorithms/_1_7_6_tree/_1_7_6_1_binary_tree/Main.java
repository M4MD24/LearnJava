package _1_learning._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_1_binary_tree;

public class Main {
        private static final BinaryTree<Character> BINARY_TREE = new BinaryTree<>();
    public static void main(String[] args) {
        insertTest();
        inorderTest();
        preorderTest();
    }

    private static void preorderTest() {
        System.out.print("■ Preorder: ");
        BINARY_TREE.preorder();
        System.out.println();
    }

    private static void inorderTest() {
        System.out.print("■ Inorder : ");
        BINARY_TREE.inorder();
        System.out.println();
    }

    private static void insertTest() {
        BINARY_TREE.insert('A');
        BINARY_TREE.insert('D');
        BINARY_TREE.insert('B');
        BINARY_TREE.insert('E');
        BINARY_TREE.insert('C');
        BINARY_TREE.insert('F');
        BINARY_TREE.insert('Z');
    }
}
/*
         a
          \
           d
          / \
         b   e
          \   \
           c   f
                \
                 z
type: Unbalanced binary tree*/