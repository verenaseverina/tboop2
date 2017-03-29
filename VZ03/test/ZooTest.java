import animal.turunananimal.binatang.Tiger;
import cell.*;
import cell.turunancell.*;
import org.junit.*;
import state.State;

import java.util.Vector;

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
    public void initAllCage() throws Exception {
        System.out.print("Testing Method InitAllCage... ");
        Zoo virtualZoo = new Zoo();
        State stateMap = new State();
        virtualZoo.initAllCage(stateMap);
        assertTrue(virtualZoo.getCages().get(0).isEmpty());
        System.out.println("OK");
    }

    @Test
    public void initCage() throws Exception {
        System.out.print("Testing Method InitCage... ");
        Zoo virtualZoo = new Zoo();
        Habitat habitatTemp = new Habitat('~',0,0);
        assertTrue(virtualZoo.initCage(habitatTemp).get(0).getCellContent() == '~');
        System.out.println("OK");
    }

    @Test
    public void inCage() throws Exception {
        System.out.print("Testing Method InCage... ");
        Zoo virtualZoo = new Zoo();
        Habitat habitatTemp = new Habitat('~',0,0);
        assertTrue(virtualZoo.inCage(virtualZoo.initCage(habitatTemp), new Cell('~',0,0)));
        System.out.println("OK");
    }

    @Test
    public void getMap() throws Exception {
        System.out.print("Testing Method GetMap... ");
        Zoo virtualZoo = new Zoo();
        assertTrue(virtualZoo.getMap()[0][0].getCellContent() == '~');
        System.out.println("OK");
    }

    @Test
    public void getCages() throws Exception {
        System.out.print("Testing Method GetCages... ");
        Zoo virtualZoo = new Zoo();
        assertTrue(virtualZoo.getCages().get(0).isEmpty());
        System.out.println("OK");
    }

    @Test
    public void getHeight() throws Exception {
        System.out.print("Testing Method GetHeight... ");
        Zoo virtualZoo = new Zoo();
        assertTrue(virtualZoo.getHeight()>0);
        System.out.println("OK");
    }

    @Test
    public void getWidth() throws Exception {
        System.out.print("Testing Method GetWidth... ");
        Zoo virtualZoo = new Zoo();
        assertTrue(virtualZoo.getWidth()>0);
        System.out.println("OK");
    }

    @Test
    public void getPlayerPos() throws Exception {
        System.out.print("Testing Method GetPlayerPos... ");
        Zoo virtualZoo = new Zoo();
        virtualZoo.randomEntrance();
        assertTrue(virtualZoo.getPlayerPos().getCellCol() >=0 && virtualZoo.getPlayerPos().getCellRow() >= 0);
        System.out.println("OK");
    }

    @Test
    public void checkCage() throws Exception {
        System.out.print("Testing Method CheckCage... ");
        Zoo virtualZoo = new Zoo();
        Tiger animalTemp = new Tiger(0,0,0);
        boolean[] arr = new boolean[5];
        for (int iidx = 0; iidx < 5; iidx++) {
            arr[iidx] = false;
        }
        virtualZoo.randomEntrance();
        virtualZoo.checkCage(arr,animalTemp);
        System.out.println("OK");
    }

    @Test
    public void tour() throws Exception {
        System.out.print("Testing Method Tour... ");
        Zoo virtualZoo = new Zoo();
        virtualZoo.randomEntrance();
        virtualZoo.tour();
        System.out.println("OK");
    }

    @Test
    public void tourInteract() throws Exception {
        System.out.print("Testing Method TourInteract... ");
        Zoo virtualZoo = new Zoo();
        virtualZoo.randomEntrance();
        virtualZoo.tourInteract(virtualZoo.getMap()[0][0]);
        System.out.println("OK");
    }

    @Test
    public void randomEntrance() throws Exception {
        System.out.print("Testing Method RandomEntrance... ");
        Zoo virtualZoo = new Zoo();
        virtualZoo.randomEntrance();
        System.out.println("OK");
    }

    @Test
    public void isExit() throws Exception {
        System.out.print("Testing Method IsExit... ");
        Zoo virtualZoo = new Zoo();
        virtualZoo.randomEntrance();
        assertTrue(virtualZoo.isExit(virtualZoo.getMap()[7][7]));
        System.out.println("OK");
    }

    @Test
    public void isPlayer() throws Exception {
        System.out.print("Testing Method IsPlayer... ");
        Zoo virtualZoo = new Zoo();
        virtualZoo.randomEntrance();
        assertTrue(virtualZoo.isPlayer(virtualZoo.getPlayerPos().getCellRow(), virtualZoo.getPlayerPos().getCellCol()));
        System.out.println("OK");
    }

    @Test
    public void isRoad() throws Exception {
        System.out.print("Testing Method IsRoad... ");
        Zoo virtualZoo = new Zoo();
        assertTrue(virtualZoo.isRoad(virtualZoo.getMap()[7][0]));
        System.out.println("OK");
    }

    @Test
    public void isHabitat() throws Exception {
        System.out.print("Testing Method IsHabitat... ");
        Zoo virtualZoo = new Zoo();
        assertTrue(virtualZoo.isHabitat('~'));
        System.out.println("OK");

    }

    @Test
    public void isFacility() throws Exception {
        System.out.print("Testing Method IsFacility... ");
        Zoo virtualZoo = new Zoo();
        assertTrue(virtualZoo.isFacility('#'));
        System.out.println("OK");
    }

}