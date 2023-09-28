
/**
 * Write a description of class MyLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyLinkedList
{
    // instance variables - replace the example below with your own
    private Node head; 

    /**
     * Constructor for objects of class MyLinkedList
     */
    public MyLinkedList(){
        head = null;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addHead(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else{
            newNode.setNext(head);
            head = newNode;
        }
    }
    
    public void addTail(int data){
        if(head == null){
            addHead(data);
        } else{
            Node newNode = new Node(data);
            Node currentNode = head;
            while(head.getNext() != null)
            {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
    }
    public String toString(){
        String toString = "";
        Node currentNode = head;
        while (currentNode != null){
            toString += currentNode.getData() + ", ";
            currentNode = currentNode.getNext();
        }
        return toString;
    }
}
