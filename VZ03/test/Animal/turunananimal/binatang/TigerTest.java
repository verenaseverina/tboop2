package Animal.turunananimal.binatang;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Winarto on 03/27/2017.
 */
public class TigerTest {
    @Test
    public void interact() throws Exception {
        System.out.print("Testing Method Interact... ");
        Tiger a = new Tiger(1, 1, 1);
        assertTrue(a.Interact().equals("Roooarrrr") == true);
        System.out.println("OK");
    }

    @Test
    public void getWeight() throws Exception {
        System.out.print("Testing Method GetWeight... ");
        Tiger a = new Tiger(1, 1, 1);
        assertTrue(a.GetWeight() >= 90f && a.GetWeight() <= 310f);
        System.out.println("OK");
    }

    @Test
    public void getEat() throws Exception {
        System.out.print("Testing Method GetEat... ");
        Tiger a = new Tiger(1, 1, 1);
        assertTrue(a.GetEat() == 7.23f * a.GetWeight() / 100f);
        System.out.println("OK");
    }

    @Test
    public void getWEat() throws Exception {
        System.out.print("Testing Method GetEat... ");
        Tiger a = new Tiger(1, 1, 1);
        assertTrue(a.GetWEat() == 'c');
        System.out.println("OK");
    }

}