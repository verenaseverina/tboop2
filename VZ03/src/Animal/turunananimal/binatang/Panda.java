package Animal.turunananimal.binatang;

import java.lang.Math;
import Animal.turunananimal.LandAnimal;
public class Panda extends LandAnimal {
  public Panda(int x, int y, int id) {
    super(x,y,id);
    interaction = "Mmmm";
    content = 'B';
    my_weight = 70f + (float)(Math.random() * 30 + 1);
    how_much_i_eat = 38f * my_weight / 100f;
    what_i_eat = 'h';
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
