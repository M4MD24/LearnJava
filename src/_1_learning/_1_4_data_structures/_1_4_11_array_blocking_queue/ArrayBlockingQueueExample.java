package _1_learning._1_4_data_structures._1_4_11_array_blocking_queue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

// • Methods of ArrayBlockingQueue

/**
 * <h1>Methods of ArrayBlockingQueue</h1>
 * <p>The ArrayBlockingQueue class of the Java Collections framework provides the blocking queue implementation using an array.</p>
 * <ul>
 * <li><b>add()</b> - Inserts the specified element to the array blocking queue. It throws an exception if the queue is full.</li>
 * <li><b>offer()</b> - Inserts the specified element to the array blocking queue. It returns false if the queue is full.</li>
 * <li><b>peek()</b> - Returns an element from the front of the array blocking queue. It returns null if the queue is empty.</li>
 * <li><b>iterator()</b> - Returns an iterator object to sequentially access elements from the array blocking queue. It throws an exception if the queue is empty. We must import the java.util.Iterator package to use it.</li>
 * <li><b>remove()</b> - Returns and removes a specified element from the array blocking queue. It throws an exception if the queue is empty.</li>
 * <li><b>poll()</b> - Returns and removes a specified element from the array blocking queue. It returns null if the queue is empty.</li>
 * <li><b>clear()</b> - Removes all the elements from the array blocking queue.</li>
 * <li><b>put()</b> - To add an element to the end of an array blocking queue, we can use the put() method.</li>
 * <li><b>take()</b> - To return and remove an element from the front of the array blocking queue, we can use the take() method.</li>
 * <li><b>contains(</b>element)	Searches the array blocking queue for the specified element.If the element is found, it returns true, if not it returns false.</li>
 * <li><b>size()</b>	Returns the length of the array blocking queue.</li>
 * <li><b>toArray()</b>	Converts array blocking queue to an array and returns it.</li>
 * <li><b>toString()</b> 	Converts the array blocking queue to string</li>
 * </ul>
 */
public class ArrayBlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        arrayBlockingQueue();
    }

    private static void arrayBlockingQueue() throws InterruptedException {
        ArrayBlockingQueue<String> number = new ArrayBlockingQueue<>(10);

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