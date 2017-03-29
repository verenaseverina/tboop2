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
    System.out.println("Testing Renderable class");
  }
  
  @After
  public void tearDown() {
    System.out.println();
  }

  /**
   * Test of Render method, of class Renderable.
   * @throws java.lang.Exception
   */
  @Test
  public void testRender() throws Exception {
    System.out.print("Testing Method render... ");
    Zoo virtual_zoo = null;
    Renderable instance = new Renderable();
    instance.render(virtual_zoo);
    System.out.println("OK");
  }

  /**
   * Test of SearchCageIndex method, of class Renderable.
   * @throws java.lang.Exception
   */
  @Test
  public void testSearchCageIndex() throws Exception {
    System.out.print("Testing Method searchCageIndex... ");
    Zoo virtual_zoo = null;
    int x = 0;
    int y = 0;
    Renderable instance = new Renderable();
    int expResult = 0;
    int result = instance.searchCageIndex(virtual_zoo, x, y);
    assertEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of SearchAnimalIndex method, of class Renderable.
   * @throws java.lang.Exception
   */
  @Test
  public void testSearchAnimalIndex() throws Exception {
    System.out.print("Testing Method searchAnimalIndex... ");
    Zoo virtual_zoo = null;
    int i = 0;
    int x = 0;
    int y = 0;
    Renderable instance = new Renderable();
    int expResult = 0;
    int result = instance.searchAnimalIndex(virtual_zoo, i, x, y);
    assertEquals(expResult, result);
    System.out.println("OK");
  }
  
}
