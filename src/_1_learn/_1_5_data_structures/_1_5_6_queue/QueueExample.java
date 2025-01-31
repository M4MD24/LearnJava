package _1_learn._1_5_data_structures._1_5_6_queue;

import java.util.*;

// • Methods of Queues

/**
 * <h1>Methods of Queues</h1>
 * <p>The Queue interface includes all the methods of the Collection interface. It is because Collection is the super interface of Queue.</p>
 * <p>Some of the commonly used methods of the Queue interface are:</p>
 * <br/>
 * <h2>1. Methods of Queue (LinkedListExample, ArrayExample Deque and PriorityQueue)</h2>
 * <ul>
 *     <li><b>add()</b> - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.</li>
 *     <li><b>offer()</b> - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.</li>
 *     <li><b>element()</b> - Returns the head of the queue. Throws an exception if the queue is empty.</li>
 *     <li><b>peek()</b> - Returns the head of the queue. Returns null if the queue is empty.</li>
 *     <li><b>remove()</b> - Returns and removes the head of the queue. Throws an exception if the queue is empty.</li>
 *     <li><b>poll()</b> - Returns and removes the head of the queue. Returns null if the queue is empty.</li>
 * </ul>
 * <br/>
 * <h2>2. Methods PriorityQueue</h2>
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

public class QueueExample {
    public static void main(final String[] ARGUMENTS) {
        queueLinkedList();
        queueArrayDeque();
        queuePriorityQueue();
        priorityQueue();
        customComparator();
    }

    /**
     * <h2>1.1 Queue LinkedListExample</h2>
     */
    private static void queueLinkedList() {
        System.out.println("■ 1.1 Queue LinkedListExample\n");
        Queue<String> fruit = new LinkedList<>();
        fruit.offer("Apple");
        fruit.offer("Banana");
        fruit.offer("Mango");
        System.out.println("queueLinkedList                                : " + fruit);
        System.out.println("queueLinkedList .peek()                        : " + fruit.peek());
        String itemDeleted = fruit.poll();
        System.out.println("queueLinkedList .poll(), done deleted this item: " + itemDeleted);
        System.out.println("queueLinkedList after deleted                  : " + fruit + "\n");
    }

    /**
     * <h2>1.2 Queue ArrayExample Deque</h2>
     */
    private static void queueArrayDeque() {
        System.out.println("■ 1.2 Queue ArrayExample Deque\n");
        Queue<String> name = new ArrayDeque<>();
        name.offer("Abd ElRahman");
        name.offer("Abd Allah");
        name.offer("Mohamed");
        System.out.println("queueArrayDeque                                : " + name);
        System.out.println("queueArrayDeque .peek()                        : " + name.peek());
        String itemDeleted = name.poll();
        System.out.println("queueArrayDeque .poll(), done deleted this item: " + itemDeleted);
        System.out.println("queueArrayDeque after deleted                  : " + name + "\n");
    }

    /**
     * <h2>1.3 Queue PriorityQueue</h2>
     */
    private static void queuePriorityQueue() {
        System.out.println("■ 1.3 Queue PriorityQueue\n");
        Queue<String> animal = new PriorityQueue<>();
        animal.offer("Dog");
        animal.offer("Cat");
        animal.offer("Horse");
        System.out.println("queuePriorityQueue                                : " + animal);
        System.out.println("queuePriorityQueue .peek()                        : " + animal.peek());
        String itemDeleted = animal.poll();
        System.out.println("queuePriorityQueue .poll(), done deleted this item: " + itemDeleted);
        System.out.println("queuePriorityQueue after deleted                  : " + animal + "\n");
    }

    /**
     * <h2>2. QueuePriority</h2>
     */
    private static void priorityQueue() {
        System.out.println("■ 2. PriorityQueue\n");
        PriorityQueue<String> countries = new PriorityQueue<>();
        countries.offer("Egypt");
        countries.offer("Kuwait");
        countries.offer("Saudi Arabia");
        System.out.println("priorityQueue .offer()                       : " + countries);
        System.out.println("priorityQueue .peek()                        : " + countries.peek());
        String itemDeleted = countries.poll();
        System.out.println("priorityQueue .poll(), done deleted this item: " + itemDeleted);
        System.out.println("priorityQueue after deleted                  : " + countries);

        Iterator<String> iterate = countries.iterator();
        System.out.print("priorityQueue with iterate()                 : ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            if (iterate.hasNext()) System.out.print(", ");
            else System.out.println();
        }

// >       With Foreach
        /*for (String country : countries) {
            System.out.print(country);
            System.out.print(", ");
        }*/

        System.out.println("priorityQueue .toArray                       : " + Arrays.toString(countries.toArray()) + "\n");
    }

    /**
     * <h2>- Custom Comparator</h2>
     */
    private static void customComparator() {
        System.out.println("■ - Custom Comparator\n");
        System.out.println(new CustomComparator().compare(3, 2));
    }
}

class CustomComparator implements Comparator<String> {
    public String compare(Integer number1, Integer number2) {
        int value = number1.compareTo(number2);
        System.out.print("CustomComparator: " + value);
        if (value > 0) return " (number1 < number2)";
        else if (value < 0) return " (number1 > number2)";
        else return " (number1 == number2)";
    }

    @Override
    public int compare(String o1, String o2) {
        return 0;
    }
}