package _1_learn._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_4_b_tree;

public class Main {
    private static final BTree ELEMENTS = new BTree(3);

    public static void main(final String[] PARAMETERS) {
        afterInsertElements();
        afterDeleteElement();
    }

    private static void afterDeleteElement() {
        System.out.println("\n\nAfter delete element:");
        ELEMENTS.deleteElement(10);
        ELEMENTS.displayElements();
    }

    private static void afterInsertElements() {
        System.out.println("After insert elements:");
        insertElements();
        ELEMENTS.displayElements();
    }

    private static void insertElements() {
        ELEMENTS.insertElement(8);
        ELEMENTS.insertElement(9);
        ELEMENTS.insertElement(10);
        ELEMENTS.insertElement(11);
        ELEMENTS.insertElement(15);
        ELEMENTS.insertElement(20);
        ELEMENTS.insertElement(17);
    }
}