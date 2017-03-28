/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cell.turunancell;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nim_13515091
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
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of IsEntrance method, of class Facility.
   */
  @Test
  public void testIsEntrance() {
    System.out.println("IsEntrance");
    Facility instance = null;
    boolean expResult = false;
    boolean result = instance.IsEntrance();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of IsExit method, of class Facility.
   */
  @Test
  public void testIsExit() {
    System.out.println("IsExit");
    Facility instance = null;
    boolean expResult = false;
    boolean result = instance.IsExit();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of SetTrue method, of class Facility.
   */
  @Test
  public void testSetTrue() {
    System.out.println("SetTrue");
    int n = 0;
    Facility instance = null;
    instance.SetTrue(n);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
