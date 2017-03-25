import java.lang.Math;

public class Tiger extends LandAnimal {
  public Tiger(int x, int y, int id) {
    super(x,y,id);
    interaction = "Roooarrrr";
    content = 'H';
    my_weight = 90f + (float)(Math.random() * 220 + 1);
    how_much_i_eat = 7.23f * my_weight / 100f;
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
