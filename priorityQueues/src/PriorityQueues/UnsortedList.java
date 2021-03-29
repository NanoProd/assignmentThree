package PriorityQueues;
import java.util.Comparator;
import DataTypes.LinkedList;
import DataTypes.LinkedList.Node;

public class UnsortedList<K,V> extends AbstractPQ<K,V> {
    private LinkedList<Entry<K,V>> list = new LinkedList<>();

    //constructors
    public UnsortedList() {
        super();
    }
    public UnsortedList(Comparator<K> comp) {
        super(comp);
    }
    
    public Entry<K,V> min() {
        if(list.isEmpty()) {
            return null;
        } else {
            Node<Entry<K,V>> position = list.first();
            Node<Entry<K,V>> smallest = list.first();
            while(position != null){
                if(compare(position.getElement(), smallest.getElement()) < 0){
                    smallest = position;
                }
                position = position.getNext();
            }
            return smallest.getElement();
        }
    }
    public Entry<K,V> removeMin() {
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
