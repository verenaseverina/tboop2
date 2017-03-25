import java.lang.Math;

public class Whale extends WaterAnimal {
  public Whale(int x, int y, int id) {
    super(x,y,id);
    interaction = "*Wet*";
    content = 'W';
    my_weight = 14000f + (float)(Math.random() * 2000 + 1);
    how_much_i_eat = 0.667f * my_weight;
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
