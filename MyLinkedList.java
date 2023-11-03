import java.util.NoSuchElementException;

/**
 * Write a description of class MyLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyLinkedList<E extends Comparable<E>>
{
    private Node<E> head; 
    private Node<E> tail;
    private int size;

    /**
     * Constructor for objects of class MyLinkedList
     */
    public MyLinkedList() {
        head = null;
        tail = null;
    }

    /**
     * adds a node to the front of the LinkedList.
     *
     * @param data E value that will be stored in the new node that 
     * will be added to the Linked List
     */
    public void addHead(E data) {
        Node<E> newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }
    
    /**
     * removes the head of the LinkedList and replaces it with the 
     * node that the head was pointing to. if head is null then the method 
     * throws and exception
     * 
     * @return returns the data store in the head node.
     */
    public E removeHead() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException(); 
        } else if(size == 1) {
            tail = null;
            E returnedData = head.getData();
            head = null;
            size--;
            return returnedData;
        } else {
            E returnedData = head.getData();
            Node<E> temp;
            size--;
            temp = head;
            head = head.getNext();
            temp.setNext(null); //for garbage collection
            return returnedData;
        }
    }
    
    /**
     * adds a node to the end of the linkedlist with the parameter 
     * data stored in it.
     * 
     * @param   data value stored in the node that will be appended to the 
     *          end of the linkedlist
     */
    public void addTail(E data) {
        if (size == 0) {
            addHead(data);
        } else {
            Node<E> newNode = new Node(data);
            tail.setNext(newNode);
            tail = newNode;
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
        Node<E> currentNode = head;
        if (index > size - 1|| index < 0 || head == null) {
            throw new NoSuchElementException();
        } else {
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getNext();
            }
            return currentNode.getData();
        }
    }
    
    /**
     * removes the node at a specific index
     * 
     * @param index the index of the node that will be removed
     * @return the data stored in the removed node
     */
    public E remove(int index) throws NoSuchElementException {
        if (index > size - 1|| index < 0) {
            throw new NoSuchElementException();
        } else if (index == 0) {
            return removeHead();
        } else {
            Node<E> currentNode = head;
            for (int i = 0; i < index - 1; i++){
                if (currentNode.getNext() == null){
                    throw new NoSuchElementException();
                } else { 
                    currentNode = currentNode.getNext();
                }
            }
            Node<E> temp = currentNode.getNext();
            if (temp.getNext() == null) {
                currentNode.setNext(null);
                tail = currentNode;
            } else {
                currentNode.setNext(temp.getNext());
                temp.setNext(null);
            }
            size--;
            return temp.getData();
        }
        
    }
    
    /**
     *  adds a new node storing element as data to the linked list at a 
     *  specific index
     *  
     *  @param index    the index where the new node will be added
     *  @param element  the value stored in the added node as data 
     */
    public void add(int index, E element) {
        if (index > size || index < 0){
            throw new NoSuchElementException();
        }
        if (index == size){
            addTail(element);
        } else if (index == 0) {
            addHead(element);
        } else {
            Node<E> currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNext();
            }
            Node<E> nextNode = currentNode.getNext();
            Node<E> newNode = new Node(element);
            currentNode.setNext(newNode);
            newNode.setNext(nextNode);
            size++;
        }
        
    }
    
    /**
     * appends an element to the end of the LinkedList
     * 
     * @param element the value that will be appended to the LinkedList in a node
     */
    public void add(E element){
        addTail(element);
    }
    
    /**
     * sets the data of a node at a specific index to the parameter element
     * 
     * @param index the index of the node in the linkedlist 
     *              where the data will be changed
     * @param element the value that the node's data is being set to
     */
    public void set(int index, E element){
        if (index > size - 1 || index < 0) {
            throw new NoSuchElementException();
        } else {
            Node<E> currentNode = head;
            for (int i = 0; i < index; i++){
                currentNode = currentNode.getNext();
            }
            currentNode.setData(element);
        }
    }
    
    /**
     *  inserts a node storing element in to a sorted LinkedList at its respective 
     *  sorted position based on the value of element 
     *  
     *  @param element the element that is stored in the newly added node
     */
    public void insertSorted(E element) {
        Node<E> currentNode = head;
        int currentIndex = 0;
 
        while (currentNode != null
                && element.compareTo(currentNode.getData()) >= 0) {
            currentNode = currentNode.getNext(); 
            currentIndex++;
        }
        add(currentIndex, element); 
    }
    
    /**
     * removes the first element from the linked list that stores the value 
     * of the parameter, element
     * 
     * @param element the value that will be removed from the Linkedlist 
     */
    public E remove(E element) {
        Node<E> currentNode = head;
        for (int i = 0 ; i < size; i++) {
            if (element.equals(currentNode.getData())) {
                return remove(i);
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }
    
    /**
     * determines if the linked list is empty or not
     * 
     * @return true if empty returns false if not.
     */
    public boolean isEmpty() {
        return head == null;
    }
    
    /** 
     * returns the value of the data in the head node of the 
     * linked list.
     * 
     * @return the value of the data of the head 
     * @throws NoSuchElementException if head is null
     */
    public E getHead() throws NoSuchElementException {
        if (head.getData() == null) {
            throw new NoSuchElementException();
        } else {
            return head.getData();
        }
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
        Node<E> currentNode = head;
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
