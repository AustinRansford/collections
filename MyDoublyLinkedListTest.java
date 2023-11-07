
/**
 * Write a description of class MyDoublyLinkedListTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyDoublyLinkedListTest
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MyDoublyLinkedListTest
     */
    public static void MyDoublyLinkedListTest()
    {
        MyDoublyLinkedList<Integer> test = new MyDoublyLinkedList<Integer>();
        test.add(1);
        System.out.println(test + " size: " + test.size());
        test.add(3);
        System.out.println(test + " size: " + test.size());
        test.add(0, 0);
        System.out.println(test + " size: " + test.size());
        test.add(1,2);
        System.out.println(test + " size: " + test.size());
        test.add(3,4);
        System.out.println(test + " size: " + test.size());
        test.addHead(-1);
        System.out.println(test + " size: " + test.size());
        test.addTail(5);
        System.out.println(test + " size: " + test.size());
        
        System.out.println("getter method testing:");
        try{
            test.get(7);
        } catch(Exception NoSuchElementException) {
            System.out.println("index too large error works");
        }
        System.out.println("print last index with get(index): " + (test.get(6).equals(5)));
        System.out.println("get(index 0) works: " + test);
        
        
        System.out.println("Test adds when list is empty");
        MyDoublyLinkedList<Integer> test2 = new MyDoublyLinkedList<Integer>();
        test2.add(0,1);
        System.out.println(test2 + " size: " + test2.size());
        MyDoublyLinkedList<Integer> test3 = new MyDoublyLinkedList<Integer>();
        test3.addHead(1);
        System.out.println(test3 + " size: " + test3.size());
        MyDoublyLinkedList<Integer> test4 = new MyDoublyLinkedList<Integer>();
        test4.addTail(1);
        System.out.println(test4 + " size: " + test4.size());
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean integerityTest(MyDoublyLinkedList list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            // need a get method of some sort or a 
        }
        return true;
    }
}
