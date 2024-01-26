package _1_learning._1_4_data_structure._1_4_33_list_iterator;

import java.util.ArrayList;
import java.util.ListIterator;

// • Methods of ListIterator

/**
 * <h1>Methods of ListIterator</h1>
 * <p>The ListIterator interface provides methods that can be used to perform various operations on the elements of a list.</p>
 * <ul>
 *     <li><b>hasNext()</b> - returns true if there exists an element in the list</li>
 *     <li><b>next()</b> - returns the next element of the list</li>
 *     <li><b>nextIndex()</b> returns the index of the element that the next() method will return</li>
 *     <li><b>previous()</b> - returns the previous element of the list</li>
 *     <li><b>previousIndex()</b> - returns the index of the element that the previous() method will return</li>
 *     <li><b>remove()</b> - removes the element returned by either next() or previous()</li>
 *     <li><b>set()</b> - replaces the element returned by either next() or previous() with the specified element</li>
 * </ul>
 */
public class ListIteratorExample {
    public static void main(String[] args) {
        listIterator();
    }

    private static void listIterator() {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("3");
        numbers.add("4");
        numbers.add("1");
        numbers.add("2");
        ListIterator<String> iterator = numbers.listIterator(0);

        boolean hasNextItem = iterator.hasNext();
        System.out.println(".hasNext()      : " + hasNextItem);

        String nextItem = iterator.next();
        System.out.println(".next()         : " + nextItem);

        System.out.println(".nextIndex()    : " + iterator.nextIndex());

        System.out.println(".previous()     : " + iterator.previous());

        System.out.println(".previousIndex(): " + iterator.previousIndex());

        iterator.remove();
        System.out.println(".remove() after : " + numbers);

        numbers.set(2, "5");
        System.out.println(".set() after    : " + numbers);
    }
}