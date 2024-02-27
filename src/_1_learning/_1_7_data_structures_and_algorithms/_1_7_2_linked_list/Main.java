package _1_learning._1_7_data_structures_and_algorithms._1_7_2_linked_list;

public class Main {
    private static final LinkedList<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
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
        linkedList.showAll();
        System.out.println();
        System.out.println();
    }

    private static void insertLastTest() {
        System.out.println("■ insertLast() Test");
        insertionLast();
        displayAll();
    }

    private static void insertionLast() {
        linkedList.insertLast(1);
        linkedList.insertLast(2);
        linkedList.insertLast(3);
    }

    private static void insertFirstTest() {
        System.out.println("■ insertFirst() Test");
        linkedList.insertFirst(4);
        displayAll();
    }

    private static void updateAtTest() {
        System.out.println("■ updateAt() Test");
        linkedList.updateAt(2, 4);
        displayAll();
    }

    private static void insertAtTest() {
        System.out.println("■ insertAt() Test");
        linkedList.insertAt(1, 2);
        displayAll();
    }

    private static void deleteFirst() {
        System.out.println("■ deleteFirst() Test");
        linkedList.deleteFirst();
        displayAll();
    }

    private static void deleteAtTest() {
        System.out.println("■ deleteAt() Test");
        linkedList.deleteAt(2);
        displayAll();
    }

    private static void deleteLastTest() {
        System.out.println("■ deleteLast() Test");
        linkedList.deleteLast();
        displayAll();
    }

    private static void swapBetweenIndexesTest() {
        System.out.println("■ swapBetweenIndexes() Test");
        linkedList.swapBetweenIndexes(0, 1);
        displayAll();
    }

    private static void checkLinkedListIsSortedTest() {
        linkedList.insertFirst(1);
        linkedList.insertLast(2);
        System.out.println("■ checkLinkedListIsSorted() Test");
        System.out.println("Is sorted: " + linkedList.checkLinkedListIsSorted());
        displayAll();
    }

    private static void removeDuplicatesFromSortedLinkedListTest() {
        System.out.println("■ removeDuplicatesFromSortedLinkedList() Test");
        System.out.print("Before: ");
        linkedList.showAll();
        System.out.println();
        System.out.print("After : ");
        linkedList.removeDuplicatesFromSortedLinkedList();
        displayAll();
    }

    private static void deleteAllTest() {
        System.out.println("■ deleteAll() Test");
        linkedList.deleteAll();
        displayAll();
    }

    private static void showSizeTest() {
        System.out.println("■ size() Test");
        System.out.println("Size: " + linkedList.size());
        displayAll();
    }

    private static void showIsSortedTest() {
        linkedList.insertLast(6);
        linkedList.insertLast(2);
        linkedList.insertLast(4);
        System.out.println("■ isSorted() Test");
        System.out.println("Is Sorted: " + linkedList.isSorted());
        displayAll();
    }

    private static void bubbleSortTest() {
        System.out.println("■ bubbleSort() Test");
        linkedList.bubbleSort();
        displayAll();
    }

    private static void mergeTest() {
        System.out.println("■ merge() Test");
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.insertLast(5);
        linkedList2.insertLast(1);
        linkedList2.insertLast(3);
        linkedList.merge(linkedList2);
        displayAll();
    }

    private static void remove2ndFromTheEndTest() {
        System.out.println("■ remove2ndFromTheEnd() Test");
        linkedList.remove2ndFromTheEnd();
        displayAll();
    }
}