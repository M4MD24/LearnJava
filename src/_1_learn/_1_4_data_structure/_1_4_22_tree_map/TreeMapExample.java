package _1_learn._1_4_data_structure._1_4_22_tree_map;

import java.util.TreeMap;

// • Methods of TreeMap

/**
 * <h1>Methods of TreeMap</h1>
 * <p>The TreeMap class provides various methods that allow us to perform operations on the map.</p>
 * <ul>
 *     <li><b>put()</b> - inserts the specified key/value mapping (entry) to the map</li>
 *     <li><b>putAll()</b> - inserts all the entries from specified map to this map</li>
 *     <li><b>putIfAbsent()</b> - inserts the specified key/value mapping to the map if the specified key is not present in the map</li>
 *     <li><b>entrySet()</b> - returns a set of all the key/values mapping (entry) of a treemap</li>
 *     <li><b>keySet()</b> - returns a set of all the keys of a tree map</li>
 *     <li><b>values()</b> - returns a set of all the maps of a tree map</li>
 *     <li><b>get()</b> - Returns the value associated with the specified key. Returns null if the key is not found.</li>
 *     <li><b>getOrDefault()</b> - Returns the value associated with the specified key. Returns the specified default value if the key is not found.</li>
 *     <li><b>remove(key)</b> - returns and removes the entry associated with the specified key from a TreeMap</li>
 *     <li><b>remove(key, value)</b> - removes the entry from the map only if the specified key is associated with the specified value and returns a boolean value</li>
 *     <li><b>replace(key, value)</b> - replaces the value mapped by the specified key with the new value</li>
 *     <li><b>replace(key, old, new)</b> - replaces the old value with the new value only if the old value is already associated with the specified key</li>
 *     <li><b>replaceAll(function)</b> - replaces each value of the map with the result of the specified function</li>
 *     <li><b>firstKey()</b> - returns the first key of the map</li>
 *     <li><b>firstEntry()</b> - returns the key/value mapping of the first key of the map</li>
 *     <li><b>lastKey()</b> - returns the last key of the map</li>
 *     <li><b>lastEntry()</b> - returns the key/value mapping of the last key of the map</li>
 *     <li><b>higherKey()</b> - Returns the lowest key among those keys that are greater than the specified key.</li>
 *     <li><b>higherEntry()</b> - Returns an entry associated with a key that is lowest among all those keys greater than the specified key.</li>
 *     <li><b>lowerKey()</b> - Returns the greatest key among all those keys that are less than the specified key.</li>
 *     <li><b>lowerEntry()</b> - Returns an entry associated with a key that is greatest among all those keys that are less than the specified key.</li>
 *     <li><b>ceilingKey()</b> - Returns the lowest key among those keys that are greater than the specified key. If the key passed as an argument is present in the map, it returns that key.</li>
 *     <li><b>ceilingEntry()</b> - Returns an entry associated with a key that is lowest among those keys that are greater than the specified key. It an entry associated with the key passed an argument is present in the map, it returns the entry associated with that key.</li>
 *     <li><b>floorKey()</b> - Returns the greatest key among those keys that are less than the specified key. If the key passed as an argument is present, it returns that key.</li>
 *     <li><b>floorEntry()</b> - Returns an entry associated with a key that is greatest among those keys that are less than the specified key. If the key passed as argument is present, it returns that key.</li>
 *     <li><b>pollFirstEntry()</b> - returns and removes the entry associated with the first key of the map</li>
 *     <li><b>pollLastEntry()</b> - returns and removes the entry associated with the last key of the map</li>
 *     <li><b>headMap(key, booleanValue)</b>
 *         <br/>
 *         <p>The headMap() method returns all the key/value pairs of a treemap before the specified key (which is passed as an argument).</p>
 *         <p>The booleanValue parameter is optional. Its default value is false.</p>
 *         <p>If true is passed as a booleanValue, the method also includes the key/value pair of the key which is passed as an argument.</p>
 *     </li>
 *     <li><b>tailMap(key, booleanValue)</b>
 *         <br/>
 *         <p>The tailMap() method returns all the key/value pairs of a treemap starting from the specified key (which is passed as an argument).</p>
 *         <p>The booleanValue is an optional parameter. Its default value is true.</p>
 *         <p>If false is passed as a booleanValue, the method doesn't include the key/value pair of the specified key.</p>
 *     </li>
 *     <li><b>subMap(k1, bV1, k2, bV2)</b>
 *         <br/>
 *         <p>The subMap() method returns all the entries associated with keys between k1 and k2 including the entry of k1.</p>
 *         <p>The bV1 and bV2 are optional boolean parameters. The default value of bV1 is true and the default value of bV2 is false.</p>
 *         <p>If false is passed as bV1, the method returns all the entries associated with keys between k1 and k2 without including the entry of k1.</p>
 *         <p>If true is passed as bV2, the method returns all the entries associated with keys between k1 and k2 including the entry of k2.</p>
 *     </li>
 *     <li><b>clone()</b> - Creates a copy of the TreeMap</li>
 *     <li><b>containsKey()</b> - Searches the TreeMap for the specified key and returns a boolean result</li>
 *     <li><b>containsValue()</b> - Searches the TreeMap for the specified value and returns a boolean result</li>
 *     <li><b>size()</b> - Returns the size of the TreeMap</li>
 *     <li><b>clear()</b> - Removes all the entries from the TreeMap</li>
 * </ul>
 */
public class TreeMapExample {
    public static void main(String[] args) {
        treeMap();
    }

    private static void treeMap() {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("EG", "Egypt");
        countries.put("KW", "Kuwait");
        countries.put("JP", "Japan");
        System.out.println(".put() after             : " + countries);

        TreeMap<String, String> additionalCountries = new TreeMap<>();
        additionalCountries.put("SA", "Saudi Arabia");
        additionalCountries.put("AF", "Afghanistan");
        additionalCountries.put("PS", "Palestine");

        countries.putAll(additionalCountries);
        System.out.println(".putAll() after          : " + countries);

        System.out.println(".putIfAbsent()           : " + countries.putIfAbsent("EG", "Egypt"));

        System.out.println(".entrySet()              : " + countries.entrySet());

        System.out.println(".keySet()                : " + countries.keySet());

        System.out.println(".get()                   : " + countries.get("AF"));

        System.out.println(".getOrDefault()          : " + countries.getOrDefault("IL", "Unknown"));

        System.out.println(".remove()                : " + countries.remove("JP", "Japan"));
        System.out.println(".remove() after          : " + countries);

        System.out.println(".replace()               : " + countries.replace("EG", "Egypt", "EGYPT"));

        countries.replaceAll((key, value) -> value.toLowerCase());
        System.out.println(".replaceAll()            : " + countries);

        System.out.println(".firstKey()              : " + countries.firstKey());

        System.out.println(".firstEntry()            : " + countries.firstEntry());

        System.out.println(".lastKey()               : " + countries.lastKey());

        System.out.println(".lastEntry()             : " + countries.lastEntry());

        System.out.println(".higherKey()             : " + countries.higherKey("EG"));

        System.out.println(".higherEntry()           : " + countries.higherEntry("EG"));

        System.out.println(".lowerKey()              : " + countries.lowerKey("EG"));

        System.out.println(".lowerEntry()            : " + countries.lowerEntry("EG"));

        System.out.println(".ceilingKey()            : " + countries.ceilingKey("EG"));

        System.out.println(".ceilingEntry()          : " + countries.ceilingEntry("EG"));

        System.out.println(".floorKey()              : " + countries.floorKey("EG"));

        System.out.println(".floorEntry()            : " + countries.floorEntry("EG"));

        System.out.println(".pollFirstEntry()        : " + countries.pollFirstEntry());

        System.out.println(".pollLastEntry()         : " + countries.pollLastEntry());

        System.out.println(".headMap()               : " + countries.headMap("PS", true));

        System.out.println(".subMap()                : " + countries.subMap("EG", true, "PS", true));

        countries = (TreeMap<String, String>) additionalCountries.clone();
        System.out.println(".clone() after           : " + countries);

        System.out.println(".containsKey()           : " + countries.containsKey("PS"));

        System.out.println(".containsValue()         : " + countries.containsValue("Palestine"));

        System.out.println(".size()                  : " + countries.size());

        countries.clear();
        System.out.println(".clear() after           : " + countries);
    }
}