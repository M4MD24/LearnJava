package _1_learning._1_4_data_structures._1_4_9_array_deque;

import java.util.ArrayDeque;
import java.util.Deque;

// • Methods of ArrayQueue

/**
 * <h1>Methods of ArrayQueue</h1>
 * <p>Since Deque extends the Queue interface, it inherits all the methods of the Queue interface.</p>
 * <p>Besides methods available in the Queue interface, the Deque interface also includes the following methods:</p>
 * <ul>
 *     <li><b>addFirst()</b> - Adds the specified element at the beginning of the deque. Throws an exception if the deque is full.</li>
 *     <li><b>addLast()</b> - Adds the specified element at the end of the deque. Throws an exception if the deque is full.</li>
 *     <li><b>offerFirst()</b> - Adds the specified element at the beginning of the deque. Returns false if the deque is full.</li>
 *     <li><b>offerLast()</b> - Adds the specified element at the end of the deque. Returns false if the deque is full.</li>
 *     <li><b>getFirst()</b> - Returns the first element of the deque. Throws an exception if the deque is empty.</li>
 *     <li><b>getLast()</b> - Returns the last element of the deque. Throws an exception if the deque is empty.</li>
 *     <li><b>peekFirst()</b> - Returns the first element of the deque. Returns null if the deque is empty.</li>
 *     <li><b>peekLast()</b> - Returns the last element of the deque. Returns null if the deque is empty.</li>
 *     <li><b>removeFirst()</b> - Returns and removes the first element of the deque. Throws an exception if the deque is empty.</li>
 *     <li><b>removeLast()</b> - Returns and removes the last element of the deque. Throws an exception if the deque is empty.</li>
 *     <li><b>pollFirst()</b> - Returns and removes the first element of the deque. Returns null if the deque is empty.</li>
 *     <li><b>pollLast()</b> - Returns and removes the last element of the deque. Returns null if the deque is empty.</li>
 *     <li><b>pollLast()</b> - Returns and removes the last element of the deque. Returns null if the deque is empty.</li>
 *     <li><b>push()</b> - adds an element at the beginning of deque.</li>
 *     <li><b>pop()</b> - removes an element from the beginning of deque.</li>
 *     <li><b>peek()</b> - returns an element from the beginning of deque.</li>
 * </ul>
 */

public class ArrayQueue {
    public static void main(String[] args) {
        arrayQueue();
    }

    private static void arrayQueue() {
        Deque<Integer> number = new ArrayDeque<>();
        number.offer(1);
        number.offer(2);
        number.offer(3);
        number.offerFirst(4);
        number.offerLast(5);
        System.out.println(".offer(), .offerFirst(), .offerLast(): " + number);
        System.out.println(".peek()                              : " + number.peek());
        System.out.println(".peekFirst()                         : " + number.peekFirst());
        System.out.println(".peekLast()                          : " + number.peekLast());
        System.out.println(".poll()                              : " + number.poll());
        System.out.println(".poll() after                        : " + number);
        System.out.println(".pollFirst()                         : " + number.pollFirst());
        System.out.println(".pollFirst() after                   : " + number);
        System.out.println(".pollLast()                          : " + number.pollLast());
        System.out.println(".pollLast() after                    : " + number);

        number.push(6);
        System.out.println(".push() after                        : " + number);
        System.out.println(".pop()                               : " + number.pop());
        System.out.println(".peek()                              : " + number.peek() + "\n");
    }
}