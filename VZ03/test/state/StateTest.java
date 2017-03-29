/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
/**
 * jUnit Kelas State.
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
    System.out.println("Testing State Class");
  }

  @After
  public void tearDown() {
    System.out.println();
  }

  /**
   * Test of getMap method, of class State.
   * @throws java.lang.Exception
   */
  @Test
  public void testgetMap() throws Exception {
    System.out.print("Testing Method getMap... ");
    State instance = new State();
    State instance2 = new State();
    char[][] expResult = instance2.getMap();
    char[][] result = instance.getMap();
    assertArrayEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of getHeight method, of class State.
   * @throws java.lang.Exception
   */
  @Test
  public void testgetHeight() throws Exception {
    System.out.print("Testing Method getHeight... ");
    State instance = new State();
    int expResult = 8;
    int result = instance.getHeight();
    assertEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of getWidth method, of class State.
   * @throws java.lang.Exception
   */
  @Test
  public void testgetWidth() throws Exception {
    System.out.print("Testing Method getWidth... ");
    State instance = new State();
    int expResult = 8;
    int result = instance.getWidth();
    assertEquals(expResult, result);
    System.out.println("OK");
  }
  
}
