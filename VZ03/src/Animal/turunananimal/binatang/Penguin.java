package Animal.turunananimal.binatang;

import java.lang.Math;
import Animal.turunananimal.LWAnimal;

public class Penguin extends LWAnimal {
  public Penguin(int x, int y, int id) {
    super(x,y,id);
    interaction = "Sqqqaaa";
    content = 'P';
    my_weight = 27f + (float)(Math.random() * 14 + 1);
    how_much_i_eat = 0.9f * my_weight / 27f;
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

