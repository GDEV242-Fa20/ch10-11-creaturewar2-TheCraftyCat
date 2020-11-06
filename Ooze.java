
/**
 * The Ooze class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5] 
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * An Ooze is a gelatinous creature (not significant now; may be used later)
 * 
 * @author Catherine Oldfield
 * from code originally written by W. Crosbie, RVCC GDEV242 Fall 2020
 * @version 2020-10 v1.0
 * @version 2020-11-05 C. Oldfield
 */
public class Ooze extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_OOZE_STR = 20;
    private static final int MIN_OOZE_STR = 5;
    private static final int MAX_OOZE_HP = 25;
    private static final int MIN_OOZE_HP = 5;

    /**
     * Constructor for objects of class Ooze
     */
    public Ooze()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_OOZE_STR-MIN_OOZE_STR)+MIN_OOZE_STR,
            Randomizer.nextInt(MAX_OOZE_HP-MIN_OOZE_HP)+MIN_OOZE_HP
        );
    }

    /**
     * takeDamage receives a value for the amount of damage to subtract from 
     * the current total of hit points
     * An Ooze has a 10% chance of taking no damage at all.
     * @param damage value to remove from hit point count
     */
    public void takeDamage(int damage) {
        int damageChance = Randomizer.nextInt(10);
        if(damageChance % 10 == 0)
        {
            // do nothing (no damage taken)
            // parameter damage is ignored
        }
        else
        {
            super.takeDamage(damage);
        }
    }
    
    // attack() - not overridden because Oozes generate basic damage
    
    /**
     * getMinStr method returns the minimum strength value for the Ooze class
     * This method is primarily used for testing
     * @return MIN_OOZE_STR the minimum strength value
     */
    public int getMinStr()
    {
        return MIN_OOZE_STR;
    }
    
    /**
     * getMaxStr method returns the maximum strength value for the Ooze class
     * This method is primarily used for testing
     * @return MAX_OOZE_STR the maximum strength value
     */
    public int getMaxStr()
    {
        return MAX_OOZE_STR;
    }
    
    /**
     * getMinHP method returns the minimum hit point value for the Ooze class
     * This method is primarily used for testing
     * @return MIN_OOZE_HP the minimum HP value
     */
    public int getMinHP()
    {
        return MIN_OOZE_HP;
    }
    
    /**
     * getMaxHP method returns the maximum hit point value for the Ooze class
     * This method is primarily used for testing
     * @return MAX_OOZE_HP the maximum HP value
     */
    public int getMaxHP()
    {
        return MAX_OOZE_HP;
    }
}
