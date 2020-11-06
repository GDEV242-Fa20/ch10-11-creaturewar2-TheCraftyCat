import java.util.ArrayList;
import java.util.Iterator;

/**
 * The war is huge and terrible and for now is being fought in a very narrow 
 * passageway where only one participant from each army can engage with the 
 * other. 
 * 
 * (Edit this comment when it is not late and you are not tired.)
 *
 * @author Catherine Oldfield
 * @version 2020-11-04 C. Oldfield
 */
public class CreatureWar
{
    // instance variables - replace the example below with your own
    private Creature[] goodArmy;
    private Creature[] evilArmy;

    /**
     * Constructor for objects of class CreatureWar
     */
    public CreatureWar()
    {
        // good army ALWAYS has 100 members
        goodArmy = new Creature[100];  
        
        // the evil army will be a random number between 30 and 50:
        // Randomizer will generate a number between 1 and 21
        // the +29 will adjust it to be between 30 and 50
        int armySize = Randomizer.nextInt(21) + 29;
        evilArmy = new Creature[armySize];
        
        createGoodArmy();
        createEvilArmy();
    }
    
    /**
     * The main battle loop. Loops until one army is defeated.
     */
    public void simulateBattle()
    {
        // create an index variable for each army - might not need??
        int goodArmyIndex = 0;
        int evilArmyIndex = 0;
        
        // create a variable to hold the current combatant of each army
        // and initialize it to the creature at the beginning of each array:
        // ArrayList:
        Creature currentGoodGuy = goodArmy[goodArmyIndex];
        Creature currentBadGuy = evilArmy[evilArmyIndex];
        
        boolean finished = false; // might not need this??
        while(goodArmyIndex < goodArmy.length && evilArmyIndex < evilArmy.length)
        {
            // while each army has a remaining member, they do battle
        }
    }

    /**
     * This method populates the goodArmy array with Creatures
     * The goodArmy can only be composed of the Human, Elf and Gnome classes
     * The goodArmy is populated via a random number between 1 and 10 (inclusive):
     * 1 - 6 = a Human
     * 7 - 8 = an Elf
     * 9 - 10 = a Gnome
     * The goodArmy will always contain 100 Creatures.
     */
    public void createGoodArmy()
    {
        int choice = 0;
        for(int i = 0; i < goodArmy.length; i++)
        {
            choice = Randomizer.nextInt(10);
            if(choice <= 6)     // create a Human
            {
                goodArmy[i] = new Human();
            }
            else if(choice == 7 || choice == 8)     //create an Elf
            {
                goodArmy[i] = new Elf();
            }
            else    // create a Gnome
            {
                goodArmy[i] = new Gnome();
            }
        }
    }
    
    /**
     * This method populates the evilArmy array with creatures
     * The evilArmy can only be composed of the Human, Ooze, CyberDemon and Balrog classes
     * The evilArmy is populated via a random number between 1 and 25 (inclusive):
     * 1 - 10 = a Human
     * 11 - 18 = an Ooze
     * 19 - 24 = a CyberDemon
     * 25 = a Balrog
     */
    public void createEvilArmy()
    {
        int choice = 0;
        for(int i = 0; i < evilArmy.length; i++)
        {
            choice = Randomizer.nextInt(10);
            
            if(choice <= 10)    // create a Human
            {
                evilArmy[i] = new Human();
            }
            else if(choice > 10 && choice <= 18)    // create an Ooze
            {
                evilArmy[i] = new Ooze();
            }
            else if(choice > 18 && choice <= 24)    // create a CyberDemon
            {
                evilArmy[i] = new CyberDemon();
            }
            else    // create a Balrog
            {
                evilArmy[i] = new Balrog();
            }
        }
    }
    
    /**
     * Returns the size of the goodArmy ArrayList.
     * This method is used for testing.
     * @return The size of the goodArmy ArrayList.
     */
    public int getGoodArmySize()
    {
        return goodArmy.length;
    }
    
    /**
     * Returns the size of the evilArmy ArrayList.
     * This method is used for testing.
     * @return The size of the evilArmy ArrayList.
     */
    public int getEvilArmySize()
    {
        return evilArmy.length;
    }
}
