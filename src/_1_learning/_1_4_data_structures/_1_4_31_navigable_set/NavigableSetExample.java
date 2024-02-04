package _1_learning._1_4_data_structures._1_4_31_navigable_set;

import java.util.NavigableSet;
import java.util.TreeSet;

// • Methods of NavigableSet

/**
 * <h1>Methods of NavigableSet</h1>
 * <p>The NavigableSet interface of the Java Collections framework provides the features to navigate among the set elements.</p>
 * <p>The NavigableSet provides various methods that can be used to navigate over its elements.</p>
 * <ul>
 *     <li><b>headSet(element, booleanValue)</b>
 *         <p> - The headSet() method returns all the elements of a navigable set before the specified element (which is passed as an argument).</p>
 *         <p> - The booleanValue parameter is optional. Its default value is false.</p>
 *         <p> - If true is passed as a booleanValue, the method returns all the elements before the specified element including the specified element.</p>
 *     </li>
 *     <li><b>tailSet(element, booleanValue)</b>
 *         <p> - The tailSet() method returns all the elements of a navigable set after the specified element (which is passed as an argument) including the specified element.</p>
 *         <p> - The booleanValue parameter is optional. Its default value is true.</p>
 *         <p> - If false is passed as a booleanValue, the method returns all the elements after the specified element without including the specified element.</p>
 *     </li>
 *     <li><b>subSet(e1, bv1, e2, bv2)</b>
 *         <p> - The subSet() method returns all the elements between e1 and e2 including e1.</p>
 *         <p> - The bv1 and bv2 are optional parameters. The default value of bv1 is true, and the default value of bv2 is false.</p>
 *         <p> - If false is passed as bv1, the method returns all the elements between e1 and e2 without including e1.</p>
 *         <p> - If true is passed as bv2, the method returns all the elements between e1 and e2, including e1.</p>
 *     </li>
 *     <li><b>descendingSet()</b> - reverses the order of elements in a set</li>
 *     <li><b>descendingIterator()</b> - returns an iterator that can be used to iterate over a set in reverse order</li>
 *     <li><b>ceiling()</b> - returns the lowest element among those elements that are greater than or equal to the specified element</li>
 *     <li><b>floor()</b> - returns the greatest element among those elements that are less than or equal to the specified element</li>
 *     <li><b>higher()</b> - returns the lowest element among those elements that are greater than the specified element</li>
 *     <li><b>lower()</b> - returns the greatest element among those elements that are less than the specified element</li>
 *     <li><b>pollFirst()</b> - returns and removes the first element from the set</li>
 *     <li><b>pollLast()</b> - returns and removes the last element from the set</li>
 * </ul>
 */

public class NavigableSetExample {
    public static void main(String[] args) {
        navigableSetTreeSet();
    }

    private static void navigableSetTreeSet() {
        NavigableSet<String> numbers = new TreeSet<>();

        numbers.add("3");
        numbers.add("1");
        numbers.add("2");
        numbers.add("5");
        numbers.add("4");
        System.out.println(".add() after         : " + numbers);

        System.out.println(".headSet()           : " + numbers.headSet("3", true));

        System.out.println(".tailSet()           : " + numbers.tailSet("3", true));

        System.out.println(".subSet()            : " + numbers.subSet("2", true, "4", true));

        System.out.println(".descendingSet()     : " + numbers.descendingSet());

        System.out.println(".descendingIterator(): " + numbers.descendingIterator().next());

        System.out.println(".ceiling()           : " + numbers.ceiling("2"));

        System.out.println(".floor()             : " + numbers.floor("2"));

        System.out.println(".higher()            : " + numbers.higher("2"));

        System.out.println(".lower()             : " + numbers.lower("2"));

        System.out.println(".pollFirst()         : " + numbers.pollFirst());
        System.out.println(".pollFirst() after   : " + numbers);

        System.out.println(".pollLast()          : " + numbers.pollLast());
        System.out.println(".pollLast() after    : " + numbers);
    }
}