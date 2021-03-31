package DataTypes;

public class LinkedList<E> {
    //inner node class
    public static class Node<E>{
        //inner class attributes
        private E element;
        private Node<E> prev;
        private Node<E> next;
        //constructor
        public Node(){
            element = null;
            prev = null;
            next = null;
            comp = new DefaultComparator<>();
        }
        public Node(E e, Node<E> p , Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }
        public E getElement(){
            return element;
        }
        public Node<E> getPrev(){
            return prev;
        }
        public Node<E> getNext() {
            return next;
        }

        public void setPrev(Node<E> prev){
            this.prev = prev;
        }
        public void setNext(Node<E> next){
            this.next = next;
        }
    } //end of inner node class
    
    //class attributes
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    //constructor
    public LinkedList(){
        head = new Node<>(null,null,null);
        tail = new Node<>(null,head,null); 
        head.setNext(tail);
    }
    public int size(){
        return size;
    }
    public boolean isEmpty() {
            return size == 0;
    }
    public Node<E> getHead(){
        return head;
    }
    public Node<E> first(){
        if(isEmpty()){
            return null;
        } else {
            return head.getNext();
        }
    }
    public Node<E> last() {
        if(isEmpty())
            return null;
        return tail.getPrev();
    }
    public void insert(E e, Node<E> pred, Node<E> succ){
        //create new node
        Node<E> newest = new Node<>(e,pred,succ);
        pred.setNext(newest);
        succ.setPrev(newest);
        size++;
    }
    public void addFirst(E e){
       insert(e, head, head.getNext()); 
    }
    public void addLast(E e) {
        insert(e, tail.getPrev(), tail);
    }
    public E remove(Node<E> node) {
        Node<E> pred = node.getPrev();
        Node<E> succ = node.getNext();
        pred.setNext(succ);
        succ.setPrev(pred);
        size--;
        return node.getElement();
    }
    public E removeFirst(){
        if(isEmpty()){
            return null;
        } else {
            return remove(head.getNext());
        }
    }
    public E removeLast() {
        if(isEmpty()){
            return null;
        } else {
            return remove(tail.getPrev());
        }
    }

    /*     public Node<E> getMin(){
        if(isEmpty()){
            return null;
        }
        Node<E> current = head; 
        Node<E> min = current;
        while(current != null){
            if(current != null){
                if(min.compare(current) > 0){
                    min = current;
                }
            }
            current = current.getNext();
        }
    }*/

    
    
}
