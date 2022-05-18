  
/** Required package class namespace */
package testing.unit2;

/** 
 * Football.java - enforcing "the rules" of football (and sports). Interfaces 
 * can inherit from other interfaces ("can follow the rules of other rules"). 
 * This is like classes inheriting from other classes.
 *
 * @author Mr. Wachs 
 * @since 18-May-2022 
*/
public interface Football
{
    
    /**
     * A team scoring a point
     * 
     * @param name the name of the team who scored
     */
    void score(String name);
    
    /**
     * The passed quarter of football is over
	 *
     * @param quarter the quarter number
     */
    void endOfQuarter(int quarter);

}