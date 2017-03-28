package animal.turunananimal.binatang;

import animal.turunananimal.LwAnimal;
import java.lang.Math;

public class Hippopotamus extends LwAnimal {
  public Hippopotamus(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Grooowwll";
    content = 'N';
    myWeight = 1400f + (float)(Math.random() * 1800 + 1);
    howMuchIEat = 40f * myWeight / 2400f;
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

