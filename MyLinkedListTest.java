import java.util.NoSuchElementException;

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
        System.out.println("removed 3 at index 1: " + test.remove("3"));
        System.out.println(test);
    }
    
    public void enhancementTesting(){
        MyLinkedList<Integer> test = new MyLinkedList<Integer>();
        test.add(1);
        test.add(5);
        test.add(10);
        System.out.println("Should print 1, 5, 10");
        System.out.println("Size: " + test.size());
        System.out.println(test);
        test.add(1, 3);
        System.out.println("Should add 3 between 1 and 5 index(1)");
        System.out.println("Size: " + test.size());
        System.out.println(test);
        test.add(4, 15);
        System.out.println("Should add to end index(4)");
        System.out.println("Size: " + test.size());
        System.out.println(test);
        test.remove(2);
        System.out.println("Should remove 5 as it is the 2nd index");
        System.out.println("Size: " + test.size());
        System.out.println(test);
        System.out.println("get the value at index 2 (10): " + test.get(2));
        System.out.println("remove the last int (index = 2, val = 10: " + test.remove(2));
        System.out.println(test);
        System.out.println("Set the first val to -1");
        test.set(0, -1);
        System.out.println(test);
        
    }
    public void sortedTest(){
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
        Integer five = new Integer(4);
        test.remove(five);
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
        list.add(1, 4);
        if (!list.toString().equals("3, 4, 2")) {
            System.out.println("Failed add with index " + list.toString());
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
    public static void testPrint(){
        MyLinkedList test = new MyLinkedList<String>();
        System.out.println(test);
    }
}
