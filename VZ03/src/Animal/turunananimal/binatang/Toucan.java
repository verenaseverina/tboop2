package Animal.turunananimal.binatang;

import Animal.turunananimal.AirAnimal;
import java.lang.Math;

public class Toucan extends AirAnimal {
  public Toucan(int x, int y, int id) {
    super(x,y,id);
    interaction = "Kwwaakk";
    content = 'T';
    my_weight = 0.592f + (float)(Math.random() * 0.168f + 1);
    how_much_i_eat = 0.5f * my_weight / 100f;
    what_i_eat = 'o';
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

