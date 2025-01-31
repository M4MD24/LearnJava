package _1_learn._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_1_binary_tree;

public class Main {
    private static final BinaryTree<Character> BINARY_TREE_1 = new BinaryTree<>(),
            BINARY_TREE_2 = new BinaryTree<>();

    public static void main(final String[] ARGUMENTS) {
        insertTest();
        inorderTest();
        preorderTest();
        postorderTest();
        maximumDepthTest();
        minimumDepthTest();
        printTreePreorderTest();
        areSameTreesTest();
        isSubTreeTest();
        clearAllTest();
        isEmpty();
        isPerfectBinaryTreeTest();
        isFullBinaryTreeTest();
        getSizeTest();
        isCompleteBinaryTreeTest();
        getHeightOfDepthTest();
        isBalancedBinaryTreeTest();
        isDegenerateBinaryTreeTest();
        isLeftSkewedBinaryTreeTest();
        isRightSkewedBinaryTreeTest();
        isSymmetricBinaryTreeTest();
    }

    private static void isSymmetricBinaryTreeTest() {
        System.out.println("\n■ Is Symmetric Binary Tree: " + BINARY_TREE_1.isSymmetric());
        BINARY_TREE_1.printTreePreorder("", false);
    }

    private static void isRightSkewedBinaryTreeTest() {
        System.out.print("\n■ Is Right-Skewed Binary Tree: ");
        BINARY_TREE_1.clearAll();
        addElementsForRightSkewedBinaryTree();
        System.out.println(BINARY_TREE_1.isRightSkewedBinaryTree());
        BINARY_TREE_1.printTreePreorder("", false);
    }

    private static void addElementsForRightSkewedBinaryTree() {
        BINARY_TREE_1.insert('a');
        BINARY_TREE_1.insert('b');
        BINARY_TREE_1.insert('c');
        BINARY_TREE_1.insert('d');
    }

    private static void isLeftSkewedBinaryTreeTest() {
        System.out.print("\n■ Is Left-Skewed Binary Tree: ");
        BINARY_TREE_1.clearAll();
        addElementsForLeftSkewedBinaryTree();
        System.out.println(BINARY_TREE_1.isLeftSkewedBinaryTree());
        BINARY_TREE_1.printTreePreorder("", false);
    }

    private static void addElementsForLeftSkewedBinaryTree() {
        BINARY_TREE_1.insert('d');
        BINARY_TREE_1.insert('c');
        BINARY_TREE_1.insert('b');
        BINARY_TREE_1.insert('a');
    }

    private static void isDegenerateBinaryTreeTest() {
        System.out.print("\n■ Is Degenerate Binary Tree: ");
        BINARY_TREE_1.clearAll();
        addElementsForDegenerateBinaryTree();
        System.out.println(BINARY_TREE_1.isDegenerateBinaryTree());
        BINARY_TREE_1.printTreePreorder("", false);
    }

    private static void addElementsForDegenerateBinaryTree() {
        BINARY_TREE_1.insert('a');
        BINARY_TREE_1.insert('f');
        BINARY_TREE_1.insert('d');
        BINARY_TREE_1.insert('e');
    }

    private static void getHeightOfDepthTest() {
        System.out.println("\n■ Height of Depth: " + BINARY_TREE_1.getSize());
    }

    private static void isBalancedBinaryTreeTest() {
        System.out.print("\n■ Is Balanced Binary Tree: ");
        BINARY_TREE_1.clearAll();
        addElementsForBalancedBinaryTree();
        System.out.println(BINARY_TREE_1.isBalancedBinaryTree());
        BINARY_TREE_1.printTreePreorder("", false);
    }

    private static void addElementsForBalancedBinaryTree() {
        BINARY_TREE_1.insert('d');
        BINARY_TREE_1.insert('b');
        BINARY_TREE_1.insert('c');
        BINARY_TREE_1.insert('a');
        BINARY_TREE_1.insert('e');
    }

    private static void isCompleteBinaryTreeTest() {
        System.out.print("\n■ Is Complete Binary Tree: ");
        BINARY_TREE_1.clearAll();
        addElementsForCompleteBinaryTree();
        System.out.println(BINARY_TREE_1.isCompleteBinaryTree());
        BINARY_TREE_1.printTreePreorder("", false);
    }

    private static void addElementsForCompleteBinaryTree() {
        BINARY_TREE_1.insert('4');
        BINARY_TREE_1.insert('2');
        BINARY_TREE_1.insert('1');
        BINARY_TREE_1.insert('3');
        BINARY_TREE_1.insert('5');
    }

    private static void getSizeTest() {
        System.out.println("\n■ Size: " + BINARY_TREE_1.getSize());
    }

    private static void isFullBinaryTreeTest() {
        System.out.print("\n■ Is Full Binary Tree: ");
        BINARY_TREE_1.clearAll();
        addElementsForFullBinaryTree();
        System.out.println(BINARY_TREE_1.isFullBinaryTree());
        BINARY_TREE_1.printTreePreorder("", false);
    }

    private static void addElementsForFullBinaryTree() {
        BINARY_TREE_1.insert('d');
        BINARY_TREE_1.insert('b');
        BINARY_TREE_1.insert('f');
        BINARY_TREE_1.insert('a');
        BINARY_TREE_1.insert('c');
    }

    private static void isEmpty() {
        System.out.println("\n\n■ Is Empty?");
        System.out.println(BINARY_TREE_1.isEmpty());
    }

    private static void clearAllTest() {
        System.out.println("\n■ After Clear All:");
        BINARY_TREE_1.clearAll();
        BINARY_TREE_1.preorder();
    }

    private static void isPerfectBinaryTreeTest() {
        System.out.print("\n■ Is Perfect Binary Tree: ");
        addElementsForPerfectBinaryTree();
        System.out.println(BINARY_TREE_1.isPerfectBinaryTree());
        BINARY_TREE_1.printTreePreorder("", false);
    }

    private static void addElementsForPerfectBinaryTree() {
        BINARY_TREE_1.insert('d');
        BINARY_TREE_1.insert('b');
        BINARY_TREE_1.insert('f');
        BINARY_TREE_1.insert('a');
        BINARY_TREE_1.insert('c');
        BINARY_TREE_1.insert('e');
        BINARY_TREE_1.insert('g');
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
        System.out.print("■ Inorder: ");
        BINARY_TREE_1.inorder();
    }

    private static void preorderTest() {
        System.out.print("\n■ Preorder: ");
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