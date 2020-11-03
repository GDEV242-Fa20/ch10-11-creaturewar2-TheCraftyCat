
/**
 * The Balrog class implements a wrapper for the Demon class with the following additions
 * Implements a maximum/minimum strength for the creature type [100/50]
 * Implements a maximum/minimum hitpoint total for the creature type [200/80]
 * 
 * A Balrog is a demonic creature (not significant now; may be used later)
 * 
 * @author Catherine Oldfield
 * from code originally written by W. Crosbie, RVCC GDEV242 Fall 2020
 * @version 2020-10 v1.0
 * @version 2020-11-01 C. Oldfield
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;

    /**
     * Constructor for objects of class Balrog -
     * Note that the calling class does not need to know anything about the 
     * requirements of elf minimum and maximum values
     * 
     * The instantiating class asks for a Balrog and the Balrog class is responsible for
     * returning a Balrog object with values in the appropriate range
     * 
     */
    public Balrog()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR,
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP
        );
          
    }
    
    /**
     * Allows a Balrog to determine how much damage it is causing in this round of battle
     * A Balrog always attacks twice (this is implemented with a local variable so that it
     * can be changed later, if we decide a Balrog will attack more than twice)
     * @return  The value to be used to cause damage to another creature
     */
    public int attack()
    {
        int totalAttack = 0;    // the total attack value of all the Balrog's attacks
        int numAttacks = 2;     // the number of times the Balrog attacks
        
        for (int i = 0; i < numAttacks; i++)
        {
            totalAttack += super.attack();
        }
        
        return totalAttack;
    }
    
    // takeDamage(int) - not overridden, because a Balrog takes all damage assigned to it
    
    /**
     * getMinStr method returns the minimum strength value for the Balrog class
     * This method is primarily used for testing
     * @return MIN_BALROG_STR the minimum strength value
     */
    public int getMinStr()
    {
        return MIN_BALROG_STR;
    }
    
    /**
     * getMaxStr method returns the maximum strength value for the Balrog class
     * This method is primarily used for testing
     * @return MAX_BALROG_STR the maximum strength value
     */
    public int getMaxStr()
    {
        return MAX_BALROG_STR;
    }
    
    /**
     * getMinHP method returns the minimum hit point value for the Balrog class
     * This method is primarily used for testing
     * @return MIN_BALROG_HP the minimum HP value
     */
    public int getMinHP()
    {
        return MIN_BALROG_HP;
    }
    
    /**
     * getMaxHP method returns the maximum hit point value for the Balrog class
     * This method is primarily used for testing
     * @return MAX_BALROG_HP the maximum HP value
     */
    public int getMaxHP()
    {
        return MAX_BALROG_HP;
    }
}