
/**
 * Creates an abstract data type of a queue, where elements are added to the queue at the 
 * end of the queue and elements are taken/removed from the begining
 *
 * @author Austin Ransford
 * @version 9-26-2023
 */
public class MyQueue<E>
{
    // instance variables - replace the example below with your own
    private int size = 0;
    private int front = 0;
    private E[] queue; 
    /**
     * Constructor for objects of class MyQueue
     */
    public MyQueue()
    {
        queue =(E[]) new Object[3];
    }
    /**
     * adds an element to the queue 
     * 
     * @param element is the element added to the queue
     */
    public void enqueue(E element){
        if (!isFull()){
            queue[(size + front) % queue.length] = element;
            size++;
        }
    }
    /**
     * removes the element in the front of the queue
     * 
     * @return  if the queue is full the method returns the value of the removed value,
     *          otherwise it throws an exception
     */
    public E dequeue(){
        if(!isEmpty()){
            front++;
            size--;
            return queue[(front-1)% queue.length];
        }
        return queue[-1]; 
    }
    /**
     *  Indicates whether queue contains any elements
     *  
     *  @return true if the queue is empty false if not
     */
    public boolean isEmpty(){
        return size == front % queue.length;
    }
    /**
     *  Reads the element at the front of the queue
     *  
     *  @return element at the front of the queue
     */
    public E front(){
        return queue[front % queue.length]; 
    }
    /**
     * Returns the number of elements stored in the queue
     * 
     * @return the size of the queue
     */
    public int size(){
        return size; 
    }
    /**
     * Indicates whether the queue has exhausted its available storage
     * 
     * @return true if queue is full return false otherwise
     */
    public boolean isFull(){
        return size == queue.length;
    }
    /**
     * Returns the contents of the queue from front to back 
     * 
     * @return the content of the queue
     */
    public String toString(){
        String toString = "";
        for(int i = front; i < front + size ; i++){
            toString += queue[i % queue.length] + ", ";
        }
        return toString; 
    }
    
    

    
}
