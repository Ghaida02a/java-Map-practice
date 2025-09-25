import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");
        System.out.println("Cache after 3 inserts: " + cache);

        //make (1) most recently used(MRU)
        cache.get(1);

        // Add 4, this should remove the least recently used (key 2 -> LRU)
        cache.put(4, "Four");
        System.out.println("Cache after inserting key 4: " + cache);

        // Add another entry, this should remove key 3
        cache.put(5, "Five");
        System.out.println("Cache after inserting key 5: " + cache);
    }

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        //capacity-> sets the initial size of the internal hash table.
        //loadFactor-> when 75% full, increase the internal table size.
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}