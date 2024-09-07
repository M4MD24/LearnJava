package _1_learning._1_5_data_structures._1_5_25_set;

import java.util.*;

// • Methods of Set

/**
 * <h1>Methods of Set</h1>
 * <p>The Set interface includes all the methods of the Collection interface. It's because Collection is a super interface of Set.</p>
 * <ul>
 *     <li><b>add()</b> - adds the specified element to the set</li>
 *     <li><b>addAll()</b> - adds all the elements of the specified collection to the set</li>
 *     <li><b>iterator()</b> - returns an iterator that can be used to access elements of the set sequentially</li>
 *     <li><b>remove()</b> - removes the specified element from the set</li>
 *     <li><b>removeAll()</b> - removes all the elements from the set that is present in another specified set</li>
 *     <li><b>retainAll()</b> - retains all the elements in the set that are also present in another specified set</li>
 *     <li><b>clear()</b> - removes all the elements from the set</li>
 *     <li><b>size()</b> - returns the length (number of elements) of the set</li>
 *     <li><b>toArray()</b> - returns an array containing all the elements of the set</li>
 *     <li><b>contains()</b> - returns true if the set contains the specified element</li>
 *     <li><b>containsAll()</b> - returns true if the set contains all the elements of the specified collection</li>
 *     <li><b>hashCode()</b> - returns a hash code value (address of the element in the set)</li>
 * </ul>
 */

public class SetExample {
    public static void main(final String[] PARAMETERS) {
        setHashSet();
        setLinkedHashSet();
        setTreeSet();
    }

    private static void setHashSet() {
        Set<String> numbers = new HashSet<>();

        numbers.add("1");
        numbers.add("3");
        numbers.add("2");

        /* All Set is arranged alphabetically automatically ! */
        System.out.println(".add() after      : " + numbers);

        Set<String> additionalNumbers = new HashSet<>();
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

        System.out.println(".retainAll()      : " + numbers.retainAll(additionalNumbers));
        System.out.println(".retainAll() after: " + numbers);

        System.out.println(".removeAll()      : " + numbers.removeAll(additionalNumbers));
        System.out.println(".removeAll() after: " + numbers);

        System.out.println(".size()           : " + numbers.size());

        numbers.addAll(additionalNumbers);

        numbers.clear();
        System.out.println(".clear()          : " + numbers);

        numbers.addAll(additionalNumbers);

        System.out.println(".toArray()        : " + Arrays.toString(numbers.toArray()));

        System.out.println(".contains()       : " + numbers.contains("5"));

        System.out.println(".containsAll()    : " + numbers.containsAll(additionalNumbers));

        System.out.println(".hashCode()       : " + numbers.hashCode());
    }

    private static void setLinkedHashSet() {
        Set<String> numbers = new LinkedHashSet<>();

        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        System.out.println(".add() after      : " + numbers);

        Set<String> additionalNumbers = new LinkedHashSet<>();
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

        System.out.println(".retainAll()      : " + numbers.retainAll(additionalNumbers));
        System.out.println(".retainAll() after: " + numbers);

        System.out.println(".removeAll()      : " + numbers.removeAll(additionalNumbers));
        System.out.println(".removeAll() after: " + numbers);

        System.out.println(".size()           : " + numbers.size());

        numbers.addAll(additionalNumbers);

        numbers.clear();
        System.out.println(".clear()          : " + numbers);

        numbers.addAll(additionalNumbers);

        System.out.println(".toArray()        : " + Arrays.toString(numbers.toArray()));

        System.out.println(".contains()       : " + numbers.contains("5"));

        System.out.println(".containsAll()    : " + numbers.containsAll(additionalNumbers));

        System.out.println(".hashCode()       : " + numbers.hashCode());
    }

    private static void setTreeSet() {
        Set<String> numbers = new TreeSet<>();

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

        System.out.println(".retainAll()      : " + numbers.retainAll(additionalNumbers));
        System.out.println(".retainAll() after: " + numbers);

        System.out.println(".removeAll()      : " + numbers.removeAll(additionalNumbers));
        System.out.println(".removeAll() after: " + numbers);

        System.out.println(".size()           : " + numbers.size());

        numbers.addAll(additionalNumbers);

        numbers.clear();
        System.out.println(".clear()          : " + numbers);

        numbers.addAll(additionalNumbers);

        System.out.println(".toArray()        : " + Arrays.toString(numbers.toArray()));

        System.out.println(".contains()       : " + numbers.contains("5"));

        System.out.println(".containsAll()    : " + numbers.containsAll(additionalNumbers));

        System.out.println(".hashCode()       : " + numbers.hashCode());
    }
}