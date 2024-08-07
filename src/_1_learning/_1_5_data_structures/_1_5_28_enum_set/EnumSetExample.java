package _1_learning._1_5_data_structures._1_5_28_enum_set;

import java.util.EnumSet;
import java.util.Iterator;

enum Numbers {
    One, Two, Three
}

enum AdditionalNumbers {
    Four, Five, Six
}

// • Methods of EnumSet

/**
 * <h1>Methods of EnumSet</h1>
 * <p>The EnumSet class of the Java collections framework provides a set implementation of elements of a single enum.</p>
 * <ul>
 *     <li><b>noneOf(Size)</b> - The noneOf() method creates an empty enum set.</li>
 *     <li><b>allOf(Size)</b> - The allOf() method creates an enum set that contains all the values of the specified enum type Size.</li>
 *     <li><b>range(e1, e2)</b> - The range() method creates an enum set containing all the values of an enum between e1 and e2 including both values.</li>
 *     <li><b>of()</b> - The of() method creates an enum set containing the specified elements.</li>
 *     <li><b>add()</b> - inserts specified enum values to the enum set</li>
 *     <li><b>addAll()</b> inserts all the elements of the specified collection to the set</li>
 *     <li><b>iterator()</b> - returns iterator object that can be used to sequentially access elements of lists</li>
 *     <li><b>remove()</b> - removes the specified element from the enum set</li>
 *     <li><b>removeAll()</b> - removes all the elements from the enum set</li>
 *     <li><b>copyOf()</b> - Creates a copy of the EnumSet</li>
 *     <li><b>contains()</b> - Searches the EnumSet for the specified element and returns a boolean result</li>
 *     <li><b>isEmpty()</b> - Checks if the EnumSet is empty</li>
 *     <li><b>size()</b> - Returns the size of the EnumSet</li>
 *     <li><b>clear()</b> - Removes all the elements from the EnumSet</li>
 * </ul>
 */
public class EnumSetExample {
    public static void main(final String[] ARGS) {
        enumSet();
    }

    private static void enumSet() {
        EnumSet<Numbers> numbers = EnumSet.noneOf(Numbers.class);
        System.out.println(".noneOf() after   : " + numbers);

        EnumSet<AdditionalNumbers> additionalNumbers = EnumSet.allOf(AdditionalNumbers.class);
        System.out.println(".AllOf() after    : " + additionalNumbers);

        numbers.add(Numbers.One);
        numbers.add(Numbers.Two);
        numbers.add(Numbers.Three);
        System.out.println(".add() after      : " + numbers);

        numbers.clear();
        System.out.println(".clear() after    : " + numbers);

        System.out.println(".size()           : " + numbers.size());

        System.out.println(".isEmpty()        : " + numbers.isEmpty());

        numbers.addAll(EnumSet.allOf(Numbers.class));
        System.out.println(".addAll() after   : " + numbers);

        System.out.println(".of()             : " + EnumSet.of(Numbers.One, Numbers.Three));

        System.out.println(".range()          : " + EnumSet.range(Numbers.One, Numbers.Three));

        Iterator<Numbers> iterate = numbers.iterator();
        System.out.print(".iterator()       : ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            if (iterate.hasNext()) System.out.print(", ");
            else System.out.println();
        }

        System.out.println(".remove()         : " + numbers.remove(Numbers.One));
        System.out.println(".remove() after   : " + numbers);

        System.out.println(".removeAll()      : " + numbers.removeAll(numbers));
        System.out.println(".removeAll() after: " + numbers);

        numbers.addAll(EnumSet.allOf(Numbers.class));

        System.out.println(".contains()       : " + numbers.contains(Numbers.One));

        EnumSet<AdditionalNumbers> additionalNumbersCopy = EnumSet.copyOf(additionalNumbers);
        System.out.println(".copyOf()         : " + additionalNumbersCopy);

    }
}