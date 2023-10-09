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

    /**
     * Constructor for objects of class MyLinkedList
     */
    public MyLinkedList() {
        head = null;
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
        } else {
            newNode.setNext(head);
            head = newNode;
        }
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
        } else {
            E returnedData = head.getData();
            Node temp;
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
        if (head == null) {
            addHead(data);
        } else {
            Node newNode = new Node(data);
            Node currentNode = head;
            
            while(currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
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
        int size = 0;
        
        if (head == null) {
            return size;
        } else {
            size++;
            Node currentNode = head;
            
            while(currentNode.getNext() != null) {
                size++;
                currentNode = currentNode.getNext();
            }
            return size;
        }
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
        
        while (currentNode != null) {
            toString += currentNode.getData() + ", ";
            currentNode = currentNode.getNext();
        }
        return toString;
    }
}
