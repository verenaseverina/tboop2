/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cell.turunancell;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * jUnit Kelas Facility.
 */
public class FacilityTest {
    
    public FacilityTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
      System.out.println("Testing Facility Class");
    }

    @After
    public void tearDown() {
      System.out.println();
    }
    
  /**
   * Test of IsEntrance method, of class Facility.
   * @throws java.lang.Exception
   */
  @Test
  public void testIsEntrance() throws Exception {
    System.out.print("Testing Method isEntrance... ");
    Facility instance = new Facility('~',3,3);
    boolean expResult = false;
    boolean result = instance.isEntrance();
    assertEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of IsExit method, of class Facility.
   * @throws java.lang.Exception
   */
  @Test
  public void testIsExit() throws Exception {
    System.out.print("Testing Method isExit... ");
    Facility instance = new Facility('~',3,3);
    boolean expResult = false;
    boolean result = instance.isExit();
    assertEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of SetTrue method, of class Facility.
   * @throws java.lang.Exception
   */
  @Test
  public void testSetTrue() throws Exception {
    System.out.print("Testing Method setTrue... ");
    int n = 0;
    Facility instance = new Facility('~', 3, 3);
    instance.setTrue(n);
    assertTrue(n == 0);
    System.out.println("OK");
  }
  
}
