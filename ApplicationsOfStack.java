
/**
 * Write a description of class ApplicationsOfStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ApplicationsOfStack
{
    //private MyStackLL<String> stack;

    /**
     * Constructor for objects of class ApplicationsOfStack
     */
    public ApplicationsOfStack() {
        //stack = new MyStackLL<String>();
    }

    public boolean expressions(String text) {
        String openChars = "{([";
        String closedChars = "})]";
        MyStackLL<String> stack = new MyStackLL<String>();
        
        for(int i = 0; i < text.length(); i++) {
            String currentChar = text.substring(i,i+1);
            
            if (openChars.indexOf(currentChar) != -1) { // if the char = {, (, or [ push that val on stack
                stack.push(text.substring(i,i+1)); 
            } else if (closedChars.indexOf(currentChar) != -1) { // if char = }, ), ] pop the corresposing val off
                int index = closedChars.indexOf(currentChar);
                
                // the index of endChars and openChars will have matching values  if the expressions
                // are the same. ie ( index = 0 and ) index = 0 so taking the substring of the
                // other at that index reveals if the expressions are equal and oppisite
                
                if (stack.isEmpty()) { //meaning no open char is in stack and there cant be matches
                    return false;
                } else if (index != openChars.indexOf(stack.top())) { //if the stack's isnt opisite of the open char -> false
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        
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
    
    public void reverseStack(MyQueueLL<String> queue) { 
        System.out.println(queue);
        MyStackLL<String> stack = new MyStackLL<String>();
        
        while (!queue.isEmpty()) {
            stack.push(queue.dequeue());
        }
        
        MyQueueLL<String> reversedQueue = new MyQueueLL<String>();
        
        while (!stack.isEmpty()) {
            reversedQueue.enqueue(stack.pop()); 
        }
        
        System.out.println(reversedQueue);
    }

    public void reverseStackTest() {
        MyQueueLL<String> queue = new MyQueueLL<String>();
        queue.enqueue("Hey");
        queue.enqueue("Man");
        queue.enqueue("what's");
        queue.enqueue("up");
        reverseStack(queue);
    }
}
