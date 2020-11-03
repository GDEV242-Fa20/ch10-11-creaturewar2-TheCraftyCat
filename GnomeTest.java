

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GnomeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GnomeTest
{
    /**
     * Default constructor for test class GnomeTest
     */
    public GnomeTest()
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
     * Test that the Gnome class constructor creates a Gnome with values in the acceptable
     * range.
     */
    @Test
    public void testGnomeConstructor()
    {
        Gnome gnome1 = new Gnome();
        assertTrue(gnome1.getHealth() <= gnome1.getMaxHP());
        assertTrue(gnome1.getHealth() >= gnome1.getMinHP());
        assertTrue(gnome1.getStrength() <= gnome1.getMaxStr());
        assertTrue(gnome1.getStrength() >= gnome1.getMinStr());
    }
}


