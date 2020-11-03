

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ElfTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ElfTest
{
    /**
     * Default constructor for test class ElfTest
     */
    public ElfTest()
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
     * Test that the Elf class constructor creates an Elf with values in the acceptable
     * range.
     */
    @Test
    public void testElfConstructor()
    {
        Elf elf1 = new Elf();
        assertTrue(elf1.getHealth() <= elf1.getMaxHP());
        assertTrue(elf1.getHealth() >= elf1.getMinHP());
        assertTrue(elf1.getStrength() <= elf1.getMaxStr());
        assertTrue(elf1.getStrength() >= elf1.getMinStr());
    }
}
