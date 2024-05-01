package _1_learning._1_7_data_structures_and_algorithms._1_7_5_queue;

public class Main {
    private static final Queue<Integer> queue = new Queue<>();

    public static void main(final String[] ARGS) {
        showAllTest();

        enQueueTest();

        deQueueTest();

        getSizeTest();

        isEmptyTest();

        isFullTest();

        showElementsTest();
    }

    private static void showAllTest() {
        System.out.println("■ showAll() Test");
        showAll();
    }

    private static void showAll() {
        queue.showAll();
        System.out.println();
        System.out.println();
    }

    private static void enQueueTest() {
        System.out.println("■ enQueue() Test");
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        showAll();
    }

    private static void deQueueTest() {
        System.out.println("■ deQueue() Test");
        queue.deQueue();
        queue.deQueue();
        showAll();
    }

    private static void getSizeTest() {
        System.out.println("■ getSize() Test");
        System.out.println("size: " + queue.getSize());
        showAll();
    }

    private static void isEmptyTest() {
        System.out.println("■ isEmpty() Test");
        System.out.println("isEmpty: " + queue.isEmpty());
        showAll();
    }

    private static void isFullTest() {
        System.out.println("■ isFull() Test");
        System.out.println("isFull: " + queue.isFull());
        showAll();
    }

    private static void showElementsTest() {
        System.out.println("■ showElements() Test");
        System.out.print("elements: ");
        queue.showElements();
        System.out.println();
        queue.showAll();
    }
}