package _1_learning._1_7_data_structures_and_algorithms._1_7_8_heap._1_7_8_1_normal_heap;

public class Main {
    private static final NormalHeap ELEMENTS = new NormalHeap();

    public static void main(final String[] PARAMETERS) {
        addElements();

        System.out.println("All elements:");
        ELEMENTS.printElements();
        System.out.println();

        ELEMENTS.deleteElement(4);
        System.out.println("After deleting an element:");
        ELEMENTS.printElements();
        System.out.println();

        ELEMENTS.sortElements((byte) -1);
        System.out.println("After sorting as min-heap:");
        ELEMENTS.printElements();
    }

    private static void addElements() {
        ELEMENTS.insertElement(3);
        ELEMENTS.insertElement(4);
        ELEMENTS.insertElement(9);
        ELEMENTS.insertElement(5);
        ELEMENTS.insertElement(2);
    }
}