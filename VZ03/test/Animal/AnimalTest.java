package Animal;

import Animal.turunananimal.binatang.Tiger;
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
        System.out.print("Testing Method GetTame... ");
        Animal a = new Tiger(1, 1, 1);
        assertTrue(a.GetTame() == false);
        System.out.println("OK");
    }

    @Test
    public void getX() throws Exception {
        System.out.print("Testing Method GetX...");
        Animal a = new Animal(1, 1, 1) {
            @Override
            public String GetInteract() {
                return null;
            }

            @Override
            public int GetSize() {
                return 0;
            }
        };
        assertTrue(a.GetX() == 1);
        System.out.println("OK");
    }

    @Test
    public void getY() throws Exception {
        System.out.print("Testing Method GetY...");
        Animal a = new Animal(1, 1, 1) {
            @Override
            public String GetInteract() {
                return null;
            }

            @Override
            public int GetSize() {
                return 0;
            }
        };
        assertTrue(a.GetY() == 1);
        System.out.println("OK");
    }

    @Test
    public void getHab() throws Exception {
        System.out.print("Testing Method GetHab...");
        Animal a = new Tiger(1, 1, 1);
        assertTrue(a.GetArrayOfHabitat()[0] == '^');
        System.out.println("OK");
    }

    @Test
    public void getContent() throws Exception {
        System.out.print("Testing Method GetContent...");
        Animal a = new Tiger(1, 1, 1);
        assertTrue(a.GetContent() == 'H');
        System.out.println("OK");
    }

    @Test
    public void move() throws Exception {
        System.out.print("Testing Method Move...");
        Animal a = new Tiger(1, 1, 1);
        a.Move(1);
        assertTrue(a.GetY() == 1);
        System.out.println("OK");
    }

}