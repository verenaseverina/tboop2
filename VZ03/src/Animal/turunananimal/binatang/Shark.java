package animal.turunananimal.binatang;

import animal.turunananimal.WaterAnimal;
import java.lang.Math;

public class Shark extends WaterAnimal {
  public Shark(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "*Wett*";
    content = 'S';
    myWeight = 21500f + (float)(Math.random() * 8500 + 1);
    howMuchIEat = 0.0667f * myWeight;
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

