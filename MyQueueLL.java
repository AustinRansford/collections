
/**
 * Creates an abstract data type of a queue, where elements are added to the queue at the 
 * end of the queue and elements are taken/removed from the begining
 *
 * @author Austin Ransford
 * @version 9-26-2023
 */
public class MyQueueLL<E>
{
    private MyLinkedList<E> queue;
    
    /**
     * Constructor for objects of class MyQueueLL
     */
    public MyQueueLL() {
        queue = new MyLinkedList<E>();
    }
    
    /**
     * adds an element to the queue 
     * 
     * @param element is the element added to the queue
     */
    public void enqueue(E element) {
        queue.addTail(element);
    }
    
    /**
     * removes the element in the front of the queue
     * 
     * @return  if the queue is full the method returns the value of the removed value,
     *          otherwise it throws an exception
     */
    public E dequeue() {
        return queue.removeHead(); 
    }
    
    /**
     *  Indicates whether queue contains any elements
     *  
     *  @return true if the queue is empty false if not
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    /**
     *  Reads the element at the front of the queue
     *  
     *  @return element at the front of the queue
     */
    public E front() {
        return queue.getHead();
    }
    
    /**
     * Returns the number of elements stored in the queue
     * 
     * @return the size of the queue
     */
    public int size() {
        return queue.size(); 
    }
    
    /**
     * Returns the contents of the queue from front to back 
     * 
     * @return the content of the queue
     */
    public String toString() {
        return queue.toString(); 
    }
}
