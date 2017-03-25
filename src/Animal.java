public class Animal {
  private boolean is_tame;
  private String interaction;
  private int x;
  private int y;
  private char[] hab;
  private char content;
  private int cage_id;
  private float my_weight;
  private float how_much_i_eat;
  private char what_i_eat;

  //public abstract int GetSize();

  //public abstract String Interact();

  public Animal(int _x, int _y, int id) {
    x = _x;
    y = _y;
    cage_id = id;
  }

  public boolean GetTame() {
    return is_tame;
  }

  public int GetX() {
    return y;
  }

  public int GetY() {
    return x;
  }

  public char[] GetHab() {
    return hab;
  }

  public char GetContent() {
    return content;
  }

  public void GiveFood() {
    System.out.println("Animal makan sebanyak" + how_much_i_eat + " kg\n");
  }

  public void Move(int dir) {
    switch(dir) {
      case 1: {//top
        y -= 1;
        break;
      }
      case 2: {//right
        x += 1;
        break;
      }
      case 3:  {//down
        y += 1;
        break;
      }
      case 4: {//left
        x -= 1;
        break;
      }
    }
  }
}
