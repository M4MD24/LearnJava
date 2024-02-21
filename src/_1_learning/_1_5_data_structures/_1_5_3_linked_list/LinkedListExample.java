package _1_learning._1_5_data_structures._1_5_3_linked_list;

import java.util.*;

// • Methods of LinkedList

/**
 * <h1>Methods of LinkedList</h1>
 * <p>The LinkedList class of the Java collections framework provides the functionality of the linked list data structure (doubly linked-list).</p>
 * <ul>
 *     <li><b>contains()</b> - checks if the LinkedListExample contains the element</li>
 *     <li><b>indexOf()</b> - returns the index of the first occurrence of the element</li>
 *     <li><b>lastIndexOf()</b> - returns the index of the last occurrence of the element</li>
 *     <li><b>clear()</b> - removes all the elements of the LinkedListExample</li>
 *     <li><b>iterator()</b> - returns an iterator to iterate over LinkedListExample</li>
 *     <li><b>addFirst()</b> - adds the specified element at the beginning of the linked list</li>
 *     <li><b>addLast()</b> - adds the specified element at the end of the linked list</li>
 *     <li><b>getFirst()</b> - returns the first element</li>
 *     <li><b>getLast()</b> - returns the last element</li>
 *     <li><b>removeFirst()</b> - removes the first element</li>
 *     <li><b>removeLast()</b> - removes the last element</li>
 *     <li><b>removeLastOccurrence()</b> - removes the last occurrence of a specified value in the list</li>
 *     <li><b>peek()</b> - returns the first element (head) of the linked list</li>
 *     <li><b>poll()</b> - returns and removes the first element from the linked list</li>
 *     <li><b>offer()</b> - adds the specified element at the end of the linked list</li>
 * </ul>
 */

public class LinkedListExample {
    public static void main(String[] args) {
        linkedList();
    }

    private static void linkedList() {
        LinkedList<Integer> number = new LinkedList<>();

        number.add(1);
        number.add(2);
        number.add(3);
        System.out.println(".add()                       : " + number);

        number.push(4);
        number.push(5);
        number.push(6);
        System.out.println(".push()                      : " + number);

        List<Integer> additionalNumber = new ArrayList<>();
        additionalNumber.add(4);
        additionalNumber.add(5);
        number.addAll(additionalNumber);

        System.out.println(".addAll()                    : " + number);
        System.out.println(".get()                       : " + number.get(2));

        Iterator<Integer> iterate = number.iterator();
        System.out.print(".iterator()                  : ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            if (iterate.hasNext()) System.out.print(", ");
            else System.out.println();
        }

        System.out.println(".remove()                    : " + number.remove(2));
        System.out.println(".remove() after              : " + number);

        number.removeAll(Collections.singletonList(5));
        System.out.println(".removeAll() after           : " + number);

        number.clear();
        System.out.println(".clear() after               : " + number);

        System.out.println(".size()                      : " + number.size());

        number.add(1);
        number.add(2);
        number.add(3);

        System.out.println(".toArray()                   : " + Arrays.toString(number.toArray()));

        System.out.println(".contains()                  : " + number.contains(2));

        number.sort(Collections.reverseOrder());
        System.out.println(".sort()                      : " + number);

        List<Integer> clonedListArrayList = (List<Integer>) number.clone();
        System.out.println(".clone()                     : " + clonedListArrayList);

        System.out.println(".isEmpty()                   : " + number.isEmpty());

        List<String> stringsListLinkedList = new LinkedList<>();
        stringsListLinkedList.add("One");
        stringsListLinkedList.add("Two");
        stringsListLinkedList.add("Three");
        System.out.println(".contains()                  : " + stringsListLinkedList.contains("One"));

        System.out.println(".indexOf()                   : " + number.indexOf(3));

        System.out.println(".lastIndexOf()               : " + number.lastIndexOf(1));

        number.addFirst(11);
        System.out.println(".addFirst()                  : " + number);

        number.addLast(4);
        System.out.println(".addLast()                   : " + number);

        System.out.println(".getFirst()                  : " + number.getFirst());

        System.out.println(".getLast()                   : " + number.getLast());

        System.out.println(".removeFirst()               : " + number.removeFirst());

        System.out.println(".removeLast()                : " + number.removeLast());

        number.removeLastOccurrence(1);
        System.out.println(".removeLastOccurrence() after: " + number);

        System.out.println(".peek()                      : " + number.peek());

        number.add(66);
        number.add(77);

        System.out.println(".poll()                      : " + number.poll());
        System.out.println(".pollFirst()                 : " + number.pollFirst());
        System.out.println(".pollLast()                  : " + number.pollLast());

        number.offer(10);
        System.out.println(".offer() after               : " + number);

        number.offerFirst(20);
        System.out.println(".offerFirst() after          : " + number);

        number.offerLast(30);
        System.out.println(".offerLast() after           : " + number + "\n");
    }
}