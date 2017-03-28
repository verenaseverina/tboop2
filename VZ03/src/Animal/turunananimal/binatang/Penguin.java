package animal.turunananimal.binatang;

import animal.turunananimal.LwAnimal;
import java.lang.Math;

public class Penguin extends LwAnimal {
  public Penguin(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Sqqqaaa";
    content = 'P';
    myWeight = 27f + (float)(Math.random() * 14 + 1);
    howMuchIEat = 0.9f * myWeight / 27f;
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

