package animal.turunananimal;

import animal.Animal;

public abstract class AirAnimal extends Animal {
  protected int size = 1;

  public AirAnimal(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    arrayOfHabitat = new char[size];
    arrayOfHabitat[0] = '`';
  }

  public abstract String getInteract();

  public int getSize() {
    return size;
  }
}
