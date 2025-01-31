package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_146_lru_cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 * <br/>
 * <br/>
 * Implement the LRUCache class:
 * </h2>
 * <ul>
 * <li>LRUCache(int capacity) Initialize the LRU cache with positive size capacity.</li>
 * <li>int get(int key) Return the value of the key if the key exists, otherwise return -1.</li>
 * <li>void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.</li>
 * </ul>
 * <br/>
 * <br/>
 * <h2>The functions get and put must each run in O(1) average time complexity.</h2>
 */

public class LRUCache {
    public static void main(final String[] ARGUMENTS) {
        final LRUCache LRU_CACHE = new LRUCache(2);
        LRU_CACHE.put(1, 1);       // cache is {1=1}
        LRU_CACHE.put(2, 2);       // cache is {1=1, 2=2}
        System.out.println(LRU_CACHE.get(1));  // return 1
        LRU_CACHE.put(3, 3);       // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println(LRU_CACHE.get(2));  // returns -1 (not found)
        LRU_CACHE.put(4, 4);       // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println(LRU_CACHE.get(1));  // return -1 (not found)
        System.out.println(LRU_CACHE.get(3));  // return 3
        System.out.println(LRU_CACHE.get(4));  // return 4
    }

    private final LinkedHashMap<Integer, Integer> CACHE;

    public LRUCache(final int CAPACITY) {
        CACHE = new LinkedHashMap<>(CAPACITY, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(final Map.Entry<Integer, Integer> ELDEST) {
                return size() > CAPACITY;
            }
        };
    }

    private int get(final int KEY) {
        return CACHE.getOrDefault(KEY, -1);
    }

    private void put(final int KEY, final int VALUE) {
        CACHE.put(KEY, VALUE);
    }
}