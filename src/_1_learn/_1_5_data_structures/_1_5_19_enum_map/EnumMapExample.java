package _1_learn._1_5_data_structures._1_5_19_enum_map;

import java.util.EnumMap;

// • Methods of EnumMap

/**
 * <h1>Methods of EnumMap</h1>
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

enum Countries {EG, KW, JP, SA, AF, PS}

public class EnumMapExample {
    public static void main(final String[] ARGUMENTS) {
        enumMap();
    }

    private static void enumMap() {
        EnumMap<Countries, String> countries = new EnumMap<>(Countries.class);
        countries.put(Countries.EG, "Egypt");
        countries.put(Countries.KW, "Kuwait");
        countries.put(Countries.JP, "Japan");
        System.out.println(".put() after             : " + countries);

        EnumMap<Countries, String> additionalCountries = new EnumMap<>(Countries.class);
        additionalCountries.put(Countries.SA, "Saudi Arabia");
        additionalCountries.put(Countries.AF, "Afghanistan");
        additionalCountries.put(Countries.PS, "Palestine");

        countries.putAll(additionalCountries);
        System.out.println(".putAll() after          : " + countries);

        System.out.println(".putIfAbsent()           : " + countries.putIfAbsent(Countries.EG, "Egypt"));

        System.out.println(".get()                   : " + countries.get(Countries.EG));

        System.out.println(".getOrDefault() after    : " + countries.getOrDefault("IL", "Unknown"));

        System.out.println(".containsKey()           : " + countries.containsKey(Countries.EG));

        System.out.println(".containsValue()         : " + countries.containsValue("Egypt"));

        System.out.println(".replace()               : " + countries.replace(Countries.EG, "Egypt", "EGYPT"));

        System.out.println(".remove()                : " + countries.remove(Countries.EG, "EGYPT"));
        System.out.println(".remove() after          : " + countries);

        System.out.println(".keySet()                : " + countries.keySet());

        System.out.println(".values()                : " + countries.values());

        System.out.println(".entrySet()              : " + countries.entrySet());

        countries.clear();
        System.out.println(".clear() after           : " + countries);

        countries.put(Countries.EG, "Egypt");
        countries.put(Countries.KW, "Kuwait");
        countries.put(Countries.JP, "Japan");

        countries.compute(Countries.EG, (key, currentValue) -> {
            if (currentValue != null && currentValue.equals("Egypt")) return "EGYPT";
            return currentValue;
        });
        System.out.println(".compute() after         : " + countries);

        System.out.println(".computeIfAbsent()       : " + countries.computeIfAbsent(Countries.valueOf("IL"), key -> "Unknown"));

        countries.computeIfPresent(Countries.KW, (key, value) -> "{" + value + "}");
        System.out.println(".computeIfPresent() after: " + countries);

        System.out.println(".merge()                 : " + countries.merge(Countries.EG, "EGYPT", (key, value) -> "Egypt"));
        System.out.println(".merge() after           : " + countries);

        countries = additionalCountries; // Clone
        System.out.println(".clone() after           : " + countries);

        System.out.println(".containsKey() after     : " + countries.containsKey(Countries.EG));

        System.out.println(".containsValue() after   : " + countries.containsValue("Egypt"));

        System.out.println(".size()                  : " + countries.size());

        System.out.println(".isEmpty()               : " + countries.isEmpty());
    }
}