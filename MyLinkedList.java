import java.util.NoSuchElementException;

/**
 * Write a description of class MyLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyLinkedList<E>
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
     * the add head method adds a node to the front of the LinkedList. If a 
     * head exists then the orignal head is now pointed to by the new head
     * containing data, thus making the old head the second item in the list.
     *
     * @param data is the E value that will be stored in the new node that 
     * will be added to the Linked List
     */
    public void addHead(E data) {
        Node newNode = new Node(data);
        
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
     * this method removes the head of the LinkedList and replaces it with the 
     * node taht the head was pointing to. if head is null then the method 
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
            Node temp;
            size--;
            temp = head;
            head = head.getNext();
            temp.setNext(null); //for garbage collection
            return returnedData;
        }
        
    }
    
    /**
     * this method adds a node to the end of the linkedlist with the parameter 
     * data soted in it.
     * 
     * @param   data is the value stored in the node that will be appended to the 
     *          end of the linkedlist
     */
    public void addTail(E data) {
        if (size == 0) {
            addHead(data);
        } else {
            Node newNode = new Node(data);
            tail.setNext(newNode);
            tail = tail.getNext();
            size++;
        }
    }
    
    public E get(int index) throws NoSuchElementException {
        Node<E> currentNode = head;
        for (int i = 0; i < index; i++) {
            if (currentNode.getNext() == null){
                throw new NoSuchElementException();
            } else {
                currentNode = currentNode.getNext();
            }
        }
        return currentNode.getData();
    }
    
    public E remove(int index) throws NoSuchElementException {
        if (index > size - 1) {
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
            } else {
                currentNode.setNext(temp.getNext());
                temp.setNext(null);
            }
            size--;
            return temp.getData();
        }
        
    }
    
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
            Node<E> newNode = new Node(element);// not finished
            currentNode.setNext(newNode);
            newNode.setNext(nextNode);
            size++;
        }
        
    }
    
    public void add(E element){
        addTail(element);
    }
    
    public void set(int index, E element){
        if (index > size - 1) {
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
     * this method determines if the linked list is empty or not
     * 
     * @return returns true if empty returns false if not.
     */
    public boolean isEmpty() {
        return head == null;
    }
    
    /** 
     * this method returns the value of the data in the head node of the 
     * linked list.
     * 
     * @return the value of the data of the head is returned
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
     * this method returns the size of the of the Linked List  y counting 
     *  the amount of node included in it
     *  
     * @return an int value represnting the lenght of the linked list
     */
    public int size() {
        return size;
    }
    
    /**
     * returns a string that has all of the values of from the data in each 
     * individual node of the Linked list
     * 
     * @return string that has all of the values of the linked list.
     */
    public String toString() {
        String toString = "";
        Node currentNode = head;
        
        while (currentNode.getNext() != null) {
            toString += currentNode.getData() + ", ";
            currentNode = currentNode.getNext();
        }
        toString += currentNode.getData();
        return toString;
    }
}
