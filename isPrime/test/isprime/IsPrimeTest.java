/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package isprime;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class IsPrimeTest {
    
      @Test
    public void testIsPrime() {
        assertTrue(soNguyen.isPrime(5));
        assertFalse(soNguyen.isPrime(4));
        assertFalse(soNguyen.isPrime(1));
        assertTrue(soNguyen.isPrime(13));
    }
}
