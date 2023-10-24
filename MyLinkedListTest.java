
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
    
    public void enhancementTesting(){
        MyLinkedList<Integer> test = new MyLinkedList<Integer>();
        test.add(1);
        test.add(5);
        test.add(10);
        System.out.println("Should print 1, 5, 10");
        System.out.println(test.size());
        System.out.println(test);
        test.add(1, 3);
        System.out.println("Should add 3 between 1 and 5 index(1)");
        System.out.println(test.size());
        System.out.println(test);
        test.add(4, 15);
        System.out.println("Should add to end index(4)");
        System.out.println(test.size());
        System.out.println(test);
        test.remove(2);
        System.out.println("Should remove 5 as it is the 2nd index");
        System.out.println(test.size());
        System.out.println(test);
        System.out.println("get the value at index 2 (10): " + test.get(2));
        System.out.println("remove the last int (index = 2, val = 10: " + test.remove(2));
        System.out.println(test);
        test.set(0, -1);
        System.out.println(test);
    }
}
