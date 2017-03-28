package Animal.turunananimal.binatang;

import java.lang.Math;
import Animal.turunananimal.LWAnimal;
public class Hippopotamus extends LWAnimal {
  public Hippopotamus(int x, int y, int id) {
    super(x,y,id);
    interaction = "Grooowwll";
    content = 'N';
    my_weight = 1400f + (float)(Math.random() * 1800 + 1);
    how_much_i_eat = 40f * my_weight / 2400f;
    what_i_eat = 'h';
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

