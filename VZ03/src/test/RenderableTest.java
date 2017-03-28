/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class RenderableTest {
  
  public RenderableTest() {
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
   * Test of Render method, of class Renderable.
   */
  @Test
  public void testRender() {
    System.out.println("Render");
    Zoo virtual_zoo = null;
    Renderable instance = new Renderable();
    instance.Render(virtual_zoo);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of SearchCageIndex method, of class Renderable.
   */
  @Test
  public void testSearchCageIndex() {
    System.out.println("SearchCageIndex");
    Zoo virtual_zoo = null;
    int x = 0;
    int y = 0;
    Renderable instance = new Renderable();
    int expResult = 0;
    int result = instance.SearchCageIndex(virtual_zoo, x, y);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of SearchAnimalIndex method, of class Renderable.
   */
  @Test
  public void testSearchAnimalIndex() {
    System.out.println("SearchAnimalIndex");
    Zoo virtual_zoo = null;
    int i = 0;
    int x = 0;
    int y = 0;
    Renderable instance = new Renderable();
    int expResult = 0;
    int result = instance.SearchAnimalIndex(virtual_zoo, i, x, y);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
