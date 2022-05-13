/** Required package class namespace */
package testing.unit2;

 
/**
 * Meeting.java - represents a meeting of people
 *
 * @author Mr. Wachs
 * @since 12-May-2022, 10:44:07 AM
 */
public class Meeting 
{
    
    // These are global variables (CS20S), properties of this class (CS30S)
    // The word "count" it identifes a name for this variable/property
    // The modifier word "int" defines the data type (CS20S and CS30S)
    // The modifier word "private" encapsulates the property    
    private int count;
    
    // The modifier word "final" turns the "field" (property) into a constant
    private final int MAX;
    
    // Array (because of the square brackets) of class level objects, this
    // meeting "has a" (associated with) Person class (an array of person 
    // objects)
    private Person[] members;
    
    
    /**
     * Default constructor, set class properties
     */
    public Meeting() {
        MAX   = 500;
        count = 0;
        // Need to build (construct, instantiate) our array
        members = new Person[MAX];
        // However, although the array has its size now set up, all the index 
        // values (spots in the array) are filled with "nulls" (no Person 
        // objects/instances are yet in the array)
    }
    
    public void attend(Person person) {
        
    }
    
    public void hold() {
        
    }
    
}