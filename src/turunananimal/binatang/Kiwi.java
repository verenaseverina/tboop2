import java.lang.Math;

public class Kiwi extends LAAnimal {
  public Kiwi(int x, int y, int id) {
    super(x,y,id);
    interaction = "*walk and fly slightly*";
    content = 'I';
    my_weight = 1f + (float)(Math.random() * 2 + 1);
    how_much_i_eat = 5f * my_weight / 100f;
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
