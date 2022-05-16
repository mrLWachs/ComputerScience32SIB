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
    
    /**
     * Have a person attend the meeting
     * 
     * @param person the person object to attend
     */
    public void attend(Person person) {
        // Assign (put, place) the person object (instance of the Person class)
        // passed into this method's paramter into the first empty (unassigned)
        // index (spot, element, location, subscript)
        members[count] = person;
        
        // Now advance the count
        count++;
        
        // Potential out of bounds ("range") error with count, we fix with
        if (count >= MAX) count = 0;     
        
        // Potentially we could make the array bigger (resize, re-dimension) 
        // however, whenever you do this it wipes out (recreates, re-dimensions)
        // all array content. So let's just reassign the count
    }
    
    /**
     * Hold the meeting for all members 
     */
    public void hold() {
        // Make a variable to hold a bunch of potential output data
        String message = "Meeting is about to begin...\n\n";
        message += "Watch your language, there are ";
        
        // A static variable, since it is "shared" amoungst all 
        // instances of the Student class (all student objects) it can
        // also be accessed form the class itself...
        message += Student.total;
        
        message += " students in the room!";
        
        // For comparison, a regular "for" loop would be code like this:
        // for (int i = 0; i < members.length; i++) {
        //     Person member = members[i];
        //     member.talk();
        // }
        
        // Now we loop through the entire array ("traverse" means to travel to 
        // or visit every spot) from start (index zero) to the finish (index of 
        // the length minus one) - using a NEW type of loop (a new "for" loop)
        // called the "enhanced for loop". To create the enhanced for loop 
        // use the shortcut: type "for" then CTRL + SPACE and pick the fourth 
        // option that appears from the top, or type "fore" and TAB 
        for (Person member : members) {
            // The enhanced for loop should be read as...
            // "for every member in members"
            
            // Only going to count people (Person objects) that "exist"
            // (that are not a "null")
            if (member != null) {
                message += "\nAttended by a ";
                
                // The "instanceof" operator takes an object (instance) on the
                // left hand side (LHS) and the class type on the right hand
                // side (RHS) and it is true if the object 'comes from' that
                // class (is a instance of that class type)
                if (member instanceof Person)      message += "Person ";
                if (member instanceof Student)     message += "Student ";
                if (member instanceof Teacher)     message += "Teacher ";
                if (member instanceof Doctor)      message += "Doctor ";
                if (member instanceof Executioner) message += "Executioner ";
                if (member instanceof Husky)       message += "Husky ";
                if (member instanceof Piper)       message += "Piper ";
                if (member instanceof Athlete)     message += "Athlete ";
            }            
        }
        // finally output the message
        message += "\nMeeting adjured!";
        System.out.println(message);
    }
    
}