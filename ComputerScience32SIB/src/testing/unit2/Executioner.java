/** Required package class namespace */
package testing.unit2;

 
/**
 * Executioner.java - represents a executioner person
 *
 * @author Mr. Wachs
 * @since 12-May-2022, 10:11:49 AM
 */
public class Executioner extends Person
{

    /**
     * Default constructor, set class properties
     */
    public Executioner() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Executioner: " + super.toString();
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Executioner clone() {
        return this;
    }
    
}