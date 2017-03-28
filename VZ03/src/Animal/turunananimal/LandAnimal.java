package Animal.turunananimal;

import Animal.Animal;
public abstract class LandAnimal extends Animal {
  protected int size = 1;

  public LandAnimal(int x, int y, int id) {
    super(x,y,id);
    array_of_habitat = new char[size];
    array_of_habitat[0] = '^';
  }

  public abstract String GetInteract();

  public int GetSize() {
    return size;
  }
}
