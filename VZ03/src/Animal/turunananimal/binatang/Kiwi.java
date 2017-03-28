package animal.turunananimal.binatang;

import animal.turunananimal.LAAnimal;
import java.lang.Math;

public class Kiwi extends LAAnimal {
  public Kiwi(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "*walk and fly slightly*";
    content = 'I';
    myWeight = 1f + (float)(Math.random() * 2 + 1);
    howMuchIEat = 5f * myWeight / 100f;
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
