/**
 * Created by verenaseverina on 3/25/17.
 */
import java.util.Vector;
import java.lang.Math;
import cell.turunancell.Habitat;
import animal.Animal;
import animal.turunananimal.binatang.*;

public class Cage {
  private Habitat[] arrayOfHabitat;
  private Animal[] arrayOfAnimal;
  private int cageSize;
  private int animalNeff;

  public Cage(Vector<Habitat> buf) {
    cageSize = buf.size();
    arrayOfHabitat = new Habitat[buf.size()];
    for (int i = 0; i < cageSize; i++) {
      arrayOfHabitat[i] = buf.elementAt(i);
    }
    animalNeff = -1;
    double temp_many_animal = 0.3 * cageSize;
    int many_animal = (int) Math.floor(temp_many_animal);
    arrayOfAnimal = new Animal[many_animal];
  }
  public int GetCageSize() {
    return cageSize;
  }
  public Animal[] GetAnimal() {
    return arrayOfAnimal;
  }
  public Habitat[] GetHabitat() {
    return arrayOfHabitat;
  }
  public int GetNeff() {
    return animalNeff;
  }
  public void AddAnimal(char animal, int i) {
    int position_index = 0;
    int x, y;
    do {
      position_index = (int) Math.floor(Math.random() * cageSize);
      x = arrayOfHabitat[position_index].GetCellRow();
      y = arrayOfHabitat[position_index].GetCellCol();
    } while (ContainAnimal(x, y));
    animalNeff++;
    switch(animal) {
      case 'H' : {
        arrayOfAnimal[animalNeff] = new Tiger(x, y, i);
        break;
      }
      case 'B' : {
        arrayOfAnimal[animalNeff] = new Panda(x, y, i);
        break;
      }
      case 'A' : {
        arrayOfAnimal[animalNeff] = new Anoa(x, y, i);
        break;
      }
      case 'R' : {
        arrayOfAnimal[animalNeff] = new Rhino(x, y, i);
        break;
      }
      case 'D' : {
        arrayOfAnimal[animalNeff] = new Kangaroo(x, y, i);
        break;
      }
      case 'L' : {
        arrayOfAnimal[animalNeff] = new Dolphin(x, y, i);
        break;
      }
      case 'W' : {
        arrayOfAnimal[animalNeff] = new Whale(x, y, i);
        break;
      }
      case 'S' : {
        arrayOfAnimal[animalNeff] = new Shark(x, y, i);
        break;
      }
      case 'K' : {
        arrayOfAnimal[animalNeff] = new Kelelawar(x, y, i);
        break;
      }
      case 'E' : {
        arrayOfAnimal[animalNeff] = new ElangB(x, y, i);
        break;
      }
      case 'T' : {
        arrayOfAnimal[animalNeff] = new Toucan(x, y, i);
        break;
      }
      case 'P' : {
        arrayOfAnimal[animalNeff] = new Penguin(x, y, i);
        break;
      }
      case 'C' : {
        arrayOfAnimal[animalNeff] = new Crocodile(x, y, i);
        break;
      }
      case 'N' : {
        arrayOfAnimal[animalNeff] = new Hippopotamus(x, y, i);
        break;
      }
      case 'O' : {
        arrayOfAnimal[animalNeff] = new Ostrich(x, y, i);
        break;
      }
      case 'Y' : {
        arrayOfAnimal[animalNeff] = new Kasuari(x, y, i);
        break;
      }
      case 'I' : {
        arrayOfAnimal[animalNeff] = new Kiwi(x, y, i);
        break;
      }
      case 'F' : {
        arrayOfAnimal[animalNeff] = new FlyingFish(x, y, i);
        break;
      }
      case 'Z' : {
        arrayOfAnimal[animalNeff] = new Pelikan(x, y, i);
        break;
      }
      case 'M' : {
        arrayOfAnimal[animalNeff] = new Cormorants(x, y, i);
        break;
      }
    }
  }
  public boolean ContainAnimal(int x, int y) {
    boolean found = false;
    int i = 0;
    double temp_many_animal = 0.3 * cageSize;
    int many_animal = (int) Math.floor(temp_many_animal);
    if(!IsEmpty()) {
      while ((i < many_animal) && (!found) && (i < animalNeff+1)) {
        if ((x == arrayOfAnimal[i].GetX()) && (y == arrayOfAnimal[i].GetY())) {
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
    while(!found && i < cageSize) {
      if(x == arrayOfHabitat[i].GetCellRow() && y == arrayOfHabitat[i].GetCellCol()) {
        found = true;
      }
      else {
        i++;
      }
    }
    return found;
  }
  public void UpdatePosition() {
    for(int i=0; i<=animalNeff; i++) {
      boolean found = false;
      int j = 1;
      int x,y;
      while(!found) {
          if(j==1) {
            y = arrayOfAnimal[i].GetY() - 1;
            if (!ContainAnimal(arrayOfAnimal[i].GetX(), y) && InsideCage(arrayOfAnimal[i].GetX(), y)) {
              System.out.println(j);
              arrayOfAnimal[i].Move(1);
              found = true;
            }
            j = j+1;
          }else if(j==2) {
            x = arrayOfAnimal[i].GetX() + 1;
            System.out.println(j);
            if (!ContainAnimal(x, arrayOfAnimal[i].GetY()) && InsideCage(x, arrayOfAnimal[i].GetY())) {
             arrayOfAnimal[i].Move(2);
             found = true;
            }
            j = j+1;
          }
          else if(j==3) {
            y = arrayOfAnimal[i].GetY() + 1;
            if (!ContainAnimal(arrayOfAnimal[i].GetX(), y) && InsideCage(arrayOfAnimal[i].GetX(), y)) {
             arrayOfAnimal[i].Move(3);
             found = true;
            }
            j = j+1;
          }
          else if(j==4) {
            x = arrayOfAnimal[i].GetX() - 1;
            if (!ContainAnimal(x, arrayOfAnimal[i].GetY()) && InsideCage(x, arrayOfAnimal[i].GetY())) {
             arrayOfAnimal[i].Move(4);
             found = true;
            }
            j = j+1;
          }
          else {
            found = true;
            System.out.println(j);
          }
        }
      }
  }
  public boolean IsEmpty() {
    return (animalNeff == -1);
  }
  public boolean IsFull() {
    double temp_many_animal = 0.3 * cageSize;
    int many_animal = (int) Math.floor(temp_many_animal);
    return (many_animal == animalNeff+1);
  }
}