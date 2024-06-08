package _1_learning._1_7_data_structures_and_algorithms._1_7_2_linked_list._1_7_2_2_doubly_linked_list;

public class Main {
    private static final DoublyLinkedList<Integer> LINKED_LIST = new DoublyLinkedList<>();

    public static void main(final String[] ARGS) {
        System.out.println("■ displayAll() Test");
        displayAll();

        insertLastTest();

        insertFirstTest();

        updateAtTest();

        insertAtTest();

        deleteFirst();

        deleteAtTest();

        deleteLastTest();

        swapBetweenIndexesTest();

        swapEveryTwoAdjacent();

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
        LINKED_LIST.showAll();
        System.out.println();
        System.out.println();
    }

    private static void insertLastTest() {
        System.out.println("■ insertLast() Test");
        insertionLast();
        displayAll();
    }

    private static void insertionLast() {
        LINKED_LIST.insertLast(1);
        LINKED_LIST.insertLast(2);
        LINKED_LIST.insertLast(3);
    }

    private static void insertFirstTest() {
        System.out.println("■ insertFirst() Test");
        LINKED_LIST.insertFirst(4);
        displayAll();
    }

    private static void updateAtTest() {
        System.out.println("■ updateAt() Test");
        LINKED_LIST.updateAt(2, 4);
        displayAll();
    }

    private static void insertAtTest() {
        System.out.println("■ insertAt() Test");
        LINKED_LIST.insertAt(1, 2);
        displayAll();
    }

    private static void deleteFirst() {
        System.out.println("■ deleteFirst() Test");
        LINKED_LIST.deleteFirst();
        displayAll();
    }

    private static void deleteAtTest() {
        System.out.println("■ deleteAt() Test");
        LINKED_LIST.deleteAt(2);
        displayAll();
    }

    private static void deleteLastTest() {
        System.out.println("■ deleteLast() Test");
        LINKED_LIST.deleteLast();
        displayAll();
    }

    private static void swapBetweenIndexesTest() {
        System.out.println("■ swapBetweenIndexes() Test");
        LINKED_LIST.swapValueBetweenIndexes(0, 1);
        displayAll();
    }

    private static void swapEveryTwoAdjacent() {
        System.out.println("■ swapEveryTwoAdjacent() Test");
        LINKED_LIST.swapEveryTwoAdjacent();
        displayAll();
    }

    private static void checkLinkedListIsSortedTest() {
        LINKED_LIST.insertFirst(1);
        LINKED_LIST.insertLast(2);
        System.out.println("■ checkLinkedListIsSorted() Test");
        System.out.println("Is sorted: " + LINKED_LIST.checkLinkedListIsSorted());
        displayAll();
    }

    private static void removeDuplicatesFromSortedLinkedListTest() {
        System.out.println("■ removeDuplicatesFromSortedLinkedList() Test");
        System.out.print("Before: ");
        LINKED_LIST.showAll();
        System.out.println();
        System.out.print("After : ");
        LINKED_LIST.removeDuplicatesFromSortedLinkedList();
        displayAll();
    }

    private static void deleteAllTest() {
        System.out.println("■ deleteAll() Test");
        LINKED_LIST.deleteAll();
        displayAll();
    }

    private static void showSizeTest() {
        System.out.println("■ size() Test");
        System.out.println("Size: " + LINKED_LIST.size());
        displayAll();
    }

    private static void showIsSortedTest() {
        LINKED_LIST.insertLast(6);
        LINKED_LIST.insertLast(2);
        LINKED_LIST.insertLast(4);
        System.out.println("■ isSorted() Test");
        System.out.println("Is Sorted: " + LINKED_LIST.isSorted());
        displayAll();
    }

    private static void bubbleSortTest() {
        System.out.println("■ bubbleSort() Test");
        LINKED_LIST.bubbleSort();
        displayAll();
    }

    private static void mergeTest() {
        System.out.println("■ merge() Test");
        DoublyLinkedList<Integer> linkedList2 = new DoublyLinkedList<>();
        linkedList2.insertLast(5);
        linkedList2.insertLast(1);
        linkedList2.insertLast(3);
        LINKED_LIST.merge(linkedList2);
        displayAll();
    }

    private static void remove2ndFromTheEndTest() {
        System.out.println("■ remove2ndFromTheEnd() Test");
        LINKED_LIST.remove2ndFromTheEnd();
        displayAll();
    }
}