import java.util.Vector;
import java.lang.Math;

/**
 * Kelas yang merepresentasikan sebuah kandang pada Zoo.
 * Kelas Cage memiliki kumpulan habitat yang ada pada cage tersebut beserta
 * jumlahnya, selain itu kelas juga menyimpan kumpulan hewan yang ada di
 * dalam kandang beserta jumlah dari hewan yang ada di dalam Cage.
 *
 * @author Adrian Hartarto
 * @author Verena Severina
 */

public class Cage {
  /**
   * Atribut array of Cell dari Cage.
   */
  private Cell[] arrayOfHabitat;
  /**
   * Atribut array of Animal dari Cage.
   */
  private Animal[] arrayOfAnimal;

  private int cageSize;
  /** .
   * Atribut banyaknya Animal didalam Cage.
   */
  private int animalNeff;

  /**
   * Menciptakan cage dari kumpulan Habitat dalam bentuk Vector.
   *
   * @param buf Vector habitat yang ada didalam cage
   */
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

  /**
   * Getter cageSize.
   * @return Integer banyaknya Habitat dalam Cage
   */
  public int getCageSize() {
    return cageSize;
  }

  /**
   * Getter arrayOfAnimal.
   * @return Array of Animal seluruh hewan dalam Cage
   */
  public Animal[] getAnimal() {
    return arrayOfAnimal;
  }

  /**
   * Getter arrayOfHabitat.
   * @return Array of Habitat seluruh habitat dalam Cage
   */
  public Cell[] getHabitat() {
    return arrayOfHabitat;
  }

  /**
   * Getter animalNeff.
   * @return Integer jumlah hewan dalam Cage
   */
  public int getNeff() {
    return animalNeff;
  }

  /**
   * Memasukkan suatu hewan dalam kadang tertentu.
   *
   * @param animal Hewan yang akan dimasukkan dalam Cage, direpresentasiakan
   *               dengan kode satu karakter.
   * @param iidx ID Cage tempat hewan akan ditempatkan
   */
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

  /**
   * Menentukan apakah suatu posisi xrow, ycol dalam peta sedang diisi oleh Animal.
   * @param xRow baris yang ditinjau
   * @param yCol kolom yang ditinjau
   * @return boolean kebenaran suaut peta xRow, yCol sedang diisi Animal
   */
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

  /**
   * Memeriksa apakah suatu lokasi pada peta termasuk dalam Cage.
   *
   * @param xRow baris Cell yang ditinjau
   * @param yCol kolom Cell yang ditinjau
   * @return Boolean kebenaran suatu Cell dengan indeks xRow, yCol berada didalam kandang
   */
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

  /**
   * Memberikan posisi baru dari suatu Animal. Membuat posisi Animal
   * terus berubah pada iterasi Tour Zoo. Algoritma pergerakan Animal
   * diimplementasi secara brute-force dengan urutan:
   * <ol>
   *     <li>Memanggil method Animal move(1).</li>
   *     <li>Memanggil method Animal move(2).</li>
   *     <li>Memanggil method Animal move(3).</li>
   *     <li>Memanggil method Animal move(4).</li>
   * </ol>
   */
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

  /**
   * Peninjauan apakah suatu Cage tidak memiliki Animal.
   * @return boolean apakah suatu Cage tidak memiliki binatang
   */
  public boolean isEmpty() {
    return (animalNeff == -1);
  }

  /**
   * Peninjauan apakah suatu Cage sudah penuh dan tidak bisa diisi Animal lagi.
   * @return boolean kebenaran apakah suatu Cage telah penuh
   */
  public boolean isFull() {
    double tempManyAnimal = 0.3 * cageSize;
    int manyAnimal = (int) Math.floor(tempManyAnimal);
    return (manyAnimal == animalNeff+1);
  }
}