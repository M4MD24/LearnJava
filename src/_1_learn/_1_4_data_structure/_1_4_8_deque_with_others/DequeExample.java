package _1_learn._1_4_data_structure._1_4_8_deque_with_others;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

// • Methods of Deque
/**
 * <h1>Methods of Deque</h1>
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

public class DequeExample {
    public static void main(String[] args) {
        dequeArrayDeque();
        dequeLinkedList();
    }

    private static void dequeArrayDeque() {
        System.out.println("■ Deque ArrayDeque\n");
        Deque<Integer> number = new ArrayDeque<>();
        number.offer(1);
        number.offer(2);
        number.offer(3);
        number.offerFirst(4);
        number.offerLast(5);
        System.out.println("dequeArrayDeque .offer(), .offerFirst(), .offerLast(): " + number);
        System.out.println("dequeArrayDeque .peek()                              : " + number.peek());
        System.out.println("dequeArrayDeque .peekFirst()                         : " + number.peekFirst());
        System.out.println("dequeArrayDeque .peekLast()                          : " + number.peekLast());
        System.out.println("dequeArrayDeque .poll()                              : " + number.poll());
        System.out.println("dequeArrayDeque .poll() after                        : " + number);
        System.out.println("dequeArrayDeque .pollFirst()                         : " + number.pollFirst());
        System.out.println("dequeArrayDeque .pollFirst() after                   : " + number);
        System.out.println("dequeArrayDeque .pollLast()                          : " + number.pollLast());
        System.out.println("dequeArrayDeque .pollLast() after                    : " + number);

        number.push(6);
        System.out.println("dequeArrayDeque .push() after                        : " + number);
        System.out.println("dequeArrayDeque .pop()                               : " + number.pop());
        System.out.println("dequeArrayDeque .peek()                              : " + number.peek() + "\n");
    }

    private static void dequeLinkedList() {
        System.out.println("■ Deque LinkedListExample\n");
        Deque<Integer> number = new LinkedList<>();
        number.offer(1);
        number.offer(2);
        number.offer(3);
        number.offerFirst(4);
        number.offerLast(5);
        System.out.println("dequeLinkedList .offer(), .offerFirst(), .offerLast(): " + number);
        System.out.println("dequeLinkedList .peek()                              : " + number.peek());
        System.out.println("dequeLinkedList .peekFirst()                         : " + number.peekFirst());
        System.out.println("dequeLinkedList .peekLast()                          : " + number.peekLast());
        System.out.println("dequeLinkedList .poll()                              : " + number.poll());
        System.out.println("dequeLinkedList .poll() after                        : " + number);
        System.out.println("dequeLinkedList .pollFirst()                         : " + number.pollFirst());
        System.out.println("dequeLinkedList .pollFirst() after                   : " + number);
        System.out.println("dequeLinkedList .pollLast()                          : " + number.pollLast());
        System.out.println("dequeLinkedList .pollLast() after                    : " + number);

        number.push(6);
        System.out.println("dequeLinkedList .push() after                        : " + number);
        System.out.println("dequeLinkedList .pop()                               : " + number.pop());
        System.out.println("dequeLinkedList .peek()                              : " + number.peek());
    }
}