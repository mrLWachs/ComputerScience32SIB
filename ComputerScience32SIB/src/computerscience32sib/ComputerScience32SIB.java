
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

/** 
 * ComputerScience32SIB.java - the large in class example we continue to work 
 * on in each unit adding example code on the new concepts of each unit along 
 * with any requests for code examples that might come up over the course.
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
        
        // Code could span mulitple lines until it reaches a semi colon ";"
        
        JOptionPane.showMessageDialog(
                null, 
                "Information icon is i",
                "Information title",
                JOptionPane.INFORMATION_MESSAGE
        );
                
        JOptionPane.showMessageDialog(
                null, 
                "Question icon is ?",
                "Question title",
                JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null, 
                "Warning icon is !",
                "Warning title",
                JOptionPane.WARNING_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null, 
                "Plain no icon",
                "Plain title",
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
                "Information Input dialog icon is i",
                "Information Input Title",
                JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null,
                "Question Input dialog icon is ?",
                "Question Input Title",
                JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null,
                "Warning Input dialog icon is !",
                "Warning Input Title",
                JOptionPane.WARNING_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null,
                "Plain Input dialog no icon",
                "Plain Input Title",
                JOptionPane.PLAIN_MESSAGE
        );
        
        // More different (and optional) dialogs...
        
        JOptionPane.showConfirmDialog(null, "Confirm");
        
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
        
        // A variable is a piece of code that tells the computer to
        // store (or "remember") information (or "data")
        
        // This is an example of the simpliest variable type:
        
        boolean a = true;
        
        // type name = value ;
        
        // When you write a line of code to create (declare) a variable
        
        int b = 0;
        
        double c = 0.0;
        
        // Variables can change ("vary")
        
        a = false;
        b = 1;
        c = 1.2;
        
        // Variables always go on the left hand side (LHS) of the equals
        // sign (=) and the value going into the variable always goes on
        // the right hand side (RHS)
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        char d = 'A';
        
        // The "char" is short for "character" holds (remembers) ONE
        // character
        
        System.out.println("d = " + d);
        
        // The boolean, integer (int), double, character (char) are all
        // simple (primitive) data types, now a complex data type...
        
        String e = "apple";
        
        System.out.println("e = " + e);
                
        // Manipulate our variables
        
        int x = 10;
        
        System.out.println("x = " + x);
        
        x = 20;
        
        System.out.println("x = " + x);
        
        int y = x + 10;
        
        System.out.println("y = " + y);
        
        
        
        
    }

}

// NETBEANS TIPS:
// ==============
// (1)  To zoom in and out on the code, hold ALT and roll the mouse
// (2)  Double click the top of a tab to hide side windows or show them
// (3)  The curly brackets (braces, parenthesis) are important "{" and "}"
// (4)  Click the green triangle on the top toolbar to run code
// (5)  Type "sout" and then press tab it fills (autocompletes) "System.out..."
// (6)  Autocomplete (Intellisense) can appear if you press "CTRL + SPACE"
// (7)  The word "null" means "nothing" and can act as a placeholder for code
//      you often do not need (right now)