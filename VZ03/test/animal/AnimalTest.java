package animal;

import animal.turunananimal.binatang.Tiger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

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
      System.out.println("Testing Animal Class");
    }

    @After
    public void tearDown() {
      System.out.println();
    }
    
    @Test
    public void getTame() throws Exception {
        System.out.print("Testing Method getTame... ");
        Animal a = new Tiger(1, 1, 1);
        assertTrue(a.getTame() == false);
        System.out.println("OK");
    }

    @Test
    public void getX() throws Exception {
        System.out.print("Testing Method getX...");
        Animal a = new Animal(1, 1, 1) {
            @Override
            public String getInteract() {
                return null;
            }

            @Override
            public int getSize() {
                return 0;
            }
        };
        assertTrue(a.getX() == 1);
        System.out.println("OK");
    }

    @Test
    public void getY() throws Exception {
        System.out.print("Testing Method getY...");
        Animal a = new Animal(1, 1, 1) {
            @Override
            public String getInteract() {
                return null;
            }

            @Override
            public int getSize() {
                return 0;
            }
        };
        assertTrue(a.getY() == 1);
        System.out.println("OK");
    }

    @Test
    public void getHab() throws Exception {
        System.out.print("Testing Method getHab...");
        Animal a = new Tiger(1, 1, 1);
        assertTrue(a.getArrayOfHabitat()[0] == '^');
        System.out.println("OK");
    }

    @Test
    public void getContent() throws Exception {
        System.out.print("Testing Method getContent...");
        Animal a = new Tiger(1, 1, 1);
        assertTrue(a.getContent() == 'H');
        System.out.println("OK");
    }

    @Test
    public void move() throws Exception {
        System.out.print("Testing Method Move...");
        Animal a = new Tiger(1, 1, 1);
        a.move(1);
        assertTrue(a.getY() == 1);
        System.out.println("OK");
    }

}