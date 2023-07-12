/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package prueba;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author isaac_dugo
 */
public class FechaTest {
    
    public FechaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of diff method, of class Fecha.
     */
    @Test
    public void testDiff() {
        LocalDate a = LocalDate.parse("2022-01-01");
        LocalDate b = LocalDate.parse("2023-01-01");
        LocalDate a2 = LocalDate.parse("2022-01-01");
        LocalDate d = LocalDate.parse("2021-12-31");
        assertEquals(365, Fecha.diff(a, b));
        assertEquals(0, Fecha.diff(a, a2));
        assertEquals(-1, Fecha.diff(a, d));

        
      
    }
    
}
