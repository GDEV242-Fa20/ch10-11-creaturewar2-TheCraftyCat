

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class OozeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class OozeTest
{
    /**
     * Default constructor for test class OozeTest
     */
    public OozeTest()
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
     * Test that the Ooze class constructor creates an Ooze with values in the acceptable
     * range.
     */
    @Test
    public void testOozeConstructor()
    {
        Ooze ooze1 = new Ooze();
        assertTrue(ooze1.getHealth() <= ooze1.getMaxHP());
        assertTrue(ooze1.getHealth() >= ooze1.getMinHP());
        assertTrue(ooze1.getStrength() <= ooze1.getMaxStr());
        assertTrue(ooze1.getStrength() >= ooze1.getMinStr());
    }
}
