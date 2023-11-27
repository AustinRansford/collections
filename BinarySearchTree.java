import java.util.NoSuchElementException;

/**
 * Write a description of class BinarySearchTree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinarySearchTree<E extends Comparable<E>>
{
    // instance variables - replace the example below with your own
    private BinarySearchTreeNode<E> root;
    private int size;

    /**
     * Constructor for objects of class BinarySearchTree
     */
    public BinarySearchTree()
    {
        root = null;
        size = 0;
    }

    /**
     * inserts a value into the Binary Search Tree.
     *
     * @param - element the element inserted into the tree.
     */
    public void insert(E element)
    {
        if (root == null){
            root = new BinarySearchTreeNode<E>(element);
            size++;
        } else{
            root.insert(element);
            size++;
        }
    }
    
    public E search(E element){ 
        if (root == null){
            return null;
        } else {
            return root.search(element);
        }
    }
    
    public E getMin(){
        if (isEmpty()){
            return null;
        } else{ 
            return root.getMin();
        }
    }
    
    public E getMax(){
        if (isEmpty()){
            return null;
        } else {
            return root.getMax();
        }
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    
    public E remove(E element){
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return root.remove(element).getData();
        }
    }
    
    public int size() {
        return size; 
    }
    
    public String toString(){
        return root.toString();
    }
}
