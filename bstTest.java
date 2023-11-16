
/**
 * Write a description of class bstTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bstTest
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class bstTest
     */
    public bstTest()
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
    public static void bstTest(){
         BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
         bst.insert(5);
         bst.insert(2);
         bst.insert(1);
         bst.insert(3);
         bst.insert(7);
         bst.insert(8);
         bst.insert(6);
         System.out.println(bst.search(5));
         System.out.println(bst.search(1));
         System.out.println(bst.search(8));
         System.out.println(bst.search(100));
         System.out.println(bst.getMin());
         System.out.println(bst.getMax());
         System.out.println(bst);
    }
}
