import org.junit.*;

import java.util.Vector;

import org.junit.*;


import static org.junit.Assert.*;

/**
 * Created by Winarto on 03/29/2017.
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
        virtualZoo.InitAllCage(stateMap);
        assertTrue(virtualZoo.GetCages().isEmpty());
        System.out.println("OK");
    }

    @Test
    public void InitCage() throws Exception {
        System.out.print("Testing Method InitCage... ");
        Zoo virtualZoo = new Zoo();
        Cell habitatTemp = new Cell('~',0,0);
        assertTrue('~' == virtualZoo.InitCage(habitatTemp).get(0).GetCellContent());
        System.out.println("OK");
    }

    @Test
    public void InCage() throws Exception {
        System.out.print("Testing Method InCage... ");
        Zoo virtualZoo = new Zoo();
        Cell habitatTemp = new Cell('~',0,0);
        assertTrue(virtualZoo.InCage(virtualZoo.InitCage(habitatTemp), new Cell('~',0,0)));
        System.out.println("OK");
    }

    @Test
    public void GetMap() throws Exception {
        System.out.print("Testing Method GetMap... ");
        Zoo virtualZoo = new Zoo();
        assertTrue(virtualZoo.GetMap()[0][0].GetCellContent() == '~');
        System.out.println("OK");
    }

    @Test
    public void GetHeight() throws Exception {
        System.out.print("Testing Method GetHeight... ");
        Zoo virtualZoo = new Zoo();
        assertTrue(virtualZoo.GetHeight()>0);
        System.out.println("OK");
    }

    @Test
    public void GetWidth() throws Exception {
        System.out.print("Testing Method GetWidth... ");
        Zoo virtualZoo = new Zoo();
        assertTrue(virtualZoo.GetWidth()>0);
        System.out.println("OK");
    }

    @Test
    public void GetPlayerPos() throws Exception {
        System.out.print("Testing Method GetPlayerPos... ");
        Zoo virtualZoo = new Zoo();
        virtualZoo.RandomEntrance();
        assertTrue(virtualZoo.GetPlayerPos().GetCellCol() >=0 && virtualZoo.GetPlayerPos().GetCellRow() >= 0);
        System.out.println("OK");
    }

    @Test
    public void Tour() throws Exception {
        System.out.print("Testing Method Tour... ");
        Zoo virtualZoo = new Zoo();
        virtualZoo.RandomEntrance();
        virtualZoo.Tour();
        System.out.println("OK");
    }

    @Test
    public void TourInteract() throws Exception {
        System.out.print("Testing Method TourInteract... ");
        Zoo virtualZoo = new Zoo();
        virtualZoo.RandomEntrance();
        virtualZoo.TourInteract(virtualZoo.GetMap()[0][0]);
        System.out.println("OK");
    }

    @Test
    public void RandomEntrance() throws Exception {
        System.out.print("Testing Method RandomEntrance... ");
        Zoo virtualZoo = new Zoo();
        virtualZoo.RandomEntrance();
        System.out.println("OK");
    }

    @Test
    public void IsExit() throws Exception {
        System.out.print("Testing Method IsExit... ");
        Zoo virtualZoo = new Zoo();
        virtualZoo.RandomEntrance();
        assertTrue(virtualZoo.IsExit(virtualZoo.GetMap()[7][7]));
        System.out.println("OK");
    }

    @Test
    public void IsPlayer() throws Exception {
        System.out.print("Testing Method IsPlayer... ");
        Zoo virtualZoo = new Zoo();
        virtualZoo.RandomEntrance();
        assertTrue(virtualZoo.IsPlayer(virtualZoo.GetPlayerPos().GetCellRow(), virtualZoo.GetPlayerPos().GetCellCol()));
        System.out.println("OK");
    }

    @Test
    public void IsRoad() throws Exception {
        System.out.print("Testing Method IsRoad... ");
        Zoo virtualZoo = new Zoo();
        assertTrue(virtualZoo.IsRoad(virtualZoo.GetMap()[7][0]));
        System.out.println("OK");
    }

    @Test
    public void IsHabitat() throws Exception {
        System.out.print("Testing Method IsHabitat... ");
        Zoo virtualZoo = new Zoo();
        assertTrue(virtualZoo.IsHabitat('~'));
        System.out.println("OK");

    }

    @Test
    public void IsFacility() throws Exception {
        System.out.print("Testing Method IsFacility... ");
        Zoo virtualZoo = new Zoo();
        assertTrue(virtualZoo.IsFacility('#'));
        System.out.println("OK");
    }

}