package Animal.turunananimal.binatang;

import java.lang.Math;
import Animal.turunananimal.LWAnimal;

public class Crocodile extends LWAnimal {
  public Crocodile(int x, int y, int id) {
    super(x,y,id);
    interaction = "Rrrrr";
    content = 'C';
    my_weight = 400f + (float)(Math.random() * 300 + 1);
    how_much_i_eat = 2f * my_weight / 700f;
    what_i_eat = 'c';
    is_tame = false;
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
