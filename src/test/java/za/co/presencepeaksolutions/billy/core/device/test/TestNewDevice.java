/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.presencepeaksolutions.billy.core.device.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author clinton
 */
public class TestNewDevice {

    public TestNewDevice() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
//    MyMath myMath = new MyMath();
    @Before
    public void before() {
        System.out.println("Before");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    // MyMath.sum
    // 1,2,3 => 6
    @Test
    public void device_add_type() {
        System.out.println("Test1");
//		assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
    }

    @Test
    public void device_add() {
        System.out.println("Test2");
//		assertEquals(3, myMath.sum(new int[] { 3 }));
    }

    @Test
    public void test() {
        boolean condn = true;
        assertEquals(true, condn);
        assertTrue(condn);
        // assertFalse(condn);
    }
}
