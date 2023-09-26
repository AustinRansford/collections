
/**
 * Write a description of class MyQueueTest here.
 *
 * @author Austin Ransford
 * @version 9-26-2023
 */
public class MyQueueTest
{


    /**
     * Constructor for objects of class MyQueueTest
     */
    public MyQueueTest()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void myQueueIntegerTest(){
        MyQueue<Integer> test = new MyQueue<Integer>();
        System.out.println("isEmpty is true when empty: " + test.isEmpty());
        // System.out.println("dequeue should return -1 when queue is empty (-1): "
        //                        + test.dequeue());
        // sucessfully attempted to throw an exception 
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        System.out.println("enqueue works at basic level (1, 2, 3): " + test);
        System.out.println("size returns (3): " + test.size());
        System.out.println("front takes the first index of the queue (1): "
                                + test.front());
        System.out.println("dequeue removes the front value (1): " + test.dequeue());
        System.out.println("dequeue works at basic level (2,3): " + test);
        test.enqueue(4);
        System.out.println("enqueue restarts at index 0 once array is filled (2,3,4): "
                                + test);
        System.out.println("size returns the correct size (3): " + test.size());
        System.out.println("isFull is true when full: " + test.isFull());
        test.enqueue(5);
        System.out.println("when full no values can be added"
                                + " (value 5 shouldn't appear in the queue) " + test);
    }
    
    public void myQueueStringTest(){
        MyQueue<String> test = new MyQueue<String>();
        
        test.enqueue("a");
        test.enqueue("b");
        System.out.println(test);
        System.out.println("should print ( a, b,) : " + test);
        test.enqueue("c");
        test.enqueue("d");
        System.out.println("should print (a,b,c) d should not appear: " + test);
        System.out.println("should print and remove a: " + test.dequeue());
        System.out.println(test);
        
    }
}
