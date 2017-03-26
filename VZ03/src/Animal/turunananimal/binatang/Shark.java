package Animal.turunananimal.binatang;

import Animal.turunananimal.WaterAnimal;
import java.lang.Math;

public class Shark extends WaterAnimal {
  public Shark(int x, int y, int id) {
    super(x,y,id);
    interaction = "*Wett*";
    content = 'S';
    my_weight = 21500f + (float)(Math.random() * 8500 + 1);
    how_much_i_eat = 0.0667f * my_weight;
    what_i_eat = 'c';
    is_tame = false;
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

