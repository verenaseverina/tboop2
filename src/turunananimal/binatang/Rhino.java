import java.lang.Math;

public class Rhino extends LandAnimal {
  public Rhino(int x, int y, int id) {
    super(x,y,id);
    interaction = "Woooo";
    content = 'R';
    my_weight = 900f + (float)(Math.random() * 1400f + 1);
    how_much_i_eat = 7.23f * my_weight / 100f;
    what_i_eat = 'h';
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
