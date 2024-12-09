package _1_learn._1_7_data_structures_and_algorithms._1_7_9_lru_cache;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCacheExample<Key, Value> extends LinkedHashMap<Key, Value> {
    private final int CAPACITY;

    public LRUCacheExample(final int CAPACITY) {
        super(CAPACITY, 0.75f, true);
        this.CAPACITY = CAPACITY;
    }

    @Override
    protected boolean removeEldestEntry(final Map.Entry<Key, Value> eldest) {
        return size() > CAPACITY;
    }

    public Value get(final Object KEY) {
        return super.get(KEY);
    }

    public Value put(final Key KEY, final Value VALUE) {
        return super.put(KEY, VALUE);
    }
}