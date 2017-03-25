import java.lang.Math;

public class Anoa extends LandAnimal {
  public Anoa(int x, int y, int id) {
    super(x,y,id);
    interaction = "Grrrr";
    content = 'A';
    my_weight = 150f + (float)(Math.random() * 150 + 1);
    how_much_i_eat = 5f * my_weight / 100f;
    what_i_eat = 'h';
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
