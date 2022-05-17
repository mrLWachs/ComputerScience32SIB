/** Required package class namespace */
package testing.unit2;

 
/**
 * Apple.java - description
 *
 * @author Mr. Wachs
 * @since 17-May-2022, 10:46:00 AM
 */
public class Apple extends Food
{

    /**
     * Default constructor, set class properties
     */
    public Apple() {
        super(4);                   // Call super-constructor, passing the group
        super.flavour = "Sweet";    // Modifying our protected property
    }

    /**
     * Prepares food to be eaten
     */
    @Override
    public void prepare() {
        System.out.println("Wash it first");
    }

    /**
     * Determines if this 'apple' item has spoiled
     * 
     * @return the food has spoiled (true) or not (false)
     */
    @Override
    public boolean hasSpoiled() {
        return super.eatable;       // Access public property
    }

    /**
     * Smell the 'apple' item
     * 
     * @param seconds how many seconds to smell it
     */
    @Override
    public void smell(int seconds) {
        if (seconds > 3) super.eatable = false;
        else             super.eatable = true;
    }
    
    /**
     * How to eat this apple object 
     * 
     * @return The output of how eating this 'steak' item went
     */
    @Override
    public String eat() {
        return "Apple from " + super.eat();
    }
    
}