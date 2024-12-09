package _1_learn._1_7_data_structures_and_algorithms._1_7_9_lru_cache;

public class Main {
    public static void main(final String[] PARAMETERS) {
        LRUCacheExample<Integer, Integer> LRU_CACHE = new LRUCacheExample<>(2);
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
}