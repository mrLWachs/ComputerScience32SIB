
/** Required package class namespace */
package testing;

import testing.unit2.Person;
import testing.unit2.Student;

 
/**
 * AdvancedClassesTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since 4-Apr-2022, 10:39:54 AM
 */
public class AdvancedClassesTest 
{
    
    /**
     * Default constructor method, it sets class properties.
     * 
     * Special Methods that have the same name as the class (including a
     * capital at the start of the name) and NO return type (not even "void")
     * are called "constructor" methods these methods are called when the class
     * is created (or constructed), it makes an object from the class, or it
     * instantiates the class (creates an "instance")
     */
    public AdvancedClassesTest() {
        System.out.println("\nStarting Advanced Classes...\n");
        
        // Using the class (Person capital "P") to create an object ("person" 
        // lowercase "p") with the default constructor:
        // class object = call constructor method (default); 
        Person person = new Person();                   // A person object
        
        // Class object = new Class() <--- implies a method?
        
        // Now call (invoke) a method within the object
        person.talk();                                  // Calls class method 
        
        // Construct another person object (instance) using our second
        // overloaded constructor method
        
        Person twitter = new Person("Elon Musk", 50, "he/him");
        
        // Use (call/invoke) other methods and change (modify) properties
        twitter.talk();
        twitter.birthday();
        twitter.talk();
        twitter.gender = "they";
        twitter.talk();
        twitter.die();
        twitter.talk();
        
        // twitter.age = 16;   // Cannot do this, property is locked (private)
        // The property cannot be accessed (encapsulated)
        
        // Instantiate (create) a Student object and call it's methods 
        // (including the ones it inherited from the Person class) 
        Student student = new Student();
        
        // Call (invoke) any inherited methods, or change any inhertited 
        // properties from the Person class
        student.talk();
        student.name = "Peter Parker";
        student.gender = "he/him";
        student.birthday();
        student.talk();
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nAdvanced Classes complete!\n");
    }
    
}