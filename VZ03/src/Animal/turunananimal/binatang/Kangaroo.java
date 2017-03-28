package Animal.turunananimal.binatang;

import java.lang.Math;
import Animal.turunananimal.LandAnimal;

public class Kangaroo extends LandAnimal {
  public Kangaroo(int x, int y, int id) {
    super(x,y,id);
    interaction = "*Jummpp*";
    content = 'D';
    my_weight = 18f + (float)(Math.random() * 72 + 1);
    how_much_i_eat = 0.35f * my_weight / 100f;
    what_i_eat = 'h';
    is_tame = true;
  }
  @Override
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

