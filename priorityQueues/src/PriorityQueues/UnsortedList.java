package PriorityQueues;
import javax.swing.text.Position;

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
    
    public Entry<K, V> min(){
        if(isEmpty()){
            return null;
        }
        Entry<K, V> current = (Entry<K, V>) list.first(); 
        Entry<K,V> min = (Entry<K, V>) current;
        while(current != null){
            if(current != null){
                if(compare(current, min) < 0){
                    min = current;
                }
            }
            current = current.getNext();
        }
        return min;
    }

    public Entry<K,V> removeMin(){
        if(list.isEmpty()){return null;}
        Entry<K, V> min = this.min();
        return list.remove(min);
    }

    /*public Entry<K,V> removeMin() {
        if(list.isEmpty()) {
            return null;
        }
        else {
            Node<Entry<K,V>> position = list.first();
            Node<Entry<K,V>> smallest = list.first();
            while(position != null){
                if(compare(position.getElement(), smallest.getElement()) < 0){
                    smallest = position;
                }
                position = position.getNext();
            }
            return list.remove(smallest);            
        }
    }
    */

    public int size(){
        return list.size();
    }

    public Entry<K,V> insert(K key, V value) throws IllegalArgumentException {
        checkKey(key);
        Entry<K,V> newEntry = new PQEntry<K,V>(key,value);
        list.addLast(newEntry);
        return newEntry;
    }

}
