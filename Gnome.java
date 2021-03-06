
/**
 * The Gnome class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [8/4]
 * Implements a maximum/minimum hitpoint total for the creature type [15/5]
 * 
 * A Gnome is a magical creature (not significant now; may be used later)
 * 
 * @author Catherine Oldfield
 * from code originally written by W. Crosbie, RVCC GDEV242 Fall 2020
 * @version 2020-10 v1.0
 * @version 2020-11-06 C. Oldfield
 */
public class Gnome extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_GNOME_STR = 8;
    private static final int MIN_GNOME_STR = 4;
    private static final int MAX_GNOME_HP = 15;
    private static final int MIN_GNOME_HP = 5;
    
    /**
     * Constructor for objects of class Gnome -
     * Note that the calling class does not need to know anything about the 
     * requirements of Gnome minimum and maximum values
     * 
     * The instantiating class asks for a Gnome and the Gnome class is responsible for
     * returning a Gnome object with values in the appropriate range
     * 
     */
    public Gnome()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
             Randomizer.nextInt(MAX_GNOME_STR-MIN_GNOME_STR)+MIN_GNOME_STR,
             Randomizer.nextInt(MAX_GNOME_HP-MIN_GNOME_HP)+MIN_GNOME_HP
        );
          
    }
        
    /**
     * Allows a Gnome to determine how much damage it is causing in this round of battle
     * A Gnome has a 30% chance to panic and only do half damage
     * A Gnome also has a 10% chance to inspire himself to do double damage
     * @return  The value to be used to cause damage to another creature
     */
    public int attack()
    {
        int returnValue = super.attack();
        
        // compute the chance of doing half damage (30% chance)
        int magicDamage = Randomizer.nextInt(10);
        if(magicDamage % 10 <= 3)
        {
            returnValue = returnValue / 2;
        }
        
        // compute the chance of doing double damage (10% chance)
        if(magicDamage % 10 == 0)
        {
            returnValue = returnValue * 2;
        }
        
        return returnValue;
    }
    
    /**
     * takeDamage receives a value for the amount of damage to subtract from 
     * the current total of hit points
     * Because of its short stature, a Gnome has a 30% chance of ducking the blow and
     * taking half damage.
     * @param damage value to remove from hit point count
     */
    public void takeDamage(int damage) {
        int damageChance = Randomizer.nextInt(10);
        if(damageChance % 10 <= 3)
        {
            super.takeDamage(damage / 2);
        }
        else
        {
            super.takeDamage(damage);
        }
    }
    
    /**
     * getMinStr method returns the minimum strength value for the Gnome class
     * This method is primarily used for testing
     * @return MIN_GNOME_STR the minimum strength value
     */
    public int getMinStr()
    {
        return MIN_GNOME_STR;
    }
    
    /**
     * getMaxStr method returns the maximum strength value for the Gnome class
     * This method is primarily used for testing
     * @return MAX_GNOME_STR the maximum strength value
     */
    public int getMaxStr()
    {
        return MAX_GNOME_STR;
    }
    
    /**
     * getMinHP method returns the minimum hit point value for the Gnome class
     * This method is primarily used for testing
     * @return MIN_GNOME_HP the minimum HP value
     */
    public int getMinHP()
    {
        return MIN_GNOME_HP;
    }
    
    /**
     * getMaxHP method returns the maximum hit point value for the Gnome class
     * This method is primarily used for testing
     * @return MAX_GNOME_HP the maximum HP value
     */
    public int getMaxHP()
    {
        return MAX_GNOME_HP;
    }
    
    /**
     * The toString method returns a string representation of the Gnome
     * @return  A string representation of the Gnome
     */
    public String toString()
    {
        return "Gnome";
    }
}
