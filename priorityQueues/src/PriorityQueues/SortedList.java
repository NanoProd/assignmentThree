package PriorityQueues;
import DataTypes.DefaultComparator;
import DataTypes.LinkedList;
import DataTypes.LinkedList.Node;

public class SortedList<K,V> extends AbstractPQ<K,V>{
    private LinkedList<Entry<K,V>> list = new LinkedList<>();

    //constructors
    public SortedList() {
        super();
    }
    public SortedList(DefaultComparator<K> comp) {
        super(new DefaultComparator<K>());
    }
    
    public Entry<K,V> insert(K key, V value) throws IllegalArgumentException {
        checkKey(key);
        Entry<K,V> newEntry = new PQEntry<K,V>(key,value);
        if(list.isEmpty()){
            list.addFirst(newEntry);
            return newEntry;
        } else {
            Node<Entry<K,V>> position = list.first();
            Node<Entry<K,V>> target = null;
            while(position != null){
                if(compare(newEntry, position.getPrev().getElement()) >= 0 && (compare(newEntry, position.getNext().getElement()) < 0)){
                    target = position;
                }
                position = position.getNext();
            }
            if(target == null){
                list.addLast(newEntry);
                return newEntry;
            } else {
                list.insert(newEntry, target.getPrev(), target.getNext());
                return newEntry;
            }
        }
    }

    public Entry<K,V> min() {
        if(list.isEmpty()) {
            return null;
        } else {
            return list.first().getElement();         
        }
    }
    public Entry<K,V> removeMin() {
        if(list.isEmpty()) {
            return null;
        }
        else {
            return list.removeFirst();
        }
    }

    public int size(){
        return list.size();
    }
}
