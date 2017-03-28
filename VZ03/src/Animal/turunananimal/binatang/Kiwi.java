package animal.turunananimal.binatang;

import java.lang.Math;
import animal.turunananimal.LAAnimal;
public class Kiwi extends LAAnimal {
  public Kiwi(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "*walk and fly slightly*";
    content = 'I';
    myWeight = 1f + (float)(Math.random() * 2 + 1);
    howMuchIEat = 5f * myWeight / 100f;
    whatIEat = 'o';
    isTame = true;
  }
  public String GetInteract() {
    return interaction;
  }
  public float GetWeight() {
    return myWeight;
  }
  public float GetEat() {
    return howMuchIEat;
  }
  public char GetWEat() {
    return whatiEat;
  }
}
