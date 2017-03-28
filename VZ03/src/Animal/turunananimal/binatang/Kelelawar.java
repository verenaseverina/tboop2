package animal.turunananimal.binatang;

import animal.turunananimal.AirAnimal;
import java.lang.Math;

public class Kelelawar extends AirAnimal {
  public Kelelawar(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Kiiiaaa";
    content = 'K';
    myWeight = 1.2f + (float)(Math.random() * 0.2f + 1);
    howMuchIEat = myWeight;
    whatIEat = 'o';
    isTame = true;
  }

  public String getInteract() {
    return interaction;
  }

  public float getWeight() {
    return myWeight;
  }

  public float getEat() {
    return howMuchIEat;
  }

  public char getWEat() {
    return whatIEat;
  }
}

