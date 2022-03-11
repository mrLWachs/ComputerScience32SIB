
/** Required package class namespace */
package tools;

 
/**
 * Calculator.java - useful collection of methods for doing calculations.
 *
 * @author Mr. Wachs
 * @since 28-Feb-2022, 10:44:27 AM
 */
public class Calculator 
{

    /**
     * Calculates the factorial on a number using a recursive method. Recursive
     * methods need at least one base case (to stop the recursion), but can 
     * have more than one. They also need to have at minimum one recursive 
     * case (but also can have multiple recursive cases). Recursive cases 
     * means the method calls itself!
     * 
     * @param number the number to calculate the factorial of
     * @return the factorial of the parameter
     */
    public static long factorial(int number) {
        // Base case(s) - stop recursion (like a loop)
        if (number <= 1) return 1;
        // Recursive case(s) - method calls itself
        return number * factorial(number - 1);
    }
    
    /**
     * Calculates the power of a base to it's exponent
     * 
     * @param base the base of the power
     * @param exponent the exponent of the power
     * @return the base^exponent
     */
    public static double power(int base, int exponent) {
        // Base case(s) - stop recursion (like a loop)
        if (exponent == 0) return 1;
        if (exponent == 1) return base;
        // Recursive case(s) - method calls itself
        if (exponent < 0) {
            // For negative exponents
            if (base > 0) {
                return 1 / power(base, exponent * -1);
            }
            else {
                // When base is zero, cannot divide by zero
                return Double.MIN_VALUE;
            }
        }
        return base * power(base, exponent-1);
    }
    
}