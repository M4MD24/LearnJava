package _1_learning._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_1_binary_tree;

public class Main {
    private static final BinaryTree<Character> BINARY_TREE = new BinaryTree<>();

    public static void main(String[] args) {
        insertTest();
        inorderTest();
        preorderTest();
        postorderTest();
        MaximumDepthTest();
        MinimumDepthTest();
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

    private static void inorderTest() {
        System.out.print("■ Inorder  : ");
        BINARY_TREE.inorder();
    }

    private static void preorderTest() {
        System.out.print("\n■ Preorder : ");
        BINARY_TREE.preorder();
    }

    private static void postorderTest() {
        System.out.print("\n■ Postorder: ");
        BINARY_TREE.postorder();
    }

    private static void MaximumDepthTest() {
        System.out.println("\n\n■ Maximum Depth: " + BINARY_TREE.maximumDepth());
    }

    private static void MinimumDepthTest() {
        System.out.println("\n■ Minimum Depth: " + BINARY_TREE.minimumDepth());
    }
}
/*
         A
          \
           D
          / \
         B   E
          \   \
           C   F
                \
                 Z
type: Unbalanced binary tree*/