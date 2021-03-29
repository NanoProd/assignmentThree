public class ArrayList<E> {
    //attributes
    private int CAPACITY;
    private E[] elements;
    private int size;

    //constructors
    @SuppressWarnings("unchecked")
    public ArrayList(){
        CAPACITY = 1;
        elements = (E[]) new Object[CAPACITY]; //safe cast
    }
    @SuppressWarnings("unchecked")
    public ArrayList(int cap){
        CAPACITY = cap;
        elements =  (E[]) new Object[CAPACITY]; //safe cast
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int getCapacity(){
        return elements.length;
    }
    
    public E get(int index) throws IndexOutOfBoundsException{
               if(index < 0 || index >= elements.length) {
                throw new IndexOutOfBoundsException("Illegal index" + index);   
               }
                return elements[index];
    }

    public E set(int index, E elem) throws IndexOutOfBoundsException, IllegalStateException{
        if(index < 0 || index >= elements.length){
            throw new IndexOutOfBoundsException("Illegal index: " + index);
        }
        E temp = elements[index];
        elements[index] = elem;
        return temp;
    }
     
    public void add(int index, E elem) throws IndexOutOfBoundsException, IllegalStateException{
        if(index < 0 || index >= elements.length){
            throw new IndexOutOfBoundsException("Illegal index: " + index);
        }
        if(size == elements.length){
            throw new IllegalStateException("array is full");
        }
        for(int i = size - 1; i >= index; i++){
            elements[i + 1] = elements[i];
        }
        elements[index] = elem;
        size++;
    }

    public E remove(int index) throws IndexOutOfBoundsException{
        if(index < 0 || index >= elements.length){
            throw new IndexOutOfBoundsException("Illegal index: " + index);
        }
        E temp = elements[index];
        for(int i = index; i < size - 1; i++){
            elements[i] = elements[i+1];
        }
        elements[size - 1] = null;
        size--;
        return temp;
    }
    @SuppressWarnings("unchecked")
    public void resize(int cap){
        E[] temp = (E[]) new Object[cap]; //safe cast
        for(int i = 0; i < size; i++){
            temp[i] = elements[i];
        }
        elements = temp; //use new array
        CAPACITY = cap;
    }
}
