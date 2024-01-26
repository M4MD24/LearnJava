package _1_learning._1_4_data_structure._1_4_29_tree_set;

// • Methods of TreeSet

import java.util.TreeSet;

/**
 * <h1>Methods of TreeSet</h1>
 * <p>The TreeSet class of the Java collections framework provides the functionality of a tree data structure.</p>
 * <ul>
 * <li><b>add()</b> - inserts the specified element to the set</li>
 * <li><b>addAll()</b> - inserts all the elements of the specified collection to the set</li>
 * <li><b>remove()</b> - removes the specified element from the set</li>
 * <li><b>removeAll()</b> - removes all the elements from the set</li>
 * <li><b>first()</b> - returns the first element of the set</li>
 * <li><b>last()</b> - returns the last element of the set</li>
 * <li><b>higher(element)</b> - Returns the lowest element among those elements that are greater than the specified element.</li>
 * <li><b>lower(element)</b> - Returns the greatest element among those elements that are less than the specified element.</li>
 * <li><b>ceiling(element)</b> - Returns the lowest element among those elements that are greater than the specified element. If the element passed exists in a tree set, it returns the element passed as an argument.</li>
 * <li><b>floor(element)</b> - Returns the greatest element among those elements that are less than the specified element. If the element passed exists in a tree set, it returns the element passed as an argument.</li>
 * <li><b>pollFirst()</b> - returns and removes the first element from the set</li>
 * <li><b>pollLast()</b> - returns and removes the last element from the set</li>
 * <li><b>headSet(element, booleanValue)</b>
 * <p> - The headSet() method returns all the elements of a tree set before the specified element (which is passed as an argument).</p>
 * <p> - The booleanValue parameter is optional. Its default value is false.</p>
 * <p> - If true is passed as a booleanValue, the method returns all the elements before the specified element including the specified element.</p>
 * </li>
 * <li><b>tailSet(element, booleanValue)</b>
 * <p> - The tailSet() method returns all the elements of a tree set after the specified element (which is passed as a parameter) including the specified element.</p>
 * <p> - The booleanValue parameter is optional. Its default value is true.</p>
 * <p> - If false is passed as a booleanValue, the method returns all the elements after the specified element without including the specified element.</p>
 * </li>
 * <li><b>subSet(e1, bv1, e2, bv2)</b>
 * <p> - The subSet() method returns all the elements between e1 and e2 including e1.</p>
 * <p> - The bv1 and bv2 are optional parameters. The default value of bv1 is true, and the default value of bv2 is false.</p>
 * <p> - If false is passed as bv1, the method returns all the elements between e1 and e2 without including e1.</p>
 * <p> - If true is passed as bv2, the method returns all the elements between e1 and e2, including e1.</p>
 * </li>
 * <li><b>Intersection of Sets</b> - To perform the intersection between two sets, we use the retainAll() method.</li>
 * <li><b>Difference of Sets</b> - To calculate the difference between the two sets, we can use the removeAll() method.</li>
 * <li><b>Subset of a Set</b> - To check if a set is a subset of another set or not, we use the containsAll() method.</li>
 * <li><b>clone()</b> - Creates a copy of the TreeSet</li>
 * <li><b>contains()</b> - Searches the TreeSet for the specified element and returns a boolean result</li>
 * <li><b>isEmpty()</b> - Checks if the TreeSet is empty</li>
 * <li><b>size()</b> - Returns the size of the TreeSet</li>
 * <li><b>clear()</b> - Removes all the elements from the TreeSet</li>
 * </ul>
 */

public class TreeSetExample {
    public static void main(String[] args) {
        treeSet();
    }

    private static void treeSet() {
        TreeSet<String> letters = new TreeSet<>();

        letters.add("B");
        letters.add("A");
        letters.add("D");
        letters.add("C");
        System.out.println(".add() after       : " + letters);

        TreeSet<String> additionalLetters = new TreeSet<>();
        additionalLetters.add("F");
        additionalLetters.add("G");
        additionalLetters.add("E");

        letters.addAll(additionalLetters);
        System.out.println(".addAll() after    : " + letters);

        letters.remove("F");
        System.out.println(".remove() after    : " + letters);

        letters.removeAll(additionalLetters);
        System.out.println(".removeAll() after : " + letters);

        System.out.println(".first()           : " + letters.first());

        System.out.println(".last()            : " + letters.last());

        System.out.println(".higher()          : " + letters.higher("B"));

        System.out.println(".lower()           : " + letters.lower("B"));

        System.out.println(".celling()         : " + letters.ceiling("B"));

        System.out.println(".floor()           : " + letters.floor("B"));

        System.out.println(".pollFirst()       : " + letters.pollFirst());
        System.out.println(".pollFirst() after : " + letters);

        System.out.println(".pollLast()        : " + letters.pollLast());
        System.out.println(".pollLast() after  : " + letters);

        letters.addAll(additionalLetters);

        System.out.println(".headSet()         : " + letters.headSet("E", true));

        System.out.println(".tailSet()         : " + letters.tailSet("E", true));

        System.out.println(".subSet()          : " + letters.subSet("B", true, "F", true));

        System.out.println(".retainAll()       : " + letters.retainAll(additionalLetters));
        System.out.println(".retainAll() after : " + letters);

        System.out.println(".contains()        : " + letters.contains("F"));

        System.out.println(".containsAll()     : " + letters.containsAll(additionalLetters));

        letters = additionalLetters; // clone

        System.out.println(".clone() after     : " + letters);

        letters.clear();
        System.out.println(".clear() after     : " + letters);

        System.out.println(".size() after      : " + letters.size());

        System.out.println(".isEmpty() after   : " + letters.isEmpty());

    }
}