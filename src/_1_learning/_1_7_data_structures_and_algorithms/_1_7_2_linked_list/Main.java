package _1_learning._1_7_data_structures_and_algorithms._1_7_2_linked_list;

public class Main {
    private static final LinkedList<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        displayAll();

        insertionLast();
        displayAll();

        linkedList.insertFirst(4);
        displayAll();

        linkedList.updateAt(2, 4);
        displayAll();

        linkedList.insertAt(1, 2);
        displayAll();

        linkedList.deleteFirst();
        displayAll();

        linkedList.deleteAt(2);
        displayAll();

        linkedList.deleteLast();
        displayAll();

        linkedList.swapBetweenIndexes(0, 1);
        displayAll();

        linkedList.deleteAll();
        linkedList.showAll();
    }

    private static void displayAll() {
        linkedList.showAll();
        System.out.println();
    }

    private static void insertionLast() {
        linkedList.insertLast(1);
        linkedList.insertLast(2);
        linkedList.insertLast(3);
    }
}