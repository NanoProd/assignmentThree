package PriorityQueues;

import java.lang.IllegalArgumentException;
import DataTypes.DefaultComparator;


public abstract class AbstractPQ<K,V> implements MyPQ<K,V>{ 
    //nested entry class
    protected static class PQEntry<K,V> implements Entry<K,V>{
        private K k; //key
        private V val; //value
        public PQEntry(K key, V value){
            k = key;
            val = value;
        }

        //entry interface methods
        public K getKey(){
            return k;
        }
        public V getValue(){
            return val;
        }
        //not exposed methods
        protected void setKey(K key){
            k = key;
        }
        protected void setValue(V value){
            val = value;
        }
    }//end of nested class

    //define the order of keys in the priority queue
    private DefaultComparator<K> comp;

    //constructor, initializes empty priority queue
    protected AbstractPQ(DefaultComparator<K> comp){
        this.comp = comp;
    }
    //default constructor with default comparator
	protected AbstractPQ(){
        this( new DefaultComparator<>());
    }

    //compare two entries
    /*
     * 
     *
     */
    public int compare(Entry<K,V> a, Entry<K,V> b){
       return comp.compare(a.getKey(),b.getKey());
    }
    //determines whether a key is valid
    protected boolean checkKey(K key) throws IllegalArgumentException{
        try {
            return (comp.compare(key,key) == 0); //see if key can be compared to itself
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid key");
        }
    }

    //tests whether PQ is empty
    public boolean isEmpty(){
        return size() == 0;
    }
}