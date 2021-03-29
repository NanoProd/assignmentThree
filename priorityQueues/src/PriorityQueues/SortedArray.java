package PriorityQueues;
import DataTypes.ArrayList;
import java.util.Comparator;

public class SortedArray<K,V> extends AbstractPQ<K,V> {
    private ArrayList<Entry<K,V>> list = new ArrayList<>();
    private Entry<K,V> smallest = null;

    //constructors
    public SortedArray(){
        super();
    }
    public SortedArray(Comparator<K> comp){
        super(comp);
    }

    
    public  int binaryInsert(Entry<K,V> insertKey){
        if(list.size() == 0){
            return 0;
        }
        int lowerBound = 0;
        int upperBound = list.size()-1;
        int current = 0;
        while(true){
            current = (upperBound + lowerBound) / 2;
            if(compare(list.get(current), insertKey) == 0){
                return current;
            } else if(compare(list.get(current), insertKey) < 0){
                lowerBound = current + 1; //it is in the upper half
                if(lowerBound > upperBound){
                    return current + 1;
                }
            } else {
                upperBound = current - 1; //it is in the lower half
                if(lowerBound > upperBound)
                    return current;
            }
        }
    }


    public Entry<K,V> insert(K key, V value) throws IllegalArgumentException{
        checkKey(key);
        Entry<K,V> newEntry = new PQEntry<K,V>(key,value);
        if(list.size() + 1 >= list.getCapacity()){
            list.resize(list.getCapacity() * 2);
        }
        if(list.isEmpty()){
            list.add(0, newEntry);
            smallest = newEntry;
            return newEntry;
        } else {
            int position = binaryInsert(newEntry);
            list.add(position, newEntry);
            if(position == 0){
                smallest = newEntry;
            }
            return newEntry;
            }
        }
    
	public Entry<K,V> min(){
        if(list.isEmpty()){
            return null;
        }
        else {
            int checkSize = list.getCapacity() / 4; 
            if(list.size() < checkSize ){
                list.resize(list.getCapacity() / 2);
            }
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

    public int size(){
        return list.size();
    }

}

