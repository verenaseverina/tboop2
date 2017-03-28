package animal.turunananimal.binatang;

import animal.turunananimal.LandAnimal;
import java.lang.Math;

public class Rhino extends LandAnimal {
  public Rhino(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Woooo";
    content = 'R';
    myWeight = 900f + (float)(Math.random() * 1400f + 1);
    howMuchIEat = 7.23f * myWeight / 100f;
    whatIEat = 'h';
    isTame = false;
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

