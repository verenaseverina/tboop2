/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import Animal.Animal;
//import Cell.turunancell.Habitat;
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
    Vector<Habitat> V1 = new Vector<Habitat>();
    V1.add(new Habitat('~',3,3));
    Cage instance = new Cage(V1);
    int expResult = 1;
    int result = instance.GetCageSize();
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
    Vector<Habitat> V1 = new Vector<Habitat>();
    V1.add(new Habitat('~',3,3));
    Cage instance = new Cage(V1);
    Cage instance2 = new Cage(V1);
    Animal[] expResult = instance2.GetAnimal();
    Animal[] result = instance.GetAnimal();
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
    Vector<Habitat> V1 = new Vector<Habitat>();
    V1.add(new Habitat('~',3,3));
    Cage instance = new Cage(V1);
    Cage instance2 = new Cage(V1);
    Habitat[] expResult = instance2.GetHabitat();
    Habitat[] result = instance.GetHabitat();
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
    Vector<Habitat> V1 = new Vector<Habitat>();
    V1.add(new Habitat('~',3,3));
    Cage instance = new Cage(V1);
    int expResult = -1;
    int result = instance.GetNeff();
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
    Vector<Habitat> V1 = new Vector<Habitat>();
    V1.add(new Habitat('~',3,3));
    Cage instance = new Cage(V1);
    boolean expResult = false;
    boolean result = instance.ContainAnimal(x, y);
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
    Vector<Habitat> V1 = new Vector<Habitat>();
    V1.add(new Habitat('~',3,3));
    Cage instance = new Cage(V1);
    boolean expResult = false;
    boolean result = instance.InsideCage(x, y);
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
    Vector<Habitat> V1 = new Vector<Habitat>();
    V1.add(new Habitat('~',3,3));
    Cage instance = new Cage(V1);
    boolean expResult = true;
    boolean result = instance.IsEmpty();
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
    Vector<Habitat> V1 = new Vector<Habitat>();
    V1.add(new Habitat('~',3,3));
    Cage instance = new Cage(V1);
    boolean expResult = true;
    boolean result = instance.IsFull();
    assertEquals(expResult, result);
    System.out.println("OK");
  }
  
}
