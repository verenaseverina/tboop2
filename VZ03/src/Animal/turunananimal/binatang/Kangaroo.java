package animal.turunananimal.binatang;

import java.lang.Math;
import animal.turunananimal.LandAnimal;
public class Kangaroo extends LandAnimal {
  public Kangaroo(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "*Jummpp*";
    content = 'D';
    myWeight = 18f + (float)(Math.random() * 72 + 1);
    howMuchIEat = 0.35f * myWeight / 100f;
    whatIEat = 'h';
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

