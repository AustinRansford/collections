import java.util.NoSuchElementException;

/**
 * 
 *
 * @author (Austin Ransford)
 * @version (12/4/2023)
 */
public class BinarySearchTree<E extends Comparable<E>>
{
    
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
    
    /**
     *  search for the binary tree to see if element exists
     *  
     *  @param element - element that is searched for
     *  @return the element if it exists in the tree or null if it doesn't
     */
    public E search(E element){ 
        if (root == null){
            return null;
        } else {
            return root.search(element);
        }
    }
    
    /**
     * get the minimum value of the binary search tree
     * 
     * @return the minimum value of the binary search tree
     */
    public E getMin(){
        if (isEmpty()){
            return null;
        } else{ 
            return root.getMin();
        }
    }
    
    /**
     * get the maximum value of the binary search tree
     * 
     * @return the maximum value of the binary search tree
     */
    public E getMax(){
        if (isEmpty()){
            return null;
        } else {
            return root.getMax();
        }
    }
    
    /**
     * remove the minmum value
     * @return the removed value from the tree.
     */
    public E removeMin(){
        E data = root.getMin();
        root.removeMin();
        return data;
    }
    
    /**
     * remove the maximum value
     * @return the removed value
     */
    public E removeMax(){
        E data = root.getMax();
        root.removeMax().getData();
        return data;
    }
    
    /**
     * check if the BST is empty 
     * @return true if empty otherwise false
     */
    public boolean isEmpty(){
        return size == 0;
    }
    
    /**
     * find the depth of the BST
     * @return the depth
     */
    public int getDepth(){
        if( root == null){
            return 0;
        } else {
            return root.getDepth();
        }
    }
    
    /**
     * prints the tree with links associated with the BST
     */
    public void printTree()
    {
        root.printTree(1);
    }
    
    /**
     * remove an element with the desired value
     * @param element - the desired value to be removed
     * @return null if element is not in BST return the element removed otherwise
     */
    public E remove(E element){
        if (search(element) == null) {
            return null;
        } else {
            root.remove(element);
            return element;
        }
    }
    
    /**
     * return the size of the BST or the total values stored in the BST
     * @return the size value
     */
    public int size() {
        return size; 
    }
    
    /**
     * prints the BST from least to greatest
     */
    public String toString(){
        return root.toString();
    }
}
