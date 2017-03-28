package animal.turunananimal.binatang;

import animal.turunananimal.LandAnimal;
import java.lang.Math;

public class Anoa extends LandAnimal {
  public Anoa(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Grrrr";
    content = 'A';
    myWeight = 150f + (float)(Math.random() * 150 + 1);
    howMuchIEat = 5f * myWeight / 100f;
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