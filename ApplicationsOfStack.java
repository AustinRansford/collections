
/**
 * Write a description of class ApplicationsOfStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ApplicationsOfStack<E>
{
    private MyStackLL<E> stack;

    /**
     * Constructor for objects of class ApplicationsOfStack
     */
    public ApplicationsOfStack() {
        stack = new MyStackLL<E>();
    }

    public boolean expressions(String text) {
        String openChars = "{([";
        String closedChars = " })]";
        MyStackLL stack = new MyStackLL();
        for(int i = 0; i < text.length(); i++) {
            if (openChars.indexOf(text.substring(i, i + 1)) != -1) {
                stack.push(text.substring(i,i+1)); 
            } else if (closedChars.indexOf(text.substring(i, i + 1)) != -1) {
                int index = closedChars.indexOf(text.substring(i, i + 1));
                // the index of endChars and openChars will have matching values  if the expressions
                // are the same. ie ( index = 0 and ) index = 0 so taking the substring of the
                // other at that index reveals if the expressions are equal and oppisite
                System.out.println(stack);
                if (stack.isEmpty()) {
                    return false;
                } else if (index == openChars.indexOf(stack.top())) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        System.out.println(stack.size());
        if (stack.size() == 0){
            return true; 
        } else {
            return false;
        }
    }
    
    public void expressionsTest() {
        String workingExpression = " for(h){    helllo } x[] = ;";
        String failedExpression = " For ( } ()){";
        System.out.println(expressions(workingExpression));
        System.out.println(expressions(failedExpression));
            
    }
}
