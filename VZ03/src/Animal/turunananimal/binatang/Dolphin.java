package Animal.turunananimal.binatang;

import java.lang.Math;
import Animal.turunananimal.WaterAnimal;

public class Dolphin extends WaterAnimal {
  public Dolphin(int x, int y, int id) {
    super(x,y,id);
    interaction = "Cuitttt";
    content = 'L';
    my_weight = 110f + (float)(Math.random() * 90 + 1);
    how_much_i_eat = 2f * my_weight / 20f;
    what_i_eat = 'c';
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
