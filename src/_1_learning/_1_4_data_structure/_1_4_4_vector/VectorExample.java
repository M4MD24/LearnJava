package _1_learning._1_4_data_structure._1_4_4_vector;

import java.util.*;

// • Methods of Vectors
/**
 * <h1>Methods of Vector</h1>
 * <p>The Vector class is an implementation of the List interface that allows us to create resizable-arrays similar to the ArrayList class.</p>
 * <ul>
 *     <li><b>add(element)</b> - adds an element to vectors.</li>
 *     <li><b>add(index, element)</b> - adds an element to the specified position.</li>
 *     <li><b>addAll(vector)</b> - adds all elements of a vector to another vector.</li>
 *     <li><b>get(index)</b> - returns an element specified by the index</li>
 *     <li><b>iterator()</b> - returns an iterator object to sequentially access vector elements</li>
 *     <li><b>remove(index)</b> - removes an element from specified position</li>
 *     <li><b>removeAll()</b> - removes all the elements</li>
 *     <li><b>clear()</b> - removes all elements. It is more efficient than removeAll()</li>
 *     <li><b>set()</b> - changes an element of the vector</li>
 *     <li><b>size()</b> - returns the size of the vector</li>
 *     <li><b>toArray()</b> - converts the vector into an array</li>
 *     <li><b>toString()</b> - converts the vector into a String</li>
 *     <li><b>contains()</b> - searches the vector for specified element and returns a boolean result</li>
 * </ul>
 */
public class VectorExample {
    public static void main(String[] args) {
        vector();
    }

    private static void vector() {
        Vector<Integer> number = new Vector<>();
        number.add(1);
        number.add(2);
        number.add(3);
        System.out.println(".add()                       : " + number);

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

        System.out.println(".removeLast()                : " + number.removeLast() + "\n");
    }
}