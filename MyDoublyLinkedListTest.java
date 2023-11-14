
/**
 * Write a description of class MyLinkedListTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyDoublyLinkedListTest
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MyLinkedListTest
     */
    public static void MyLinkedListTest()
    {
        MyLinkedList<Integer> test = new MyLinkedList<Integer>();
        System.out.println("IntegerityTest: " + test.integerityTest());
        test.add(1); //empty
        System.out.println(test + " size: " + test.size());
        System.out.println("IntegerityTest: " + test.integerityTest());
        test.add(3);// not empty
        System.out.println(test + " size: " + test.size());
        System.out.println("IntegerityTest: " + test.integerityTest());
        test.add(0, 0); // head
        System.out.println(test + " size: " + test.size());
        System.out.println("IntegerityTest: " + test.integerityTest());
        test.add(2,2);//middle
        System.out.println(test + " size: " + test.size());
        System.out.println("IntegerityTest: " + test.integerityTest());
        test.add(4,4); // middle
        test.add(5,10); // tail
        System.out.println(test + " size: " + test.size());
        System.out.println("IntegerityTest: " + test.integerityTest());
        test.addHead(-1); // not empty
        System.out.println(test + " size: " + test.size());
        System.out.println("IntegerityTest: " + test.integerityTest());
        test.addTail(5); // not empty
        System.out.println(test + " size: " + test.size());
        System.out.println("IntegerityTest: " + test.integerityTest());
        
        
        System.out.println("getter method testing:");
        try{
            test.get(7);
        } catch(Exception NoSuchElementException) {
            System.out.println("index too large error works");
        }
        System.out.println("print last index with get(index): " + (test.get(test.size() - 1).equals(5)));
        System.out.println("get(index 0) works: " + (test.get(0).equals(-1)));
        
        
        System.out.println("Remove methods");
        System.out.println("remove at index 0: (-1)" + test.remove(0));
        System.out.println(test + " size: " + test.size());
        System.out.println("IntegerityTest: " + test.integerityTest());
        System.out.println("remove at tail: (5)" + test.remove(test.size()-1));
        System.out.println(test + " size: " + test.size());
        System.out.println("IntegerityTest: " + test.integerityTest());
        System.out.println("remove at index 2: (2)" + test.remove(2));
        System.out.println(test + " size: " + test.size());
        System.out.println("IntegerityTest: " + test.integerityTest());
        System.out.println("remove tail method (10)" + test.removeTail());
        System.out.println(test + " size: " + test.size());
        System.out.println("remove head method (0)" + test.removeHead());
        System.out.println(test + " size: " + test.size());
        System.out.println("remove at index 0: (1)" + test.remove(0));
        System.out.println(test + " size: " + test.size());
        System.out.println("remove at index 0: (3)" + test.remove(0));
        System.out.println(test + " size: " + test.size());
        System.out.println("remove at index 0: (4)" + test.remove(0));
        System.out.println(test + " size: " + test.size());
        
        System.out.println("Test adds when list is empty");
        MyLinkedList<Integer> test2 = new MyLinkedList<Integer>();
        test2.add(0,1); // empty
        System.out.println(test2 + " size: " + test2.size());
        MyLinkedList<Integer> test3 = new MyLinkedList<Integer>();
        test3.addHead(1); //empty
        System.out.println(test3 + " size: " + test3.size());
        MyLinkedList<Integer> test4 = new MyLinkedList<Integer>();
        test4.addTail(1); //empty
        System.out.println(test4 + " size: " + test4.size());
        MyLinkedList<Integer> test5 = new MyLinkedList<Integer>();
        test5.insertSorted(1); //empty
        System.out.println(test4 + " size: " + test4.size());
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public static void sortedTest(){
        MyLinkedList<Integer> test = new MyLinkedList<Integer>();
        test.add(1);
        test.add(2);
        test.add(4);
        System.out.println(test);
        test.insertSorted(3);
        System.out.println(test);
        test.insertSorted(2);
        System.out.println(test);
        test.insertSorted(0);
        System.out.println(test);
        test.insertSorted(5);
        System.out.println(test);
        
        
    }
    
    public static void testLL() {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.addHead(1);
        list.addHead(2);
        if (list.remove(1) == null) {
            System.out.println("Failed remove index, is null");
        }
        if (list.get(0) != 2) {
           System.out.println("Failed get " + list.get(1));
        }
        list.addHead(3);
        System.out.println(list + " size: " + list.size());
        list.add(1, 4);
        if (!list.toString().equals("3, 4, 2")) {
            System.out.println("Failed add with index " + list.toString());
            System.out.println(list.size());
        }
        list.add(0, 9);
        if (!list.toString().equals("9, 3, 4, 2")) {
            System.out.println("Failed add with index " + list.toString());
        }
        if (list.getHead() != 9) {
            System.out.println("Your add method does not set the head variable when inserting at index 0");
        }
        list.add(4, 10);
        list.addTail(5);
        if (!list.toString().equals("9, 3, 4, 2, 10, 5")) {
            System.out.println("Your add method does not set the tail variable when inserting at the index equal to the size of the list  " + list.toString());
        }
        list.remove(5);
        list.remove(4);
        
        
        if (list.remove(0) != 9) {
            System.out.println("Failed remove index " + list.toString());
        }
        if (!list.toString().equals("3, 4, 2")) {
            System.out.println("Failed remove index " + list.toString());
        }
        
        list.add(3, 9);
        if (!list.toString().equals("3, 4, 2, 9")) {
            System.out.println("Failed add with index " + list.toString());
        }
        list.remove(3);
        
        
        list.set(1, 9);
        if (!list.toString().equals("3, 9, 2")) {
            System.out.println("Failed set " + list.toString());
        }
        list.set(0, 9);
        if (!list.toString().equals("9, 9, 2")) {
            System.out.println("Failed set " + list.toString());
        }
        list.set(0, 3);
        list.set(2, 9);
        if (!list.toString().equals("3, 9, 9")) {
            System.out.println("Failed set " + list.toString());
        }
        list.set(2, 2);
        
        list.insertSorted(4);
        if (!list.toString().equals("3, 4, 9, 2")) {
            System.out.println("Failed insertSorted " + list.toString());
        }
        if (list.remove(new Integer(2)) == null) {
            System.out.println("Failed remove element, is null");
        }
        System.out.println(list);
        if (!list.toString().equals("3, 4, 9")) {
            System.out.println("Failed remove element " + list.toString());
        }
        MyLinkedList<Integer> listSorted = new MyLinkedList<Integer>();
        listSorted.insertSorted(6);
        listSorted.insertSorted(2);
        listSorted.insertSorted(8);
        listSorted.insertSorted(9);
        listSorted.insertSorted(67);
        listSorted.insertSorted(0);
        listSorted.insertSorted(-6);
        if (!listSorted.toString().equals("-6, 0, 2, 6, 8, 9, 67")) {
            System.out.println("Failed insertSorted " + listSorted.toString());
        }
    }
    
    public static void exceptionTester(){
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        try{
            list.removeHead();
        } catch(Exception NoSuchElementException) {
            System.out.println("removeHead throws error while empty");
        }
        try{
            list.removeTail();
        } catch(Exception NoSuchElementException) {
            System.out.println("removeTail throws error while empty");
        }
        try{
            list.getHead();
        } catch(Exception NoSuchElementException) {
            System.out.println("getHead throws error while empty");
        }
        try{
            list.getTail();
        } catch(Exception NoSuchElementException) {
            System.out.println("getTail throws error while empty");
        }
        list.add(3);
        try{
            list.get(7);
        } catch(Exception NoSuchElementException) {
            System.out.println("get at invalid index throws error");
        }
        try{
            list.get(-1);
        } catch(Exception NoSuchElementException) {
            System.out.println("set at negative index throws error ");
        }
        try{
            list.add(1,0);
        } catch(Exception NoSuchElementException) {
            System.out.println("add at invalid index works while empty");
        }
        System.out.println(list);
        try{
            list.add(-1, 0);
        } catch(Exception NoSuchElementException) {
            System.out.println("add throws error with negative index");
        }
        try{
            list.set(7, 8);
        } catch(Exception NoSuchElementException) {
            System.out.println("set at index too large throws error" );
        }
        try{
            list.set(-1, 8);
        } catch(Exception NoSuchElementException) {
            System.out.println("set at negative index  error works ");
        }
        try{
            list.remove(-1);
        } catch(Exception NoSuchElementException) {
            System.out.println("remove throws error at negative index");
        }
        try{
            list.removeHead();
        } catch(Exception NoSuchElementException) {
            System.out.println("removeHead throws error while empty");
        }
        try{
            list.removeTail();
        } catch(Exception NoSuchElementException) {
            System.out.println("removeTail throws error while empty");
        }
        try{
            list.getHead();
        } catch(Exception NoSuchElementException) {
            System.out.println("getHead throws error while empty");
        }
        try{
            list.remove(1);
        } catch(Exception NoSuchElementException) {
            System.out.println("getTail throws error when too large");
        }
        System.out.println(list);
        
        
        
        
        
        
        
    }
}
