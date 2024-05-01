package _1_learning._1_5_data_structures._1_5_2_array_list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * <h1>ArrayList</h1>
 * <p>In the previous section, we have learned about the add(), get(), set(), and remove() method of the ArrayList class.</p>
 * <p>Besides those basic methods, here are some more ArrayList methods that are commonly used.</p>
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
 *     <hr/>
 *     <li><b>size()</b> - Returns the length of the arraylist.</li>
 *     <li><b>sort()</b> - Sort the arraylist elements.</li>
 *     <li><b>clone()</b> - Creates a new arraylist with the same element, size, and capacity.</li>
 *     <li><b>contains()</b> - Searches the arraylist for the specified element and returns a boolean result.</li>
 *     <li><b>ensureCapacity()</b> - Specifies the total element the arraylist can contain.</li>
 *     <li><b>isEmpty()</b> - Checks if the arraylist is empty.</li>
 *     <li><b>indexOf()</b> - Searches a specified element in an arraylist and returns the index of the element.</li>
 * </ul>
 */
public class ArrayListExample {
    public static void main(final String[] ARGS) {
        arrayList();
    }

    private static void arrayList() {
        ArrayList<String> number = new ArrayList<>();
        number.add("1");
        number.add("2");
        number.add("3");

        System.out.println(".add() after   : " + number);

        System.out.println(".get()         : " + number.get(1));

        System.out.println(".getFirst()    : " + number.getFirst());

        System.out.println(".getLast()     : " + number.getLast());

        System.out.println(".remove()      : " + number.remove(1));

        System.out.println(".removeFirst() : " + number.removeFirst());

        System.out.println(".removeLast()  : " + number.removeLast());

        System.out.println(".isEmpty()     : " + number.isEmpty());

        number.add("1");
        number.add("2");
        number.add("3");

        System.out.println(".contains()    : " + number.contains("1"));

        number.clear();

        System.out.println(".clear() after : " + number);

        ArrayList<String> additionalNumber = new ArrayList<>();
        additionalNumber.add("4");
        additionalNumber.add("5");
        additionalNumber.add("6");

        number.addAll(additionalNumber);
        System.out.println(".addAll() after: " + number);

        Iterator<String> iterate = number.iterator();
        System.out.print(".iterator()    : ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            if (iterate.hasNext()) System.out.print(", ");
            else System.out.println();
        }
    }
}