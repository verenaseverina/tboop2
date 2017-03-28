package animal.turunananimal.binatang;

import animal.turunananimal.WAAnimal;
import java.lang.Math;

public class Cormorants extends WAAnimal {
  public Cormorants(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "*fly and swim*";
    content = 'M';
    myWeight = 2.5f + (float)(Math.random() * 2.5 + 1);
    howMuchIEat = 10f * myWeight / 100f;
    whatIEat = 'c';
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
