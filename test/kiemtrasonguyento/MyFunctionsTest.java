/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package kiemtrasonguyento;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyFunctionsTest {

    @Test
    public void testIsPrime() {
        assertTrue(MyFunctions.isPrime(5));
        assertFalse(MyFunctions.isPrime(9));
        assertFalse(MyFunctions.isPrime(1));
    }
}
