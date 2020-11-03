

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CyberDemonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CyberDemonTest
{
    /**
     * Default constructor for test class CyberDemonTest
     */
    public CyberDemonTest()
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
     * Test that the CyberDemon class constructor creates a CyberDemon with values in the 
     * acceptable range.
     */
    @Test
    public void testCyberDemonConstructor()
    {
        CyberDemon cyberD1 = new CyberDemon();
        assertTrue(cyberD1.getHealth() <= cyberD1.getMaxHP());
        assertTrue(cyberD1.getHealth() >= cyberD1.getMinHP());
        assertTrue(cyberD1.getStrength() <= cyberD1.getMaxStr());
        assertTrue(cyberD1.getStrength() >= cyberD1.getMinStr());
    }
}
