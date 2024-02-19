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

        deleteAllTest();
    }


    private static void displayAll() {
        linkedList.showAll();
        System.out.println();
        System.out.println();
    }

    private static void insertLastTest(){
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

    private static void deleteAllTest() {
        System.out.println("■ deleteAll() Test");
        linkedList.deleteAll();
        linkedList.showAll();
    }
}