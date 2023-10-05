
/**
 * Write a description of class MyLinkedListTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyLinkedListTest
{
    // instance variables - replace the example below with your own

    public void myLinkedListTestInt() {
        MyLinkedList<Integer> test = new MyLinkedList<Integer>();
        System.out.println("does isEmpty return true when empty (true): " + test.isEmpty());
        //System.out.println("does program trhow an exception when we remove from an empty " 
        //                    + "linkedList: " + test.removeHead());
        // exception is properly thrown
        test.addHead(1);
        System.out.println(test);
        System.out.println("Size = 1: " + test.size());
        test.addHead(2);
        System.out.println(test);
        test.addTail(3);
        System.out.println("added tail of 3 should print 2, 1, 3: " + test);
        System.out.println("Size = 3: " + test.size());
        System.out.println("Check if empty when filled (false): " + test.isEmpty());
        System.out.println("Does size method work should return 3: " + test.size());
        System.out.println("does remove head work should return 2: " + test.removeHead());
        System.out.println(" should print out 1, 3: " + test);
    }
    
    public void myLinkListTestString() {
        MyLinkedList<String> test = new MyLinkedList<String>();
        System.out.println("does isEmpty return true when empty (true): " + test.isEmpty());
        //System.out.println("does program trhow an exception when we remove from an empty " 
        //                    + "linkedList: " + test.removeHead());
        // excpetion works
        test.addHead("1");
        System.out.println(test);
        test.addHead("2");
        System.out.println(test);
        test.addTail("3");
        System.out.println("added tail of 3 should print 2, 1, 3: " + test);
        System.out.println("Check if empty when filled (false): " + test.isEmpty());
        System.out.println("Does size method work should return 3: " + test.size());
        System.out.println("does remove head work should return 2: " + test.removeHead());
        System.out.println(" should print out 1, 3: " + test);
    }
}
