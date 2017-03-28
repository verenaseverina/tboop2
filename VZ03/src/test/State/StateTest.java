/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

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
public class StateTest {
  
  public StateTest() {
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
   * Test of GetMap method, of class State.
   */
  @Test
  public void testGetMap() {
    System.out.println("GetMap");
    State instance = new State();
    char[][] expResult = null;
    char[][] result = instance.GetMap();
    assertArrayEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of GetHeight method, of class State.
   */
  @Test
  public void testGetHeight() {
    System.out.println("GetHeight");
    State instance = new State();
    int expResult = 0;
    int result = instance.GetHeight();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of GetWidth method, of class State.
   */
  @Test
  public void testGetWidth() {
    System.out.println("GetWidth");
    State instance = new State();
    int expResult = 0;
    int result = instance.GetWidth();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
