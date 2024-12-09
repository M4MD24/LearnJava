package _1_learn._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_3_avl_tree;

public class Main {
    private static final AVLTree ELEMENTS = new AVLTree();

    public static void main(final String[] PARAMETERS) {
        addElements();
        inorderTraversalTest();
        preorderTraversalTest();
        postorderTraversalTest();
        getTotalNumberOfNodesTest();
        searchElementTest(4);
        isEmptyTest();
        afterClearAllElements();
    }

    private static void afterClearAllElements() {
        System.out.println("\n• After Clear All Elements:");
        ELEMENTS.clearAllElements();
        ELEMENTS.inorderTraversal();
    }

    private static void isEmptyTest() {
        System.out.println("\n• Is Empty? " + ELEMENTS.isEmpty());
    }

    private static void searchElementTest(final int ELEMENT) {
        System.out.println("\n• Search Element: " + ELEMENTS.searchElement(ELEMENT));
    }

    private static void getTotalNumberOfNodesTest() {
        System.out.println("\n\n• Get Total Number of Nodes: " + ELEMENTS.getTotalNumberOfNodes());
    }

    private static void postorderTraversalTest() {
        System.out.println("\n\n• Postorder Traversal:");
        ELEMENTS.postorderTraversal();
    }

    private static void preorderTraversalTest() {
        System.out.println("\n\n• Preorder Traversal:");
        ELEMENTS.preorderTraversal();
    }

    private static void inorderTraversalTest() {
        System.out.println("• Inorder Traversal:");
        ELEMENTS.inorderTraversal();
    }

    private static void addElements() {
        ELEMENTS.insertElement(1);
        ELEMENTS.insertElement(2);
        ELEMENTS.insertElement(3);
        ELEMENTS.insertElement(4);
        System.out.println("■ After Adding Elements:\n");
    }
}