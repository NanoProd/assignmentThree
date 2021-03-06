package PriorityQueues;

import DataTypes.*;
import DataTypes.LinkedList.Node;

public class UnsortedList<K,V> extends AbstractPQ<K,V> {
    private LinkedList<Entry<K,V>> list = new LinkedList<>();

    //constructors
    public UnsortedList() {
        super();
    }
    public UnsortedList(DefaultComparator<K> comp) {
        super(new DefaultComparator<K>());
    }
    
    public Node<Entry<K, V>> minNode(){
        if(isEmpty()){
            return null;
        }
        Node<Entry<K,V>> current = list.first();
        Node<Entry<K,V>> minimum = list.first();
        while(current.getElement() != null){
            if(compare(current.getElement(), minimum.getElement()) < 0){
                minimum = current;
            }
            current = current.getNext();
        }

        return minimum;
    }

    public Entry<K,V> min(){
        if(isEmpty()){
            return null;
        } else {
            return minNode().getElement();
        }
    }

    public Entry<K,V> removeMin(){
        if(list.isEmpty()){return null;}
        Node<Entry<K,V>> min = this.minNode();
        Entry<K,V> minElement = list.remove(min);
        return minElement;
    }

    public int size(){
        return list.size();
    }

    public Entry<K,V> insert(K key, V value) throws IllegalArgumentException {
        checkKey(key);
        Entry<K,V> newEntry = new PQEntry<K,V>(key,value);
        if(list.isEmpty()){
            list.addFirst(newEntry);
            return newEntry;
        } else {
            list.addLast(newEntry);
            return newEntry;
        }
    }

}
