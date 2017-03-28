/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cell;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

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
    System.out.println("Testing Cell Class");
  }
  
  @After
  public void tearDown() {
    System.out.println();
  }

  /**
   * Test of GetCellContent method, of class Cell.
   * @throws java.lang.Exception
   */
  @Test
  public void testGetCellContent() throws Exception {
    System.out.print("Testing Method GetCellContent... ");
    Cell instance = new Cell('~',3,3);
    char expResult = '~';
    char result = instance.GetCellContent();
    assertEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of GetCellRow method, of class Cell.
   * @throws java.lang.Exception
   */
  @Test
  public void testGetCellRow() throws Exception {
    System.out.print("Testing Method GetCellRow... ");
    Cell instance = new Cell();
    int expResult = -1;
    int result = instance.GetCellRow();
    assertEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of GetCellCol method, of class Cell.
   * @throws java.lang.Exception
   */
  @Test
  public void testGetCellCol() throws Exception {
    System.out.print("Testing Method GetCellCol... ");
    Cell instance = new Cell();
    int expResult = -1;
    int result = instance.GetCellCol();
    assertEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of SetTrueEntranceExit method, of class Cell.
   * @throws java.lang.Exception
   */
  @Test
  public void testSetTrueEntranceExit() throws Exception {
    System.out.print("Testing Method SetTrueEntranceExit... ");
    int n = 0;
    Cell instance = new Cell();
    instance.SetTrueEntranceExit(n);
    System.out.println("OK");
  }

  /**
   * Test of IsEntrance method, of class Cell.
   * @throws java.lang.Exception
   */
  @Test
  public void testIsEntrance() throws Exception {
    System.out.print("Testing Method IsEntrance... ");
    Cell instance = new Cell();
    boolean expResult = false;
    boolean result = instance.IsEntrance();
    assertEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of IsExit method, of class Cell.
   * @throws java.lang.Exception
   */
  @Test
  public void testIsExit() throws Exception {
    System.out.print("Testing Method IsExit... ");
    Cell instance = new Cell();
    boolean expResult = false;
    boolean result = instance.IsExit();
    assertEquals(expResult, result);
    System.out.println("OK");
  }
  
}
