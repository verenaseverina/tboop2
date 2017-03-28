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
    System.out.print("Testing Method Render... ");
    Zoo virtualZoo = new Zoo();
    Renderable instance = new Renderable();
    virtualZoo.RandomEntrance();
    instance.Render(virtualZoo);
    System.out.println("OK");
  }

  /**
   * Test of SearchCageIndex method, of class Renderable.
   * @throws java.lang.Exception
   */
  @Test
  public void testSearchCageIndex() throws Exception {
    System.out.print("Testing Method SearchCageIndex... ");
    Zoo virtualZoo = new Zoo();
    int row = 0;
    int col = 0;
    Renderable instance = new Renderable();
    int expResult = -999;
    int result = instance.searchCageIndex(virtualZoo, row, col);
    assertEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of SearchAnimalIndex method, of class Renderable.
   * @throws java.lang.Exception
   */
  @Test
  public void testSearchAnimalIndex() throws Exception {
    System.out.print("Testing Method SearchAnimalIndex... ");
    Zoo virtualZoo = new Zoo();
    int idx = 0;
    int row = 0;
    int col = 0;
    Renderable instance = new Renderable();
    int expResult = 0;
    int result = instance.searchAnimalIndex(virtualZoo, idx, row, col);
    assertEquals(expResult, result);
    System.out.println("OK");
  }
  
}
