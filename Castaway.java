
/**
 * Write a description of class Castaways here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Castaway implements Comparable
{
    // instance variables - replace the example below with your own
    private int score;
    private String gender;
    private String lastName;
    private String firstName;

    /**
     * Constructor for objects of class Castaways
     */
    public Castaway(int score, String lastName, String firstName, String gender)
    {
        this.score = score;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    @Override
    public int compareTo(Castaway other) {
        if (lastName.compareTo(other.lastName) != 0) {
            return lastName.compareTo(other.lastName);
        } else if (firstName.compareTo(other.firstName) != 0) {
            return firstName.compareTo(other.firstName); 
        } else {
            return 0;
        }
    }
    
    public boolean equals(Castaway other){
        return compareTo(other) == 0;
    }
    
    public String toString() {
        return lastName + ", " + firstName + ", " + gender + ", " + score;
    }
}
