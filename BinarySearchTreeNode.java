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
    
    
    
    public BinarySearchTreeNode<E> remove(E element) {
        if (element.compareTo(data) > 0){
            right = right.remove(element);
            return this;
        } else if (element.compareTo(data) < 0){
            left = left.remove(element);
            return this;
        } else { // match
            if (left == null && right == null){
                return null;
            } else if (left == null && right != null){
                return right;
            } else if (left != null && right == null){
                return left;
            } else {
                data = right.getMin();
                right = right.removeMin();
                return this;
            }
        }
    }
    
    public BinarySearchTreeNode<E> removeMin(){
        if (left != null){
            left = left.removeMin();
            return this;
        } else {
            if (right != null){
                return right;
            } else {
                return null; 
            }
        }
    }
    
    public int getDepth(){
        int leftDepth = 0;
        int rightDepth = 0;
        
        if (left != null){
            leftDepth = left.getDepth();
        }
        if (right != null){
            rightDepth = right.getDepth();
        } 
        if (leftDepth > rightDepth)
        {
            return leftDepth + 1;
        } else {
            return rightDepth + 1;
        }
    }
    
     /**     * Prints elements as stored in the tree
     *
     * @param maxElementWidth The maximum space allowed for the string form
     *                        of the element.
     */
    public void printTree(int maxElementWidth) {
        int maxSize = (int) Math.pow(2, (getDepth() + 1));
        String[] elements = new String[maxSize];

        // Build array of elements
        printTree(elements, 0, maxElementWidth);

        // Print element properly spaced
        int fullWidth = (int) Math.pow(2, getDepth()) * (maxElementWidth + 1);
        for (int i = 0; i < getDepth() + 1; i++) {
            String connectionsLevel = "";
            String elementsLevel = "";

            for (int j = (int) Math.pow(2, i) - 1; j < (int) Math.pow(2, i + 1) - 1; j++) {

                // Process arrows for this level
                String arrow = "  ";
                int elementLength = arrow.length();
                if (elements[j] != null) {
                    if (j % 2 == 1) { // Odd is left child
                        arrow = " /";
                    } else { // Even is right child
                        arrow = "\\ ";
                    }
                }

                // Center within maxElementWidth
                String leftPadStr = ""; // Default
                String rightPadStr = ""; // Default
                int leftPadNum = (fullWidth / (int) Math.pow(2, i) - elementLength) / 2;
                int rightPadNum = fullWidth / (int) Math.pow(2, i) - elementLength - leftPadNum;
                if (leftPadNum > 0) {
                    leftPadStr = String.format("%" + leftPadNum + "s", " ");
                }
                if (rightPadNum > 0) {
                    rightPadStr = String.format("%" + rightPadNum + "s", " ");
                }
                connectionsLevel += leftPadStr + arrow + rightPadStr;

                // Process elements for this level
                elementLength = 0;
                if (elements[j] != null) {
                    elementLength = elements[j].toString().length();
                }

                // Center within maxElementWidth
                leftPadStr = ""; // Default
                rightPadStr = ""; // Default
                leftPadNum = (fullWidth / (int) Math.pow(2, i) - elementLength) / 2;
                rightPadNum = fullWidth / (int) Math.pow(2, i) - elementLength - leftPadNum;
                if (leftPadNum > 0) {
                    leftPadStr = String.format("%" + leftPadNum + "s", " ");
                }
                if (rightPadNum > 0) {
                    rightPadStr = String.format("%" + rightPadNum + "s", " ");
                }

                if (elements[j] != null) {
                    elementsLevel += leftPadStr + elements[j] + rightPadStr;
                } else {
                    elementsLevel += leftPadStr + rightPadStr;
                }
            }

            if (i > 0) { // Do not print arrows for root
                System.out.println(connectionsLevel);
            }
            System.out.println(elementsLevel);
        }
    }

    // build array of element strings
    private void printTree(String[] elements, int nodeNum, int maxElementWidth) {
        elements[nodeNum] = data.toString();
        if (elements[nodeNum].length() > maxElementWidth) {
            elements[nodeNum] = elements[nodeNum].substring(0, maxElementWidth);
        }
        if (left != null) {
            left.printTree(elements, (nodeNum + 1) * 2 - 1, maxElementWidth);
        }
        if (right != null) {
            right.printTree(elements, (nodeNum + 1) * 2, maxElementWidth);
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
