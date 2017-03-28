package animal.turunananimal.binatang;

import animal.turunananimal.WAAnimal;
import java.lang.Math;

public class Pelikan extends WAAnimal {
  public Pelikan(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Aaaakk";
    content = 'Z';
    myWeight = 2.8f + (float)(Math.random() * 12.2 + 1);
    howMuchIEat = 26.67f * myWeight / 100f;
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


