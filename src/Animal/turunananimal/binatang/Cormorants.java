package Animal.turunananimal.binatang;

import java.lang.Math;
import Animal.turunananimal.WAAnimal;

public class Cormorants extends WAAnimal {
  public Cormorants(int x, int y, int id) {
    super(x,y,id);
    interaction = "*fly and swim*";
    content = 'M';
    my_weight = 2.5f + (float)(Math.random() * 2.5 + 1);
    how_much_i_eat = 10f * my_weight / 100f;
    what_i_eat = 'c';
    is_tame = true;
  }
  public String Interact() {
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
