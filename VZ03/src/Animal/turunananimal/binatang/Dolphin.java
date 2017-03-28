package animal.turunananimal.binatang;

import animal.turunananimal.WaterAnimal;
import java.lang.Math;

public class Dolphin extends WaterAnimal {
  public Dolphin(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Cuitttt";
    content = 'L';
    myWeight = 110f + (float)(Math.random() * 90 + 1);
    howMuchIEat = 2f * myWeight / 20f;
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
