
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
            BinarySearchTreeNode<E> currentNode = root;
            while(currentNode.getLeft() != null){
                currentNode = currentNode.getLeft();
            }
            return currentNode.getData();
        }
    }
    
    public E getMax(){
        if (isEmpty()){
            return null;
        } else {
            BinarySearchTreeNode<E> currentNode = root;
            while(currentNode.getRight() != null){
                currentNode = currentNode.getRight();
            }
            return currentNode.getData();
        }
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int size() {
        return size; 
    }
    
    public String toString(){
        
    }
}
