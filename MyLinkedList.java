import java.util.NoSuchElementException;

/**
 * Write a description of class MyLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyLinkedList<E>
{
    // instance variables - replace the example below with your own
    private Node<E> head; 

    /**
     * Constructor for objects of class MyLinkedList
     */
    public MyLinkedList() {
        head = null;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addHead(E data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else{
            newNode.setNext(head);
            head = newNode;
        }
    }
    
    public E removeHead() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException(); 
        } else{
            E returnedData = head.getData();
            Node temp;
            temp = head;
            head = head.getNext();
            temp.setNext(null); //for garbage collection
            return returnedData;
        }
    }
    
    public void addTail(E data) {
        if(head == null) {
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
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public E getHead() throws NoSuchElementException {
        if (head.getData() == null) {
            throw new NoSuchElementException();
        } else {
            return head.getData();
        }
    }
    
    public int size() {
        int size = 0;
        if(head == null)
        {
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
