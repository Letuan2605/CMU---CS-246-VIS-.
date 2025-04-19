/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package TinhGiaithua;

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
public class GiaiThuaTest {
    @Test
    public void testCalFactorial() {
    assertEquals(120, GiaiThua.calFactorial(5));
    assertEquals(1, GiaiThua.calFactorial(0));
}

    
}
