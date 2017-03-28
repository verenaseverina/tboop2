package animal.turunananimal.binatang;

import animal.turunananimal.AirAnimal;
import java.lang.Math;

public class ElangB extends AirAnimal {
  public ElangB(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Kiiiaaa";
    content = 'E';
    myWeight = 4f + (float)(Math.random() * 2 + 1);
    howMuchIEat = 0.4535f * myWeight / 4f;
    whatIEat = 'c';
    isTame = true;
  }

  @Override

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

