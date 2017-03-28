/**
 * Created by verenaseverina on 3/25/17.
 */
import java.util.Vector;
import java.lang.Math;
import Cell.turunancell.Habitat;
import Animal.Animal;
import Animal.turunananimal.binatang.*;

public class Cage {
  private Habitat[] array_of_habitat;
  private Animal[] array_of_animal;
  private int cage_size;
  private int animal_neff;

  public Cage(Vector<Habitat> buf) {
    cage_size = buf.size();
    array_of_habitat = new Habitat[buf.size()];
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
  public Habitat[] GetHabitat() {
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
      x = array_of_habitat[position_index].GetCellCol();
      y = array_of_habitat[position_index].GetCellRow();
    } while (ContainAnimal(x, y));
    animal_neff++;
    switch(animal) {
      case 'H' : {
        array_of_animal[animal_neff] = new Tiger(x, y, i);
        break;
      }
      case 'B' : {
        array_of_animal[animal_neff] = new Panda(x, y, i);
        break;
      }
      case 'A' : {
        array_of_animal[animal_neff] = new Anoa(x, y, i);
        break;
      }
      case 'R' : {
        array_of_animal[animal_neff] = new Rhino(x, y, i);
        break;
      }
      case 'D' : {
        array_of_animal[animal_neff] = new Kangaroo(x, y, i);
        break;
      }
      case 'L' : {
        array_of_animal[animal_neff] = new Dolphin(x, y, i);
        break;
      }
      case 'W' : {
        array_of_animal[animal_neff] = new Whale(x, y, i);
        break;
      }
      case 'S' : {
        array_of_animal[animal_neff] = new Shark(x, y, i);
        break;
      }
      case 'K' : {
        array_of_animal[animal_neff] = new Kelelawar(x, y, i);
        break;
      }
      case 'E' : {
        array_of_animal[animal_neff] = new ElangB(x, y, i);
        break;
      }
      case 'T' : {
        array_of_animal[animal_neff] = new Toucan(x, y, i);
        break;
      }
      case 'P' : {
        array_of_animal[animal_neff] = new Penguin(x, y, i);
        break;
      }
      case 'C' : {
        array_of_animal[animal_neff] = new Crocodile(x, y, i);
        break;
      }
      case 'N' : {
        array_of_animal[animal_neff] = new Hippopotamus(x, y, i);
        break;
      }
      case 'O' : {
        array_of_animal[animal_neff] = new Ostrich(x, y, i);
        break;
      }
      case 'Y' : {
        array_of_animal[animal_neff] = new Kasuari(x, y, i);
        break;
      }
      case 'I' : {
        array_of_animal[animal_neff] = new Kiwi(x, y, i);
        break;
      }
      case 'F' : {
        array_of_animal[animal_neff] = new FlyingFish(x, y, i);
        break;
      }
      case 'Z' : {
        array_of_animal[animal_neff] = new Pelikan(x, y, i);
        break;
      }
      case 'M' : {
        array_of_animal[animal_neff] = new Cormorants(x, y, i);
        break;
      }
    }
  }
  public boolean ContainAnimal(int x, int y) {
    boolean found = false;
    int i = 0;
    double temp_many_animal = 0.3 * cage_size;
    int many_animal = (int) Math.floor(temp_many_animal);
    if(!IsEmpty()) {
      while ((i < many_animal) && (!found) && (i < animal_neff+1)) {
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
  
  public boolean InsideCage(int x, int y) {
    int i = 0;
    boolean found = false;
    while(!found && i < cage_size) {
      if(x == array_of_habitat[i].GetCellRow() && y == array_of_habitat[i].GetCellCol()) {
        found = true;
      }
      else {
        i++;
      }
    }
    return found;
  }
  public void UpdatePosition() {
    for(int i=0; i<=animal_neff; i++) {
      boolean found = false;
      int j = 1;
      while(!found) {
        switch(j) {
          case 1:
          for (int k = 0; k <= animal_neff; k++) {
            int y = array_of_animal[i].GetY()-1;
            if (array_of_animal[i].GetX() != array_of_animal[k].GetX() && y != array_of_animal[k].GetY() && InsideCage(array_of_animal[i].GetX(),y)) {
              array_of_animal[i].Move(1);
              found = true;
            }
          }
          j++;
          break;
        case 2:
          for (int k = 0; k <= animal_neff; k++) {
            int x = array_of_animal[i].GetX()+1;
            if (x != array_of_animal[k].GetX() && array_of_animal[i].GetY() != array_of_animal[k].GetY() && InsideCage(x,array_of_animal[i].GetY())) {
              array_of_animal[i].Move(2);
              found = true;
            }
          }
          j++;
          break;
        case 3:
          for (int k = 0; k <= animal_neff; k++) {
            int y = array_of_animal[i].GetY()+1;
            if (array_of_animal[i].GetX() != array_of_animal[k].GetX() && y != array_of_animal[k].GetY() && InsideCage(array_of_animal[i].GetX(),y)) {
              array_of_animal[i].Move(3);
              found = true;
            }
          }
          j++;
          break;
        case 4:
          for (int k = 0; k <= animal_neff; k++) {
            int x = array_of_animal[i].GetX()-1;
            if (x != array_of_animal[k].GetX() && array_of_animal[i].GetY() != array_of_animal[k].GetY() && InsideCage(x,array_of_animal[i].GetY())) {
              array_of_animal[i].Move(4);
              found = true;
            }
          }
          j++;
          break;
        default: 
          found = true;
          break;
        }
      }
    }
  }
  public boolean IsEmpty() {
    return (animal_neff == -1);
  }
  public boolean IsFull() {
    double temp_many_animal = 0.3 * cage_size;
    int many_animal = (int) Math.floor(temp_many_animal);
    return (many_animal == animal_neff+1);
  }
}