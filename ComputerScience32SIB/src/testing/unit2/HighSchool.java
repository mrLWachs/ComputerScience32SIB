/** Required package class namespace */
package testing.unit2;

 
/**
 * HighSchool.java - description
 *
 * @author Mr. Wachs
 * @since 12-May-2022, 10:11:25 AM
 */
public class HighSchool extends Student
{

    /**
     * Default constructor, set class properties
     */
    public HighSchool() {
        
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "HighSchool: " + super.toString();
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
    public HighSchool clone() {
        return this;
    }
    
}