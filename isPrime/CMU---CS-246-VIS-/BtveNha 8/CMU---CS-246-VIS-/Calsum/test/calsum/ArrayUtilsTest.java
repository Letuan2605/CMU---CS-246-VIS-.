/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calsum;

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
public class ArrayUtilsTest {
    @Test
   public void testCalSum() {
        assertEquals(10, MyFunctions.calSum(new int[]{1, 2, 3, 4}));
        assertEquals(0, MyFunctions.calSum(new int[]{}));
    }
}