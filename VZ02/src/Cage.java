/**
 * Created by verenaseverina on 3/27/17.
 */
import java.util.Vector;
import java.lang.Math;

public class Cage {
  private Cell[] array_of_habitat;
  private Animal[] array_of_animal;
  private int cage_size;
  private int animal_neff;

  public Cage(Vector<Cell> buf) {
    cage_size = buf.capacity();
    array_of_habitat = new Cell[buf.capacity()];
    for (int i = 0; i < cage_size; i++) {
      array_of_habitat[i] = buf.elementAt(i);
    }
    animal_neff = -1;
    double temp_many_animal = 0.3 * cage_size;
    int many_animal = (int) Math.floor(temp_many_animal);
    array_of_animal = new Animal[many_animal];
  }
  public int GetCageSize() {
    return cage_size;
  }
  public Animal[] GetAnimal() {
    return array_of_animal;
  }
  public Cell[] GetHabitat() {
    return array_of_habitat;
  }
  public int GetNeff() {
    return animal_neff;
  }
  public void AddAnimal(char animal, int i) {
    int position_index = 0;
    int x, y;
    do {
      position_index = (int) Math.floor(Math.random() * cage_size);
      x = array_of_habitat[position_index].GetCellRow();
      y = array_of_habitat[position_index].GetCellCol();
    } while (ContainAnimal(x, y));
    animal_neff++;
    array_of_animal[animal_neff] = new Animal(x, y, i, animal);
  }
  public boolean ContainAnimal(int x, int y) {
    boolean found = false;
    int i = 0;
    double temp_many_animal = 0.3 * cage_size;
    int many_animal = (int) Math.floor(temp_many_animal);
    if(!IsEmpty()) {
      while ((i < many_animal) && (!found)) {
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
    return (animal_neff == -1);
  }
  public boolean IsFull() {
    double temp_many_animal = 0.3 * cage_size;
    int many_animal = (int) Math.floor(temp_many_animal);
    return (many_animal == animal_neff);
  }
}