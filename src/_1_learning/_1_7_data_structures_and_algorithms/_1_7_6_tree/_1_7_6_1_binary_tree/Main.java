package _1_learning._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_1_binary_tree;

public class Main {
    private static final BinaryTree<Character> BINARY_TREE_1 = new BinaryTree<>(),
            BINARY_TREE_2 = new BinaryTree<>();

    public static void main(final String[] ARGS) {
        insertTest();
        inorderTest();
        preorderTest();
        postorderTest();
        maximumDepthTest();
        minimumDepthTest();
        printTreePreorderTest();
        areSameTreesTest();
        isSubTreeTest();
    }

    private static void insertTest() {
        BINARY_TREE_1.insert('A');
        BINARY_TREE_1.insert('D');
        BINARY_TREE_1.insert('D');
        BINARY_TREE_1.insert('B');
        BINARY_TREE_1.insert('E');
        BINARY_TREE_1.insert('C');
        BINARY_TREE_1.insert('F');
        BINARY_TREE_1.insert('Z');
    }

    private static void inorderTest() {
        System.out.print("■ Inorder  : ");
        BINARY_TREE_1.inorder();
    }

    private static void preorderTest() {
        System.out.print("\n■ Preorder : ");
        BINARY_TREE_1.preorder();
    }

    private static void postorderTest() {
        System.out.print("\n■ Postorder: ");
        BINARY_TREE_1.postorder();
    }

    private static void maximumDepthTest() {
        System.out.println("\n\n■ Maximum Depth: " + BINARY_TREE_1.maximumDepth());
    }

    private static void minimumDepthTest() {
        System.out.println("\n■ Minimum Depth: " + BINARY_TREE_1.minimumDepth());
    }

    private static void printTreePreorderTest() {
        System.out.println("\n■ Print Tree Preorder:");
        BINARY_TREE_1.printTreePreorder("", false);
    }

    private static void areSameTreesTest() {
        insertionBinaryTree2();
        System.out.println("\n■ Are Same Trees: " + BINARY_TREE_1.areSameTrees(BINARY_TREE_2));
        System.out.println("• Tree 1:");
        BINARY_TREE_1.printTreePreorder("", false);
        System.out.println("• Tree 2:");
        BINARY_TREE_2.printTreePreorder("", false);
    }

    private static void insertionBinaryTree2() {
        BINARY_TREE_2.insert('E');
        BINARY_TREE_2.insert('F');
        BINARY_TREE_2.insert('Z');
    }

    private static void isSubTreeTest() {
        System.out.println("\n■ Is SubTree: " + BINARY_TREE_2.isSubTree(BINARY_TREE_1));
        System.out.println("• Tree 1:");
        BINARY_TREE_1.printTreePreorder("", false);
        System.out.println("• Tree 2:");
        BINARY_TREE_2.printTreePreorder("", false);
    }
}
/* Note:
         A
          \
           D
          / \
         B   E
          \   \
           C   F
                \
                 Z
type: Unbalanced binary tree! */