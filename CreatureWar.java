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
    private ArrayList<Creature> goodArmy;
    private ArrayList<Creature> evilArmy;

    /**
     * Constructor for objects of class CreatureWar
     */
    public CreatureWar()
    {
        // initialise instance variables
        goodArmy = new ArrayList<Creature>();
        evilArmy = new ArrayList<Creature>();
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
        // create an iterator for each army
        Iterator goodArmyIt = goodArmy.iterator();
        Iterator evilArmyIt = evilArmy.iterator();
        
        // create a variable to hold the current combatant of each army
        // and initialize it to the creature at the beginning of each 
        // ArrayList:
        // Creature currentGoodGuy = goodArmyIt.next();
        // Creature currentBadGuy = evilArmyIt.next();
        
        boolean finished = false; // might not need this??
        while(goodArmyIt.hasNext() && evilArmyIt.hasNext())
        {
            // while each army has a remaining member, they do battle
        }
    }

    /**
     * This method populates the goodArmy ArrayList with Creatures
     * The goodArmy can only be composed of the Human, Elf and Gnome classes
     * The goodArmy is populated via a random number between 1 and 10 (inclusive):
     * 1 - 6 = a Human
     * 7 - 8 = an Elf
     * 9 - 10 = a Gnome
     * The goodArmy will always contain 100 Creatures.
     */
    public void createGoodArmy()
    {
        int index = 0;
        int choice = 0;
        while(index < 100)
        {
            choice = Randomizer.nextInt(10);
            if(choice <= 6) // create a Human
            {
                goodArmy.add(new Human());
            }
            
            else if (choice == 7 || choice == 8) // create an Elf
            {
                goodArmy.add(new Elf());
            }
            
            else // create a Gnome
            {
                goodArmy.add(new Gnome());
            }
            
            // increment the index
            index++;
        }
    }
    
    /**
     * This method populates the evilArmy ArrayList with creatures
     * The evilArmy can only be composed of the Human, Ooze, CyberDemon and Balrog classes
     * The evilArmy is populated via a random number between 1 and 25 (inclusive):
     * 1 - 10 = a Human
     * 11 - 18 = an Ooze
     * 19 - 24 = a CyberDemon
     * 25 = a Balrog
     * The evilArmy will contain a random number of Creatures between
     * 30 and 50, inclusive.
     */
    public void createEvilArmy()
    {
        int index = 0;
        // the evil army will be a random number between 30 and 50:
        // Randomizer will generate a number between 1 and 21
        // the +29 will adjust it to be between 30 and 50
        // the +1 will increment it "one more" to act as loop control
        int armySize = Randomizer.nextInt(21) + 29 + 1;
        
        int choice = 0;
        while(index < armySize)
        {
            choice = Randomizer.nextInt(10);
            if(choice <= 10) // create a Human
            {
                evilArmy.add(new Human());
            }
            
            else if (choice > 10 && choice <= 18) // create an Ooze
            {
                evilArmy.add(new Ooze());
            }
            
            else if (choice > 18 && choice <= 24) // create a CyberDemon
            {
                evilArmy.add(new CyberDemon());
            }
            
            else // create a Balrog
            {
                evilArmy.add(new Balrog());
            }
            
            // increment the index
            index++;
        }
    }
    
    /**
     * Returns the size of the goodArmy ArrayList.
     * This method is used for testing.
     * @return The size of the goodArmy ArrayList.
     */
    public int getGoodArmySize()
    {
        return goodArmy.size();
    }
    
    /**
     * Returns the size of the evilArmy ArrayList.
     * This method is used for testing.
     * @return The size of the evilArmy ArrayList.
     */
    public int getEvilArmySize()
    {
        return evilArmy.size();
    }
}
