
/**
 * Write a description of class MyStackTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyStackTest
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MyStackTest
     */
    public MyStackTest()
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
    public void stackTest(){
        MyStack test = new MyStack();
        System.out.println("isEmpty is true when empty: " + test.isEmpty());
        test.push(3);
        System.out.println("print when stack has one value 3: " + test);
        System.out.println("isEmpty is false when not empty: " 
                                + test.isEmpty());
        System.out.println("value popped off (3):" + test.pop());
        System.out.println("pop returns -1 when stack is empty: " + test.pop());
        System.out.println("isEmpty is true when empty: " + test.isEmpty());
        test.push(1);
        test.push(2);
        test.push(5);
        System.out.println("isFull is true when full: " + test.isFull());
        System.out.println(test);
        test.push(4);
        System.out.println("nothing is pushed when stack is full." +
                                " ie 4 should not appear in the stack");
        System.out.println(test);
        System.out.println("size equals length (3): " + test.size());
        System.out.println("top equals the most recent term (5): " + test.top());
        System.out.println(test);
        
        
        
        
    }
}
