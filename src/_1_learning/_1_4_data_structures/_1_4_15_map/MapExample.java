package _1_learning._1_4_data_structures._1_4_15_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

// • Methods of Map

/**
 * <h1>Methods of Map</h1>
 * <p>The Map interface includes all the methods of the Collection interface. It is because Collection is a super interface of Map.</p>
 * <li><b>put(Key, Value)</b> - Inserts the association of a key K and a value V into the map. If the key is already present, the new value replaces the old value.</li>
 * <li><b>putAll()</b> - Inserts all the entries from the specified map to this map.</li>
 * <li><b>putIfAbsent(Key, Value)</b> - Inserts the association if the key K is not already associated with the value V.</li>
 * <li><b>get(Key)</b> - Returns the value associated with the specified key K. If the key is not found, it returns null.</li>
 * <li><b>getOrDefault(Key, defaultValue)</b> - Returns the value associated with the specified key K. If the key is not found, it returns the defaultValue.</li>
 * <li><b>containsKey(Key)</b> - Checks if the specified key K is present in the map or not.</li>
 * <li><b>containsValue(Value)</b> - Checks if the specified value V is present in the map or not.</li>
 * <li><b>replace(Key, Value)</b> - Replace the value of the key K with the new specified value V.</li>
 * <li><b>replace(Key, oldValue, newValue)</b> - Replaces the value of the key K with the new value newValue only if the key K is associated with the value oldValue.</li>
 * <li><b>remove(Key)</b> - Removes the entry from the map represented by the key K.</li>
 * <li><b>remove(Key, Value)</b> - Removes the entry from the map that has key K associated with value V.</li>
 * <li><b>keySet()</b> - Returns a set of all the keys present in a map.</li>
 * <li><b>values()</b> - Returns a set of all the values present in a map.</li>
 * <li><b>entrySet()</b> - Returns a set of all the key/value mapping present in a map.</li>
 * <br/>
 * <h2>Methods of HashMap</h2>
 * <li><b>clear()</b> - removes all mappings from the HashMap.</li>
 * <li><b>compute()</b> - computes a new value for the specified key.</li>
 * <li><b>computeIfAbsent()</b> - computes value if a mapping for the key is not present.</li>
 * <li><b>computeIfPresent()</b> - computes a value for mapping if the key is present.</li>
 * <li><b>merge()</b> - merges the specified mapping to the HashMap.</li>
 * <li><b>clone()</b> - makes the copy of the HashMap.</li>
 * <li><b>containsKey()</b> - checks if the specified key is present in Hashmap.</li>
 * <li><b>containsValue()</b> - checks if Hashmap contains the specified value.</li>
 * <li><b>size()</b> - returns the number of items in HashMap.</li>
 * <li><b>isEmpty()</b> - checks if the Hashmap is empty.</li>
 * <br/>
 * <h2>Methods of LinkedHashMap</h2>
 * <li><b>clear()</b> - removes all mappings from the HashMap.</li>
 * <li><b>compute()</b> - computes a new value for the specified key.</li>
 * <li><b>computeIfAbsent()</b> - computes value if a mapping for the key is not present.</li>
 * <li><b>computeIfPresent()</b> - computes a value for mapping if the key is present.</li>
 * <li><b>merge()</b> - merges the specified mapping to the HashMap.</li>
 * <li><b>clone()</b> - makes the copy of the HashMap.</li>
 * <li><b>containsKey()</b> - checks if the specified key is present in Hashmap.</li>
 * <li><b>containsValue()</b> - checks if Hashmap contains the specified value.</li>
 * <li><b>size()</b> - returns the number of items in HashMap.</li>
 * <li><b>isEmpty()</b> - checks if the Hashmap is empty.</li>
 * <br/>
 * <h2>Methods of WeakHashMap</h2>
 * <li><b>clear()</b> - removes all mappings from the HashMap.</li>
 * <li><b>compute()</b> - computes a new value for the specified key.</li>
 * <li><b>computeIfAbsent()</b> - computes value if a mapping for the key is not present.</li>
 * <li><b>computeIfPresent()</b> - computes a value for mapping if the key is present.</li>
 * <li><b>merge()</b> - merges the specified mapping to the HashMap.</li>
 * <li><b>clone()</b> - makes the copy of the HashMap.</li>
 * <li><b>containsKey()</b> - checks if the specified key is present in Hashmap.</li>
 * <li><b>containsValue()</b> - checks if Hashmap contains the specified value.</li>
 * <li><b>size()</b> - returns the number of items in HashMap.</li>
 * <li><b>isEmpty()</b> - checks if the Hashmap is empty.</li>
 */
public class MapExample {
    public static void main(String[] args) {
        mapHashMap();
        mapLinkedHashMap();
        mapWealHashMap();
    }

    private static void mapHashMap() {
        System.out.println("■ Map HashMap:\n");

        Map<String, String> countries = new HashMap<>();
        countries.put("EG", "Egypt");
        countries.put("KW", "Kuwait");
        countries.put("JP", "Japan");

        /* All Map is arranged alphabetically automatically ! */
        System.out.println(".put() after             : " + countries);

        Map<String, String> additionalCountries = new HashMap<>();
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

        System.out.println(".computeIfAbsent() after : " + countries.computeIfAbsent("SA", (key) -> "SAUDI ARABIA"));

        countries.computeIfPresent("KW", (key, value) -> "{" + value + "}");
        System.out.println(".computeIfPresent() after: " + countries);

        System.out.println(".merge()                : " + countries.merge("AF", "Afghanistan", (key, value) -> value));
        System.out.println(".merge()                : " + countries);

        System.out.println(".containsKey() after     : " + countries.containsKey("EG"));

        System.out.println(".containsValue() after   : " + countries.containsValue("Egypt"));

        System.out.println(".size()                  : " + countries.size());

        System.out.println(".isEmpty()               : " + countries.isEmpty() + "\n");
    }

    private static void mapLinkedHashMap() {
        System.out.println("■ Map LinkedHashMap:\n");

        Map<String, String> countries = new LinkedHashMap<>();
        countries.put("EG", "Egypt");
        countries.put("KW", "Kuwait");
        countries.put("JP", "Japan");
        System.out.println(".put() after             : " + countries);

        Map<String, String> additionalCountries = new LinkedHashMap<>();
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

        countries.putIfAbsent("SA", "Saudi Arabia");
        System.out.println(".computeIfAbsent() after : " + countries);

        countries.computeIfPresent("KW", (key, value) -> "{" + value + "}");
        System.out.println(".computeIfPresent() after: " + countries);

        System.out.println(".merge()                : " + countries.merge("AF", "Afghanistan", (key, value) -> value));
        System.out.println(".merge()                : " + countries);

        System.out.println(".containsKey() after     : " + countries.containsKey("EG"));

        System.out.println(".containsValue() after   : " + countries.containsValue("Egypt"));

        System.out.println(".size()                  : " + countries.size());

        System.out.println(".isEmpty()               : " + countries.isEmpty() + "\n");
    }

    private static void mapWealHashMap() {
        System.out.println("■ Map WeakHashMap:\n");

        Map<String, String> countries = new WeakHashMap<>();
        countries.put("EG", "Egypt");
        countries.put("KW", "Kuwait");
        countries.put("JP", "Japan");
        System.out.println(".put() after             : " + countries);

        Map<String, String> additionalCountries = new WeakHashMap<>();
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

        countries.putIfAbsent("SA", "Saudi Arabia");
        System.out.println(".computeIfAbsent() after : " + countries);

        countries.computeIfPresent("KW", (key, value) -> "{" + value + "}");
        System.out.println(".computeIfPresent() after: " + countries);

        System.out.println(".merge()                : " + countries.merge("AF", "Afghanistan", (key, value) -> value));
        System.out.println(".merge()                : " + countries);

        System.out.println(".containsKey() after     : " + countries.containsKey("EG"));

        System.out.println(".containsValue() after   : " + countries.containsValue("Egypt"));

        System.out.println(".size()                  : " + countries.size());

        System.out.println(".isEmpty()               : " + countries.isEmpty() + "\n");
    }
}