import org.junit.*;

import java.util.Vector;

import org.junit.*;


import static org.junit.Assert.*;

/**
 * jUnit Kelas Zoo.
 */
public class ZooTest {
    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        System.out.println("Testing Zoo Class");
    }

    @After
    public void tearDown() {
        System.out.println();
    }

    @Test
    public void InitAllCage() throws Exception {
        System.out.print("Testing Method InitAllCage... ");
        Zoo virtualZoo = new Zoo();
        State stateMap = new State();
        virtualZoo.initAllCage(stateMap);
        assertTrue(virtualZoo.getCages().isEmpty());
        System.out.println("OK");
    }

    @Test
    public void InitCage() throws Exception {
        System.out.print("Testing Method InitCage... ");
        Zoo virtualZoo = new Zoo();
        Cell habitatTemp = new Cell('~',0,0);
        assertTrue('~' == virtualZoo.initCage(habitatTemp).get(0).getCellContent());
        System.out.println("OK");
    }

    @Test
    public void InCage() throws Exception {
        System.out.print("Testing Method InCage... ");
        Zoo virtualZoo = new Zoo();
        Cell habitatTemp = new Cell('~',0,0);
        assertTrue(virtualZoo.inCage(virtualZoo.initCage(habitatTemp), new Cell('~',0,0)));
        System.out.println("OK");
    }

    @Test
    public void GetMap() throws Exception {
        System.out.print("Testing Method GetMap... ");
        Zoo virtualZoo = new Zoo();
        assertTrue(virtualZoo.getMap()[0][0].getCellContent() == '~');
        System.out.println("OK");
    }

    @Test
    public void GetHeight() throws Exception {
        System.out.print("Testing Method GetHeight... ");
        Zoo virtualZoo = new Zoo();
        assertTrue(virtualZoo.getHeight()>0);
        System.out.println("OK");
    }

    @Test
    public void GetWidth() throws Exception {
        System.out.print("Testing Method GetWidth... ");
        Zoo virtualZoo = new Zoo();
        assertTrue(virtualZoo.getWidth()>0);
        System.out.println("OK");
    }

    @Test
    public void GetPlayerPos() throws Exception {
        System.out.print("Testing Method GetPlayerPos... ");
        Zoo virtualZoo = new Zoo();
        virtualZoo.randomEntrance();
        assertTrue(virtualZoo.getPlayerPos().getCellCol() >=0 && virtualZoo.getPlayerPos().getCellRow() >= 0);
        System.out.println("OK");
    }

    @Test
    public void Tour() throws Exception {
        System.out.print("Testing Method Tour... ");
        Zoo virtualZoo = new Zoo();
        virtualZoo.randomEntrance();
        virtualZoo.tour();
        System.out.println("OK");
    }

    @Test
    public void TourInteract() throws Exception {
        System.out.print("Testing Method TourInteract... ");
        Zoo virtualZoo = new Zoo();
        virtualZoo.randomEntrance();
        virtualZoo.tourInteract(virtualZoo.getMap()[0][0]);
        System.out.println("OK");
    }

    @Test
    public void RandomEntrance() throws Exception {
        System.out.print("Testing Method RandomEntrance... ");
        Zoo virtualZoo = new Zoo();
        virtualZoo.randomEntrance();
        System.out.println("OK");
    }

    @Test
    public void IsExit() throws Exception {
        System.out.print("Testing Method IsExit... ");
        Zoo virtualZoo = new Zoo();
        virtualZoo.randomEntrance();
        assertTrue(virtualZoo.isExit(virtualZoo.getMap()[7][7]));
        System.out.println("OK");
    }

    @Test
    public void IsPlayer() throws Exception {
        System.out.print("Testing Method IsPlayer... ");
        Zoo virtualZoo = new Zoo();
        virtualZoo.randomEntrance();
        assertTrue(virtualZoo.isPlayer(virtualZoo.getPlayerPos().getCellRow(), virtualZoo.getPlayerPos().getCellCol()));
        System.out.println("OK");
    }

    @Test
    public void IsRoad() throws Exception {
        System.out.print("Testing Method IsRoad... ");
        Zoo virtualZoo = new Zoo();
        assertTrue(virtualZoo.isRoad(virtualZoo.getMap()[7][0]));
        System.out.println("OK");
    }

    @Test
    public void IsHabitat() throws Exception {
        System.out.print("Testing Method IsHabitat... ");
        Zoo virtualZoo = new Zoo();
        assertTrue(virtualZoo.isHabitat('~'));
        System.out.println("OK");

    }

    @Test
    public void IsFacility() throws Exception {
        System.out.print("Testing Method IsFacility... ");
        Zoo virtualZoo = new Zoo();
        assertTrue(virtualZoo.isFacility('#'));
        System.out.println("OK");
    }

}