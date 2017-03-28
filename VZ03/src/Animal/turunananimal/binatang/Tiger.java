package animal.turunananimal.binatang;

import animal.turunananimal.LandAnimal;
import java.lang.Math;

public class Tiger extends LandAnimal {
  public Tiger(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Roooarrrr";
    content = 'H';
    myWeight = 90f + (float)(Math.random() * 220 + 1);
    howMuchIEat = 7.23f * myWeight / 100f;
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

