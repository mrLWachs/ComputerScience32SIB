
/** Required package class namespace */
package testing;

import tools.Calculator;

 
/**
 * RecursionTest.java - tests the concepts learned in this unit. Recursion is 
 * the process of something recurring, and is defined as a method that calls 
 * itself. Recursive methods may have 1 or more than 1 base cases, and 1 or 
 * more than 1 recursive cases, but the method must have a minimum of 1 base 
 * case and 1 recursive case. Recursion is a programming tool that can often 
 * be used as an alternative to looping, or as a simpler way to solve 
 * specific problems. Recursion is not always the most efficient solution as 
 * it often consumes more memory than an iterative solution. Often recursion 
 * is ‘hidden’ by using a public method call that then calls a private 
 * recursive method to implement the recursion that eventually returns to the 
 * original method that then returns the result (this is known as a “wrapper” 
 * method).
 *
 * @author Mr. Wachs
 * @since 28-Feb-2022, 10:44:14 AM
 */
public class RecursionTest 
{
    
    /**
     * Constructor method (when a constructor method has no parameters - it is
     * called the "default" constructor)
     */
    public RecursionTest() {
        System.out.println("Recursion test started...");
        
        // Testing is something that can be studied in more detail and is more
        // advanced as you study more Computer Science or work in the industry
        // Testing can follow a "paradigm" (or specific set of procedures)
        // called "Unit Testing" - this can be expanded on even into specific
        // programming languages (for example "JUnit")
        
        // When testing, think of three scenarios:
            // (1) Typical case(s) - "typical" user
            // (2) Edge case(s)    - Go to the "edges"
            // (3) Beyond case(s)  - Go "beyond" the edges for "bad/smart" users        
        
        System.out.println("Recursive factorial..............................");
        
        // Set up constants to set the "edges"
        final int MIN_FACTORIAL = 1;
        final int MAX_FACTORIAL = 5;
        
        // Travel ("traverse") through all the edge cases
        for (int i = MIN_FACTORIAL; i <= MAX_FACTORIAL; i++) {
            int number = i;
            int answer = Calculator.factorial(number);
            System.out.println("Number " + number + " is factorial " + answer);
        }
        
        
        
            
        System.out.println("Recursion test complete!");
    }   
    
}