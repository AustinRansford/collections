
/**
 * Write a description of class MyHeap here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        heapArray = (E[]) new Comparable[16];
    }

    /**
     * gives the size of the heap
     *
     * 
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
    
    public void add(E element){
        if (isEmpty()){
            heapArray[0] = element;
            lastNodeIndex = 0; 
        } else {
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
    
    public E remove(){
        if (isEmpty()){
            return null;
        } else {
             E removedData = heapArray[0];
             heapArray[0] = heapArray[lastNodeIndex];
             heapArray[lastNodeIndex] = null;
             lastNodeIndex--;
             
             int currentIndex = 0;
             while(currentIndex * 2 + 2 < size() && 
             (heapArray[currentIndex].compareTo(heapArray[currentIndex *2 +1]) > 0 
             || (heapArray[currentIndex].compareTo(heapArray[currentIndex *2 +2])) > 0)){
                 if(heapArray[currentIndex *2 + 1].compareTo(heapArray[currentIndex * 2 +2]) < 0){
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
    
    public String toString(){
        String newString = "";
        for (int i = 0; i < size(); i++){
            newString += heapArray[i] + ", ";
        }
        return newString;
    }
}
