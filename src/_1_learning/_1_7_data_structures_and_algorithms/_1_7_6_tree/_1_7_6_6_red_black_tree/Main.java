package _1_learning._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_6_red_black_tree;

public class Main {
    private static final RedBlackTree ELEMENTS = new RedBlackTree(3);

    public static void main(final String[] PARAMETERS) {
        addElements();
        System.out.println("After add elements:");
        showElements();
        System.out.println("\n\nCount of nodes: " + ELEMENTS.countOfNodes());
        System.out.println("\nIs Got It Element? " + ELEMENTS.search(4));
        ELEMENTS.makeEmpty();
        System.out.println("\nAfter make empty:");
        showElements();
        System.out.print("\nIs Empty? " + ELEMENTS.isEmpty());
    }

    private static void showElements() {
        ELEMENTS.postorder();
        System.out.println();
        ELEMENTS.inorder();
        System.out.println();
        ELEMENTS.preorder();
    }

    private static void addElements() {
        ELEMENTS.insertElement(20);
        ELEMENTS.insertElement(11);
        ELEMENTS.insertElement(53);
        ELEMENTS.insertElement(46);
        ELEMENTS.insertElement(35);
    }
}