
/**
 * This project represents an overly simplified battle simulator of a war between 
 * "good" and "evil" armies. The war is huge and terrible and for now is being 
 * fought in a very narrow passageway where only one participant from each army 
 * can engage with the other.  When two opposing creatures meet in this hallway,
 * they will fight. 
 * 
 * In a battle, it is assumed that both creatures attack simultaneously, and take
 * damage simultaneously. There is no chance of a missed attack; these creatres are
 * professionals. When one combatant is knocked out, the next creature in line steps
 * up to take its place. When one army is out of combatants, it is defeated.
 * (It is possible for both armies to be defeated simultaneously.)
 *
 * @author Catherine Oldfield
 * for RVCC GDEV242 - Fall 2020
 * @version 2020-11-05 C. Oldfield
 */
public class CreatureWar
{
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
        
        // evilArmy = new Creature[200]; // for testing, to make sure the evil army would win
        
        createGoodArmy();
        createEvilArmy();
    }
    
    /**
     * The main battle loop. Loops until one army is defeated.
     */
    public void simulateBattle()
    {
        // create an index variable for each army, initialized to the first array position
        int gi = 0; // index for good army
        int ei = 0; // index for evil army
        
        // create a variable to hold the current combatant of each army
        // and initialize it to the creature at the beginning of each array:
        // I might not need these
        Creature currentGoodGuy = goodArmy[gi];
        Creature currentBadGuy = evilArmy[ei];
        
        // create variables to hold combat values:
        int goodGuyAttack = 0;
        int badGuyAttack = 0;
        
        boolean goodArmyDefeated = false;
        boolean evilArmyDefeated = false;
        
        while(gi < goodArmy.length && ei < evilArmy.length)
        {
            // while each army has a remaining member, they do battle
            
            // first, get the attack value of each combatant
            goodGuyAttack = goodArmy[gi].attack();
            badGuyAttack = evilArmy[ei].attack();
            
            // then, apply the damage to each combatant
            // (A's damage is B's attack value and vice versa)
            // It is assumed that both combatants strike simultaneously
            // and take damage simultaneously
            goodArmy[gi].takeDamage(badGuyAttack);
            evilArmy[ei].takeDamage(goodGuyAttack);
            
            // next, check to see if either combatant is knocked out
            // if so, advance index to next combatant
            if(goodArmy[gi].isKnockedOut())
            {
                gi++;
            }
            
            if(evilArmy[ei].isKnockedOut())
            {
                ei++;
            }
            
            // then, check to see if either army is out of Creatures
            // if an army is out of Creatures, it is defeated
            if(gi == goodArmy.length)
            {
                goodArmyDefeated = true;
            }
            
            if(ei == evilArmy.length)
            {
                evilArmyDefeated = true;
            }
        }
        
        // lastly, declare a winner
        if(!goodArmyDefeated && evilArmyDefeated)
        {
            System.out.println("The Good Army has won the battle!" + "\n" +
                "Rejoice, all forces of light, for the darkness is no more!");
        }
        else if(goodArmyDefeated && !evilArmyDefeated)
        {
            System.out.println("The Evil Army has won the battle!" + "\n" +
                "They usher in a new reign of darkness and despair.");
        }
        else
        {
            System.out.println("The Good Army and Evil Army were both defeated" + "\n"  +
                "in the grand battle. Thus began an age of neutrality.");
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
