
/** Required package class namespace */
package testing.unit2;

 
/**
 * Student.java - represents a student, reminder that "extends" causes
 * inheritance (or "is a") meaning this class gets all the properties and
 * methods of it's parent (super) class. The line below is called the 
 * "signature" line for this class. If we add the "modifier" word "extends" 
 * it causes inheritance and then the class it inherits from is typed next. 
 * This is a "is a" relationship, so a "Student is a Person", and this class  
 * inherits all properties and methods from the "parent" (super) class. The 
 * line below is called the "signature" line for this class. If we add the 
 * "modifier" word "extends" it causes inheritance and then the class it 
 * inherits from is typed next. This is a "is a" relationship, so a 
 * "Student is a Person", and this class inherits all properties and methods 
 * from the "parent" (super) class.
 *
 * @author Mr. Wachs
 * @since 4-Apr-2022, 10:47:30 AM
 */
public class Student extends Person
{
    
    // The keyword "extends" is how Java initiates inheritance (or "is a")
    // and the Student class inherits all "public" properties and methods
    // from the "Person" class ("private" properties and methods are inherited,
    // but they are still private or encapsulated)

    /**
     * Represents a book object (this object "has a" relationship (association)
     * or "usage" (or "composition") with the student class
     */
    public Book book;

    // "number" is the name, "int" is the data type, "private" is a modifier
    // to make this "property" encapsulated - so this property or this 
    // "global variable"

    private int number;
    private double gpa;
    
    
    /**
     * If a constructor has NO parameters it is called the "default" 
     * constructor 
     * 
     * Default constructor method for the class, sets the class properties 
     * (including the properties it inherited form the super or parent class)
     */
    public Student() {
        super();            // invoking (calling) the "super-constructor"
        
        // Set the class properties (of this child/sub class of the Person 
        // class which is the super/parent class)
        number = 0;
        gpa    = 0.0;
        book   = null;
    }
    
    /**
     * Overloaded constructor method (means two or more methods with the same 
     * method name, but different parameters)
     * 
     * NOTE: in Java, if you create a class and do NOT write any constructors
     * (like our "Book" class) then the IDE (NetBeans) will write a default
     * constructor for you when the code compiles (you do not see it). However,
     * if you write either a default or a constructor with parameters - then
     * the IDE will NOT write any default constructor
     * 
     * @param name for this student
     * @param age for this student
     * @param gender for this student 
     */
    public Student(String name, int age, String gender) {
        super(name, age, gender);   // call the second super-constructor
        number = 1;
        gpa    = 0.0;
        book   = null;
    }
    
    /**
     * Method just for this class, raises the average 
     */
    public void study() {
        gpa *= 1.10;                            // Increase average by 10%
    }
    
    /**
     * Method just for this class, lowers the student's average
     */
    public void slackOff() {
        gpa = gpa - 0.05;                       // Decrease average by 5%
    }
    
    /**
     * Method just for this class, is intense repetitive studying
     */
    public void cram() {
        for (int i = 0; i < 5; i++) {               // Study 5 times as hard
            study();
        }
    }
    
}