import java.util.NoSuchElementException;

/**
 * Write a description of class MyDoublyLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyLinkedList<E extends Comparable<E>>
{
    private DoubleNode<E> head;
    private DoubleNode<E> tail;
    private int size;
    
    /**
     * Constructor for objects of class MyLinkedList
     */
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    /**
     * appends an element to the end of the LinkedList
     * 
     * @param element the value that will be appended to the LinkedList in a node
     */
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
    
    /**
     *  adds a new node storing element as data to the linked list at a 
     *  specific index
     *  
     *  @param index    the index where the new node will be added
     *  @param element  the value stored in the added node as data 
     */
    public void add(int index, E element) throws NoSuchElementException {
        if (index > size || index < 0){
            throw new NoSuchElementException();
        } else if (isEmpty()){
            head = new DoubleNode(element);
            tail = head;
            size++;
        } else if (index == size ){
            add(element);
        } else if (index == 0){
            DoubleNode newHead = new DoubleNode(element);
            newHead.setNext(head);
            head.setPrev(newHead);
            head = newHead;
            size++;
        } else {
            DoubleNode nextNode = findNode(index);
            DoubleNode currentNode = nextNode.getPrev();
            DoubleNode newNode = new DoubleNode(element);
            
            newNode.setNext(nextNode);
            newNode.setPrev(currentNode);
            currentNode.setNext(newNode);
            nextNode.setPrev(newNode);
            size++;
        }
        
    }
    
    /**
     * adds a node to the front of the LinkedList.
     *
     * @param data E value that will be stored in the new node that 
     * will be added to the Linked List
     */
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
    
    /**
     * adds a node to the end of the linkedlist with the parameter 
     * data stored in it.
     * 
     * @param   data value stored in the node that will be appended to the 
     *          end of the linkedlist
     */
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
    
    /**
     * returns the data in a node at a specific index 
     * 
     * @param index the index of the node that's data will be returned 
     * @return the data of the node at index (index)
     */
    public E get(int index) throws NoSuchElementException {
        if (index >= size || index < 0){
            throw new NoSuchElementException();
        } else {
            return findNode(index).getData();
        }
    }
     
    /**
     * returns the node at a specified index within the linked list.
     * 
     * @param index the index on the wanted node
     * @return the node at the specified position 
     */
    private DoubleNode<E> findNode(int index){
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
        if (size == 0){
            addHead(element);
        } else {
            if (element.compareTo(head.getData()) < 0)
            {
                addHead(element);
            } else {
                while (currentNode != null
                        && element.compareTo(currentNode.getData()) >= 0) {
                    currentNode = currentNode.getNext(); 
                    currentIndex++;
                }
                add(currentIndex, element); 
            }
        }
    }
    
    /** 
     * returns the value of the data in the head node of the 
     * linked list.
     * 
     * @return the value of the data of the head 
     * @throws NoSuchElementException if head is null
     */
    public E getHead() throws NoSuchElementException {
        if (head == null){
            throw new NoSuchElementException();
        } else {
            return head.getData();
        }
    }
    
    /** 
     * returns the value of the data in the tail node of the 
     * linked list.
     * 
     * @return the value of the data of the head 
     * @throws NoSuchElementException if tail is null
     */
    public E getTail() throws NoSuchElementException{
        if (tail == null){
            throw new NoSuchElementException();
        } else {
            return tail.getData();
        }
    }
    
    /**
     * sets the data of a node at a specific index to the parameter element
     * 
     * @param index the index of the node in the linkedlist 
     *              where the data will be changed
     * @param element the value that the node's data is being set to
     */
    public void set(int index, E element) {
        if(index >= size || index < 0){
            throw new NoSuchElementException();
        } else {
            findNode(index).setData(element);
        }
    }
    
    /**
     * removes the node at a specific index
     * 
     * @param index the index of the node that will be removed
     * @return the data stored in the removed node
     */
    public E remove(int index)throws NoSuchElementException{
        if (index >= size || index < 0 || isEmpty()) {
            throw new NoSuchElementException(); 
        } else if (size == 1){
            E data = head.getData();
            head = null;
            tail = null;
            size--;
            return data;
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
    
    /**
     * removes the first element from the linked list that stores the value 
     * of the parameter, element
     * 
     * @param element the value that will be removed from the Linkedlist 
     */
    public E remove(E element){
        DoubleNode<E> currentNode = head; 
        for (int i = 0 ; i < size; i++) {
            if (element.equals(currentNode.getData())) {
                return remove(i);
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }
    
    /**
     * removes the head of the LinkedList and replaces it with the 
     * node that the head was pointing to. if head is null then the method 
     * throws and exception
     * 
     * @return returns the data store in the head node.
     */
    public E removeHead(){
        return remove(0);
    }
    
    /**
     * removes the tail of the LinkedList and replaces it with the 
     * node that the head was pointing to. if head is null then the method 
     * throws and exception
     * 
     * @return returns the data store in the head node.
     */
    public E removeTail(){
        return remove(size - 1); 
    }
    
    /**
     * determines if the linked list is empty or not
     * 
     * @return true if empty returns false if not.
     */
    public boolean isEmpty() {
        return (size == 0);
    }
    
    /**
     *  returns the size of the of the Linked List  y counting 
     *  the amount of node included in it
     *  
     * @return the length of the linked list
     */
    public int size() {
        return size;
    }
    
    /**
     * returns a string that has all of the data from the Linkedlist from head 
     * to tail 
     * 
     * @return string that has all of the values of the linked list.
     */
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
    
    public boolean integerityTest()
    {
        DoubleNode currentNode = head;
        int testSize = 0;
        while ( currentNode != null && currentNode.getNext() != null ){
            if (currentNode.getPrev() != null && !currentNode.getPrev().getNext().equals(currentNode)) {
                //if prev node doesn't point back;
                return false;
            } else if (currentNode.getNext() != null && !currentNode.getNext().getPrev().equals(currentNode)){
                // if next node doesnt point back
                return false;
            }
            currentNode = currentNode.getNext();
        }
        
        return true;
    }
}
