import java.util.NoSuchElementException;

/**
 * Write a description of class MyDoublyLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyDoublyLinkedList<E extends Comparable<E>>
{
    private DoubleNode<E> head;
    private DoubleNode<E> tail;
    private int size;
    
    public MyDoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public void add(E element) {
        if(isEmpty()){
            head = new DoubleNode(element);
            tail = head;
        } else{
            DoubleNode appendedNode = new DoubleNode(element);
            appendedNode.setPrev(tail);
            tail.setNext(appendedNode);
            tail = appendedNode; 
            
        }
        size++;
    }
    
    //potentially could find mid point then traverse from head or tail based on how far it 
    // is and optimize the for loop at the else condition
    public void add(int index, E element) throws NoSuchElementException {
        if (index > size || index < 0){
            throw new NoSuchElementException();
        } else if (isEmpty()){
            head = new DoubleNode(element);
            tail = head;
            size++;
        } else if (index == size - 1 ){
            add(element);
        } else if (index == 0){
            DoubleNode newHead = new DoubleNode(element);
            newHead.setNext(head);
            head.setPrev(newHead);
            head = newHead;
            size++;
        } else {
            DoubleNode currentNode = findNode(index);
            DoubleNode nextNode = currentNode.getNext();
            DoubleNode newNode = new DoubleNode(element);
            
            newNode.setNext(nextNode);
            newNode.setPrev(currentNode);
            currentNode.setNext(newNode);
            nextNode.setPrev(newNode);
            size++;
        }
        
    }
    
    public void addHead(E element) {
        if (isEmpty()){
            head = new DoubleNode(element);
            tail = head;
            size++;
        } else{
            DoubleNode newHead = new DoubleNode(element);
            newHead.setNext(head);
            head.setPrev(newHead);
            head = newHead;
            size++;
        }
    }
    
    public void addTail(E element){
        if (isEmpty()) {
            addHead(element);
        } else {
            DoubleNode newTail = new DoubleNode(element);
            newTail.setPrev(tail);
            tail.setNext(newTail);
            tail = newTail;
            size++;
        }
    }
    
    public E get(int index) throws NoSuchElementException {
        if (index >= size || index < 0){
            throw new NoSuchElementException();
        } else {
            return findNode(index).getData();
        }
    }
    
    public DoubleNode<E> findNode(int index)throws NoSuchElementException{
        if(index <= size/2){
            DoubleNode<E> currentNode = head;
            for(int i = 0; i < index; i++) {
                currentNode = currentNode.getNext();
            }
            return currentNode; 
        } else {
            DoubleNode<E> currentNode = tail;
            for( int i = size - 1; i > index; i--) {
                currentNode = currentNode.getPrev();
            }
            return currentNode;
        }
    }
    
    // may need some testing some done
    /**
     *  inserts a node storing element in to a sorted LinkedList at its respective 
     *  sorted position based on the value of element 
     *  
     *  @param element the element that is stored in the newly added node
     */
    public void insertSorted(E element) {
        DoubleNode<E> currentNode = head;
        int currentIndex = 0;
        if (element.compareTo(head.getData()) < 0)
        {
            addHead(element);
        } else {
            while (currentNode != null
                    && element.compareTo(currentNode.getData()) >= 0) {
                currentNode = currentNode.getNext(); 
                currentIndex++;
            }
            add(currentIndex - 1, element); 
        }
    }
    
    //needs testing
    public E getHead() {
        if (head == null){
            throw new NoSuchElementException();
        } else {
            return head.getData();
        }
    }
    //needs testing
    public E getTail(){
        if (tail == null){
            throw new NoSuchElementException();
        } else {
            return tail.getData();
        }
    }
    
    // might need a bit more testing
    public void set(int index, E element) {
        if(index >= size || index < 0){
            throw new NoSuchElementException();
        } else {
            findNode(index).setData(element);
        }
    }
    
    public E remove(int index)throws NoSuchElementException{
        if (index >= size || index < 0) {
            throw new NoSuchElementException(); 
        } else if (index == 0){
            DoubleNode newHead = head.getNext();
            head.setNext(null);
            newHead.setPrev(null);
            E data = head.getData();
            head = newHead;
            size--;
            return data; 
        } else if ( index == size - 1) {
            DoubleNode newTail = tail.getPrev();
            tail.setPrev(null);
            newTail.setNext(null);
            E data = tail.getData();
            tail = newTail;
            size--;
            return data; 
        } else {
            DoubleNode<E> removedNode = findNode(index);
            DoubleNode<E> nextNode = removedNode.getNext();
            DoubleNode<E> prevNode = removedNode.getPrev();
            nextNode.setPrev(prevNode);
            prevNode.setNext(nextNode);
            removedNode.setPrev(null);
            removedNode.setNext(null);
            size--;
            return removedNode.getData();
        }
    }
    
    public boolean isEmpty() {
        return (size == 0);
    }
    
    public int size() {
        return size;
    }
    
    public String toString() {
        String toString = "";
        DoubleNode<E> currentNode = head;
        if (head != null){
            while (currentNode.getNext() != null) {
                toString += currentNode.getData() + ", ";
                currentNode = currentNode.getNext();
            }
            toString += currentNode.getData();
        }
        return toString;
    }
    
}
