
/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node<E>
{
    // instance variables - replace the example below with your own
    private E data;
    private Node<E> next;

    /**
     * Constructor for objects of class Node
     */
    public Node(E data) {
        this.data = data;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public E getData() {
        return data;
    }
    
    public Node<E> getNext() {
        return next; 
    }
    
    public void setData(E data) {
        this.data = data; 
    }
    
    public void setNext(Node<E> newNode) {
        next = newNode; 
    }
}
