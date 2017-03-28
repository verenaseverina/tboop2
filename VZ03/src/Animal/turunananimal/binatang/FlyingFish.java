package Animal.turunananimal.binatang;

import java.lang.Math;
import Animal.turunananimal.WAAnimal;
public class FlyingFish extends WAAnimal {
  public FlyingFish(int x, int y, int id) {
    super(x,y,id);
    interaction = "*stride*";
    content = 'F';
    my_weight = 1f + (float)(Math.random() * 6 + 1);
    how_much_i_eat = 5f * my_weight / 100f;
    what_i_eat = 'o';
    is_tame = true;
  }
  public String GetInteract() {
    return interaction;
  }
  public float GetWeight() {
    return my_weight;
  }
  public float GetEat() {
    return how_much_i_eat;
  }
  public char GetWEat() {
    return what_i_eat;
  }
}
