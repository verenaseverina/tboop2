import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * jUnit Kelas Animal.
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
      System.out.println("Testing Animal Class");
    }

    @After
    public void tearDown() {
      System.out.println();
    }
    
    @Test
    public void getTame() throws Exception {
        System.out.print("Testing Method GetTame... ");
        Animal animalTemp = new Animal(1, 1, 1,'H');
        assertTrue(animalTemp.getTame() == false);
        System.out.println("OK");
    }

    @Test
    public void getX() throws Exception {
        System.out.print("Testing Method GetX...");
        Animal animalTemp = new Animal(1, 1, 1, 'H');
        assertTrue(animalTemp.getX() == 1);
        System.out.println("OK");
    }

    @Test
    public void getY() throws Exception {
        System.out.print("Testing Method GetY...");
        Animal animalTemp = new Animal(1, 1, 1, 'H');
        assertTrue(animalTemp.getY() == 1);
        System.out.println("OK");
    }

    @Test
    public void getHab() throws Exception {
        System.out.print("Testing Method GetHab...");
        Animal animalTemp = new Animal(1, 1, 1, 'H');
        assertTrue(animalTemp.getArrayOfHabitat()[0] == '^');
        System.out.println("OK");
    }

    @Test
    public void getContent() throws Exception {
        System.out.print("Testing Method GetContent...");
        Animal animalTemp = new Animal(1, 1, 1, 'H');
        assertTrue(animalTemp.getContent() == 'H');
        System.out.println("OK");
    }

    @Test
    public void move() throws Exception {
        System.out.print("Testing Method Move...");
        Animal animalTemp = new Animal(1, 1, 1, 'H');
        animalTemp.move(1);
        assertTrue(animalTemp.getY() == 0);
        System.out.println("OK");
    }

    @Test
    public void getSize() throws Exception {
        System.out.print("Testing Method GetSize...");
        Animal animalTemp = new Animal(1, 1, 1, 'H');
        assertTrue(animalTemp.getSize() == 1);
        System.out.println("OK");
    }

    @Test
    public void interact() throws Exception {
        System.out.print("Testing Method Interact... ");
        Animal animalTemp = new Animal(1, 1, 1, 'H');
        assertTrue(animalTemp.getInteract().equals("Roooarrrr") == true);
        System.out.println("OK");
    }

    @Test
    public void getWeight() throws Exception {
        System.out.print("Testing Method GetWeight... ");
        Animal animalTemp = new Animal(1, 1, 1, 'H');
        assertTrue(animalTemp.getWeight() >= 90f && animalTemp.getWeight() <= 310f);
        System.out.println("OK");
    }

    @Test
    public void getEat() throws Exception {
        System.out.print("Testing Method GetEat... ");
        Animal animalTemp = new Animal(1, 1, 1, 'H');
        assertTrue(animalTemp.getEat() == 7.23f * animalTemp.getWeight() / 100f);
        System.out.println("OK");
    }

    @Test
    public void getWEat() throws Exception {
        System.out.print("Testing Method GetEat... ");
        Animal animalTemp = new Animal(1, 1, 1, 'H');
        assertTrue(animalTemp.getWEat() == 'c');
        System.out.println("OK");
    }
}