/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cell;

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
   * Test of getCellContent method, of class Cell.
   * @throws java.lang.Exception
   */
  @Test
  public void testgetCellContent() throws Exception {
    System.out.print("Testing Method getCellContent... ");
    Cell instance = new Cell('~',3,3);
    char expResult = '~';
    char result = instance.getCellContent();
    assertEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of getCellRow method, of class Cell.
   * @throws java.lang.Exception
   */
  @Test
  public void testgetCellRow() throws Exception {
    System.out.print("Testing Method getCellRow... ");
    Cell instance = new Cell();
    int expResult = -1;
    int result = instance.getCellRow();
    assertEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of getCellCol method, of class Cell.
   * @throws java.lang.Exception
   */
  @Test
  public void testgetCellCol() throws Exception {
    System.out.print("Testing Method getCellCol... ");
    Cell instance = new Cell();
    int expResult = -1;
    int result = instance.getCellCol();
    assertEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of SetTrueEntranceExit method, of class Cell.
   * @throws java.lang.Exception
   */
  @Test
  public void testSetTrueEntranceExit() throws Exception {
    System.out.print("Testing Method setTrueEntranceExit... ");
    int n = 0;
    Cell instance = new Cell();
    instance.setTrueEntranceExit(n);
    System.out.println("OK");
  }

  /**
   * Test of IsEntrance method, of class Cell.
   * @throws java.lang.Exception
   */
  @Test
  public void testIsEntrance() throws Exception {
    System.out.print("Testing Method isEntrance... ");
    Cell instance = new Cell();
    boolean expResult = false;
    boolean result = instance.isEntrance();
    assertEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of IsExit method, of class Cell.
   * @throws java.lang.Exception
   */
  @Test
  public void testIsExit() throws Exception {
    System.out.print("Testing Method isExit... ");
    Cell instance = new Cell();
    boolean expResult = false;
    boolean result = instance.isExit();
    assertEquals(expResult, result);
    System.out.println("OK");
  }
  
}
