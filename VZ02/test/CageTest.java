/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Vector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;


public class CageTest {
  
  public CageTest() {
  }

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
    System.out.println("Testing Cage Class");
  }

  @After
  public void tearDown() {
    System.out.println();
  }
  
  /**
   * Test of GetCageSize method, of class Cage.
   * @throws java.lang.Exception
   */
  @Test
  public void testGetCageSize() throws Exception {
    System.out.print("Testing Method GetCageSize... ");
    Vector<Cell> V1 = new Vector<Cell>();
    V1.add(new Cell('~',3,3));
    Cage instance = new Cage(V1);
    int expResult = 1;
    int result = instance.getCageSize();
    assertEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of GetAnimal method, of class Cage.
   * @throws java.lang.Exception
   */
  @Test
  public void testGetAnimal() throws Exception {
    System.out.print("Testing Method GetAnimal... ");
    Vector<Cell> V1 = new Vector<Cell>();
    V1.add(new Cell('~',3,3));
    Cage instance = new Cage(V1);
    Cage instance2 = new Cage(V1);
    Animal[] expResult = instance2.getAnimal();
    Animal[] result = instance.getAnimal();
    assertArrayEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of GetHabitat method, of class Cage.
   * @throws java.lang.Exception
   */
  @Test
  public void testGetHabitat() throws Exception {
    System.out.print("Testing Method GetHabitat... ");
    Vector<Cell> V1 = new Vector<Cell>();
    V1.add(new Cell('~',3,3));
    Cage instance = new Cage(V1);
    Cage instance2 = new Cage(V1);
    Cell[] expResult = instance2.getHabitat();
    Cell[] result = instance.getHabitat();
    assertArrayEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of GetNeff method, of class Cage.
   * @throws java.lang.Exception
   */
  @Test
  public void testGetNeff() throws Exception {
    System.out.print("Testing Method GetNeff... ");
    Vector<Cell> V1 = new Vector<Cell>();
    V1.add(new Cell('~',3,3));
    Cage instance = new Cage(V1);
    int expResult = -1;
    int result = instance.getNeff();
    assertEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of ContainAnimal method, of class Cage.
   * @throws java.lang.Exception
   */
  @Test
  public void testContainAnimal() throws Exception {
    System.out.print("Testing Mehthod ContainAnimal... ");
    int x = 3;
    int y = 3;
    Vector<Cell> V1 = new Vector<Cell>();
    V1.add(new Cell('~',3,3));
    Cage instance = new Cage(V1);
    boolean expResult = false;
    boolean result = instance.containAnimal(x, y);
    assertEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of InsideCage method, of class Cage.
   * @throws java.lang.Exception
   */
  @Test
  public void testInsideCage() throws Exception {
    System.out.print("Testing Method InsideCage... ");
    int x = 0;
    int y = 0;
    Vector<Cell> V1 = new Vector<Cell>();
    V1.add(new Cell('~',3,3));
    Cage instance = new Cage(V1);
    boolean expResult = false;
    boolean result = instance.insideCage(x, y);
    assertEquals(expResult, result);
    System.out.println("OK");
  }
  
  /**
   * Test of IsEmpty method, of class Cage.
   * @throws java.lang.Exception
   */
  @Test
  public void testIsEmpty() throws Exception {
    System.out.print("Testing Method IsEmpty... ");
    Vector<Cell> V1 = new Vector<Cell>();
    V1.add(new Cell('~',3,3));
    Cage instance = new Cage(V1);
    boolean expResult = true;
    boolean result = instance.isEmpty();
    assertEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of IsFull method, of class Cage.
   * @throws java.lang.Exception
   */
  @Test
  public void testIsFull() throws Exception {
    System.out.print("Testing Method IsFull... ");
    Vector<Cell> V1 = new Vector<Cell>();
    V1.add(new Cell('~',3,3));
    Cage instance = new Cage(V1);
    boolean expResult = true;
    boolean result = instance.isFull();
    assertEquals(expResult, result);
    System.out.println("OK");
  }
  
}
