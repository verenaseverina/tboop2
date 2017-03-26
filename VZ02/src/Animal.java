/**
 * Created by verenaseverina on 3/26/17.
 */
public class Animal {
  private String interaction;
  private char content;
  private int x;
  private int y;
  private int cage_id;
  private float my_weight;
  private float how_much_i_eat;
  private char what_i_eat;
  private boolean is_tame;
  private char[] array_of_habitat;
  private int size_of_habitat;

  public Animal(int _x, int _y, int id,char con) {
    x = _x;
    y = _y;
    cage_id = id;
    content = con;

    switch(content) {
      case 'H': {
        size_of_habitat = 1;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '^';

        interaction = "Roooarrrr";
        my_weight = 90f + (float)(Math.random() * 220 + 1);
        how_much_i_eat = 7.23f * my_weight / 100f;
        what_i_eat = 'c';
        is_tame = false;
        break;
      }
      case 'B': {
        size_of_habitat = 1;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '`';

        interaction = "Mmmm";
        my_weight = 70f + (float) (Math.random() * 30 + 1);
        how_much_i_eat = 38f * my_weight / 100f;
        what_i_eat = 'h';
        is_tame = true;
        break;
      }
      case 'A': {
        size_of_habitat = 1;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '`';

        interaction = "Grrrr";
        my_weight = 150f + (float) (Math.random() * 150 + 1);
        how_much_i_eat = 5f * my_weight / 100f;
        what_i_eat = 'h';
        is_tame = true;
        break;
      }
      case 'R': {
        size_of_habitat = 1;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '^';

        interaction = "Woooo";
        my_weight = 900f + (float)(Math.random() * 1400f + 1);
        how_much_i_eat = 7.23f * my_weight / 100f;
        what_i_eat = 'h';
        is_tame = false;
        break;
      }
      case 'D': {
        size_of_habitat = 1;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '^';

        interaction = "*Jummpp*";
        my_weight = 18f + (float) (Math.random() * 72 + 1);
        how_much_i_eat = 0.35f * my_weight / 100f;
        what_i_eat = 'h';
        is_tame = true;
        break;
      }
      case 'L': {
        size_of_habitat = 1;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '~';

        interaction = "Cuitttt";
        my_weight = 110f + (float) (Math.random() * 90 + 1);
        how_much_i_eat = 2f * my_weight / 20f;
        what_i_eat = 'c';
        is_tame = true;
        break;
      }
      case 'W': {
        size_of_habitat = 1;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '~';

        interaction = "*Wet*";
        my_weight = 14000f + (float)(Math.random() * 2000 + 1);
        how_much_i_eat = 0.667f * my_weight;
        what_i_eat = 'c';
        is_tame = true;
        break;
      }
      case 'S': {
        size_of_habitat = 1;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '~';

        interaction = "*Wett*";
        my_weight = 21500f + (float)(Math.random() * 8500 + 1);
        how_much_i_eat = 0.0667f * my_weight;
        what_i_eat = 'c';
        is_tame = false;
        break;
      }
      case 'K': {
        size_of_habitat = 1;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '`';

        interaction = "Kiiiaaa";
        my_weight = 1.2f + (float) (Math.random() * 0.2f + 1);
        how_much_i_eat = my_weight;
        what_i_eat = 'o';
        is_tame = true;
        break;
      }
      case 'E': {
        size_of_habitat = 1;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '`';

        interaction = "Kiiiaaa";
        my_weight = 4f + (float) (Math.random() * 2 + 1);
        how_much_i_eat = 0.4535f * my_weight / 4f;
        what_i_eat = 'c';
        is_tame = true;
        break;
      }
      case 'T': {
        size_of_habitat = 1;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '`';

        interaction = "Kwwaakk";
        my_weight = 0.592f + (float)(Math.random() * 0.168f + 1);
        how_much_i_eat = 0.5f * my_weight / 100f;
        what_i_eat = 'o';
        is_tame = true;
        break;
      }
      case 'P': {
        size_of_habitat = 2;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '~';
        array_of_habitat[1] = '^';

        interaction = "Sqqqaaa";
        my_weight = 27f + (float)(Math.random() * 14 + 1);
        how_much_i_eat = 0.9f * my_weight / 27f;
        what_i_eat = 'c';
        is_tame = true;
        break;
      }
      case 'C': {
        size_of_habitat = 2;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '^';
        array_of_habitat[1] = '~';

        interaction = "Rrrrr";
        my_weight = 400f + (float) (Math.random() * 300 + 1);
        how_much_i_eat = 2f * my_weight / 700f;
        what_i_eat = 'c';
        is_tame = false;
        break;
      }
      case 'N': {
        size_of_habitat = 2;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '^';
        array_of_habitat[1] = '~';

        interaction = "Grooowwll";
        my_weight = 1400f + (float) (Math.random() * 1800 + 1);
        how_much_i_eat = 40f * my_weight / 2400f;
        what_i_eat = 'h';
        is_tame = true;
        break;
      }
      case 'M': {
        size_of_habitat = 2;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '~';
        array_of_habitat[1] = '`';

        interaction = "*fly and swim*";
        my_weight = 2.5f + (float) (Math.random() * 2.5 + 1);
        how_much_i_eat = 10f * my_weight / 100f;
        what_i_eat = 'c';
        is_tame = true;
        break;
      }
      case 'F': {
        size_of_habitat = 2;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '~';
        array_of_habitat[1] = '`';

        interaction = "*stride*";
        my_weight = 1f + (float) (Math.random() * 6 + 1);
        how_much_i_eat = 5f * my_weight / 100f;
        what_i_eat = 'o';
        is_tame = true;
        break;
      }
      case 'Y': {
        size_of_habitat = 2;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '^';
        array_of_habitat[1] = '`';

        interaction = "Arrrrkkkk";
        my_weight = 25f + (float) (Math.random() * 34 + 1);
        how_much_i_eat = 5f * my_weight / 100f;
        what_i_eat = 'o';
        is_tame = true;
        break;
      }
      case 'I': {
        size_of_habitat = 2;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '^';
        array_of_habitat[1] = '`';

        interaction = "*walk and fly slightly*";
        my_weight = 1f + (float) (Math.random() * 2 + 1);
        how_much_i_eat = 5f * my_weight / 100f;
        what_i_eat = 'o';
        is_tame = true;
        break;
      }
      case 'O': {
        size_of_habitat = 2;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '^';
        array_of_habitat[1] = '`';

        interaction = "Nguuukkk";
        my_weight = 25f + (float) (Math.random() * 34 + 1);
        how_much_i_eat = 5f * my_weight / 100f;
        what_i_eat = 'o';
        is_tame = true;
        break;
      }
      case 'Z': {
        size_of_habitat = 2;
        array_of_habitat = new char[size_of_habitat];
        array_of_habitat[0] = '~';
        array_of_habitat[1] = '`';

        interaction = "Aaaakk";
        my_weight = 2.8f + (float) (Math.random() * 12.2 + 1);
        how_much_i_eat = 26.67f * my_weight / 100f;
        what_i_eat = 'c';
        is_tame = true;
        break;
      }
    }
  }

  public String GetInteract() {
    return interaction;
  }

  public int GetSizeOfHabitat() {
    return size_of_habitat;
  }

  public char GetContent() {
    return content;
  }

  public float GetWeight() {
    return my_weight;
  }

  public float GetEat() {
    return how_much_i_eat;
  }

  public int GetID() {
    return cage_id;
  }

  public int GetWEat() {
    return what_i_eat;
  }

  public int GetX() {
    return x;
  }

  public int GetY() {
    return y;
  }

  public boolean GetTame() {
    return is_tame;
  }

  public char[] GetArrayOfHabitat() {
    return array_of_habitat;
  }

  public void Move(int dir) {
    switch(dir) {
      case 1: { //top
        y -=  1;
        break;
      }
      case 2: { //right
        x +=  1;
        break;
      }
      case 3: { //down
        y +=  1;
        break;
      }
      case 4: { //left
        x -=  1;
        break;
      }
    }
  }
}
