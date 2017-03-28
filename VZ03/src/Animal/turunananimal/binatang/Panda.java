package animal.turunananimal.binatang;

import animal.turunananimal.LandAnimal;
import java.lang.Math;

public class Panda extends LandAnimal {
  public Panda(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Mmmm";
    content = 'B';
    myWeight = 70f + (float)(Math.random() * 30 + 1);
    howMuchIEat = 38f * myWeight / 100f;
    whatIEat = 'h';
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
