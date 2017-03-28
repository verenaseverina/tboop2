package animal.turunananimal.binatang;

import java.lang.Math;
import animal.turunananimal.WAAnimal;
public class FlyingFish extends WAAnimal {
  public FlyingFish(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "*stride*";
    content = 'F';
    myWeight = 1f + (float)(Math.random() * 6 + 1);
    howMuchIEat = 5f * myWeight / 100f;
    whatIEat = 'o';
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
