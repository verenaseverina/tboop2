package animal.turunananimal;

import animal.Animal;
public abstract class LWAnimal extends Animal {
  protected int size = 2;

  public LWAnimal(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    array_of_habitat = new char[size];
    array_of_habitat[0] = '^';
    array_of_habitat[1] = '~';
  }

  public abstract String getInteract();

  public int getSize() {
    return size;
  }
}
