package _1_learn._1_5_data_structures._1_5_20_sorted_map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

// • Methods of SortedMap

/**
 * <h1>Methods of SortedMap</h1>
 * <p>The SortedMap interface includes all the methods of the Map interface. It is because Map is a super interface of SortedMap.</p>
 * <ul>
 * <li><b>comparator()</b> - returns a comparator that can be used to order keys in a map</li>
 * <li><b>firstKey()</b> - returns the first key of the sorted map</li>
 * <li><b>lastKey()</b> - returns the last key of the sorted map</li>
 * <li><b>headMap(key)</b> - returns all the entries of a map whose keys are less than the specified key</li>
 * <li><b>tailMap(key)</b> - returns all the entries of a map whose keys are greater than or equal to the specified key</li>
 * <li><b>subMap(key1, key2)</b> - returns all the entries of a map whose keys lies in between key1 and key2 including key1</li>
 * </ul>
 */

public class SortedMapExample {
    public static void main(final String[] PARAMETERS) {
        sortedMap();
    }

    private static void sortedMap() {
        System.out.println("■ Map SortedMap:\n");

        SortedMap<String, String> countries = new TreeMap<>();
        countries.put("EG", "Egypt");
        countries.put("KW", "Kuwait");
        countries.put("JP", "Japan");
        System.out.println(".put() after             : " + countries);

        Map<String, String> additionalCountries = new TreeMap<>();
        additionalCountries.put("SA", "Saudi Arabia");
        additionalCountries.put("AF", "Afghanistan");
        additionalCountries.put("PS", "Palestine");

        countries.putAll(additionalCountries);
        System.out.println(".putAll() after          : " + countries);

        System.out.println(".putIfAbsent()           : " + countries.putIfAbsent("EG", "Egypt"));

        System.out.println(".get()                   : " + countries.get("EG"));

        System.out.println(".getOrDefault() after    : " + countries.getOrDefault("IL", "Unknown"));

        System.out.println(".containsKey()           : " + countries.containsKey("EG"));

        System.out.println(".containsValue()         : " + countries.containsValue("Egypt"));

        System.out.println(".replace()               : " + countries.replace("EG", "Egypt", "EGYPT"));

        System.out.println(".remove()                : " + countries.remove("EG", "EGYPT"));
        System.out.println(".remove() after          : " + countries);

        System.out.println(".keySet()                : " + countries.keySet());

        System.out.println(".values()                : " + countries.values());

        System.out.println(".entrySet()              : " + countries.entrySet());

        countries.clear();
        System.out.println(".clear() after           : " + countries);

        countries.put("EG", "Egypt");
        countries.put("KW", "Kuwait");
        countries.put("JP", "Japan");

        countries.compute("EG", (key, currentValue) -> {
            if (currentValue != null && currentValue.equals("Egypt")) return "EGYPT";
            return currentValue;
        });
        System.out.println(".compute() after         : " + countries);

        System.out.println(".computeIfAbsent()       : " + countries.computeIfAbsent("IL", key -> "Unknown"));

        countries.computeIfPresent("KW", (key, value) -> "(" + value + ")");
        System.out.println(".computeIfPresent() after: " + countries);

        System.out.println(".merge()                : " + countries.merge("AF", "Afghanistan", (key, value) -> value));
        System.out.println(".merge()                : " + countries);

        System.out.println(".containsKey() after     : " + countries.containsKey("EG"));

        System.out.println(".containsValue() after   : " + countries.containsValue("Egypt"));

        System.out.println(".size()                  : " + countries.size());

        System.out.println(".isEmpty()               : " + countries.isEmpty());

        System.out.println(".comparator()            : " + countries.comparator());

        System.out.println(".firstKey()              : " + countries.firstKey());

        System.out.println(".lastKey()               : " + countries.lastKey());

        System.out.println(".headMap()               : " + countries.headMap("SA"));

        System.out.println(".tailMap()               : " + countries.tailMap("JP"));

        System.out.println(".subMap()                : " + countries.subMap("EG", "Saudi Arabia"));
    }
}