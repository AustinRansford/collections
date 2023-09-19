
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
        array= new int[10];
    }
    public void enqueue(int element){
        array[(size + front) % array.length] = element;
        size++;
    }
    public int dequeue(){
        front++;
        size--;
        return array[(front-1)%array.length];
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
        for(int i = front % array.length; i < front % array.length + size -1;
                i++){
            toString += array[i] + ", ";
        }
        return toString; 
    }
    
    

    
}
