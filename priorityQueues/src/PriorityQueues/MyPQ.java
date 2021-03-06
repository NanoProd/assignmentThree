package PriorityQueues;

public interface MyPQ<K,V>{
    public int size();
    public boolean isEmpty();
    public Entry<K,V> insert(K key, V value) throws IllegalArgumentException;
    public Entry<K,V> min();
    public Entry<K,V> removeMin();
}
