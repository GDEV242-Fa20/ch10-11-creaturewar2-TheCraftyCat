
/**
 * The CyberDemon class implements a wrapper for the Demon class with the following additions
 * Implements a maximum/minimum strength for the creature type [40/20]
 * Implements a maximum/minimum hitpoint total for the creature type [100/25]
 * 
 * A CyberDemon is a demonic creature (not significant now; may be used later)
 * 
 * @author Catherine Oldfield
 * from code originally written by W. Crosbie, RVCC GDEV242 Fall 2020
 * @version 2020-10 v1.0
 * @version 2020-11-01 C. Oldfield
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_CYBERDEMON_STR = 40;
    private static final int MIN_CYBERDEMON_STR = 20;
    private static final int MAX_CYBERDEMON_HP = 100;
    private static final int MIN_CYBERDEMON_HP = 25;
    
    /**
     * Constructor for objects of class CyberDemon -
     * Note that the calling class does not need to know anything about the 
     * requirements of CyberDemon minimum and maximum values
     * 
     * The instantiating class asks for a CyberDemon and the CyberDemon class is responsible 
     * for returning a CyberDemon object with values in the appropriate range
     * 
     */
    public CyberDemon()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_CYBERDEMON_STR-MIN_CYBERDEMON_STR)+MIN_CYBERDEMON_STR,    
            Randomizer.nextInt(MAX_CYBERDEMON_HP-MIN_CYBERDEMON_HP)+MIN_CYBERDEMON_HP
        );
          
    }
    
    // attack() - not overridden because CyberDemons generate basic Demon damage
    
    // takeDamage(int) - not overridden, because a CyberDemon takes all damage assigned to it
    
    /**
     * getMinStr method returns the minimum strength value for the CyberDemon class
     * This method is primarily used for testing
     * @return MIN_CYBERDEMON_STR the minimum strength value
     */
    public int getMinStr()
    {
        return MIN_CYBERDEMON_STR;
    }
    
    /**
     * getMaxStr method returns the maximum strength value for the CyberDemon class
     * This method is primarily used for testing
     * @return MAX_CYBERDEMON_STR the maximum strength value
     */
    public int getMaxStr()
    {
        return MAX_CYBERDEMON_STR;
    }
    
    /**
     * getMinHP method returns the minimum hit point value for the CyberDemon class
     * This method is primarily used for testing
     * @return MIN_CYBERDEMON_HP the minimum HP value
     */
    public int getMinHP()
    {
        return MIN_CYBERDEMON_HP;
    }
    
    /**
     * getMaxHP method returns the maximum hit point value for the CyberDemon class
     * This method is primarily used for testing
     * @return MAX_CYBERDEMON_HP the maximum HP value
     */
    public int getMaxHP()
    {
        return MAX_CYBERDEMON_HP;
    }
}
