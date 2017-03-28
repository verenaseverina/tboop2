package animal;

public abstract class Animal {
  protected boolean isTame;
  protected String interaction;
  protected int absis;
  protected int ordinat;
  protected char[] arrayOfHabitat;
  protected char content;
  protected int cageId;
  protected float myWeight;
  protected float howMuchIEat;
  protected char whaIEat;

  public Animal(int absisin, int ordinatin, int id) {
    absis = absisin;
    ordinat = ordinatin;
    cageId = id;
  }

  public abstract String getInteract();

  public abstract int getSize();

  public boolean getTame() {
    return isTame;
  }

  public int getX() {
    return absis;
  }

  public int getY() {
    return ordinat;
  }

  public char[] getArrayOfHabitat() {
    return arrayOfHabitat;
  }

  public char getContent() {
    return content;
  }

  public void giveFood() {
    System.out.println("Animal makanan sebanyak" + howMuchIEat + " kg\n");
  }

  public void move(int dir) {
    switch (dir) {
      case 1: { //top
        ordinat -= 1;
        break;
      }
      case 2: { //right
        absis += 1;
        break;
      }
      case 3:  { //down
        ordinat += 1;
        break;
      }
      case 4: { //left
        absis -= 1;
        break;
      }
      default: {
        break;
      }
    }
  }
}

