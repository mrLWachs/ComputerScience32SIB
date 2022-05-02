
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
    
    public String name;
    public int age;
    public boolean alive;
    public String gender;
    
    
    // Methods: (things it can do, verbs, actions)........................ 
    
    // Reminder...
    // Methods need a name, (possibly) input(s), and (possibly) an output
    // The formal structure of writing a method is: output name(inputs) { }
    // But, if it has no output (use the word "void") if it has no input(s) or
    // parameters, leave the round brackets empty "()"
    
    /**
     * Class constructor method, sets the class properties when the class is
     * instantiated into an object - in other words, when a person object is
     * "built" it calls this method to build it. Constructor methods with no 
     * parameters are called "default" constructors. Constructor methods are 
     * special methods that have (1) the same name as the class, (2) that name
     * starts with a capital letter, (3) it has NO return type (not even the 
     * word "void"). These methods are called when the class is used to build 
     * (construct, instantiate) an object. Constructor methods should always
     * be public
     */
    public Person() {
        alive  = true;
        age    = 0;
        name   = "Jane Doe";
        gender = "female";
    }
    
    /**
     * The person dies 
     */
    public void die() {
        alive = false;
    }
    
    /**
     * Method to simulate this person "talking" out information about the object
     * it outputs data on this person to the screen
     */
    public void talk() {
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
    public void birthday() {
        age++;
    }
       
}