/**
 * Created by verenaseverina on 3/25/17.
 */
import java.util.Vector;
import java.lang.Math;
import Cell.Cell;
import Animal.Animal;
import Animal.turunananimal.binatang.Anoa;
import Animal.turunananimal.binatang.Cormorants;
import Animal.turunananimal.binatang.Crocodile;
import Animal.turunananimal.binatang.Dolphin;
import Animal.turunananimal.binatang.ElangB;
import Animal.turunananimal.binatang.FlyingFish;
import Animal.turunananimal.binatang.Hippopotamus;
import Animal.turunananimal.binatang.Kangaroo;
import Animal.turunananimal.binatang.Kasuari;
import Animal.turunananimal.binatang.Kelelawar;
import Animal.turunananimal.binatang.Kiwi;
import Animal.turunananimal.binatang.Ostrich;
import Animal.turunananimal.binatang.Panda;
import Animal.turunananimal.binatang.Pelikan;
import Animal.turunananimal.binatang.Penguin;
import Animal.turunananimal.binatang.Rhino;
import Animal.turunananimal.binatang.Shark;
import Animal.turunananimal.binatang.Tiger;
import Animal.turunananimal.binatang.Toucan;
import Animal.turunananimal.binatang.Whale;

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