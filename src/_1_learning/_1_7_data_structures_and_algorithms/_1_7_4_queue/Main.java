package _1_learning._1_7_data_structures_and_algorithms._1_7_4_queue;

public class Main {
    private static final Queue<Integer> queue = new Queue<>();

    public static void main(String[] args) {
        showAllTest();

        enQueueTest();

        deQueueTest();
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
        queue.showAll();
    }
}