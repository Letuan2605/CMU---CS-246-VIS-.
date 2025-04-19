/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package TimSoLonNhat;

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
public class SoLonNhatTest {
    
    @Test
    public void testFindMaxNum() {
        assertEquals(9, SoLonNhat.findMaxNum(new int[]{1, 5, 9, 2}));
        assertEquals(-1, SoLonNhat.findMaxNum(new int[]{-5, -1, -9}));
    }
    
}
