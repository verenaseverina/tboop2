package Animal.turunananimal;

import Animal.Animal;
public abstract class WAAnimal extends Animal {
  protected int size = 2;

  public WAAnimal(int x, int y, int id) {
    super(x,y,id);
    hab = new char[size];
    hab[0] = '~';
    hab[1] = '`';
  }

  public abstract String Interact();

  public int GetSize() {
    return size;
  }
}
