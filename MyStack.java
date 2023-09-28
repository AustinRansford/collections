import java.util.EmptyStackException;

/**
 * Creates an data structure that adds values to the top and then 
 * takes values from the top
 *
 * @author Austin Ransford
 * @version 9/26/2023
 */
public class MyStack<E>
{
    private int size = 0;
    private E[] stack;
    
    /**
     * Constructor for objects of MyStack collections
     */
    public MyStack(){
        stack =(E[]) new Object[3];
    }
    
    /**
     * pushes an element on to the stack 
     * 
     * @param element is the int value pushed onto the stack
     */
    public void push(E element){
        if(!isFull()){
            stack[size] = element;
            size++;
        }
    }
    
    /**
     * pops an element off of the stack 
     * 
     * @return the int value that is taken off of the stack 
     */
    public E pop() throws EmptyStackException {
        if (isEmpty()){
            throw new EmptyStackException();
        
        }else{
            stack[size] = null;
            size--;
            return stack[size];
        }
    }
    
    /**
     * Indicates whether stack contains any elements
     * 
     * @return returns true if stack is empty and false if stack is not
     */
    public boolean isEmpty(){
        return size == 0;
    }
    
    /**
     * reads the element at the top of the stack 
     * @return returns the element at the top of the stack
     */
    public E top(){
        return stack[size-1];
    }
    
    /**
     * indicates the length of the stack
     * @param returns the size of the stack 
     */
    public int size(){
        return size;
    }
    
    /**
     * returns true if the stack is full
     * @return true if full false otherwise
     */
    public boolean isFull(){
        return size == stack.length;
    }
    
    /**
     * returns the contents of the stack from top to bottom
     * @return returns each integer seperated by a space and a comma
     * in the stack from the top to the bottom 
     */
    public String toString(){
        String toString = "";
        for(int i = size-1; i >= 0; i--)
        {
            toString += stack[i] + ", ";
        }
        return toString;
    }
}

