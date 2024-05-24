/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package icx.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 94701
 */
public class ValidationTest {
    
    public ValidationTest() {
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
     * Test of mobile method, of class Validation.
     */
    @Test
    public void testMobile() {
        System.out.println("mobile");
        String mobile = "0785640111";
        boolean expResult = false;
        boolean result = Validation.mobile(mobile);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of email method, of class Validation.
     */
    @Test
    public void testEmail() {
        System.out.println("email");
        String email = "yasithsandeshvithanage2002@gmail.com";
        boolean expResult = false;
        boolean result = Validation.email(email);
        assertEquals(expResult, result);
     
    }

    /**
     * Test of password method, of class Validation.
     */
    @Test
    public void testPassword() {
        System.out.println("password");
        String password = "123";
        boolean expResult = true;
        boolean result = Validation.password(password);
        assertEquals(expResult, result);
    
    }
    
}
