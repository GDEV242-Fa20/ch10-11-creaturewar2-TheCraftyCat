
/**
 * The Human class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5] 
 * CORRECTION: [18/5] listed in project assignment
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * CORRECTION: [30/10] listed in project assignment
 * 
 * A Human is a basic creature (not significant now; may be used later)
 * 
 * @author Catherine Oldfield
 * from code originally written by W. Crosbie, RVCC GDEV242 Fall 2020
 * @version 2020-10 v1.0
 * @version 2020-11-06 C. Oldfield
 */
public class Human extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_HUMAN_STR = 18;
    private static final int MIN_HUMAN_STR = 5;
    private static final int MAX_HUMAN_HP = 30;
    private static final int MIN_HUMAN_HP = 10;
    
    /**
     * Constructor for objects of class Human -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Human and the human class is responsible for
     * returning a Human object with values in the appropriate range
     * 
     */
    public Human()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_HUMAN_STR-MIN_HUMAN_STR)+MIN_HUMAN_STR,    
            Randomizer.nextInt(MAX_HUMAN_HP-MIN_HUMAN_HP)+MIN_HUMAN_HP 
        );
          
    }
    
    // attack() - not overridden because Humans generate basic damage
    
    // takeDamage(int) - not overridden, because a Human takes all damage assigned to it
    
    /**
     * getMinStr method returns the minimum strength value for the Human class
     * This method is primarily used for testing
     * @return MIN_HUMAN_STR the minimum strength value
     */
    public int getMinStr()
    {
        return MIN_HUMAN_STR;
    }
    
    /**
     * getMaxStr method returns the maximum strength value for the Human class
     * This method is primarily used for testing
     * @return MAX_HUMAN_STR the maximum strength value
     */
    public int getMaxStr()
    {
        return MAX_HUMAN_STR;
    }
    
    /**
     * getMinHP method returns the minimum hit point value for the Human class
     * This method is primarily used for testing
     * @return MIN_HUMAN_HP the minimum HP value
     */
    public int getMinHP()
    {
        return MIN_HUMAN_HP;
    }
    
    /**
     * getMaxHP method returns the maximum hit point value for the Human class
     * This method is primarily used for testing
     * @return MAX_HUMAN_HP the maximum HP value
     */
    public int getMaxHP()
    {
        return MAX_HUMAN_HP;
    }
    
    /**
     * The toString method returns a string representation of the Human
     * @return  A string representation of the Human
     */
    public String toString()
    {
        return "Human";
    }
}
