package animal.turunananimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class LandAnimalTest {
    
    public LandAnimalTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
      System.out.println("Testing LandAnimal Class");
    }

    @After
    public void tearDown() {
      System.out.println();
    }
    
    @Test
    public void getSize() throws Exception {
        System.out.print("Testing Method getSize...");
        LandAnimal a = new LandAnimal(1, 1, 1) {
            public String getInteract() {
                return null;
            }
        };
        assertTrue(a.getSize() == 1);
        System.out.println("OK");
    }

}