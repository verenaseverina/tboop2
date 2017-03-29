/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import Animal.Animal;
//import Cell.turunancell.Habitat;
import animal.Animal;
import cell.turunancell.Habitat;
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
   * Test of getCageSize method, of class Cage.
   * @throws java.lang.Exception
   */
  @Test
  public void testgetCageSize() throws Exception {
    System.out.print("Testing Method getCageSize... ");
    Vector<Habitat> V1 = new Vector<Habitat>();
    V1.add(new Habitat('~',3,3));
    Cage instance = new Cage(V1);
    int expResult = 1;
    int result = instance.getCageSize();
    assertEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of getAnimal method, of class Cage.
   * @throws java.lang.Exception
   */
  @Test
  public void testgetAnimal() throws Exception {
    System.out.print("Testing Method getAnimal... ");
    Vector<Habitat> V1 = new Vector<Habitat>();
    V1.add(new Habitat('~',3,3));
    Cage instance = new Cage(V1);
    Cage instance2 = new Cage(V1);
    Animal[] expResult = instance2.getAnimal();
    Animal[] result = instance.getAnimal();
    assertArrayEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of getHabitat method, of class Cage.
   * @throws java.lang.Exception
   */
  @Test
  public void testgetHabitat() throws Exception {
    System.out.print("Testing Method getHabitat... ");
    Vector<Habitat> V1 = new Vector<Habitat>();
    V1.add(new Habitat('~',3,3));
    Cage instance = new Cage(V1);
    Cage instance2 = new Cage(V1);
    Habitat[] expResult = instance2.getHabitat();
    Habitat[] result = instance.getHabitat();
    assertArrayEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of getNeff method, of class Cage.
   * @throws java.lang.Exception
   */
  @Test
  public void testgetNeff() throws Exception {
    System.out.print("Testing Method getNeff... ");
    Vector<Habitat> V1 = new Vector<Habitat>();
    V1.add(new Habitat('~',3,3));
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
    System.out.print("Testing Mehthod containAnimal... ");
    int x = 3;
    int y = 3;
    Vector<Habitat> V1 = new Vector<Habitat>();
    V1.add(new Habitat('~',3,3));
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
    System.out.print("Testing Method insideCage... ");
    int x = 0;
    int y = 0;
    Vector<Habitat> V1 = new Vector<Habitat>();
    V1.add(new Habitat('~',3,3));
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
    System.out.print("Testing Method isEmpty... ");
    Vector<Habitat> V1 = new Vector<Habitat>();
    V1.add(new Habitat('~',3,3));
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
    System.out.print("Testing Method isFull... ");
    Vector<Habitat> V1 = new Vector<Habitat>();
    V1.add(new Habitat('~',3,3));
    Cage instance = new Cage(V1);
    boolean expResult = true;
    boolean result = instance.isFull();
    assertEquals(expResult, result);
    System.out.println("OK");
  }
  
}
