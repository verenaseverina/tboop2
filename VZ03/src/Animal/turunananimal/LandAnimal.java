package Animal.turunananimal;

import Animal.Animal;
public abstract class LandAnimal extends Animal {
  protected int size = 1;

  public LandAnimal(int x, int y, int id) {
    super(x,y,id);
    hab = new char[size];
    hab[0] = '^';
  }

  public abstract String Interact();

  public int GetSize() {
    return size;
  }
}
