package Animal.turunananimal;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Winarto on 03/27/2017.
 */
public class LandAnimalTest {
    @Test
    public void getSize() throws Exception {
        System.out.print("Testing Method GetSize...");
        LandAnimal a = new LandAnimal(1, 1, 1) {
            @Override
            public String Interact() {
                return null;
            }
        };
        assertTrue(a.GetSize() == 1);
        System.out.println("OK");
    }

}