package _1_learn._1_7_data_structures_and_algorithms._1_7_2_linked_list._1_7_2_3_circular_linked_list;

public class Main {
    private static final CircularLinkedList<Integer> NUMBERS = new CircularLinkedList<>();

    public static void main(final String[] PARAMETERS) {
        System.out.println("■ displayAll() Test");
        displayAll();

        insertLastTest();

        insertFirstTest();

        updateAtTest();

        insertAtTest();

        deleteFirst();

        deleteAtTest();

        deleteLastTest();

        swapValuesBetweenIndexes();

        checkLinkedListIsSortedTest();

        removeDuplicatesFromSortedLinkedListTest();

        deleteAllTest();

        showSizeTest();

        showIsSortedTest();

        bubbleSortTest();

        mergeTest();

        remove2ndFromTheEndTest();
    }

    private static void displayAll() {
        NUMBERS.showAll();
        System.out.println();
        System.out.println();
    }

    private static void insertLastTest() {
        System.out.println("■ insertLast() Test");
        insertionLast();
        displayAll();
    }

    private static void insertionLast() {
        NUMBERS.insertLast(1);
        NUMBERS.insertLast(2);
        NUMBERS.insertLast(3);
    }

    private static void insertFirstTest() {
        System.out.println("■ insertFirst() Test");
        NUMBERS.insertFirst(4);
        displayAll();
    }

    private static void updateAtTest() {
        System.out.println("■ updateAt() Test");
        NUMBERS.updateAt(2, 4);
        displayAll();
    }

    private static void insertAtTest() {
        System.out.println("■ insertAt() Test");
        NUMBERS.insertAt(1, 2);
        displayAll();
    }

    private static void deleteFirst() {
        System.out.println("■ deleteFirst() Test");
        NUMBERS.deleteFirst();
        displayAll();
    }

    private static void deleteAtTest() {
        System.out.println("■ deleteAt() Test");
        NUMBERS.deleteAt(2);
        displayAll();
    }

    private static void deleteLastTest() {
        System.out.println("■ deleteLast() Test");
        NUMBERS.deleteLast();
        displayAll();
    }

    private static void swapValuesBetweenIndexes() {
        System.out.println("■ swapValuesBetweenIndexes() Test");
        NUMBERS.swapValuesBetweenIndexes(0, 1);
        displayAll();
    }

    private static void checkLinkedListIsSortedTest() {
        NUMBERS.insertFirst(1);
        NUMBERS.insertLast(2);
        System.out.println("■ checkLinkedListIsSorted() Test");
        System.out.println("Is sorted: " + NUMBERS.checkLinkedListIsSorted());
        displayAll();
    }

    private static void removeDuplicatesFromSortedLinkedListTest() {
        System.out.println("■ removeDuplicatesFromSortedLinkedList() Test");
        System.out.print("Before: ");
        NUMBERS.showAll();
        System.out.println();
        System.out.print("After : ");
        NUMBERS.removeDuplicatesFromSortedLinkedList();
        displayAll();
    }

    private static void deleteAllTest() {
        System.out.println("■ deleteAll() Test");
        NUMBERS.deleteAll();
        displayAll();
    }

    private static void showSizeTest() {
        System.out.println("■ size() Test");
        System.out.println("Size: " + NUMBERS.size());
        displayAll();
    }

    private static void showIsSortedTest() {
        NUMBERS.insertLast(6);
        NUMBERS.insertLast(2);
        NUMBERS.insertLast(4);
        System.out.println("■ isSorted() Test");
        System.out.println("Is Sorted: " + NUMBERS.isSorted());
        displayAll();
    }

    private static void bubbleSortTest() {
        System.out.println("■ bubbleSort() Test");
        NUMBERS.bubbleSort();
        displayAll();
    }

    private static void mergeTest() {
        System.out.println("■ merge() Test");
        CircularLinkedList<Integer> linkedList2 = new CircularLinkedList<>();
        linkedList2.insertLast(5);
        linkedList2.insertLast(1);
        linkedList2.insertLast(3);
        NUMBERS.merge(linkedList2);
        displayAll();
    }

    private static void remove2ndFromTheEndTest() {
        System.out.println("■ remove2ndFromTheEnd() Test");
        NUMBERS.remove2ndFromTheEnd();
        displayAll();
    }
}