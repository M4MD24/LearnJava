package _1_learning._1_5_data_structures._1_5_24_concurrent_hash_map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

// • Methods of ConcurrentHashMap

/**
 * <h1>Methods of ConcurrentHashMap</h1>
 * <p>The ConcurrentHashMap class provides methods that allow us to perform various operations on the map.</p>
 * <ul>
 *     <li><b>put()</b> - inserts the specified key/value mapping to the map</li>
 *     <li><b>putAll()</b> - inserts all the entries from specified map to this map</li>
 *     <li><b>putIfAbsent()</b> - inserts the specified key/value mapping to the map if the specified key is not present in the map</li>
 *     <li><b>entrySet()</b> - returns a set of all the key/value mapping of the map</li>
 *     <li><b>keySet()</b> - returns a set of all the keys of the map</li>
 *     <li><b>values()</b> - returns a set of all the values of the map</li>
 *     <li><b>get()</b> - Returns the value associated with the specified key. Returns null if the key is not found.</li>
 *     <li><b>getOrDefault()</b> - Returns the value associated with the specified key. Returns the specified default value if the key is not found.</li>
 *     <li><b>remove(key)</b> - returns and removes the entry associated with the specified key from the map</li>
 *     <li><b>remove(key, value)</b> - removes the entry from the map only if the specified key mapped to the specified value and return a boolean value</li>
 *     <li><b>forEach()</b> - iterates over our entries and executes the specified function It includes two parameters.</li>
 *     <li><b>forEachEntry()</b> - executes the specified function for each entry</li>
 *     <li><b>forEachKey()</b> - executes the specified function for each key</li>
 *     <li><b>forEachValue()</b> - executes the specified function for each value</li>
 *     <li><b>search()</b> - searches the map based on the specified function and returns the matched entry.</li>
 *     <li><b>searchEntries()</b> - search function is applied to key/value mappings</li>
 *     <li><b>searchKeys()</b> - search function is only applied to the keys</li>
 *     <li><b>searchValues()</b> - search function is only applied to the values</li>
 *     <li><b>reduce()</b> - accumulates (gather together) each entry in a map. This can be used when we need all the entries to perform a common task, like adding all the values of a map.</li>
 *     <li><b>reduceEntries()</b> - returns the result of gathering all the entries using the specified reducer function</li>
 *     <li><b>reduceKeys()</b> - returns the result of gathering all the keys using the specified reducer function</li>
 *     <li><b>reduceValues()</b> - returns the result of gathering all the values using the specified reducer function</li>
 * </ul>
 */

public class ConcurrentHashMapExample {
    public static void main(final String[] ARGS) {
        concurrentHashMap();
    }

    private static void concurrentHashMap() {
        ConcurrentHashMap<String, String> countries = new ConcurrentHashMap<>();

        countries.put("EG", "Egypt");
        countries.put("PS", "Palestine");
        countries.put("SA", "Saudi Arabia");
        System.out.println(".put() after         : " + countries);

        ConcurrentHashMap<String, String> additionalCountries = new ConcurrentHashMap<>();
        additionalCountries.put("AF", "Afghanistan");
        additionalCountries.put("KW", "Kuwait");
        additionalCountries.put("JP", "Japan");

        countries.putAll(additionalCountries);
        System.out.println(".putAll() after      : " + countries);

        countries.putIfAbsent("IL", "Unknown");
        System.out.println(".putIfAbsent() after : " + countries);

        System.out.println(".entrySet()          : " + countries.entrySet());

        System.out.println(".keySet()            : " + countries.keySet());

        System.out.println(".values()            : " + countries.values());

        System.out.println(".get()               : " + countries.get("EG"));

        System.out.println(".getOrDefault()      : " + countries.getOrDefault("USA", "Unknown"));

        System.out.println(".remove()            : " + countries.remove("IL", "Unknown"));
        System.out.println(".remove() after      : " + countries);

        System.out.print(".forEach()           : ");
        AtomicInteger counterForeach = new AtomicInteger(0);
        countries.forEach((key, value) -> {
            System.out.print(key + "=" + value);
            if (counterForeach.getAndIncrement() < countries.size() - 1) System.out.print(", ");
            else System.out.println();
        });

        System.out.print(".forEachEntry()      : ");
        AtomicInteger counterForeachEntry2 = new AtomicInteger(0);
        countries.forEachEntry(1000, (entry) -> {
            System.out.print(entry);
            if (counterForeachEntry2.getAndIncrement() < countries.size() - 1) System.out.print(", ");
            else System.out.println();
        });

        System.out.print(".forEachKey()        : ");
        AtomicInteger counterForeachKey = new AtomicInteger(0);
        countries.forEachKey(1000, (key) -> {
            System.out.print(key);
            if (counterForeachKey.getAndIncrement() < countries.size() - 1) System.out.print(", ");
            else System.out.println();
        });

        System.out.println(".search()            : " + countries.search(1000, (key, value) -> key + "=" + value));

        System.out.println(".searchEntries()     : " + countries.searchEntries(1000, (entry) -> entry));

        System.out.println(".searchKeys()        : " + countries.searchKeys(1000, (key) -> key));

        System.out.println(".searchValues()      : " + countries.searchValues(1000, (value) -> value));

        AtomicInteger counterReduce = new AtomicInteger(0);
        System.out.println(".reduce()            : " + countries.reduce(1000, (key, value) -> key + "=" + value + counterReduce.getAndIncrement() + ", " + "\n                       ", (key, value) -> key + value));

        System.out.println(".reduceEntries()     : " + countries.reduceEntries(1000, (entry1, entry2) -> Map.entry(entry1.toString(), entry2.toString())));

        System.out.println(".reduceKeys()        : " + countries.reduceKeys(1000, (key1, key2) -> key1 + ", " + key2));

        System.out.println(".reduceValues()      : " + countries.reduceValues(1000, (value1, value2) -> value1 + ", " + value2));
    }
}