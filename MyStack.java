
/**
 * Write a description of class collections here.
 *
 * @author Austin Ransford
 * @version 9/19/2023
 */
public class MyStack
{
    // instance variables - replace the example below with your own
    private int size = 0;
    private int[] array;
    /**
     * Constructor for objects of MyStack collections
     */
    public MyStack(){
        array = new int[3];
    }
    /**
     * pushes an element on to the stack 
     * 
     * @param element is the int value pushed onto the stack
     */
    public void push(int element){
        array[size] = element;
        size++;
        // next class check if full first 
    }
    /**
     * pops an element off of the stack 
     * 
     * @return the int value that is taken off of the stack 
     */
    public int pop(){
        size--;
        return array[size-1];
        // next class check if empty or not 
    }
    /**
     * Indicates whether stack contains any elements
     * 
     * @return returns true if stack is empty and false if stack is not
     */
    public boolean isEmpty(){
        return size==0;
    }
    /**
     * reads the element at the top of the stack 
     * @return returns the element at the top of the stack
     */
    public int top(){
        return array[size];
    }
    /**
     * indicates the length of the stack
     * @param returns the size of the stack 
     */
    public int size(){
        return size;
    }
    public boolean isFull(){
        return size==array.length;
    }
    /**
     * returns the contents of the stack from top to bottom
     * @return returns each integer seperated by a space and a comma
     * in the stack from the top to the bottom 
     */
    public String toString(){
        String toString = "";
        for(int i = size-1; i > 0; i--)
        {
            toString += array[i] + ", ";
        }
        return toString;
    }
}

