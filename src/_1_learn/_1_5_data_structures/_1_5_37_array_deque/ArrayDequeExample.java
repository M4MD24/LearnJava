package _1_learn._1_5_data_structures._1_5_37_array_deque;

import java.util.ArrayDeque;

/** <h1>Methods of ArrayDeque</h1>
 * <p>The ArrayDeque class in Java is a resizable array implementation of the Deque interface.
 * It provides a way to handle a double-ended queue efficiently.</p>
 * <ul>
 *     <li><b>add(element)</b> - Adds an element to the end of the deque.</li>
 *     <li><b>addFirst(element)</b> - Adds an element to the front of the deque.</li>
 *     <li><b>addLast(element)</b> - Adds an element to the end of the deque.</li>
 *     <li><b>remove()</b> - Removes the first element from the deque.</li>
 *     <li><b>removeFirst()</b> - Removes the first element from the deque.</li>
 *     <li><b>removeLast()</b> - Removes the last element from the deque.</li>
 *     <li><b>peek()</b> - Retrieves the first element without removing it.</li>
 *     <li><b>peekFirst()</b> - Retrieves the first element without removing it.</li>
 *     <li><b>peekLast()</b> - Retrieves the last element without removing it.</li>
 *     <li><b>poll()</b> - Retrieves and removes the first element.</li>
 *     <li><b>pollFirst()</b> - Retrieves and removes the first element.</li>
 *     <li><b>pollLast()</b> - Retrieves and removes the last element.</li>
 *     <li><b>push(element)</b> - Pushes an element onto the deque.</li>
 *     <li><b>pop()</b> - Removes and returns the first element.</li>
 *     <li><b>isEmpty()</b> - Checks if the deque is empty.</li>
 *     <li><b>size()</b> - Returns the size of the deque.</li>
 *     <li><b>contains(element)</b> - Checks if the deque contains a specific element.</li>
 *     <li><b>toArray()</b> - Converts the deque to an array.</li>
 * </ul>
 */

public class ArrayDequeExample {
    public static void main(final String[] ARGUMENTS) {
        final ArrayDeque<Integer> ARRAY_DEQUE = new ArrayDeque<>();

        // Add elements
        ARRAY_DEQUE.add(1);
        ARRAY_DEQUE.addFirst(3);
        ARRAY_DEQUE.addLast(2);
        ARRAY_DEQUE.addLast(5);
        ARRAY_DEQUE.addLast(4);
        ARRAY_DEQUE.addLast(5);
        ARRAY_DEQUE.addLast(7);
        ARRAY_DEQUE.addLast(6);
        ARRAY_DEQUE.addLast(5);
        System.out.println("After adding elements: " + ARRAY_DEQUE);

        // Remove elements
        ARRAY_DEQUE.remove();
        ARRAY_DEQUE.removeFirst();
        ARRAY_DEQUE.removeLast();
        System.out.println("After removing elements: " + ARRAY_DEQUE);

        // Peek operations
        System.out.println("Peek: " + ARRAY_DEQUE.peek());
        System.out.println("Peek First: " + ARRAY_DEQUE.peekFirst());
        System.out.println("Peek Last: " + ARRAY_DEQUE.peekLast());

        // Poll operations
        System.out.println("Poll: " + ARRAY_DEQUE.poll());
        System.out.println("Poll First: " + ARRAY_DEQUE.pollFirst());
        System.out.println("Poll Last: " + ARRAY_DEQUE.pollLast());
        System.out.println("After polling: " + ARRAY_DEQUE);

        // Push and Pop
        ARRAY_DEQUE.push(9);
        System.out.println("After push: " + ARRAY_DEQUE);
        System.out.println("Pop: " + ARRAY_DEQUE.pop());
        System.out.println("After pop: " + ARRAY_DEQUE);

        // Checking properties
        System.out.println("Is Empty: " + ARRAY_DEQUE.isEmpty());
        System.out.println("Size: " + ARRAY_DEQUE.size());
        System.out.println("Contains 3: " + ARRAY_DEQUE.contains(3));

        // Convert to array
        System.out.print("As Array: " + java.util.Arrays.toString(ARRAY_DEQUE.toArray()));
    }
}
