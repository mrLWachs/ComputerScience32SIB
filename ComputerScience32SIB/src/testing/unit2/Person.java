
/** Required package class namespace */
package testing.unit2;

 
/**
 * Person.java - represents a person. This is a class with properties (things 
 * about the class, adjectives, descriptors) and methods (things the class 
 * can do, verbs, actions). Classes can be created (instantiated) into 
 * objects (which are instances of that class).
 *
 * @author Mr. Wachs
 * @since 4-Apr-2022, 10:46:30 AM
 */
public class Person 
{
    
    // Properties: (things about it, adjectives, descriptors).............
    
    // Reminder...
    // Properties are essentially "variables" or more specifically "global
    // variables" for this class - they can be simple variables, or even 
    // arrays (or even other classes)
    
    String name;
    int age;
    boolean alive;
    String gender;
    
    
    // Methods: (things it can do, verbs, actions)........................ 
    
    // Reminder...
    // Methods need a name, (possibly) input(s), and (possibly) an output
    // The formal structure of writing a method is: output name(inputs) { }
    // But, if it has no output (use the word "void") if it has no input(s) or
    // parameters, leave the round brackets empty "()"
    
    
    void born() {
        alive  = true;
        age    = 0;
        name   = "Jane Doe";
        gender = "female";
    }
    
    /**
     * The person dies 
     */
    void die() {
        alive = false;
    }
    
    /**
     * Method to simulate this person "talking" out information about the object
     * it outputs data on this person to the screen
     */
    void talk() {
        if (alive) {
            System.out.println(name + " is " + age + " identifies " + gender);
        }
        else {
            System.out.println("Boooo!!!");
        }
    }
    
    /**
     * A person has a birthday (the age goes up by one)
     */
    void birthday() {
        age++;
    }
       
}