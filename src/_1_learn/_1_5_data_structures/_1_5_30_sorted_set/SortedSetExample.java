package _1_learn._1_5_data_structures._1_5_30_sorted_set;

import java.util.SortedSet;
import java.util.TreeSet;

// • Methods of SortedSet

/**
 * <h1>Methods of SortedSet</h1>
 * <p>The SortedSet interface includes all the methods of the Set interface. It's because Set is a super interface of SortedSet.</p>
 * <ul>
 *     <li><b>comparator()</b> - returns a comparator that can be used to order elements in the set</li>
 *     <li><b>first()</b> - returns the first element of the set</li>
 *     <li><b>last()</b> - returns the last element of the set</li>
 *     <li><b>headSet(element)</b> - returns all the elements of the set before the specified element</li>
 *     <li><b>tailSet(element)</b> - returns all the elements of the set after the specified element including the specified element</li>
 *     <li><b>subSet(element1, element2)</b> - returns all the elements between the element1 and element2 including element1</li>
 * </ul>
 */
public class SortedSetExample {
    public static void main(final String[] ARGUMENTS) {
        sortedSetTreeSet();
    }

    private static void sortedSetTreeSet() {
        SortedSet<String> numbers = new TreeSet<>();

        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");

        System.out.println(".add() after       : " + numbers);

        System.out.println(".comparator() after: " + numbers.comparator());

        System.out.println(".first() after     : " + numbers.first());

        System.out.println(".last() after      : " + numbers.last());

        System.out.println(".headSet() after   : " + numbers.headSet("Two"));

        System.out.println(".tailSet() after   : " + numbers.tailSet("Three"));

        System.out.println(".tailSet() after   : " + numbers.subSet("One", "Two"));
    }
}