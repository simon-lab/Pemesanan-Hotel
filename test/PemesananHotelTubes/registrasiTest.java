/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_hotel;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rashaad
 */
public class registrasiTest {
    
    public registrasiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBornDate method, of class registrasi.
     */
    @Test
    public void testGetBornDate() {
        System.out.println("getBornDate");
        registrasi instance = new registrasi();
        LocalDate expResult = null;
        LocalDate result = instance.getBornDate();
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of main method, of class registrasi.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        registrasi.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
