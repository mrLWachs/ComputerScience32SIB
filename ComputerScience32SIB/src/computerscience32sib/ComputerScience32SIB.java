
/**
 * Required package class namespace - the line below is put in automatically,
 * and connects this file to the project
 */
package computerscience32sib;

/**
 * Required imports for the project - the lines below are added when your code
 * needs to connect to another library (API) of code
 */
import javax.swing.JOptionPane;
import testing.Tester;

/** 
 * ComputerScience32SIB.java - the large in class example we continue to work on
 * in each unit adding example code on the new concepts of each unit along with
 * any in class requests for code example that might come up over the course.
 *
 * @author Mr. Wachs 
 * @since Feb. 9, 2022, 8:01:03 a.m.
*/
public class ComputerScience32SIB {        // Curly brackets DO NOT remove

    /**
     * Don't worry about this for now - we will examine what this means in
     * unit 2 (methods)
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Added a small choice option to allow the user to run different 
        // units for this example....
        final String[] OPTIONS = {
            "CS30S Unit 1: Learn Introduction To Java",
            "CS30S Unit 2: Learn Methods",
            "CS30S Unit 3: Learn Arrrays",
            "CS30S Unit 4: Learn Classes",
            "CS30S Unit 5: Learn Graphics (optional unit)",
            "CS40S: Learn all Computer Science 40S units",
        };
        Object choice = JOptionPane.showInputDialog(
                null, 
                "Select which unit to run the example for (or click cancel)", 
                "Computer Science 32SIB Examples",
                JOptionPane.PLAIN_MESSAGE,
                null, 
                OPTIONS, 
                OPTIONS[0]
        );            
        if (choice == null) {
            System.exit(0);
        }
        // FOR CS30S content ONLY...........................................
        else if (choice.toString().equals(OPTIONS[0])) {
            learnIntroToJava();
            // The line above is a "call" to the method named 
            // "learnIntroToJava" meaning the code stops at that line and 
            // "jumps" (or branches) to themethod written below. Then runs 
            // all the code inside that method (the code in the 'block' of 
            // the method between two { } ) then comes back to the next line 
            // after the "call" (execute, run, etc.)

            // In NetBeans, you can write the call to a method before you 
            // write the method - then NetBeans will suggest (with a 
            // 'lightbulb') that it writes the method for you
        }
        else if (choice.toString().equals(OPTIONS[1])) {
            learnMethods();
        }
        else if (choice.toString().equals(OPTIONS[2])) {
            learnArrays();
        }
        else if (choice.toString().equals(OPTIONS[3])) {
            learnClasses();
        }
        else if (choice.toString().equals(OPTIONS[4])) {
            // For CS30S AND CS40S Students: 
            LearnGraphics learnGraphics = new LearnGraphics();
        }
        // FOR CS40S content ONLY...........................................
        else if (choice.toString().equals(OPTIONS[5])) {
            Tester tester = new Tester();
            // This line creates a tester object (instantiates an instance  
            // of a tester class object) and it calls the constructor 
            // method - you can comment out the rest of the code in the 
            // main method
        }
    }

    /**
     * Learn the content of the introduction unit
     */
    private static void learnIntroToJava() {
        // TODO code application logic here
        
        ///////////////////////////////////////////////////////////////////////
        // (1) COMMENTS:
        ///////////////////////////////////////////////////////////////////////
                
        // This is a commment, all typing after "//" forward slashes until the  
        // line ends is a comment
        
        // Comments are not code, so you can write what you want
        
        /*         
            This is for multiple line comments, as it covers as many lines as
            you want starting with "slash star" until it see the closing 
            "star slash"  
        */
        
        ///////////////////////////////////////////////////////////////////////
        // (2) BASIC OUTPUTS:
        ///////////////////////////////////////////////////////////////////////
        
        System.out.print("Hello World"); // Comments can also be on code lines
        
        // Use the same line as above with the letters "ln" ("LN" in lower) as
        // this will add a "line break" at the end
        
        System.out.println("I'm in the world");
        
        // If you type "sout" and hit "TAB" (no spaces) it will automatically
        // type the next line...
        
        System.out.println("Good-bye world!");
        
        // Additional output tips... (these are "special" characters")   
        
        System.out.println("Make a quotation mark \" ");
        System.out.println("Make a slash  \\ ");
        System.out.println("Make a \t tab");
        System.out.println("Make a \n new line");
        
        // These special ("escape sequences") start with "\" and then things
        // like "n" for a new line, etc. These may not be needed in this course
        
        ///////////////////////////////////////////////////////////////////////
        // (3) DIALOG OUTPUTS AND INPUTS:
        ///////////////////////////////////////////////////////////////////////
                
        // Make a "fancier" output with a dialog box...
        
        // Use the keyboard shortcut "CTRL + SPACE" to bring up autocomplete
        // at any point to help type all the code (including the correct upper 
        // and lower case letters) as well as doing an "import" line of code
        // at the top of the project automatically to "bring in" a library 
        // of code for you to make the dialog box in this next line...
        
        JOptionPane.showMessageDialog(null, "Hello");
        
        // The above line of code is the ONLY one needed for assignments, final 
        // projects, etc. to make outputs - however, these next lines are  
        // OPTIONS (not needed, but cool) for other types of dialog output 
        // message boxes as seen below...
        
        // Make more dialog outut boxes, with some variations (these are NOT
        // required for assignments in this course) - you ARE able to use them
        // (note: code can span multiple lines until it reaches 
        //  the semi colon ";")
        
        JOptionPane.showMessageDialog(
                null, 
                "Information icon is i", 
                "Information Title", 
                JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null, 
                "Question icon is ?", 
                "Question Title", 
                JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null, 
                "Warning icon is !", 
                "Warning Title", 
                JOptionPane.WARNING_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null, 
                "Plain no icon", 
                "Plain Title", 
                JOptionPane.PLAIN_MESSAGE
        );
        
        // Dialogs for inputs...

        // The simpliest verison is the one you need to know
        
        JOptionPane.showInputDialog("Enter something");
        
        // There is a little more to using this that we cover 
        // after learning variables...
        
        // Some optional input dialogs below:
                                
        JOptionPane.showInputDialog(
                null, 
                "Input Information icon is i", 
                "Input Information Title", 
                JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Input Question icon is i", 
                "Input Question Title", 
                JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Input Warning icon is i", 
                "Input Warning Title", 
                JOptionPane.WARNING_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Input Plain icon is i", 
                "Input Plain Title", 
                JOptionPane.PLAIN_MESSAGE
        );
        
        // More different (and optional) dialogs...
        
        JOptionPane.showConfirmDialog(null,"Confirm");

        JOptionPane.showConfirmDialog(
                null,
                "Confirm Example 2",
                "Information",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE
        );

        JOptionPane.showConfirmDialog(
                null,
                "Confirm Example 3",
                "Question",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        JOptionPane.showConfirmDialog(
                null,
                "Confirm Example 4",
                "Warning",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        JOptionPane.showConfirmDialog(
                null,
                "Confirm Example 5",
                "Plain",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );
        
        ///////////////////////////////////////////////////////////////////////
        // (4) VARIABLES:
        ///////////////////////////////////////////////////////////////////////
        
        // A variable is a piece of code that tells the computer to store (or 
        // "remember") information (or "data")
        
        // This is an example of the simpliest variable type
        
        boolean a = true;
        
        // type name = value ;
        
        // When you write a line of code to create (declare) a variable
        
        int b = 0;
        
        double c = 0.0;
        
        // "Variables" can change ("vary")
        
        a = false;
        b = 1;
        c = 1.2;
        
        // Most of the time, we create variables for:
        // (1) Getting user input (then store it in that variable)
        // (2) Formulas
        
        // Variables always go on the left hand side (LHS) of the equals
        // sign (=) and the value going into the variable always goes on
        // the right hand side (RHS)
        
        // Output the variables...
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        char d = 'A';
        
        // The "char" is short for "character" holds (remembers) ONE character
        
        System.out.println("d = " + d);
        
        // The boolean, integer (int), double, character (char) are all simple
        // (primitive) data types, now a complex data type...
        
        String e = "apple";
        
        System.out.println("e = " + e);
        
        // Variable data types we can use:
        // (1) boolean - just true and false (different from "bool" in C#)
        // (2) int     - the integer, a whole number
        // (3) double  - can have decimals
        // (4) char    - character hold one character
        // (5) String  - holds a bunch of characters (uses capital "S")
        
        // Manipulate (use) our variables...
        
        int x = 10;
        
        System.out.println("x = " + x);
                
        x = 20;
        
        System.out.println("x = " + x);
        
        int y = x + 10;
        
        System.out.println("y = " + y);
        
        // Code (like in math) likes to use shorthand (optional)
        
        y++;    // Means the same as y = y + 1
        y--;    // Means the same as y = y - 1
        
        // Even more shorthand (less recomended)...
        
        y += 10;    // Means y = y + 10;
        y -= 10;    // Means y = y - 10;
        y *= 10;    // Means y = y * 10;
        y /= 10;    // Means y = y / 10;
        
        System.out.println("y = " + y);
        
        // More complicated types of calculations might be needed for formulas, 
        // like for example the Modulus (mod) gives you the remainder of a 
        // division, in java and it uses the percentage "%" symbol for this
        
        x = 28;
        y = x / 5;
        
        int z = x % 5;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        // Constants are variables that don't change, and constants are
        // written in ALL_CAPITAL_LETTERS with an underscore to seperate words
        
        // They also start with the keyword "final" (in C# it was "const")
        
        final double  PI           = 3.141592658389;
        final int     PROBLEMS     = 99;
        final char    YES          = 'Y';
        final boolean FOUND        = true;
        final String  TEACHER_NAME = "Wachs";
        
        System.out.println(PI       + ", " + 
                           PROBLEMS + ", " +
                           YES      + ", " +
                           FOUND    + ", " +
                           TEACHER_NAME);
        
        // Converting one data type to another 
        
        int f = 25;
        
        System.out.println("f = " + f);
        
        double g = f;
        
        System.out.println("g = " + g);
        
        g = 25.99999999999;
        
        System.out.println("g = " + g);
        
        int h = (int) g;
        
        // When we use round brackets ( )  with a data type inside, this is
        // called "casting" which means it converts (temporarily) to another
        // data type - which meant it ignored the decimal part
        
        System.out.println("h = " + h);
        
        // Casting again...
        
        double k = 2.999999999;
        int    l = (int)k;
        double m = (double)l;
        
        // Casting can happen with other data types
        
        char n = 'A';
        int  o = (int)n;
        char p = (char)70;
        
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("o = " + o);
        System.out.println("p = " + p);
        
        // Use dialog boxes with variables
        
        // Whenever you are using INPUT dialogs, ALWAYS use a variable first
        // at the front of the line that makes the input dialog (code above is
        // wrong, always make a string variable then the input dialog)
        
        String q = JOptionPane.showInputDialog("Enter string (text)");
        
        // The variable stores what they typed in the input dialog box
        // we test this by diplaying it right away
        
        JOptionPane.showMessageDialog(null, q);
        
        // With numbers (integers or doubles), you HAVE to start off with a 
        // string, and then convert it to a number. This is like:
        // Convert.ToInt32(text).... this was in C#
        
        String r = JOptionPane.showInputDialog("Enter int");
        
        // We use code to "parse" the string (means "reading")
        
        int s = Integer.parseInt(r);
        
        JOptionPane.showMessageDialog(null, s);
        
        // Same example with a double
        
        String t = JOptionPane.showInputDialog("Enter double");
        double u = Double.parseDouble(t);
        JOptionPane.showMessageDialog(null, u);
        
        // Example with a char (character)
        
        String v = JOptionPane.showInputDialog("Enter char");
        char   w = v.charAt(0);
        JOptionPane.showMessageDialog(null, w);
        
        // Strings have built-in actions like "charAt" to pull out a character
        // "at" location "0" which means the very first character (because 
        // numbering in Computer Science usually starts at 0)
        
        // Strings have MANY built-in "actions" (function, methods)
        
        String word = "hippopotomonsprosesquippedaiophobia";
        
        int length = word.length();
        
        System.out.println("Word " + word + " is length " + length);
                
        // The "String" data type (uses a capital "S") is more 'powerful'
        // (means built-in functions) than the int, double, boolean or char
        
        String upper = word.toUpperCase();
        
        System.out.println("Word " + word + " in upper case is " + upper);
                
        // Many more string functions to be explored
                
        // Most words in code (in Java) that start with a capital letter, all
        // have built-in 'powers' (methods) that you can explore using NetBeans
        // autocomplete and reading what pops up
        
        // "Math" library of code comes with built-in functions (actions,
        // powers, methods)
        
        double answer1 = Math.PI;
        double answer2 = Math.cos(0.5);
        double answer3 = Math.abs(-1);
        double answer4 = Math.pow(5,3);
        double answer5 = Math.sqrt(9);
        double answer6 = Math.log(0.5);
                        
        System.out.println("answer1 = " + answer1);
        System.out.println("answer2 = " + answer2);
        System.out.println("answer3 = " + answer3);
        System.out.println("answer4 = " + answer4);
        System.out.println("answer5 = " + answer5);
        System.out.println("answer6 = " + answer6);
        
        // Math library also does random numbers, like:
        // Random random = new Random();
        
        double seed = Math.random();
        
        System.out.println("seed = " + seed);
        
        // You can use a formula for generating random numbers in a range
        // between a low and a high number
        
        // e.g. between 1 and 10 and make it an integer
        
        // Start with some constants defining the low and high
        
        final double LOW  = 1.0;
        final double HIGH = 10.0;
        
        // Now the formula to generate a random number in the range
        
        double number = (HIGH - LOW + 1) * seed + LOW;
        
        // Now cast it into an int
        
        int value = (int)number;
        
        // and diplay it
        
        System.out.println("value = " + value);
        
        // Do it again, but simplify the formula (between 2-53)
        
        int card = (int)( (53 - 2 + 1) * Math.random() + 2);
        System.out.println("card = " + card);
        
        ///////////////////////////////////////////////////////////////////////
        // (5) CONDITIONAL STATEMENTS
        ///////////////////////////////////////////////////////////////////////
        
        
        // The simple if statement, you use this when comparing if something is
        // true, as it checks that one thing ("asks a true/false question")
        
        // If statements use both ( ) round and { } curly brackets and the 
        // code inside of the curly brackets is said to be in a "block" of
        // code and that block only runs when the test inside of the round
        // brackets tests TRUE. It also indents the code inside the block
        
        int value1 = 10, value2 = 10;
        
        if (value1 == value2) {
            System.out.println("equal");
        }
        
        // if with "else" (an option) for both true and false, check 2 things
        
        double value3 = 1.45, value4 = 1.5;
        
        if (value3 < value4) {
            System.out.println("less than");
        }
        else {
            System.out.println("greater than");
        }
        
        // Use chars and some shorthand, not usually recommended (except in 
        // certain situations) used when the code in a block - between { } is
        // only one line of code! Then, you don't need the { } 
        // And.. (even further shorthand) the line can be moved up to the
        // same line as the if statement
        
        char value5 = 'A', value6 = 'a';
        if (value5 != value6) System.out.println("!=");
        else                  System.out.println("==");
                
        // Use "else if" for multiple cases of more than 2 things (same as the
        // "switch" statement - which I don't use) use strings for this
        // example which are more complex (because they use many character,
        // and upper and lower case)
        
        String word1 = "edgy";
        String word2 = "eDgy";
        
        // NOTE: with strings NEVER use "==" ALWAYS use ".equals()"
        
        if (word1.equals(word2)) {
            System.out.println("W1==W2");
        }
        else if (word1.equalsIgnoreCase(word2)) {
            System.out.println("W1 kind of == W2");
        }
        else {
            System.out.println("W1!=W2");
        }
        
        // Combining logic using "and" "or" "not"
        // "And" - means BOTH have to be true
        // "Or" - means EITHER can be true
        // "Not" - reverses logic
        // In Java it uses symbols for these:
        // "AND" - "&&" (ampersand Shift 7)
        // "OR"  - "||" (pipe shift key above enter)
        // "NOT" - "!" (like not equal)
        
        int age = 17;
        double iq = 1.0;
        
        if (age >= 21 && iq > 90) {
            // with "and" BOTH have to be true
            System.out.println("Get in");
        }
        else if (age >= 18 || iq > 0) {
            // with "or" EITHER can be true
            System.out.println("Keep trying");
        }
        else {
            System.out.println("Get out");
        }
        
        ///////////////////////////////////////////////////////////////////////
        // (6) LOOPING
        ///////////////////////////////////////////////////////////////////////
        
        // Simple loop...
        
        int counter = 0;
        
        while (counter < 10) {
            System.out.println("counter = " + counter);
            counter++;  // counter = counter + 1;
        }
        
        // while loop with a string
        
        String password = JOptionPane.showInputDialog("Create a password");
        
        while (password.equals("1234")) {
            JOptionPane.showMessageDialog(null, "Try again!");
            password = JOptionPane.showInputDialog("Create another password");
        }
        
        // The next type of loop is rarely used (you may never need it)
        // it tests for true/false at the bottom of the loop, you use it
        // when you want the body (block) of the loop to run at least
        // once!
        
        String choice = "";
        
        do {            
            choice = JOptionPane.showInputDialog("Enter password");
        } while (choice.equalsIgnoreCase(password) == false);
        
        JOptionPane.showMessageDialog(null, "You got it!");
        
        // The "for" loop is used for counting (and for the upcoming unit 
        // called "arrays"). It is a much more technical ("codey") looking loop
        // The inside of the round brackets means: ( start ; end ; change)        
        // The for loop creates its own variable (by default NetBeans calls
        // it "i") - short for "iteration"
        
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        
        // Variations on the for loop:
            // START - at 100
            // END (stops) - at zero (including zero)
            // CHANGE - count down (not up)
            //          count by 10s
        
        for (int i = 100; i >= 0; i = i - 10) {
            System.out.println("i = " + i);
        }
        
        ///////////////////////////////////////////////////////////////////////
        // (7) EXAMPLE ASSIGNMENT:
        ///////////////////////////////////////////////////////////////////////
        
        // Create welcome screen for the user (message dialog box)
        String message = "You are an intern at radio station, C-RAP, The \n"
                       + "disk jockeys announce the current temperature \n"
                       + "in both Fahrenheit and Celsius every half-hour.\n"
                       + "They would like an easy way to display both the \n"
                       + "Fahrenheit and Celsius temperatures quickly and \n"
                       + "at the same time. The local airport phones in \n"
                       + "the temperature (but only in Celsius). They \n"
                       + "have requested that you develop an application \n"
                       + "that will display both temperatures after the \n"
                       + "Celsius temperature is inputted. Note: Use \n"
                       + "this conversion formula F = (C ??? 1.8) + 32";        
        // Get user input (temperature in celcius) - dialog
        String userInput = JOptionPane.showInputDialog("Enter temperature "
                + "in Celcius");
        // convert this to a number I can do math with
        double celcius = Double.parseDouble(userInput);
        // apply a formula  (F = (C ??? 1.8) + 32 )
        double fahrenheit = (celcius * 1.8) + 32;
        // Show the user the results (fahrenheit) in a dialog
        JOptionPane.showMessageDialog(null, "Your temperature in "
                + "Fahrenheit is " + fahrenheit);
        // show ending message
        JOptionPane.showMessageDialog(null, "Thank you!");
                
        // This line terminates any running java program at any point
        // System.exit(0);
        
        // Curly brackets (braces, parenthesis) { and } are important - all 
        // code goes between these two brackets
        
    }

    /**
     * Learn the content of the methods unit
     */
    private static void learnMethods() {
        System.out.println("Start learning methods...");
        
        // Methods (functions, procedures, actions) are named in a style like 
        // variables are named (lowercase then camel casing), but use verb
        // type words starting with lowercase then using camel casing the
        // presense of round brackets ( ) indicate a method. We make methods
        // for: (1) to break up a problem (2) reusability (3) to avoid 
        // repeating code
        
        // Code to "jump" to a method, is "calling" the method (method call)
        writeStar();
        
        // Call it again
        writeStar();
        
        // When we call a method, we place "data" (information) inside the
        // round brackets and that data is "passed" (sending) over to the 
        // method. The data being passed is tecehnically called the "argument"
        // and the data being recieved is called the "parameter(s)". You can
        // always change the arguement.
                
        write("Dogalicious");
        
        write("mumble");
        write("Spider-man");
        write("Banana bread");
        
        // You can have more than one, multiple parameters/arguments in a 
        // method which are seperated with commas ","
        
        writeLotsOf("Dalmations",101);
        
        writeLotsOf("Problems", 99);
        
        // You can make methods that "send back" (output) information, the 
        // previous methods needed information (inputs) as parameters or 
        // empty brackets () if they did not need information passed
        
        int number = giveMeNumber();
        
        write("Number is " + number);
        
        // Overloaded methods are methods with the smae name, BUT different
        // parameters / arguments
        
        output("Hello");
        
        output("Good-bye","Learning Methods");        
        
        System.out.println("Learning methods complete!");
    }

    /**
     * Writes a star on the screen
     */
    private static void writeStar() {
        System.out.println("*");
    }

    /**
     * Writes something on the screen
     * 
     * @param thing the something to write
     */
    private static void write(String thing) {
        // Information (data) "passed" to this method is called the parameter,
        // if you use the lightbulb to write this method, you should (do this 
        // first) rewrite the name of that parameter
        System.out.println(thing);
    }

    /**
     * Writes something on the screen multiple times
     * 
     * @param thing the something to write
     * @param times how many times to write ut
     */
    private static void writeLotsOf(String thing, int times) {
        // Methods can have no parameters, one parameter, or lots of parameters,
        // if it has more than one parameter, they are separated by commas
        for (int i = 0; i < times; i++) {
            write(thing);
        }
    }

    /**
     * Gives you a random number
     * 
     * @return random number between 1 and 10
     */
    private static int giveMeNumber() {
        // Methods can have no outputs (the word "void") or can have ONE output
        // which means the method will "return" that data type in the method
        return random(1, 100);
    }

    /**
     * Generates a random number in a range between two numbers
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return random number less than or equal to low and greater than or 
     * equal to high
     */
    private static int random(int low, int high) {
        double seed   = Math.random();
        double L      = (double)low;
        double H      = (double)high;
        double number = (H - L + 1) * seed + L;
        return (int)number;
    }

    /**
     * Display text in a dialog
     * 
     * @param text the text to display
     */
    private static void output(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    /**
     * Display text in a dialog with a title at the top of the dialog
     * 
     * @param text the text to display
     * @param title what to show at the top of the dialog
     */
    private static void output(String text, String title) {
        // Overloaded methods are methods with the same name, BUT different
        // parameters / arguments so we know which version of the method to call
        JOptionPane.showMessageDialog(null, text, title, 
                JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Learn the content of the arrays unit (unit 3)
     */
    private static void learnArrays() {
        System.out.println("Start Learning Arrays...");
        
        // Create (declare) a variable for comparison
        int variable = 5;
        
        // E.g. in memory a variable could "look" like...
        //
        //          +-------+
        // variable |   5   | (type integer)
        //          +-------+
                
        // Now declare (create) an array:
        int numbers[] = new int[5];
        
        // type name [square brackets] = new type [size of the array];
        // array names are usually "plural" words
        // E.g. in memory an array could "look" like...
        //
        //         +-------+-------+-------+-------+-------+
        // numbers |       |       |       |       |       | (a length of 5)
        //         +-------+-------+-------+-------+-------+
        //
        // The square brackets "[  ]" in code indicate we are using an array, 
        // the word "new" is used because arrays (they are technically 
        // "advanced" data types) are more complicated than variables (which 
        // are "simple" or "primitive" data types) then you repeat the data 
        // type ("int" in this case) and the square brackets are also repeated 
        // with a number (or a variable) inside - this number represents the 
        // SIZE of the array. When arrays are first created, they are EMPTY.
        // The array has now 5 "spots" (or "index", "elements", "subscript")
        // which automatically numbers them - BUT the first spot is ALWAYS
        // numbered as spot zero and the rest and numbered in order:
        //
        //         +-------+-------+-------+-------+-------+
        // numbers |       |       |       |       |       | (indexed)
        //         +-------+-------+-------+-------+-------+
        //             0       1       2       3       4
        
        numbers[0] = 25;
        numbers[1] = 250;
        numbers[2] = 2;
        numbers[3] = -25;
        numbers[4] = 0;

        //         +-------+-------+-------+-------+-------+
        // numbers |   25  |  250  |   2   |  -25  |   0   | (now filled)
        //         +-------+-------+-------+-------+-------+
        //             0       1       2       3       4
        
        // These next lines would be errors when the code runs:
        // array[5] = 25;
        // array[-1] = 25;
        // They would be "out of bounds" errors (or "range" error)
        
        // Declare an array (a little differently) of NO size...        
        double a[];        
        
        // In memory...
        //
        // a
        //
        
        // Later on (in the code) you can re-create (re-declare, re-dimension, 
        // or resize) using the same array but now giving it some size (but 
        // still empty)
        a = new double[3];
        
        // In memory....
        //
        //   +----------+----------+----------+
        // a |          |          |          | (now has size of 3, but empty)
        //   +----------+----------+----------+
        //        0          1          2
        
        // Now fill with content
        a[0] = 1.1;
        a[1] = 2.2;
        a[2] = 3.3;
        
        //   +----------+----------+----------+
        // a |   1.1    |   2.2    |   3.3    | (now it is filled with content)
        //   +----------+----------+----------+
        //        0          1          2
        
        // You can re-dimension (resize) an array multiple times, BUT
        // every time it wipes out any content stored in the array
        a = new double[5];
        
        //   +----------+----------+----------+----------+----------+
        // a |          |          |          |          |          | (size 5)
        //   +----------+----------+----------+----------+----------+
        //        0          1          2          3          4
        
        // Another way to declare arrays, but this way creates the array of
        // a set size, BUT with pre-filled values inside (make and fill at the
        // same time - on the same ONE line of code) - you can as an option,
        // put the "[]" beside the data type OR the array name
        
        double[] coins = { 0.05, 0.10, 0.25, 1.00, 2.00 };
        
        //       +------+------+------+------+------+
        // coins | 0.05 | 0.10 | 0.25 | 1.00 | 2.00 |  (has a length of 5)
        //       +------+------+------+------+------+
        //          0      1      2      3      4  
        
        // You can also create CONSTANT arrays that are pre-filled, the name
        // we gives array should be a plural word (e.g. 'scores' (array name)
        // not 'score' (variable name), 'names' not 'name', etc.) 
        final String[] OPTIONS = {
            "New Game",
            "Save Game",
            "Exit"
        };
        
        // When using arrays, use individual elements (spots, indices - the 
        // plural of "index") of the array like regular variables, for example
        
        int[] values = new int[100];
        
        // Change (assign) a index (spot)
        values[99] = 333;
        
        //         +-----+-----+-----+
        // numbers |     | ... | 333 | (length is 100)
        //         +-----+-----+-----+
        //            0    ...   99
        // Remember, the last index is always ONE LESS than the length
        
        // Output that spot
        System.out.println(values[99]);
        
        // Perform equations with array indices like variables
        values[0] = values[99] + values[99];
        System.out.println(values[0]);
        
        // To work with, and to "travel" (means to "visit" every spot) the 
        // entire array, we use a loop!
        
        // Specifically, the FOR loop!
        
        // for loops were literally built for arrays
        for (int i = 0; i < 100; i++) {
            System.out.println(values[i]);
        }
        // The for loop is perfect because it automatically (when I type "for"
        // and TAB) starts at 0, goes up by 1, is "less than" then ending 
        // number (which can be the length)
        
        // When using the for loop with arrays, it is even BETTER to use a
        // built-in feature of all arrays! All arrays have a ".length" feature
        // for example  
        for (int i = 0; i < values.length; i++) {
            System.out.println(i + " = " + values[i]);
        }
        // Tip: if type "for" TAB, then TAB AGAIN it jump to the ending value
        // So if the array size changes, the loop adapts to it
        
        // Array can easily work with methods, the arrays can be sent into a 
        // method (as one of multiple parameters, or the only parameter), and 
        // arrays can be outputted (returned) from a method - in other words:
        // Arrays can be INPUT(s) or OUTPUT from a method
        
        output(values);     // Send an array to a method as a parameter
        output(numbers);    // Call the same method with different argument
        output(coins);      // Overload the output method again
        
        int[] randoms = random(1, 10, 50);    // Overload "random" method
        output(randoms);
        
        // Multi-dimensional array (also known as a "array of arrays", or a 
        // array filled with other arrays, 2D, etc.) - and also known as a 
        // table, grid, or a MATRIX
        
        // Create some constants to use when building the matrix (these are
        // not needed to declare a matrix, but they might help in understanding 
        // it) - we make contants as a way to "visualize" what we are building
        
        final int ROWS    = 30; // "dimension" going "down" (also like "y" axis)
        final int COLUMNS = 40; // "dimension" going "across" (also like "x")
        
        // We declare (create) a matrix , by adding multiple sets of square
        // brackets (a set of brackets for each dimension)
        
        char[][] matrix = new char[ROWS][COLUMNS];
                
        // If we "visualize this as a 3 by 4 matrix (3 rows by 4 columns), or 
        // y = 3 and x = 4, or a "height" of 3 and a "width" of 4, then it
        // could be "seen" as...
        //
        //               (columns, width, x axis is 4, meaning 0-3)
        //
        //                     0         1         2         3
        //                +---------+---------+---------+---------+
        // (rows,       0 |         |         |         |         |
        //  height,       +---------+---------+---------+---------+
        //  y axis      1 |         |         |         |         |
        //  is 3,         +---------+---------+---------+---------+
        //  meaning     2 |         |         |         |         |
        //  0-2)          +---------+---------+---------+---------+
        // 
        // A matrix "row" can also be "visualized" as the matrix "height"
        // A matrix "column" can also be "visualized" as the matrix "width"
        
        // Fill the matrix with random characters...
        // (using a method for random characters)       
                
        final char LOW  = 'a';
        final char HIGH = 'z';
        
        // Create and test a method to make random characters
        char character = random(LOW,HIGH);
        System.out.println("Random character was " + character);
             
        
                
                
                
                
                
                
                
        
        
        
        System.out.println("Completed Learning Arrays!");
    }

    /**
     * Outputs an array of integers in a dialog
     * 
     * @param array the array of integers
     */
    private static void output(int[] array) {
        // Arrays can be a parameter (or one of the parameters)
        String text = "Array [";
        // Loop (traverse) through the array and add the contents to the string
        for (int i = 0; i < array.length; i++) {
            text = text + array[i] + ",";
        }
        text = text + "]";                
        output(text);
    }

    /**
     * Convert all the doubles into integers and then output the array in a 
     * dialog
     * 
     * @param array the array of doubles
     */
    private static void output(double[] array) {
        int[] a = convert(array);   // Create int array of converted doubles        
        output(a);                  // Now output the converted array
    }

    /**
     * Converts an array of doubles into an array of integers
     * 
     * @param array the array of doubles
     * @return an array of integers
     */
    private static int[] convert(double[] array) {
        // Methods can return (output) entire arrays
        int[] a = new int[array.length];      // Create empty array (same size)
        for (int i = 0; i < a.length; i++) {  // Traverse the array
            a[i] = (int)array[i];             // Cast the double into a int
        }
        return a;                             // Return the converted new array
    }

    /**
     * Generates an array of a set size filled with random integers in the 
     * range between low and high
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @param size the size to make the array
     * @return an array of random integers
     */
    private static int[] random(int low, int high, int size) {
        int[] numbers = new int[size];      // Create empty array of passed size
        for (int i = 0; i < size; i++) {    // Traverse array 
            numbers[i] = random(low, high); // Assign random value to each index
        }
        return numbers;                     // Return completed array
    }
    
    /**
     * Generates a random character between tow low and high characters
     * 
     * @param low lowest character in the range
     * @param high highest character in the range
     * @return random character in range
     */
    private static char random(char low, char high) {
        return (char)random((char)low,(int)high);     // cast to int and back  
    }
    
    /**
     * Goes over the content of this unit
     */
    private static void learnClasses() {
        System.out.println("Start Learning classes...");
        
        // Create a "person" (add a class called "Person" to this Java project)
        // To do this, click on File - New File (or icon on toolbar)
        // A dialog will appear and you select "Java" and "Java Class"
        // Then next...
        // Then give it a name (starts with a capital letter and camel casing)
        // Then click finish!
        
        // use a line of code like this:
        // Random random = new Random();
        
        Person person = new Person();
        // Class object = new Class() <--- implies a method?
        // that is the call to the constructor method
        
        // call (invoke) a method within the object
        person.talk();
        
        // Use (call,invoke) other methods and change properties
        person.birthday(1);
        person.talk();
        person.name = "Dave Smith";
        person.talk();
        person.gender = "Male";
        person.talk();
        person.die();
        person.talk();
        
        // Create (instantiate) another object with a different (overloaded) 
        // constructor        
        Person other = new Person("Another name");
        other.talk();
        other.birthday(10);
        other.talk();
        
        // Another instance using the 3rd constructor option
        Person third = new Person("Jennifer Gooku",17,"female");
        third.birthday(38);
        third.talk();
        third.die();
        third.talk();
        // third.age = 50; // cannot be done, private property
        
        // Create a Student object and call it's methods (including the 
        // ones it inherited from the Person class)        
        Student student = new Student("Student Person",17,"student",123456);
        student.talk();
        // Call (invoke) methods specifically for the student class
        student.slackOff();
        student.study();
        student.slackOff();
        student.cram();
        student.talk();
        
        // Instantiate a Husky object
        Husky husky = new Husky("Havoc", 14, "male", 2665);
        husky.talk();
        
        // Make a Teacher instance
        Teacher teacher = new Teacher("Mr. Wachs");
        teacher.talk();
        
        // Assigned student objects to the public array
        teacher.students[0] = student;
        teacher.students[1] = husky;
        
        // Called talk again to see the students we added
        teacher.talk();
        
        // Build (declare, initiaize, instantiate) a Meeting object
        Meeting meeting = new Meeting();
        
        // Calling our polymorphic method
        meeting.attend(person);
        meeting.attend(other);
        meeting.attend(third);
        meeting.attend(student);
        meeting.attend(husky);
        meeting.attend(teacher);
        
        meeting.hold();
                
        System.out.println("Completed learning classes!");
    }
    
}

// <editor-fold>  

// NETBEANS TIPS:
// ==============
// GENERAL TIPS....
// ================
// (1)  To zoom in and out on the code, hold ALT and roll the mouse
// (2)  Double click the top of a tab to hide side windows or show them
// (3)  The curly brackets (braces, parenthesis) are important "{" and "}"
// (4)  Click the green triangle on the top toolbar to run code
// (5)  Type "sout" and then press tab it fills (autocompletes) "System.out..."
// (6)  Autocomplete (Intellisense) can appear if you press "CTRL + SPACE"
// (7)  The word "null" means "nothing" and can act as a placeholder for code
//      you often do not need (right now)
// (8)  To "comment out" chunks of code, select the code with your mouse or 
//      keyboard, then click on the two buttons under the code tab (on right)
// (9)  To stop a running program, click the red stop button on the left in the
//      output window, or the X in the bottom right of NetBeans
// (10) A red squiggily line and/or a "lightbulb" in NetBeans means a potential
//      error and a potential fix (if you click on the lightbulb)
// (11) You can get more NetBeans tips and autocompletes by selecting:
//      Help -> Keyboard Shortcuts Card
// (12) Go to Tools -> Templates, scroll down and click on the "+" beside 
//      "Java", select "Java Main Class", and "Open in Editor" and the enter 
//      this into the temple (but use the slash "/" instead of "|"):
//
//      /** 
//       * ${name}.java - 
//       *
//       * @author Mr. Wachs 
//       * @since ${date} 
//       */
//      public class ${name} 
//       { .... etc .....     
//
// (13) To autoformat code (fixes indents, extra spaces, etc.) you select the
//      code with mouse or keyboard (if you select nothing it will autoformat
//      all the code) and pres ALT + SHIFT + F (you should do this before you 
//      hand in your code)
// (14) When printing code for hand in (this only needs to be done once), click
//      on "Print Options" and uncheck everything previously checked off, and
//      then check off "Print as in Editor", then either print it to a PDF 
//      (which means select "Microsoft Print to PDF" on the next screen), or
//      cancel and resize the code to fit better (see tip #1) and then print 
//      again
// (15) You can "teach" NetBeans to change the style it uses to autoformat (see
//      number 13) by going to Tools -> Options, then click on the "Editor"
//      tab at the top, then the "Formatting" below that. Then change the 
//      settings to what you prefer
// METHOD TIPS....
// ================
// (16) The + and - signs and gray lines along the side in NetBeans
//      help to "expand" and "collapse" the method body (block of code)
//      press CTRL and SHIFT and "-" it collapses all methods, and
//      CTRL and SHIFT and "+" expands all code folds
// (17) If you hold down the CTRL key, method calls become links with the
//      mouse to jump to the method (even ones we don't write)
// (18) If you write the "call" to a method, before writing the method 
//      itself, the lightbulb (see tip 10) will help you write it
// (19) On the left side window, the Navigator window helps find and jump to
//      methods if you double click them
// (20) If you have to rename a variable or a method, select the word (the name
//      of the variable or method) and then press CTRL + R, then type in a
//      new name
// (21) If you type /** before the method signature line it will automate
//      which JavaDoc comments you should make
// (22) If you want to remove the auto-generated reminder when you use the
//      lightbulb to create a method, go to Tools -> Templates, scroll down 
//      and click on the "+" beside "Java", and then the "+" beside "code
//      snippets", and select "Generated Method body" and remove the last line
// (23) All arrays have a ".length" feature built in that you can have NetBeans
//      autocomplete for you by typing the name of your array, then dot length
//      (".length") which automatically gives you how many elements are in
//      the array
// (24) When writing for loops with array, if you type "for" then press TAB, 
//      and then press TAB AGAIN it jump to the ending value (which should be 
//      the ".length" of the array (so if the array size changes, the loop 
// (25) To view the same code editing window with two different views, go to
//      the menu View -> Split -> Vertical (or Horizontal) and Clear when done
// (26) To modify the template of all new classes, Tools -> Templates, scroll 
//      down and click on the "+" beside "Java", select "Java Class" and use 
//      ALL the code (uncommented) below:
//
///** Required package class namespace */
//<#if package?? && package != "">
//package ${package};
//
//</#if>
// 
///**
// * ${name}.java - description
// *
// * @author Mr. Wachs
// * @since ${date}, ${time}
// */
//public class ${name} 
//{
//
//    /**
//     * Default constructor, set class properties
//     */
//    public ${name}() {
//        
//    }
//     
//    /**
//     * String representation of this object
//     *
//     * @return The object represented as a String
//     */
//    @Override
//    public String toString() {
//        return "${name}: " + super.toString();
//    }
//   
//    /**
//     * Deep comparison, determines if two objects are "equal" in this context
//     *
//     * @param object the object to compare to
//     * @return the objects are "equal" (true) or not (false)
//     */
//    @Override
//    public boolean equals(Object object) {
//        return super.equals(object);
//    }
//       
//    /**
//     * a Deep clone, creates a duplicate object using new memory
//     *
//     * @return a "clone" of the object using new memory
//     */
//    @Override
//    public ${name} clone() {
//        return this;
//    }
//    
//}

// </editor-fold>