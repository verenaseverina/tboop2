import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class StateTest {

  public StateTest() {
  }

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
    System.out.println("Testing State Class");
  }

  @After
  public void tearDown() {
    System.out.println();
  }

  /**
   * Test of GetMap method, of class State.
   * @throws java.lang.Exception
   */
  @Test
  public void testGetMap() throws Exception {
    System.out.print("Testing Method GetMap... ");
    State instance = new State();
    State instance2 = new State();
    char[][] expResult = instance2.GetMap();
    char[][] result = instance.GetMap();
    assertArrayEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of GetHeight method, of class State.
   * @throws java.lang.Exception
   */
  @Test
  public void testGetHeight() throws Exception {
    System.out.print("Testing Method GetHeight... ");
    State instance = new State();
    int expResult = 8;
    int result = instance.GetHeight();
    assertEquals(expResult, result);
    System.out.println("OK");
  }

  /**
   * Test of GetWidth method, of class State.
   * @throws java.lang.Exception
   */
  @Test
  public void testGetWidth() throws Exception {
    System.out.print("Testing Method GetWidth... ");
    State instance = new State();
    int expResult = 8;
    int result = instance.GetWidth();
    assertEquals(expResult, result);
    System.out.println("OK");
  }
  
}
