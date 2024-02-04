package _1_learning._1_4_data_structures._1_4_23_concurrent_map;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

// • Methods of ConcurrentMap

/**
 * <h1>Methods of ConcurrentMap</h1>
 * <p>The ConcurrentMap interface includes all the methods of the Map interface. It is because Map is the super interface of the ConcurrentMap interface.</p>
 * <ul>
 *     <li><b>putIfAbsent()</b> - Inserts the specified key/value to the map if the specified key is not already associated with any value.</li>
 *     <li><b>compute()</b> - Computes an entry (key/value mapping) for the specified key and its previously mapped value.</li>
 *     <li><b>computeIfAbsent()</b> - Computes a value using the specified function for the specified key if the key is not already mapped with any value.</li>
 *     <li><b>computeIfPresent()</b> - Computes a new entry (key/value mapping) for the specified key if the key is already mapped with the specified value.</li>
 *     <li><b>forEach()</b> - Access all entries of a map and perform the specified actions.</li>
 *     <li><b>merge()</b> - Merges the new specified value with the old value of the specified key if the key is already mapped to a certain value. If the key is not already mapped, the method simply associates the specified value to our key.</li>
 * </ul>
 */
public class ConcurrentMapExample {
    public static void main(String[] args) {
        concurrentMap();
    }

    private static void concurrentMap() {
        ConcurrentMap<String, String> countries = new ConcurrentHashMap<>();
        countries.put("EG", "Egypt");
        countries.put("PS", "Palestine");
        countries.put("SA", "Saudi Arabia");

        System.out.println(".put() after            : " + countries);

        System.out.println(".putIfAbsent() after    : " + countries.putIfAbsent("EG", "Egypt"));

        System.out.println(".compute() after        : " + countries.compute("EG", (key, value) -> value.toUpperCase()));

        System.out.println(".computeIfAbsent()      : " + countries.computeIfAbsent("IL", key -> "Unknown"));
        System.out.println(".computeIfAbsent() after: " + countries);

        System.out.println(".computeIfPresent()     : " + countries.computeIfPresent("EG", (key, value) -> value.toLowerCase()));

        System.out.print(".forEach()              : ");
        AtomicInteger counter = new AtomicInteger(0);
        countries.forEach((key, value) -> {
            System.out.print(key + "=" + value);
            if (counter.getAndIncrement() < countries.size() - 1) System.out.print(", ");
            else System.out.println();
        });

        System.out.println(".merge()                : " + countries.merge("AF", "Afghanistan", (key, value) -> value));
        System.out.println(".merge()                : " + countries);
    }
}