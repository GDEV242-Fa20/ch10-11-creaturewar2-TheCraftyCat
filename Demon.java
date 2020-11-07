
/**
 * The Demon class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * A Demon is a demonic creature (not significant now; may be used later)
 * 
 * @author Catherine Oldfield
 * from code originally written by W. Crosbie, RVCC GDEV242 Fall 2020
 * @version 2020-10 v1.0
 * @version 2020-11-06 C. Oldfield
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class Demon -
     * Note that a Demon will never be instantiated directly, but rather one of its subclasses
     * will be created
     * 
     */
    public Demon(int str, int hp)
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(str, hp);
          
    }
    
    
    /**
     * Allows a Demon to determine how much damage it is causing in this round of battle
     * A Demon has a 20% chance to do magic damage (damage + 50)
     * @return  The value to be used to cause damage to another creature
     */
    public int attack()
    {
        int returnValue = super.attack();
        
        // compute the chance of doing magic damage (20% chance)
        int magicDamage = Randomizer.nextInt(20);
        if(magicDamage % 20 == 0)
        {
            returnValue += 50;
        }
        
        return returnValue;
    }
    
    // takeDamage(int) - not overridden, because a Demon takes all damage assigned to it
    
    /**
     * The toString method returns a string representation of the Demon
     * @return  A string representation of the Demon
     */
    public String toString()
    {
        return "Demon";
    }
}
