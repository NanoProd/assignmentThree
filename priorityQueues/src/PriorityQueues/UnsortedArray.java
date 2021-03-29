package PriorityQueues;
import DataTypes.ArrayList;
import java.util.Comparator;

public class UnsortedArray<K,V> extends AbstractPQ<K,V> {
    private ArrayList<Entry<K,V>> list = new ArrayList<>();

    //constructors
    public UnsortedArray(){
        super();
    }
    public UnsortedArray(Comparator<K> comp){
        super(comp);
    }

    public Entry<K,V> min(){
        if(list.isEmpty()){
            return null;
        }
        else {
            Entry<K,V> smallest = list.get(0);
            for(int i = 0; i < list.size(); i++){
                if(compare(list.get(i), smallest) < 0){
                    smallest = list.get(i);
                }
            }
        return smallest;
        }
    }
    
    public Entry<K,V> removeMin() {
        if(list.isEmpty()){
            return null;
        }
        else {
            int checkSize = list.getCapacity() / 4; 
            if(list.size() < checkSize ){
                list.resize(list.getCapacity() / 2);
            }
            int index = 0;
            Entry<K,V> smallest = list.get(0);
            for(int i = 0; i < list.size(); i++){
                if(compare(list.get(i), smallest) < 0){
                    smallest = list.get(i);
                    index = i;
                }
            }
            return list.remove(index);
        }
    }

    public Entry<K,V> insert(K key, V value) throws IllegalArgumentException{
        checkKey(key);
        Entry<K,V> newEntry = new PQEntry<K,V>(key,value);
        if(list.size() + 1 >= list.getCapacity()){
            list.resize(list.getCapacity() * 2);
        }
        list.add(list.size(), newEntry);
        return newEntry;
    }
    public int size(){
        return list.size();
    }
    

}
