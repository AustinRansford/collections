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
        MyLinkedList sortedList = new MyLinkedList<Castaway>();

        String[] lastName = {"","Grumby","Howell", "Howell","Grant","Hinkley", "Summers"};
        String[] firstName = {"Gilligan", "Jonas", "Thurston", "Lovey", "Ginger", "Roy", "Mary Ann"};
        int[] score = {72, 85, 82, 96, 90, 96, 88};
        String[] gender = {"M", "M", "M", "F", "F", "M", "F"};
        for (int i = 0; i < lastName.length; i++) {
            Castaway person = new Castaway(lastName[i], firstName[i], score[i], gender[i]);
            sortedList.insertSorted(person);
        }
        System.out.println(sortedList);
        
    }
}
