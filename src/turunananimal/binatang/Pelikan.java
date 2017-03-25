import java.lang.Math;

public class Pelikan extends WAAnimal {
  public Pelikan(int x, int y, int id) {
    super(x,y,id);
    interaction = "Aaaakk";
    content = 'Z';
    my_weight = 2.8f + (float)(Math.random() * 12.2 + 1);
    how_much_i_eat = 26.67f * my_weight / 100f;
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
