/** Required package class namespace */
package computerscience32sib;

 
/**
 * LearnGraphics.java - a class object (instance) to launch a constructor to
 * learn about graphics and graphical user interfaces (GUI) by instantiating
 * other objects
 *
 * @author Mr. Wachs
 * @since 30-May-2022, 10:41:40 AM
 */
public class LearnGraphics 
{

    /**
     * Constructor method for when an object of this class is instantiated
     */
    public LearnGraphics() {
        System.out.println("Start learning graphics...");
        // Create class objects for different examples
        Graphics1 graphics1 = new Graphics1();
        Graphics2 graphics2 = new Graphics2();
        
        System.out.println("Learning graphics complete!");
    }
     
}