
/**
 * Write a description of class ApplicationsOfStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ApplicationsOfStack<E>
{
    // instance variables - replace the example below with your own
    private MyStackLL<E> stack;

    /**
     * Constructor for objects of class ApplicationsOfStack
     */
    public ApplicationsOfStack() {
        // initialise instance variables
        stack = new MyStackLL<E>();
    }

    public boolean expressions(String text) {
        String openChars = "{([";
        for(int i = 0; i < text.length(); i++)
        {
            if (openChars.indexOf(text.substring(i, i + 1)) != -1) {
                
            }
        }
    }
}
