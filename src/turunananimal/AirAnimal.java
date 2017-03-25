public abstract class AirAnimal extends Animal {
  protected int size = 1;

  public AirAnimal(int x, int y, int id) {
    super(x,y,id);
    hab = new char[size];
    hab[0] = '`';
  }

  public abstract String Interact();

  public int GetSize() {
    return size;
  }
}
