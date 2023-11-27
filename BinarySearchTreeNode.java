import java.util.NoSuchElementException;

/**
 * Write a description of class BinarySeachTreeNode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinarySearchTreeNode<E extends Comparable<E>>
{
    // instance variables - replace the example below with your own
    private BinarySearchTreeNode<E> right;
    private BinarySearchTreeNode<E> left;
    private E data;

    /**
     * Constructor for objects of class BinarySeachTreeNode
     */
    public BinarySearchTreeNode(E data)
    {
        right = null;
        left = null;
        this.data = data;
    }

    public void setRight(BinarySearchTreeNode<E> right) {
        this.right = right; 
    }
    
    public BinarySearchTreeNode<E> getRight(){
        return right;
    }
    
    public void setLeft(BinarySearchTreeNode<E> left) {
        this.left = left; 
    }
    
    public BinarySearchTreeNode<E> getLeft(){
        return left;
    }
    
    public E getData() {
        return data;
    }
    
    public void setData(E data){
        this.data = data;
    }
    
    //tested!!
    public void insert(E element){
        if(element.compareTo(data) >= 0) {
            if (right == null) {
                right = new BinarySearchTreeNode<E>(element);
                return;
            } else {
                right.insert(element);
            }
        } else{
            if (left == null) {
                left = new BinarySearchTreeNode<E>(element);
                return;
            } else {
                left.insert(element);
            }
        }
    }
    
    public E search(E element){
        if(element.compareTo(data) > 0) {
            if (right == null) {
                return null;
            } else {
                return right.search(element);
            }
        } else if (element.compareTo(data) < 0){
            if (left == null) {
                return null;
            } else {
                return left.search(element);
            }
        } else {
            return element; 
        }
    }
    
    public E getMin() {
        if (left == null){
            return data;
        } else {
            return left.getMin();
        }
    }
    
    public E getMax() {
        if (right == null) {
            return data;
        } else {
            return right.getMax();
        }
    }
    
    public E remove(E element) {
        
        if (element.compareTo(data) > 0){
            return right.remove(element);
        } else if (element.compareTo(data) < 0){
            return left.remove(element);
        } else {
            if (left == null && right == null){
                throw new NoSuchElementException();
            } else if (left == null && right != null){
                data = right.getData();
                BinarySearchTreeNode<E> temp = right;
                right = temp.getRight();
                left = temp.getLeft();
            } else if (left != null && right == null){
                data = left.getData();
                BinarySearchTreeNode<E> temp = left;
                right = temp.getRight();
                left = temp.getLeft();
            } else {
                data = right.getMin();
                BinarySearchTreeNode<E> predecessorLink = right.getMinPredecessor();
                predecessorLink.setLeft(null); 
            }
            return data;
        }
    }
    
    public BinarySearchTreeNode<E> getMinPredecessor() {
        if (left.getLeft() == null){
            return this;
        } else {
            return left.getMinPredecessor();
        }
    }
    
    public int getDepth(int currentDepth){
        if (left != null){
            return getDepth(currentDepth + 1);
        } else if (right != null){
            return getDepth(currentDepth + 1);
        } else {
            return currentDepth; 
        }
    }
    
    public String toString() {
        String newString = "";
        if (left != null){
            newString += left.toString() + ", ";
        } 
        newString += data;
        if (right != null) {
            newString += ", " + right.toString();
        } 
        return newString;
        
    }
    
    
}
