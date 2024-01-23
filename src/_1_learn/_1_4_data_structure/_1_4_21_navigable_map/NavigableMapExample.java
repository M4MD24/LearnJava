package _1_learn._1_4_data_structure._1_4_21_navigable_map;

import java.util.NavigableMap;
import java.util.TreeMap;

// • Methods of NavigableMap

/**
 * <h1>Methods of NavigableMap</h1>
 * <p>The NavigableMap interface of the Java collections framework provides the features to navigate among the map entries.</p>
 * <ul>
 *     <li>
 *         <b>headMap(key, booleanValue)</b>
 *         <br/>
 *         <br/>
 *         <p>The headMap() method returns all the entries of a navigable map associated with all those keys before the specified key (which is passed as an argument).</p>
 *         <br/>
 *         <p>The booleanValue is an optional parameter. Its default value is false.</p>
 *         <br/>
 *         <p>If true is passed as a booleanValue, the method returns all the entries associated with all those keys before the specified key, including the entry associated with the specified key.</p>
 *     </li>
 *     <br/>
 *     <li>
 *         <b>tailMap(key, booleanValue)</b>
 *         <br/>
 *         <br/>
 *         <p>The tailMap() method returns all the entries of a navigable map associated with all those keys after the specified key (which is passed as an argument) including the entry associated with the specified key.</p>
 *         <br/>
 *         <p>The booleanValue is an optional parameter. Its default value is true.</p>
 *         <br/>
 *         <p>If false is passed as a booleanValue, the method returns all the entries associated with those keys after the specified key, without including the entry associated with the specified key.</p>
 *     </li>
 *     <br/>
 *     <li>
 *         <b>subMap(k1, bv1, k2, bv2)</b>
 *         <br/>
 *         <br/>
 *         <p>The subMap() method returns all the entries associated with keys between k1 and k2 including the entry associated with k1.</p>
 *         <br/>
 *         <p>The bv1 and bv2 are optional parameters. The default value of bv1 is true and the default value of bv2 is false.</p>
 *         <br/>
 *         <p>If false is passed as bv1, the method returns all the entries associated with keys between k1 and k2, without including the entry associated with k1.</p>
 *         <br/>
 *         <p>If true is passed as bv2, the method returns all the entries associated with keys between k1 and k2, including the entry associated with k1.</p>
 *     </li>
 *     <br/>
 *     <li><b>descendingMap()</b> - reverse the order of entries in a map</li><br/>
 *     <li><b>descendingKeySet()</b> - reverses the order of keys in a map</li><br/>
 *     <li><b>ceilingEntry()</b> - returns an entry with the lowest key among all those entries whose keys are greater than or equal to the specified key</li><br/>
 *     <li><b>ceilingKey()</b> - returns the lowest key among those keys that are greater than or equal to the specified key</li><br/>
 *     <li><b>floorEntry()</b> - returns an entry with the highest key among all those entries whose keys are less than or equal to the specified key</li><br/>
 *     <li><b>floorKey()</b> - returns the highest key among those keys that are less than or equal to the specified key</li><br/>
 *     <li><b>higherEntry()</b> - returns an entry with the lowest key among all those entries whose keys are greater than the specified key</li><br/>
 *     <li><b>higherKey()</b> - returns the lowest key among those keys that are greater than the specified key</li><br/>
 *     <li><b>lowerEntry()</b> - returns an entry with the highest key among all those entries whose keys are less than the specified key</li><br/>
 *     <li><b>lowerKey()</b> - returns the highest key among those keys that are less than the specified key</li><br/>
 *     <li><b>firstKey()</b> - returns the first key (the key with the lowest key) of the map</li><br/>
 *     <li><b>lastKey()</b> - returns the last key (the key with the highest key) of the map</li><br/>
 *     <li><b>firstEntry()</b> - returns the first entry (the entry with the lowest key) of the map</li><br/>
 *     <li><b>lastEntry()</b> - returns the last entry (the entry with the highest key) of the map</li><br/>
 *     <li><b>pollFirstEntry()</b> - returns and removes the first entry of the map</li><br/>
 *     <li><b>pollLastEntry()</b> - returns and removes the last entry of the map</li>
 * </ul>
 */
public class NavigableMapExample {
    public static void main(String[] args) {
        navigableMapTreeMap();
    }

    private static void navigableMapTreeMap() {
        NavigableMap<String, String> countries = new TreeMap<>();
        countries.put("EG", "Egypt");
        countries.put("KW", "Kuwait");
        countries.put("JP", "Japan");
        System.out.println(".put() after       : " + countries);

        NavigableMap<String, String> additionalCountries = new TreeMap<>();
        additionalCountries.put("SA", "Saudi Arabia");
        additionalCountries.put("AF", "Afghanistan");
        additionalCountries.put("PS", "Palestine");

        countries.putAll(additionalCountries);
        System.out.println(".putAll() after    : " + countries);

        System.out.println(".headMap()         : " + countries.headMap("JP", true));

        System.out.println(".tailMap()         : " + countries.tailMap("JP", true));

        System.out.println(".subMap()          : " + countries.subMap("JP", true, "KW", true));

        System.out.println(".descendingMap()   : " + countries.descendingMap());

        System.out.println(".descendingKeySet(): " + countries.descendingKeySet());

        System.out.println(".ceilingEntry()    : " + countries.ceilingEntry("EG"));

        System.out.println(".ceilingKey()      : " + countries.ceilingKey("EG"));

        System.out.println(".floorEntry()      : " + countries.floorEntry("EG"));

        System.out.println(".floorKey()        : " + countries.floorKey("EG"));

        System.out.println(".higherEntry()     : " + countries.higherEntry("KW"));

        System.out.println(".higherKey()       : " + countries.higherKey("KW"));

        System.out.println(".lowerEntry()      : " + countries.lowerEntry("KW"));

        System.out.println(".lowerKey()        : " + countries.lowerKey("KW"));

        System.out.println(".firstKey()        : " + countries.firstKey());

        System.out.println(".lastKey()         : " + countries.lastKey());

        System.out.println(".firstEntry()      : " + countries.firstEntry());

        System.out.println(".lastEntry()       : " + countries.lastEntry());

        System.out.println(".pollFirstEntry()  : " + countries.pollFirstEntry());

        System.out.println(".pollLastEntry()   : " + countries.pollLastEntry());
    }
}