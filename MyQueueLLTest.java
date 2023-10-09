
/**
 * Write a description of class MyQueueLLTest here.
 *
 * @author Austin Ransford
 * @version 9-26-2023
 */
public class MyQueueLLTest
{
    public void myQueueIntegerTest(){
        MyQueueLL<Integer> test = new MyQueueLL<Integer>();
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
        System.out.println("size returns the correct size (2): " + test.size());
        test.enqueue(5);
    }
    
    public void myQueueStringTest(){
        MyQueueLL<String> test = new MyQueueLL<String>();
        
        test.enqueue("a");
        test.enqueue("b");
        System.out.println(test);
        System.out.println("should print ( a, b,) : " + test);
        test.enqueue("c");
        test.enqueue("d");
        System.out.println("should print (a,b,c,d): " + test);
        System.out.println("size 4: " + test.size());
        System.out.println("should print and remove a: " + test.dequeue());
        System.out.println(test);
        
    }
}
