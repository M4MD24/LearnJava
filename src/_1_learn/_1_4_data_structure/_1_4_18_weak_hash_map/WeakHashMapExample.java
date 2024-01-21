package _1_learn._1_4_data_structure._1_4_18_weak_hash_map;

import java.util.WeakHashMap;

// • Methods of WeakHashMap
/**
 * <h1>Methods of WeakHashMap</h1>
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
public class WeakHashMapExample {
    public static void main(String[] args) {
        weakHashMap();
    }

    private static void weakHashMap() {
        System.out.println("■ Map WeakHashMap:\n");

        WeakHashMap<String, String> countries = new WeakHashMap<>();
        countries.put("EG", "Egypt");
        countries.put("KW", "Kuwait");
        countries.put("JP", "Japan");
        System.out.println(".put() after             : " + countries);

        WeakHashMap<String, String> additionalCountries = new WeakHashMap<>();
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

        System.out.println(".computeIfPresent()      : " + countries.merge("EG", "EGYPT", (key, value) -> "Egypt"));
        System.out.println(".computeIfPresent() after: " + countries);

        System.out.println(".containsKey() after     : " + countries.containsKey("EG"));

        System.out.println(".containsValue() after   : " + countries.containsValue("Egypt"));

        System.out.println(".size()                  : " + countries.size());

        System.out.println(".isEmpty()               : " + countries.isEmpty() + "\n");
    }
}