import java.util.EmptyStackException;

/**
 * Creates an data structure that adds values to the top and then 
 * takes values from the top
 *
 * @author Austin Ransford
 * @version 9/26/2023
 */
public class MyStackLL<E extends Comparable<E>>
{
    private MyLinkedList<E> stack;
    
    /**
     * Constructor for objects of MyStackLL collections
     */
    public MyStackLL() {
        stack = new MyLinkedList<E>();
    }
    
    /**
     * pushes an element on to the stack 
     * 
     * @param element is the int value pushed onto the stack
     */
    public void push(E element) {
        stack.addHead(element);
    }
    
    /**
     * pops an element off of the stack 
     * 
     * @return the value that is taken off of the stack 
     */
    public E pop() {
        return stack.removeHead();
    }
    
    /**
     * Indicates whether stack contains any elements
     * 
     * @return returns true if stack is empty and false if stack is not
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    /**
     * reads the element at the top of the stack 
     * 
     * @return returns the element at the top of the stack
     */
    public E top() {
        return stack.getHead();
    }
    
    /**
     * indicates the length of the stack
     * 
     * @param returns the size of the stack 
     */
    public int size() {
        return stack.size();
    }
    
    /**
     * returns the contents of the stack from top to bottom
     * 
     * @return returns each integer seperated by a space and a comma
     * in the stack from the top to the bottom 
     */
    public String toString() {
        return stack.toString();
    }
}

