package _1_learning._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_2_binary_search_tree;

public class Main {
    private static final BinarySearchTree<Character> BINARY_SEARCH_TREE = new BinarySearchTree<>();

    public static void main(final String[] ARGS) {
        insertTest();
        inorderTest();
        preorderTest();
        postorderTest();
        printTreePreorderTest();
        sortedArrayToBinarySearchTreeTest();
    }

    private static void insertTest() {
        BINARY_SEARCH_TREE.insert('A');
        BINARY_SEARCH_TREE.insert('D');
        BINARY_SEARCH_TREE.insert('B');
        BINARY_SEARCH_TREE.insert('E');
        BINARY_SEARCH_TREE.insert('C');
        BINARY_SEARCH_TREE.insert('F');
        BINARY_SEARCH_TREE.insert('Z');
    }

    private static void inorderTest() {
        System.out.print("■ Inorder  : ");
        BINARY_SEARCH_TREE.inorder();
    }

    private static void preorderTest() {
        System.out.print("\n■ Preorder : ");
        BINARY_SEARCH_TREE.preorder();
    }

    private static void postorderTest() {
        System.out.print("\n■ Postorder: ");
        BINARY_SEARCH_TREE.postorder();
    }

    private static void printTreePreorderTest() {
        System.out.println("\n■ Print Tree Preorder:");
        BINARY_SEARCH_TREE.printTreePreorder("", false);
    }

    private static void sortedArrayToBinarySearchTreeTest() {
        System.out.println("\n■ Sorted Array To Binary Search Tree:");
        final Character[] SORTED_ARRAY = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        BINARY_SEARCH_TREE.sortedArrayToBinaryTree(SORTED_ARRAY);
        BINARY_SEARCH_TREE.printTreePreorder("", false);
    }
}