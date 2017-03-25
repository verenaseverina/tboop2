public abstract class LWAnimal extends Animal {
  protected int size = 2;

  public LWAnimal(int x, int y, int id) {
    super(x,y,id);
    hab = new char[size];
    hab[0] = '^';
    hab[1] = '~';
  }

  public abstract String Interact();

  public int GetSize() {
    return size;
  }
}
