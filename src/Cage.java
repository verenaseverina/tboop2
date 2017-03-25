/**
 * Created by verenaseverina on 3/25/17.
 */
import java.util.Vector;
import java.lang.Math;

public class Cage {
  private Cell[] array_of_habitat;
  private Animal[] array_of_animal;
  private int size;
  private int neff;

  public Cage(Vector<Cell> buf) {
    size = buf.capacity();
    array_of_habitat[] = new Cell[buf.capacity()];
    for (int i = 0; i < size; i++) {
      array_of_habitat[i] = buf[i];
    }
    neff = -1;
    double temp_many_animal = 0.3 * size;
    int many_animal = (int) Math.floor(temp_many_animal);
    array_of_animal[] = new Animal[many_animal];
  }
  public int GetSize() {
    return size;
  }
  public Animal[] GetAnimal() {
    return array_of_animal;
  }
  public Cell[] GetHabitat() {
    return array_of_habitat;
  }
  public int GetNeff() {
    return neff;
  }
  public void AddAnimal(char animal, int i) {
    int pos_id = 0;
    do {
      pos_id = (int) Math.floor(Math.random() * size);
      int x = array_of_habitat[pos_id].GetCellRow();
      int y = array_of_habitat[pos_id].GetCellCol();
    } while (ContainAnimal(x, y));
    neff++;
    array_of_animal[neff] = new Animal(x, y, i, animal);
  }
  public boolean ContainAnimal(int x, int y) {
    boolean found = false;
    int i = 0;
    if(!IsEmpty()) {
      while ((i < size) && (!found)) {
        if ((x == array_of_animal[i].GetX()) && (y == array_of_animal[i].GetY())) {
          found = true;
        }
      else {
          i++;
        }
      }
    }
    return found;
  }
  public boolean IsEmpty() {
    return (neff == -1);
  }
  public boolean IsFull() {
    return (size == neff);
  }
}
