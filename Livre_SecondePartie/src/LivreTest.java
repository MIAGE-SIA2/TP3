

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LivreTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LivreTest
{
    /**
     * Default constructor for test class LivreTest
     */
    public LivreTest()
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
    



    @Test
    public void testAugmenterPrix()
    {
        Livre livre1 = new Livre();
        livre1.setPrix(10);
        assertEquals(20, livre1.augmenter_prix(2));
    }
}




