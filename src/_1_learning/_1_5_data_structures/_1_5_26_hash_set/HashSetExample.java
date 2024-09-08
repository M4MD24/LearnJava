package _1_learning._1_5_data_structures._1_5_26_hash_set;

import java.util.*;

// • Methods of HashSet

/**
 * <h1>Methods of HashSet</h1>
 * <p>The HashSet class provides various methods that allow us to perform various operations on the set.</p>
 * <ul>
 *     <li><b>add()</b> - inserts the specified element to the set</li>
 *     <li><b>addAll()</b> - inserts all the elements of the specified collection to the set</li>
 *     <li><b>iterator()</b> - returns iterator object that can be used to sequentially access elements of lists</li>
 *     <li><b>remove()</b> - removes the specified element from the set</li>
 *     <li><b>removeAll()</b> - removes all the elements from the set</li>
 *     <li><b>clone()</b> - Creates a copy of the HashSet</li>
 *     <li><b>contains()</b> - Searches the HashSet for the specified element and returns a boolean result</li>
 *     <li><b>isEmpty()</b> - Checks if the HashSet is empty</li>
 *     <li><b>size()</b> - Returns the size of the HashSet</li>
 *     <li><b>clear()</b> - Removes all the elements from the HashSet</li>
 * </ul>
 */
public class HashSetExample {
    public static void main(final String[] PARAMETERS) {
        hashSet();
    }

    private static void hashSet() {
        HashSet<String> numbers = new HashSet<>();

        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        System.out.println(".add() after      : " + numbers);

        Set<String> additionalNumbers = new TreeSet<>();
        additionalNumbers.add("4");
        additionalNumbers.add("5");
        additionalNumbers.add("6");

        numbers.addAll(additionalNumbers);
        System.out.println(".addAll() after   : " + numbers);

        Iterator<String> iterate = numbers.iterator();
        System.out.print(".iterator()       : ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            if (iterate.hasNext()) System.out.print(", ");
            else System.out.println();
        }

        System.out.println(".remove()         : " + numbers.remove("2"));
        System.out.println(".remove() after   : " + numbers);

        System.out.println(".removeAll()      : " + numbers.removeAll(additionalNumbers));
        System.out.println(".removeAll() after: " + numbers);

        System.out.println(".size()           : " + numbers.size());

        numbers.clear();
        System.out.println(".clear()          : " + numbers);

        numbers.addAll(additionalNumbers);

        System.out.println(".toArray()        : " + Arrays.toString(numbers.toArray()));

        System.out.println(".contains()       : " + numbers.contains("5"));

        System.out.println(".containsAll()    : " + numbers.containsAll(additionalNumbers));

        System.out.println(".hashCode()       : " + numbers.hashCode());
    }
}