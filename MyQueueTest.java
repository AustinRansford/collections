
/**
 * Write a description of class MyQueueTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyQueueTest
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MyQueueTest
     */
    public MyQueueTest()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void myQueueTest(){
        MyQueue test = new MyQueue();
        System.out.println("isEmpty is true when empty: " + test.isEmpty());
        System.out.println("dequeue should return -1 when queue is empty (-1): "
                                + test.dequeue());
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
}
