package Animal.turunananimal.binatang;

import java.lang.Math;
import Animal.turunananimal.LAAnimal;
public class Ostrich extends LAAnimal {
  public Ostrich(int x, int y, int id) {
    super(x,y,id);
    interaction = "Nguuukkk";
    content = 'O';
    my_weight = 25f + (float)(Math.random() * 34 + 1);
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
