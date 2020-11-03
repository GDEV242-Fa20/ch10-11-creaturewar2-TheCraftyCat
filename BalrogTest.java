

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BalrogTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BalrogTest
{
    /**
     * Default constructor for test class BalrogTest
     */
    public BalrogTest()
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
     * Test that the Balrog class constructor creates a Balrog with values in the 
     * acceptable range.
     */
    @Test
    public void testBalrogConstructor()
    {
        Balrog balrog1 = new Balrog();
        assertTrue(balrog1.getHealth() <= balrog1.getMaxHP());
        assertTrue(balrog1.getHealth() >= balrog1.getMinHP());
        assertTrue(balrog1.getStrength() <= balrog1.getMaxStr());
        assertTrue(balrog1.getStrength() >= balrog1.getMinStr());
    }
}
