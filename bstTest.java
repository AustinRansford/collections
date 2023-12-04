
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
         bst.printTree();
         System.out.println(" Depth: " + bst.getDepth());
         bst.insert(2);
         bst.printTree();
         System.out.println(" Depth: " + bst.getDepth());
         bst.insert(1);
         bst.insert(3);
         bst.insert(7);
         bst.insert(8);
         bst.insert(6);
         bst.printTree();
         System.out.println(" Depth: " + bst.getDepth());
         System.out.println(bst.search(5));
         System.out.println(bst.search(1));
         System.out.println(bst.search(8));
         System.out.println(bst.search(100));
         System.out.println(bst.getMin());
         System.out.println(bst.getMax());
         System.out.println(bst);
         bst.remove(5);
         bst.printTree();
         System.out.println(" Depth: " + bst.getDepth());
         System.out.println(bst.removeMin());
         bst.printTree();
         System.out.println(bst.removeMax());
         bst.printTree();
         bst.remove(6);
         bst.printTree();
         
    }
    public static void testBST() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
        System.out.println(bst.getDepth());
        bst.insert(5);
        System.out.println(bst.getDepth());
        System.out.println(bst.size());
        for (int i = 0; i < 10; i++) {
            bst.insert(i);
        }
        bst.printTree();
        System.out.println(bst.getDepth());
        bst.remove(3);
        System.out.println("Divider");
        bst.printTree();
        System.out.println(bst.toString());
    }
}
