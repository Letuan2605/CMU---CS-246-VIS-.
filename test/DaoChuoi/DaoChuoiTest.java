/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DaoChuoi;

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
public class DaoChuoiTest {
    
    @Test
    public void testReverseString() {
        assertEquals("cba", DaoChuoi.reverseString("abc"));
        assertEquals("", DaoChuoi.reverseString(""));
    }
    
}
