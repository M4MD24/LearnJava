package _1_learning._1_4_data_structure._1_4_12_linked_blocking_queue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

// • Methods of LinkedBlockingQueue
/**
 * <h1>Methods of LinkedBlockingQueue</h1>
 * <p>The LinkedBlockingQueue class of the Java Collections framework provides the blocking queue implementation using a linked list.</p>
 * <li><b>add()</b> - Inserts a specified element to the linked blocking queue. It throws an exception if the queue is full.</li>
 * <li><b>offer()</b> - Inserts a specified element to the linked blocking queue. It returns false if the queue is full.</li>
 * <li><b>peek()</b> - Returns an element from the front of the linked blocking queue. It returns null if the queue is empty.</li>
 * <li><b>iterator()</b> - Returns an iterator object to sequentially access an element from the linked blocking queue. It throws an exception if the queue is empty. We must import the java.util.Iterator package to use it.</li>
 * <li><b>remove()</b> - Returns and removes a specified element from the linked blocking queue. It throws an exception if the queue is empty.</li>
 * <li><b>poll()</b> - Returns and removes a specified element from the linked blocking queue. It returns null if the queue is empty.</li>
 * <li><b>clear()</b> - Removes all the elements from the linked blocking queue.</li>
 * <li><b>put()</b> - To insert the specified element to the end of a linked blocking queue, we use the put() method.</li>
 * <li><b>take()</b> - To return and remove an element from the front of the linked blocking queue, we can use the take() method.</li>
 * <li><b>contains(</b> - Searches the linked blocking queue for the specified element. If the element is found, it returns true, if not it returns false.</li>
 * <li><b>size()</b> - Returns the length of the linked blocking queue.</li>
 * <li><b>toArray()</b> - Converts linked blocking queue to an array and return the array.</li>
 * <li><b>toString()</b> - Converts the linked blocking queue to string</li>
 */
public class LinkedBlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        linkedBlockingQueue();
    }

    private static void linkedBlockingQueue() throws InterruptedException {
        LinkedBlockingQueue<String> number = new LinkedBlockingQueue<>();

        number.add("One");
        number.add("Two");
        number.add("Three");
        System.out.println(".add() after   : " + number);

        number.offer("Four");
        number.offer("Five");
        number.offer("Six");
        System.out.println(".offer() after : " + number);

        System.out.println(".peek()        : " + number.peek());

        Iterator<String> iterate = number.iterator();
        System.out.print(".iterator()    : ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            if (iterate.hasNext()) System.out.print(", ");
            else System.out.println();
        }

        System.out.println(".remove()      : " + number.remove());
        System.out.println(".remove() after: " + number);

        System.out.println(".poll()        : " + number.poll());
        System.out.println(".poll() after  : " + number);

        number.clear();
        System.out.println(".clear() after : " + number);

        number.put("Seven");
        number.put("Eight");
        number.put("Nine");
        System.out.println(".put() after   : " + number);

        System.out.println(".take()        : " + number.take());
        System.out.println(".take() after  : " + number);

        System.out.println(".contains()    : " + number.contains("Nine"));

        System.out.println(".toArray()     : " + Arrays.toString(number.toArray()));

        System.out.println(".toString()    : " + number.toString());
    }
}