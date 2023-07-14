package prueba;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author franci
 */
public class Moneda2Test
{
    
    public Moneda2Test()
    {
    }
    
    @BeforeAll
    public static void setUpClass()
    {
    }
    
    @AfterAll
    public static void tearDownClass()
    {
    }
    
    @BeforeEach
    public void setUp()
    {
    }
    
    @AfterEach
    public void tearDown()
    {
    }

    /**
     * Test of eurInstance method, of class Moneda2.
     */
    @Test
    public void testEurInstance()
    {
        Moneda2 result = Moneda2.eurInstance();
        assertNotNull(result);
    }

    static final double[] EUR = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};
    /**
     * Test of getCoins method, of class Moneda2.
     */
    @Test
    public void testGetCoins()
    {
        Moneda2 instance = Moneda2.eurInstance();
        {
            int[] exp = {0,     1,   1,  0,  1,  0, 0, 0, 1,    1,    1,    1,    1,    1,    1};
            int[] count = instance.getCoins(321.88);
            assertArrayEquals(exp, count);
        }
        {
            int[] exp = {3,     0,   0,  0,  2,  0, 0, 1, 1,    0,    1,    0,    0,    0,    1};
            int[] count = instance.getCoins(1543.21);
            assertArrayEquals(exp, count);
        }
        
    }
    
}
