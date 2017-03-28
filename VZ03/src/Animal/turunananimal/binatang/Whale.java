package animal.turunananimal.binatang;

import animal.turunananimal.WaterAnimal;
import java.lang.Math;

public class Whale extends WaterAnimal {
  public Whale(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "*Wet*";
    content = 'W';
    myWeight = 14000f + (float)(Math.random() * 2000 + 1);
    howMuchIEat = 0.667f * myWeight;
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
