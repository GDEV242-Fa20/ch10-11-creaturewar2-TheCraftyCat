

/**
 * The Elf class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [18/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/8]
 * 
 * @author Catherine Oldfield
 * from code originally written by W. Crosbie, RVCC GDEV242
 * @version 2020-10 v1.0
 * @version 2020-11-01 C. Oldfield
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Constructor for objects of class Elf -
     * Note that the calling class does not need to know anything about the 
     * requirements of elf minimum and maximum values
     * 
     * The instantiating class asks for an Elf and the Elf class is responsible for
     * return an Elf object with values in the appropriate range
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
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
        );
          
    }
    
    /**
     * Allows an Elf to determine how much damage it is causing in this round of battle
     * An Elf has a 10% chance to do magic damage (2x damage)
     * @return  The value to be used to cause damage to another creature
     */
    public int attack()
    {
        int returnValue = super.attack();
        
        // compute the chance of doing magic damage (10% chance)
        int magicDamage = Randomizer.nextInt(9);
        if(magicDamage % 10 == 0)
        {
            returnValue = returnValue * 2;
        }
        
        return returnValue;
    }
    
    // takeDamage(int) - not overridden, because an Elf takes all damage assigned to it
    
}
