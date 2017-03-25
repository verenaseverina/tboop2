public abstract class WaterAnimal extends Animal {
  protected int size = 1;

  public WaterAnimal(int x, int y, int id) {
    super(x,y,id);
    hab = new char[size];
    hab[0] = '~';
  }

  public abstract String Interact();

  public int GetSize() {
    return size;
  }
}
