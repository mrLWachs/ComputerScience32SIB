
/** Required package class namespace */
package testing;


import testing.unit2.Apple;
import testing.unit2.Athlete;
import testing.unit2.Box;
import testing.unit2.Doctor;
import testing.unit2.Executioner;
import testing.unit2.Food;
import testing.unit2.House;
import testing.unit2.Husky;
import testing.unit2.Meeting;
import testing.unit2.MrWachs;
import testing.unit2.Person;
import testing.unit2.Piper;
import testing.unit2.Steak;
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
        
        Object object1 = new Object();  // 1st instance of the Object class
        Object object2 = new Object();  // 2nd instance of the Object class
        Object object3 = object2;       // identifier name for same object
        
        // Built into the object class are a number of methods that all other
        // classes inherit. These include some that are not relevant in this 
        // unit, and others like the: toString() and equals() methods
        
        System.out.println("object1 as a string is " + object1.toString());
        System.out.println("object2 as a string is " + object2.toString());
        System.out.println("object3 as a string is " + object3.toString());
        
        // The toString() method of the object class outputs information
        // including the memory address (in hexadecimal code) where this object
        // is stored in this computer's memory
        
        // This method (toString) is inherited by ALL sub classes (children),
        // for example...
        
        System.out.println("Person  object as string is " + person.toString());
        System.out.println("Student object as string is " + student.toString());
        System.out.println("Teacher object as string is " + teacher.toString());
        
        // See the object class's inherited method (toString) on a class we 
        // don't write like the "String", "Integer", and "Double" class...
        
        String  stringObject  = new String("puppy");
        Integer integerObject = new Integer(7);
        Double  doubleObject  = new Double("3.14"); 
        
        // Primitive data types (like "int") also have a "class" version (or 
        // a "big daddy" version) - also know as the "wrapper" class 
        
        System.out.println("String  object = " + stringObject.toString());
        System.out.println("Integer object = " + integerObject.toString());
        System.out.println("Double  object = " + doubleObject.toString());
        
        // In the case of the String, Integer, and Double - those classes 
        // OVER-RIDE the toString method to create their own versions of those
        // methods - we can over-rode the toString method in our own classes
        
        if (object1.equals(object2)) System.out.println("O1==O2");
        if (object1.equals(object3)) System.out.println("O1==O3");
        if (object2.equals(object3)) System.out.println("O2==O3");
        
        // The "equals" method of the Object class just compares if two
        // objects are in the same memory address. But, like "toString" we 
        // can over-ride the equals() method and we will do this in the 
        // Person class...
        
        // Now we will create 3 identifier names, but only one memory location
        // for all three         
        Person person1 = new Person();  // Creating a "new" memory address
        Person person2 = person1;       // Same memory address as person1
        Person person3 = person2;       // Same memory address as person1 and 2
        
        System.out.println("P1 = " + person1.toString());
        System.out.println("P2 = " + person2.toString());
        System.out.println("P3 = " + person3.toString());
        
        if (person1.equals(person2)) System.out.println("P1==P2");
        if (person2.equals(person3)) System.out.println("P2==P3");
        if (person1.equals(person3)) System.out.println("P1==P3");
        
        // Then we will over-ride the toString() and equals() methods in the
        // person class so that we can check how that method is called over the 
        // object version of those methods. It is useful to alter a NetBeans
        // template so those methods are always over-ridden in every new class 
        // created (see the comment in "ComputerScience40S.java" to do this). 
        
        // Testing the clone() method:
        Person personClone = twitter.clone();
        
        System.out.println("Original is " + twitter.toString());
        System.out.println("Clone    is " + personClone.toString());
        
        if (personClone.equals(twitter)) System.out.println("Clone is ==");
        
        // Create instances of our other classes:        
        Doctor      doctor      = new Doctor();
        Executioner executioner = new Executioner();
        MrWachs     mrWachs     = new MrWachs();
        Husky       husky       = new Husky();
        Piper       piper       = new Piper();
        Athlete     athlete     = new Athlete();
        
        // And output those objects:
        // NOTE: when you send an object to the method System.out.println() as 
        // an argument, it expects a string, with objects it will automatically
        // call your toString() method 
        
        System.out.println(doctor);
        System.out.println(executioner);
        System.out.println(mrWachs);
        System.out.println(husky);
        System.out.println(piper);
        System.out.println(athlete);
        
        // Instantiate ("make an instance of") a meeting object (of that class)
        Meeting meeting = new Meeting();
        
        // With NetBeans, you can use CTRL+SPACEBAR autocomplete with the 
        // arguments of methods to see what arguements qualify
        meeting.attend(person);
        meeting.attend(person1);
        meeting.attend(person2);
        meeting.attend(person3);        
        meeting.attend(twitter);
        meeting.attend(student);
        meeting.attend(tom);
        meeting.attend(teacher);
        meeting.attend(personClone);
        meeting.attend(doctor);
        meeting.attend(executioner);
        meeting.attend(mrWachs);
        meeting.attend(piper);
        meeting.attend(husky);
        meeting.attend(athlete);
        // Have person objects (instances of the Person class) and all 
        // children objects (classes that inherit from Person) will attend
        // the meeting - through the concept of polymorphism 
        
        // Now we hold the meeting...
        meeting.hold();
        
        // Now we will call a static (shared) method from the objects 
        // (instances) of the Person class and the other classes that extend
        // ("is a") from Person and inherited this method
        
        person.endTheWorld();
        student.endTheWorld();
        teacher.endTheWorld();
        husky.endTheWorld();
        piper.endTheWorld();
        executioner.endTheWorld();
        doctor.endTheWorld();
        athlete.endTheWorld();
        
        // You can invoke (call) static methods from the name of the class 
        // itself, not just the instances (objects) of the class, for example
        
        Person.endTheWorld();
        Student.endTheWorld();
        Teacher.endTheWorld();
        Husky.endTheWorld();
        Piper.endTheWorld();
        Doctor.endTheWorld();
        Executioner.endTheWorld();
        Athlete.endTheWorld();
        
        // You have seen calling method like this before, for example in
        // JOptionPane.showMessageDialog(null, "");
        // Not doing this...
        // JOptionPane jop = new JOptionPane();
        // jop.showMessageDialog(null,"");
        
        // When we call static methods from the instances, the 
        // autocomplete/intellisense will not show it - but it does show it in
        // autocomplete/intellisense from the Class name
        
        // Instantiate an object from a child class of an abstract class
        // using the abstract methods (that were made 'concrete') in that class
        Apple apple = new Apple();
        Steak steak = new Steak();
        
        apple.smell(5);
        steak.smell(5);
        
        // Call the polymorphic method which accepts the abstract object (Food)
        // as an argument. since the abstract class cannot be instantiated,
        // only children objects from the abstract class can be arguments
        // (in other words, apple and steak instances)
        husky.consume(apple);
        mrWachs.consume(steak);
        
        // An Interface can be thought of "as a set of rules" - like a class
        // but only contains method signatures (like abstract methods - but
        // you don't have to use the word 'abstract' inside interfaces).
        // Interfaces cannot be instantiated (made into objects like
        // Sports sports = new Sports(); like abstract classes). Like an
        // abstract class, interfaces are used by 'child' like classes that
        // 'implement' the interface (these classes "follow the rules" of
        // the interface ("the set of rules"). 
        Athlete jock = new Athlete("Jake Paul",23);        
        // Set our opponent 
        jock.setOpponent("Logan Paul");        
        // Have our athlete compete in four rounds of athletics
        for (int round = 0; round < 4; round++) {            
            System.out.println("Round " + round + "...");            
            // Check to see if they can play
            if (jock.haveYouGotItSigned()) {
                // They can play...                
                // Play some hockey
                jock.score("Jake Paul");
                jock.score("Logan Paul");
                jock.score("Jake Paul");                
                // Play some football
                jock.score("Jake Paul",7);
                jock.score("Logan Paul",3);
                jock.score("Jake Paul",1);                
                // See the results...
                jock.endOfPeriod(round);
                jock.endOfQuarter(round);                
            }
            else {
                // Sign so they can play
                jock.sign();
            }            
        }
        // Check if we won
        if (jock.didIwin()) jock.consume(steak);
        
        // A generic is defined as a characteristic of or relating 
        // to a class or group of things that is not specific. In 
        // Java, we can use generic methods and generic classes
        
        // Let us start by creating simple ('primitive') data types
        boolean b = true;
        int     i = 0;
        double  d = 3.14;
        char    c = 'a';
                
        // A more advanced data type ("class" type) is
        // String (which was always 'complex' using the captial 'S'
        // to declare it) and its constructor method (usually not needed)..
        String string1 = new String("text");
        
        // Now use the primatives with a more complex data type (class)
        // called a 'wrapper' class from the primatives and use the 
        // constructor methods of those wrapper classes passing the 
        // primatives through the constructor methods
        Boolean   bool      = new Boolean(b);
        Integer   integer   = new Integer(i);
        Double    doub      = new Double(d);
        Character character = new Character(c);
        
        // Now call a generic method on the variety of different data types
        output(bool);
        output(integer);
        output(doub);
        output(character);
        output(string1);
        output(jock);
        
        // When using a class with a generic inside of it, and that
        // class is being instantiated (creating an object), then 
        // you define what type the generic is by using the angle 
        // brackets "< >" with the data type (which must be a 
        // 'class' type not a primitive) inside the brackets beside 
        // the class name on the left hand side of the equals sign. 
        // This is repeated on the right hand side of the equals 
        // sign as well (but you can leave these angle brackets 
        // empty - which is called the "diamond") before the round 
        // brackets of the constructor method.
        Box<Boolean>   box1 = new Box<>(bool);
        Box<Integer>   box2 = new Box<>(integer);
        Box<Double>    box3 = new Box<>(doub);
        Box<Character> box4 = new Box<>(character);
        Box<String>    box5 = new Box<>(string1);
        Box<Athlete>   box6 = new Box<>(jock);
        
        // Peek in all the boxes..  
        box1.peek();
        box2.peek();
        box3.peek();
        box4.peek();
        box5.peek();
        box6.peek();
        
        // Open all the boxes...
        Boolean   newBoolean   = box1.open();
        Integer   newInteger   = box2.open();
        Double    newDouble    = box3.open();
        Character newCharacter = box4.open();
        String    newString    = box5.open();
        Athlete   newAthlete   = box6.open();
        
        // Output all the newly returned data type objects...
        output(newBoolean);
        output(newInteger);
        output(newDouble);
        output(newCharacter);
        output(newString);
        output(newAthlete);
        
        // A generic class with multiple generic types, a generic method, the
        // enhanced for loop, restricted generics 
        House<Teacher, Meeting> house = new House<>();
        
        // Associate the objects that match with the generics
        house.homeOwner = mrWachs;
        house.contents  = meeting;
        
        // Create as array of Food objects
        Food[] fridge = { apple, steak };
        
        // Test our generic method
        house.party(fridge);        
        
        System.out.println("\nAdvanced Classes complete!\n");
    }

    /**
     * Outputs a generic item with information about the data type.
     * Generic methods use 'generic' references rather than specific
     * references. You do not define the data type (the parameter) 
     * when the method is created. Instead of defining the data
     * type, a set of angle brackets "< >" is used with a single
     * letter (usually capital "T") inside which acts as a 
     * 'placeholder' for the data type which will be defined in
     * the argument when the method is later called
     * 
     * @param <T> the generic type used
     * @param item the item to output
     */
    private static <T> void output(T item) {
        String text = "Class ";
        text += item.getClass().getSimpleName();
        text += " as a sting is " + item.toString();        
        System.out.println(text);
    }

}