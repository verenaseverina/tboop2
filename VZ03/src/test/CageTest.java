/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Animal.Animal;
import Cell.turunancell.Habitat;
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
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of GetCageSize method, of class Cage.
   */
  @Test
  public void testGetCageSize() {
    System.out.println("GetCageSize");
    Cage instance = null;
    int expResult = 0;
    int result = instance.GetCageSize();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of GetAnimal method, of class Cage.
   */
  @Test
  public void testGetAnimal() {
    System.out.println("GetAnimal");
    Cage instance = null;
    Animal[] expResult = null;
    Animal[] result = instance.GetAnimal();
    assertArrayEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of GetHabitat method, of class Cage.
   */
  @Test
  public void testGetHabitat() {
    System.out.println("GetHabitat");
    Cage instance = null;
    Habitat[] expResult = null;
    Habitat[] result = instance.GetHabitat();
    assertArrayEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of GetNeff method, of class Cage.
   */
  @Test
  public void testGetNeff() {
    System.out.println("GetNeff");
    Cage instance = null;
    int expResult = 0;
    int result = instance.GetNeff();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of AddAnimal method, of class Cage.
   */
  @Test
  public void testAddAnimal() {
    System.out.println("AddAnimal");
    char animal = ' ';
    int i = 0;
    Cage instance = null;
    instance.AddAnimal(animal, i);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of ContainAnimal method, of class Cage.
   */
  @Test
  public void testContainAnimal() {
    System.out.println("ContainAnimal");
    int x = 0;
    int y = 0;
    Cage instance = null;
    boolean expResult = false;
    boolean result = instance.ContainAnimal(x, y);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of InsideCage method, of class Cage.
   */
  @Test
  public void testInsideCage() {
    System.out.println("InsideCage");
    int x = 0;
    int y = 0;
    Cage instance = null;
    boolean expResult = false;
    boolean result = instance.InsideCage(x, y);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of UpdatePosition method, of class Cage.
   */
  @Test
  public void testUpdatePosition() {
    System.out.println("UpdatePosition");
    Cage instance = null;
    instance.UpdatePosition();
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of IsEmpty method, of class Cage.
   */
  @Test
  public void testIsEmpty() {
    System.out.println("IsEmpty");
    Cage instance = null;
    boolean expResult = false;
    boolean result = instance.IsEmpty();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of IsFull method, of class Cage.
   */
  @Test
  public void testIsFull() {
    System.out.println("IsFull");
    Cage instance = null;
    boolean expResult = false;
    boolean result = instance.IsFull();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
