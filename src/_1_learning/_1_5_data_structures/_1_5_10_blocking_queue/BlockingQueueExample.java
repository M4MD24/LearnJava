package _1_learning._1_5_data_structures._1_5_10_blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// • Methods of BlockingQueue

/**
 * <h1>Methods of BlockingQueue</h1>
 * <p>The BlockingQueue interface of the Java Collections framework extends the Queue interface. It allows any operation to wait until it can be successfully performed.</p>
 * <ul>
 *     <li><b>add()</b> - Inserts an element to the blocking queue at the end of the queue. Throws an exception if the queue is full.</li>
 *     <li><b>element()</b> - Returns the head of the blocking queue. Throws an exception if the queue is empty.</li>
 *     <li><b>remove()</b> - Removes an element from the blocking queue. Throws an exception if the queue is empty.</li>
 *     <li><b>offer()</b> - Inserts the specified element to the blocking queue at the end of the queue. Returns false if the queue is full.</li>
 *     <li><b>peek()</b> - Returns the head of the blocking queue. Returns null if the queue is empty.</li>
 *     <li><b>poll()</b> - Removes an element from the blocking queue. Returns null if the queue is empty.</li>
 *     <li><b>put()</b> - Inserts an element to the blocking queue. If the queue is full, it will wait until the queue has space to insert an element.</li>
 *     <li><b>take()</b> - Removes and returns an element from the blocking queue. If the queue is empty, it will wait until the queue has elements to be deleted.</li>
 * </ul>
 */
public class BlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        blockingQueueArrayBlockingQueue();
        blockingQueueLinkedBlockingQueue();
    }

    private static void blockingQueueArrayBlockingQueue() throws InterruptedException {
        BlockingQueue<String> number = new ArrayBlockingQueue<>(10);
        number.add("One");
        number.add("Two");
        number.add("Three");
        System.out.println(".add() after  : " + number);

        System.out.println(".element()    : " + number.element());

        System.out.println(".remove()     : " + number.remove());

        number.offer("Four");
        number.offer("Five");
        number.offer("Six");
        System.out.println(".offer() after: " + number);

        System.out.println(".peek()       : " + number.peek());

        System.out.println(".poll()       : " + number.poll());

        number.put("Seven");
        number.put("Eight");
        number.put("Nine");
        System.out.println(".put()        : " + number);

        System.out.println(".take()       : " + number.take());

        System.out.println(".take() after : " + number);
    }

    private static void blockingQueueLinkedBlockingQueue() {
        BlockingQueue<String> number = new LinkedBlockingQueue<>(10);
        number.add("One");
        number.add("Two");
        number.add("Three");
        System.out.println(".add() after  : " + number);

        System.out.println(".element()    : " + number.element());

        System.out.println(".remove()     : " + number.remove());

        number.offer("Four");
        number.offer("Five");
        number.offer("Six");
        System.out.println(".offer() after: " + number);

        System.out.println(".peek()       : " + number.peek());

        System.out.println(".poll()       : " + number.poll());

        System.out.println(".take() after : " + number);
    }
}