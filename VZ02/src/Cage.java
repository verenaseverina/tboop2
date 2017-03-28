import java.util.Vector;
import java.lang.Math;

public class Cage {
  private Cell[] arrayOfHabitat;
  private Animal[] arrayOfAnimal;
  private int cageSize;
  private int animalNeff;

  public Cage(Vector<Cell> buf) {
    cageSize = buf.size();
    arrayOfHabitat = new Cell[buf.size()];
    for (int iIdx = 0; iIdx < cageSize; iIdx++) {
      arrayOfHabitat[iIdx] = buf.elementAt(iIdx);
    }
    animalNeff = -1;
    double tempManyAnimal = 0.3 * cageSize;
    int manyAnimal = (int) Math.floor(tempManyAnimal);
    arrayOfAnimal = new Animal[manyAnimal];
  }
  public int getCageSize() {
    return cageSize;
  }
  public Animal[] getAnimal() {
    return arrayOfAnimal;
  }
  public Cell[] getHabitat() {
    return arrayOfHabitat;
  }
  public int getNeff() {
    return animalNeff;
  }
  public void AddAnimal(char animal, int iIdx) {
    int positionIndex = 0;
    int xRow, yCol;
    do {
      positionIndex = (int) Math.floor(Math.random() * cageSize);
      xRow = arrayOfHabitat[positionIndex].GetCellRow();
      yCol = arrayOfHabitat[positionIndex].GetCellCol();
    } while (containAnimal(xRow, yCol));
    animalNeff++;
    switch(animal) {
      case 'H' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'H');
        break;
      }
      case 'B' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'B');
        break;
      }
      case 'A' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'A');
        break;
      }
      case 'R' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'R');
        break;
      }
      case 'D' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'D');
        break;
      }
      case 'L' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'L');
        break;
      }
      case 'W' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'W');
        break;
      }
      case 'S' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'S');
        break;
      }
      case 'K' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'K');
        break;
      }
      case 'E' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'E');
        break;
      }
      case 'T' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'T');
        break;
      }
      case 'P' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'P');
        break;
      }
      case 'C' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'C');
        break;
      }
      case 'N' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'N');
        break;
      }
      case 'O' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'O');
        break;
      }
      case 'Y' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'Y');
        break;
      }
      case 'I' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'I');
        break;
      }
      case 'F' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'F');
        break;
      }
      case 'Z' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'Z');
        break;
      }
      case 'M' : {
        arrayOfAnimal[animalNeff] = new Animal(xRow, yCol, iIdx,'M');
        break;
      }
    }
  }
  public boolean containAnimal(int xRow, int yCol) {
    boolean found = false;
    int iIdx = 0;
    double tempManyAnimal = 0.3 * cageSize;
    int manyAnimal = (int) Math.floor(tempManyAnimal);
    if(!isEmpty()) {
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

  public boolean insideCage(int xRow, int yCol) {
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
  public void updatePosition() {
    for(int iIdx=0; iIdx<=animalNeff; iIdx++) {
      boolean found = false;
      int jIdx = 1;
      int xRow,yCol;
      while(!found) {
        if(jIdx == 1) {
          yCol = arrayOfAnimal[iIdx].GetY() - 1;
          if (!containAnimal(arrayOfAnimal[iIdx].GetX(), yCol) && insideCage(arrayOfAnimal[iIdx].GetX(), yCol)) {
            System.out.println(jIdx);
            arrayOfAnimal[iIdx].Move(1);
            found = true;
          }
          jIdx = jIdx + 1;
        }else if(jIdx == 2) {
          xRow = arrayOfAnimal[iIdx].GetX() + 1;
          System.out.println(jIdx);
          if (!containAnimal(xRow, arrayOfAnimal[iIdx].GetY()) && insideCage(xRow, arrayOfAnimal[iIdx].GetY())) {
            arrayOfAnimal[iIdx].Move(2);
            found = true;
          }
          jIdx = jIdx+1;
        }
        else if(jIdx == 3) {
          yCol = arrayOfAnimal[iIdx].GetY() + 1;
          if (!containAnimal(arrayOfAnimal[iIdx].GetX(), yCol) && insideCage(arrayOfAnimal[iIdx].GetX(), yCol)) {
            arrayOfAnimal[iIdx].Move(3);
            found = true;
          }
          jIdx = jIdx+1;
        }
        else if(jIdx == 4) {
          xRow = arrayOfAnimal[iIdx].GetX() - 1;
          if (!containAnimal(xRow, arrayOfAnimal[iIdx].GetY()) && insideCage(xRow, arrayOfAnimal[iIdx].GetY())) {
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
  public boolean isEmpty() {
    return (animalNeff == -1);
  }
  public boolean isFull() {
    double tempManyAnimal = 0.3 * cageSize;
    int manyAnimal = (int) Math.floor(tempManyAnimal);
    return (manyAnimal == animalNeff+1);
  }
}