package animal.turunananimal;

import animal.Animal;

public abstract class WAAnimal extends Animal {
  protected int size = 2;

  public WAAnimal(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    arrayOfHabitat = new char[size];
    arrayOfHabitat[0] = '~';
    arrayOfHabitat[1] = '`';
  }

  public abstract String getInteract();

  public int getSize() {
    return size;
  }
}
