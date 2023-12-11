
/**
 * Write a description of class MyHeapTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyHeapTest
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MyHeapTest
     */
    public MyHeapTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    public static void test(){
        MyHeap<Integer> heap = new MyHeap<Integer>();
        System.out.println(heap.size());
        System.out.println(heap.isEmpty());
        heap.add(2); // add when empty 
        System.out.println(heap + " size: " + heap.size());
        heap.add(5);
        System.out.println(heap + " size: " + heap.size());
        heap.add(10);
        System.out.println(heap + " size: " + heap.size());
        heap.add(1);
        System.out.println(heap + " size: " + heap.size());
        heap.add(3);
        System.out.println(heap + " size: " + heap.size());
        heap.add(4);
        System.out.println(heap + " size: " + heap.size());
        System.out.println(heap.removeMin());
        System.out.println(heap + " size: " + heap.size());
        
        
    }
    
    public static void randomTest(){
        MyHeap<Integer> heap = new MyHeap<Integer>();
        int[] array = new int[16];
        for (int i = 0; i < 16; i++){
            heap.add((int)(Math.random() * 100) + 1);
        }
        System.out.println(heap + " size: " + heap.size());
        for (int i = 0; i < 10; i++){
            int removedData = heap.removeMin();
            System.out.println(removedData);
            System.out.println(heap + " size: " + heap.size());
            array[i] = removedData;
        }
        for(int i = 0; i < array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
        
        for (int i = 0; i < 16; i++){
            heap.add((int)(Math.random() * 100) + 1);//need to make the size changeable
        }
        System.out.println(heap + " size: " + heap.size());
        for (int i = 0; i < 16; i++){
            System.out.println(heap.removeMin());
            System.out.println(heap + " size: " + heap.size());

        }
        
        
    }

}
