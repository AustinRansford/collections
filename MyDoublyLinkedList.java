import java.util.NoSuchElementException;

/**
 * Write a description of class MyDoublyLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyDoublyLinkedList<E> 
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
            DoubleNode currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getNext();
            }
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
