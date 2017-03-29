package animal.turunananimal.binatang;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * Created by Winarto on 03/27/2017.
 */
public class TigerTest {
    
    public TigerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
      System.out.println("Testing Tiger Class");
    }

    @After
    public void tearDown() {
      System.out.println();
    }
    
    @Test
    public void interact() throws Exception {
        System.out.print("Testing Method Interact... ");
        Tiger a = new Tiger(1, 1, 1);
        assertTrue(a.getInteract().equals("Roooarrrr") == true);
        System.out.println("OK");
    }

    @Test
    public void getWeight() throws Exception {
        System.out.print("Testing Method getWeight... ");
        Tiger a = new Tiger(1, 1, 1);
        assertTrue(a.getWeight() >= 90f && a.getWeight() <= 310f);
        System.out.println("OK");
    }

    @Test
    public void getEat() throws Exception {
        System.out.print("Testing Method getEat... ");
        Tiger a = new Tiger(1, 1, 1);
        assertTrue(a.getEat() == 7.23f * a.getWeight() / 100f);
        System.out.println("OK");
    }

    @Test
    public void getWEat() throws Exception {
        System.out.print("Testing Method getEat... ");
        Tiger a = new Tiger(1, 1, 1);
        assertTrue(a.getWEat() == 'c');
        System.out.println("OK");
    }

}