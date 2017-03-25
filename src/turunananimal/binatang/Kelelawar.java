import java.lang.Math;

public class Kelelawar extends AirAnimal {
  public Kelelawar(int x, int y, int id) {
    super(x,y,id);
    interaction = "Kiiiaaa";
    content = 'K';
    my_weight = 1.2f + (float)(Math.random() * 0.2f + 1);
    how_much_i_eat = my_weight;
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
