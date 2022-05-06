
/** Required package class namespace */
package testing;

import testing.unit2.Person;
import testing.unit2.Student;
import testing.unit2.Teacher;

 
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
        
        // Instantiate another student object using our second constructor 
        // option
        
        Student tom = new Student("Johnny Depp", 24, "he/him");
        tom.talk();
        tom.study();
        tom.talk();          // This is a call to an over-ride method
        tom.slackOff();
        tom.talk();
        tom.cram();
        tom.talk();
        tom.die();
        tom.talk();
        
        // Instatiate / construct / create / declare a teacher object / 
        // instance / variable and associate it with some student objects
        Teacher teacher = new Teacher("Curt Conners");
        teacher.talk();
        teacher.add(student);
        teacher.add(tom);
        teacher.teach();
        
        // Check the student object to see if the "teach()" method had an effect
        student.talk();
        tom.talk();
        
        // The "Object" class....
        // Is built into Java (notice all classes start with a capital)
        // The parent (or "super class") of ALL classes (includes classes 
        // already created like "String" or "JOptionPane" and classes we
        // create like "Person" or "Book") - means we will be inheriting 
        // the properties and methods of the Object class
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nAdvanced Classes complete!\n");
    }
    
}