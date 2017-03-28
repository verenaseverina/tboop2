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
    for (int iIdx = 0; iIdx < cageSize; iIdx++) {
      arrayOfHabitat[iIdx] = buf.elementAt(iIdx);
    }
    animalNeff = -1;
    double tempManyAnimal = 0.3 * cageSize;
    int manyAnimal = (int) Math.floor(tempManyAnimal);
    arrayOfAnimal = new Animal[manyAnimal];
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
  public void AddAnimal(char animal, int iIdx) {
    int positionIndex = 0;
    int xRow, yCol;
    do {
      positionIndex = (int) Math.floor(Math.random() * cageSize);
      xRow = arrayOfHabitat[positionIndex].GetCellRow();
      yCol = arrayOfHabitat[positionIndex].GetCellCol();
    } while (ContainAnimal(x, y));
    animalNeff++;
    switch(animal) {
      case 'H' : {
        arrayOfAnimal[animalNeff] = new Tiger(xRow, yCol, iIdx);
        break;
      }
      case 'B' : {
        arrayOfAnimal[animalNeff] = new Panda(xRow, yCol, iIdx);
        break;
      }
      case 'A' : {
        arrayOfAnimal[animalNeff] = new Anoa(xRow, yCol, iIdx);
        break;
      }
      case 'R' : {
        arrayOfAnimal[animalNeff] = new Rhino(xRow, yCol, iIdx);
        break;
      }
      case 'D' : {
        arrayOfAnimal[animalNeff] = new Kangaroo(xRow, yCol, iIdx);
        break;
      }
      case 'L' : {
        arrayOfAnimal[animalNeff] = new Dolphin(xRow, yCol, iIdx);
        break;
      }
      case 'W' : {
        arrayOfAnimal[animalNeff] = new Whale(xRow, yCol, iIdx);
        break;
      }
      case 'S' : {
        arrayOfAnimal[animalNeff] = new Shark(xRow, yCol, iIdx);
        break;
      }
      case 'K' : {
        arrayOfAnimal[animalNeff] = new Kelelawar(xRow, yCol, iIdx);
        break;
      }
      case 'E' : {
        arrayOfAnimal[animalNeff] = new ElangB(xRow, yCol, iIdx);
        break;
      }
      case 'T' : {
        arrayOfAnimal[animalNeff] = new Toucan(xRow, yCol, iIdx);
        break;
      }
      case 'P' : {
        arrayOfAnimal[animalNeff] = new Penguin(xRow, yCol, iIdx);
        break;
      }
      case 'C' : {
        arrayOfAnimal[animalNeff] = new Crocodile(xRow, yCol, iIdx);
        break;
      }
      case 'N' : {
        arrayOfAnimal[animalNeff] = new Hippopotamus(xRow, yCol, iIdx);
        break;
      }
      case 'O' : {
        arrayOfAnimal[animalNeff] = new Ostrich(xRow, yCol, iIdx);
        break;
      }
      case 'Y' : {
        arrayOfAnimal[animalNeff] = new Kasuari(xRow, yCol, iIdx);
        break;
      }
      case 'I' : {
        arrayOfAnimal[animalNeff] = new Kiwi(xRow, yCol, iIdx);
        break;
      }
      case 'F' : {
        arrayOfAnimal[animalNeff] = new FlyingFish(xRow, yCol, iIdx);
        break;
      }
      case 'Z' : {
        arrayOfAnimal[animalNeff] = new Pelikan(xRow, yCol, iIdx);
        break;
      }
      case 'M' : {
        arrayOfAnimal[animalNeff] = new Cormorants(xRow, yCol, iIdx);
        break;
      }
    }
  }
  public boolean ContainAnimal(int xRow, int yCol) {
    boolean found = false;
    int iIdx = 0;
    double tempManyAnimal = 0.3 * cageSize;
    int manyAnimal = (int) Math.floor(tempManyAnimal);
    if(!IsEmpty()) {
      while ((iIdx < manyAnimal) && (!found) && (iIdx < animalNeff+1)) {
        if ((xRow == arrayOfAnimal[iIdx].GetX()) && (yCol == arrayOfAnimal[iIdx].GetY())) {
          found = true;
        }
      else {
          iIdx++;
        }
      }
    }
    return found;
  }
  
  public boolean InsideCage(int xRow, int yCol) {
    int iIdx = 0;
    boolean found = false;
    while(!found && iIdx < cageSize) {
      if(xRow == arrayOfHabitat[iIdx].GetCellRow() && yCol == arrayOfHabitat[iIdx].GetCellCol()) {
        found = true;
      }
      else {
        iIdx++;
      }
    }
    return found;
  }
  public void UpdatePosition() {
    for(int iIdx=0; iIdx<=animalNeff; iIdx++) {
      boolean found = false;
      int jIdx = 1;
      int xRow,yCol;
      while(!found) {
          if(jIdx == 1) {
            yCol = arrayOfAnimal[iIdx].GetY() - 1;
            if (!ContainAnimal(arrayOfAnimal[iIdx].GetX(), yCol) && InsideCage(arrayOfAnimal[iIdx].GetX(), yCol)) {
              System.out.println(jIdx);
              arrayOfAnimal[iIdx].Move(1);
              found = true;
            }
            jIdx = jIdx + 1;
          }else if(jIdx == 2) {
            xRow = arrayOfAnimal[iIdx].GetX() + 1;
            System.out.println(jIdx);
            if (!ContainAnimal(xRow, arrayOfAnimal[iIdx].GetY()) && InsideCage(xRow, arrayOfAnimal[i].GetY())) {
             arrayOfAnimal[iIdx].Move(2);
             found = true;
            }
            jIdx = jIdx+1;
          }
          else if(jIdx == 3) {
            yCol = arrayOfAnimal[iIdx].GetY() + 1;
            if (!ContainAnimal(arrayOfAnimal[iIdx].GetX(), yCol) && InsideCage(arrayOfAnimal[iIdx].GetX(), yCol)) {
             arrayOfAnimal[iIdx].Move(3);
             found = true;
            }
            jIdx = jIdx+1;
          }
          else if(jIdx == 4) {
            xRow = arrayOfAnimal[iIdx].GetX() - 1;
            if (!ContainAnimal(xRow, arrayOfAnimal[iIdx].GetY()) && InsideCage(xRow, arrayOfAnimal[iIdx].GetY())) {
             arrayOfAnimal[iIdx].Move(4);
             found = true;
            }
            jIdx = jIdx+1;
          }
          else {
            found = true;
            System.out.println(jIdx);
          }
        }
      }
  }
  public boolean IsEmpty() {
    return (animalNeff == -1);
  }
  public boolean IsFull() {
    double tempManyAnimal = 0.3 * cageSize;
    int manyAnimal = (int) Math.floor(tempManyAnimal);
    return (manyAnimal == animalNeff+1);
  }
}