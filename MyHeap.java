import java.util.Arrays;
/**
 * This creates a min heap representation in an array
 *
 * @author (Austin Ransford)
 * @version (December 19, 2023)
 */
public class MyHeap<E extends Comparable<E>>
{
    // instance variables - replace the example below with your own
    private E[] heapArray;
    private int lastNodeIndex;
    

    /**
     * Constructor for objects of class MyHeap
     */
    public MyHeap(){
        lastNodeIndex = -1;
        heapArray = (E[]) new Comparable[1];
    }

    /**
     * gives the size of the heap
     * @return the size of the heap as an int value
     */
    public int size(){
        return lastNodeIndex + 1;
    }
    
    /**
     *  checks is the heap is empty
     *  
     *  @return true if empty false otherwise
     */
    public boolean isEmpty(){
        return size() == 0;
    }
    
    /**
     * adds an element to the heap 
     * @param element added to the heap
     */
    public void add(E element){
        if (isEmpty()){
            heapArray[0] = element;
            lastNodeIndex = 0; 
        } else {
            if(lastNodeIndex + 1 == heapArray.length){
                heapArray = Arrays.copyOf(heapArray, heapArray.length * 2);
            }
            heapArray[lastNodeIndex + 1] = element;
            lastNodeIndex++;
            int currentIndex = lastNodeIndex;
            while(currentIndex != 0 && 
                    heapArray[currentIndex].compareTo(heapArray[(currentIndex - 1) / 2]) < 0) {
                heapArray[currentIndex] = heapArray[(currentIndex - 1) /2];
                heapArray[(currentIndex - 1) / 2] = element;
                currentIndex = (currentIndex - 1) / 2;
            }
        }
    }
    
    /**
     * removes the minimum of the  heap. Or removes from the root or first index of the heap
     * @returns the value removed
     */
    public E removeMin(){
        if (isEmpty()){
            return null;
        } else {
             E removedData = heapArray[0];
             heapArray[0] = heapArray[lastNodeIndex];
             heapArray[lastNodeIndex] = null;
             lastNodeIndex--;
             
             int currentIndex = 0;
             while( (currentIndex * 2 + 1 < size() 
                     && heapArray[currentIndex].compareTo(heapArray[currentIndex *2 +1]) > 0) 
                     || (currentIndex * 2 + 2 < size() 
                     && heapArray[currentIndex].compareTo(heapArray[currentIndex *2 +2]) > 0)){
                 if( currentIndex *2 + 2 >= size() 
                     || heapArray[currentIndex *2 + 1].compareTo(heapArray[currentIndex * 2 +2]) < 0){
                     E temp = heapArray[currentIndex];
                     heapArray[currentIndex] = heapArray[currentIndex * 2 + 1];
                     heapArray[currentIndex * 2 + 1] = temp; 
                     currentIndex = currentIndex * 2 + 1; 
                 } else {
                     E temp = heapArray[currentIndex];
                     heapArray[currentIndex] = heapArray[currentIndex * 2 + 2];
                     heapArray[currentIndex * 2 + 2] = temp; 
                     currentIndex = currentIndex * 2 + 2;
                 }
             }
             return removedData; 
        }
    }
    
    /**
     * conversts the heap into a string to be printed
     * @returns a string representation of the array 
     */
    public String toString(){
        String newString = "";
        for (int i = 0; i < size(); i++){
            newString += heapArray[i] + ", ";
        }
        return newString;
    }
}
