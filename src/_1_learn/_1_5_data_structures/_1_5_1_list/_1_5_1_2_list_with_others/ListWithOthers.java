package _1_learn._1_5_data_structures._1_5_1_list._1_5_1_2_list_with_others;

import java.util.*;

// • Methods of Lists

/**
 * <h1>Methods of Lists</h1>
 * <p>The List interface includes all the methods of the Collection interface. Its because Collection is a super interface of List.</p>
 * <p>Some of the commonly used methods of the Collection interface that's also available in the List interface are:</p>
 * <ul>
 *     <li><b>add()</b> - adds an element to a list</li>
 *     <li><b>addAll()</b> - adds all elements of one list to another</li>
 *     <li><b>get()</b> - helps to randomly access elements from lists</li>
 *     <li><b>iterator()</b> - returns iterator object that can be used to sequentially access elements of lists</li>
 *     <li><b>set()</b> - changes elements of lists</li>
 *     <li><b>remove()</b> - removes an element from the list</li>
 *     <li><b>removeAll()</b> - removes all the elements from the list</li>
 *     <li><b>clear()</b> - removes all the elements from the list (more efficient than removeAll())</li>
 *     <li><b>size()</b> - returns the length of lists</li>
 *     <li><b>toArray()</b> - converts a list into an array</li>
 *     <li><b>contains()</b> - returns true if a list contains specified element</li>
 * </ul>
 * <br/>
 * <h2>List ArrayList</h2>
 * <p>In the previous section, we have learned about the add(), get(), set(), and remove() method of the ArrayList class.</p>
 * <p>Besides those basic methods, here are some more ArrayList methods that are commonly used.</p>
 * <ul>
 *     <li><b>size()</b> - Returns the length of the arraylist.</li>
 *     <li><b>sort()</b> - Sort the arraylist elements.</li>
 *     <li><b>clone()</b> - Creates a new arraylist with the same element, size, and capacity.</li>
 *     <li><b>contains()</b> - Searches the arraylist for the specified element and returns a boolean result.</li>
 *     <li><b>ensureCapacity()</b> - Specifies the total element the arraylist can contain.</li>
 *     <li><b>isEmpty()</b> - Checks if the arraylist is empty.</li>
 *     <li><b>indexOf()</b> - Searches a specified element in an arraylist and returns the index of the element.</li>
 * </ul>
 * <br/>
 * <h2>List LinkedList</h2>
 * <p>The LinkedList class of the Java collections framework provides the functionality of the linked list data structure (doubly linked-list).</p>
 * <ul>
 *     <li><b>contains()</b> - checks if the LinkedList contains the element</li>
 *     <li><b>indexOf()</b> - returns the index of the first occurrence of the element</li>
 *     <li><b>lastIndexOf()</b> - returns the index of the last occurrence of the element</li>
 *     <li><b>clear()</b> - removes all the elements of the LinkedList</li>
 *     <li><b>iterator()</b> - returns an iterator to iterate over LinkedList</li>
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
 * <br/>
 * <h2>List Vector</h2>
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
 * <br/>
 * <h2>List Stack</h2>
 * <p>Since Stack extends the Vector class, it inherits all the methods Vector. To learn about different Vector methods.</p>
 */

public class ListWithOthers {
    public static void main(final String[] ARGUMENTS) {
        listArrayList();
        listLinkedList();
        listStack();
        listVector();
    }

    private static void listArrayList() {
        System.out.println("■ List ArrayList\n");
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        System.out.println(".add()             : " + number);

        List<Integer> additionalNumber = new ArrayList<>();
        additionalNumber.add(4);
        additionalNumber.add(5);
        number.addAll(additionalNumber);

        System.out.println(".addAll()          : " + number);
        System.out.println(".get()             : " + number.get(2));

        Iterator<Integer> iterate = number.iterator();
        System.out.print(".iterator()        : ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            if (iterate.hasNext()) System.out.print(", ");
            else System.out.println();
        }

        System.out.println(".remove()          : " + number.remove(2));
        System.out.println(".remove() after    : " + number);

        number.removeAll(Collections.singletonList(5));
        System.out.println(".removeAll() after : " + number);

        number.clear();
        System.out.println(".clear() after     : " + number);

        System.out.println(".size()            : " + number.size());

        number.add(1);
        number.add(2);
        number.add(3);

        System.out.println(".toArray()         : " + Arrays.toString(number.toArray()));

        System.out.println(".contains()        : " + number.contains(2));

        number.sort(Collections.reverseOrder());
        System.out.println(".sort()            : " + number);

        List<Integer> clonedListArrayList = (List<Integer>) ((ArrayList<Integer>) number).clone();
        System.out.println(".clone()           : " + clonedListArrayList);

        ((ArrayList<Integer>) number).ensureCapacity(10);
        System.out.println(".ensureCapacity()  : " + number);

        System.out.println(".isEmpty()         : " + number.isEmpty());

        List<String> stringsListArrayList = new ArrayList<>();
        stringsListArrayList.add("One");
        stringsListArrayList.add("Two");
        stringsListArrayList.add("Three");
        System.out.println(".contains()        : " + stringsListArrayList.contains("One"));

        System.out.println(".indexOf()         : " + number.indexOf(1) + "\n");
    }

    private static void listLinkedList() {
        System.out.println("■ List LinkedList\n");
        List<Integer> number = new LinkedList<>();
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

    private static void listVector() {
        System.out.println("■ List Vector\n");
        List<Integer> number = new Vector<>();
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

    private static void listStack() {
        System.out.println("■ List Stack\n");
        List<Integer> number = new Stack<>();
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

        List<String> stringsListStack = new Stack<>();
        stringsListStack.add("One");
        stringsListStack.add("Two");
        stringsListStack.add("Three");
        System.out.println(".contains()                  : " + stringsListStack.contains("One"));

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
    }
}