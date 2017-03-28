/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

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
public class AnimalTest {
  
  public AnimalTest() {
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
   * Test of GetInteract method, of class Animal.
   */
  @Test
  public void testGetInteract() {
    System.out.println("GetInteract");
    Animal instance = null;
    String expResult = "";
    String result = instance.GetInteract();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of GetSize method, of class Animal.
   */
  @Test
  public void testGetSize() {
    System.out.println("GetSize");
    Animal instance = null;
    int expResult = 0;
    int result = instance.GetSize();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of GetTame method, of class Animal.
   */
  @Test
  public void testGetTame() {
    System.out.println("GetTame");
    Animal instance = null;
    boolean expResult = false;
    boolean result = instance.GetTame();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of GetX method, of class Animal.
   */
  @Test
  public void testGetX() {
    System.out.println("GetX");
    Animal instance = null;
    int expResult = 0;
    int result = instance.GetX();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of GetY method, of class Animal.
   */
  @Test
  public void testGetY() {
    System.out.println("GetY");
    Animal instance = null;
    int expResult = 0;
    int result = instance.GetY();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of GetArrayOfHabitat method, of class Animal.
   */
  @Test
  public void testGetArrayOfHabitat() {
    System.out.println("GetArrayOfHabitat");
    Animal instance = null;
    char[] expResult = null;
    char[] result = instance.GetArrayOfHabitat();
    assertArrayEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of GetContent method, of class Animal.
   */
  @Test
  public void testGetContent() {
    System.out.println("GetContent");
    Animal instance = null;
    char expResult = ' ';
    char result = instance.GetContent();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of GiveFood method, of class Animal.
   */
  @Test
  public void testGiveFood() {
    System.out.println("GiveFood");
    Animal instance = null;
    instance.GiveFood();
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of Move method, of class Animal.
   */
  @Test
  public void testMove() {
    System.out.println("Move");
    int dir = 0;
    Animal instance = null;
    instance.Move(dir);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  public class AnimalImpl extends Animal {

    public AnimalImpl() {
      super(0, 0, 0);
    }

    public String GetInteract() {
      return "";
    }

    public int GetSize() {
      return 0;
    }
  }
  
}
