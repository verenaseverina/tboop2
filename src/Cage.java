/**
 * Created by verenaseverina on 3/25/17.
 */
import java.util.Vector;
import java.lang.Math;
import Cell.Cell;

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
    int x, y;
    do {
      pos_id = (int) Math.floor(Math.random() * size);
      x = array_of_habitat[pos_id].GetCellRow();
      y = array_of_habitat[pos_id].GetCellCol();
    } while (ContainAnimal(x, y));
    neff++;
    switch(animal) {
      case 'H' : {
        array_of_animal[neff] = new Tiger(x, y, i);
        break;
      }
      case 'B' : {
        array_of_animal[neff] = new Panda(x, y, i);
        break;
      }
      case 'A' : {
        array_of_animal[neff] = new Anoa(x, y, i);
        break;
      }
      case 'R' : {
        array_of_animal[neff] = new Rhino(x, y, i);
        break;
      }
      case 'D' : {
        array_of_animal[neff] = new Kangaroo(x, y, i);
        break;
      }
      case 'L' : {
        array_of_animal[neff] = new Dolphin(x, y, i);
        break;
      }
      case 'W' : {
        array_of_animal[neff] = new Whale(x, y, i);
        break;
      }
      case 'S' : {
        array_of_animal[neff] = new Shark(x, y, i);
        break;
      }
      case 'K' : {
        array_of_animal[neff] = new Kelelawar(x, y, i);
        break;
      }
      case 'E' : {
        array_of_animal[neff] = new ElangB(x, y, i);
        break;
      }
      case 'T' : {
        array_of_animal[neff] = new Toucan(x, y, i);
        break;
      }
      case 'P' : {
        array_of_animal[neff] = new Penguin(x, y, i);
        break;
      }
      case 'C' : {
        array_of_animal[neff] = new Crocodile(x, y, i);
        break;
      }
      case 'N' : {
        array_of_animal[neff] = new Hippopotamus(x, y, i);
        break;
      }
      case 'O' : {
        array_of_animal[neff] = new Ostrich(x, y, i);
        break;
      }
      case 'Y' : {
        array_of_animal[neff] = new Kasuari(x, y, i);
        break;
      }
      case 'I' : {
        array_of_animal[neff] = new Kiwi(x, y, i);
        break;
      }
      case 'F' : {
        array_of_animal[neff] = new FlyingFish(x, y, i);
        break;
      }
      case 'Z' : {
        array_of_animal[neff] = new Pelikan(x, y, i);
        break;
      }
      case 'M' : {
        array_of_animal[neff] = new Cormorants(x, y, i);
        break;
      }
    }
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
