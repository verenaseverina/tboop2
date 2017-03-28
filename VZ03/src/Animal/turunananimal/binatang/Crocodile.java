package animal.turunananimal.binatang;

import animal.turunananimal.LwAnimal;
import java.lang.Math;

public class Crocodile extends LwAnimal {
  public Crocodile(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Rrrrr";
    content = 'C';
    myWeight = 400f + (float)(Math.random() * 300 + 1);
    howMuchIEat = 2f * myWeight / 700f;
    whatIEat = 'c';
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
