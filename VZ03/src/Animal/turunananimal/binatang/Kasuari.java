package animal.turunananimal.binatang;

import java.lang.Math;
import animal.turunananimal.LAAnimal;
public class Kasuari extends LAAnimal {
  public Kasuari(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Arrrrkkkk";
    content = 'Y';
    myWeight = 25f + (float)(Math.random() * 34 + 1);
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
