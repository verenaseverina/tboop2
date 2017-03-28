package animal.turunananimal;

import animal.Animal;
public abstract class AirAnimal extends Animal {
  protected int size = 1;

  public AirAnimal(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    array_of_habitat = new char[size];
    array_of_habitat[0] = '`';
  }

  public abstract String getInteract();

  public int getSize() {
    return size;
  }
}
