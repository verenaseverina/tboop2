package animal.turunananimal.binatang;

import animal.turunananimal.AirAnimal;
import java.lang.Math;

public class Toucan extends AirAnimal {
  public Toucan(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Kwwaakk";
    content = 'T';
    myWeight = 0.592f + (float)(Math.random() * 0.168f + 1);
    howMuchIEat = 0.5f * myWeight / 100f;
    whatIEat = 'o';
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

