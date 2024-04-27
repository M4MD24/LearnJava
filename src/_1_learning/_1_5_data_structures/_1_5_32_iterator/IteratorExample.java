package _1_learning._1_5_data_structures._1_5_32_iterator;


import java.util.ArrayList;
import java.util.Iterator;

// • Methods of Iterator

/**
 * <h1>Methods of Iterator</h1>
 * <p>The Iterator interface provides 4 methods that can be used to perform various operations on elements of collections.</p>
 * <ul>
 *     <li><b>hasNext()</b> - returns true if there exists an element in the collection</li>
 *     <li><b>next()</b> - returns the next element of the collection</li>
 *     <li><b>remove()</b> - removes the last element returned by the next()</li>
 *     <li><b>forEachRemaining()</b> - performs the specified action for each remaining element of the collection</li>
 * </ul>
 */

public class IteratorExample {
    public static void main(final String[] ARGS) {
        iterator();
    }

    private static void iterator() {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("3");
        numbers.add("4");
        numbers.add("1");
        numbers.add("2");
        Iterator<String> iterator = numbers.iterator();

        String nextItem = iterator.next();
        System.out.println(".next()          : " + nextItem);

        boolean hasNextItem = iterator.hasNext();
        System.out.println(".hasNext()       : " + hasNextItem);

        iterator.remove();
        System.out.println(".remove() after  : " + numbers);

        System.out.print(".iterator() after: ");
        while (iterator.hasNext()) iterator.forEachRemaining((value) -> System.out.print(value + ", "));
    }
}