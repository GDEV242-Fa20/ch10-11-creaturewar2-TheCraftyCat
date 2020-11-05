

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CreatureWarTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CreatureWarTest
{
    /**
     * Default constructor for test class CreatureWarTest
     */
    public CreatureWarTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * Test the CreatureWar constructor and assure that the goodArmy and
     * evilArmy contain the proper number of Creatures.
     */
    @Test
    public void testCreatureWarConstructor()
    {
       CreatureWar creature1 = new CreatureWar();
       assertTrue(creature1.getEvilArmySize() >= 30);
       assertTrue(creature1.getEvilArmySize() <= 50);
       assertEquals(100, creature1.getGoodArmySize());
    }
}



