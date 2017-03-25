import java.lang.Math;

public class ElangB extends AirAnimal {
  public ElangB(int x, int y, int id) {
    super(x,y,id);
    interaction = "Kiiiaaa";
    content = 'E';
    my_weight = 4f + (float)(Math.random() * 2 + 1);
    how_much_i_eat = 0.4535f * my_weight / 4f;
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
