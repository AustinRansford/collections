/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoubleNode<E>
{
    private E data;
    private DoubleNode<E> next;
    private DoubleNode<E> prev;

    /**
     * Constructor for objects of class Node
     */
    public DoubleNode(E data) {
        this.data = data;
    }

    /**
     * this is a getter method of the class variable data.
     *
     * @return    the data stored in the node. type E. 
     */
    public E getData() {
        return data;
    }
    
    /**
     * this is a getter method for the class variable next of type Node<E>
     * 
     * @return returns the  pointer to another node. "the next node"
     */
    public DoubleNode<E> getNext() {
        return next; 
    }
    
    /**
     * getter for the prev instance variable
     * 
     * @return  the node prev points to
     */
    public DoubleNode<E> getPrev() {
        return prev;
    }
    
    /** 
     * this is a setter method for the class variable data.
     * 
     * @param   data is the value that will be set to the the class 
     *          variable data.
     */
    public void setData(E data) {
        this.data = data; 
    }
    
    /**
     * this is a setter method for the class variable next.
     * 
     * @param   a Node<E> is passed in that will be the class variable next will
     *          be set to. 
     */
    public void setNext(DoubleNode<E> newNode) {
        next = newNode; 
    }
    
    /**
     * sets the prev instance variable to a pointer of another node
     * 
     * @param newNode the node that prev points to
     */
    public void setPrev(DoubleNode<E> newNode) {
        prev = newNode;
    }
}