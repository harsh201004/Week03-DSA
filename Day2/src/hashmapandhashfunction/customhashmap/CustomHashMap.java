package hashmapandhashfunction.customhashmap;
import java.util.*;
public class CustomHashMap<K, V> {
    public static final int INITIAL_CAPACITY = 16;
    public LinkedList<Entry<K, V>>[] buckets;

    public CustomHashMap() {
        buckets = new LinkedList[INITIAL_CAPACITY];
    }

    public int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % INITIAL_CAPACITY);
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);

        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        buckets[index].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = getBucketIndex(key);

        if (buckets[index] == null) {
            return null;
        }

        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;  // Key not found
    }

    public void remove(K key) {
        int index = getBucketIndex(key);

        if (buckets[index] == null) {
            return;
        }

        buckets[index].removeIf(entry -> entry.key.equals(key));
    }

    public void printMap() {
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] != null) {
                for (Entry<K, V> entry : buckets[i]) {
                    System.out.println("Key: " + entry.key + ", Value: " + entry.value);
                }
            }
        }
    }

    public static class Entry<K, V> {
        public K key;
        public V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
