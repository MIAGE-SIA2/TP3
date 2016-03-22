

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FixtureTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FixtureTest
{
    private Livre livre1;
    private Bibliotheque biblioth1;
    
    ArrayList<Livre> lesLivres = new ArrayList<Livre>();

    /**
     * Default constructor for test class FixtureTest
     */
    public FixtureTest()
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
        livre1 = new Livre();
        biblioth1 = new Bibliotheque();
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
    public void testRenduMonnaie()
    {
        livre1.setPrix(10);
        
        lesLivres.add(livre1);
        
        biblioth1.setLivres(lesLivres);
        
        assertEquals(20, biblioth1.rendu_monnaie(30));
    }
}

