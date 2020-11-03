

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HumanTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HumanTest
{
    /**
     * Default constructor for test class HumanTest
     */
    public HumanTest()
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
     * Test that the Human class constructor creates a Human with values in the acceptable
     * range.
     */
    @Test
    public void testHumanConstructor()
    {
        Human human1 = new Human();
        assertTrue(human1.getHealth() <= human1.getMaxHP());
        assertTrue(human1.getHealth() >= human1.getMinHP());
        assertTrue(human1.getStrength() <= human1.getMaxStr());
        assertTrue(human1.getStrength() >= human1.getMinStr());
    }
}
