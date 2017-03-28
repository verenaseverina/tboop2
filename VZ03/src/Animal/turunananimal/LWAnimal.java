package Animal.turunananimal;

import Animal.Animal;
public abstract class LWAnimal extends Animal {
  protected int size = 2;

  public LWAnimal(int x, int y, int id) {
    super(x,y,id);
    array_of_habitat = new char[size];
    array_of_habitat[0] = '^';
    array_of_habitat[1] = '~';
  }

  public abstract String GetInteract();

  public int GetSize() {
    return size;
  }
}
