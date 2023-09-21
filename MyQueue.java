
/**
 * Write a description of class MyQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyQueue
{
    // instance variables - replace the example below with your own
    private int size = 0;
    private int front = 0;
    private int[] array; 
    /**
     * Constructor for objects of class MyQueue
     */
    public MyQueue()
    {
        array= new int[3];
    }
    public void enqueue(int element){
        if (!isFull()){
            array[(size + front) % array.length] = element;
            size++;
        }
    }
    public int dequeue(){
        if(!isEmpty()){
            front++;
            size--;
            return array[(front-1)% array.length];
        }
        return -1; 
    }
    public boolean isEmpty(){
        return size == front % array.length;
    }
    public int front(){
        return array[front % array.length]; 
    }
    public int size(){
        return size; 
    }
    public boolean isFull(){
        return size == array.length;
    }
    public String toString(){
        String toString = "";
        for(int i = front; i < front + size ; i++){
            toString += array[i % array.length] + ", ";
        }
        return toString; 
    }
    
    

    
}
