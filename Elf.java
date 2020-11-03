

/**
 * The Elf class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [18/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/8]
 * 
 * An Elf is a magical creature (not significant now; may be used later)
 * 
 * @author Catherine Oldfield
 * from code originally written by W. Crosbie, RVCC GDEV242 Fall 2020
 * @version 2020-10 v1.0
 * @version 2020-11-01 C. Oldfield
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    
    /**
     * Constructor for objects of class Elf -
     * Note that the calling class does not need to know anything about the 
     * requirements of elf minimum and maximum values
     * 
     * The instantiating class asks for an Elf and the Elf class is responsible for
     * returning an Elf object with values in the appropriate range
     * 
     */
    public Elf()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR,
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP
        );
          
    }
    
    /**
     * Allows an Elf to determine how much damage it is causing in this round of battle
     * An Elf has a 10% chance to do magic damage (damage * 2)
     * @return  The value to be used to cause damage to another creature
     */
    public int attack()
    {
        int returnValue = super.attack();
        
        // compute the chance of doing magic damage (10% chance)
        int magicDamage = Randomizer.nextInt(10);
        if(magicDamage % 10 == 0)
        {
            returnValue = returnValue * 2;
        }
        
        return returnValue;
    }
    
    // takeDamage(int) - not overridden, because an Elf takes all damage assigned to it
    
    /**
     * getMinStr method returns the minimum strength value for the Elf class
     * This method is primarily used for testing
     * @return MIN_ELF_STR the minimum strength value
     */
    public int getMinStr()
    {
        return MIN_ELF_STR;
    }
    
    /**
     * getMaxStr method returns the maximum strength value for the Elf class
     * This method is primarily used for testing
     * @return MAX_ELF_STR the maximum strength value
     */
    public int getMaxStr()
    {
        return MAX_ELF_STR;
    }
    
    /**
     * getMinHP method returns the minimum hit point value for the Elf class
     * This method is primarily used for testing
     * @return MIN_ELF_HP the minimum HP value
     */
    public int getMinHP()
    {
        return MIN_ELF_HP;
    }
    
    /**
     * getMaxHP method returns the maximum hit point value for the Elf class
     * This method is primarily used for testing
     * @return MAX_ELF_HP the maximum HP value
     */
    public int getMaxHP()
    {
        return MAX_ELF_HP;
    }
}
