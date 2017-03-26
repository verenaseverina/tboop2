package Animal;

public abstract class Animal {
  protected boolean is_tame;
  protected String interaction;
  protected int x;
  protected int y;
  protected char[] hab;
  protected char content;
  protected int cage_id;
  protected float my_weight;
  protected float how_much_i_eat;
  protected char what_i_eat;

  public Animal(int _x, int _y, int id) {
    x = _x;
    y = _y;
    cage_id = id;
  }

  public abstract String Interact();

  public abstract int GetSize();

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

