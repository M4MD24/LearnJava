package _1_learn._1_5_data_structures._1_5_7_priority_queue;

import java.util.Arrays;
import java.util.PriorityQueue;

// • Methods of PriorityQueue

/**
 * <h1>Methods of PriorityQueue</h1>
 * <ul>
 *     <li><b>add()</b> - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.</li>
 *     <li><b>offer()</b> - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.</li>
 *     <li><b>remove()</b> - Returns and removes the head of the queue. Throws an exception if the queue is empty.</li>
 *     <li><b>poll()</b> - Returns and removes the head of the queue. Returns null if the queue is empty.</li>
 *     <li><b>contains()</b> - Searches the priority queue for the specified element. If the element is found, it returns true, if not it returns false.</li>
 *     <li><b>size()</b> - Returns the length of the priority queue.</li>
 *     <li><b>toArray()</b> - Converts a priority queue to an array and returns it.</li>
 * </ul>
 */
public class PriorityQueueExample {
    public static void main(final String[] ARGUMENTS) {
        priorityQueue();
    }

    private static void priorityQueue() {
        PriorityQueue<Integer> number = new PriorityQueue<>();

        number.add(1);
        number.add(2);
        number.add(3);
        System.out.println(number + " .add() after");

        number.offer(4);
        number.offer(5);
        number.offer(6);
        System.out.println(number + " .offer() after");

        System.out.println(number + " .remove(): " + number.remove(3));

        System.out.println(number + " .poll(): " + number.poll());

        System.out.println(number + " .contains(): " + number.contains(3));

        System.out.println(number + " .size(): " + number.size());

        System.out.println(number + " .toArray(): " + Arrays.toString(number.toArray()));
    }
}