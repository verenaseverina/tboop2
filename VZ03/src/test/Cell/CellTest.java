/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cell;

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
public class CellTest {
  
  public CellTest() {
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
   * Test of GetCellContent method, of class Cell.
   */
  @Test
  public void testGetCellContent() {
    System.out.println("GetCellContent");
    Cell instance = new Cell();
    char expResult = ' ';
    char result = instance.GetCellContent();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of GetCellRow method, of class Cell.
   */
  @Test
  public void testGetCellRow() {
    System.out.println("GetCellRow");
    Cell instance = new Cell();
    int expResult = 0;
    int result = instance.GetCellRow();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of GetCellCol method, of class Cell.
   */
  @Test
  public void testGetCellCol() {
    System.out.println("GetCellCol");
    Cell instance = new Cell();
    int expResult = 0;
    int result = instance.GetCellCol();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of SetTrueEntranceExit method, of class Cell.
   */
  @Test
  public void testSetTrueEntranceExit() {
    System.out.println("SetTrueEntranceExit");
    int n = 0;
    Cell instance = new Cell();
    instance.SetTrueEntranceExit(n);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of IsEntrance method, of class Cell.
   */
  @Test
  public void testIsEntrance() {
    System.out.println("IsEntrance");
    Cell instance = new Cell();
    boolean expResult = false;
    boolean result = instance.IsEntrance();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of IsExit method, of class Cell.
   */
  @Test
  public void testIsExit() {
    System.out.println("IsExit");
    Cell instance = new Cell();
    boolean expResult = false;
    boolean result = instance.IsExit();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
