import java.util.NoSuchElementException;

/**
 * Write a description of class CastawayTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CastawayTest
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CastawayTest
     */
    public CastawayTest()
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
    public static void castawayTest() {
        MyLinkedList initialList = new MyLinkedList<Castaway>();
        MyLinkedList lastNames = new MyLinkedList<String>();
        MyLinkedList sortedList = new MyLinkedList<Castaway>();
        Castaway gilligan = new Castaway("", "Gilligan", 72, "M");
        Castaway grumby = new Castaway("Grumby", "Jonas", 85, "M");
        Castaway howellT = new Castaway("Howell", "Thurson", 82, "M");
        Castaway howellL = new Castaway("Howell", "Lovey", 96, "F");
        Castaway grant = new Castaway("Grant", "Ginger", 90, "F");
        Castaway hinkley = new Castaway("Hinkely", "Roy", 96, "M");
        Castaway summers = new Castaway("Summers", "Mary Ann", 88, "F");
        initialList.add(gilligan);
        initialList.add(grumby);
        initialList.add(howellT);
        initialList.add(howellL);
        initialList.add(grant);
        initialList.add(hinkley);
        initialList.add(summers);
        
        lastNames.insertSorted(gilligan.getLastName());
        lastNames.insertSorted(grumby.getLastName());
        lastNames.insertSorted(howellT.getLastName());
        lastNames.insertSorted(howellL.getLastName());
        lastNames.insertSorted(grant.getLastName());
        lastNames.insertSorted(hinkley.getLastName());
        lastNames.insertSorted(summers.getLastName());
        System.out.println(lastNames);
        //how can I adjust for same last name 
        while(lastNames.size()!= 0) {
            int currentSize = lastNames.size();
            for(int j = 0; j < initialList.size(); j++) {
                if (lastNames.get(0).compareTo(initialList.get(j).getLastName()) == 0){
                    sortedList.add(initialList.get(j));
                    initialList.remove(j);
                    lastNames.remove(0);
                    break;
                }
            }
            if (currentSize == lastNames.size()){
                throw new NoSuchElementException(); //nothing was removed in a pass
            }
        }
        //this will sort by last name then I just need to check 
        //if any last names are the same then swap accordingly
        for (int i = 0; i < sortedList.size() - 1; i++) {
            if (sortedList.get(i).getLastName().equals(sortedList.get(i+1).getLastName())) {
                if (sortedList.get(i).getFirstName().compareTo(sortedList.get(i+1).getFirstName()) == -1) { 
                    Castaway temp= sortedList.get(i);
                    sortedList.set(i, sortedList.get(i + 1));
                    sortedList.set(i+1, temp);
                }
            }
        }
    }
}
